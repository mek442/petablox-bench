package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class TUshr extends Token
{
    public TUshr()
    {
        super.setText(">>>");
    }

    public TUshr(int line, int pos)
    {
        super.setText(">>>");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TUshr(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUshr(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TUshr text.");
    }
}
