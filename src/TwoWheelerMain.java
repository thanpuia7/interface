import java.io.*;

class TwoWheelerMain{
     
    public static void main (String[] args) {
     
        // creating an inatance of Bicycle 
        // doing some operations 
        Pulsar pulsar = new Pulsar();
        pulsar.changeGear(2);
        pulsar.speedUp(3);
        pulsar.applyBrakes(1);
         
        System.out.println("Pulsar Bike present state :");
        pulsar.printStates();
         
        // creating instance of bike.
        Activa activa = new Activa();
        activa.changeGear(1);
        activa.speedUp(4);
        activa.applyBrakes(3);
         
        System.out.println("Activa Scooter present state :");
        activa.printStates();
    }
}
