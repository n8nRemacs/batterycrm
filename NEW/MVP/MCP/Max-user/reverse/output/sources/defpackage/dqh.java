package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dqh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eqh Y;
    public final /* synthetic */ uph Z;
    public int o;
    public final /* synthetic */ hqh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqh(eqh eqhVar, uph uphVar, hqh hqhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = eqhVar;
        this.Z = uphVar;
        this.s0 = hqhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dqh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dqh dqhVar = new dqh(this.Y, this.Z, this.s0, continuation);
        dqhVar.X = obj;
        return dqhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            eqh eqhVar = this.Y;
            aw7 aw7VarE = eqh.e(eqhVar, th);
            xh3 xh3Var = (xh3) eqhVar.c.getValue();
            pv0 pv0Var = eqhVar.e;
            String str = this.s0.a;
            this.o = 1;
            Object objA = xh3Var.a(pv0Var, aw7VarE, this.Z, str, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
