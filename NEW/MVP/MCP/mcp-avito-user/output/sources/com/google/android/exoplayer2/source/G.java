package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.C36553p;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.L;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36592h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v61.InterfaceC49173d;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes6.dex */
final class G implements InterfaceC36559w, com.google.android.exoplayer2.extractor.l, Loader.b<a>, Loader.f, L.d {

    /* renamed from: N, reason: collision with root package name */
    public static final Map<String, String> f345943N;

    /* renamed from: O, reason: collision with root package name */
    public static final com.google.android.exoplayer2.I f345944O;

    /* renamed from: B, reason: collision with root package name */
    public boolean f345946B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f345948D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f345949E;

    /* renamed from: F, reason: collision with root package name */
    public int f345950F;

    /* renamed from: H, reason: collision with root package name */
    public long f345952H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f345954J;

    /* renamed from: K, reason: collision with root package name */
    public int f345955K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f345956L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f345957M;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f345958b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36583m f345959c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f345960d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.z f345961e;

    /* renamed from: f, reason: collision with root package name */
    public final A.a f345962f;

    /* renamed from: g, reason: collision with root package name */
    public final e.a f345963g;

    /* renamed from: h, reason: collision with root package name */
    public final H f345964h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC36572b f345965i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f345966j;

    /* renamed from: k, reason: collision with root package name */
    public final long f345967k;

    /* renamed from: m, reason: collision with root package name */
    public final D f345969m;

    /* renamed from: o, reason: collision with root package name */
    public final E f345971o;

    /* renamed from: p, reason: collision with root package name */
    public final E f345972p;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public InterfaceC36559w.a f345974r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public IcyHeaders f345975s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f345978v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f345979w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f345980x;

    /* renamed from: y, reason: collision with root package name */
    public e f345981y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.y f345982z;

    /* renamed from: l, reason: collision with root package name */
    public final Loader f345968l = new Loader("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    public final C36592h f345970n = new C36592h();

    /* renamed from: q, reason: collision with root package name */
    public final Handler f345973q = com.google.android.exoplayer2.util.U.n(null);

    /* renamed from: u, reason: collision with root package name */
    public d[] f345977u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    public L[] f345976t = new L[0];

    /* renamed from: I, reason: collision with root package name */
    public long f345953I = -9223372036854775807L;

    /* renamed from: G, reason: collision with root package name */
    public long f345951G = -1;

    /* renamed from: A, reason: collision with root package name */
    public long f345945A = -9223372036854775807L;

    /* renamed from: C, reason: collision with root package name */
    public int f345947C = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, C36553p.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f345984b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.J f345985c;

        /* renamed from: d, reason: collision with root package name */
        public final D f345986d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.l f345987e;

        /* renamed from: f, reason: collision with root package name */
        public final C36592h f345988f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f345990h;

        /* renamed from: j, reason: collision with root package name */
        public long f345992j;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        public L f345995m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f345996n;

        /* renamed from: g, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.w f345989g = new com.google.android.exoplayer2.extractor.w();

        /* renamed from: i, reason: collision with root package name */
        public boolean f345991i = true;

        /* renamed from: l, reason: collision with root package name */
        public long f345994l = -1;

        /* renamed from: a, reason: collision with root package name */
        public final long f345983a = C36554q.f346661b.getAndIncrement();

        /* renamed from: k, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.p f345993k = b(0);

        public a(Uri uri, InterfaceC36583m interfaceC36583m, D d12, com.google.android.exoplayer2.extractor.l lVar, C36592h c36592h) {
            this.f345984b = uri;
            this.f345985c = new com.google.android.exoplayer2.upstream.J(interfaceC36583m);
            this.f345986d = d12;
            this.f345987e = lVar;
            this.f345988f = c36592h;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void a() {
            this.f345990h = true;
        }

        public final com.google.android.exoplayer2.upstream.p b(long j12) {
            p.b bVar = new p.b();
            bVar.f347939a = this.f345984b;
            bVar.f347944f = j12;
            bVar.f347946h = G.this.f345966j;
            bVar.f347947i = 6;
            bVar.f347943e = G.f345943N;
            return bVar.a();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void load() {
            InterfaceC36583m c36553p;
            int i12;
            int iE2 = 0;
            while (iE2 == 0 && !this.f345990h) {
                try {
                    long j12 = this.f345989g.f345347a;
                    com.google.android.exoplayer2.upstream.p pVarB = b(j12);
                    this.f345993k = pVarB;
                    long jE2 = this.f345985c.e(pVarB);
                    this.f345994l = jE2;
                    if (jE2 != -1) {
                        this.f345994l = jE2 + j12;
                    }
                    G.this.f345975s = IcyHeaders.a(this.f345985c.f347751a.c());
                    com.google.android.exoplayer2.upstream.J j13 = this.f345985c;
                    IcyHeaders icyHeaders = G.this.f345975s;
                    if (icyHeaders == null || (i12 = icyHeaders.f345663g) == -1) {
                        c36553p = j13;
                    } else {
                        c36553p = new C36553p(j13, i12, this);
                        G g12 = G.this;
                        g12.getClass();
                        L lS2 = g12.s(new d(0, true));
                        this.f345995m = lS2;
                        lS2.a(G.f345944O);
                    }
                    long jC2 = j12;
                    this.f345986d.d(c36553p, this.f345984b, this.f345985c.f347751a.c(), j12, this.f345994l, this.f345987e);
                    if (G.this.f345975s != null) {
                        this.f345986d.b();
                    }
                    if (this.f345991i) {
                        this.f345986d.a(jC2, this.f345992j);
                        this.f345991i = false;
                    }
                    while (true) {
                        long j14 = jC2;
                        while (iE2 == 0 && !this.f345990h) {
                            try {
                                this.f345988f.a();
                                iE2 = this.f345986d.e(this.f345989g);
                                jC2 = this.f345986d.c();
                                if (jC2 > G.this.f345967k + j14) {
                                    C36592h c36592h = this.f345988f;
                                    synchronized (c36592h) {
                                        c36592h.f348131b = false;
                                    }
                                    G g13 = G.this;
                                    g13.f345973q.post(g13.f345972p);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        break;
                    }
                    if (iE2 == 1) {
                        iE2 = 0;
                    } else if (this.f345986d.c() != -1) {
                        this.f345989g.f345347a = this.f345986d.c();
                    }
                    com.google.android.exoplayer2.upstream.o.a(this.f345985c);
                } catch (Throwable th2) {
                    if (iE2 != 1 && this.f345986d.c() != -1) {
                        this.f345989g.f345347a = this.f345986d.c();
                    }
                    com.google.android.exoplayer2.upstream.o.a(this.f345985c);
                    throw th2;
                }
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class c implements M {

        /* renamed from: b, reason: collision with root package name */
        public final int f345998b;

        public c(int i12) {
            this.f345998b = i12;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            G g12 = G.this;
            if (g12.u()) {
                return 0;
            }
            int i12 = this.f345998b;
            g12.q(i12);
            L l12 = g12.f345976t[i12];
            int iQ2 = l12.q(j12, g12.f345956L);
            l12.A(iQ2);
            if (iQ2 != 0) {
                return iQ2;
            }
            g12.r(i12);
            return iQ2;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() throws IOException {
            G g12 = G.this;
            L l12 = g12.f345976t[this.f345998b];
            DrmSession drmSession = l12.f346050h;
            if (drmSession == null || drmSession.getState() != 1) {
                g12.f345968l.d(g12.f345961e.a(g12.f345947C));
            } else {
                DrmSession.DrmSessionException error = l12.f346050h.getError();
                error.getClass();
                throw error;
            }
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            G g12 = G.this;
            if (g12.u()) {
                return -3;
            }
            int i13 = this.f345998b;
            g12.q(i13);
            int iX2 = g12.f345976t[i13].x(j12, decoderInputBuffer, i12, g12.f345956L);
            if (iX2 == -3) {
                g12.r(i13);
            }
            return iX2;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            G g12 = G.this;
            return !g12.u() && g12.f345976t[this.f345998b].t(g12.f345956L);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f346000a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f346001b;

        public d(int i12, boolean z12) {
            this.f346000a = i12;
            this.f346001b = z12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f346000a == dVar.f346000a && this.f346001b == dVar.f346001b;
        }

        public final int hashCode() {
            return (this.f346000a * 31) + (this.f346001b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final W f346002a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f346003b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f346004c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f346005d;

        public e(W w12, boolean[] zArr) {
            this.f346002a = w12;
            this.f346003b = zArr;
            int i12 = w12.f346155b;
            this.f346004c = new boolean[i12];
            this.f346005d = new boolean[i12];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f345943N = Collections.unmodifiableMap(map);
        I.b bVar = new I.b();
        bVar.f343494a = "icy";
        bVar.f343504k = "application/x-icy";
        f345944O = bVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.exoplayer2.source.E] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.exoplayer2.source.E] */
    public G(Uri uri, InterfaceC36583m interfaceC36583m, D d12, com.google.android.exoplayer2.drm.f fVar, e.a aVar, com.google.android.exoplayer2.upstream.z zVar, A.a aVar2, H h12, InterfaceC36572b interfaceC36572b, @j.P String str, int i12) {
        this.f345958b = uri;
        this.f345959c = interfaceC36583m;
        this.f345960d = fVar;
        this.f345963g = aVar;
        this.f345961e = zVar;
        this.f345962f = aVar2;
        this.f345964h = h12;
        this.f345965i = interfaceC36572b;
        this.f345966j = str;
        this.f345967k = i12;
        this.f345969m = d12;
        final int i13 = 0;
        this.f345971o = new Runnable(this) { // from class: com.google.android.exoplayer2.source.E

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f345940c;

            {
                this.f345940c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                G g12 = this.f345940c;
                switch (i13) {
                    case 0:
                        Map<String, String> map = G.f345943N;
                        g12.p();
                        break;
                    default:
                        if (!g12.f345957M) {
                            InterfaceC36559w.a aVar3 = g12.f345974r;
                            aVar3.getClass();
                            aVar3.g(g12);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f345972p = new Runnable(this) { // from class: com.google.android.exoplayer2.source.E

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f345940c;

            {
                this.f345940c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                G g12 = this.f345940c;
                switch (i14) {
                    case 0:
                        Map<String, String> map = G.f345943N;
                        g12.p();
                        break;
                    default:
                        if (!g12.f345957M) {
                            InterfaceC36559w.a aVar3 = g12.f345974r;
                            aVar3.getClass();
                            aVar3.g(g12);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public final void a() {
        for (L l12 : this.f345976t) {
            l12.y(true);
            DrmSession drmSession = l12.f346050h;
            if (drmSession != null) {
                drmSession.e(l12.f346047e);
                l12.f346050h = null;
                l12.f346049g = null;
            }
        }
        this.f345969m.release();
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void b() {
        this.f345978v = true;
        this.f345973q.post(this.f345971o);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final com.google.android.exoplayer2.extractor.A c(int i12, int i13) {
        return s(new d(i12, false));
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        if (this.f345956L) {
            return false;
        }
        Loader loader = this.f345968l;
        if (loader.f347764c != null || this.f345954J) {
            return false;
        }
        if (this.f345979w && this.f345950F == 0) {
            return false;
        }
        boolean zC2 = this.f345970n.c();
        if (loader.c()) {
            return zC2;
        }
        t();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        k();
        if (!this.f345982z.g()) {
            return 0L;
        }
        y.a aVarF = this.f345982z.f(j12);
        return l0Var.a(j12, aVarF.f345389a.f345394a, aVarF.f345390b.f345394a);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
        k();
        if (o()) {
            return;
        }
        boolean[] zArr = this.f345981y.f346004c;
        int length = this.f345976t.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f345976t[i12].h(j12, z12, zArr[i12]);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void e(InterfaceC36559w.a aVar, long j12) {
        this.f345974r = aVar;
        this.f345970n.c();
        t();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
        com.google.android.exoplayer2.trackselection.k kVar;
        k();
        e eVar = this.f345981y;
        W w12 = eVar.f346002a;
        boolean[] zArr3 = eVar.f346004c;
        int i12 = this.f345950F;
        int i13 = 0;
        for (int i14 = 0; i14 < kVarArr.length; i14++) {
            M m12 = mArr[i14];
            if (m12 != null && (kVarArr[i14] == null || !zArr[i14])) {
                int i15 = ((c) m12).f345998b;
                C36585a.d(zArr3[i15]);
                this.f345950F--;
                zArr3[i15] = false;
                mArr[i14] = null;
            }
        }
        boolean z12 = !this.f345948D ? j12 == 0 : i12 != 0;
        for (int i16 = 0; i16 < kVarArr.length; i16++) {
            if (mArr[i16] == null && (kVar = kVarArr[i16]) != null) {
                C36585a.d(kVar.length() == 1);
                C36585a.d(kVar.b(0) == 0);
                int iB2 = w12.b(kVar.i());
                C36585a.d(!zArr3[iB2]);
                this.f345950F++;
                zArr3[iB2] = true;
                mArr[i16] = new c(iB2);
                zArr2[i16] = true;
                if (!z12) {
                    L l12 = this.f345976t[iB2];
                    z12 = (l12.z(j12, true) || l12.o() == 0) ? false : true;
                }
            }
        }
        if (this.f345950F == 0) {
            this.f345954J = false;
            this.f345949E = false;
            Loader loader = this.f345968l;
            if (loader.c()) {
                L[] lArr = this.f345976t;
                int length = lArr.length;
                while (i13 < length) {
                    lArr[i13].i();
                    i13++;
                }
                loader.a();
            } else {
                for (L l13 : this.f345976t) {
                    l13.y(false);
                }
            }
        } else if (z12) {
            j12 = seekToUs(j12);
            while (i13 < mArr.length) {
                if (mArr[i13] != null) {
                    zArr2[i13] = true;
                }
                i13++;
            }
        }
        this.f345948D = true;
        return j12;
    }

    @Override // com.google.android.exoplayer2.source.L.d
    public final void g() {
        this.f345973q.post(this.f345971o);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        long jN2;
        boolean z12;
        long j12;
        k();
        boolean[] zArr = this.f345981y.f346003b;
        if (this.f345956L) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.f345953I;
        }
        if (this.f345980x) {
            int length = this.f345976t.length;
            jN2 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < length; i12++) {
                if (zArr[i12]) {
                    L l12 = this.f345976t[i12];
                    synchronized (l12) {
                        z12 = l12.f346065w;
                    }
                    if (z12) {
                        continue;
                    } else {
                        L l13 = this.f345976t[i12];
                        synchronized (l13) {
                            j12 = l13.f346064v;
                        }
                        jN2 = Math.min(jN2, j12);
                    }
                }
            }
        } else {
            jN2 = Long.MAX_VALUE;
        }
        if (jN2 == Long.MAX_VALUE) {
            jN2 = n();
        }
        return jN2 == Long.MIN_VALUE ? this.f345952H : jN2;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        if (this.f345950F == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        k();
        return this.f345981y.f346002a;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        a aVar = (a) eVar;
        com.google.android.exoplayer2.upstream.J j14 = aVar.f345985c;
        Uri uri = j14.f347753c;
        C36554q c36554q = new C36554q(aVar.f345983a, j14.f347754d);
        this.f345961e.getClass();
        this.f345962f.d(c36554q, 1, -1, null, 0, null, aVar.f345992j, this.f345945A);
        if (z12) {
            return;
        }
        if (this.f345951G == -1) {
            this.f345951G = aVar.f345994l;
        }
        for (L l12 : this.f345976t) {
            l12.y(false);
        }
        if (this.f345950F > 0) {
            InterfaceC36559w.a aVar2 = this.f345974r;
            aVar2.getClass();
            aVar2.g(this);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void i(final com.google.android.exoplayer2.extractor.y yVar) {
        this.f345973q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.F
            @Override // java.lang.Runnable
            public final void run() {
                G g12 = this.f345941b;
                IcyHeaders icyHeaders = g12.f345975s;
                com.google.android.exoplayer2.extractor.y yVar2 = yVar;
                g12.f345982z = icyHeaders == null ? yVar2 : new y.b(-9223372036854775807L);
                g12.f345945A = yVar2.d();
                boolean z12 = g12.f345951G == -1 && yVar2.d() == -9223372036854775807L;
                g12.f345946B = z12;
                g12.f345947C = z12 ? 7 : 1;
                g12.f345964h.F(g12.f345945A, yVar2.g(), g12.f345946B);
                if (g12.f345979w) {
                    return;
                }
                g12.p();
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        boolean z12;
        if (this.f345968l.c()) {
            C36592h c36592h = this.f345970n;
            synchronized (c36592h) {
                z12 = c36592h.f348131b;
            }
            if (z12) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13) {
        com.google.android.exoplayer2.extractor.y yVar;
        a aVar = (a) eVar;
        if (this.f345945A == -9223372036854775807L && (yVar = this.f345982z) != null) {
            boolean zG2 = yVar.g();
            long jN2 = n();
            long j14 = jN2 == Long.MIN_VALUE ? 0L : jN2 + 10000;
            this.f345945A = j14;
            this.f345964h.F(j14, zG2, this.f345946B);
        }
        com.google.android.exoplayer2.upstream.J j15 = aVar.f345985c;
        Uri uri = j15.f347753c;
        C36554q c36554q = new C36554q(aVar.f345983a, j15.f347754d);
        this.f345961e.getClass();
        this.f345962f.f(c36554q, 1, -1, null, 0, null, aVar.f345992j, this.f345945A);
        if (this.f345951G == -1) {
            this.f345951G = aVar.f345994l;
        }
        this.f345956L = true;
        InterfaceC36559w.a aVar2 = this.f345974r;
        aVar2.getClass();
        aVar2.g(this);
    }

    @InterfaceC49173d
    public final void k() {
        C36585a.d(this.f345979w);
        this.f345981y.getClass();
        this.f345982z.getClass();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        Loader.c cVarB;
        com.google.android.exoplayer2.extractor.y yVar;
        a aVar = (a) eVar;
        if (this.f345951G == -1) {
            this.f345951G = aVar.f345994l;
        }
        com.google.android.exoplayer2.upstream.J j14 = aVar.f345985c;
        Uri uri = j14.f347753c;
        C36554q c36554q = new C36554q(aVar.f345983a, j14.f347754d);
        com.google.android.exoplayer2.util.U.R(aVar.f345992j);
        com.google.android.exoplayer2.util.U.R(this.f345945A);
        long jB2 = this.f345961e.b(new z.d(iOException, i12));
        if (jB2 == -9223372036854775807L) {
            cVarB = Loader.f347761f;
        } else {
            int iM2 = m();
            boolean z12 = iM2 > this.f345955K;
            if (this.f345951G != -1 || ((yVar = this.f345982z) != null && yVar.d() != -9223372036854775807L)) {
                this.f345955K = iM2;
            } else if (!this.f345979w || u()) {
                this.f345949E = this.f345979w;
                this.f345952H = 0L;
                this.f345955K = 0;
                for (L l12 : this.f345976t) {
                    l12.y(false);
                }
                aVar.f345989g.f345347a = 0L;
                aVar.f345992j = 0L;
                aVar.f345991i = true;
                aVar.f345996n = false;
            } else {
                this.f345954J = true;
                cVarB = Loader.f347760e;
            }
            cVarB = Loader.b(jB2, z12);
        }
        int i13 = cVarB.f347765a;
        this.f345962f.h(c36554q, 1, -1, null, 0, null, aVar.f345992j, this.f345945A, iOException, !(i13 == 0 || i13 == 1));
        return cVarB;
    }

    public final int m() {
        int i12 = 0;
        for (L l12 : this.f345976t) {
            i12 += l12.f346059q + l12.f346058p;
        }
        return i12;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() throws IOException {
        this.f345968l.d(this.f345961e.a(this.f345947C));
        if (this.f345956L && !this.f345979w) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    public final long n() {
        long j12;
        long jMax = Long.MIN_VALUE;
        for (L l12 : this.f345976t) {
            synchronized (l12) {
                j12 = l12.f346064v;
            }
            jMax = Math.max(jMax, j12);
        }
        return jMax;
    }

    public final boolean o() {
        return this.f345953I != -9223372036854775807L;
    }

    public final void p() {
        Metadata metadata;
        int i12;
        if (this.f345957M || this.f345979w || !this.f345978v || this.f345982z == null) {
            return;
        }
        for (L l12 : this.f345976t) {
            if (l12.r() == null) {
                return;
            }
        }
        C36592h c36592h = this.f345970n;
        synchronized (c36592h) {
            c36592h.f348131b = false;
        }
        int length = this.f345976t.length;
        V[] vArr = new V[length];
        boolean[] zArr = new boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            com.google.android.exoplayer2.I iR2 = this.f345976t[i13].r();
            iR2.getClass();
            String str = iR2.f343476m;
            boolean zK2 = com.google.android.exoplayer2.util.z.k(str);
            boolean z12 = zK2 || com.google.android.exoplayer2.util.z.m(str);
            zArr[i13] = z12;
            this.f345980x = z12 | this.f345980x;
            IcyHeaders icyHeaders = this.f345975s;
            if (icyHeaders != null) {
                if (zK2 || this.f345977u[i13].f346001b) {
                    Metadata metadata2 = iR2.f343474k;
                    if (metadata2 == null) {
                        metadata = new Metadata(icyHeaders);
                    } else {
                        int i14 = com.google.android.exoplayer2.util.U.f348106a;
                        Metadata.Entry[] entryArr = metadata2.f345623b;
                        Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                        System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, objArrCopyOf, entryArr.length, 1);
                        metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                    }
                    I.b bVarA = iR2.a();
                    bVarA.f343502i = metadata;
                    iR2 = bVarA.a();
                }
                if (zK2 && iR2.f343470g == -1 && iR2.f343471h == -1 && (i12 = icyHeaders.f345658b) != -1) {
                    I.b bVarA2 = iR2.a();
                    bVarA2.f343499f = i12;
                    iR2 = bVarA2.a();
                }
            }
            int iC2 = this.f345960d.c(iR2);
            I.b bVarA3 = iR2.a();
            bVarA3.f343493D = iC2;
            vArr[i13] = new V(Integer.toString(i13), bVarA3.a());
        }
        this.f345981y = new e(new W(vArr), zArr);
        this.f345979w = true;
        InterfaceC36559w.a aVar = this.f345974r;
        aVar.getClass();
        aVar.c(this);
    }

    public final void q(int i12) {
        k();
        e eVar = this.f345981y;
        boolean[] zArr = eVar.f346005d;
        if (zArr[i12]) {
            return;
        }
        com.google.android.exoplayer2.I i13 = eVar.f346002a.a(i12).f346151e[0];
        int i14 = com.google.android.exoplayer2.util.z.i(i13.f343476m);
        long j12 = this.f345952H;
        A.a aVar = this.f345962f;
        aVar.c(new C36557u(1, i14, i13, 0, null, aVar.b(j12), -9223372036854775807L));
        zArr[i12] = true;
    }

    public final void r(int i12) {
        k();
        boolean[] zArr = this.f345981y.f346003b;
        if (this.f345954J && zArr[i12] && !this.f345976t[i12].t(false)) {
            this.f345953I = 0L;
            this.f345954J = false;
            this.f345949E = true;
            this.f345952H = 0L;
            this.f345955K = 0;
            for (L l12 : this.f345976t) {
                l12.y(false);
            }
            InterfaceC36559w.a aVar = this.f345974r;
            aVar.getClass();
            aVar.g(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        if (!this.f345949E) {
            return -9223372036854775807L;
        }
        if (!this.f345956L && m() <= this.f345955K) {
            return -9223372036854775807L;
        }
        this.f345949E = false;
        return this.f345952H;
    }

    public final L s(d dVar) {
        int length = this.f345976t.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (dVar.equals(this.f345977u[i12])) {
                return this.f345976t[i12];
            }
        }
        com.google.android.exoplayer2.drm.f fVar = this.f345960d;
        fVar.getClass();
        L l12 = new L(this.f345965i, fVar, this.f345963g);
        l12.f346048f = this;
        int i13 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f345977u, i13);
        dVarArr[length] = dVar;
        int i14 = com.google.android.exoplayer2.util.U.f348106a;
        this.f345977u = dVarArr;
        L[] lArr = (L[]) Arrays.copyOf(this.f345976t, i13);
        lArr[length] = l12;
        this.f345976t = lArr;
        return l12;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long seekToUs(long j12) {
        k();
        boolean[] zArr = this.f345981y.f346003b;
        if (!this.f345982z.g()) {
            j12 = 0;
        }
        this.f345949E = false;
        this.f345952H = j12;
        if (o()) {
            this.f345953I = j12;
            return j12;
        }
        if (this.f345947C != 7) {
            int length = this.f345976t.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (this.f345976t[i12].z(j12, false) || (!zArr[i12] && this.f345980x)) {
                }
            }
            return j12;
        }
        this.f345954J = false;
        this.f345953I = j12;
        this.f345956L = false;
        Loader loader = this.f345968l;
        if (loader.c()) {
            for (L l12 : this.f345976t) {
                l12.i();
            }
            loader.a();
        } else {
            loader.f347764c = null;
            for (L l13 : this.f345976t) {
                l13.y(false);
            }
        }
        return j12;
    }

    public final void t() {
        a aVar = new a(this.f345958b, this.f345959c, this.f345969m, this, this.f345970n);
        if (this.f345979w) {
            C36585a.d(o());
            long j12 = this.f345945A;
            if (j12 != -9223372036854775807L && this.f345953I > j12) {
                this.f345956L = true;
                this.f345953I = -9223372036854775807L;
                return;
            }
            com.google.android.exoplayer2.extractor.y yVar = this.f345982z;
            yVar.getClass();
            long j13 = yVar.f(this.f345953I).f345389a.f345395b;
            long j14 = this.f345953I;
            aVar.f345989g.f345347a = j13;
            aVar.f345992j = j14;
            aVar.f345991i = true;
            aVar.f345996n = false;
            for (L l12 : this.f345976t) {
                l12.f346062t = this.f345953I;
            }
            this.f345953I = -9223372036854775807L;
        }
        this.f345955K = m();
        this.f345968l.f(aVar, this, this.f345961e.a(this.f345947C));
        this.f345962f.k(new C36554q(aVar.f345983a, aVar.f345993k), 1, -1, null, 0, null, aVar.f345992j, this.f345945A);
    }

    public final boolean u() {
        return this.f345949E || o();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
    }
}
