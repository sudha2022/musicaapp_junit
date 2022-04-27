package com.example.musicapp.repository;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
    import com.example.musicapp.model.musicTrack;
		
		@Repository
		public interface musicRecordsrepository extends JpaRepository<musicTrack, Long> {

			
		}


