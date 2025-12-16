package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.B;
import com.google.android.exoplayer2.source.C36547j;
import com.google.android.exoplayer2.source.InterfaceC36544g;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.q;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.M;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* loaded from: classes6.dex */
public final class HlsMediaSource extends AbstractC36538a implements HlsPlaylistTracker.c {

    /* renamed from: i, reason: collision with root package name */
    public final j f346248i;

    /* renamed from: j, reason: collision with root package name */
    public final O.i f346249j;

    /* renamed from: k, reason: collision with root package name */
    public final i f346250k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC36544g f346251l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f346252m;

    /* renamed from: n, reason: collision with root package name */
    public final z f346253n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f346254o;

    /* renamed from: p, reason: collision with root package name */
    public final int f346255p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f346256q;

    /* renamed from: r, reason: collision with root package name */
    public final HlsPlaylistTracker f346257r;

    /* renamed from: s, reason: collision with root package name */
    public final long f346258s;

    /* renamed from: t, reason: collision with root package name */
    public final O f346259t;

    /* renamed from: u, reason: collision with root package name */
    public O.g f346260u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public M f346261v;

    public static final class Factory implements B {

        /* renamed from: a, reason: collision with root package name */
        public final d f346262a;

        /* renamed from: b, reason: collision with root package name */
        public final e f346263b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.hls.playlist.a f346264c;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.analytics.h f346265d;

        /* renamed from: e, reason: collision with root package name */
        public final C36547j f346266e;

        /* renamed from: f, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.c f346267f;

        /* renamed from: g, reason: collision with root package name */
        public final x f346268g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f346269h;

        /* renamed from: i, reason: collision with root package name */
        public final int f346270i;

        /* renamed from: j, reason: collision with root package name */
        public final long f346271j;

        public Factory(InterfaceC36583m.a aVar) {
            this(new d(aVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.exoplayer2.source.hls.playlist.d] */
        @Override // com.google.android.exoplayer2.source.y.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource a(O o12) {
            o12.f343529c.getClass();
            com.google.android.exoplayer2.source.hls.playlist.a dVar = this.f346264c;
            List<StreamKey> list = o12.f343529c.f343575e;
            if (!list.isEmpty()) {
                dVar = new com.google.android.exoplayer2.source.hls.playlist.d(dVar, list);
            }
            e eVar = this.f346263b;
            C36547j c36547j = this.f346266e;
            com.google.android.exoplayer2.drm.f fVarA = this.f346267f.a(o12);
            x xVar = this.f346268g;
            this.f346265d.getClass();
            com.google.android.exoplayer2.source.hls.playlist.b bVar = new com.google.android.exoplayer2.source.hls.playlist.b(this.f346262a, xVar, dVar);
            boolean z12 = this.f346269h;
            return new HlsMediaSource(o12, this.f346262a, eVar, c36547j, fVarA, xVar, bVar, this.f346271j, z12, this.f346270i, false, null);
        }

        public Factory(d dVar) {
            this.f346262a = dVar;
            this.f346267f = new com.google.android.exoplayer2.drm.c();
            this.f346264c = new com.google.android.exoplayer2.source.hls.playlist.a();
            this.f346265d = com.google.android.exoplayer2.source.hls.playlist.b.f346437p;
            this.f346263b = j.f346322a;
            this.f346268g = new x();
            this.f346266e = new C36547j();
            this.f346270i = 1;
            this.f346271j = -9223372036854775807L;
            this.f346269h = true;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static {
        H.a("goog.exo.hls");
    }

    public HlsMediaSource(O o12, i iVar, j jVar, InterfaceC36544g interfaceC36544g, com.google.android.exoplayer2.drm.f fVar, z zVar, HlsPlaylistTracker hlsPlaylistTracker, long j12, boolean z12, int i12, boolean z13, a aVar) {
        O.i iVar2 = o12.f343529c;
        iVar2.getClass();
        this.f346249j = iVar2;
        this.f346259t = o12;
        this.f346260u = o12.f343530d;
        this.f346250k = iVar;
        this.f346248i = jVar;
        this.f346251l = interfaceC36544g;
        this.f346252m = fVar;
        this.f346253n = zVar;
        this.f346257r = hlsPlaylistTracker;
        this.f346258s = j12;
        this.f346254o = z12;
        this.f346255p = i12;
        this.f346256q = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public static f.b E(long j12, AbstractC37401r1 abstractC37401r1) {
        f.b bVar = null;
        for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
            f.b bVar2 = (f.b) abstractC37401r1.get(i12);
            long j13 = bVar2.f346498f;
            if (j13 > j12 || !bVar2.f346487m) {
                if (j13 > j12) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@P M m12) {
        this.f346261v = m12;
        com.google.android.exoplayer2.drm.f fVar = this.f346252m;
        fVar.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        com.google.android.exoplayer2.analytics.p pVar = this.f346164h;
        C36585a.e(pVar);
        fVar.d(looperMyLooper, pVar);
        A.a aVarY = y(null);
        this.f346257r.b(this.f346249j.f343571a, aVarY, this);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        this.f346257r.stop();
        this.f346252m.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(com.google.android.exoplayer2.source.hls.playlist.f r42) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.F(com.google.android.exoplayer2.source.hls.playlist.f):void");
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        A.a aVarY = y(bVar);
        e.a aVar = new e.a(this.f346161e.f344338c, 0, bVar);
        M m12 = this.f346261v;
        com.google.android.exoplayer2.analytics.p pVar = this.f346164h;
        C36585a.e(pVar);
        return new n(this.f346248i, this.f346257r, this.f346250k, m12, this.f346252m, aVar, this.f346253n, aVarY, interfaceC36572b, this.f346251l, this.f346254o, this.f346255p, this.f346256q, pVar);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final O getMediaItem() {
        return this.f346259t;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
        this.f346257r.e();
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        n nVar = (n) interfaceC36559w;
        nVar.f346353c.a(nVar);
        for (q qVar : nVar.f346371u) {
            if (qVar.f346538E) {
                for (q.d dVar : qVar.f346580w) {
                    dVar.i();
                    DrmSession drmSession = dVar.f346050h;
                    if (drmSession != null) {
                        drmSession.e(dVar.f346047e);
                        dVar.f346050h = null;
                        dVar.f346049g = null;
                    }
                }
            }
            qVar.f346568k.e(qVar);
            qVar.f346576s.removeCallbacksAndMessages(null);
            qVar.f346542I = true;
            qVar.f346577t.clear();
        }
        nVar.f346368r = null;
    }
}
