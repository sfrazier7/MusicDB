package com.music.MusicDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.music.MusicDB.model.Track;
import com.music.MusicDB.service.TrackService;

@RestController
@RequestMapping("/music")
public class TrackController {
	
	@Autowired
	TrackService trkService;
	
	@RequestMapping(value="/track", method=RequestMethod.POST)
	public Track postTrack(@RequestBody Track trk) {
		return trkService.postTrack(trk);
	}
	
	@RequestMapping(value="/tracks", method=RequestMethod.GET)
	public List<Track> getTracks() {
		return trkService.getTracks();
	}
	
	@RequestMapping(value="/track/{trkId}", method=RequestMethod.GET)
	public Track getTrack(@PathVariable(value = "trkId") Long id) {
		return trkService.getTrack(id);
	}
	
	@RequestMapping(value="/track/{trkId}", method=RequestMethod.PUT)
	public Track putTrack(@PathVariable(value = "trkId") Long id, @RequestBody Track trk) {
		return trkService.putTrack(trk);
	}
	
	@RequestMapping(value="/track/{trkId}/{newName}", method=RequestMethod.PATCH)
	public Track updateTrackName(@PathVariable(value = "trkId") Long id, @PathVariable(value = "newName") String name) {
		return trkService.updateTrackName(id, name);
	}
	
	@RequestMapping(value="/delete/{trkId}", method=RequestMethod.DELETE)
	public void deleteTrack(@PathVariable(value = "trkId") Long id) {
		trkService.deleteTrack(id);
	}
	
}
