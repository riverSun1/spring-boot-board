package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;

//import java.util.List; 
//
//import jakarta.persistence.CascadeType; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 답변 데이터의 고유 번호

    @Column(columnDefinition = "TEXT")
    private String content; // 답변 데이터의 내용

    private LocalDateTime createDate; // 답변 데이터를 작성한 일시

    // 게시판 서비스에서는 하나의 질문에 답변은 여러 개가 달릴 수 있다.
    // 따라서 답변은 Many(많은 것)가 되고 질문은 One(하나)이 된다.
    @ManyToOne
    private Question question; // 질문 데이터 (어떤 질문의 답변인지 알아야하므로 이 속성이 필요됨.)

//    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // 질문을 삭제하면 그에 달린 답변들도 모두 삭제되도록
//    private List<Answer> answerList; 
}