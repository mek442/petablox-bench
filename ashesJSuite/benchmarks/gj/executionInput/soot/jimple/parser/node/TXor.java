/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

public final class TXor extends Token
{
    public TXor()
    {
        super.setText("^");
    }

    public TXor(int line, int pos)
    {
        super.setText("^");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TXor(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXor(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TXor text.");
    }
}