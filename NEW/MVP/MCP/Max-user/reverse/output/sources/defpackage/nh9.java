package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class nh9 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;

    public nh9(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jh9
            if (r0 == 0) goto L13
            r0 = r7
            jh9 r0 = (defpackage.jh9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            jh9 r0 = new jh9
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nh9 r6 = r0.d
            defpackage.g8j.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.g8j.b(r7)
            k18 r7 = r5.a
            java.lang.Object r7 = r7.getValue()
            gx9 r7 = (defpackage.gx9) r7
            r0.d = r5
            r0.Y = r2
            bsd r7 = r7.a
            java.lang.Object r7 = r7.k(r6, r0)
            g84 r6 = defpackage.g84.a
            if (r7 != r6) goto L49
            return r6
        L49:
            r6 = r5
        L4a:
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L55
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L55:
            k18 r0 = r6.d
            java.lang.Object r0 = r0.getValue()
            w63 r0 = (defpackage.w63) r0
            java.lang.Object r1 = defpackage.ue3.G(r7)
            si9 r1 = (defpackage.si9) r1
            long r3 = r1.Z
            hbd r0 = r0.j(r3)
            mcf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            pb2 r0 = (defpackage.pb2) r0
            if (r0 != 0) goto L76
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L76:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L7d
            goto L94
        L7d:
            java.util.Iterator r7 = r7.iterator()
        L81:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r7.next()
            si9 r1 = (defpackage.si9) r1
            boolean r1 = r6.b(r0, r1)
            if (r1 != 0) goto L81
            r2 = 0
        L94:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh9.a(java.util.List, q44):java.lang.Object");
    }

    public final boolean b(pb2 pb2Var, si9 si9Var) {
        if (!pb2Var.Q()) {
            boolean zA = pb2Var.A();
            if (pb2Var.M()) {
                boolean z = pb2Var.B() && si9Var.o == ((w4e) f()).s();
                boolean z2 = pb2Var.i0() || ppi.d(pb2Var.g(pb2Var.X), 1024);
                if (!zA && !z && !z2) {
                    return false;
                }
            } else if (!zA || (!pb2Var.i0() && !pb2Var.g0())) {
            }
            return true;
        }
        boolean zU = si9Var.u();
        long j = si9Var.o;
        if (!zU && ((j == ((w4e) f()).s() || (j == 0 && pb2Var.I())) && (!pb2Var.I() || j == 0))) {
            long j2 = (((w4e) f()).j() - si9Var.c) / 1000;
            ((l5c) ((age) this.f.getValue())).getClass();
            if (j2 < ((int) r10.m(PmsKey.f45edittimeout, 86400)) && si9Var.b != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(long r19, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh9.c(long, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(long r9, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh9.d(long, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.util.Set r8, defpackage.q44 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.mh9
            if (r0 == 0) goto L13
            r0 = r9
            mh9 r0 = (defpackage.mh9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mh9 r0 = new mh9
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nh9 r8 = r0.d
            defpackage.g8j.b(r9)
            goto L4a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.g8j.b(r9)
            k18 r9 = r7.a
            java.lang.Object r9 = r9.getValue()
            gx9 r9 = (defpackage.gx9) r9
            r0.d = r7
            r0.Y = r2
            bsd r9 = r9.a
            java.lang.Object r9 = r9.k(r8, r0)
            g84 r8 = defpackage.g84.a
            if (r9 != r8) goto L49
            return r8
        L49:
            r8 = r7
        L4a:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L53
            goto L71
        L53:
            k18 r0 = r8.d
            java.lang.Object r0 = r0.getValue()
            w63 r0 = (defpackage.w63) r0
            java.lang.Object r1 = defpackage.ue3.G(r9)
            si9 r1 = (defpackage.si9) r1
            long r3 = r1.Z
            hbd r0 = r0.j(r3)
            mcf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            pb2 r0 = (defpackage.pb2) r0
            if (r0 != 0) goto L74
        L71:
            hd5 r8 = defpackage.hd5.a
            return r8
        L74:
            o98 r1 = defpackage.ve3.d()
            gh9 r3 = defpackage.gh9.b
            r1.add(r3)
            java.util.Iterator r3 = r9.iterator()
        L81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r3.next()
            si9 r4 = (defpackage.si9) r4
            hl9 r5 = r8.g()
            r5.getClass()
            boolean r4 = defpackage.hl9.c(r0, r4)
            if (r4 != 0) goto L81
            goto La0
        L9b:
            gh9 r3 = defpackage.gh9.a
            r1.add(r3)
        La0:
            java.util.Iterator r9 = r9.iterator()
        La4:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r9.next()
            si9 r3 = (defpackage.si9) r3
            long r3 = r3.o
            pb3 r5 = r8.f()
            w4e r5 = (defpackage.w4e) r5
            long r5 = r5.s()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lc2
            r3 = r2
            goto Lc3
        Lc2:
            r3 = 0
        Lc3:
            boolean r3 = defpackage.hl9.a(r0, r3)
            if (r3 != 0) goto La4
            goto Lcf
        Lca:
            gh9 r8 = defpackage.gh9.X
            r1.add(r8)
        Lcf:
            o98 r8 = defpackage.ve3.a(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh9.e(java.util.Set, q44):java.io.Serializable");
    }

    public final pb3 f() {
        return (pb3) this.e.getValue();
    }

    public final hl9 g() {
        return (hl9) this.c.getValue();
    }
}
