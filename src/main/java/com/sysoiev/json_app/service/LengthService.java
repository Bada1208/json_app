package com.sysoiev.json_app.service;

import com.sysoiev.json_app.model.Length;
import com.sysoiev.json_app.repository.LengthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LengthService {
    private final LengthRepository lengthRepository;

    @Autowired
    public LengthService(LengthRepository lengthRepository) {
        this.lengthRepository = lengthRepository;
    }

    public Length selectLengthByUnit(String unit) {
        return lengthRepository.selectLengthByUnit(unit);
    }

    public int insertNewLength(Length length) {
        return lengthRepository.insertNewLength(length);
    }

    public List<Length> selectAllLengths() {
        return lengthRepository.selectAllLengths();
    }

    public int updateLengthByUnit(String unit, Length lengthUpdate) {
        return lengthRepository.updateLengthByUnit(unit, lengthUpdate);
    }

    public int deleteStudentByUnit(String unit) {
        return lengthRepository.deleteStudentByUnit(unit);
    }

}
