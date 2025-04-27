import ie.atu.week8.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Passengertest {
    Passenger mypass;

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
    void testTitleFail(){
        //(Mr, Ms, Mrs)
        assertThrows(IllegalArgumentException.class, ()->{mypass = new Passenger("Dr", "Eoin", "Ager");});
    }
}
