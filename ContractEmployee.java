package com;            //HierarchicalInheritance

class ContractEmployee extends HierarchicalInheritance
{
    double hike = 0.5;
    public void salaryIncrement()
{
    salary = salary+(salary*hike);
}
}