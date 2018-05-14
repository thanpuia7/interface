# interface
Java does not support Multiple Inheritence but we can implement it using Interface
In this program the Interface Vehicle contains abstract methods void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    
    These are defined inside another class Pulsar and Activa
    
Interface looks like a class but it is not a class. An interface can have methods and variables just like the class but the methods declared in interface are by default abstract (only method signature, no body). Also, the variables declared in an interface are public, static & final by default.
