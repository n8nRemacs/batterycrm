package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class heb extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ieb Y;
    public int Z;
    public ieb d;
    public Iterator o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public heb(ieb iebVar, q44 q44Var) {
        super(q44Var);
        this.Y = iebVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.l(null, null, this);
    }
}
