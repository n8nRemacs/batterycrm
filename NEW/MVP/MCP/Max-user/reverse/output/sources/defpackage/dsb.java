package defpackage;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dsb extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ esb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsb(boolean z, esb esbVar, Continuation continuation) {
        super(2, continuation);
        this.X = z;
        this.Y = esbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dsb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dsb(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        esb esbVar = this.Y;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            if (this.X) {
                esbVar.getClass();
                long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                pe8 pe8Var = (pe8) esbVar.b;
                pe8Var.N0.O(pe8Var, pe8.U0[27], Long.valueOf(epochMilli));
            }
            long jLongValue = ((Number) ((gu5) esbVar.a).p.f()).longValue() * 1000;
            this.o = 1;
            if (s8j.c(jLongValue, this) != g84Var) {
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
        pv0 pv0Var = esbVar.d;
        this.o = 2;
        return pv0Var.h(qqgVar, this) == g84Var ? g84Var : qqgVar;
    }
}
