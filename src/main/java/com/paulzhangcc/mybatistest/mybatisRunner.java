package com.paulzhangcc.mybatistest;

import com.zhijiansihang.gen.dao.UserDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by paul on 2018/12/23.
 */
public class mybatisRunner {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                long count = session.selectOne("com.zhijiansihang.gen.dao.UserDAO.countByExample", null);
            } finally {
                session.close();
            }
        }

        {
            SqlSession session = sqlSessionFactory.openSession();
            try {
                UserDAO mapper = session.getMapper(UserDAO.class);
                long count = mapper.countByExample(null);
                System.out.println(count);
            } finally {
                session.close();
            }
        }
    }
}
