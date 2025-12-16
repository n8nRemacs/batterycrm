package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ig2 extends q44 {
    public final /* synthetic */ qg2 X;
    public int Y;
    public AtomicLong d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig2(qg2 qg2Var, q44 q44Var) {
        super(q44Var);
        this.X = qg2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.h(null, null, this);
    }
}
