package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ay9 {
    public static final /* synthetic */ yy7[] r;
    public final cw9 a;
    public final z74 b;
    public final f84 c;
    public final mcf d;
    public final mcf e;
    public final ir9 f;
    public final wu7 g;
    public final qt6 h;
    public final String i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final t9f m;
    public final AtomicReference n;
    public final tcf o;
    public final x26 p;
    public final i3e q;

    static {
        z8a z8aVar = new z8a(ay9.class, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        r = new yy7[]{z8aVar};
    }

    public ay9(cw9 cw9Var, z74 z74Var, ContextScope contextScope, hbd hbdVar, hbd hbdVar2, ir9 ir9Var, wu7 wu7Var) {
        gq9 gq9Var = gq9.a;
        qt6 qt6Var = new qt6(gq9Var.getAccessor().d(45), gq9Var.getAccessor().d(109), gq9Var.getAccessor().d(138), (lzf) gq9Var.getAccessor().c(8));
        k18 k18Var = fq9.a;
        bwf bwfVarD = gq9Var.getAccessor().d(138);
        bwf bwfVarD2 = gq9Var.getAccessor().d(46);
        bwf bwfVarD3 = gq9Var.getAccessor().d(227);
        this.a = cw9Var;
        this.b = z74Var;
        this.c = contextScope;
        this.d = hbdVar;
        this.e = hbdVar2;
        this.f = ir9Var;
        this.g = wu7Var;
        this.h = qt6Var;
        this.i = ay9.class.getName();
        this.j = bwfVarD;
        this.k = bwfVarD2;
        this.l = bwfVarD3;
        this.m = c7j.c();
        this.n = new AtomicReference(null);
        tcf tcfVarA = ucf.a(o3e.e);
        this.o = tcfVarA;
        this.p = gw0.k(new hbd(tcfVarA), 60L);
        this.q = new i3e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ay9 r10, long r11, defpackage.q44 r13) {
        /*
            qqg r0 = defpackage.qqg.a
            boolean r1 = r13 instanceof defpackage.ox9
            if (r1 == 0) goto L15
            r1 = r13
            ox9 r1 = (defpackage.ox9) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            ox9 r1 = new ox9
            r1.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            long r11 = r1.o
            ay9 r10 = r1.d
            defpackage.g8j.b(r13)
            goto L94
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            defpackage.g8j.b(r13)
            mcf r13 = r10.e
            java.lang.Object r13 = r13.getValue()
            hr9 r13 = (defpackage.hr9) r13
            one.me.messages.list.loader.MessageModel r13 = r13.e(r11)
            java.lang.String r3 = r10.i
            l6b r6 = defpackage.wqi.a
            if (r6 != 0) goto L4c
            goto L65
        L4c:
            lg8 r7 = defpackage.lg8.d
            boolean r8 = r6.b(r7)
            if (r8 == 0) goto L65
            if (r13 == 0) goto L5b
            java.lang.String r8 = r13.n()
            goto L5c
        L5b:
            r8 = r4
        L5c:
            java.lang.String r9 = "loadIfNeedAndScrollToMessage="
            java.lang.String r8 = defpackage.wy1.h(r9, r8)
            r6.c(r7, r3, r8, r4)
        L65:
            if (r13 == 0) goto L7d
            java.util.concurrent.atomic.AtomicReference r11 = r10.n
            lk2 r12 = new lk2
            r1 = 8
            r12.<init>(r1)
            r11.updateAndGet(r12)
            i3e r10 = r10.q
            long r11 = r13.c
            r13 = 0
            r1 = 6
            defpackage.i3e.l(r10, r11, r13, r1)
            return r0
        L7d:
            k18 r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            gx9 r13 = (defpackage.gx9) r13
            r1.d = r10
            r1.o = r11
            r1.Z = r5
            bsd r13 = r13.a
            java.lang.Object r13 = r13.j(r11, r1)
            if (r13 != r2) goto L94
            return r2
        L94:
            si9 r13 = (defpackage.si9) r13
            if (r13 != 0) goto Lb1
            java.lang.String r10 = r10.i
            l6b r13 = defpackage.wqi.a
            if (r13 != 0) goto L9f
            goto Lb0
        L9f:
            lg8 r1 = defpackage.lg8.Y
            boolean r2 = r13.b(r1)
            if (r2 == 0) goto Lb0
            java.lang.String r2 = "Trying to scroll for non-existing messageId="
            java.lang.String r11 = defpackage.vb9.e(r11, r2)
            r13.c(r1, r10, r11, r4)
        Lb0:
            return r0
        Lb1:
            java.util.concurrent.atomic.AtomicReference r1 = r10.n
            jx9 r2 = new jx9
            r3 = 0
            r2.<init>(r11, r3)
            r1.updateAndGet(r2)
            wu7 r10 = r10.g
            long r11 = r13.p()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r10.invoke(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay9.a(ay9, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.ay9 r16, final long r17, long r19, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay9.d(ay9, long, long, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.hr9 r28, defpackage.pb2 r29) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay9.b(hr9, pb2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.pb2 r12, defpackage.q44 r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay9.c(pb2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pb2 r12, defpackage.hr9 r13, defpackage.q44 r14) {
        /*
            r11 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r14 instanceof defpackage.yx9
            if (r1 == 0) goto L15
            r1 = r14
            yx9 r1 = (defpackage.yx9) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            yx9 r1 = new yx9
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r1.Y
            g84 r2 = defpackage.g84.a
            int r3 = r1.s0
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            hr9 r13 = r1.X
            pb2 r12 = r1.o
            ay9 r1 = r1.d
            defpackage.g8j.b(r14)
            goto Lbf
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            defpackage.g8j.b(r14)
            java.util.List r14 = r13.a
            int r14 = r14.size()
            r1.d = r11
            r1.o = r12
            r1.X = r13
            r1.s0 = r4
            tcf r1 = r11.o
            java.lang.Object r3 = r1.getValue()
            r5 = r3
            o3e r5 = (defpackage.o3e) r5
            rf2 r3 = r12.b
            int r6 = r3.m
            boolean r8 = r12.E()
            tcf r3 = r11.o
            java.lang.Object r3 = r3.getValue()
            o3e r3 = (defpackage.o3e) r3
            boolean r7 = r3.b
            r9 = 0
            r10 = 8
            o3e r3 = defpackage.o3e.a(r5, r6, r7, r8, r9, r10)
            r5 = 0
            r1.m(r5, r3)
            java.lang.String r1 = r11.i
            l6b r3 = defpackage.wqi.a
            if (r3 != 0) goto L76
            goto La1
        L76:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r3.b(r6)
            if (r7 == 0) goto La1
            tcf r7 = r11.o
            java.lang.Object r7 = r7.getValue()
            if (r14 == 0) goto L87
            goto L88
        L87:
            r4 = 0
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Update scroll btn, state="
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = ", hasMessages:"
            r8.append(r7)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r3.c(r6, r1, r4, r5)
        La1:
            rf2 r1 = r12.b
            java.lang.String r1 = r1.j0
            if (r1 == 0) goto Lbb
            int r1 = r1.length()
            if (r1 != 0) goto Lae
            goto Lbb
        Lae:
            if (r14 == 0) goto Lbb
            f84 r14 = r11.c
            zx9 r1 = new zx9
            r1.<init>(r12, r11, r5)
            r3 = 3
            defpackage.svi.e(r14, r5, r5, r1, r3)
        Lbb:
            if (r0 != r2) goto Lbe
            return r2
        Lbe:
            r1 = r11
        Lbf:
            r1.b(r13, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay9.e(pb2, hr9, q44):java.lang.Object");
    }

    public final void f(x9f x9fVar) {
        this.m.O(this, r[0], x9fVar);
    }
}
