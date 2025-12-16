package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t63 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ w63 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t63(w63 w63Var, Continuation continuation) {
        super(continuation);
        this.o = w63Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.p(0L, this);
    }
}
