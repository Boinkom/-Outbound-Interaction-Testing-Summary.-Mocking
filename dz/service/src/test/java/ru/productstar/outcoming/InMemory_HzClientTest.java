import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.productstar.outcoming.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class InMemory_HzClientTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = userService.getAllUsers();
        assertThat(users).isNotNull();
        assertThat(users).isEmpty();
    }
}