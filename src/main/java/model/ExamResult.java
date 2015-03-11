package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by dan on 11.3.15.
 */
@Entity
public class ExamResult {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "course")
    private Course course;
    @Column(name = "student")
    private Student student;
    @Column(name = "date")
    private Date date;
}
