package androidx.media3.exoplayer;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23140i implements G {

    /* renamed from: a, reason: collision with root package name */
    public final float f49175a;

    /* renamed from: b, reason: collision with root package name */
    public final float f49176b;

    /* renamed from: c, reason: collision with root package name */
    public final long f49177c;

    /* renamed from: d, reason: collision with root package name */
    public final float f49178d;

    /* renamed from: e, reason: collision with root package name */
    public final long f49179e;

    /* renamed from: f, reason: collision with root package name */
    public final long f49180f;

    /* renamed from: g, reason: collision with root package name */
    public final float f49181g;

    /* renamed from: n, reason: collision with root package name */
    public float f49188n;

    /* renamed from: o, reason: collision with root package name */
    public float f49189o;

    /* renamed from: h, reason: collision with root package name */
    public long f49182h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f49183i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f49185k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f49186l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f49190p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f49191q = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public long f49184j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f49187m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f49192r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f49193s = -9223372036854775807L;

    /* compiled from: DefaultLivePlaybackSpeedControl.java */
    /* renamed from: androidx.media3.exoplayer.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f49194a = androidx.media3.common.util.M.F(20);

        /* renamed from: b, reason: collision with root package name */
        public final long f49195b = androidx.media3.common.util.M.F(500);

        /* renamed from: c, reason: collision with root package name */
        public final float f49196c = 0.999f;
    }

    public C23140i(float f12, float f13, long j12, float f14, long j13, long j14, float f15, a aVar) {
        this.f49175a = f12;
        this.f49176b = f13;
        this.f49177c = j12;
        this.f49178d = f14;
        this.f49179e = j13;
        this.f49180f = j14;
        this.f49181g = f15;
        this.f49189o = f12;
        this.f49188n = f13;
    }

    public final void a() {
        long j12 = this.f49182h;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f49183i;
            if (j13 != -9223372036854775807L) {
                j12 = j13;
            }
            long j14 = this.f49185k;
            if (j14 != -9223372036854775807L && j12 < j14) {
                j12 = j14;
            }
            long j15 = this.f49186l;
            if (j15 != -9223372036854775807L && j12 > j15) {
                j12 = j15;
            }
        } else {
            j12 = -9223372036854775807L;
        }
        if (this.f49184j == j12) {
            return;
        }
        this.f49184j = j12;
        this.f49187m = j12;
        this.f49192r = -9223372036854775807L;
        this.f49193s = -9223372036854775807L;
        this.f49191q = -9223372036854775807L;
    }

    public final void b(long j12) {
        this.f49183i = j12;
        a();
    }
}
