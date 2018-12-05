package trsis.trsis_2.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trsis.trsis_2.db.dao.BrandRepository;
import trsis.trsis_2.db.model.Brand;

@Service
public class BrandServiceImpl implements BrandService {

    private final static Logger log = Logger.getLogger(BrandServiceImpl.class);

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Iterable<Brand> listAll() {
        return brandRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        brandRepository.delete(id);
    }

    @Override
    public Brand add(String name) {
        return brandRepository.save(new Brand(name));
    }
}
