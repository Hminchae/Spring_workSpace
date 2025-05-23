package class1;

public class Student {
    String name;
    int age;
    int grade;
}

/*✅
이렇게 클래스에 정의한 변수들을 멤버 변수, 또는 필드라고 한다.
- 멤버 변수(Member Variable) : 이 변수들은 특정 클래스에 소속된 멤버이기 때문에 이렇게 부름
- 필드(Field): 데이터 항목을 가르키는 전통적인 용어이다. 데이터베이스, 엑셀 등에서 데이터 각각의 항목을 필드라고 한다
- 자바에서 멤버변수, 필드는 같은 뜻이다. 클래스에 소속된 변수를 뜻한다.
*/

/*✅
클래스와 사용자 정의 타입
- 타입은 데이터의 종류나 형태를 나타낸다.
- int 라고 하면 정수 타입, String 이라고 하면 문자타입이다.
- 학생(Student)이라는 타입을 만들면 되지 않을까?
- 클래스를 사용하면 int, String 과 같은 타입을 직접 만들 수 있다.
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스 이다.
- 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 🔥객체 또는 🔥인스턴스라고 한다.
- 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
 */

/*💡
용어: 클래스, 객체, 인스턴스
클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다. 둘 다 같은 의미로 사용된다.
여기서는 학생(Student)클래스를 기반으로 학생1, 학생2 객체 또는 인스턴스를 만들었다.
 */

/*💡
참조값 보관
- 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)(x001)을 반환한다.
    *여기서 x001이라고 표현한 것이 참조값이다. 실제로 x001 처럼 표현되는 것은 아니고 이해를 위한 예시임
- new 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다. 앞서 선언한 변수인 Student student1 에 생성된 객체의 참조값(x001)을 보관한다.
- Student student1 변수는 이제 메모리에 존재하는 실제 Student 객체(인스턴스)의 참조값을 가지고 있다.
    * student1 변수는 방금 만든 객체에 접근할 수 있는 참조값을 가지고 있다. 따라서 이 변수를 통해서 객체를 접근(참조) 할 수 있다. 쉽게 이야기 해서
    student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용할 수 있다.

참조값을 보관해야 하는 이유

객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다. 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다. 따라서
생성한 객체에 접근할 수 있는 방법이 필요하다. 이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다. 앞서 Student student1 변수에 참조값(x001)
을 저장해두었으므로 저장한 참조값(x001)을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다.

Student student1 = new Student(); //1. Student 객체 생성
Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환
student1 = x001; //3. 최종 결과 
 */

/*
📌클래스, 객체, 인스턴스 정리

클래스 - Class
: 클래스는 객체를 생성하기 위한 '틀' 또는 설계도, 클래스는 객체가 가져야 할 속성(변수)과 기능(메서드)를 정의한다.
예를 들어 학생이라는 클래스는 속성으로 name, age, grade 를 가진다.
- 틀 : 붕어빵 틀을 생각해보면, 붕어빵 틀 != 붕어빵 이다. 이렇게 생긴 붕어빵이 나왔으면 좋겠다고 만드는 틀이다.
실제 먹을 수 있는 팥 붕어빵을 객체 또는 인스턴스라고 한다.
- 설계도 : 자동차 설계도를 생각해보자. 자동차 설계도는 자동차가 아니다. 설계도는 실제 존재하는 것이 아니라 개념으로만 있는 것이다.
설계도를 통해 생산한 실제 존재하는 흰색 테슬라 모델 Y 자동차를 객체 또는 인스턴스라고 한다.

객체 - Object
: 객체는 클래스에서 정의한 속성과 기능을 가진 실체이다. 객체는 서로 독립적인 상태를 가진다. 예를 들어 student1 은
학생 1의 속성을 가지는 객체이고, student2는 학생2의 속성을 가지는 객체이다. student1 과 student2 는 같은 클래스에서
만들어졌지만, 서로 다른 객체이다.

인스턴스 - Instance
: 인스턴스는 특정 클래스로부터 생성된 객체를 의미한다. 그래서 객체와 인스턴스라는 용어는 자주 혼용된다. 인스턴스는 주로
객체가 어떤 클래스에 속해 있는지 강조할 때 사용한다. 예를 들어서 student1 객체는 Student 클래스의 인스턴스다. 라고 표현함

객체 vs 인스턴스
: 둘 다 클래스에서 나온 실체라는 의미에서 비슷하게 사용되지만, 용어상 인스턴스는 객체보다 좀 더 관계에 초점을 맞춘 단어이다.
보통 student1 은 Student의 객체이다. 라고 말하는 대신 student1은 Student의 인스턴스다. 라고 특정 클래스와의 관계를
명확히 할 때 인스턴스라는 용어를 주로 사용한다.

좀 더 쉽게 풀어보자면, 모든 인스턴스는 객체이지만, 우리가 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었음을
강조하고 싶을때이다. 예를 들어 student1 은 객체이지만, 이 객체가 Student 클래스로부터 생성된다는 점을 명확히 하기 위해
student1은 Student의 인스턴스라고 부른다.
 */