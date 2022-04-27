package com.example.musicapp.controller;


	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.musicapp.model.musicTrack;
	import com.example.musicapp.service.musicService;
	
	@RestController
	@RequestMapping("/api")
	
	public class musicController {	
		@Autowired
		musicService musicservice;
	
	        
	        @RequestMapping(value="/musicapp", method=RequestMethod.POST)
	        public musicTrack createMusic(@RequestBody musicTrack music) {
	            return musicservice.createMusic(music);
	        }

	        @RequestMapping(value="/musicapp", method=RequestMethod.GET)
	        public List<musicTrack> readmusicTrack() {
	            return musicservice.getMusic();
	        }
	        
	        
	        @RequestMapping(value="/musicapp/{musicId}", method=RequestMethod.GET)
	        public List<musicTrack> readtrackMusic(@PathVariable(value = "musicId")Long id) {
	        return musicservice.getMusic();
	        }
	        @RequestMapping(value="/musicapp", method=RequestMethod.PUT)
	        public musicTrack readMusic(@PathVariable(value = "musicId") Long id, @RequestBody musicTrack musicDetails) {
	            return musicservice.updateMusic(id, musicDetails);
	        }

	        @RequestMapping(value="/musicapp/{musicId}", method=RequestMethod.DELETE)
	        public void deleteMusic(@PathVariable(value = "musicId") Long id) {
	            musicservice.deleteTrack(id);
	        }

	}


