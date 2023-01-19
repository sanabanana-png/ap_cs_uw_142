public class SpaceNeedle {
   public static final int SIZE = 2;
   public static void main(String[] args) {
      
      neckAndStick();
      feetAndTopOfTop();
      headBottom();
      neckAndStick();
      body();
      feetAndTopOfTop();
      
   } 
   public static void feetAndTopOfTop() {
      for (int line = 1; line <= SIZE; line++) {
         for (int spaces = 1; spaces <= (-3*line +(SIZE*3)); spaces++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int dd = 1; dd <= (3* line -3); dd++) {
            System.out.print(":");
         }
         for (int MiddleLine = 1; MiddleLine <= 1; MiddleLine++) {
            System.out.print("||");
         }
         for (int dd = 1; dd <= (3* line -3); dd++) {
            System.out.print(":");
         }
         System.out.print("\\__");
         System.out.println();   
      }
      System.out.print("|");
      for (int q = 1; q <= SIZE*6; q++) {
            System.out.print("\"");
      }
      System.out.print("|");
      System.out.println();
      /*
      for (line will equal 1; if line is equal to or bigger than 4, code stops; line will get bigger by one) {
         for (spaces will equal 1; if spaces is equal to or bigger than (-3*line + 11), code stops; spaces will get bigger by one) {
            print space
         }
         print __/
         for (dd will equal 1; if dd is equal to or bigger than (3*line - 3), code stops; dd will get bigger by one {
            print :
         }
         for (MiddleLine will equal 1; if MiddleLine is equal to or bigger than line, code stops; MiddleLine will get bigger by one) {
            print ||
         }
         for (dd will equal 1; if dd is equal to or bigger than (3*line - 3), code stops; dd will get bigger by one {
            print :
         }
         print \__ 
      }
      */    
    }
    
   public static void headBottom() {
      for (int line = 1; line <= SIZE; line++) {
         
         for (int spaces = 1; spaces <= (2*line - 2); spaces++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int tri = 1; tri <= (-2*line +(3*SIZE + 1)); tri++) {
            System.out.print("/\\");
         }
         System.out.print("_/");
         System.out.println();
      }
      /*
      for (line will equal 1; if line is equal to or bigger than 4, code stops; line will get bigger by one) {
         print \__
         for (spaces will equal 1; if spaces is bigger than or equal to (2*line -2), code stops; spaces will get bigger by one) {
            print space
         }
         for (tri will equal 1; if tri is equal or bigger than (-2*line +13), code stops; tri will get bigger by one) {
            print /\
         }
         print __/
         */ 
   }
   
   public static void neckAndStick() {
      for (int line = 1; line <= SIZE; line++) {
         for (int spaces = 1; spaces <= SIZE*3; spaces++) {
            System.out.print(" ");
         }
         System.out.print("||");
         System.out.println();
      }
      /*
      for (line will equal 1; if line is equal to or bigger to 4, code stops; line will get bigger than one) {
         for (spaces will equal 1; if spaces are bigger or equal to 12, code stops; spaces will get bigger by one) {
            print space
         }
         print ||
      }
      */
   
   }
   public static void body() {
      for (int line = 1; line <= (SIZE*SIZE); line++) {
         for (int spaces = 1; spaces <= ((SIZE*2) +1); spaces++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for (int par = 1; par <= (SIZE-2); par++) {
            System.out.print("%");
         }
         System.out.print("||");
         for (int par = 1; par <= (SIZE-2); par++) {
            System.out.print("%");
         }
         System.out.print("|");
         System.out.println();
      }
     /*
      for (line will equal 1; if line is equal to or bigger than 16, code stops; line will get bigger by one) {
         for (spaces will equal 1; if spaces are bigger or equal to 9, code stops; spaces will get bigger by one) {
            print space
         }
         print |
         for (par will equal 1; if par is bigger or equal to line, code stops; par will get bigger by two) {
            print %
         }
         print ||
         for (par will equal 1; if par is bigger or equal to line, code stops; par will get bigger by one) {
            print %%
         }
         print |
      }
      */ 
   
   } 
}
