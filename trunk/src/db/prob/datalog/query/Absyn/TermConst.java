package db.prob.datalog.query.Absyn; // Java Package generated by the BNF Converter.

import db.prob.datalog.query.Visitable;
import db.prob.datalog.query.Visitor;

public class TermConst extends Term
{
  public Constant constant_;

  public TermConst(Constant p1) { constant_ = p1; }

  public void accept(Visitor v) { v.visit(this); }
}

