import org.example.task3.Authorisation;
import org.example.task3.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorizationTest {
    DataBase db = new DataBase();
    @Test
    public void testAuthorizing(){
        Assertions.assertTrue(new Authorisation().authorize(db));
    }
}
