package defpackage;

/* loaded from: classes2.dex */
public final class pcf implements z26 {
    public final /* synthetic */ uid a;
    public final /* synthetic */ z26 b;
    public final /* synthetic */ f84 c;
    public final /* synthetic */ long d;

    public pcf(uid uidVar, z26 z26Var, f84 f84Var, long j) {
        this.a = uidVar;
        this.b = z26Var;
        this.c = f84Var;
        this.d = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ocf
            if (r0 == 0) goto L13
            r0 = r6
            ocf r0 = (defpackage.ocf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ocf r0 = new ocf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            pcf r5 = r0.d
            defpackage.g8j.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r6)
            uid r6 = r4.a
            java.lang.Object r6 = r6.a
            qt7 r6 = (defpackage.qt7) r6
            boolean r6 = r6.isActive()
            if (r6 != 0) goto L61
            r0.d = r4
            r0.Y = r2
            z26 r6 = r4.b
            java.lang.Object r5 = r6.a(r5, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4d
            return r6
        L4d:
            r5 = r4
        L4e:
            uid r6 = r5.a
            f84 r0 = r5.c
            ncf r1 = new ncf
            long r2 = r5.d
            r5 = 0
            r1.<init>(r2, r5)
            r2 = 3
            x9f r5 = defpackage.svi.e(r0, r5, r5, r1, r2)
            r6.a = r5
        L61:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcf.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
