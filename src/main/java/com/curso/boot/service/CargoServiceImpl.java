package com.curso.boot.service;

import com.curso.boot.dao.CargoDao;
import com.curso.boot.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional(readOnly = true)
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Cargo cargo) {
        dao.save(cargo);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Cargo cargo) {
        dao.update(cargo);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional
    public Cargo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional
    public List<Cargo> buscartodos() {
        return dao.findAll();
    }
}
