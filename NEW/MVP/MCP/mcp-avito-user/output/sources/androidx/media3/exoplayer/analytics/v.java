package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C23107s;
import androidx.media3.common.H;
import androidx.media3.common.X;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.analytics.t;
import androidx.media3.exoplayer.source.C23171w;
import java.io.IOException;

/* compiled from: PlaybackStatsListener.java */
@J
/* loaded from: classes.dex */
public final class v implements androidx.media3.exoplayer.analytics.b, t.a {

    /* compiled from: PlaybackStatsListener.java */
    public interface a {
    }

    /* compiled from: PlaybackStatsListener.java */
    public static final class b {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void m(H h12, b.c cVar) {
        C23107s c23107s = cVar.f48642a;
        if (c23107s.f47700a.size() == 0) {
            return;
        }
        if (c23107s.f47700a.size() <= 0) {
            throw null;
        }
        int iB2 = c23107s.b(0);
        cVar.b(iB2);
        if (iB2 != 0 && iB2 != 11) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void x(b.C1823b c1823b, H.k kVar, H.k kVar2, int i12) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void d(b.C1823b c1823b, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void i(b.C1823b c1823b, int i12) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void k(b.C1823b c1823b, X x12) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void l(b.C1823b c1823b, C23171w c23171w) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void h(int i12, long j12, b.C1823b c1823b) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public final void v(b.C1823b c1823b, C23171w c23171w, IOException iOException) {
    }
}
