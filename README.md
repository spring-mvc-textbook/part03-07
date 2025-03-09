# PART 03. 게시글 기능 만들기

이 파트에서는 Spring MVC를 활용하여 게시판 기능을 구현하는 과정을 다룹니다.
설계를 시작으로, 데이터베이스 연결, 화면 구성, 게시글 CRUD(등록, 조회, 수정, 삭제) 기능을 단계별로 구현합니다.

## 01. 설계하기

소프트웨어 개발의 첫 단계는 시스템을 효과적으로 설계하는 것입니다. 이 과정에서는 프로젝트의 주요 기능을 정의하고, 사용자의 흐름을 정리하며, 필요한 화면과 데이터 모델을 구체화합니다.

- 📖 교재 : [https://wikidocs.net/267620](https://wikidocs.net/267620)

## 02. 데이터베이스

데이터베이스는 시스템의 핵심 요소이며, 데이터 저장 및 관리를 위해 필수적인 구성 요소입니다. 여기에서는 데이터베이스 연결부터 CRUD 테스트까지 수행합니다.

- 📖 교재 : [https://wikidocs.net/267621](https://wikidocs.net/267621)

## 03. 데이터베이스 연결하기

Spring MVC에서 데이터베이스를 연결하는 방법을 다룹니다. HikariCP를 활용한 데이터베이스 커넥션 풀 설정, root-context.xml을 이용한 데이터베이스 설정하는 방법을 설명합니다.

- 📖 교재 : [https://wikidocs.net/267624](https://wikidocs.net/267624)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-03](https://github.com/spring-mvc-textbook/part03-03)

## 04. JSP 구조 만들기

JSP를 활용한 View 레이어 구축 방법을 설명합니다. MVC 패턴에서 JSP가 어떻게 활용되는지, WEB-INF/views 디렉터리 구조, jsp:include를 활용한 공통 템플릿 적용 방법 등을 다룹니다.

- 📖 교재 : [https://wikidocs.net/268520](https://wikidocs.net/268520)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-04](https://github.com/spring-mvc-textbook/part03-04)

## 05. 게시글 등록 만들기 (화면)

게시글을 작성하는 화면을 구현하는 방법을 다룹니다. Bootstrap을 활용한 입력 폼 디자인, form 태그와 POST 요청의 처리 방식, @ModelAttribute를 활용한 데이터 바인딩 개념을 설명합니다.

- 📖 교재 : [https://wikidocs.net/277217](https://wikidocs.net/277217)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-05](https://github.com/spring-mvc-textbook/part03-05)

## 06. 게시글 등록 만들기 (처리)

게시글 데이터를 데이터베이스에 저장하는 백엔드 로직을 다룹니다. @RequestMapping을 이용한 컨트롤러 구현, INSERT SQL을 활용한 방법 등을 설명합니다.

- 📖 교재 : [https://wikidocs.net/267625](https://wikidocs.net/267625)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-06](https://github.com/spring-mvc-textbook/part03-06)

## 07. 게시글 목록 만들기

등록된 게시글을 목록 형태로 출력하는 기능을 구현합니다. SELECT SQL을 이용한 데이터 조회, Model을 활용한 데이터 전달, c:forEach 또는 JSTL을 활용한 반복 출력 기법을 다룹니다.

- 📖 교재 : [https://wikidocs.net/267626](https://wikidocs.net/267626)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-07](https://github.com/spring-mvc-textbook/part03-07)

## 08. 게시글 보기 만들기

특정 게시글의 상세 정보를 조회하는 기능을 다룹니다. URL 매핑을 이용한 게시글 식별 (/post/{id} 패턴), @PathVariable을 이용한 데이터 전달, 조회수 증가 기능 구현 등을 설명합니다.

- 📖 교재 : [https://wikidocs.net/267627](https://wikidocs.net/267627)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-08](https://github.com/spring-mvc-textbook/part03-08)

## 09. 게시글 수정 만들기 (화면)

게시글 수정 폼을 제공하는 화면을 구현합니다. 기존 데이터가 폼에 자동으로 채워지는 방식, th:value 또는 JSP 표현식(${post.title})을 이용한 데이터 출력 방식 등을 다룹니다.

- 📖 교재 : [https://wikidocs.net/277220](https://wikidocs.net/277220)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-09](https://github.com/spring-mvc-textbook/part03-09)

## 10. 게시글 수정 만들기 (처리)

사용자가 입력한 수정된 데이터를 데이터베이스에 반영하는 로직을 다룹니다. UPDATE SQL을 이용한 수정 처리, @RequestParam과 @ModelAttribute를 이용한 데이터 수집 및 검증 방법 등을 설명합니다.

- 📖 교재 : [https://wikidocs.net/267628](https://wikidocs.net/267628)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-10](https://github.com/spring-mvc-textbook/part03-10)

## 11. 게시글 삭제 만들기

게시글을 삭제하는 기능을 구현합니다. DELETE SQL을 이용한 데이터 삭제 처리, @PathVariable을 이용한 ID 전달, 삭제 후 목록 페이지로 리다이렉트하는 방식 등을 다룹니다.

- 📖 교재 : [https://wikidocs.net/267629](https://wikidocs.net/267629)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-11](https://github.com/spring-mvc-textbook/part03-11)

## 12. 비밀번호 확인 함수 만들기

게시글 수정, 게시글 삭제에서 공통으로 사용되는 기능을 별도의 함수로 만들어서 사용하는 방법을 설명합니다.

- 📖 교재 : [https://wikidocs.net/277867](https://wikidocs.net/277867)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-12](https://github.com/spring-mvc-textbook/part03-12)

## 13. @RequestMapping 적용하기

Spring MVC에서 @RequestMapping 어노테이션을 활용하는 방법을 설명합니다. GET, POST, PUT, DELETE 등의 HTTP 메서드를 컨트롤러에서 처리하는 방법, @GetMapping, @PostMapping과 같은 축약형 어노테이션의 사용법, 그리고 URL 패턴 관리 기법 등을 다룹니다.

- 📖 교재 : [https://wikidocs.net/277223](https://wikidocs.net/277223)
- 💻 코드 : [https://github.com/spring-mvc-textbook/part03-13](https://github.com/spring-mvc-textbook/part03-13)