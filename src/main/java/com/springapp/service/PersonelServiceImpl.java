package com.springapp.service;

import com.springapp.dao.IPersonelDao;
import com.springapp.model.Personel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by enbiya on 26.10.2016.
 */
@Service
public class PersonelServiceImpl implements IPersonelService {

    @Autowired
    private IPersonelDao personelDao;

    @Override
    @Transactional
    public void savePersonel(Personel personel) {
        personelDao.savePersonel(personel);
    }

    @Override
    @Transactional
    public void deletePersonel(long id) {
        personelDao.deletePersonel(id);
    }

    @Override
    @Transactional
    public List<Personel> getPersonels() {
        return personelDao.getPersonels();
    }
}
