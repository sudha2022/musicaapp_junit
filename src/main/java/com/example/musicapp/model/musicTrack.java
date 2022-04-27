package com.example.musicapp.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	
	@Table(name = "musicapp1")
	
	
	public class musicTrack {
     
	        public musicTrack( String songtName, String genre, String artist, int duration) {
			//super();
			//this.id = id;
			this.songtName = songtName;
			this.genre = genre;
			this.artist = artist;
			this.duration = duration;
		}
			public musicTrack() {
			//super();
		}
			@Id
	        @GeneratedValue(strategy = GenerationType.IDENTITY)
	        @Column(name="Autoid")
	        private Long id;
	        @Column(name="song_name")
	        private String songtName;
	        @Column(name="genre")
	        private String genre;
	        @Column(name="artist")
	        private String artist;
	        @Column(name="duration")
	        private int duration;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getSongtName() {
				return songtName;
			}
			public void setSongtName(String songtName) {
				this.songtName = songtName;
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
			public int getDuration() {
				return duration;
			}
			@Override
			public String toString() {
				return "musicTrack [id=" + id + ", songtName=" + songtName + ", genre=" + genre + ", artist=" + artist
						+ ", duration=" + duration + "]";
			}
			public void setDuration(int duration) {
				this.duration = duration;
			}


	}


