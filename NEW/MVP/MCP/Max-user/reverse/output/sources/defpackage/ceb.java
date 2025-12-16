package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ceb extends q44 {
    public final /* synthetic */ ieb X;
    public int Y;
    public Iterator d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceb(ieb iebVar, q44 q44Var) {
        super(q44Var);
        this.X = iebVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, null, this);
    }
}
