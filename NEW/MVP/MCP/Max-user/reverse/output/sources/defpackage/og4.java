package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class og4 {
    public static final /* synthetic */ int f = 0;
    public final n7 a;
    public final vy1 b;
    public final j0e c;
    public final lqc d;
    public v08 e;

    static {
        int i = s65.d;
        v9j.h(100, y65.MILLISECONDS);
    }

    public og4(n7 n7Var, vy1 vy1Var) {
        j0e j0eVarA = u0e.a();
        this.a = n7Var;
        this.b = vy1Var;
        this.c = j0eVarA;
        this.d = new lqc();
        a();
    }

    public final void a() {
        n7 n7Var = this.a;
        if (n7Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        long jG = s65.g(n7Var.a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lqc lqcVar = this.d;
        lqcVar.getClass();
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        ssa ssaVarL = new ota(lqcVar, jG, j0eVarA, 0).l(this.c);
        v08 v08Var = new v08(new mc5(12, this), new wha(this), pdf.d);
        ssaVarL.a(v08Var);
        this.e = v08Var;
    }
}
