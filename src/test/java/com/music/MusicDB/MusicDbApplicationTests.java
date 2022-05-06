package com.music.MusicDB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.music.MusicDB.model.Track;
import com.music.MusicDB.repository.TrackRepository;

import java.util.List;

@SpringBootTest
class MusicDbApplicationTests {

	@Autowired
	TrackRepository trkRepo;
	
	
	@Test
	public void testCreate() {
		Track trk1 = new Track();
		trk1.setId((long) 9);
		trk1.setArtist("Feint");
		trk1.setSongName("Outbreak");
		trk1.setGenre("Electric");
		trk1.setSeconds(231);
		trkRepo.save(trk1);
		assertNotNull(trkRepo.findById((long) 9).get());
	}
	
	@Test
	public void testReadAll () {
		List<Track> list = trkRepo.findAll();
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testFindTrack () {
		Track trk = trkRepo.findById((long)9).get();
		assertEquals(231, trk.getSeconds());
	}
	
	@Test
	public void testUpdate() {
		Track trk = trkRepo.findById((long)9).get();
		trk.setArtist("Feint & MYLK");
		trkRepo.save(trk);
		assertNotEquals("Feint", trk.getArtist());
	}
	
	@Test
	public void testDelete() {
		trkRepo.deleteById((long)9);
		Boolean trkRecord = trkRepo.existsById((long)9);
		//assertThat(trkRecord.isFalse());
	}

}
