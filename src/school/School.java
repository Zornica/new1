package school;

/**
 * Created by Zornitsa Petkova on 4/21/15.
 */
public class School {
  private int number;
  private String speciality;
  private double mark;
  private String name;

  public School(String name,int number, String speciality, double mark) {
    this.name = name;
    this.number = number;
    this.speciality = speciality;
    this.mark = mark;
  }
}
