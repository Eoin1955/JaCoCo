import ie.atu.week8.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Passengertest {
    Passenger mypass;
    Passenger mypass2;
    Passenger mypass3;

    @BeforeEach
    void setup(){
        mypass = new Passenger("Mr", "Eoin", "Ager");
    }

    @Test
    void ConstructorSuccess(){
        assertEquals("Mr", mypass.getTitle());
        assertEquals("Eoin", mypass.getFirstName());
        assertEquals("Ager", mypass.getLastName());
    }

    @Test
    void testTitleSuccess(){
        assertEquals("Mr", mypass.getTitle());
        Passenger  mypass2 = new Passenger("Ms", "Eoin", "Ager");
        assertEquals("Ms", mypass2.getTitle());
        Passenger  mypass3 = new Passenger("Mrs", "Eoin", "Ager");
        assertEquals("Mrs", mypass3.getTitle());

    }

    @Test
    void testTitleFail(){
        //(Mr, Ms, Mrs)
        assertThrows(IllegalArgumentException.class, ()->{mypass = new Passenger("Dr", "Eoin", "Ager");});
    }

    void testShortFirstName(){
        assertThrows(IllegalArgumentException.class, () -> {mypass = new Passenger("Mr", "Eo", "Ager");});
    }
}
