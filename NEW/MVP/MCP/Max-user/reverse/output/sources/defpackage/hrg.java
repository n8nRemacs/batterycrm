package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hrg extends dtf implements sm6 {
    public final /* synthetic */ nrg X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrg(nrg nrgVar, Continuation continuation) {
        super(2, continuation);
        this.X = nrgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hrg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hrg(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            int i2 = s65.d;
            long jH = v9j.h(10, y65.SECONDS);
            this.o = 1;
            Object objD = s8j.d(jH, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        nrg nrgVar = this.X;
        nrgVar.t().j(wx1.HIDE, nrgVar.b);
        xfh.r(nrgVar.z0, drg.a);
        return qqg.a;
    }
}
