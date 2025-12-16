package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sz1 {
    public static final long j;
    public static final long k;
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final ry1 d;
    public final cs0 e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final qz1 i = new qz1(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1L);
        k = timeUnit.toNanos(5L);
    }

    public sz1(int i, qee qeeVar, a07 a07Var, ry1 ry1Var, boolean z, cs0 cs0Var) {
        this.a = i;
        this.b = qeeVar;
        this.c = a07Var;
        this.d = ry1Var;
        this.f = z;
        this.e = cs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ha8 a(int i) {
        boolean zIsEmpty = this.h.isEmpty();
        ag7 ag7Var = ag7.c;
        if (zIsEmpty) {
            return ag7Var;
        }
        if (this.i.b()) {
            vz1 vz1Var = new vz1(null);
            ry1 ry1Var = this.d;
            ry1Var.p(vz1Var);
            my1 my1Var = new my1(ry1Var, 6, vz1Var);
            qee qeeVar = ry1Var.c;
            wu1 wu1Var = vz1Var.b;
            wu1Var.b.d(my1Var, qeeVar);
            ag7Var = wu1Var;
        }
        sn6 sn6VarA = sn6.a(ag7Var);
        ad0 ad0Var = new ad0(this, i, 1);
        sn6VarA.getClass();
        Executor executor = this.b;
        return wsf.l(wsf.l(sn6VarA, ad0Var, executor), new xtd(26, this), executor);
    }
}
