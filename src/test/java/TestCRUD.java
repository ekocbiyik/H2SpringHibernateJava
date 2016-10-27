import com.springapp.model.Personel;
import com.springapp.service.IPersonelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by enbiya on 26.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-config.xml"})
public class TestCRUD {

    @Autowired
    private IPersonelService personelService;

    @Test
    public void testSave(){

        Personel p = new Personel();
        p.setName("testOK!");
        p.setAge("6112");
        personelService.savePersonel(p);

    }
}
