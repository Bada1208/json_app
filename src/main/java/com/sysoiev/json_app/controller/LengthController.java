package com.sysoiev.json_app.controller;

import com.sysoiev.json_app.model.Length;
import com.sysoiev.json_app.service.LengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/lengths")
public class LengthController {

    private final LengthService service;

    @Autowired
    public LengthController(LengthService service) {
        this.service = service;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Length> getAllLengths() {
        return service.selectAllLengths();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{lengthUnit}"
    )
    public Length getLengthByUnit(@PathVariable("lengthUnit") String unit) {
        return service.selectLengthByUnit(unit);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void insertNewLength(@RequestBody Length length) {
        service.insertNewLength(length);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{lengthUnit}"
    )
    public void deleteLengthByUnit(@PathVariable("lengthUnit") String unit) {
        service.deleteStudentByUnit(unit);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{lengthUnit}"
    )
    public void updateLengthByUnit(@PathVariable("lengthUnit") String unit, @RequestBody Length length) {
        service.updateLengthByUnit(unit, length);
    }
}
