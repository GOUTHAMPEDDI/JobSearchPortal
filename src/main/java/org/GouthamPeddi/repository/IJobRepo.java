package org.GouthamPeddi.repository;

import org.GouthamPeddi.model.Type;
import org.GouthamPeddi.model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {

    Job findJobById(Long jId);

    List<Job> findByJobTypeAndSalaryGreaterThan(Type type, Double salary);

    List<Job> findByJobTypeAndLocationOrJobType(Type type1, String location, Type type2);

}
