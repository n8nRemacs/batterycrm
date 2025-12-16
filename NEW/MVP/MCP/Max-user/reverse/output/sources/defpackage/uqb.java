package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uqb extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yqb Z;
    public long o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqb(yqb yqbVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = yqbVar;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uqb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uqb uqbVar = new uqb(this.Z, this.s0, continuation);
        uqbVar.Y = obj;
        return uqbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        long j;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            yqb yqbVar = this.Z;
            c9a c9aVar = (c9a) yqbVar.e.f(new ceg(this.s0));
            if (c9aVar == null) {
                c9aVar = fzd.b;
            }
            long jK = yqbVar.k(c9aVar);
            this.Y = f84Var2;
            this.o = jK;
            this.X = 1;
            if (s8j.d(jK, this) == g84Var) {
                return g84Var;
            }
            f84Var = f84Var2;
            j = jK;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.o;
            f84Var = (f84) this.Y;
            g8j.b(obj);
        }
        if (!d7j.f(f84Var)) {
            return qqgVar;
        }
        yqb yqbVar2 = this.Z;
        String str = this.s0;
        String str2 = yqbVar2.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                String strG = yqbVar2.g();
                String strI = ho7.i("is idle for ", s65.n(j), "! Failing it");
                StringBuilder sbL = wy1.l("Metric(", strG, "-", str, "): ");
                sbL.append((Object) strI);
                l6bVar.c(lg8Var, str2, sbL.toString(), null);
            }
        }
        yqb.e(this.Z, tqb.TIMEOUT, this.s0);
        return qqgVar;
    }
}
