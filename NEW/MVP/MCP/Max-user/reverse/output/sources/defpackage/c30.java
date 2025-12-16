package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c30 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ e30 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(e30 e30Var, long j, Continuation continuation) {
        super(2, continuation);
        this.o = e30Var;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c30) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c30(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return ((qi9) this.o.f.getValue()).m(this.X);
    }
}
