package defpackage;

/* loaded from: classes.dex */
public final class s46 implements z26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ uid b;
    public final /* synthetic */ z26 c;

    public s46(z26 z26Var, uid uidVar) {
        this.c = z26Var;
        this.b = uidVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof defpackage.w56
            if (r0 == 0) goto L18
            r0 = r6
            w56 r0 = (defpackage.w56) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.Y = r1
            goto L1d
        L18:
            w56 r0 = new w56
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            s46 r5 = r0.d
            defpackage.g8j.b(r6)
            goto L61
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.g8j.b(r6)
            uid r6 = r4.b
            java.lang.Object r1 = r6.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r3 = 20
            if (r1 != 0) goto L48
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r6.a = r1
        L48:
            r1.add(r5)
            int r5 = r1.size()
            if (r5 != r3) goto L66
            r0.d = r4
            r0.Y = r2
            z26 r5 = r4.c
            java.lang.Object r5 = r5.a(r1, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L60
            goto L68
        L60:
            r5 = r4
        L61:
            uid r5 = r5.b
            r6 = 0
            r5.a = r6
        L66:
            qqg r6 = defpackage.qqg.a
        L68:
            return r6
        L69:
            boolean r0 = r6 instanceof defpackage.r46
            if (r0 == 0) goto L7c
            r0 = r6
            r46 r0 = (defpackage.r46) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L7c
            int r1 = r1 - r2
            r0.Y = r1
            goto L81
        L7c:
            r46 r0 = new r46
            r0.<init>(r4, r6)
        L81:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L9a
            if (r1 != r2) goto L92
            s46 r5 = r0.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L90
            goto Lac
        L90:
            r6 = move-exception
            goto Lb1
        L92:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L9a:
            defpackage.g8j.b(r6)
            z26 r6 = r4.c     // Catch: java.lang.Throwable -> Laf
            r0.d = r4     // Catch: java.lang.Throwable -> Laf
            r0.Y = r2     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> Laf
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto Lac
            goto Lae
        Lac:
            qqg r6 = defpackage.qqg.a
        Lae:
            return r6
        Laf:
            r6 = move-exception
            r5 = r4
        Lb1:
            uid r5 = r5.b
            r5.a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s46.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public s46(uid uidVar, z26 z26Var) {
        this.b = uidVar;
        this.c = z26Var;
    }
}
