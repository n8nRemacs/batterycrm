package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zgc extends dtf implements sm6 {
    public final /* synthetic */ fhc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgc(fhc fhcVar, Continuation continuation) {
        super(2, continuation);
        this.X = fhcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zgc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zgc(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            b95 b95Var = this.X.b;
            this.o = 1;
            qqg qqgVarI = b95Var.i();
            g84 g84Var = g84.a;
            if (qqgVarI == g84Var) {
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
