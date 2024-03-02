package com.mysite.sbb.question;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question { // 엔티티
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 질문 데이터의 고유번호

    @Column(length = 200)
    private String subject; // 질문 데이터의 제목

    @Column(columnDefinition = "TEXT")
    private String content; // 질문 데이터의 내용

    private LocalDateTime createDate; // 질문 데이터를 작성한 작성 일시
}