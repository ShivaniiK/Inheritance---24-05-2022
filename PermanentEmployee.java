package com;                 //HierarchicalInheritance

class PermanentEmployee extends HierarchicalInheritance
{
   double hike = 0.9;
   public void increment()
{
   salary = salary+(salary*hike);
}
}