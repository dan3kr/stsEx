package com.dan.journal;

// 클래스를 선언하여 객체를 생성할 때 구체적인 타입(Type)를 개재한다.
// 즉 타입(Type)을 어떤 클래스 종류의 매개변수로 보는 것이다.
// 제네릭 클래스(Genenric class)에서는 타입을 변수로 표시한다.
// 이것을 “타입 매개변수(type parameter)”라고 하며, 타입 매개변수는 객체 생성 시에 프로그래머에 의하여 결정된다.
public class NewClass <T> {

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

