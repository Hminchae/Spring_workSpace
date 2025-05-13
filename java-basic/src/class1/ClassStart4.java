package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 메모리에 빈 학생 로드, 객체(인스턴스) 생성
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 18;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        }
}

// ⭐️ 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.

// student1, student2 에는 참조값이 보관되어 있다. 따라서 이 참조값이 배열에 저장된다.
// 또는, student1, student2 에 보관된 참조값을 읽어서 배열에 대입한다고 표현한다.


// 🚨 주의 🚨! 변수에는 인스턴스 자체가 들어있는것이 아니다.. 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다. 따라서 대입(=)시에 인스턴스가
// 복사 되는 것이 아니라 참조값만 복사된다.