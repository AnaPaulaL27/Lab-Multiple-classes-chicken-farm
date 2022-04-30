import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ChickenTest {

    // to test chicken we need a chicken
    // lets describe the chicken

    Chicken chicken;

    @BeforeEach

    public void setUp(){
        chicken = new Chicken("Ginger", 3);
    }

    @Test
    public void hasName(){
        assertThat(chicken.getName()).isEqualTo("Ginger", 3);
    }

    @Test
    public void canGetEggs(){
        assertThat(chicken.getEggs()).isEqualTo(3);
    }

}
