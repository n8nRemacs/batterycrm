package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jnc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jnc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jnc(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        pnc pncVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            yac yacVar = pncVar.T0;
            this.o = 1;
            obj = yacVar.n(this);
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
            xfh.r(pncVar.F0, new vkc(pb2Var.a, pdc.b));
        }
        return qqg.a;
    }
}
