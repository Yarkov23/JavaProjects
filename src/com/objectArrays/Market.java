package com.objectArrays;

import java.util.ArrayList;
import java.util.List;

public class Market {

    private List<Salesman> salesmanList;

    public List<Salesman> getSalesmanList() {
        return salesmanList;
    }

    public void setSalesmanList(List<Salesman> salesmanList) {
        this.salesmanList = salesmanList;
    }

    public void addSalesman(Salesman salesman){             // Add salesman to market list.
        if (salesmanList == null){
            salesmanList = new ArrayList<>();
        }
        salesmanList.add(salesman);
    }

    public void removeSalesman(Salesman salesman){          // Remove salesman from market list.
        salesmanList.remove(salesman);
    }

    public void displaySalesman(){                          // Display salesman list.
        for (int i = 0; i < salesmanList.size(); i++) {
            salesmanList.get(i);
        }
    }


    @Override
    public String toString() {
        return "Market{" +
                "salesmanList=" + salesmanList +
                '}';
    }
}
