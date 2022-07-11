using System;

namespace ConsoleApplication
{
    /*
    The client has a blog and they want to show their featured blog posts on a web page. The posts should appear in the following pattern:

    ---------
    | R | B |
    ---------
    |   W   |
    ---------
    | R | B |
    ---------
    |   W   |
    ---------

    Where "R" is a red background, "B" is a blue background, and "W" is a white background. Also, the white background spans
    the entire width (2 column), but the red and blue only span 50% each.

    The design must be symmetrical and the white box can appear first only if necessary to make it symmetrical.

    The function must work for any number of blog posts.  Example outputs include:

    1 Post:

    ---------
    |   W   |
    ---------

    3 Posts:

    ---------
    | R | B |
    ---------
    |   W   |
    ---------

    4 Posts:

    ---------
    |   W   |
    ---------
    | R | B |
    ---------
    |   W   |
    ---------

     */

    public class BlogBoxApp
    {
        public void Run()
        {
            // Test with 1-7 blog posts
            for(int i = 1; i < 8; i++)
                BlogBoxes(i);
        }

        private void BlogBoxes(int count) {

            // Put the letters "R", "B", and "W" into this array in the order they will appear on the page
            string[] myBoxes = new string[count];



            // Write your code here


            // output boxes as ASCII art
            PrintBoxes(myBoxes);
        }

        private void PrintBoxes(string[] boxes) {
            Console.WriteLine();
            Console.WriteLine("-------------");
            foreach(string box in boxes)
            {
                if (box == "W")
                {
                    Console.WriteLine("|     W     |");
                    Console.WriteLine("-------------");
                }
                else if (box == "R") {
                    Console.Write($"|  R  |");
                }
                else if (box == "B") {
                    Console.WriteLine($"  B  |");
                    Console.WriteLine("-------------");
                }
            }
            Console.WriteLine();
            Console.WriteLine();
        }
    }
}