package com.nosql;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            // PostgreSQL psql = new PostgreSQL();
            // psql.set("SID1033", "CSE016","B");
            // ArrayList<String>res = psql.get("SID1033", "CSE016");
            // MongoDB mdb = new MongoDB();
            // mdb.set("SID1033", "CSE016","C");
            // ArrayList<String>res1 = mdb.get("SID1033", "CSE016");
            // // System.out.println(res1.size());
            // System.out.println("PostgreSQL:");
            // for(String it:res)
            // {
            //     System.out.print(it+" ");
            // }
            // System.out.println();
            // System.out.println("MongoDB:");
            // for(String it:res1)
            // {
            //     System.out.print(it+" ");
            // }
            // System.out.println();
            // psql.merge("mongo");
            Hive hive = new Hive();
            hive.set("SID1033", "CSE016","B");
            ArrayList<String>res = hive.get("SID1033", "CSE016");
            for(String it:res)
            {
                System.out.print(it+" ");
            }
            System.out.println();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}