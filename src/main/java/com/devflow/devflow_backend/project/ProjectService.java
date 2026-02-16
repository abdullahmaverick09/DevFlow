package com.devflow.devflow_backend.project;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    
    public Project createProject(Project project){
        return projectRepository.save(project);
    }


    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
    
}
