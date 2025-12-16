package defpackage;

/* loaded from: classes.dex */
public final class su1 extends u92 {
    public final dtf X;

    /* JADX WARN: Multi-variable type inference failed */
    public su1(sm6 sm6Var, x74 x74Var, int i, int i2) {
        super(sm6Var, x74Var, i, i2);
        this.X = (dtf) sm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.u92, defpackage.t92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.sac r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ru1
            if (r0 == 0) goto L13
            r0 = r6
            ru1 r0 = (defpackage.ru1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            ru1 r0 = new ru1
            q44 r6 = (defpackage.q44) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            sac r5 = r0.d
            defpackage.g8j.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            r0.d = r5
            r0.Y = r2
            java.lang.Object r6 = super.j(r5, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L41
            return r0
        L41:
            pac r5 = (defpackage.pac) r5
            pv0 r5 = r5.a
            boolean r5 = r5.w()
            if (r5 == 0) goto L4e
            qqg r5 = defpackage.qqg.a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su1.j(sac, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, sm6] */
    @Override // defpackage.u92, defpackage.t92
    public final t92 k(x74 x74Var, int i, int i2) {
        return new su1(this.X, x74Var, i, i2);
    }
}
