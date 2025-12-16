package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.source.AbstractC23166q;
import j.k0;

/* compiled from: SinglePeriodAdTimeline.java */
@k0
@J
/* loaded from: classes.dex */
public final class d extends AbstractC23166q {

    /* renamed from: h, reason: collision with root package name */
    public final C23089c f49733h;

    public d(P p12, C23089c c23089c) {
        super(p12);
        C23110a.g(p12.p() == 1);
        C23110a.g(p12.w() == 1);
        this.f49733h = c23089c;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
    public final P.b n(int i12, P.b bVar, boolean z12) {
        this.f49820g.n(i12, bVar, z12);
        long j12 = bVar.f47382e;
        if (j12 == -9223372036854775807L) {
            j12 = this.f49733h.f47624d;
        }
        bVar.p(bVar.f47379b, bVar.f47380c, bVar.f47381d, j12, bVar.f47383f, this.f49733h, bVar.f47384g);
        return bVar;
    }
}
