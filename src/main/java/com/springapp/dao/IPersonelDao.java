package com.springapp.dao;

import com.springapp.model.Personel;

import java.util.List;

/**
 * Created by enbiya on 26.10.2016.
 */
public interface IPersonelDao {

    void savePersonel(Personel personel);

    void deletePersonel(long id);

    List<Personel> getPersonels();
}
