package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f46 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ g36 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f46(g36 g36Var, Continuation continuation) {
        super(continuation);
        this.o = g36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
