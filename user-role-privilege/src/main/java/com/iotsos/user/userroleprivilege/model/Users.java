package com.iotsos.user.userroleprivilege.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by JoeDims on 7/14/2019.
 */

@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private int id;

    @Column(name = "userName")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private int active;

    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "User_userId"), inverseJoinColumns = @JoinColumn(name = "Role_roleId"))
    private Set<Role> roles;

    public Users() {
    }

    public Users(Users users) {
        this.active = users.getActive();
        this.email = users.getEmail();
        this.id = users.getId();
        this.password = users.getPassword();
        this.roles = users.getRoles();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
