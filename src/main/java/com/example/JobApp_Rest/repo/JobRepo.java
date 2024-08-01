package com.example.JobApp_Rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JobApp_Rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{
        List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}