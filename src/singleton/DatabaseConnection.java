package singleton;

import java.sql.Timestamp;

//What is the point?
//The point is to ensure that only one instance of the object will EVER exist.

public class DatabaseConnection {

  // private static variable!
  // its job: is to ensure to get an instance of the singleton
  private static DatabaseConnection onlyNeedOne; // NULL at the beginning

  private static Timestamp connectionId;

  // private constructor! and it does NOTHING!
  // its job : is to ensure that no other class can instantiate a new instance
  private DatabaseConnection() {
  }

  // static method (which means it is a class method), and it is public!
  // its job: returns the singleton object
  //  if singleton doesn't exist: it creates one and returns it
  //      if singleton DOES exist: it returns it
  public static DatabaseConnection getInstance() {
    if (onlyNeedOne == null) {
      onlyNeedOne =
          new DatabaseConnection();  // important to note!!!
      //    this is the only place where we create
      //    an instance of the object
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      connectionId = timestamp;
    }

    return onlyNeedOne;
  }

  public void getConnectionId() {
    System.out.println("The connection id is: " + connectionId);
  }

}
