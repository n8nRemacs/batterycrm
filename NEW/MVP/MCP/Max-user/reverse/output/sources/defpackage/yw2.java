package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yw2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ku3 ku3VarN;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        zx2 zx2Var = this.X;
        pb2 pb2Var = (pb2) zx2Var.a1.a.getValue();
        if (pb2Var != null && (ku3VarN = pb2Var.n()) != null) {
            long jP = ku3VarN.p();
            w04 w04Var = (w04) zx2Var.D0.getValue();
            this.o = 1;
            w04Var.a(jP);
            g84 g84Var = g84.a;
            if (qqgVar == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
