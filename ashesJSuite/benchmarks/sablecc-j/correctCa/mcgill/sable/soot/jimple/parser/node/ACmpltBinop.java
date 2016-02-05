package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ACmpltBinop extends PBinop
{
    private TCmplt _cmplt_;

    public ACmpltBinop()
    {
    }

    public ACmpltBinop(
        TCmplt _cmplt_)
    {
        setCmplt(_cmplt_);

    }
    public Object clone()
    {
        return new ACmpltBinop(
            (TCmplt) cloneNode(_cmplt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpltBinop(this);
    }

    public TCmplt getCmplt()
    {
        return _cmplt_;
    }

    public void setCmplt(TCmplt node)
    {
        if(_cmplt_ != null)
        {
            _cmplt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmplt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_cmplt_);
    }

    void removeChild(Node child)
    {
        if(_cmplt_ == child)
        {
            _cmplt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_cmplt_ == oldChild)
        {
            setCmplt((TCmplt) newChild);
            return;
        }

    }
}