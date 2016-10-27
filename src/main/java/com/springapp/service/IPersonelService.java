package com.springapp.service;

import com.springapp.model.Personel;

import java.util.List;

/**
 * Created by enbiya on 26.10.2016.
 */
public interface IPersonelService {

    void savePersonel(Personel personel);

    void deletePersonel(long id);

    List<Personel> getPersonels();

}
