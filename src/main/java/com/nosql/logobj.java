package com.nosql;

import java.sql.Timestamp;

public class logobj {
    public String op,sid,cid,grade;
    public Timestamp ts;
    // int postgres,mongo,hive;
    public logobj(String op,String sid,String cid,String grade,Timestamp ts){
        this.op=op;
        this.sid=sid;
        this.cid=cid;
        this.grade=grade;
        this.ts=ts;
        // this.postgres=postgres;
        // this.mongo=mongo;
        // this.hive=hive;
    }
}
