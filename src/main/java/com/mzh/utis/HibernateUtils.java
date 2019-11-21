package com.mzh.utis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author aaa
 * @create 2019-11-21-11:06
 */
public class HibernateUtils {
    //1.获取sessionFactory 会话工厂
    SessionFactory sessionFactory=
            new Configuration().configure().buildSessionFactory();
    //2.生产会话 通过opensession 获取session对象
    Session session=sessionFactory.openSession();
    //3.开启一个事务
    Transaction transaction=session.beginTransaction();
}
