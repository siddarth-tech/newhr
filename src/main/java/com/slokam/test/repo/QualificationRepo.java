package com.slokam.test.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.test.entity.Qualification;
				@Repository
				public interface QualificationRepo extends JpaRepository<Qualification, Integer> {

				}
