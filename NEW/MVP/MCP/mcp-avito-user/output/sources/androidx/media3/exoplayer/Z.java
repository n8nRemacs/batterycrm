package androidx.media3.exoplayer;

import androidx.media3.common.C23089c;
import androidx.media3.common.P;
import androidx.media3.exoplayer.source.AbstractC23166q;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
class Z extends AbstractC23166q {

    /* renamed from: h, reason: collision with root package name */
    public final P.d f48621h;

    public Z(androidx.media3.common.P p12) {
        super(p12);
        this.f48621h = new P.d();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
    public final P.b n(int i12, P.b bVar, boolean z12) {
        androidx.media3.common.P p12 = this.f49820g;
        P.b bVarN = p12.n(i12, bVar, z12);
        if (p12.u(bVarN.f47381d, this.f48621h, 0L).a()) {
            bVarN.p(bVar.f47379b, bVar.f47380c, bVar.f47381d, bVar.f47382e, bVar.f47383f, C23089c.f47615g, true);
        } else {
            bVarN.f47384g = true;
        }
        return bVarN;
    }
}
