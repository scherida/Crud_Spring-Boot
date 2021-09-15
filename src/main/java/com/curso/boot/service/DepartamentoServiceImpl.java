package com.curso.boot.service;

import com.curso.boot.dao.DepartamentoDao;
import com.curso.boot.domain.Departamento;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DepartamentoServiceImpl implements DepartamentoService{

    private DepartamentoDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        dao.save(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        dao.update(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Departamento> buscartodos() {
        return dao.findAll();
    }
}
