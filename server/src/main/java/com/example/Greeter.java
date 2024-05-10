package com.example;

import com.kbtg.hello-java.Greeter;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    // String abc = ""+com.kbtg.constant.GithubConstant.SAMPLE_GITHUB_NAME;
  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello How are you, %s!", someone);
  }
}
