package defpackage;

/* loaded from: classes.dex */
public final class mwd implements x26, o42 {
    public final dtf a;

    /* JADX WARN: Multi-variable type inference failed */
    public mwd(sm6 sm6Var) {
        this.a = (dtf) sm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [dtf, sm6] */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.z0
            if (r0 == 0) goto L13
            r0 = r7
            z0 r0 = (defpackage.z0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            z0 r0 = new z0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            qqg r2 = defpackage.qqg.a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            iwd r6 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.g8j.b(r7)
            iwd r7 = new iwd
            x74 r1 = r0.b
            r7.<init>(r6, r1)
            r0.d = r7     // Catch: java.lang.Throwable -> L59
            r0.Y = r3     // Catch: java.lang.Throwable -> L59
            dtf r6 = r5.a     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L59
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L4c
            goto L4d
        L4c:
            r6 = r2
        L4d:
            if (r6 != r0) goto L50
            return r0
        L50:
            r6 = r7
        L51:
            r6.o()
            return r2
        L55:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L5b
        L59:
            r6 = move-exception
            goto L55
        L5b:
            r6.o()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwd.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
