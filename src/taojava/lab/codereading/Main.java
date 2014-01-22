package taojava.lab.codereading;

/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class Main 
{
  /**
   * Print some not-very-interesting output.
   */
  public static void 
    main (String[] args) 
    /* hello world*/
  {
    double n;
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
    for (int i = 1; i < 10; i++) 
      {
        n = i/10.0;
        pen.println (n + " squared is " + MathUtils.square (n));
      } // for
    pen.close ();
  } // main(String[])
} // class Main
