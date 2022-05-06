package com.music.MusicDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.MusicDB.model.Track;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

}
