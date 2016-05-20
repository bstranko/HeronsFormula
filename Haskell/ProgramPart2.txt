
import System.IO
import Text.Printf

isTriangle a b c = if(a + b) > c then True else False  

areaTriangleHeron a b c = result           -- use Heron's formula
    where
    result = sqrt (s * (s - a) * (s - b) * (s - c))
    s      = (a + b + c) / 2

getTriangles 0 = do putStrLn "No more triangles left."
getTriangles x = do
  putStr "What is the length of the first side: "
  sideOne <- getLine 
  let a = read sideOne :: Double
  putStr "What is the length of the second side: "
  sideTwo <- getLine
  let b = read sideTwo :: Double
  putStr "What is the length of the third side: "
  sideThree <- getLine 
  let c = read sideThree :: Double
  let triArea = areaTriangleHeron a b c 
  if isTriangle a b c
  then putStr ("The area of your triangle is ") 
  else putStr "That is not a triangle."
  if isTriangle a b c  
  then putStrLn . printf "%.2f" $ triArea
  else putStrLn " "
  putStrLn " "
  getTriangles (x-1)

main = do 
putStr "How many triangles do you want to test: " 
userInput <- getLine 
let runs = read userInput :: Int   
putStrLn " "
getTriangles runs