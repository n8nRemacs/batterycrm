package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uq2 extends q44 {
    public final /* synthetic */ sq2 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(sq2 sq2Var, Continuation continuation) {
        super(continuation);
        this.X = sq2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
