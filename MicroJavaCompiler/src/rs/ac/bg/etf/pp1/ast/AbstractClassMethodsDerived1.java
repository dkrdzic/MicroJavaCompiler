// generated with ast extension for cup
// version 0.8
// 12/0/2020 22:4:43


package rs.ac.bg.etf.pp1.ast;

public class AbstractClassMethodsDerived1 extends AbstractClassMethods {

    public AbstractClassMethodsDerived1 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AbstractClassMethodsDerived1(\n");

        buffer.append(tab);
        buffer.append(") [AbstractClassMethodsDerived1]");
        return buffer.toString();
    }
}
