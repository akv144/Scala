In a cricket tournament, based on the outcome of a particular match a team gets following points:

wins gets 3 points
draws gets 1 points
losses gets 0 points
Team Aravali plays 8 matches in this tournament. It wins 4 matches, loses 3 matches and draws 1. What is the total number of points gained by the Team Aravali?

// COMMAND ----------

var wins=4
var loses=3
var draw=1
var totalpoint=wins*3+draw*1+loses*0
println(totalpoint)


Problem 2
Root of a function  f(x)  is defined as the value  x  where  f(x)=0 
Consider a quadratic function  f(x)=x2+3x−4 
Find the value of the function  f(x)  at points  x=2,x=−1,x=1 .

// COMMAND ----------

var x=2
var y=(-1)
var z=1
var f = scala.math.pow(x,2)+3*x-4
f==0
var f1 = scala.math.pow(y,2)+3*y-4
f1==0
var f2 = scala.math.pow(z,2)+3*z-4
f2==0



Problem 3
A bag contains 45 apples, 65 oranges and 30 bananas. Find the percentage of each type of food items in the bag.
// COMMAND ----------

var apple=45;
var oranges=65;
var bananas=30;
var total=apple+oranges+bananas
var fa=(apple*100)/total
var fo=(oranges*100)/total
var fb=(bananas*100)/total
var f=(bananas.toFloat/total)*100




Problem 4
You were playing a fun guessing game during your school break. There were a total of 100 participants excluding you. Out of these 100 people, 30 were Maths Majors, 45 were Economics Majors and 25 were Physics Majors.
The game was divided into three rounds.
In the first round, you had to guess the number of Maths Majors and you correctly guessed 20 of them.
In the second round, you had to guess the number of Economics Majors and you correctly guessed 30 of them.
In the final third round, you had to guess the number of Physics Majors and you correctly guessed 20 of them.
Accuracy is defined as the number of correct guesses upon total number of people in the group (expressed in percentage)

// COMMAND ----------

var total=100
var m=30
var e=45
var p=25
var mc=20
var ec=30
var pc=20

var macc=(mc.toFloat/m)*100
var eacc=(ec.toFloat/e)*100
var pacc=(pc.toFloat/p)*100
var total= ((mc+ec+pc).toFloat)/(m+e+p)*100

