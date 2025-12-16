package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lrg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nrg Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(nrg nrgVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nrgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lrg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lrg lrgVar = new lrg(this.Y, continuation);
        lrgVar.X = obj;
        return lrgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        nrg nrgVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            mj3 mj3Var = (mj3) nrgVar.t0.getValue();
            this.X = f84Var;
            this.o = 1;
            mj3Var.getClass();
            dsd dsdVarC = dsd.c(1, "SELECT * FROM complain_reasons WHERE type_id = ?");
            obj = k7j.a(mj3Var.a, xrf.m(dsdVarC, 1, (byte) 8), new ci(mj3Var, 5, dsdVarC), this);
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
        nj3 nj3Var = (nj3) obj;
        if (nj3Var != null) {
            return nj3Var.c;
        }
        pj3 pj3Var = (pj3) nrgVar.u0.getValue();
        svi.e(pj3Var.e, null, null, new oj3(pj3Var, null), 3);
        return hd5.a;
    }
}
