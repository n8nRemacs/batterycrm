package androidx.media3.exoplayer;

import android.os.SystemClock;

/* compiled from: StandaloneMediaClock.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class i0 implements I {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.D f49197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49198c;

    /* renamed from: d, reason: collision with root package name */
    public long f49199d;

    /* renamed from: e, reason: collision with root package name */
    public long f49200e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.common.G f49201f = androidx.media3.common.G.f47232e;

    public i0(androidx.media3.common.util.D d12) {
        this.f49197b = d12;
    }

    public final void a(long j12) {
        this.f49199d = j12;
        if (this.f49198c) {
            this.f49197b.getClass();
            this.f49200e = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.I
    public final long c() {
        long j12 = this.f49199d;
        if (!this.f49198c) {
            return j12;
        }
        this.f49197b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f49200e;
        return j12 + (this.f49201f.f47236b == 1.0f ? androidx.media3.common.util.M.F(jElapsedRealtime) : jElapsedRealtime * r4.f47238d);
    }

    @Override // androidx.media3.exoplayer.I
    public final void d(androidx.media3.common.G g12) {
        if (this.f49198c) {
            a(c());
        }
        this.f49201f = g12;
    }

    @Override // androidx.media3.exoplayer.I
    public final androidx.media3.common.G getPlaybackParameters() {
        return this.f49201f;
    }
}
