package com.example.tp4application.service;

import com.example.tp4application.beans.Star;
import com.example.tp4application.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class StarService implements IDao<Star> {

    private List<Star> stars;

    public StarService(List<Star> stars) {
        this.stars =stars;
    }



    @Override
    public boolean create(Star o) {
        return stars.add(o);

    }

    @Override
    public boolean update(Star o) {
        for (Star s : stars) {
            if (s.getId() == o.getId()) {
                s.setImg(o.getImg());
                s.setName(o.getName());
                s.setStar(o.getStar());
            }
        }
        return true;
    }

    @Override
    public boolean delete(Star o) {
        return stars.remove(o);
    }

    @Override
    public Star findById(int id) {
        for (Star s : stars) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    @Override
    public List<Star> findAll() {
        return stars;
    }
}

