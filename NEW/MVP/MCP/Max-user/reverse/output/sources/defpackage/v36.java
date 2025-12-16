package defpackage;

/* loaded from: classes2.dex */
public final class v36 implements z26 {
    public final /* synthetic */ x74 X;
    public final /* synthetic */ tid a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sac c;
    public final /* synthetic */ uid d;
    public final /* synthetic */ f84 o;

    public v36(tid tidVar, long j, sac sacVar, uid uidVar, f84 f84Var, x74 x74Var) {
        this.a = tidVar;
        this.b = j;
        this.c = sacVar;
        this.d = uidVar;
        this.o = f84Var;
        this.X = x74Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.u36
            if (r2 == 0) goto L17
            r2 = r1
            u36 r2 = (defpackage.u36) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            u36 r2 = new u36
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.o
            int r3 = r2.Y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2c
            v36 r2 = r2.d
            defpackage.g8j.b(r1)
            goto L6a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            defpackage.g8j.b(r1)
            int r1 = defpackage.s65.d
            long r6 = java.lang.System.nanoTime()
            y65 r1 = defpackage.y65.NANOSECONDS
            long r6 = defpackage.v9j.i(r6, r1)
            long r10 = defpackage.s65.g(r6)
            tid r9 = r0.a
            long r12 = r9.a
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 >= 0) goto L78
            long r6 = r0.b
            long r10 = r10 + r6
            r9.a = r10
            r2.d = r0
            r2.Y = r5
            sac r1 = r0.c
            pac r1 = (defpackage.pac) r1
            pv0 r1 = r1.a
            r3 = r21
            java.lang.Object r1 = r1.h(r3, r2)
            g84 r2 = defpackage.g84.a
            if (r1 != r2) goto L69
            return r2
        L69:
            r2 = r0
        L6a:
            uid r1 = r2.d
            java.lang.Object r1 = r1.a
            bs4 r1 = (defpackage.bs4) r1
            if (r1 == 0) goto La3
            su7 r1 = (defpackage.su7) r1
            r1.cancel(r4)
            goto La3
        L78:
            r3 = r21
            uid r1 = r0.d
            java.lang.Object r2 = r1.a
            bs4 r2 = (defpackage.bs4) r2
            if (r2 == 0) goto L87
            su7 r2 = (defpackage.su7) r2
            r2.cancel(r4)
        L87:
            t36 r8 = new t36
            sac r2 = r0.c
            r19 = 0
            long r14 = r0.b
            x74 r5 = r0.X
            r17 = r2
            r18 = r3
            r16 = r5
            r8.<init>(r9, r10, r12, r14, r16, r17, r18, r19)
            r2 = 3
            f84 r3 = r0.o
            cs4 r2 = defpackage.svi.b(r3, r4, r8, r2)
            r1.a = r2
        La3:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v36.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
