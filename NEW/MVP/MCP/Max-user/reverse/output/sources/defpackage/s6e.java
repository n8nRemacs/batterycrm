package defpackage;

/* loaded from: classes2.dex */
public final class s6e implements l7e {
    public static final /* synthetic */ int c = 0;
    public final k18 a;
    public final k18 b;

    public s6e(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.s6e r4, java.lang.Throwable r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.r6e
            if (r0 == 0) goto L13
            r0 = r6
            r6e r0 = (defpackage.r6e) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            r6e r0 = new r6e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.d
            int r6 = r0.X
            r1 = 1
            if (r6 == 0) goto L2d
            if (r6 != r1) goto L25
            defpackage.g8j.b(r4)
            goto L88
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.g8j.b(r4)
            boolean r4 = r5 instanceof java.util.concurrent.TimeoutException
            r6 = 0
            java.lang.String r2 = "request failed with "
            java.lang.String r3 = "s6e"
            if (r4 != 0) goto L61
            boolean r4 = r5 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r4 == 0) goto L4b
            r4 = r5
            ru.ok.tamtam.errors.TamErrorException r4 = (ru.ok.tamtam.errors.TamErrorException) r4
            pzf r4 = r4.a
            java.lang.String r4 = r4.b
            boolean r4 = defpackage.qaj.c(r4)
            if (r4 == 0) goto L4b
            goto L61
        L4b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r5)
            java.lang.String r5 = ". Couldn't recover"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.wqi.e(r3, r4, r6)
            r1 = 0
            goto L88
        L61:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r5)
            java.lang.String r5 = ". Retrying"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.wqi.e(r3, r4, r6)
            int r4 = defpackage.s65.d
            y65 r4 = defpackage.y65.SECONDS
            long r4 = defpackage.v9j.h(r1, r4)
            r0.X = r1
            java.lang.Object r4 = defpackage.s8j.d(r4, r0)
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L88
            return r5
        L88:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6e.b(s6e, java.lang.Throwable, q44):java.lang.Object");
    }

    @Override // defpackage.l7e
    public final m36 a(int i, Object obj, String str) {
        return new m36(gw0.A(new mwd(new p6e(i, this, (Long) obj, str, null)), 2L, new q6e(this, null)), new op2(3, null, 5));
    }
}
