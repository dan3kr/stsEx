package com.dan.journal;

// 저네릭 클래스를 사용하기전 (java 1.6 이전)
// 클래스를 정의 할 때 Object 타입으로 객체를 받아서 다형성을 이용했는데,
// 그 이유는 모든 객체가 Object 클래스를 상속하므로 다양한 형태의 데이터를 담을 수 있었기 때문이다.
// 단, get() method 로 반환 받을 때 원하는 타입으로 캐스팅해야하는 번거로움이 있었다.
public class OldClass {

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}
