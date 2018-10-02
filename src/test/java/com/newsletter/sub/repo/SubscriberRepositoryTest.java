package com.newsletter.sub.repo;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.newsletter.sub.dataaccessobject.SubscriberRepository;
import com.newsletter.sub.domainobject.SubscriberDO;

/**
 * Unit Testing Class for Subscriber Repository.
 * <p/>
 * 
 * @author Ahmed ElGamal
 * @version 1.0
 * @since 30.09.2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriberRepositoryTest {

	@Autowired
	SubscriberRepository subscriberRepository;
	
	/**
	 * Test save logic
	 * @throws Exception
	 */
	@Test
    public void saveTest() throws Exception {
		SubscriberDO subscriber = new SubscriberDO(new Long(0), "repo@newsletter.net", "Test Repo");
		SubscriberDO subscriberDO = subscriberRepository.save(subscriber);
		assertTrue(subscriberDO != null);
		assertTrue(subscriberDO.getId() > 0 && subscriberDO.getActive());
    }
	/**
	 * Test find all logic
	 * @throws Exception
	 */
	@Test
    public void findAllTest() throws Exception {
		List<SubscriberDO> subscribers = subscriberRepository.findAll();
		assertTrue(!subscribers.isEmpty());
    }
	/**
	 * Test find by id logic
	 * @throws Exception
	 */
	@Test
    public void findOneTest() throws Exception {
		SubscriberDO subscriber = subscriberRepository.findOne(new Long(1));
		assertTrue(subscriber != null);
    }
	/**
	 * Test find by active logic
	 * @throws Exception
	 */
	@Test
    public void findByActiveTest() throws Exception {
		List<SubscriberDO> activeSubscribers = subscriberRepository.findByActive(true);
		List<SubscriberDO> inactiveSubscribers = subscriberRepository.findByActive(false);
		assertTrue(activeSubscribers.size() > 0);
		assertTrue(inactiveSubscribers.size() > 0);
	}
	/**
	 * Test find by email logic
	 * @throws Exception
	 */
	@Test
	public void findByEmailTest() throws Exception {
		Optional<SubscriberDO> subscriper = subscriberRepository.findByEmail("repo@newsletter.net");
		assertTrue(subscriper.isPresent());
		assertTrue(subscriper.get().getActive());
		assertTrue(subscriper.get().getName().equals("Test Repo"));
	}
	/**
	 * Test delete logic
	 * @throws Exception
	 */
	@Test
    public void deleteTest() throws Exception {
		subscriberRepository.delete(new Long(1));
		SubscriberDO subscriber = subscriberRepository.findOne(new Long(1));
		assertTrue(subscriber == null);
    }
}
