import com.itheima.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springaop.xml")
public class AopTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void fun01(){
        userDao.save();
    }

    @Test
    public void fun02(){
        userDao.delete();
    }

    @Test
    public void fun03(){
        userDao.showTime();
    }

    @Test
    public void fun04(){
        userDao.showExc();
    }
}
