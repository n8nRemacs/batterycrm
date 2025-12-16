package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class z13 implements x37 {
    public final bwf X;
    public final bwf Y;
    public final k18 Z;
    public final b47 a;
    public final lzf b;
    public final a84 c;
    public final j86 d;
    public final dx3 o;
    public final AtomicBoolean s0 = new AtomicBoolean(true);
    public final AtomicBoolean t0 = new AtomicBoolean(false);
    public final p74 u0 = new p74();
    public final tcf v0 = ucf.a(v03.c);
    public final x13 w0 = new x13(this);
    public final String x0;
    public final nxg y0;
    public final r30 z0;

    public z13(String str, bwf bwfVar, b47 b47Var, bwf bwfVar2, lzf lzfVar, a84 a84Var, j86 j86Var, dx3 dx3Var, k18 k18Var, nxg nxgVar) {
        this.a = b47Var;
        this.b = lzfVar;
        this.c = a84Var;
        this.d = j86Var;
        this.o = dx3Var;
        this.X = bwfVar;
        this.Y = bwfVar2;
        this.Z = k18Var;
        String strConcat = z13.class.getName().concat(dnf.p(str, '.', '_', false));
        this.x0 = strConcat;
        this.y0 = nxgVar;
        String strConcat2 = "chats-list-job-executor#".concat(str);
        cj0 cj0Var = new cj0(8);
        r30 r30Var = new r30();
        r30Var.b = nxgVar;
        r30Var.a = strConcat2;
        r30Var.c = cj0Var;
        r30Var.d = kve.a(1, Integer.MAX_VALUE, 2);
        r30Var.o = new ConcurrentHashMap();
        r30Var.X = new AtomicInteger(0);
        cj0Var.invoke(strConcat2, "init " + r30Var);
        this.z0 = r30Var;
        wqi.c(strConcat, "init " + this, new Object[0]);
        gw0.w(new g56((jve) r30Var.d, new ju7(r30Var, new i13(this, null, 0), null), 1), nxgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.z13 r16, defpackage.p03 r17, defpackage.q44 r18) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.a(z13, p03, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.z13 r13, defpackage.ww3 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.b(z13, ww3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o13
            if (r0 == 0) goto L13
            r0 = r5
            o13 r0 = (defpackage.o13) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            o13 r0 = new o13
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z13 r0 = r0.d
            defpackage.g8j.b(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.g8j.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.t0
            r5.set(r3)
            b47 r5 = r4.a
            r5.i = r4
            r30 r5 = r4.z0
            r0.d = r4
            r0.Y = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.t0
            r5.set(r3)
            r30 r5 = r0.z0
            p13 r1 = new p13
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.r30.u(r5, r1)
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.q13
            if (r0 == 0) goto L13
            r0 = r5
            q13 r0 = (defpackage.q13) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            q13 r0 = new q13
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            z13 r0 = r0.d
            defpackage.g8j.b(r5)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.s0
            r1 = 0
            boolean r5 = r5.compareAndSet(r2, r1)
            if (r5 == 0) goto L60
            bwf r5 = r4.X
            java.lang.Object r5 = r5.getValue()
            ss5 r5 = (defpackage.ss5) r5
            r0.d = r4
            r0.Y = r2
            java.lang.Object r5 = r5.a(r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r0 = r4
        L51:
            java.util.List r5 = (java.util.List) r5
            p74 r1 = r0.u0
            r1.addAll(r5)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f(r1)
        L60:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.d(q44):java.lang.Object");
    }

    public final void e() {
        if (this.t0.compareAndSet(false, true)) {
            r30.u(this.z0, new r13(this, null)).invokeOnCompletion(new d92(7, this));
        }
    }

    public final void f(long j) {
        String str = this.x0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, vb9.e(j, "loadNext: "), null);
            }
        }
        b47 b47Var = this.a;
        iv6 iv6Var = b47Var.e;
        iv6Var.u("loadNext: " + iv6.k(j));
        b47Var.q();
        if (b47Var.d().j().isEmpty()) {
            b47Var.l(j);
        } else {
            iv6Var.u("loadNext: Chunks not empty, started loading from datasources");
            j37 j37VarC = gei.c(b47Var.f(j));
            if (j37VarC != null) {
                j = j37VarC.getC();
            }
            long j2 = j;
            b47Var.j(b47Var.b, j2, false, true, false);
            b47Var.k(b47Var.c, j2, false, true);
        }
        iei.b(iv6Var, b47Var.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.y13
            if (r0 == 0) goto L13
            r0 = r5
            y13 r0 = (defpackage.y13) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            y13 r0 = new y13
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            z13 r0 = r0.d
            defpackage.g8j.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            bwf r5 = r4.X
            java.lang.Object r5 = r5.getValue()
            ss5 r5 = (defpackage.ss5) r5
            r0.d = r4
            r0.Y = r2
            java.lang.Object r5 = r5.a(r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L47
            return r0
        L47:
            r0 = r4
        L48:
            java.util.List r5 = (java.util.List) r5
            p74 r1 = r0.u0
            r1.clear()
            p74 r0 = r0.u0
            r0.addAll(r5)
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z13.g(q44):java.lang.Object");
    }
}
