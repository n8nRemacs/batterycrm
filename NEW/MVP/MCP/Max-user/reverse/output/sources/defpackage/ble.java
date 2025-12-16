package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ble extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ble(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ble) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ble(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        ele eleVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            w63 w63Var = (w63) eleVar.u0.getValue();
            this.o = 1;
            Comparable comparableF = w63Var.f(this);
            g84 g84Var = g84.a;
            if (comparableF == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ci5 ci5Var = eleVar.B0;
        bpe.c.getClass();
        xfh.r(ci5Var, new ei4(":saved-messages"));
        return qqg.a;
    }
}
