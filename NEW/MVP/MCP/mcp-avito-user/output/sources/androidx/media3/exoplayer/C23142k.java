package androidx.media3.exoplayer;

/* compiled from: DefaultMediaClock.java */
/* renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23142k implements I {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f49212b;

    /* renamed from: c, reason: collision with root package name */
    public final a f49213c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public c0 f49214d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public I f49215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f49216f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49217g;

    /* compiled from: DefaultMediaClock.java */
    /* renamed from: androidx.media3.exoplayer.k$a */
    public interface a {
    }

    public C23142k(a aVar, androidx.media3.common.util.D d12) {
        this.f49213c = aVar;
        this.f49212b = new i0(d12);
    }

    @Override // androidx.media3.exoplayer.I
    public final long c() {
        if (this.f49216f) {
            return this.f49212b.c();
        }
        I i12 = this.f49215e;
        i12.getClass();
        return i12.c();
    }

    @Override // androidx.media3.exoplayer.I
    public final void d(androidx.media3.common.G g12) {
        I i12 = this.f49215e;
        if (i12 != null) {
            i12.d(g12);
            g12 = this.f49215e.getPlaybackParameters();
        }
        this.f49212b.d(g12);
    }

    @Override // androidx.media3.exoplayer.I
    public final androidx.media3.common.G getPlaybackParameters() {
        I i12 = this.f49215e;
        return i12 != null ? i12.getPlaybackParameters() : this.f49212b.f49201f;
    }
}
