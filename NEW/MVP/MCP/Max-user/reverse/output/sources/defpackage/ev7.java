package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ev7 extends dtf implements sm6 {
    public final /* synthetic */ iv7 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev7(iv7 iv7Var, Continuation continuation) {
        super(2, continuation);
        this.X = iv7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ev7 ev7Var = (ev7) l((sj0) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ev7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ev7 ev7Var = new ev7(this.X, continuation);
        ev7Var.o = obj;
        return ev7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ci5 ci5Var = this.X.o;
        g8j.b(obj);
        sj0 sj0Var = (sj0) this.o;
        if (sj0Var instanceof wh2) {
            xfh.r(ci5Var, new cv7(Long.valueOf(((wh2) sj0Var).c)));
        } else if (sj0Var instanceof ai2) {
            xfh.r(ci5Var, bpd.b);
        }
        return qqg.a;
    }
}
