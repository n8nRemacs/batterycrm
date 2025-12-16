package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fi0 extends dtf implements sm6 {
    public final /* synthetic */ th0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(th0 th0Var, Continuation continuation) {
        super(2, continuation);
        this.o = th0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fi0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fi0(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(!((Boolean) this.o.c().invoke()).booleanValue());
    }
}
