package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qke extends dtf implements sm6 {
    public final /* synthetic */ l4e X;
    public final /* synthetic */ klc Y;
    public final /* synthetic */ k18 Z;
    public int o;
    public final /* synthetic */ ele s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qke(l4e l4eVar, klc klcVar, k18 k18Var, ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = l4eVar;
        this.Y = klcVar;
        this.Z = k18Var;
        this.s0 = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qke) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qke(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            qg0 qg0Var = new qg0(new m36(new pke(this.Z, null), ((w4e) ((pb3) this.X.a.getValue())).t()), 1);
            this.o = 1;
            obj = gw0.p(qg0Var, this);
            if (obj != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        long jLongValue = ((Number) obj).longValue();
        klc klcVar = this.Y;
        f9a f9aVar = (f9a) klcVar.f.computeIfAbsent(Long.valueOf(jLongValue), new ni(26, new k03(klcVar, jLongValue, 2)));
        tw twVar = new tw(11, this.s0);
        this.o = 2;
        Object objD = f9aVar.d(new a53(twVar, 19), this);
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
