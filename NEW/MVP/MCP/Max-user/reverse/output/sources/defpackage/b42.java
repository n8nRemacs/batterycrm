package defpackage;

/* loaded from: classes2.dex */
public final class b42 {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public b42(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r19, long r21, long r23, long r25, defpackage.f9d r27, defpackage.q44 r28) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            r0 = r28
            boolean r4 = r0 instanceof defpackage.a42
            if (r4 == 0) goto L19
            r4 = r0
            a42 r4 = (defpackage.a42) r4
            int r5 = r4.u0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.u0 = r5
            goto L1e
        L19:
            a42 r4 = new a42
            r4.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r4.s0
            int r5 = r4.u0
            java.lang.String r6 = "b42"
            r7 = 1
            if (r5 == 0) goto L46
            if (r5 != r7) goto L3e
            long r2 = r4.Z
            long r7 = r4.Y
            long r9 = r4.X
            long r11 = r4.o
            b42 r4 = r4.d
            defpackage.g8j.b(r0)     // Catch: java.lang.Throwable -> L3b
            r14 = r11
            r12 = r9
            r10 = r14
            r14 = r7
            goto L79
        L3b:
            r0 = move-exception
            goto Lad
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L46:
            defpackage.g8j.b(r0)
            java.lang.String r0 = "reactions, msgCancelReaction"
            defpackage.wqi.d(r6, r0)
            k18 r0 = r1.b     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lab
            em9 r0 = (defpackage.em9) r0     // Catch: java.lang.Throwable -> Lab
            r4.d = r1     // Catch: java.lang.Throwable -> Lab
            r8 = r19
            r4.o = r8     // Catch: java.lang.Throwable -> Lab
            r4.X = r2     // Catch: java.lang.Throwable -> Lab
            r10 = r23
            r4.Y = r10     // Catch: java.lang.Throwable -> Lab
            r12 = r25
            r4.Z = r12     // Catch: java.lang.Throwable -> Lab
            r4.u0 = r7     // Catch: java.lang.Throwable -> Lab
            r5 = r27
            java.lang.Object r0 = r0.d(r2, r5, r4)     // Catch: java.lang.Throwable -> Lab
            g84 r4 = defpackage.g84.a
            if (r0 != r4) goto L73
            return r4
        L73:
            r14 = r12
            r12 = r2
            r2 = r14
            r4 = r1
            r14 = r10
            r10 = r8
        L79:
            k18 r0 = r4.a     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L3b
            hwa r0 = (defpackage.hwa) r0     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r0.j(r10)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L88
            goto Lca
        L88:
            boolean r5 = r0.k(r12)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L8f
            goto Lca
        L8f:
            boolean r5 = r0.l(r2)     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L96
            goto Lca
        L96:
            l4a r7 = new l4a     // Catch: java.lang.Throwable -> L3b
            z7c r5 = r0.t()     // Catch: java.lang.Throwable -> L3b
            pe8 r5 = r5.a     // Catch: java.lang.Throwable -> L3b
            long r8 = r5.k()     // Catch: java.lang.Throwable -> L3b
            r16 = r2
            r7.<init>(r8, r10, r12, r14, r16)     // Catch: java.lang.Throwable -> L3b
            defpackage.hwa.r(r0, r7)     // Catch: java.lang.Throwable -> L3b
            goto Lca
        Lab:
            r0 = move-exception
            r4 = r1
        Lad:
            java.lang.String r2 = "reactions, cancelReaction async query failed"
            defpackage.wqi.b(r6, r2, r0)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = ". reactions, cancelReaction async query failed"
            java.lang.String r3 = r6.concat(r3)
            r2.<init>(r3, r0)
            k18 r0 = r4.c
            java.lang.Object r0 = r0.getValue()
            yi5 r0 = (defpackage.yi5) r0
            y3b r0 = (defpackage.y3b) r0
            r0.a(r2)
        Lca:
            qqg r0 = defpackage.qqg.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b42.a(long, long, long, long, f9d, q44):java.lang.Object");
    }
}
