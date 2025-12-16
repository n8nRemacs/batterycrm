package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.D;
import com.google.android.exoplayer2.source.G;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes6.dex */
public final class H extends AbstractC36538a implements G.b {

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.O f346006i;

    /* renamed from: j, reason: collision with root package name */
    public final O.i f346007j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC36583m.a f346008k;

    /* renamed from: l, reason: collision with root package name */
    public final D.a f346009l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f346010m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.z f346011n;

    /* renamed from: o, reason: collision with root package name */
    public final int f346012o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f346013p;

    /* renamed from: q, reason: collision with root package name */
    public long f346014q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346015r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346016s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.upstream.M f346017t;

    /* compiled from: ProgressiveMediaSource.java */
    public class a extends AbstractC36552o {
        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            super.f(i12, bVar, z12);
            bVar.f345875g = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            super.m(i12, dVar, j12);
            dVar.f345891m = true;
            return dVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    public static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC36583m.a f346018a;

        /* renamed from: b, reason: collision with root package name */
        public final I f346019b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.c f346020c;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.x f346021d;

        /* renamed from: e, reason: collision with root package name */
        public final int f346022e;

        public b(InterfaceC36583m.a aVar) {
            this(aVar, new com.google.android.exoplayer2.extractor.g());
        }

        @Override // com.google.android.exoplayer2.source.y.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H a(com.google.android.exoplayer2.O o12) {
            o12.f343529c.getClass();
            Object obj = o12.f343529c.f343578h;
            return new H(o12, this.f346018a, this.f346019b, this.f346020c.a(o12), this.f346021d, this.f346022e, null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.source.I] */
        public b(InterfaceC36583m.a aVar, final com.google.android.exoplayer2.extractor.g gVar) {
            ?? r02 = new D.a() { // from class: com.google.android.exoplayer2.source.I
                @Override // com.google.android.exoplayer2.source.D.a
                public final D a(com.google.android.exoplayer2.analytics.p pVar) {
                    return new C36539b(gVar);
                }
            };
            com.google.android.exoplayer2.drm.c cVar = new com.google.android.exoplayer2.drm.c();
            com.google.android.exoplayer2.upstream.x xVar = new com.google.android.exoplayer2.upstream.x();
            this.f346018a = aVar;
            this.f346019b = r02;
            this.f346020c = cVar;
            this.f346021d = xVar;
            this.f346022e = 1048576;
        }
    }

    public H(com.google.android.exoplayer2.O o12, InterfaceC36583m.a aVar, D.a aVar2, com.google.android.exoplayer2.drm.f fVar, com.google.android.exoplayer2.upstream.z zVar, int i12, a aVar3) {
        O.i iVar = o12.f343529c;
        iVar.getClass();
        this.f346007j = iVar;
        this.f346006i = o12;
        this.f346008k = aVar;
        this.f346009l = aVar2;
        this.f346010m = fVar;
        this.f346011n = zVar;
        this.f346012o = i12;
        this.f346013p = true;
        this.f346014q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        this.f346017t = m12;
        com.google.android.exoplayer2.drm.f fVar = this.f346010m;
        fVar.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        com.google.android.exoplayer2.analytics.p pVar = this.f346164h;
        C36585a.e(pVar);
        fVar.d(looperMyLooper, pVar);
        E();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        this.f346010m.release();
    }

    public final void E() {
        long j12 = this.f346014q;
        boolean z12 = this.f346015r;
        boolean z13 = this.f346016s;
        com.google.android.exoplayer2.O o12 = this.f346006i;
        Q q12 = new Q(-9223372036854775807L, -9223372036854775807L, j12, j12, 0L, 0L, z12, false, false, null, o12, z13 ? o12.f343530d : null);
        C(this.f346013p ? new a(q12) : q12);
    }

    public final void F(long j12, boolean z12, boolean z13) {
        if (j12 == -9223372036854775807L) {
            j12 = this.f346014q;
        }
        if (!this.f346013p && this.f346014q == j12 && this.f346015r == z12 && this.f346016s == z13) {
            return;
        }
        this.f346014q = j12;
        this.f346015r = z12;
        this.f346016s = z13;
        this.f346013p = false;
        E();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        InterfaceC36583m interfaceC36583mA = this.f346008k.a();
        com.google.android.exoplayer2.upstream.M m12 = this.f346017t;
        if (m12 != null) {
            interfaceC36583mA.k(m12);
        }
        O.i iVar = this.f346007j;
        Uri uri = iVar.f343571a;
        com.google.android.exoplayer2.analytics.p pVar = this.f346164h;
        C36585a.e(pVar);
        return new G(uri, interfaceC36583mA, this.f346009l.a(pVar), this.f346010m, new e.a(this.f346161e.f344338c, 0, bVar), this.f346011n, y(bVar), this, interfaceC36572b, iVar.f343576f, this.f346012o);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return this.f346006i;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        G g12 = (G) interfaceC36559w;
        if (g12.f345979w) {
            for (L l12 : g12.f345976t) {
                l12.i();
                DrmSession drmSession = l12.f346050h;
                if (drmSession != null) {
                    drmSession.e(l12.f346047e);
                    l12.f346050h = null;
                    l12.f346049g = null;
                }
            }
        }
        g12.f345968l.e(g12);
        g12.f345973q.removeCallbacksAndMessages(null);
        g12.f345974r = null;
        g12.f345957M = true;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
