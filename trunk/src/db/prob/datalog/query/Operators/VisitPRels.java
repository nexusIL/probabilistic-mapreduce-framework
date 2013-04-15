package db.prob.datalog.query.Operators;

import db.prob.datalog.query.Absyn.LiteralTerms;
import db.prob.datalog.query.Absyn.PredicateSym;
import db.prob.datalog.query.Absyn.Query;
import db.prob.datalog.query.Components.ProbabilityRelation;
import db.prob.datalog.query.VisitSkel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arye
 * Date: 3/23/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class VisitPRels extends VisitBody {
    public List<PredicateSym> rels_list = new LinkedList<PredicateSym>();

    public void visit(ProbabilityRelation pr) {
        rels_list.add(pr.predicatesym_);
    }
}
