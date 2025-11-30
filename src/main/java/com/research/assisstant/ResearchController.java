package com.research.assisstant;
//We will have our endpoints defined here.

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
// This is from lombok, and it will initialize a constructor with all the fields defined inside the service class.
@AllArgsConstructor
public class ResearchController {
//    Get the object of the ResearchService over here.
    private ResearchService researchService;

//    Add an endpoint over here.
    @PostMapping("/process")
    public ResponseEntity<String> processResponse(@RequestBody ResearchRequest request){
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
