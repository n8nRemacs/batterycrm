package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p42 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ to1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p42(to1 to1Var, Continuation continuation) {
        super(continuation);
        this.o = to1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
