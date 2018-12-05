package trsis.trsis_2.service;

import trsis.trsis_2.db.model.Brand;

public interface BrandService {

    Iterable<Brand> listAll();

    void delete(Integer id);

    Brand add(String name);
}
