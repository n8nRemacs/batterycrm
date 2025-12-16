package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u46 extends q44 {
    public final /* synthetic */ m36 X;
    public m36 Y;
    public z26 Z;
    public /* synthetic */ Object d;
    public int o;
    public Throwable s0;
    public long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u46(m36 m36Var, Continuation continuation) {
        super(continuation);
        this.X = m36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
