package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import androidx.media3.datasource.j;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.G;
import androidx.media3.exoplayer.source.J;
import androidx.media3.extractor.C23192k;

/* compiled from: ProgressiveMediaSource.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class K extends AbstractC23150a implements J.b {

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.common.z f49571i;

    /* renamed from: j, reason: collision with root package name */
    public final z.h f49572j;

    /* renamed from: k, reason: collision with root package name */
    public final j.a f49573k;

    /* renamed from: l, reason: collision with root package name */
    public final G.a f49574l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.g f49575m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49576n;

    /* renamed from: o, reason: collision with root package name */
    public final int f49577o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f49578p;

    /* renamed from: q, reason: collision with root package name */
    public long f49579q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49580r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f49581s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public androidx.media3.datasource.B f49582t;

    /* compiled from: ProgressiveMediaSource.java */
    public class a extends AbstractC23166q {
        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            super.n(i12, bVar, z12);
            bVar.f47384g = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            super.u(i12, dVar, j12);
            dVar.f47418m = true;
            return dVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    public static final class b implements E {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f49583h = 0;

        /* renamed from: c, reason: collision with root package name */
        public final j.a f49584c;

        /* renamed from: d, reason: collision with root package name */
        public final L f49585d;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.c f49586e;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.k f49587f;

        /* renamed from: g, reason: collision with root package name */
        public final int f49588g;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.L] */
        public b(j.a aVar, final C23192k c23192k) {
            ?? r02 = new G.a() { // from class: androidx.media3.exoplayer.source.L
                @Override // androidx.media3.exoplayer.source.G.a
                public final G a(androidx.media3.exoplayer.analytics.w wVar) {
                    return new C23151b(c23192k);
                }
            };
            androidx.media3.exoplayer.drm.c cVar = new androidx.media3.exoplayer.drm.c();
            androidx.media3.exoplayer.upstream.k kVar = new androidx.media3.exoplayer.upstream.k();
            this.f49584c = aVar;
            this.f49585d = r02;
            this.f49586e = cVar;
            this.f49587f = kVar;
            this.f49588g = 1048576;
        }

        @Override // androidx.media3.exoplayer.source.A.a
        public final A a(androidx.media3.common.z zVar) {
            androidx.media3.exoplayer.drm.g gVar;
            zVar.f47979c.getClass();
            androidx.media3.exoplayer.drm.c cVar = this.f49586e;
            cVar.getClass();
            zVar.f47979c.getClass();
            z.f fVar = zVar.f47979c.f48071d;
            if (fVar == null || androidx.media3.common.util.M.f47887a < 18) {
                gVar = androidx.media3.exoplayer.drm.g.f49117a;
            } else {
                synchronized (cVar.f49102a) {
                    try {
                        if (!fVar.equals(cVar.f49103b)) {
                            cVar.f49103b = fVar;
                            cVar.f49104c = androidx.media3.exoplayer.drm.c.a(fVar);
                        }
                        gVar = cVar.f49104c;
                        gVar.getClass();
                    } finally {
                    }
                }
            }
            return new K(zVar, this.f49584c, this.f49585d, gVar, this.f49587f, this.f49588g, null);
        }
    }

    public K(androidx.media3.common.z zVar, j.a aVar, G.a aVar2, androidx.media3.exoplayer.drm.g gVar, androidx.media3.exoplayer.upstream.l lVar, int i12, a aVar3) {
        z.h hVar = zVar.f47979c;
        hVar.getClass();
        this.f49572j = hVar;
        this.f49571i = zVar;
        this.f49573k = aVar;
        this.f49574l = aVar2;
        this.f49575m = gVar;
        this.f49576n = lVar;
        this.f49577o = i12;
        this.f49578p = true;
        this.f49579q = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        this.f49575m.release();
    }

    public final void D() {
        androidx.media3.common.P u12 = new U(this.f49579q, this.f49580r, this.f49581s, this.f49571i);
        if (this.f49578p) {
            u12 = new a(u12);
        }
        z(u12);
    }

    public final void E(long j12, boolean z12, boolean z13) {
        if (j12 == -9223372036854775807L) {
            j12 = this.f49579q;
        }
        if (!this.f49578p && this.f49579q == j12 && this.f49580r == z12 && this.f49581s == z13) {
            return;
        }
        this.f49579q = j12;
        this.f49580r = z12;
        this.f49581s = z13;
        this.f49578p = false;
        D();
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        androidx.media3.datasource.j jVarA = this.f49573k.a();
        androidx.media3.datasource.B b12 = this.f49582t;
        if (b12 != null) {
            jVarA.j(b12);
        }
        z.h hVar = this.f49572j;
        Uri uri = hVar.f48069b;
        androidx.media3.exoplayer.analytics.w wVar = this.f49718h;
        C23110a.h(wVar);
        return new J(uri, jVarA, this.f49574l.a(wVar), this.f49575m, new f.a(this.f49715e.f49114c, 0, bVar), this.f49576n, new D.a(this.f49714d.f49485c, 0, bVar), this, bVar2, hVar.f48074g, this.f49577o);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return this.f49571i;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        J j12 = (J) interfaceC23174z;
        if (j12.f49545w) {
            for (O o12 : j12.f49542t) {
                o12.h();
                DrmSession drmSession = o12.f49622h;
                if (drmSession != null) {
                    drmSession.f(o12.f49619e);
                    o12.f49622h = null;
                    o12.f49621g = null;
                }
            }
        }
        j12.f49534l.d(j12);
        j12.f49539q.removeCallbacksAndMessages(null);
        j12.f49540r = null;
        j12.f49523M = true;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        this.f49582t = b12;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        androidx.media3.exoplayer.analytics.w wVar = this.f49718h;
        C23110a.h(wVar);
        androidx.media3.exoplayer.drm.g gVar = this.f49575m;
        gVar.d(looperMyLooper, wVar);
        gVar.prepare();
        D();
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
