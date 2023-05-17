package com.school.sasschool.repository;

import com.school.sasschool.model.EazyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass, Integer> {

}
