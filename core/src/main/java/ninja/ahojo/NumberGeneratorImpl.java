package ninja.ahojo;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// We use component annotation here instead of @bean method in our app config
@Component
public class NumberGeneratorImpl implements NumberGenerator {

  // -- fields --
  private final Random random = new Random();
  // THESE ARE GOING TO BE TAKEN CARE OF BY THE CONSTRUCTOR
//  @Autowired
//  @MaxNumber
//  private int maxNumber;
//
//  @Autowired
//  @MinNumber
//  private int minNumber;
  private final int minNumber;
  private final int maxNumber;

  // == Constructors

  @Autowired
  public NumberGeneratorImpl(@MinNumber int minNumber, @MaxNumber int maxNumber) {
    this.minNumber = minNumber;
    this.maxNumber = maxNumber;
  }

  // == public methods ==
  @Override
  public int next() {
    return random.nextInt(maxNumber - minNumber + 1) + minNumber;
  }

  @Override
  public int getMaxNumber() {
    return maxNumber;
  }

  @Override
  public int getMinNumber() {
    return minNumber;
  }
}
