package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rh1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rh1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rh1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ci1 ci1Var = this.X;
            tcf tcfVar = ((dob) ci1Var.d).z0;
            qh1 qh1Var = new qh1(ci1Var, null);
            this.o = 1;
            Object objH = gw0.h(tcfVar, qh1Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
