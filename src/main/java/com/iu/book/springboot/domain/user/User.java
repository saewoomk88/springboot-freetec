package com.iu.book.springboot.domain.user;

import com.iu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    /**비지니스로직*/
    //등록
    @Builder
    public User(String name, String email, String picture, Role  role) {
        this.name=name;
        this.email=email;
        this.picture=picture;
        this.role=role;
    }
    //수정
    public User update(String name, String picture){
        this.name=name;
        this.picture=picture;
        return this;
    }
    //키를 가져와서 사용자 구분
    public String getRoleKey(){
        return this.role.getKey();
    }
}
