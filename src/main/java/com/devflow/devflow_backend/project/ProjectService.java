package com.devflow.devflow_backend.project;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectService {
	private final ProjectRepository projectRepository;

	public Project createProject(Project project) {
		return projectRepository.save(project);
	}

	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	public Project updateProject(Long id, Project projectDetails) {
		Project existingProject = projectRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Project with the id: " + id + " is not found"));
		existingProject.setName(projectDetails.getName());
		existingProject.setDescription(projectDetails.getDescription());

		return projectRepository.save(existingProject);
	}

	public void deleteProject(Long id) {
		Project existingProject = projectRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Project with the id: " + id + " is not found."));
		
		projectRepository.delete(existingProject);
	}
}
