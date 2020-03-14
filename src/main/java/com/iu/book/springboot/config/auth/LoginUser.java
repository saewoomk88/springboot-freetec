package com.iu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //어노테이션 생성 위치 , 파라미터로 지정햇으니 파라미터로 선언된 객체에만 사용가능
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {   //@Interface 는 이 파일을 어노테이션으로 지정한다는 뜻
}
