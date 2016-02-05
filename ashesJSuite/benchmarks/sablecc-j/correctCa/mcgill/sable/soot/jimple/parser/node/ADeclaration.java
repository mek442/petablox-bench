package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ADeclaration extends PDeclaration
{
    private PJimpleType _jimpleType_;
    private PLocalNameList _localNameList_;
    private TSemicolon _semicolon_;

    public ADeclaration()
    {
    }

    public ADeclaration(
        PJimpleType _jimpleType_,
        PLocalNameList _localNameList_,
        TSemicolon _semicolon_)
    {
        setJimpleType(_jimpleType_);

        setLocalNameList(_localNameList_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ADeclaration(
            (PJimpleType) cloneNode(_jimpleType_),
            (PLocalNameList) cloneNode(_localNameList_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaration(this);
    }

    public PJimpleType getJimpleType()
    {
        return _jimpleType_;
    }

    public void setJimpleType(PJimpleType node)
    {
        if(_jimpleType_ != null)
        {
            _jimpleType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _jimpleType_ = node;
    }

    public PLocalNameList getLocalNameList()
    {
        return _localNameList_;
    }

    public void setLocalNameList(PLocalNameList node)
    {
        if(_localNameList_ != null)
        {
            _localNameList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _localNameList_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_jimpleType_)
            + toString(_localNameList_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_jimpleType_ == child)
        {
            _jimpleType_ = null;
            return;
        }

        if(_localNameList_ == child)
        {
            _localNameList_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_jimpleType_ == oldChild)
        {
            setJimpleType((PJimpleType) newChild);
            return;
        }

        if(_localNameList_ == oldChild)
        {
            setLocalNameList((PLocalNameList) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}