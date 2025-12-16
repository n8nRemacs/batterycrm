package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zy6 {
    public static final long i;
    public static final imb j;
    public final mcf a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final tcf e;
    public final hbd f;
    public final jve g;
    public final gbd h;

    static {
        int i2 = s65.d;
        i = v9j.h(5, y65.SECONDS);
        j = new imb(fui.a("", Long.MIN_VALUE), mwg.c(i0b.A0).toString());
    }

    public zy6(ContextScope contextScope, lzf lzfVar, mcf mcfVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = mcfVar;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var;
        tcf tcfVarA = ucf.a(bz6.a);
        this.e = tcfVarA;
        this.f = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.g = jveVarB;
        this.h = new gbd(jveVarB);
        gw0.w(gw0.u(new g56(new z41(new d53(mcfVar, 12), ((hw1) ((tv1) k18Var2.getValue())).b1, uy6.Z, 3), new rw(2, this, zy6.class, "handleChat", "handleChat(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 22), 1), ((q2b) lzfVar).b()), contextScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zy6 r7, defpackage.imb r8, kotlin.coroutines.Continuation r9) {
        /*
            tcf r0 = r7.e
            boolean r1 = r9 instanceof defpackage.vy6
            if (r1 == 0) goto L15
            r1 = r9
            vy6 r1 = (defpackage.vy6) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            vy6 r1 = new vy6
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.Y
            int r2 = r1.s0
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            j5g r7 = r1.X
            java.lang.String r8 = r1.o
            tcf r0 = r1.d
            defpackage.g8j.b(r9)
            goto La5
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r8.a
            pb2 r9 = (defpackage.pb2) r9
            java.lang.Object r8 = r8.b
            mb4 r8 = (defpackage.mb4) r8
            qf2 r2 = r9.t()
            java.lang.String r8 = r8.c
            k18 r4 = r7.b
            java.lang.Object r4 = r4.getValue()
            tv1 r4 = (defpackage.tv1) r4
            hw1 r4 = (defpackage.hw1) r4
            boolean r4 = r4.t()
            r5 = 0
            if (r4 == 0) goto L67
            if (r2 == 0) goto L5d
            java.lang.String r4 = r2.a
            goto L5e
        L5d:
            r4 = r5
        L5e:
            boolean r8 = defpackage.fni.a(r8, r4)
            if (r8 != 0) goto L65
            goto L67
        L65:
            r8 = 0
            goto L68
        L67:
            r8 = r3
        L68:
            rf2 r4 = r9.b
            if (r4 == 0) goto Lb0
            qf2 r4 = r4.T
            if (r4 == 0) goto Lb0
            java.lang.String r6 = r4.c
            boolean r6 = defpackage.l8g.d(r6)
            if (r6 == 0) goto Lb0
            int r4 = r4.d
            if (r4 <= 0) goto Lb0
            boolean r9 = r9.Q()
            if (r9 != 0) goto Lb0
            if (r2 == 0) goto Lb0
            if (r8 == 0) goto Lb0
            int r8 = defpackage.l8b.a
            int r9 = r2.d
            j5g r4 = new j5g
            r4.<init>(r8, r9)
            java.lang.String r8 = r2.a
            java.util.List r2 = r2.e
            r1.d = r0
            r1.o = r8
            r1.X = r4
            r1.s0 = r3
            java.io.Serializable r9 = r7.b(r2, r9, r1)
            g84 r7 = defpackage.g84.a
            if (r9 != r7) goto La4
            return r7
        La4:
            r7 = r4
        La5:
            java.util.List r9 = (java.util.List) r9
            az6 r1 = new az6
            r1.<init>(r8, r7, r9)
            r0.setValue(r1)
            goto Lb5
        Lb0:
            bz6 r7 = defpackage.bz6.a
            r0.m(r5, r7)
        Lb5:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy6.a(zy6, imb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [hd5, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.util.List r11, int r12, defpackage.q44 r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy6.b(java.util.List, int, q44):java.io.Serializable");
    }
}
