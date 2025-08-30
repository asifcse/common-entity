package com.asifkhan.hibernatetutorialspoint.productEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name="product_description")
public class ProductDescription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="description")
    private String description;
    
    @Column(name="created_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;

    @Column(name="updated_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updatedDate;
 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
