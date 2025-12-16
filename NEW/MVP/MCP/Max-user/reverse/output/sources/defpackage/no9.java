package defpackage;

import java.util.Set;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class no9 extends xfh {
    public static final /* synthetic */ yy7[] X0;
    public final hbd A0;
    public final tcf B0;
    public final hbd C0;
    public final tcf D0;
    public final hbd E0;
    public final tcf F0;
    public final hbd G0;
    public final tcf H0;
    public final hbd I0;
    public final tcf J0;
    public final hbd K0;
    public final tcf L0;
    public final hbd M0;
    public final tcf N0;
    public final tcf O0;
    public final tcf P0;
    public final hbd Q0;
    public final d53 R0;
    public final tcf S0;
    public final hbd T0;
    public final hbd U0;
    public final hbd V0;
    public CharSequence W0;
    public final Object X;
    public final k18 Y;
    public final k18 Z;
    public final mcf b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final Object s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final t9f x0 = c7j.c();
    public final ci5 y0;
    public final tcf z0;

    static {
        z8a z8aVar = new z8a(no9.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        X0 = new yy7[]{z8aVar};
    }

    public no9(Set set, Long l, boolean z, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, mcf mcfVar, x26 x26Var) {
        this.b = mcfVar;
        this.c = k18Var;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        this.Y = k18Var6;
        this.Z = k18Var7;
        this.s0 = k18Var10;
        this.t0 = k18Var2;
        this.u0 = k18Var8;
        this.v0 = k18Var9;
        this.w0 = k18Var11;
        kve.b(0, Integer.MAX_VALUE, 4);
        this.y0 = new ci5(0);
        tcf tcfVarA = ucf.a(null);
        this.z0 = tcfVarA;
        this.A0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.B0 = tcfVarA2;
        this.C0 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(null);
        this.D0 = tcfVarA3;
        this.E0 = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(null);
        this.F0 = tcfVarA4;
        this.G0 = new hbd(tcfVarA4);
        tcf tcfVarA5 = ucf.a(null);
        this.H0 = tcfVarA5;
        x26 x26VarU = gw0.u(new io9(tcfVarA5, this, 0), ((q2b) ((lzf) k18Var2.getValue())).b());
        ContextScope contextScope = this.a;
        lcj lcjVar = yve.a;
        this.I0 = gw0.C(x26VarU, contextScope, lcjVar, null);
        tcf tcfVarA6 = ucf.a(null);
        this.J0 = tcfVarA6;
        this.K0 = gw0.C(gw0.u(new io9(tcfVarA6, this, 1), ((q2b) ((lzf) k18Var2.getValue())).b()), this.a, lcjVar, null);
        tcf tcfVarA7 = ucf.a(null);
        this.L0 = tcfVarA7;
        this.M0 = new hbd(tcfVarA7);
        Boolean bool = Boolean.FALSE;
        tcf tcfVarA8 = ucf.a(bool);
        this.N0 = tcfVarA8;
        tcf tcfVarA9 = ucf.a(null);
        this.O0 = tcfVarA9;
        tcf tcfVarA10 = ucf.a(set != null ? new nn9(set, l, z) : null);
        this.P0 = tcfVarA10;
        this.Q0 = gw0.C(gw0.u(gw0.i(tcfVarA10, tcfVarA9, tcfVarA8, new bo9(this, null)), ((q2b) ((lzf) k18Var2.getValue())).b()), this.a, lcjVar, null);
        this.R0 = new d53(mcfVar, 21);
        tcf tcfVarA11 = ucf.a(null);
        this.S0 = tcfVarA11;
        this.T0 = new hbd(tcfVarA11);
        this.U0 = gw0.C(gw0.m(new d53(mcfVar, 22)), this.a, lcjVar, null);
        this.V0 = gw0.C(gw0.m(new bc2(new d53(mcfVar, 12), 9)), this.a, lcjVar, bool);
        int i = s65.d;
        zs0.e(gw0.u(new g56(zs0.a(x26Var, v9j.h(500, y65.MILLISECONDS), new cj0(19)), new ln9(this, null), 1), z74.limitedParallelism$default(((q2b) ((lzf) k18Var2.getValue())).a(), 1, null, 2, null)), this.a);
    }

    public static void B(no9 no9Var, boolean z, int i) {
        gn9 gn9Var;
        if ((i & 1) != 0) {
            z = false;
        }
        int i2 = 2;
        boolean z2 = (i & 2) == 0;
        tcf tcfVar = no9Var.z0;
        yh5 yh5Var = (yh5) tcfVar.getValue();
        in9 in9Var = yh5Var != null ? (in9) yh5Var.a : null;
        if (z2) {
            if ((in9Var != null ? in9Var.a : 0) != 2) {
                return;
            }
        }
        yh5 yh5Var2 = (yh5) no9Var.B0.getValue();
        if (yh5Var2 != null && (gn9Var = (gn9) yh5Var2.a) != null && gn9Var.a) {
            no9Var.D(3, null);
            return;
        }
        if (z2) {
            i2 = 4;
        } else if (z) {
            i2 = 1;
        } else {
            if ((in9Var != null ? in9Var.a : 0) == 2) {
                i2 = 3;
            }
        }
        tcfVar.m(null, new yh5(new in9(i2)));
    }

    public static void C(no9 no9Var, int i) {
        no9Var.D((i & 1) == 0 ? 2 : 1, null);
    }

    public static void F(no9 no9Var, Long l, CharSequence charSequence, Integer num, int i) {
        pn9 pn9Var = null;
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        boolean z = (i & 8) != 0;
        tcf tcfVar = no9Var.H0;
        if (tcfVar.getValue() != null) {
            tcfVar.setValue(null);
        }
        tcf tcfVar2 = no9Var.J0;
        if (l != null) {
            no9Var.O0.m(null, new qn9(charSequence, num));
            pn9Var = new pn9(l.longValue(), z);
        }
        tcfVar2.setValue(pn9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.no9 r16, defpackage.nn9 r17, defpackage.qn9 r18, boolean r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no9.t(no9, nn9, qn9, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.no9 r12, defpackage.pn9 r13, defpackage.q44 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.co9
            if (r0 == 0) goto L13
            r0 = r14
            co9 r0 = (defpackage.co9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            co9 r0 = new co9
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.Y
            int r1 = r0.s0
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            sn9 r12 = r0.X
            pn9 r13 = r0.o
            no9 r0 = r0.d
            defpackage.g8j.b(r14)
            r9 = r12
            goto L7c
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            pn9 r13 = r0.o
            no9 r12 = r0.d
            defpackage.g8j.b(r14)
            goto L5c
        L41:
            defpackage.g8j.b(r14)
            if (r13 != 0) goto L48
            goto Lcf
        L48:
            long r5 = r13.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r5)
            r0.d = r12
            r0.o = r13
            r0.s0 = r3
            java.lang.Object r14 = r12.A(r14, r3, r0)
            if (r14 != r4) goto L5c
            goto L78
        L5c:
            sn9 r14 = (defpackage.sn9) r14
            k18 r1 = r12.o
            java.lang.Object r1 = r1.getValue()
            gx9 r1 = (defpackage.gx9) r1
            long r5 = r13.a
            r0.d = r12
            r0.o = r13
            r0.X = r14
            r0.s0 = r2
            bsd r1 = r1.a
            java.lang.Object r0 = r1.j(r5, r0)
            if (r0 != r4) goto L79
        L78:
            return r4
        L79:
            r9 = r14
            r14 = r0
            r0 = r12
        L7c:
            si9 r14 = (defpackage.si9) r14
            if (r9 == 0) goto Lcf
            if (r14 != 0) goto L83
            goto Lcf
        L83:
            java.util.List r12 = r14.N0
            k18 r1 = r0.u0
            java.lang.Object r1 = r1.getValue()
            f7b r1 = (defpackage.f7b) r1
            java.lang.String r4 = r14.Y
            java.lang.CharSequence r1 = r1.m(r4, r12)
            k18 r0 = r0.u0
            java.lang.Object r0 = r0.getValue()
            f7b r0 = (defpackage.f7b) r0
            r4 = 20
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vw4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r4, r5)
            int r2 = defpackage.kti.d(r2)
            java.lang.CharSequence r8 = r0.k(r1, r12, r2)
            mn9 r5 = new mn9
            long r6 = r13.a
            s10 r12 = defpackage.s10.c
            boolean r12 = r14.s(r12)
            if (r12 != 0) goto Lc8
            s10 r12 = defpackage.s10.d
            boolean r12 = r14.s(r12)
            if (r12 == 0) goto Lc7
            goto Lc8
        Lc7:
            r3 = 0
        Lc8:
            r10 = r3
            boolean r11 = r13.b
            r5.<init>(r6, r8, r9, r10, r11)
            return r5
        Lcf:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no9.u(no9, pn9, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r1 == r13) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.Long r22, boolean r23, defpackage.q44 r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no9.A(java.lang.Long, boolean, q44):java.lang.Object");
    }

    public final void D(int i, wj9 wj9Var) {
        gn9 gn9Var;
        tcf tcfVar = this.B0;
        yh5 yh5Var = (yh5) tcfVar.getValue();
        boolean z = (yh5Var == null || (gn9Var = (gn9) yh5Var.a) == null) ? false : gn9Var.a;
        if (wj9Var == null) {
            wj9Var = (i == 3 || i == 2) ? wj9.a : z ? wj9.c : wj9.b;
        }
        this.D0.m(null, new yh5(new hn9(wj9Var)));
        gn9 gn9Var2 = (z || i != 4) ? (z || i == 1) ? new gn9(true ^ z, i) : null : new gn9(false, i);
        if (gn9Var2 != null) {
            tcfVar.m(null, new yh5(gn9Var2));
        }
    }

    public final void E(CharSequence charSequence, boolean z) {
        if ((charSequence == null || vmf.F(charSequence)) && !w()) {
            return;
        }
        Long l = (Long) this.H0.getValue();
        on9 on9Var = (on9) this.Q0.a.getValue();
        vf6 vf6Var = on9Var != null ? new vf6(on9Var.a, on9Var.b, on9Var.c, charSequence, on9Var.e.e) : null;
        svi.e(this.a, ((q2b) ((lzf) this.t0.getValue())).a(), null, new eo9(this, l, vf6Var, charSequence, z, null), 2);
        xfh.r(this.y0, new vn9(vf6Var));
    }

    public final void G(Long l) {
        tcf tcfVar = this.J0;
        if (tcfVar.getValue() != null) {
            tcfVar.setValue(null);
        }
        this.H0.setValue(l);
    }

    public final void v() {
        tcf tcfVar;
        Object value;
        do {
            tcfVar = this.P0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, null));
        this.O0.setValue(null);
        this.N0.m(null, Boolean.FALSE);
    }

    public final boolean w() {
        return this.Q0.a.getValue() != null && this.I0.a.getValue() == null;
    }

    public final Long x() {
        pn9 pn9Var = (pn9) this.J0.getValue();
        if (pn9Var != null) {
            return Long.valueOf(pn9Var.a);
        }
        return null;
    }

    public final on9 y() {
        return (on9) this.Q0.a.getValue();
    }

    public final Long z() {
        return (Long) this.H0.getValue();
    }
}
