package com.springapp.dao;

import com.springapp.model.Personel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by enbiya on 26.10.2016.
 */
@Component
public class PersonelDaoImpl implements IPersonelDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void savePersonel(Personel personel) {
        getCurrentSession().saveOrUpdate(personel);
    }

    @Override
    public void deletePersonel(long id) {
        getCurrentSession().delete(id);
    }

    @Override
    public List<Personel> getPersonels() {
        return getCurrentSession().createQuery("from Personel").list();
    }
}
