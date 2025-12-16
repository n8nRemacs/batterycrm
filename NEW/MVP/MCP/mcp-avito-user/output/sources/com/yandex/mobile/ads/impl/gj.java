package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dd0;

/* loaded from: classes8.dex */
public final class gj implements dd0, dd0.a {

    /* renamed from: b, reason: collision with root package name */
    public final dd0 f385761b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private dd0.a f385762c;

    /* renamed from: d, reason: collision with root package name */
    private a[] f385763d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    private long f385764e;

    /* renamed from: f, reason: collision with root package name */
    long f385765f;

    /* renamed from: g, reason: collision with root package name */
    long f385766g;

    public final class a implements n11 {

        /* renamed from: a, reason: collision with root package name */
        public final n11 f385767a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f385768b;

        public a(n11 n11Var) {
            this.f385767a = n11Var;
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final void a() {
            this.f385767a.a();
        }

        public final void b() {
            this.f385768b = false;
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final boolean d() {
            return !gj.this.a() && this.f385767a.d();
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final int a(ww wwVar, vn vnVar, int i12) {
            if (gj.this.a()) {
                return -3;
            }
            if (this.f385768b) {
                vnVar.d(4);
                return -4;
            }
            int iA2 = this.f385767a.a(wwVar, vnVar, i12);
            if (iA2 == -5) {
                vw vwVar = wwVar.f391506b;
                vwVar.getClass();
                int i13 = vwVar.f391165B;
                if (i13 != 0 || vwVar.f391166C != 0) {
                    gj gjVar = gj.this;
                    if (gjVar.f385765f != 0) {
                        i13 = 0;
                    }
                    wwVar.f391506b = vwVar.a().e(i13).f(gjVar.f385766g == Long.MIN_VALUE ? vwVar.f391166C : 0).a();
                }
                return -5;
            }
            gj gjVar2 = gj.this;
            long j12 = gjVar2.f385766g;
            if (j12 == Long.MIN_VALUE || ((iA2 != -4 || vnVar.f390953e < j12) && !(iA2 == -3 && gjVar2.getBufferedPositionUs() == Long.MIN_VALUE && !vnVar.f390952d))) {
                return iA2;
            }
            vnVar.b();
            vnVar.d(4);
            this.f385768b = true;
            return -4;
        }

        @Override // com.yandex.mobile.ads.impl.n11
        public final int a(long j12) {
            if (gj.this.a()) {
                return -3;
            }
            return this.f385767a.a(j12);
        }
    }

    public gj(dd0 dd0Var, boolean z12, long j12, long j13) {
        this.f385761b = dd0Var;
        this.f385764e = z12 ? j12 : -9223372036854775807L;
        this.f385765f = j12;
        this.f385766g = j13;
    }

    @Override // com.yandex.mobile.ads.impl.g31.a
    public final void a(g31 g31Var) {
        dd0.a aVar = this.f385762c;
        aVar.getClass();
        aVar.a((dd0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean continueLoading(long j12) {
        return this.f385761b.continueLoading(j12);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void discardBuffer(long j12, boolean z12) {
        this.f385761b.discardBuffer(j12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f385761b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j12 = this.f385766g;
            if (j12 == Long.MIN_VALUE || bufferedPositionUs < j12) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f385761b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j12 = this.f385766g;
            if (j12 == Long.MIN_VALUE || nextLoadPositionUs < j12) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final w91 getTrackGroups() {
        return this.f385761b.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean isLoading() {
        return this.f385761b.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void maybeThrowPrepareError() {
        this.f385761b.maybeThrowPrepareError();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long readDiscontinuity() {
        if (a()) {
            long j12 = this.f385764e;
            this.f385764e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j12;
        }
        long discontinuity2 = this.f385761b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        db.b(discontinuity2 >= this.f385765f);
        long j13 = this.f385766g;
        db.b(j13 == Long.MIN_VALUE || discontinuity2 <= j13);
        return discontinuity2;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void reevaluateBuffer(long j12) {
        this.f385761b.reevaluateBuffer(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.yandex.mobile.ads.impl.dd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f385764e = r0
            com.yandex.mobile.ads.impl.gj$a[] r0 = r5.f385763d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.yandex.mobile.ads.impl.dd0 r0 = r5.f385761b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f385765f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f385766g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.yandex.mobile.ads.impl.db.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gj.seekToUs(long):long");
    }

    public final void a(long j12) {
        this.f385765f = 0L;
        this.f385766g = j12;
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void a(dd0.a aVar, long j12) {
        this.f385762c = aVar;
        this.f385761b.a(this, j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // com.yandex.mobile.ads.impl.dd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.yandex.mobile.ads.impl.cu[] r14, boolean[] r15, com.yandex.mobile.ads.impl.n11[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            com.yandex.mobile.ads.impl.gj$a[] r1 = new com.yandex.mobile.ads.impl.gj.a[r1]
            r0.f385763d = r1
            int r1 = r9.length
            com.yandex.mobile.ads.impl.n11[] r10 = new com.yandex.mobile.ads.impl.n11[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            com.yandex.mobile.ads.impl.gj$a[] r2 = r0.f385763d
            r3 = r9[r1]
            com.yandex.mobile.ads.impl.gj$a r3 = (com.yandex.mobile.ads.impl.gj.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            com.yandex.mobile.ads.impl.n11 r12 = r3.f385767a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            com.yandex.mobile.ads.impl.dd0 r1 = r0.f385761b
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.a(r2, r3, r4, r5, r6)
            boolean r3 = r13.a()
            if (r3 == 0) goto L5d
            long r3 = r0.f385765f
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5d
            int r3 = r8.length
            r4 = r11
        L44:
            if (r4 >= r3) goto L5d
            r5 = r8[r4]
            if (r5 == 0) goto L5a
            com.yandex.mobile.ads.impl.vw r5 = r5.d()
            java.lang.String r6 = r5.f391181l
            java.lang.String r5 = r5.f391178i
            boolean r5 = com.yandex.mobile.ads.impl.qg0.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f385764e = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f385765f
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f385766g
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7b
            goto L7d
        L7b:
            r3 = r11
            goto L7e
        L7d:
            r3 = 1
        L7e:
            com.yandex.mobile.ads.impl.db.b(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            com.yandex.mobile.ads.impl.gj$a[] r3 = r0.f385763d
            r3[r11] = r12
            goto L9e
        L8d:
            com.yandex.mobile.ads.impl.gj$a[] r4 = r0.f385763d
            r5 = r4[r11]
            if (r5 == 0) goto L97
            com.yandex.mobile.ads.impl.n11 r5 = r5.f385767a
            if (r5 == r3) goto L9e
        L97:
            com.yandex.mobile.ads.impl.gj$a r5 = new com.yandex.mobile.ads.impl.gj$a
            r5.<init>(r3)
            r4[r11] = r5
        L9e:
            com.yandex.mobile.ads.impl.gj$a[] r3 = r0.f385763d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gj.a(com.yandex.mobile.ads.impl.cu[], boolean[], com.yandex.mobile.ads.impl.n11[], boolean[], long):long");
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long a(long j12, y21 y21Var) {
        long j13 = this.f385765f;
        if (j12 == j13) {
            return j13;
        }
        int i12 = pc1.f388768a;
        long jMax = Math.max(0L, Math.min(y21Var.f391899a, j12 - j13));
        long j14 = y21Var.f391900b;
        long j15 = this.f385766g;
        long jMax2 = Math.max(0L, Math.min(j14, j15 == Long.MIN_VALUE ? Long.MAX_VALUE : j15 - j12));
        if (jMax != y21Var.f391899a || jMax2 != y21Var.f391900b) {
            y21Var = new y21(jMax, jMax2);
        }
        return this.f385761b.a(j12, y21Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd0.a
    public final void a(dd0 dd0Var) {
        dd0.a aVar = this.f385762c;
        aVar.getClass();
        aVar.a((dd0) this);
    }

    public final boolean a() {
        return this.f385764e != -9223372036854775807L;
    }
}
