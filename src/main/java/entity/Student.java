package entity;

public class Student {

    //required parameters
    private String id;
    private String name;
    private String classname;
    private int age;
    private String gender;

    //optional parameters
    private String address;
    private String farther_name;
    private String mother_name;
    private String nationality;
    private String religion;

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.classname = builder.classname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.farther_name = builder.farther_name;
        this.mother_name = builder.mother_name;
        this.nationality = builder.nationality;
        this.religion = builder.religion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassname() {
        return classname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getFarther_name() {
        return farther_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", farther_name='" + farther_name + '\'' +
                ", mother_name='" + mother_name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }


    public static class StudentBuilder{
        //required parameters
        private String id;
        private String name;
        private String classname;
        private int age;
        private String gender;

        //optional parameters
        private String address;
        private String farther_name;
        private String mother_name;
        private String nationality;
        private String religion;


        public StudentBuilder(String id, String name, String classname, int age, String gender) {
            this.id = id;
            this.name = name;
            this.classname = classname;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFarther_name(String farther_name) {
            this.farther_name = farther_name;
            return this;
        }

        public StudentBuilder setMother_name(String mother_name) {
            this.mother_name = mother_name;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
