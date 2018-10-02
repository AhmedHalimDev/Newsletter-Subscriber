package com.newsletter.sub.service;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.newsletter.sub.domainobject.SubscriberDO;

/**
 * Unit Testing Class for Subscriber Service.
 * <p/>
 * 
 * @author Ahmed ElGamal
 * @version 1.0
 * @since 30.09.2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsletterSubscriberServiceTest {
	
    @Autowired
    private NewsletterService newsletterService;
    
    /**
     * Test subscribe
     * @throws Exception
     */
    @Test
    public void testSubscribe() throws Exception {
    	SubscriberDO subscriber = newsletterService.subscribe(new SubscriberDO(new Long(0), "new@newsletter.de", "New User"));
    	assertTrue(subscriber != null && subscriber.getId() > 0);
    }
    /**
     * Test find active list
     * @throws Exception
     */
    @Test
    public void testFindActiveList() {
    	List<SubscriberDO> list = newsletterService.findByActive(true);
    	assertTrue(list.size() > 0);
    }
    /**
     * Test find inActive list
     * @throws Exception
     */
    @Test
    public void testFindInActiveList() {
    	List<SubscriberDO> list = newsletterService.findByActive(false);
    	assertTrue(list.size() > 0);
    }
    /**
     * Test find by date list
     * @throws Exception
     */
    @Test
    public void testFindByDateList() {
    	List<SubscriberDO> list = newsletterService.findByDate(new Date());
    	assertTrue(list.size() > 0);
    }
}
