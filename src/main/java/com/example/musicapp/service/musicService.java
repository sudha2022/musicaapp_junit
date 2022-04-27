package com.example.musicapp.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.example.musicapp.model.musicTrack;
	import com.example.musicapp.repository.musicRecordsrepository;
	import java.util.List;

	@Service
	public class musicService {

	        @Autowired
	            musicRecordsrepository musicRepository;        
	            public musicTrack createMusic(musicTrack music) {
	        	return musicRepository.save(music);
	        	}



	        	// READ
	        	public List<musicTrack> getMusic() {
	        	return musicRepository.findAll();
	        	}



	        	// DELETE
	        	public void deleteTrack(Long musicId) {
	        	 musicRepository.deleteById(musicId);
	        	}
	        	
	            // PATCH
	        	   //public musicTrack patchMusic(Long musicId,String songname) {
	        		//return musicRepository.save(songname);
	  //      	}
	        	
	        	 // UPDATE
	        	    public musicTrack updateMusic(Long musicId, musicTrack musicDetails) {
	        		musicTrack music = musicRepository.findById(musicId).get();
	        		music.setSongtName(musicDetails.getSongtName());
	        		music.setGenre(musicDetails.getGenre());
	        		music.setArtist(musicDetails.getArtist());
	        		music.setDuration(0);musicDetails.getDuration();

	        		return musicRepository.save(music);
	}



				 
				}



				
				
	




