package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ved extends dtf implements sm6 {
    public final /* synthetic */ zed X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved(zed zedVar, Continuation continuation) {
        super(2, continuation);
        this.X = zedVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ved) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ved(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (!(this.X.w0.getValue() instanceof ped)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.X.A().b(new Long(jCurrentTimeMillis));
                zed zedVar = this.X;
                this.o = 1;
                obj = zed.u(zedVar, jCurrentTimeMillis, this);
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            zed zedVar2 = this.X;
            zedVar2.D(null, zedVar2.w0.getValue() != null);
            return qqgVar;
        }
        zed zedVar3 = this.X;
        xfh.r(zedVar3.c.c, new aed(zedVar3.b, true));
        zed zedVar4 = this.X;
        String str = zedVar4.H0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.i("Recoding of ", zedVar4.b.name(), " started successfully "), null);
            }
        }
        return qqgVar;
    }
}
