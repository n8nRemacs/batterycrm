package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ru0 {
    public final z74 a;
    public final z74 b;
    public final long c;
    public final cg8 d;
    public final bg8 e;
    public final cj0 f;
    public final jve g;
    public final jve h;
    public final AtomicBoolean i;
    public final ArrayList j;
    public final CopyOnWriteArrayList k;

    public ru0(z74 z74Var, z74 z74Var2, long j, cg8 cg8Var, bg8 bg8Var) {
        cj0 cj0Var = new cj0(1);
        this.a = z74Var;
        this.b = z74Var2;
        this.c = j;
        this.d = cg8Var;
        this.e = bg8Var;
        this.f = cj0Var;
        "Buffer:".concat("LogController");
        ContextScope contextScopeA = d7j.a(zk6.a().plus(z74Var2));
        this.g = kve.b(1, 0, 2);
        this.h = kve.b(0, Integer.MAX_VALUE, 1);
        this.i = new AtomicBoolean(false);
        this.j = new ArrayList();
        this.k = new CopyOnWriteArrayList();
        svi.e(contextScopeA, null, null, new pu0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r9, defpackage.q44 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "inserted "
            boolean r1 = r10 instanceof defpackage.lu0
            if (r1 == 0) goto L15
            r1 = r10
            lu0 r1 = (defpackage.lu0) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            lu0 r1 = new lu0
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.Y
            int r2 = r1.s0
            qqg r3 = defpackage.qqg.a
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            long r4 = r1.X
            java.util.List r9 = r1.o
            ru0 r1 = r1.d
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r9 = move-exception
            goto L98
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.g8j.b(r10)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L43
            goto L95
        L43:
            long r5 = java.lang.System.nanoTime()
            z74 r10 = r8.a     // Catch: java.lang.Throwable -> L96
            mu0 r2 = new mu0     // Catch: java.lang.Throwable -> L96
            r7 = 0
            r2.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L96
            r1.d = r8     // Catch: java.lang.Throwable -> L96
            r1.o = r9     // Catch: java.lang.Throwable -> L96
            r1.X = r5     // Catch: java.lang.Throwable -> L96
            r1.s0 = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = defpackage.svi.i(r10, r2, r1)     // Catch: java.lang.Throwable -> L96
            g84 r1 = defpackage.g84.a
            if (r10 != r1) goto L60
            return r1
        L60:
            r1 = r8
            r4 = r5
        L62:
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto L95
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
            long r6 = r6 - r4
            y65 r10 = defpackage.y65.NANOSECONDS     // Catch: java.lang.Throwable -> L2f
            long r4 = defpackage.v9j.i(r6, r10)     // Catch: java.lang.Throwable -> L2f
            long r4 = defpackage.s65.g(r4)     // Catch: java.lang.Throwable -> L2f
            cj0 r10 = r1.f     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r2.append(r9)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r9 = " items in "
            r2.append(r9)     // Catch: java.lang.Throwable -> L2f
            r2.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r9 = "ms"
            r2.append(r9)     // Catch: java.lang.Throwable -> L2f
            r10.getClass()     // Catch: java.lang.Throwable -> L2f
        L95:
            return r3
        L96:
            r9 = move-exception
            r1 = r8
        L98:
            bg8 r10 = r1.e
            r10.invoke(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.a(java.util.List, q44):java.lang.Object");
    }
}
