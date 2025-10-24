package model.services;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {


    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
            return dao.findAll();
    }

}
