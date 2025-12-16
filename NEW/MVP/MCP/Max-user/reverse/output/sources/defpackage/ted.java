package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ted extends dtf implements sm6 {
    public final /* synthetic */ zed X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ted(zed zedVar, Continuation continuation) {
        super(2, continuation);
        this.X = zedVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ted) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ted(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objC = s8j.c(200L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        zed zedVar = this.X;
        xfh.r(zedVar.c.c, ydd.a);
        zedVar.G0.O(zedVar, zed.I0[1], svi.d(zedVar.a, ((q2b) ((lzf) zedVar.X.getValue())).c(), i84.b, new ved(zedVar, null)));
        return qqg.a;
    }
}
