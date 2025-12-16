package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kbf extends dtf implements sm6 {
    public final /* synthetic */ nbf X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbf(nbf nbfVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = nbfVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kbf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kbf(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        nbf nbfVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            w63 w63Var = (w63) nbfVar.X.getValue();
            this.o = 1;
            obj = w63Var.p(this.Y, this);
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
        if (pb2Var != null) {
            xfh.r(nbfVar.z0, uaf.c.L0(pb2Var.a));
        }
        return qqg.a;
    }
}
