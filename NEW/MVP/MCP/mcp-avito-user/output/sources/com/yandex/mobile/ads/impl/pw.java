package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes8.dex */
public final class pw implements ru {

    /* renamed from: f, reason: collision with root package name */
    private tu f389006f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f389008h;

    /* renamed from: i, reason: collision with root package name */
    private long f389009i;

    /* renamed from: j, reason: collision with root package name */
    private int f389010j;

    /* renamed from: k, reason: collision with root package name */
    private int f389011k;

    /* renamed from: l, reason: collision with root package name */
    private int f389012l;

    /* renamed from: m, reason: collision with root package name */
    private long f389013m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f389014n;

    /* renamed from: o, reason: collision with root package name */
    private rc f389015o;

    /* renamed from: p, reason: collision with root package name */
    private ni1 f389016p;

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f389001a = new pr0(4);

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f389002b = new pr0(9);

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f389003c = new pr0(11);

    /* renamed from: d, reason: collision with root package name */
    private final pr0 f389004d = new pr0();

    /* renamed from: e, reason: collision with root package name */
    private final u11 f389005e = new u11();

    /* renamed from: g, reason: collision with root package name */
    private int f389007g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new pw()};
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(com.yandex.mobile.ads.impl.to r12) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r11 = this;
            boolean r0 = r11.f389008h
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L11
            long r5 = r11.f389009i
            long r7 = r11.f389013m
            long r5 = r5 + r7
            goto L1f
        L11:
            com.yandex.mobile.ads.impl.u11 r0 = r11.f389005e
            long r5 = r0.a()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L1d
            r5 = r1
            goto L1f
        L1d:
            long r5 = r11.f389013m
        L1f:
            int r0 = r11.f389011k
            r7 = 8
            r8 = 1
            r9 = 0
            if (r0 != r7) goto L4b
            com.yandex.mobile.ads.impl.rc r7 = r11.f389015o
            if (r7 == 0) goto L4b
            boolean r0 = r11.f389014n
            if (r0 != 0) goto L3b
            com.yandex.mobile.ads.impl.tu r0 = r11.f389006f
            com.yandex.mobile.ads.impl.x21$b r7 = new com.yandex.mobile.ads.impl.x21$b
            r7.<init>(r3, r1)
            r0.a(r7)
            r11.f389014n = r8
        L3b:
            com.yandex.mobile.ads.impl.rc r0 = r11.f389015o
            com.yandex.mobile.ads.impl.pr0 r12 = r11.a(r12)
            r0.a(r12)
            boolean r12 = r0.a(r5, r12)
            if (r12 == 0) goto L78
            goto L75
        L4b:
            r7 = 9
            if (r0 != r7) goto L7a
            com.yandex.mobile.ads.impl.ni1 r7 = r11.f389016p
            if (r7 == 0) goto L7a
            boolean r0 = r11.f389014n
            if (r0 != 0) goto L63
            com.yandex.mobile.ads.impl.tu r0 = r11.f389006f
            com.yandex.mobile.ads.impl.x21$b r7 = new com.yandex.mobile.ads.impl.x21$b
            r7.<init>(r3, r1)
            r0.a(r7)
            r11.f389014n = r8
        L63:
            com.yandex.mobile.ads.impl.ni1 r0 = r11.f389016p
            com.yandex.mobile.ads.impl.pr0 r12 = r11.a(r12)
            boolean r7 = r0.a(r12)
            if (r7 == 0) goto L78
            boolean r12 = r0.a(r5, r12)
            if (r12 == 0) goto L78
        L75:
            r12 = r8
            r9 = r12
            goto Lb8
        L78:
            r12 = r8
            goto Lb8
        L7a:
            r7 = 18
            if (r0 != r7) goto Lb2
            boolean r0 = r11.f389014n
            if (r0 != 0) goto Lb2
            com.yandex.mobile.ads.impl.u11 r0 = r11.f389005e
            com.yandex.mobile.ads.impl.pr0 r12 = r11.a(r12)
            r0.getClass()
            boolean r9 = r0.a(r5, r12)
            com.yandex.mobile.ads.impl.u11 r12 = r11.f389005e
            long r5 = r12.a()
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 == 0) goto L78
            com.yandex.mobile.ads.impl.tu r12 = r11.f389006f
            com.yandex.mobile.ads.impl.v30 r0 = new com.yandex.mobile.ads.impl.v30
            com.yandex.mobile.ads.impl.u11 r7 = r11.f389005e
            long[] r7 = r7.b()
            com.yandex.mobile.ads.impl.u11 r10 = r11.f389005e
            long[] r10 = r10.c()
            r0.<init>(r5, r7, r10)
            r12.a(r0)
            r11.f389014n = r8
            goto L78
        Lb2:
            int r0 = r11.f389012l
            r12.a(r0)
            r12 = r9
        Lb8:
            boolean r0 = r11.f389008h
            if (r0 != 0) goto Lcf
            if (r9 == 0) goto Lcf
            r11.f389008h = r8
            com.yandex.mobile.ads.impl.u11 r0 = r11.f389005e
            long r5 = r0.a()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto Lcd
            long r0 = r11.f389013m
            long r1 = -r0
        Lcd:
            r11.f389009i = r1
        Lcf:
            r0 = 4
            r11.f389010j = r0
            r0 = 2
            r11.f389007g = r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pw.b(com.yandex.mobile.ads.impl.to):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar = (to) suVar;
        toVar.b(this.f389001a.c(), 0, 3, false);
        this.f389001a.e(0);
        if (this.f389001a.w() != 4607062) {
            return false;
        }
        toVar.b(this.f389001a.c(), 0, 2, false);
        this.f389001a.e(0);
        if ((this.f389001a.z() & 250) != 0) {
            return false;
        }
        toVar.b(this.f389001a.c(), 0, 4, false);
        this.f389001a.e(0);
        int iH2 = this.f389001a.h();
        toVar.c();
        toVar.a(false, iH2);
        toVar.b(this.f389001a.c(), 0, 4, false);
        this.f389001a.e(0);
        return this.f389001a.h() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f389006f = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f389007g = 1;
            this.f389008h = false;
        } else {
            this.f389007g = 3;
        }
        this.f389010j = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final int a(su suVar, fu0 fu0Var) {
        db.b(this.f389006f);
        while (true) {
            int i12 = this.f389007g;
            if (i12 == 1) {
                if (!((to) suVar).a(this.f389002b.c(), 0, 9, true)) {
                    return -1;
                }
                this.f389002b.e(0);
                this.f389002b.f(4);
                int iT2 = this.f389002b.t();
                boolean z12 = (iT2 & 4) != 0;
                boolean z13 = (iT2 & 1) != 0;
                if (z12 && this.f389015o == null) {
                    this.f389015o = new rc(this.f389006f.a(8, 1));
                }
                if (z13 && this.f389016p == null) {
                    this.f389016p = new ni1(this.f389006f.a(9, 2));
                }
                this.f389006f.a();
                this.f389010j = this.f389002b.h() - 5;
                this.f389007g = 2;
            } else if (i12 == 2) {
                ((to) suVar).a(this.f389010j);
                this.f389010j = 0;
                this.f389007g = 3;
            } else if (i12 == 3) {
                if (!((to) suVar).a(this.f389003c.c(), 0, 11, true)) {
                    return -1;
                }
                this.f389003c.e(0);
                this.f389011k = this.f389003c.t();
                this.f389012l = this.f389003c.w();
                this.f389013m = this.f389003c.w();
                this.f389013m = ((this.f389003c.t() << 24) | this.f389013m) * 1000;
                this.f389003c.f(3);
                this.f389007g = 4;
            } else if (i12 == 4) {
                if (b((to) suVar)) {
                    return 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private pr0 a(to toVar) throws EOFException, InterruptedIOException {
        if (this.f389012l > this.f389004d.b()) {
            pr0 pr0Var = this.f389004d;
            pr0Var.a(0, new byte[Math.max(pr0Var.b() * 2, this.f389012l)]);
        } else {
            this.f389004d.e(0);
        }
        this.f389004d.d(this.f389012l);
        toVar.a(this.f389004d.c(), 0, this.f389012l, false);
        return this.f389004d;
    }
}
