import org.example.task3.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataBaseTest {
    DataBase db = new DataBase();
    @Test
    public void testGettingData(){
        Assertions.assertEquals(db.getUserData(), "hello");
        Assertions.assertEquals(db.getStatisticData(), "hello2");
    }
}
