package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final /* synthetic */ class un6 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ un6(tu1 tu1Var, ha8 ha8Var, long j) {
        this.c = tu1Var;
        this.d = ha8Var;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        x10 x10Var;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((tu1) this.c).d(new TimeoutException("Future[" + ((ha8) this.d) + "] is not done within " + this.b + " ms.")));
            default:
                bsd bsdVar = (bsd) this.c;
                gu3 gu3Var = (gu3) this.d;
                lq9 lq9VarD = bsdVar.d();
                long j = this.b;
                gj9 gj9VarD = lq9VarD.d(j);
                int iM = 0;
                if (gj9VarD == null) {
                    return 0;
                }
                jdc jdcVar = gj9VarD.m;
                if (jdcVar != null) {
                    x10Var = jdcVar.D();
                } else {
                    x10Var = new x10();
                    x10Var.a = hd5.a;
                }
                int iB = x10Var.b() + (x10Var.b != null ? 1 : 0);
                gu3Var.accept(x10Var);
                int iB2 = x10Var.b() + (x10Var.b == null ? 0 : 1);
                if (iB > 0 || iB2 > 0) {
                    jdc jdcVarC = x10Var.c();
                    iM = bsdVar.d().m(new wsg(j, jdcVarC, po8.a(jdcVarC)));
                }
                return Integer.valueOf(iM);
        }
    }

    public /* synthetic */ un6(bsd bsdVar, long j, gu3 gu3Var) {
        this.c = bsdVar;
        this.b = j;
        this.d = gu3Var;
    }
}
