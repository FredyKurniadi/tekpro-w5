/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the SalesRepresentative class file extends AbstractStoreEmployee.
 *
 * @author Fredy Kurniadi
 */

package store;

// import store.AbstractStoreEmployee;

public class SalesRepresentative extends AbstractStoreEmployee {
  private String productName;
  private double product;

  /**
   * This is an Argument constructor which Initializes all the Instance
   * Variables. bonusRate is initialized with 0. Also Calls a Super class
   * Constructor to initialize numberOfHoursWorked, hourlyRate, storeDetails,
   * basePay, name variables.
   *
   * @param productName         - The parameter name of product is
   *                            passed.
   * @param product             - The parameter total product sold is
   *                            passed.
   * @param numberOfHoursWorked - The parameter Number of Hours worked by the
   *                            Manager is passed.
   * @param hourlyRate          - The parameter Hourly rate for the Manager is
   *                            passed.
   * @param storeDetails        - The parameterDetails of the Store is passed.
   * @param basePay             - The parameter Base Pay Rate is passed.
   */

  SalesRepresentative(String productName, double product, double numberOfHoursWorked, double hourlyRate,
      String storeDetails, double basePay,
      String Name) {
    super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, Name);
    this.productName = productName;
    this.product = product;
  }

  /**
   * Returns the total Pay for a SalesRepresentative.
   *
   * @return- This method returns total pay for a manager.
   */

  @Override
  public double calculatePay() {
    if (product < 100.00) {
      return super.getNumberOfHoursWorked() * super.getHourlyRate() + 10.00 * super.getBasePay();
    } else {
      return super.getNumberOfHoursWorked() * super.getHourlyRate() + 20.00 * super.getBasePay();
    }
  }

  /**
   * Checks if the employee should be awarded with a promotion.
   *
   * @return - This method returns the eligibility status for promotion for an
   *         employee.
   */
  @Override
  public boolean checkPromotionEligibility() {
    if (calculatePay() > 70000.00) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Returns the name of products
   *
   * @param productName - The parameter name of products is
   *                    passed.
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Set name of products.
   *
   * @param productName - The parameter product Name is passed.
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Returns the total product sold
   *
   * @param product - The parameter total product sold is
   *                passed.
   */
  public double getProduct() {
    return product;
  }

  /**
   * Set the total product sold.
   *
   * @param product - The parameter product is passed.
   */
  public void setProduct(double product) {
    this.product = product;
  }

  /**
   * Returns the String representation of name of product and total product sold
   *
   * @return - This method returns a String representation of product name
   *         and product.
   */
  @Override
  public String toString() {
    return super.toString() + "Name of product : " + productName
        + "\nTotal products: " + product;
  }

  @Override
  public double calculateAllowance() {
    if (calculatePay() < 15000.00) {
      return calculatePay() / 100;
    } else {
      return 80.00;
    }
  }

  @Override
  public String Address() {
    return "jalan\nEmpoyee Name: " + super.getEmployeeName();
  }

  @Override
  public void Holiday() {
    System.out.println("You can take a vacation on Friday");
  }

}