package model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dan on 11.3.15.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @ManyToMany
    private Set<Course> attendedCourses;


}
