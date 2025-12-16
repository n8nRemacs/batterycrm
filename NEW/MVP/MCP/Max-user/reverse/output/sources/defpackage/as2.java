package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class as2 extends dtf implements sm6 {
    public hwa X;
    public int Y;
    public final /* synthetic */ cs2 Z;
    public cs2 o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as2(cs2 cs2Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = cs2Var;
        this.s0 = str;
        this.t0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((as2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new as2(this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hwa hwaVar;
        cs2 cs2Var;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            cs2 cs2Var2 = this.Z;
            hwaVar = cs2Var2.b;
            this.o = cs2Var2;
            this.X = hwaVar;
            this.Y = 1;
            Object objP = gw0.p(cs2Var2.a, this);
            g84 g84Var = g84.a;
            if (objP == g84Var) {
                return g84Var;
            }
            cs2Var = cs2Var2;
            obj = objP;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hwaVar = this.X;
            cs2Var = this.o;
            g8j.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        cs2Var.i = hwa.q(hwaVar, new l5a(this.s0, hwaVar.t().a.k(), jLongValue, this.t0));
        return qqg.a;
    }
}
