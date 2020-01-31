package model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class RegisterationManager{
   private Set<Registeration> registeration;
   
   @OneToMany(mappedBy="registerationManager" , cascade={CascadeType.ALL})
   public Set<Registeration> getRegisteration() {
      return this.registeration;
   }
   
   public void setRegisteration(Set<Registeration> registerations) {
      this.registeration = registerations;
   }
   
   private Set<Event> event;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Set<Person> person;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getPerson() {
      return this.person;
   }
   
   public void setPerson(Set<Person> persons) {
      this.person = persons;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
}
