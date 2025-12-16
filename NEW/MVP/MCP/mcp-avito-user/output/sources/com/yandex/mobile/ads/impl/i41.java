package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.xc0;

/* loaded from: classes8.dex */
public final class i41 extends i91 {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f386295o = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f386296b;

    /* renamed from: c, reason: collision with root package name */
    private final long f386297c;

    /* renamed from: d, reason: collision with root package name */
    private final long f386298d;

    /* renamed from: e, reason: collision with root package name */
    private final long f386299e;

    /* renamed from: f, reason: collision with root package name */
    private final long f386300f;

    /* renamed from: g, reason: collision with root package name */
    private final long f386301g;

    /* renamed from: h, reason: collision with root package name */
    private final long f386302h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f386303i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f386304j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f386305k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private final Object f386306l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private final xc0 f386307m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private final xc0.e f386308n;

    static {
        new xc0.a().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    public i41(long j12, long j13, boolean z12, boolean z13, xc0 xc0Var) {
        this(j12, j13, z12, xc0Var, z13 ? xc0Var.f391607c : null);
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int b() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.mobile.ads.impl.i91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.i91.d a(int r25, com.yandex.mobile.ads.impl.i91.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.yandex.mobile.ads.impl.db.a(r2, r1)
            long r1 = r0.f386302h
            boolean r14 = r0.f386304j
            if (r14 == 0) goto L2d
            boolean r3 = r0.f386305k
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f386300f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
        L2a:
            r16 = r5
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.yandex.mobile.ads.impl.i91.d.f386400r
            com.yandex.mobile.ads.impl.xc0 r5 = r0.f386307m
            java.lang.Object r6 = r0.f386306l
            long r7 = r0.f386296b
            long r9 = r0.f386297c
            long r11 = r0.f386298d
            boolean r13 = r0.f386303i
            com.yandex.mobile.ads.impl.xc0$e r15 = r0.f386308n
            long r1 = r0.f386300f
            r18 = r1
            long r1 = r0.f386301g
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.yandex.mobile.ads.impl.i91$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i41.a(int, com.yandex.mobile.ads.impl.i91$d, long):com.yandex.mobile.ads.impl.i91$d");
    }

    public i41(long j12, long j13, boolean z12, xc0 xc0Var, @j.P xc0.e eVar) {
        this.f386296b = -9223372036854775807L;
        this.f386297c = -9223372036854775807L;
        this.f386298d = -9223372036854775807L;
        this.f386299e = j12;
        this.f386300f = j13;
        this.f386301g = 0L;
        this.f386302h = 0L;
        this.f386303i = z12;
        this.f386304j = false;
        this.f386305k = false;
        this.f386306l = null;
        this.f386307m = (xc0) db.a(xc0Var);
        this.f386308n = eVar;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final i91.b a(int i12, i91.b bVar, boolean z12) {
        db.a(i12, 1);
        Object obj = z12 ? f386295o : null;
        long j12 = this.f386299e;
        long j13 = -this.f386301g;
        bVar.getClass();
        return bVar.a(null, obj, 0, j12, j13, g4.f385558g, false);
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int a(Object obj) {
        return f386295o.equals(obj) ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final Object a(int i12) {
        db.a(i12, 1);
        return f386295o;
    }
}
