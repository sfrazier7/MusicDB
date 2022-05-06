package com.music.MusicDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.MusicDB.model.Track;
import com.music.MusicDB.repository.TrackRepository;
import java.util.List;

@Service
public class TrackService {
	
	@Autowired
		TrackRepository trkRepository;
	
	//GET
	public List<Track> getTracks() {
		return trkRepository.findAll();
	}
	
	//POST
	public Track postTrack(Track trk) {
		return trkRepository.save(trk);
	}
	
	//GET SPECIFIC RECORD
	public Track getTrack(Long trkId) {
		Track trk = trkRepository.findById(trkId).get();
		return trk;
	}
	
	//PUT
	public Track putTrack(Track trk) {
		return trkRepository.save(trk);
	}
	
	//UPDATE NAME
	public Track updateTrackName(Long trkId, String trackName) {
		Track trk = trkRepository.findById(trkId).get();
		trk.setSongName(trackName);
		
		return trkRepository.save(trk);
	}
	
	//DELETE TRACK
	public void deleteTrack(Long trkId) {
		trkRepository.deleteById(trkId);
	}
}
