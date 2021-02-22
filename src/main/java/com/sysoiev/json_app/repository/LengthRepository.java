package com.sysoiev.json_app.repository;

import com.sysoiev.json_app.model.Length;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LengthRepository extends JpaRepository<Length, Long> {

    Length selectLengthByUnit(String unit);

    int insertNewLength(Length length);

    List<Length> selectAllLengths();

    int updateLengthByUnit(String unit, Length lengthUpdate);

    int deleteStudentByUnit(String unit);
}
