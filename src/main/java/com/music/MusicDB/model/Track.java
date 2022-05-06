package com.music.MusicDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracks")
public class Track {

	public Track() {
		
	}

		@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="trk_id")
            private Long id;
        
        @Column(name="name")
        private String songName;
        
        @Column(name="genre")
        private String genre;
        
        @Column(name="artist")
        private String artist;
        
        @Column(name="durationInSeconds")
        private int seconds;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSongName() {
			return songName;
		}

		public void setSongName(String songName) {
			this.songName = songName;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public int getSeconds() {
			return seconds;
		}

		public void setSeconds(int seconds) {
			this.seconds = seconds;
		}

		@Override
		public String toString() {
			return "Track [id=" + id + ", songName=" + songName + ", genre=" + genre + ", artist=" + artist
					+ ", seconds=" + seconds + "]";
		}

}
