import ie.atu.week8.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassenger {
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
}
