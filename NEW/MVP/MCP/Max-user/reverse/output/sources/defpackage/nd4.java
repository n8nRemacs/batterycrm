package defpackage;

/* loaded from: classes.dex */
public final class nd4 extends s9g {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final ad4 l;
    public final k09 m;
    public final yz8 n;

    public nd4(long j, long j2, long j3, int i, long j4, long j5, long j6, ad4 ad4Var, k09 k09Var, yz8 yz8Var) {
        hsi.g(ad4Var.d == (yz8Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = ad4Var;
        this.m = k09Var;
        this.n = yz8Var;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        hsi.c(i, h());
        ad4 ad4Var = this.l;
        String str = z ? ad4Var.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
        long jD = ad4Var.d(i);
        long jU = zxg.U(ad4Var.b(i).b - ad4Var.b(0).b) - this.i;
        m9gVar.getClass();
        m9gVar.i(str, numValueOf, 0, jD, jU, v8.f, false);
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return this.l.m.size();
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        hsi.c(i, h());
        return Integer.valueOf(this.h + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    @Override // defpackage.s9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q9g m(int r24, defpackage.q9g r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            defpackage.hsi.c(r2, r1)
            ad4 r5 = r0.l
            boolean r2 = r5.d
            r3 = 0
            long r6 = r0.k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L8d
            long r10 = r5.e
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L8d
            long r10 = r5.b
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 != 0) goto L8d
            r10 = 0
            int r2 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r2 <= 0) goto L35
            long r6 = r6 + r26
            long r12 = r0.j
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L35
            r16 = r1
            r1 = r3
            r6 = r8
            goto L90
        L35:
            long r12 = r0.i
            long r12 = r12 + r6
            long r14 = r5.d(r3)
            r2 = r3
        L3d:
            java.util.List r4 = r5.m
            int r4 = r4.size()
            int r4 = r4 - r1
            if (r2 >= r4) goto L52
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 < 0) goto L52
            long r12 = r12 - r14
            int r2 = r2 + 1
            long r14 = r5.d(r2)
            goto L3d
        L52:
            lrb r2 = r5.b(r2)
            r4 = 2
            int r4 = r2.a(r4)
            r16 = r1
            r1 = -1
            if (r4 != r1) goto L61
            goto L8b
        L61:
            java.util.List r1 = r2.c
            java.lang.Object r1 = r1.get(r4)
            x8 r1 = (defpackage.x8) r1
            java.util.List r1 = r1.c
            java.lang.Object r1 = r1.get(r3)
            ymd r1 = (defpackage.ymd) r1
            ud4 r1 = r1.c()
            if (r1 == 0) goto L8b
            long r17 = r1.D(r14)
            int r2 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r2 != 0) goto L80
            goto L8b
        L80:
            long r10 = r1.u(r12, r14)
            long r1 = r1.b(r10)
            long r1 = r1 + r6
            long r6 = r1 - r12
        L8b:
            r1 = r3
            goto L90
        L8d:
            r16 = r1
            goto L8b
        L90:
            java.lang.Object r3 = defpackage.q9g.q
            boolean r2 = r5.d
            if (r2 == 0) goto La5
            long r10 = r5.e
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto La5
            long r10 = r5.b
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 != 0) goto La5
            r13 = r16
            goto La6
        La5:
            r13 = r1
        La6:
            int r1 = r0.h()
            int r20 = r1 + (-1)
            long r1 = r0.i
            k09 r4 = r0.m
            r15 = r6
            long r6 = r0.e
            long r8 = r0.f
            long r10 = r0.g
            yz8 r14 = r0.n
            r24 = r13
            long r12 = r0.j
            r19 = 0
            r21 = r1
            r17 = r12
            r12 = 1
            r13 = r24
            r2 = r25
            r2.b(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd4.m(int, q9g, long):q9g");
    }

    @Override // defpackage.s9g
    public final int o() {
        return 1;
    }
}
