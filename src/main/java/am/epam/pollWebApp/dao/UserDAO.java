package am.epam.pollWebApp.dao;

import am.epam.pollWebApp.model.Users;

import java.sql.Date;
import java.util.List;

public interface UserDAO<T> {
    List<T> getAll();

    T create(T obj);

    Users pollResultById(long id);

    boolean existEmailAndPass(String email, String pass);

    T getByEmailAndPass(String email, String pass);

    void updateDate(int user_id, Date date);

    void updateResult(int id, String description);
}
