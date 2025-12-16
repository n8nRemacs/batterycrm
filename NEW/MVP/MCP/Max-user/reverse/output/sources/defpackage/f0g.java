package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class f0g {
    public final yi5 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final ContextScope h;
    public final String i;
    public final bwf j;

    public f0g(yi5 yi5Var, a84 a84Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, lzf lzfVar, k18 k18Var7) {
        this.a = yi5Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        new bwf(new rv1(k18Var3, k18Var4, 3));
        this.g = k18Var7;
        this.h = d7j.a(((q2b) lzfVar).b().limitedParallelism(2, "cloud-pushes").plus(a84Var));
        this.i = f0g.class.getName();
        this.j = new bwf(new nte(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.f0g r8, java.util.Map r9, defpackage.q44 r10) {
        /*
            qqg r0 = defpackage.qqg.a
            java.lang.String r1 = "onMessageRemoved: failed to parse "
            boolean r2 = r10 instanceof defpackage.e0g
            if (r2 == 0) goto L17
            r2 = r10
            e0g r2 = (defpackage.e0g) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            e0g r2 = new e0g
            r2.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r2.o
            g84 r3 = defpackage.g84.a
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            f0g r8 = r2.d
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            return r0
        L2d:
            r9 = move-exception
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.g8j.b(r10)
            pt5 r10 = r8.c()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            pb3 r4 = r8.b()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            w4e r4 = (defpackage.w4e) r4     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            long r6 = r4.s()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            kt5 r10 = r10.d(r6, r9)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            if (r10 != 0) goto L6e
            java.lang.String r10 = r8.i     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            l6b r2 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            if (r2 != 0) goto L55
            goto L85
        L55:
            lg8 r3 = defpackage.lg8.Y     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            boolean r4 = r2.b(r3)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            if (r4 == 0) goto L85
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            r4.append(r9)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            r1 = 0
            r2.c(r3, r10, r9, r1)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            return r0
        L6e:
            g0g r9 = r8.d()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            r2.d = r8     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            r2.Y = r5     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            tqc r9 = r9.a()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            java.lang.Object r8 = r9.e(r10, r2)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L9c
            if (r8 != r3) goto L81
            goto L82
        L81:
            r8 = r0
        L82:
            if (r8 != r3) goto L85
            return r3
        L85:
            return r0
        L86:
            yi5 r10 = r8.a
            t32 r1 = new t32
            java.lang.String r2 = "onMessageRemoved: failed to parse message remove notification"
            r1.<init>(r2, r9)
            y3b r10 = (defpackage.y3b) r10
            r10.a(r1)
            g0g r8 = r8.d()
            r8.d()
            return r0
        L9c:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0g.a(f0g, java.util.Map, q44):java.lang.Object");
    }

    public final pb3 b() {
        return (pb3) this.d.getValue();
    }

    public final pt5 c() {
        return (pt5) this.j.getValue();
    }

    public final g0g d() {
        return (g0g) this.b.getValue();
    }
}
