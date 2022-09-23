public class U2L2Runner {
    public static void main(String[] args) {
        // Define Instances
        Rectangle rectCustom = new Rectangle(150, 200);
        Rectangle square = new Rectangle(100);
        Rectangle rectDefault = new Rectangle();

        // Setting New Width
        rectCustom.setWidth(125);
        square.setWidth(125);
        square.setLength(125);
        rectDefault.setWidth(125);

        // Initializing Perimeter Variables
        int rectCustomPerimeter;
        int squarePerimeter;
        int rectDefaultPerimeter;
        int perimeterSum;

        // Perimeter Calculation
        rectCustomPerimeter = 2 * (rectCustom.getLength() + rectCustom.getWidth());
        squarePerimeter = 2 * (square.getLength() + square.getWidth());
        rectDefaultPerimeter = 2 * (rectDefault.getLength() + rectDefault.getWidth());
        perimeterSum = rectCustomPerimeter + squarePerimeter + rectDefaultPerimeter;

        // Area Calculation
        int totalArea;
        totalArea = rectCustom.calculateArea() + square.calculateArea() + rectDefault.calculateArea();

        // Print
        System.out.println("The total length in fencing needed to enclose all three plots of land is " + perimeterSum + " feet.");
        System.out.println("The total area that will need seeding is " + totalArea + " square feet.");
    }
}
