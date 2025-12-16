package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mse extends dtf implements sm6 {
    public final /* synthetic */ nse X;
    public final /* synthetic */ int Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mse(nse nseVar, int i, Continuation continuation) {
        super(2, continuation);
        this.X = nseVar;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mse) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mse(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = nse.x0;
            nse nseVar = this.X;
            ((sxg) nseVar.d.getValue()).g(this.Y, "app.media.caching.time");
            nseVar.Z.m(null, nseVar.v());
            this.o = 1;
            Object objU = nse.u(nseVar, this);
            g84 g84Var = g84.a;
            if (objU == g84Var) {
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
