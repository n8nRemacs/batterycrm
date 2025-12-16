package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.F;
import j.P;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SceneRenderer.java */
/* loaded from: classes.dex */
final class h implements androidx.media3.exoplayer.video.g, a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f50333b;

    /* renamed from: c, reason: collision with root package name */
    public final c f50334c;

    /* renamed from: d, reason: collision with root package name */
    public final F<Long> f50335d;

    /* renamed from: e, reason: collision with root package name */
    public final F<e> f50336e;

    /* renamed from: f, reason: collision with root package name */
    public int f50337f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public byte[] f50338g;

    public h() {
        new AtomicBoolean();
        this.f50333b = new AtomicBoolean(true);
        new g();
        this.f50334c = new c();
        this.f50335d = new F<>();
        this.f50336e = new F<>();
        this.f50337f = -1;
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void c() {
        this.f50335d.b();
        this.f50334c.f50328a.b();
        this.f50333b.set(true);
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public final void d(long j12, float[] fArr) {
        this.f50334c.f50328a.a(j12, fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    @Override // androidx.media3.exoplayer.video.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r33, long r35, androidx.media3.common.C23108t r37, @j.P android.media.MediaFormat r38) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.spherical.h.e(long, long, androidx.media3.common.t, android.media.MediaFormat):void");
    }
}
