package defpackage;

/* loaded from: classes2.dex */
public final class ix9 {
    public final k18 a;
    public final k18 b;

    public ix9(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:21:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r20, defpackage.q44 r22, java.util.List r23) {
        /*
            r19 = this;
            r0 = r22
            boolean r1 = r0 instanceof defpackage.hx9
            if (r1 == 0) goto L17
            r1 = r0
            hx9 r1 = (defpackage.hx9) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.t0 = r2
            r2 = r19
            goto L1e
        L17:
            hx9 r1 = new hx9
            r2 = r19
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.Z
            int r3 = r1.t0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            long r5 = r1.Y
            long r7 = r1.X
            java.util.Iterator r3 = r1.o
            ix9 r9 = r1.d
            defpackage.g8j.b(r0)
            r14 = r5
            r12 = r7
            r5 = r3
            r3 = r1
            goto L7f
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            defpackage.g8j.b(r0)
            java.util.Set r0 = defpackage.ue3.h0(r23)
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            r3 = r1
            r9 = r2
            r0 = r20
        L4f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lcb
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            k18 r8 = r9.a
            java.lang.Object r8 = r8.getValue()
            gx9 r8 = (defpackage.gx9) r8
            r3.d = r9
            r3.o = r5
            r3.X = r0
            r3.Y = r6
            r3.t0 = r4
            bsd r8 = r8.a
            java.lang.Object r8 = r8.j(r6, r3)
            g84 r10 = defpackage.g84.a
            if (r8 != r10) goto L7c
            return r10
        L7c:
            r12 = r0
            r14 = r6
            r0 = r8
        L7f:
            si9 r0 = (defpackage.si9) r0
            if (r0 != 0) goto L86
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L86:
            rs4 r1 = r0.R0
            int r1 = r1.ordinal()
            if (r1 == 0) goto Lb9
            if (r1 != r4) goto Lb3
            uhe r11 = new uhe
            long r17 = java.lang.System.currentTimeMillis()
            ss4 r0 = r0.Q0
            r1 = 0
            if (r0 == 0) goto La2
            boolean r0 = r0.b
            if (r0 != r4) goto La2
            r16 = r4
            goto La4
        La2:
            r16 = r1
        La4:
            r11.<init>(r12, r14, r16, r17)
            k18 r0 = r9.b
            java.lang.Object r0 = r0.getValue()
            c6i r0 = (defpackage.c6i) r0
            r0.b(r11)
            goto Lc9
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lb9:
            yge r0 = new yge
            r0.<init>(r12, r14)
            k18 r1 = r9.b
            java.lang.Object r1 = r1.getValue()
            c6i r1 = (defpackage.c6i) r1
            r1.b(r0)
        Lc9:
            r0 = r12
            goto L4f
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix9.a(long, q44, java.util.List):java.lang.Object");
    }
}
