package com.google.android.exoplayer2;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* renamed from: com.google.android.exoplayer2.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36529j implements M {

    /* renamed from: a, reason: collision with root package name */
    public final float f345422a;

    /* renamed from: b, reason: collision with root package name */
    public final float f345423b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f345425d;

    /* renamed from: e, reason: collision with root package name */
    public final long f345426e;

    /* renamed from: f, reason: collision with root package name */
    public final long f345427f;

    /* renamed from: g, reason: collision with root package name */
    public final float f345428g;

    /* renamed from: n, reason: collision with root package name */
    public float f345435n;

    /* renamed from: o, reason: collision with root package name */
    public float f345436o;

    /* renamed from: h, reason: collision with root package name */
    public long f345429h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f345430i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f345432k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f345433l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f345437p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f345438q = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public long f345431j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f345434m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f345439r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f345440s = -9223372036854775807L;

    /* compiled from: DefaultLivePlaybackSpeedControl.java */
    /* renamed from: com.google.android.exoplayer2.j$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f345441a = com.google.android.exoplayer2.util.U.H(20);

        /* renamed from: b, reason: collision with root package name */
        public final long f345442b = com.google.android.exoplayer2.util.U.H(500);

        /* renamed from: c, reason: collision with root package name */
        public final float f345443c = 0.999f;
    }

    public C36529j(float f12, float f13, long j12, float f14, long j13, long j14, float f15, a aVar) {
        this.f345422a = f12;
        this.f345423b = f13;
        this.f345424c = j12;
        this.f345425d = f14;
        this.f345426e = j13;
        this.f345427f = j14;
        this.f345428g = f15;
        this.f345436o = f12;
        this.f345435n = f13;
    }

    public final void a() {
        long j12 = this.f345429h;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f345430i;
            if (j13 != -9223372036854775807L) {
                j12 = j13;
            }
            long j14 = this.f345432k;
            if (j14 != -9223372036854775807L && j12 < j14) {
                j12 = j14;
            }
            long j15 = this.f345433l;
            if (j15 != -9223372036854775807L && j12 > j15) {
                j12 = j15;
            }
        } else {
            j12 = -9223372036854775807L;
        }
        if (this.f345431j == j12) {
            return;
        }
        this.f345431j = j12;
        this.f345434m = j12;
        this.f345439r = -9223372036854775807L;
        this.f345440s = -9223372036854775807L;
        this.f345438q = -9223372036854775807L;
    }

    public final void b(long j12) {
        this.f345430i = j12;
        a();
    }
}
