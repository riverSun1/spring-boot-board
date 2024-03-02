package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

// 생성한 QuestionRepository 인터페이스를 리포지터리로 만들기 위해
// JpaRepository 인터페이스를 상속한다.
// JpaRepository는 JPA가 제공하는 인터페이스 중 하나로
// CRUD 작업을 처리하는 메서드들을 이미 내장하고 있어
// 데이터 관리 작업을 좀 더 편리하게 처리할 수 있다.
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}