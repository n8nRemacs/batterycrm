package defpackage;

/* loaded from: classes2.dex */
public final class ez5 implements t3h {
    public final hwa a;
    public final long b;
    public final long c;
    public final long d;
    public final String o = ez5.class.getName();

    public ez5(hwa hwaVar, long j, long j2, long j3) {
        this.a = hwaVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.t3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.cz5
            if (r0 == 0) goto L13
            r0 = r14
            cz5 r0 = (defpackage.cz5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            cz5 r0 = new cz5
            q44 r14 = (defpackage.q44) r14
            r0.<init>(r13, r14)
        L1a:
            java.lang.Object r14 = r0.d
            g84 r1 = defpackage.g84.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.g8j.b(r14)
            goto L7a
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L31:
            defpackage.g8j.b(r14)
            java.lang.String r14 = r13.o
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L3b
            goto L64
        L3b:
            lg8 r4 = defpackage.lg8.d
            boolean r5 = r2.b(r4)
            if (r5 == 0) goto L64
            long r5 = r13.b
            long r7 = r13.c
            long r9 = r13.d
            java.lang.String r11 = "Fetch video. File fetcher, fileId "
            java.lang.String r12 = " chatId "
            java.lang.StringBuilder r5 = defpackage.az1.l(r5, r11, r12)
            r5.append(r7)
            java.lang.String r6 = " messageId "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r2.c(r4, r14, r5, r6)
        L64:
            hwa r14 = r13.a
            fh2 r4 = new fh2
            long r5 = r13.b
            long r7 = r13.c
            long r9 = r13.d
            r4.<init>(r5, r7, r9)
            r0.X = r3
            java.lang.Object r14 = r14.F(r4, r0)
            if (r14 != r1) goto L7a
            return r1
        L7a:
            aw5 r14 = (defpackage.aw5) r14
            qu5 r0 = new qu5
            r1 = 3
            java.lang.String r14 = r14.c
            r0.<init>(r1, r14)
            su5 r14 = new su5
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r14.<init>(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
