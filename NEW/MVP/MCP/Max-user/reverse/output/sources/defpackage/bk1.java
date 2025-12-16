package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bk1 extends dtf implements sm6 {
    public final /* synthetic */ dk1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk1(dk1 dk1Var, Continuation continuation) {
        super(2, continuation);
        this.X = dk1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bk1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bk1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        String strS;
        int i = this.o;
        dk1 dk1Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            hbd hbdVar = dk1Var.o;
            this.o = 1;
            obj = gw0.q(hbdVar, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        pb2 pb2Var = (pb2) obj;
        tcf tcfVar = dk1Var.d;
        do {
            value = tcfVar.getValue();
            tj1 tj1Var = (tj1) value;
            strS = pb2Var != null ? pb2Var.s() : null;
            tj1Var.getClass();
        } while (!tcfVar.c(value, new tj1(strS)));
        dk1Var.u(pb2Var != null ? pb2Var.s() : null);
        return qqg.a;
    }
}
