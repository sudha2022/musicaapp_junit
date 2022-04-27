package com.example.musicapp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.musicapp.model.musicTrack;
import com.example.musicapp.repository.musicRecordsrepository;
import java.util.List;



@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class MusicappApplicationTests {
	
@Autowired
musicRecordsrepository musicrepo;
@Test	
@Order(1)
public void	 testCreate() {
		
		musicTrack M = new musicTrack();
		M.setId(9L);
		M.setArtist("Rohan");
		M.setDuration(30);
		M.setGenre("Rock");
		M.setSongtName("We shall overcome");
		musicrepo.save(M);
		assertNotNull(musicrepo.findById(9L).get());
	}
@Test
@Order(2)
public void testReadAll() {
	List<musicTrack> list =musicrepo.findAll();
	assertTrue(list.size()>0);
	
}
@Test
@Order(3)
public void testingsinglemusicTrack() {
	musicTrack M =musicrepo.findById(9L).get();
	assertEquals("Rock", M.getGenre());
}
@Test
@Order(4)
public void testUpdate() {
	musicTrack M=musicrepo.findById(9L).get();
	M.setDuration(250);
	musicrepo.save(M);
	assertNotEquals(190,musicrepo.findById(9L).get().getDuration());
}
@Test
@Order(5)
public void testDelete() {
	musicrepo.deleteById(9L);
	assertFalse(musicrepo.existsById(9L));
}


}

