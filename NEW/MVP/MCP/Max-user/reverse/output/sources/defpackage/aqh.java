package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aqh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eqh Y;
    public final /* synthetic */ hqh Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqh(eqh eqhVar, hqh hqhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = eqhVar;
        this.Z = hqhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aqh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aqh aqhVar = new aqh(this.Y, this.Z, continuation);
        aqhVar.X = obj;
        return aqhVar;
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
            String str = this.Z.a;
            this.o = 1;
            Object objA = xh3Var.a(pv0Var, aw7VarE, uph.a, str, this);
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
