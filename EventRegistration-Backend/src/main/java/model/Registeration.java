package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Registeration{
   private RegisterationManager registerationManager;
   
   @ManyToOne(optional=false)
   public RegisterationManager getRegisterationManager() {
      return this.registerationManager;
   }
   
   public void setRegisterationManager(RegisterationManager registerationManager) {
      this.registerationManager = registerationManager;
   }
   
   private Event event;
   
   @ManyToOne(optional=false)
   public Event getEvent() {
      return this.event;
   }
   
   public void setEvent(Event event) {
      this.event = event;
   }
   
   private Person person;
   
   @ManyToOne(optional=false)
   public Person getPerson() {
      return this.person;
   }
   
   public void setPerson(Person person) {
      this.person = person;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
public Integer getId() {
    return this.id;
}
}
