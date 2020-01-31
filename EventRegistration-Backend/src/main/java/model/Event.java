package model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Event{
   private Set<Registration> registeration;
   
   @OneToMany(mappedBy="event" )
   public Set<Registration> getRegisteration() {
      return this.registeration;
   }
   
   public void setRegisteration(Set<Registration> registerations) {
      this.registeration = registerations;
   }
   
   private String name;

public void setName(String value) {
    this.name = value;
}
@Id
public String getName() {
    return this.name;
}
private Date date;

public void setDate(Date value) {
    this.date = value;
}
public Date getDate() {
    return this.date;
}
private Time startTime;

public void setStartTime(Time value) {
    this.startTime = value;
}
public Time getStartTime() {
    return this.startTime;
}
private Time endTime;

public void setEndTime(Time value) {
    this.endTime = value;
}
public Time getEndTime() {
    return this.endTime;
}
}
