package com.asifkhan.hibernatetutorialspoint.userEntity;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User implements Serializable {
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="user_password")
    private String userPassword;
    
    @Column(name="status")
    private boolean status;
    
    @Column(name="created_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;
    
    @Column(name="updated_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updatedDate;

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private Set<Role> role = new HashSet();
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_profile_id", unique=true)
    private UserProfile userProfile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
    
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
    
}
