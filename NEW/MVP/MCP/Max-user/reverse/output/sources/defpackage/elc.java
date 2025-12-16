package defpackage;

import java.util.List;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class elc {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;

    public elc(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
    }

    public static void a(List list, ku3 ku3Var, s5g s5gVar, String str, boolean z, hec hecVar) {
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE == null) {
            strE = "";
        }
        if (hecVar == hec.b) {
            s5gVar = s5g.b;
        }
        list.add(new kx3(jP, strE, s5gVar, str, z, ku3Var.o(), hecVar));
    }

    public static void b(List list, fec fecVar, boolean z) {
        int i = r8b.H;
        long j = s8b.c;
        n5g n5gVar = new n5g(u8b.L0);
        eec eecVar = fecVar.h;
        boolean z2 = eecVar.b;
        list.add(new a7(i, new toe(j, 0, n5gVar, z2 ? hoe.b : hoe.o, null, null, new doe(eecVar.a, z2), null, null, 432)));
        if (z) {
            list.add(new a8e(new n5g(u8b.M0), dpg.l, 2));
        }
    }

    public static void c(List list, fec fecVar, boolean z) {
        int i = r8b.E;
        long j = s8b.b;
        n5g n5gVar = new n5g(z ? u8b.i1 : u8b.t1);
        n5g n5gVar2 = new n5g(u8b.u1);
        eec eecVar = fecVar.f;
        boolean z2 = eecVar.b;
        list.add(new a7(i, new toe(j, 0, n5gVar, z2 ? hoe.b : hoe.o, n5gVar2, null, new doe(eecVar.a, z2), null, null, HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE)));
    }

    public static void e(List list, boolean z, boolean z2, hec hecVar) {
        if (z && hecVar == hec.c) {
            if (z2) {
                list.add(new a7(r8b.C, new toe(s8b.a, 0, new n5g(u8b.f), null, null, baj.a(yud.M0), yne.a, null, null, HttpStatus.SC_REQUEST_TIMEOUT), 1024));
            }
            list.add(new mt4(new n5g(u8b.N0)));
        }
    }

    public final void d(List list, fec fecVar, boolean z, boolean z2) {
        eec eecVar = fecVar.g;
        int i = r8b.M;
        long j = s8b.f;
        n5g n5gVar = new n5g(z ? u8b.e1 : u8b.R0);
        boolean z3 = eecVar.b;
        hoe hoeVar = hoe.o;
        hoe hoeVar2 = hoe.b;
        toe toeVar = new toe(j, 0, n5gVar, z3 ? hoeVar2 : hoeVar, null, null, new doe(eecVar.a, z3), null, null, 432);
        k18 k18Var = this.d;
        gu5 gu5Var = (gu5) ((rt5) k18Var.getValue());
        gu5Var.getClass();
        PmsKey pmsKey = PmsKey.f29chatinvitelinkpermissionsenabled;
        list.add(new a7(i, toeVar, (!gu5Var.j(pmsKey, false) || z) ? 1024 : 536871936));
        gu5 gu5Var2 = (gu5) ((rt5) k18Var.getValue());
        gu5Var2.getClass();
        if (!gu5Var2.j(pmsKey, false) || z) {
            return;
        }
        list.add(new a7(r8b.L, new toe(s8b.e, 0, new n5g(u8b.Q0), eecVar.b ? hoeVar2 : hoeVar, null, null, new doe(fecVar.a, z2), null, null, 432), -2147482624));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(defpackage.ku3 r29, defpackage.pb2 r30, defpackage.fec r31, defpackage.hec r32, java.lang.Long r33, defpackage.q44 r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elc.f(ku3, pb2, fec, hec, java.lang.Long, q44):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(defpackage.ku3 r30, defpackage.pb2 r31, defpackage.fec r32, defpackage.hec r33, java.lang.Long r34, defpackage.q44 r35) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elc.g(ku3, pb2, fec, hec, java.lang.Long, q44):java.io.Serializable");
    }

    public final Boolean h(Long l, boolean z, pb2 pb2Var) {
        return Boolean.valueOf((l != null && l.longValue() == ((w4e) ((pb3) this.e.getValue())).s() && z) || pb2Var.i0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Long r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.clc
            if (r0 == 0) goto L13
            r0 = r7
            clc r0 = (defpackage.clc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            clc r0 = new clc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            goto L63
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            defpackage.g8j.b(r7)
            if (r6 == 0) goto L7d
            long r6 = r6.longValue()
            k18 r1 = r5.e
            java.lang.Object r1 = r1.getValue()
            pb3 r1 = (defpackage.pb3) r1
            w4e r1 = (defpackage.w4e) r1
            long r3 = r1.s()
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 != 0) goto L50
            int r6 = defpackage.u8b.V0
            n5g r7 = new n5g
            r7.<init>(r6)
            return r7
        L50:
            k18 r1 = r5.c
            java.lang.Object r1 = r1.getValue()
            l24 r1 = (defpackage.l24) r1
            r0.X = r2
            java.lang.Comparable r7 = r1.b(r6, r0)
            g84 r6 = defpackage.g84.a
            if (r7 != r6) goto L63
            return r6
        L63:
            ku3 r7 = (defpackage.ku3) r7
            if (r7 == 0) goto L7d
            java.lang.String r6 = r7.e()
            if (r6 == 0) goto L7d
            int r7 = defpackage.u8b.U0
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            p5g r0 = new p5g
            java.util.List r6 = defpackage.ys.D(r6)
            r0.<init>(r7, r6)
            return r0
        L7d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elc.i(java.lang.Long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Long r5, defpackage.ku3 r6, defpackage.pb2 r7, defpackage.q44 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dlc
            if (r0 == 0) goto L13
            r0 = r8
            dlc r0 = (defpackage.dlc) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            dlc r0 = new dlc
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            pb2 r7 = r0.X
            ku3 r6 = r0.o
            elc r5 = r0.d
            defpackage.g8j.b(r8)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r8)
            r0.d = r4
            r0.o = r6
            r0.X = r7
            r0.s0 = r2
            java.lang.Object r8 = r4.i(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r8 != r5) goto L47
            return r5
        L47:
            r5 = r4
        L48:
            s5g r8 = (defpackage.s5g) r8
            boolean r0 = r6.X
            if (r0 == 0) goto L56
            int r5 = defpackage.u8b.W0
            n5g r6 = new n5g
            r6.<init>(r5)
            return r6
        L56:
            long r0 = r6.p()
            boolean r7 = r7.d0(r0)
            if (r7 == 0) goto L68
            int r5 = defpackage.u8b.T0
            n5g r6 = new n5g
            r6.<init>(r5)
            return r6
        L68:
            if (r8 != 0) goto L84
            k18 r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            i8c r5 = (defpackage.i8c) r5
            k18 r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            h8c r5 = (defpackage.h8c) r5
            java.lang.CharSequence r5 = r5.b(r6)
            r5g r6 = new r5g
            r6.<init>(r5)
            return r6
        L84:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elc.j(java.lang.Long, ku3, pb2, q44):java.lang.Object");
    }
}
