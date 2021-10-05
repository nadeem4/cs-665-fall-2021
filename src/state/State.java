package state;

// The state pattern allows an object to alter its behavior when its internal state changes. 
// The object will appear to change its class.

public interface State {
  void startWorkingOn();

  void stopWorkingOn();

  void finishWorkingOn();
}
