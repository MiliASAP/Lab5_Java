package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {

    @Autowired
    private ShapeRepository shapeRepository;
    @Autowired
    private ShapeService shapeService;

    @GetMapping
    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(shapeRepository.findAll());
        return allShapes;
    }

    @PostMapping
    public Shape createShape (@RequestBody Shape shape) {
        return shapeService.saveShape(shape);
    }
}


