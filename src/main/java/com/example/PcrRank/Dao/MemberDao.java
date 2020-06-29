package com.example.PcrRank.Dao;

import com.example.PcrRank.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<Member, String> {

    @Query(value = "select count(*) from guild_member where username = ?1 and password = ?2 and active = ?3")
    Integer countAllByUsernameAndPasswordAndActive(String username, String password, Integer active);
}
