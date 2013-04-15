package db.prob.datalog.query.Absyn; // Java Package generated by the BNF Converter.

import db.prob.datalog.query.Visitable;
import db.prob.datalog.query.Visitor;

public class Query  implements Visitable
{
  public Head head_;
  public Body body_;

  public Query(Head p1, Body p2) { head_ = p1; body_ = p2; }

  public void accept(Visitor v) { v.visit(this); }
}

