package progscala

class Car (val year:Int){
  private var milesDriven:Int = 100

  def miles() = milesDriven

  def drive(distance: Int){
    milesDriven += distance
  }

}
