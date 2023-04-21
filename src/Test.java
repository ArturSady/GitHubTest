public class Test {
    int idNum;
    int num;
    String name;
    public Test(int idNum, int num, String name){
        this.idNum = idNum;
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "idNum=" + idNum +
                ", num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
