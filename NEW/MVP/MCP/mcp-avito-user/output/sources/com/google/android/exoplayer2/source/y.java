package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;

/* compiled from: MediaSource.java */
/* loaded from: classes6.dex */
public interface y {

    /* compiled from: MediaSource.java */
    public interface a {
        y a(com.google.android.exoplayer2.O o12);
    }

    /* compiled from: MediaSource.java */
    public static final class b extends C36560x {
        public b(Object obj) {
            super(obj, -1L);
        }

        public final b b(Object obj) {
            return new b(this.f346696a.equals(obj) ? this : new C36560x(obj, this.f346697b, this.f346698c, this.f346699d, this.f346700e));
        }

        public b(int i12, long j12, Object obj) {
            super(obj, -1, -1, j12, i12);
        }
    }

    /* compiled from: MediaSource.java */
    public interface c {
        void v(AbstractC36538a abstractC36538a, s0 s0Var);
    }

    @j.P
    default s0 a() {
        return null;
    }

    default boolean b() {
        return !(this instanceof C36546i);
    }

    InterfaceC36559w c(b bVar, InterfaceC36572b interfaceC36572b, long j12);

    com.google.android.exoplayer2.O getMediaItem();

    void h(Handler handler, A a12);

    void j(Handler handler, com.google.android.exoplayer2.drm.e eVar);

    void maybeThrowSourceInfoRefreshError();

    void n(c cVar);

    void o(A a12);

    void s(c cVar, @j.P com.google.android.exoplayer2.upstream.M m12, com.google.android.exoplayer2.analytics.p pVar);

    void t(InterfaceC36559w interfaceC36559w);

    void u(c cVar);

    void w(c cVar);

    void x(com.google.android.exoplayer2.drm.e eVar);
}
