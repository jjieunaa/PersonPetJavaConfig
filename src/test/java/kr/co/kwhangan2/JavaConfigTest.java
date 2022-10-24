package kr.co.kwhangan2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class JavaConfigTest {
	
	@Setter(onMethod_ = { @Autowired })
	private Person person;
	
	@Setter(onMethod_ = { @Autowired })
	private Pet pet;
	
	@Test
	public void testExist() {
		
		assertNotNull(person);
		
		pet.setName("단지");
		pet.setAge(9);
		person.setPet(pet);
		person.setName("이지은");
		person.setAge(24);
		
		log.info(person);
		log.info("---------------------");
		log.info(pet);
		
		log.info(person.getAge() + "살인 " + person.getName() + "이 " + person.getPet().getAge() + "살인 " + person.getPet().getName() + "를 키웁니다!");
		
	}
}
