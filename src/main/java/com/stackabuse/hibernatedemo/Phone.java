package com.stackabuse.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;




/**
 * This class will represent our phone and its attributes:
 * - ID
 * - Name
 * - Operating system
 * 
 * @author Robley Gori - ro6ley.github.io
 */
@Entity
@Table(name = "phones")   // the table in the database that will contain our phones data
@EntityListeners(AuditingEntityListener.class)
public class Phone {
  
  /**
   * The attributes of the phone
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;    // Each phone will be given an auto-generated unique identifier when stored

  @Column(name = "phone_name", nullable = false)
  private String phoneName;    // We will also save the name of the phone

  @Column(name = "os", nullable = false)
  private String os;    // We will also save the operating system running the phone

  /**
   * Our getters and setters for the attributes above
   */
  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getPhoneName() {
    return phoneName;
  }

  public void setPhoneName(String value) {
    this.phoneName = value;
  }
  
  public String getOs() {
    return os;
  }

  public void setOs(String value) {
    this.os = value;
  }

}
