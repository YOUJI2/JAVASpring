# :pushpin: IT대기업 현업 개발자와 함께하는 백엔드 개발 실무 

## **1주차 과제 정리**

### :paperclip: 웹 어플리케이션 서버 

**아파치**
  + ‘open source’라이센스에 따라 배포되어 마음대로 쓸 수 있는 HTTP 웹 서버를 의미한다. 
  [웹 서버 : 클라이언트의 요청을 기다리고 요청에 대한 데이터를 만들어서 응답하는 역할을 한다.] ==> 정적인 데이터(html, css, 이미지등)로 한정된다.
  
**톰캣(= 톰캣 + 아파치 몇몇 기능)**
  + WAS(Web Application Server)로 동적인 웹을 만들기 위한 웹 컨테이너, 서블릿 컨테이너라고 불리며, 웹서버에서 정적으로 처리해야할 데이터를 제외한 JSP, ASP, PHP 등    은 톰켓에게 전달된다. DB연결, 데이터 조작, 다른 응용프로그램과 상호 작용이 가능하다. 
  [8080포트 처리]

  => 실제로 80port에서 거의 다 처리한다고 한다.



### :paperclip: mySql Workbench 설치 및 샘플 DB 구축
![image](https://user-images.githubusercontent.com/43923432/109499438-425f5280-7ad8-11eb-845d-48f19c6cea26.png)


### :paperclip: MariaDB 연동
![image](https://user-images.githubusercontent.com/43923432/109499497-530fc880-7ad8-11eb-840a-caa14edf3455.png)


### :paperclip: test.xml 작성
![image](https://user-images.githubusercontent.com/43923432/109499550-64f16b80-7ad8-11eb-9995-bd3478face27.png)
 **-> movieVO는 MovieVO.java 클래스의 경로를 의미한다.**
 
 
### :paperclip: MovieVO.java
 **VO(Value Object)**
  * 대략적으로 값 객체 패턴(value object pattern) 즉, 객체를 값처럼 쓸 수 있고, 제약사항 중 하나는 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않음을 보장한다는 것입니다. 
  * **Value Object는 불변의 특성이 있다. 한번 생성되면 이후 내부 값을 바꿀 수 없어야한다.**
  [Setter를 허용하지 않아야한다.]
![image](https://user-images.githubusercontent.com/43923432/109499788-b26dd880-7ad8-11eb-8cfa-0214f2291a08.png)


### :paperclip: 실제 Server구동시
![image](https://user-images.githubusercontent.com/43923432/109499901-d6c9b500-7ad8-11eb-98d6-ee0a54c6a0b0.png)

==========================

### :paperclip: 질문 거리 
![image](https://user-images.githubusercontent.com/43923432/109500061-1395ac00-7ad9-11eb-8a32-78b23494d27a.png)
 * tomcat-users.xml 파일 </br>
 **[에러 코드]**</br>
    Multiple annotations found at this line:
	- Start tag of element 'tomcat-users'
	- cvc-elt.1.a: Cannot find the declaration of element 'tomcat-users'.
 </br>
 [이와 같이 오류가 뜨는데 server를 돌리는데는 아무런 문제가 없었습니다. 이게 인식을 못해서 이런 오류가 있는지 궁금합니다.] 










