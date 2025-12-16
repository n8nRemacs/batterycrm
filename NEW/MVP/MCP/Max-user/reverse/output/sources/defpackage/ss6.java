package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ss6 extends dtf implements sm6 {
    public final /* synthetic */ Long X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss6(Object obj, Continuation continuation, Long l) {
        super(2, continuation);
        this.o = obj;
        this.X = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ss6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ss6(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        si9 si9Var = ((eh9) this.o).a;
        return new uge(new tge(si9Var.Z, si9Var.a, this.X.longValue()));
    }
}
