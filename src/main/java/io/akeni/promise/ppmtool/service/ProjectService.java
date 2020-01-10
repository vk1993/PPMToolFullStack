package io.akeni.promise.ppmtool.service;

import io.akeni.promise.ppmtool.model.Project;
import io.akeni.promise.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){

        return projectRepository.save(project);
    }

}
