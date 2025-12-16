package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bs2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cs2 Y;
    public hwa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(cs2 cs2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cs2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bs2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bs2(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hwa hwaVar;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            cs2 cs2Var = this.Y;
            hwaVar = cs2Var.b;
            this.o = hwaVar;
            this.X = 1;
            obj = gw0.p(cs2Var.a, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hwaVar = this.o;
            g8j.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        hwaVar.getClass();
        hwa.q(hwaVar, new n5a(hwaVar.t().a.k(), jLongValue));
        return qqg.a;
    }
}
