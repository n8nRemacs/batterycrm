package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ut2 extends q44 {
    public final /* synthetic */ bu2 X;
    public int Y;
    public AtomicLong d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(bu2 bu2Var, q44 q44Var) {
        super(q44Var);
        this.X = bu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(null, null, this);
    }
}
