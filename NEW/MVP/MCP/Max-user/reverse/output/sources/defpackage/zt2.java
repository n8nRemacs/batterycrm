package defpackage;

/* loaded from: classes2.dex */
public final class zt2 implements z26 {
    public int a;
    public final /* synthetic */ z26 b;
    public final /* synthetic */ f84 c;
    public final /* synthetic */ bu2 d;

    public zt2(z26 z26Var, f84 f84Var, bu2 bu2Var) {
        this.c = f84Var;
        this.d = bu2Var;
        this.b = z26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.yt2
            if (r0 == 0) goto L13
            r0 = r9
            yt2 r0 = (defpackage.yt2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            yt2 r0 = new yt2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r9)
            goto L60
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            defpackage.g8j.b(r9)
            int r9 = r7.a
            int r1 = r9 + 1
            r7.a = r1
            if (r9 < 0) goto L63
            if (r9 != 0) goto L53
            r9 = r8
            pb2 r9 = (defpackage.pb2) r9
            st2 r1 = new st2
            bu2 r3 = r7.d
            r4 = 0
            r1.<init>(r3, r9, r4)
            f84 r5 = r7.c
            r6 = 3
            defpackage.svi.e(r5, r4, r4, r1, r6)
            tt2 r1 = new tt2
            r1.<init>(r3, r9, r4)
            defpackage.svi.e(r5, r4, r4, r1, r6)
        L53:
            r0.o = r2
            z26 r9 = r7.b
            java.lang.Object r8 = r9.a(r8, r0)
            g84 r9 = defpackage.g84.a
            if (r8 != r9) goto L60
            return r9
        L60:
            qqg r8 = defpackage.qqg.a
            return r8
        L63:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
