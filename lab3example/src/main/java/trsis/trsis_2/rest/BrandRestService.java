package trsis.trsis_2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trsis.trsis_2.service.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandRestService {

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(brandService.listAll());
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        brandService.delete(id);
    }

    @RequestMapping(value = "/add/{name}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("name") String name) {
        return ResponseEntity.ok(brandService.add(name));
    }
}
