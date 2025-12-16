package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.D;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.l;
import androidx.media3.exoplayer.mediacodec.t;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
@J
/* loaded from: classes.dex */
public final class j implements l.b {
    @Override // androidx.media3.exoplayer.mediacodec.l.b
    public final l a(l.a aVar) {
        int i12 = M.f47887a;
        if (i12 < 23 || i12 < 31) {
            return new t.b().a(aVar);
        }
        int iF2 = D.f(aVar.f49383c.f47757m);
        M.y(iF2);
        androidx.media3.common.util.s.f();
        return new b.C1828b(iF2).a(aVar);
    }
}
