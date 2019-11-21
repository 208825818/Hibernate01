import com.mzh.po.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    @org.junit.Test
    public void test() {
      //1.获取sessionFactory 会话工厂
        SessionFactory sessionFactory=
        new Configuration().configure().buildSessionFactory();
        //2.生产会话 通过opensession 获取session对象
        Session session=sessionFactory.openSession();
        //3.开启一个事务
        Transaction transaction=session.beginTransaction();
        //执行查询 get(药查询的实体类型,参数)
        Dept dept=session.get(Dept.class,1);
        System.out.println("Dept="+dept);
        //4.1执行查询
        Dept dept1=session.load(Dept.class,1);
        System.out.println("Dept="+dept1);
        //6.添加
        Dept dept2=new Dept();
        session.save("张三");
        //7.删除
        Dept dept3=session.get(Dept.class,5);
        if(dept3!=null){
            session.delete(dept3);
        }
        //8.修改
        Dept dept4=new Dept();
        dept4.setName("哈哈");
        session.saveOrUpdate(dept4);
    }
}