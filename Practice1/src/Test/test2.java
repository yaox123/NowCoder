package Test;

/**
 * @BelongsProject: Practice
 * @BelongsPackage: Test
 * @Author: yaox
 * @CreateTime: 2018-10-24 22:14
 */
class C {
    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}

class test2 extends A {
    test2() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        new test2();
    }
}
