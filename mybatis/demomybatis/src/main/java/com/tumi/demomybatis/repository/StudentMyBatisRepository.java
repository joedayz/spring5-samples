package com.tumi.demomybatis.repository;


import com.tumi.demomybatis.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {

    @Select("select * from student")
    public List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    public Student findById(long id);

    @Delete("DELETE FROM student WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO student(id, name, passport) VALUES (#{id}, #{name}, #{passport})")
    public int insert(Student student);

    @Update("Update student set name=#{name}, passport=#{passport} where id=#{id}")
    public int update(Student student);
}
