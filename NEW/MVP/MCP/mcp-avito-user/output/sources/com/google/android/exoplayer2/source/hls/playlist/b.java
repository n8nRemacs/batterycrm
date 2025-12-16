package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.n;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.upstream.B;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.J;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DefaultHlsPlaylistTracker.java */
/* loaded from: classes6.dex */
public final class b implements HlsPlaylistTracker, Loader.b<B<h>> {

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.android.exoplayer2.analytics.h f346437p = new com.google.android.exoplayer2.analytics.h(26);

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.hls.d f346438b;

    /* renamed from: c, reason: collision with root package name */
    public final i f346439c;

    /* renamed from: d, reason: collision with root package name */
    public final x f346440d;

    /* renamed from: g, reason: collision with root package name */
    @P
    public A.a f346443g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Loader f346444h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public Handler f346445i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public HlsMediaSource f346446j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public g f346447k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public Uri f346448l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public f f346449m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f346450n;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.b> f346442f = new CopyOnWriteArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<Uri, c> f346441e = new HashMap<>();

    /* renamed from: o, reason: collision with root package name */
    public long f346451o = -9223372036854775807L;

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b, reason: collision with other inner class name */
    public class C10595b implements HlsPlaylistTracker.b {
        public C10595b(a aVar) {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public final void a() {
            b.this.f346442f.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public final boolean b(Uri uri, z.d dVar, boolean z12) {
            HashMap<Uri, c> map;
            c cVar;
            b bVar = b.this;
            if (bVar.f346449m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                g gVar = bVar.f346447k;
                int i12 = U.f348106a;
                List<g.b> list = gVar.f346512e;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int size = list.size();
                    map = bVar.f346441e;
                    if (i13 >= size) {
                        break;
                    }
                    c cVar2 = map.get(list.get(i13).f346524a);
                    if (cVar2 != null && jElapsedRealtime < cVar2.f346460i) {
                        i14++;
                    }
                    i13++;
                }
                z.b bVarC = bVar.f346440d.c(new z.a(bVar.f346447k.f346512e.size(), i14), dVar);
                if (bVarC != null && bVarC.f348022a == 2 && (cVar = map.get(uri)) != null) {
                    c.a(cVar, bVarC.f348023b);
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultHlsPlaylistTracker.java */
    public final class c implements Loader.b<B<h>> {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f346453b;

        /* renamed from: c, reason: collision with root package name */
        public final Loader f346454c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC36583m f346455d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public f f346456e;

        /* renamed from: f, reason: collision with root package name */
        public long f346457f;

        /* renamed from: g, reason: collision with root package name */
        public long f346458g;

        /* renamed from: h, reason: collision with root package name */
        public long f346459h;

        /* renamed from: i, reason: collision with root package name */
        public long f346460i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f346461j;

        /* renamed from: k, reason: collision with root package name */
        @P
        public IOException f346462k;

        public c(Uri uri) {
            this.f346453b = uri;
            this.f346455d = b.this.f346438b.f346289a.a();
        }

        public static boolean a(c cVar, long j12) {
            cVar.f346460i = SystemClock.elapsedRealtime() + j12;
            b bVar = b.this;
            if (!cVar.f346453b.equals(bVar.f346448l)) {
                return false;
            }
            List<g.b> list = bVar.f346447k.f346512e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar2 = bVar.f346441e.get(list.get(i12).f346524a);
                cVar2.getClass();
                if (jElapsedRealtime > cVar2.f346460i) {
                    Uri uri = cVar2.f346453b;
                    bVar.f346448l = uri;
                    cVar2.c(bVar.p(uri));
                    return false;
                }
            }
            return true;
        }

        public final void b(Uri uri) {
            b bVar = b.this;
            B b12 = new B(this.f346455d, uri, bVar.f346439c.a(bVar.f346447k, this.f346456e));
            x xVar = bVar.f346440d;
            int i12 = b12.f347712c;
            this.f346454c.f(b12, this, xVar.a(i12));
            bVar.f346443g.k(new C36554q(b12.f347710a, b12.f347711b), i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void c(final Uri uri) {
            this.f346460i = 0L;
            if (this.f346461j) {
                return;
            }
            Loader loader = this.f346454c;
            if (loader.c() || loader.f347764c != null) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = this.f346459h;
            if (jElapsedRealtime >= j12) {
                b(uri);
            } else {
                this.f346461j = true;
                b.this.f346445i.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c cVar = this.f346464b;
                        cVar.f346461j = false;
                        cVar.b(uri);
                    }
                }, j12 - jElapsedRealtime);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0211  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(com.google.android.exoplayer2.source.hls.playlist.f r65) {
            /*
                Method dump skipped, instructions count: 691
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.b.c.d(com.google.android.exoplayer2.source.hls.playlist.f):void");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
            B b12 = (B) eVar;
            long j14 = b12.f347710a;
            J j15 = b12.f347713d;
            Uri uri = j15.f347753c;
            C36554q c36554q = new C36554q(j14, j15.f347754d);
            b bVar = b.this;
            bVar.f346440d.getClass();
            bVar.f346443g.d(c36554q, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final void j(Loader.e eVar, long j12, long j13) {
            B b12 = (B) eVar;
            h hVar = (h) b12.f347715f;
            long j14 = b12.f347710a;
            J j15 = b12.f347713d;
            Uri uri = j15.f347753c;
            C36554q c36554q = new C36554q(j14, j15.f347754d);
            if (hVar instanceof f) {
                d((f) hVar);
                b.this.f346443g.f(c36554q, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ParserException parserExceptionB = ParserException.b("Loaded playlist has unexpected type.");
                this.f346462k = parserExceptionB;
                b.this.f346443g.i(c36554q, 4, parserExceptionB, true);
            }
            b.this.f346440d.getClass();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
            Loader.c cVarB;
            B b12 = (B) eVar;
            long j14 = b12.f347710a;
            J j15 = b12.f347713d;
            Uri uri = j15.f347753c;
            C36554q c36554q = new C36554q(j14, j15.f347754d);
            boolean z12 = uri.getQueryParameter("_HLS_msn") != null;
            boolean z13 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            Uri uri2 = this.f346453b;
            b bVar = b.this;
            int i13 = b12.f347712c;
            if (z12 || z13) {
                int i14 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).f347735e : Integer.MAX_VALUE;
                if (z13 || i14 == 400 || i14 == 503) {
                    this.f346459h = SystemClock.elapsedRealtime();
                    c(uri2);
                    A.a aVar = bVar.f346443g;
                    int i15 = U.f348106a;
                    aVar.i(c36554q, i13, iOException, true);
                    return Loader.f347760e;
                }
            }
            z.d dVar = new z.d(iOException, i12);
            Iterator<HlsPlaylistTracker.b> it = bVar.f346442f.iterator();
            boolean z14 = false;
            while (it.hasNext()) {
                z14 |= !it.next().b(uri2, dVar, false);
            }
            x xVar = bVar.f346440d;
            if (z14) {
                long jB2 = xVar.b(dVar);
                cVarB = jB2 != -9223372036854775807L ? Loader.b(jB2, false) : Loader.f347761f;
            } else {
                cVarB = Loader.f347760e;
            }
            int i16 = cVarB.f347765a;
            boolean z15 = i16 == 0 || i16 == 1;
            bVar.f346443g.i(c36554q, i13, iOException, true ^ z15);
            if (z15) {
                return cVarB;
            }
            xVar.getClass();
            return cVarB;
        }
    }

    public b(com.google.android.exoplayer2.source.hls.d dVar, x xVar, i iVar) {
        this.f346438b = dVar;
        this.f346439c = iVar;
        this.f346440d = xVar;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void a(n nVar) {
        this.f346442f.remove(nVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void b(Uri uri, A.a aVar, HlsMediaSource hlsMediaSource) {
        this.f346445i = U.n(null);
        this.f346443g = aVar;
        this.f346446j = hlsMediaSource;
        B b12 = new B(this.f346438b.f346289a.a(), uri, this.f346439c.b());
        C36585a.d(this.f346444h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f346444h = loader;
        x xVar = this.f346440d;
        int i12 = b12.f347712c;
        loader.f(b12, this, xVar.a(i12));
        aVar.k(new C36554q(b12.f347710a, b12.f347711b), i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @P
    public final g c() {
        return this.f346447k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @P
    public final f d(boolean z12, Uri uri) {
        HashMap<Uri, c> map = this.f346441e;
        f fVar = map.get(uri).f346456e;
        if (fVar != null && z12 && !uri.equals(this.f346448l)) {
            List<g.b> list = this.f346447k.f346512e;
            int i12 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i12).f346524a)) {
                    f fVar2 = this.f346449m;
                    if (fVar2 == null || !fVar2.f346479o) {
                        this.f346448l = uri;
                        c cVar = map.get(uri);
                        f fVar3 = cVar.f346456e;
                        if (fVar3 == null || !fVar3.f346479o) {
                            cVar.c(p(uri));
                        } else {
                            this.f346449m = fVar3;
                            this.f346446j.F(fVar3);
                        }
                    }
                } else {
                    i12++;
                }
            }
        }
        return fVar;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void e() throws IOException {
        Loader loader = this.f346444h;
        if (loader != null) {
            loader.d(BeduinInputModel.MIN_TEXT_VERSION);
        }
        Uri uri = this.f346448l;
        if (uri != null) {
            i(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final long f() {
        return this.f346451o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void g(n nVar) {
        this.f346442f.add(nVar);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        B b12 = (B) eVar;
        long j14 = b12.f347710a;
        J j15 = b12.f347713d;
        Uri uri = j15.f347753c;
        C36554q c36554q = new C36554q(j14, j15.f347754d);
        this.f346440d.getClass();
        this.f346443g.d(c36554q, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void i(Uri uri) throws IOException {
        c cVar = this.f346441e.get(uri);
        cVar.f346454c.d(BeduinInputModel.MIN_TEXT_VERSION);
        IOException iOException = cVar.f346462k;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13) {
        g gVar;
        B b12 = (B) eVar;
        h hVar = (h) b12.f347715f;
        boolean z12 = hVar instanceof f;
        if (z12) {
            String str = hVar.f346530a;
            g gVar2 = g.f346510n;
            Uri uri = Uri.parse(str);
            I.b bVar = new I.b();
            bVar.f343494a = "0";
            bVar.f343503j = "application/x-mpegURL";
            gVar = new g("", Collections.emptyList(), Collections.singletonList(new g.b(uri, bVar.a(), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            gVar = (g) hVar;
        }
        this.f346447k = gVar;
        this.f346448l = gVar.f346512e.get(0).f346524a;
        this.f346442f.add(new C10595b(null));
        List<Uri> list = gVar.f346511d;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Uri uri2 = list.get(i12);
            this.f346441e.put(uri2, new c(uri2));
        }
        long j14 = b12.f347710a;
        J j15 = b12.f347713d;
        Uri uri3 = j15.f347753c;
        C36554q c36554q = new C36554q(j14, j15.f347754d);
        c cVar = this.f346441e.get(this.f346448l);
        if (z12) {
            cVar.d((f) hVar);
        } else {
            cVar.c(cVar.f346453b);
        }
        this.f346440d.getClass();
        this.f346443g.f(c36554q, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void k(Uri uri) {
        c cVar = this.f346441e.get(uri);
        cVar.c(cVar.f346453b);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        B b12 = (B) eVar;
        long j14 = b12.f347710a;
        J j15 = b12.f347713d;
        Uri uri = j15.f347753c;
        C36554q c36554q = new C36554q(j14, j15.f347754d);
        long jB2 = this.f346440d.b(new z.d(iOException, i12));
        boolean z12 = jB2 == -9223372036854775807L;
        this.f346443g.i(c36554q, b12.f347712c, iOException, z12);
        return z12 ? Loader.f347761f : Loader.b(jB2, false);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final boolean m(Uri uri) {
        int i12;
        c cVar = this.f346441e.get(uri);
        if (cVar.f346456e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, U.R(cVar.f346456e.f346485u));
        f fVar = cVar.f346456e;
        return fVar.f346479o || (i12 = fVar.f346468d) == 2 || i12 == 1 || cVar.f346457f + jMax > jElapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final boolean n() {
        return this.f346450n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final boolean o(Uri uri, long j12) {
        if (this.f346441e.get(uri) != null) {
            return !c.a(r2, j12);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri p(Uri uri) {
        f.d dVar;
        f fVar = this.f346449m;
        if (fVar == null || !fVar.f346486v.f346509e || (dVar = (f.d) fVar.f346484t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.f346490b));
        int i12 = dVar.f346491c;
        if (i12 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i12));
        }
        return builderBuildUpon.build();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void stop() {
        this.f346448l = null;
        this.f346449m = null;
        this.f346447k = null;
        this.f346451o = -9223372036854775807L;
        this.f346444h.e(null);
        this.f346444h = null;
        HashMap<Uri, c> map = this.f346441e;
        Iterator<c> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().f346454c.e(null);
        }
        this.f346445i.removeCallbacksAndMessages(null);
        this.f346445i = null;
        map.clear();
    }
}
