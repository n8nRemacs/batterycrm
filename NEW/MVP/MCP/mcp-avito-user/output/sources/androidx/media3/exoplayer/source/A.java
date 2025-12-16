package androidx.media3.exoplayer.source;

import android.os.Handler;

/* compiled from: MediaSource.java */
/* loaded from: classes.dex */
public interface A {

    /* compiled from: MediaSource.java */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final E f49455a = E.f49488b;

        @androidx.media3.common.util.J
        A a(androidx.media3.common.z zVar);
    }

    /* compiled from: MediaSource.java */
    @androidx.media3.common.util.J
    public static final class b extends androidx.media3.common.C {
        public b(int i12, long j12, Object obj) {
            super(obj, -1, -1, j12, i12);
        }

        public final b b(Object obj) {
            return new b(this.f47212a.equals(obj) ? this : new androidx.media3.common.C(obj, this.f47213b, this.f47214c, this.f47215d, this.f47216e));
        }

        public final b c(long j12) {
            return new b(this.f47215d == j12 ? this : new androidx.media3.common.C(this.f47212a, this.f47213b, this.f47214c, j12, this.f47216e));
        }
    }

    /* compiled from: MediaSource.java */
    @androidx.media3.common.util.J
    public interface c {
        void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12);
    }

    @androidx.media3.common.util.J
    @j.P
    default androidx.media3.common.P a() {
        return null;
    }

    @androidx.media3.common.util.J
    default boolean b() {
        return !(this instanceof C23158i);
    }

    @androidx.media3.common.util.J
    void c(Handler handler, D d12);

    @androidx.media3.common.util.J
    void d(c cVar);

    @androidx.media3.common.util.J
    InterfaceC23174z e(b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12);

    @androidx.media3.common.util.J
    void g(c cVar);

    @androidx.media3.common.util.J
    androidx.media3.common.z getMediaItem();

    @androidx.media3.common.util.J
    void i(c cVar);

    @androidx.media3.common.util.J
    void j(Handler handler, androidx.media3.exoplayer.drm.f fVar);

    @androidx.media3.common.util.J
    void k(InterfaceC23174z interfaceC23174z);

    @androidx.media3.common.util.J
    void maybeThrowSourceInfoRefreshError();

    @androidx.media3.common.util.J
    void p(D d12);

    @androidx.media3.common.util.J
    void q(androidx.media3.exoplayer.drm.f fVar);

    @androidx.media3.common.util.J
    void s(c cVar, @j.P androidx.media3.datasource.B b12, androidx.media3.exoplayer.analytics.w wVar);
}
