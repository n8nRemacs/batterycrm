package defpackage;

/* loaded from: classes2.dex */
public final class dc2 implements z26 {
    public int a;
    public final /* synthetic */ z26 b;
    public final /* synthetic */ hc2 c;
    public final /* synthetic */ long d;

    public dc2(z26 z26Var, hc2 hc2Var, long j) {
        this.c = hc2Var;
        this.d = j;
        this.b = z26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cc2
            if (r0 == 0) goto L13
            r0 = r12
            cc2 r0 = (defpackage.cc2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            cc2 r0 = new cc2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L26
            defpackage.g8j.b(r12)
            goto Lad
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            defpackage.g8j.b(r12)
            int r12 = r10.a
            int r1 = r12 + 1
            r10.a = r1
            if (r12 < 0) goto Lb0
            if (r12 != 0) goto La0
            r12 = r11
            ku3 r12 = (defpackage.ku3) r12
            if (r12 == 0) goto La0
            java.lang.String r12 = r12.e()
            if (r12 != 0) goto L47
            goto La0
        L47:
            hc2 r1 = r10.c
            ci5 r1 = r1.u0
            ojc r3 = new ojc
            int r4 = defpackage.x8b.g2
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            p5g r5 = new p5g
            java.util.List r12 = defpackage.ys.D(r12)
            r5.<init>(r4, r12)
            pq3 r12 = new pq3
            int r4 = defpackage.v8b.C0
            int r6 = defpackage.x8b.h2
            n5g r7 = new n5g
            r7.<init>(r6)
            r6 = 56
            r12.<init>(r4, r7, r2, r6)
            pq3 r4 = new pq3
            int r7 = defpackage.v8b.D0
            int r8 = defpackage.mvd.p
            n5g r9 = new n5g
            r9.<init>(r8)
            r8 = 2
            r4.<init>(r7, r9, r8, r6)
            pq3[] r12 = new defpackage.pq3[]{r12, r4}
            java.util.List r12 = defpackage.ve3.j(r12)
            long[] r4 = new long[r2]
            r6 = 0
            long r7 = r10.d
            r4[r6] = r7
            imb r6 = new imb
            java.lang.String r7 = "profile:adminslist:ids_to_delete"
            r6.<init>(r7, r4)
            imb[] r4 = new defpackage.imb[]{r6}
            android.os.Bundle r4 = defpackage.gwi.b(r4)
            r6 = 0
            r3.<init>(r5, r6, r12, r4)
            defpackage.xfh.r(r1, r3)
        La0:
            r0.o = r2
            z26 r12 = r10.b
            java.lang.Object r11 = r12.a(r11, r0)
            g84 r12 = defpackage.g84.a
            if (r11 != r12) goto Lad
            return r12
        Lad:
            qqg r11 = defpackage.qqg.a
            return r11
        Lb0:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Index overflow has happened"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
