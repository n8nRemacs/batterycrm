package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class zo implements o90 {

    /* renamed from: a, reason: collision with root package name */
    private final eo f392304a;

    /* renamed from: b, reason: collision with root package name */
    private final long f392305b;

    /* renamed from: c, reason: collision with root package name */
    private final long f392306c;

    /* renamed from: d, reason: collision with root package name */
    private final long f392307d;

    /* renamed from: e, reason: collision with root package name */
    private final long f392308e;

    /* renamed from: f, reason: collision with root package name */
    private final int f392309f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f392310g;

    /* renamed from: h, reason: collision with root package name */
    private final long f392311h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f392312i;

    /* renamed from: j, reason: collision with root package name */
    private int f392313j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f392314k;

    public zo() {
        this(new eo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.o90
    public final void a(ux0[] ux0VarArr, cu[] cuVarArr) {
        int iMax = this.f392309f;
        if (iMax == -1) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = 13107200;
                if (i12 < ux0VarArr.length) {
                    if (cuVarArr[i12] != null) {
                        switch (ux0VarArr[i12].m()) {
                            case -2:
                                i14 = 0;
                                i13 += i14;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i14 = 144310272;
                                i13 += i14;
                                break;
                            case 1:
                                i13 += i14;
                                break;
                            case 2:
                                i14 = 131072000;
                                i13 += i14;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i14 = 131072;
                                i13 += i14;
                                break;
                        }
                    }
                    i12++;
                } else {
                    iMax = Math.max(13107200, i13);
                }
            }
        }
        this.f392313j = iMax;
        this.f392304a.a(iMax);
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final void b() {
        int i12 = this.f392309f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        this.f392313j = i12;
        this.f392314k = false;
        this.f392304a.d();
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final eo c() {
        return this.f392304a;
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final void d() {
        int i12 = this.f392309f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        this.f392313j = i12;
        this.f392314k = false;
        this.f392304a.d();
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final long e() {
        return this.f392311h;
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final void f() {
        int i12 = this.f392309f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        this.f392313j = i12;
        this.f392314k = false;
    }

    public zo(eo eoVar) {
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f392304a = eoVar;
        long j12 = 50000;
        this.f392305b = pc1.a(j12);
        this.f392306c = pc1.a(j12);
        this.f392307d = pc1.a(2500);
        this.f392308e = pc1.a(5000);
        this.f392309f = -1;
        this.f392313j = 13107200;
        this.f392310g = false;
        this.f392311h = pc1.a(0);
        this.f392312i = false;
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final boolean a() {
        return this.f392312i;
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final boolean a(long j12, float f12) {
        boolean z12 = true;
        boolean z13 = this.f392304a.c() >= this.f392313j;
        long jMin = this.f392305b;
        if (f12 > 1.0f) {
            int i12 = pc1.f388768a;
            if (f12 != 1.0f) {
                jMin = Math.round(jMin * f12);
            }
            jMin = Math.min(jMin, this.f392306c);
        }
        if (j12 < Math.max(jMin, 500000L)) {
            if (!this.f392310g && z13) {
                z12 = false;
            }
            this.f392314k = z12;
            if (!z12 && j12 < 500000) {
                ka0.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= this.f392306c || z13) {
            this.f392314k = false;
        }
        return this.f392314k;
    }

    @Override // com.yandex.mobile.ads.impl.o90
    public final boolean a(long j12, float f12, boolean z12, long j13) {
        int i12 = pc1.f388768a;
        if (f12 != 1.0f) {
            j12 = Math.round(j12 / f12);
        }
        long jMin = z12 ? this.f392308e : this.f392307d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(j13 / 2, jMin);
        }
        return jMin <= 0 || j12 >= jMin || (!this.f392310g && this.f392304a.c() >= this.f392313j);
    }

    private static void a(int i12, int i13, String str, String str2) {
        db.a(str + " cannot be less than " + str2, i12 >= i13);
    }
}
