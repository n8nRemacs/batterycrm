package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.datasource.o;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.source.O;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.l;
import androidx.media3.extractor.H;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v61.InterfaceC49173d;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes.dex */
final class J implements InterfaceC23174z, androidx.media3.extractor.r, Loader.b<a>, Loader.f, O.d {

    /* renamed from: N, reason: collision with root package name */
    public static final Map<String, String> f49509N;

    /* renamed from: O, reason: collision with root package name */
    public static final C23108t f49510O;

    /* renamed from: B, reason: collision with root package name */
    public boolean f49512B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f49514D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f49515E;

    /* renamed from: F, reason: collision with root package name */
    public int f49516F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f49517G;

    /* renamed from: H, reason: collision with root package name */
    public long f49518H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f49520J;

    /* renamed from: K, reason: collision with root package name */
    public int f49521K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f49522L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f49523M;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f49524b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.datasource.j f49525c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.g f49526d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49527e;

    /* renamed from: f, reason: collision with root package name */
    public final D.a f49528f;

    /* renamed from: g, reason: collision with root package name */
    public final f.a f49529g;

    /* renamed from: h, reason: collision with root package name */
    public final K f49530h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f49531i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f49532j;

    /* renamed from: k, reason: collision with root package name */
    public final long f49533k;

    /* renamed from: m, reason: collision with root package name */
    public final G f49535m;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public InterfaceC23174z.a f49540r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public IcyHeaders f49541s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49544v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49545w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f49546x;

    /* renamed from: y, reason: collision with root package name */
    public e f49547y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.media3.extractor.H f49548z;

    /* renamed from: l, reason: collision with root package name */
    public final Loader f49534l = new Loader("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    public final C23118i f49536n = new C23118i();

    /* renamed from: o, reason: collision with root package name */
    public final H f49537o = new H(this, 1);

    /* renamed from: p, reason: collision with root package name */
    public final H f49538p = new H(this, 2);

    /* renamed from: q, reason: collision with root package name */
    public final Handler f49539q = androidx.media3.common.util.M.n(null);

    /* renamed from: u, reason: collision with root package name */
    public d[] f49543u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    public O[] f49542t = new O[0];

    /* renamed from: I, reason: collision with root package name */
    public long f49519I = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public long f49511A = -9223372036854775807L;

    /* renamed from: C, reason: collision with root package name */
    public int f49513C = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class a implements Loader.e, r.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f49550b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.datasource.z f49551c;

        /* renamed from: d, reason: collision with root package name */
        public final G f49552d;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.media3.extractor.r f49553e;

        /* renamed from: f, reason: collision with root package name */
        public final C23118i f49554f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f49556h;

        /* renamed from: j, reason: collision with root package name */
        public long f49558j;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        public O f49560l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f49561m;

        /* renamed from: g, reason: collision with root package name */
        public final androidx.media3.extractor.F f49555g = new androidx.media3.extractor.F();

        /* renamed from: i, reason: collision with root package name */
        public boolean f49557i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f49549a = C23167s.f49826b.getAndIncrement();

        /* renamed from: k, reason: collision with root package name */
        public androidx.media3.datasource.o f49559k = b(0);

        public a(Uri uri, androidx.media3.datasource.j jVar, G g12, androidx.media3.extractor.r rVar, C23118i c23118i) {
            this.f49550b = uri;
            this.f49551c = new androidx.media3.datasource.z(jVar);
            this.f49552d = g12;
            this.f49553e = rVar;
            this.f49554f = c23118i;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void a() {
            this.f49556h = true;
        }

        public final androidx.media3.datasource.o b(long j12) {
            o.b bVar = new o.b();
            bVar.f48255a = this.f49550b;
            bVar.f48260f = j12;
            bVar.f48262h = J.this.f49532j;
            bVar.f48263i = 6;
            bVar.f48259e = J.f49509N;
            return bVar.a();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void load() {
            androidx.media3.datasource.j rVar;
            int i12;
            int iE2 = 0;
            while (iE2 == 0 && !this.f49556h) {
                try {
                    long j12 = this.f49555g.f50372a;
                    androidx.media3.datasource.o oVarB = b(j12);
                    this.f49559k = oVarB;
                    long jE2 = this.f49551c.e(oVarB);
                    if (jE2 != -1) {
                        jE2 += j12;
                        J j13 = J.this;
                        j13.f49539q.post(new H(j13, 0));
                    }
                    long j14 = jE2;
                    J.this.f49541s = IcyHeaders.a(this.f49551c.f48318a.c());
                    androidx.media3.datasource.z zVar = this.f49551c;
                    IcyHeaders icyHeaders = J.this.f49541s;
                    if (icyHeaders == null || (i12 = icyHeaders.f50649g) == -1) {
                        rVar = zVar;
                    } else {
                        rVar = new r(zVar, i12, this);
                        J j15 = J.this;
                        j15.getClass();
                        O oR2 = j15.r(new d(0, true));
                        this.f49560l = oR2;
                        oR2.b(J.f49510O);
                    }
                    long jC2 = j12;
                    this.f49552d.d(rVar, this.f49550b, this.f49551c.f48318a.c(), j12, j14, this.f49553e);
                    if (J.this.f49541s != null) {
                        this.f49552d.b();
                    }
                    if (this.f49557i) {
                        this.f49552d.a(jC2, this.f49558j);
                        this.f49557i = false;
                    }
                    while (true) {
                        long j16 = jC2;
                        while (iE2 == 0 && !this.f49556h) {
                            try {
                                this.f49554f.a();
                                iE2 = this.f49552d.e(this.f49555g);
                                jC2 = this.f49552d.c();
                                if (jC2 > J.this.f49533k + j16) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f49554f.c();
                        J j17 = J.this;
                        j17.f49539q.post(j17.f49538p);
                    }
                    if (iE2 == 1) {
                        iE2 = 0;
                    } else if (this.f49552d.c() != -1) {
                        this.f49555g.f50372a = this.f49552d.c();
                    }
                    androidx.media3.datasource.n.a(this.f49551c);
                } catch (Throwable th2) {
                    if (iE2 != 1 && this.f49552d.c() != -1) {
                        this.f49555g.f50372a = this.f49552d.c();
                    }
                    androidx.media3.datasource.n.a(this.f49551c);
                    throw th2;
                }
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class c implements P {

        /* renamed from: b, reason: collision with root package name */
        public final int f49563b;

        public c(int i12) {
            this.f49563b = i12;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            int i12;
            J j13 = J.this;
            boolean z12 = false;
            if (j13.t()) {
                return 0;
            }
            int i13 = this.f49563b;
            j13.p(i13);
            O o12 = j13.f49542t[i13];
            boolean z13 = j13.f49522L;
            synchronized (o12) {
                int iJ2 = o12.j(o12.f49633s);
                int i14 = o12.f49633s;
                int i15 = o12.f49630p;
                if (i14 != i15 && j12 >= o12.f49628n[iJ2]) {
                    if (j12 <= o12.f49636v || !z13) {
                        i12 = o12.i(iJ2, i15 - i14, j12, true);
                        if (i12 == -1) {
                        }
                    } else {
                        i12 = i15 - i14;
                    }
                }
                i12 = 0;
            }
            synchronized (o12) {
                if (i12 >= 0) {
                    try {
                        if (o12.f49633s + i12 <= o12.f49630p) {
                            z12 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C23110a.b(z12);
                o12.f49633s += i12;
            }
            if (i12 == 0) {
                j13.q(i13);
            }
            return i12;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() throws IOException {
            J j12 = J.this;
            O o12 = j12.f49542t[this.f49563b];
            DrmSession drmSession = o12.f49622h;
            if (drmSession == null || drmSession.getState() != 1) {
                j12.f49534l.c(j12.f49527e.a(j12.f49513C));
            } else {
                DrmSession.DrmSessionException error = o12.f49622h.getError();
                error.getClass();
                throw error;
            }
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            int i13;
            J j12 = J.this;
            if (j12.t()) {
                return -3;
            }
            int i14 = this.f49563b;
            j12.p(i14);
            O o12 = j12.f49542t[i14];
            boolean z12 = j12.f49522L;
            o12.getClass();
            boolean z13 = (i12 & 2) != 0;
            O.b bVar = o12.f49616b;
            synchronized (o12) {
                try {
                    decoderInputBuffer.f48324e = false;
                    int i15 = o12.f49633s;
                    if (i15 != o12.f49630p) {
                        C23108t c23108t = o12.f49617c.a(o12.f49631q + i15).f49644a;
                        if (!z13 && c23108t == o12.f49621g) {
                            int iJ2 = o12.j(o12.f49633s);
                            if (o12.l(iJ2)) {
                                decoderInputBuffer.f48328b = o12.f49627m[iJ2];
                                if (o12.f49633s == o12.f49630p - 1 && (z12 || o12.f49637w)) {
                                    decoderInputBuffer.e(536870912);
                                }
                                long j13 = o12.f49628n[iJ2];
                                decoderInputBuffer.f48325f = j13;
                                if (j13 < o12.f49634t) {
                                    decoderInputBuffer.e(BeduinInputModel.MIN_TEXT_VERSION);
                                }
                                bVar.f49641a = o12.f49626l[iJ2];
                                bVar.f49642b = o12.f49625k[iJ2];
                                bVar.f49643c = o12.f49629o[iJ2];
                                i13 = -4;
                            } else {
                                decoderInputBuffer.f48324e = true;
                                i13 = -3;
                            }
                        }
                        o12.m(c23108t, f12);
                        i13 = -5;
                    } else {
                        if (!z12 && !o12.f49637w) {
                            C23108t c23108t2 = o12.f49612B;
                            if (c23108t2 == null || (!z13 && c23108t2 == o12.f49621g)) {
                                i13 = -3;
                            }
                            o12.m(c23108t2, f12);
                            i13 = -5;
                        }
                        decoderInputBuffer.f48328b = 4;
                        i13 = -4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i13 == -4 && !decoderInputBuffer.f(4)) {
                boolean z14 = (i12 & 1) != 0;
                if ((i12 & 4) == 0) {
                    if (z14) {
                        M m12 = o12.f49615a;
                        M.e(m12.f49594e, decoderInputBuffer, o12.f49616b, m12.f49592c);
                    } else {
                        M m13 = o12.f49615a;
                        m13.f49594e = M.e(m13.f49594e, decoderInputBuffer, o12.f49616b, m13.f49592c);
                    }
                }
                if (!z14) {
                    o12.f49633s++;
                }
            }
            if (i13 == -3) {
                j12.q(i14);
            }
            return i13;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            J j12 = J.this;
            return !j12.t() && j12.f49542t[this.f49563b].k(j12.f49522L);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f49565a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49566b;

        public d(int i12, boolean z12) {
            this.f49565a = i12;
            this.f49566b = z12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f49565a == dVar.f49565a && this.f49566b == dVar.f49566b;
        }

        public final int hashCode() {
            return (this.f49565a * 31) + (this.f49566b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Y f49567a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f49568b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f49569c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f49570d;

        public e(Y y12, boolean[] zArr) {
            this.f49567a = y12;
            this.f49568b = zArr;
            int i12 = y12.f49708b;
            this.f49569c = new boolean[i12];
            this.f49570d = new boolean[i12];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f49509N = Collections.unmodifiableMap(map);
        C23108t.b bVar = new C23108t.b();
        bVar.f47777a = "icy";
        bVar.f47787k = "application/x-icy";
        f49510O = bVar.a();
    }

    public J(Uri uri, androidx.media3.datasource.j jVar, G g12, androidx.media3.exoplayer.drm.g gVar, f.a aVar, androidx.media3.exoplayer.upstream.l lVar, D.a aVar2, K k12, androidx.media3.exoplayer.upstream.b bVar, @j.P String str, int i12) {
        this.f49524b = uri;
        this.f49525c = jVar;
        this.f49526d = gVar;
        this.f49529g = aVar;
        this.f49527e = lVar;
        this.f49528f = aVar2;
        this.f49530h = k12;
        this.f49531i = bVar;
        this.f49532j = str;
        this.f49533k = i12;
        this.f49535m = g12;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public final void a() {
        for (O o12 : this.f49542t) {
            o12.n(true);
            DrmSession drmSession = o12.f49622h;
            if (drmSession != null) {
                drmSession.f(o12.f49619e);
                o12.f49622h = null;
                o12.f49621g = null;
            }
        }
        this.f49535m.release();
    }

    @Override // androidx.media3.extractor.r
    public final void b() {
        this.f49544v = true;
        this.f49539q.post(this.f49537o);
    }

    @Override // androidx.media3.extractor.r
    public final androidx.media3.extractor.J c(int i12, int i13) {
        return r(new d(i12, false));
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        if (this.f49522L) {
            return false;
        }
        Loader loader = this.f49534l;
        if (loader.f50049c != null || this.f49520J) {
            return false;
        }
        if (this.f49545w && this.f49516F == 0) {
            return false;
        }
        boolean zD2 = this.f49536n.d();
        if (loader.b()) {
            return zD2;
        }
        s();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
        androidx.media3.exoplayer.trackselection.k kVar;
        k();
        e eVar = this.f49547y;
        Y y12 = eVar.f49567a;
        boolean[] zArr3 = eVar.f49569c;
        int i12 = this.f49516F;
        int i13 = 0;
        for (int i14 = 0; i14 < kVarArr.length; i14++) {
            P p12 = pArr[i14];
            if (p12 != null && (kVarArr[i14] == null || !zArr[i14])) {
                int i15 = ((c) p12).f49563b;
                C23110a.g(zArr3[i15]);
                this.f49516F--;
                zArr3[i15] = false;
                pArr[i14] = null;
            }
        }
        boolean z12 = !this.f49514D ? j12 == 0 : i12 != 0;
        for (int i16 = 0; i16 < kVarArr.length; i16++) {
            if (pArr[i16] == null && (kVar = kVarArr[i16]) != null) {
                C23110a.g(kVar.length() == 1);
                C23110a.g(kVar.b(0) == 0);
                int iIndexOf = y12.f49709c.indexOf(kVar.i());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                C23110a.g(!zArr3[iIndexOf]);
                this.f49516F++;
                zArr3[iIndexOf] = true;
                pArr[i16] = new c(iIndexOf);
                zArr2[i16] = true;
                if (!z12) {
                    O o12 = this.f49542t[iIndexOf];
                    z12 = (o12.o(j12, true) || o12.f49631q + o12.f49633s == 0) ? false : true;
                }
            }
        }
        if (this.f49516F == 0) {
            this.f49520J = false;
            this.f49515E = false;
            Loader loader = this.f49534l;
            if (loader.b()) {
                O[] oArr = this.f49542t;
                int length = oArr.length;
                while (i13 < length) {
                    oArr[i13].h();
                    i13++;
                }
                loader.a();
            } else {
                for (O o13 : this.f49542t) {
                    o13.n(false);
                }
            }
        } else if (z12) {
            j12 = seekToUs(j12);
            while (i13 < pArr.length) {
                if (pArr[i13] != null) {
                    zArr2[i13] = true;
                }
                i13++;
            }
        }
        this.f49514D = true;
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void discardBuffer(long j12, boolean z12) {
        long jG2;
        int i12;
        k();
        if (n()) {
            return;
        }
        boolean[] zArr = this.f49547y.f49569c;
        int length = this.f49542t.length;
        for (int i13 = 0; i13 < length; i13++) {
            O o12 = this.f49542t[i13];
            boolean z13 = zArr[i13];
            M m12 = o12.f49615a;
            synchronized (o12) {
                try {
                    int i14 = o12.f49630p;
                    jG2 = -1;
                    if (i14 != 0) {
                        long[] jArr = o12.f49628n;
                        int i15 = o12.f49632r;
                        if (j12 >= jArr[i15]) {
                            int i16 = o12.i(i15, (!z13 || (i12 = o12.f49633s) == i14) ? i14 : i12 + 1, j12, z12);
                            if (i16 != -1) {
                                jG2 = o12.g(i16);
                            }
                        }
                    }
                } finally {
                }
            }
            m12.a(jG2);
        }
    }

    @Override // androidx.media3.extractor.r
    public final void e(final androidx.media3.extractor.H h12) {
        this.f49539q.post(new Runnable() { // from class: androidx.media3.exoplayer.source.I
            @Override // java.lang.Runnable
            public final void run() {
                J j12 = this.f49507b;
                IcyHeaders icyHeaders = j12.f49541s;
                androidx.media3.extractor.H h13 = h12;
                j12.f49548z = icyHeaders == null ? h13 : new H.b(-9223372036854775807L);
                j12.f49511A = h13.d();
                boolean z12 = !j12.f49517G && h13.d() == -9223372036854775807L;
                j12.f49512B = z12;
                j12.f49513C = z12 ? 7 : 1;
                j12.f49530h.E(j12.f49511A, h13.g(), j12.f49512B);
                if (j12.f49545w) {
                    return;
                }
                j12.o();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void f(InterfaceC23174z.a aVar, long j12) {
        this.f49540r = aVar;
        this.f49536n.d();
        s();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j12, long j13) {
        androidx.media3.extractor.H h12;
        a aVar = (a) eVar;
        if (this.f49511A == -9223372036854775807L && (h12 = this.f49548z) != null) {
            boolean zG2 = h12.g();
            long jM2 = m(true);
            long j14 = jM2 == Long.MIN_VALUE ? 0L : jM2 + 10000;
            this.f49511A = j14;
            this.f49530h.E(j14, zG2, this.f49512B);
        }
        androidx.media3.datasource.z zVar = aVar.f49551c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(aVar.f49549a, zVar.f48321d);
        this.f49527e.getClass();
        this.f49528f.c(c23167s, new C23171w(1, -1, null, 0, androidx.media3.common.util.M.Q(aVar.f49558j), androidx.media3.common.util.M.Q(this.f49511A)));
        this.f49522L = true;
        InterfaceC23174z.a aVar2 = this.f49540r;
        aVar2.getClass();
        aVar2.g(this);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        long jM2;
        boolean z12;
        long j12;
        k();
        if (this.f49522L || this.f49516F == 0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f49519I;
        }
        if (this.f49546x) {
            int length = this.f49542t.length;
            jM2 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < length; i12++) {
                e eVar = this.f49547y;
                if (eVar.f49568b[i12] && eVar.f49569c[i12]) {
                    O o12 = this.f49542t[i12];
                    synchronized (o12) {
                        z12 = o12.f49637w;
                    }
                    if (z12) {
                        continue;
                    } else {
                        O o13 = this.f49542t[i12];
                        synchronized (o13) {
                            j12 = o13.f49636v;
                        }
                        jM2 = Math.min(jM2, j12);
                    }
                }
            }
        } else {
            jM2 = Long.MAX_VALUE;
        }
        if (jM2 == Long.MAX_VALUE) {
            jM2 = m(false);
        }
        return jM2 == Long.MIN_VALUE ? this.f49518H : jM2;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final Y getTrackGroups() {
        k();
        return this.f49547y.f49567a;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c h(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        Loader.c cVar;
        androidx.media3.extractor.H h12;
        a aVar = (a) eVar;
        androidx.media3.datasource.z zVar = aVar.f49551c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(aVar.f49549a, zVar.f48321d);
        androidx.media3.common.util.M.Q(aVar.f49558j);
        androidx.media3.common.util.M.Q(this.f49511A);
        long jB2 = this.f49527e.b(new l.d(iOException, i12));
        if (jB2 == -9223372036854775807L) {
            cVar = Loader.f50046e;
        } else {
            int iL2 = l();
            int i13 = iL2 > this.f49521K ? 1 : 0;
            if (this.f49517G || !((h12 = this.f49548z) == null || h12.d() == -9223372036854775807L)) {
                this.f49521K = iL2;
            } else if (!this.f49545w || t()) {
                this.f49515E = this.f49545w;
                this.f49518H = 0L;
                this.f49521K = 0;
                for (O o12 : this.f49542t) {
                    o12.n(false);
                }
                aVar.f49555g.f50372a = 0L;
                aVar.f49558j = 0L;
                aVar.f49557i = true;
                aVar.f49561m = false;
            } else {
                this.f49520J = true;
                cVar = Loader.f50045d;
            }
            Loader.c cVar2 = Loader.f50045d;
            cVar = new Loader.c(i13, jB2, null);
        }
        int i14 = cVar.f50050a;
        this.f49528f.d(c23167s, new C23171w(1, -1, null, 0, androidx.media3.common.util.M.Q(aVar.f49558j), androidx.media3.common.util.M.Q(this.f49511A)), iOException, true ^ (i14 == 0 || i14 == 1));
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long i(long j12, g0 g0Var) {
        k();
        if (!this.f49548z.g()) {
            return 0L;
        }
        H.a aVarF = this.f49548z.f(j12);
        long j13 = aVarF.f50373a.f50378a;
        long j14 = aVarF.f50374b.f50378a;
        long j15 = g0Var.f49168a;
        long j16 = g0Var.f49169b;
        if (j15 == 0 && j16 == 0) {
            return j12;
        }
        int i12 = androidx.media3.common.util.M.f47887a;
        long j17 = j12 - j15;
        if (((j15 ^ j12) & (j12 ^ j17)) < 0) {
            j17 = Long.MIN_VALUE;
        }
        long j18 = j12 + j16;
        if (((j16 ^ j18) & (j12 ^ j18)) < 0) {
            j18 = Long.MAX_VALUE;
        }
        boolean z12 = false;
        boolean z13 = j17 <= j13 && j13 <= j18;
        if (j17 <= j14 && j14 <= j18) {
            z12 = true;
        }
        if (z13 && z12) {
            if (Math.abs(j13 - j12) <= Math.abs(j14 - j12)) {
                return j13;
            }
        } else {
            if (z13) {
                return j13;
            }
            if (!z12) {
                return j17;
            }
        }
        return j14;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        boolean z12;
        if (this.f49534l.b()) {
            C23118i c23118i = this.f49536n;
            synchronized (c23118i) {
                z12 = c23118i.f47909b;
            }
            if (z12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13, boolean z12) {
        a aVar = (a) eVar;
        androidx.media3.datasource.z zVar = aVar.f49551c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(aVar.f49549a, zVar.f48321d);
        this.f49527e.getClass();
        this.f49528f.b(c23167s, new C23171w(1, -1, null, 0, androidx.media3.common.util.M.Q(aVar.f49558j), androidx.media3.common.util.M.Q(this.f49511A)));
        if (z12) {
            return;
        }
        for (O o12 : this.f49542t) {
            o12.n(false);
        }
        if (this.f49516F > 0) {
            InterfaceC23174z.a aVar2 = this.f49540r;
            aVar2.getClass();
            aVar2.g(this);
        }
    }

    @InterfaceC49173d
    public final void k() {
        C23110a.g(this.f49545w);
        this.f49547y.getClass();
        this.f49548z.getClass();
    }

    public final int l() {
        int i12 = 0;
        for (O o12 : this.f49542t) {
            i12 += o12.f49631q + o12.f49630p;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            androidx.media3.exoplayer.source.O[] r3 = r6.f49542t
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r7 != 0) goto L15
            androidx.media3.exoplayer.source.J$e r3 = r6.f49547y
            r3.getClass()
            boolean[] r3 = r3.f49569c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            androidx.media3.exoplayer.source.O[] r3 = r6.f49542t
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f49636v     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.J.m(boolean):long");
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void maybeThrowPrepareError() throws IOException {
        this.f49534l.c(this.f49527e.a(this.f49513C));
        if (this.f49522L && !this.f49545w) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    public final boolean n() {
        return this.f49519I != -9223372036854775807L;
    }

    public final void o() {
        C23108t c23108tA;
        int i12;
        if (this.f49523M || this.f49545w || !this.f49544v || this.f49548z == null) {
            return;
        }
        O[] oArr = this.f49542t;
        int length = oArr.length;
        int i13 = 0;
        while (true) {
            C23108t c23108t = null;
            if (i13 >= length) {
                this.f49536n.c();
                int length2 = this.f49542t.length;
                androidx.media3.common.Q[] qArr = new androidx.media3.common.Q[length2];
                boolean[] zArr = new boolean[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    O o12 = this.f49542t[i14];
                    synchronized (o12) {
                        c23108tA = o12.f49639y ? null : o12.f49612B;
                    }
                    c23108tA.getClass();
                    String str = c23108tA.f47757m;
                    boolean zG2 = androidx.media3.common.D.g(str);
                    boolean z12 = zG2 || "video".equals(androidx.media3.common.D.e(str));
                    zArr[i14] = z12;
                    this.f49546x = z12 | this.f49546x;
                    IcyHeaders icyHeaders = this.f49541s;
                    if (icyHeaders != null) {
                        if (zG2 || this.f49543u[i14].f49566b) {
                            Metadata metadata = c23108tA.f47755k;
                            Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders);
                            C23108t.b bVarA = c23108tA.a();
                            bVarA.f47785i = metadata2;
                            c23108tA = bVarA.a();
                        }
                        if (zG2 && c23108tA.f47751g == -1 && c23108tA.f47752h == -1 && (i12 = icyHeaders.f50644b) != -1) {
                            C23108t.b bVarA2 = c23108tA.a();
                            bVarA2.f47782f = i12;
                            c23108tA = bVarA2.a();
                        }
                    }
                    int iA2 = this.f49526d.a(c23108tA);
                    C23108t.b bVarA3 = c23108tA.a();
                    bVarA3.f47776F = iA2;
                    qArr[i14] = new androidx.media3.common.Q(Integer.toString(i14), bVarA3.a());
                }
                this.f49547y = new e(new Y(qArr), zArr);
                this.f49545w = true;
                InterfaceC23174z.a aVar = this.f49540r;
                aVar.getClass();
                aVar.e(this);
                return;
            }
            O o13 = oArr[i13];
            synchronized (o13) {
                if (!o13.f49639y) {
                    c23108t = o13.f49612B;
                }
            }
            if (c23108t == null) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void p(int i12) {
        k();
        e eVar = this.f49547y;
        boolean[] zArr = eVar.f49570d;
        if (zArr[i12]) {
            return;
        }
        C23108t c23108t = eVar.f49567a.a(i12).f47442e[0];
        this.f49528f.a(new C23171w(1, androidx.media3.common.D.f(c23108t.f47757m), c23108t, 0, androidx.media3.common.util.M.Q(this.f49518H), -9223372036854775807L));
        zArr[i12] = true;
    }

    public final void q(int i12) {
        k();
        boolean[] zArr = this.f49547y.f49568b;
        if (this.f49520J && zArr[i12] && !this.f49542t[i12].k(false)) {
            this.f49519I = 0L;
            this.f49520J = false;
            this.f49515E = true;
            this.f49518H = 0L;
            this.f49521K = 0;
            for (O o12 : this.f49542t) {
                o12.n(false);
            }
            InterfaceC23174z.a aVar = this.f49540r;
            aVar.getClass();
            aVar.g(this);
        }
    }

    public final O r(d dVar) {
        int length = this.f49542t.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (dVar.equals(this.f49543u[i12])) {
                return this.f49542t[i12];
            }
        }
        androidx.media3.exoplayer.drm.g gVar = this.f49526d;
        gVar.getClass();
        O o12 = new O(this.f49531i, gVar, this.f49529g);
        o12.f49620f = this;
        int i13 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f49543u, i13);
        dVarArr[length] = dVar;
        int i14 = androidx.media3.common.util.M.f47887a;
        this.f49543u = dVarArr;
        O[] oArr = (O[]) Arrays.copyOf(this.f49542t, i13);
        oArr[length] = o12;
        this.f49542t = oArr;
        return o12;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long readDiscontinuity() {
        if (!this.f49515E) {
            return -9223372036854775807L;
        }
        if (!this.f49522L && l() <= this.f49521K) {
            return -9223372036854775807L;
        }
        this.f49515E = false;
        return this.f49518H;
    }

    public final void s() {
        a aVar = new a(this.f49524b, this.f49525c, this.f49535m, this, this.f49536n);
        if (this.f49545w) {
            C23110a.g(n());
            long j12 = this.f49511A;
            if (j12 != -9223372036854775807L && this.f49519I > j12) {
                this.f49522L = true;
                this.f49519I = -9223372036854775807L;
                return;
            }
            androidx.media3.extractor.H h12 = this.f49548z;
            h12.getClass();
            long j13 = h12.f(this.f49519I).f50373a.f50379b;
            long j14 = this.f49519I;
            aVar.f49555g.f50372a = j13;
            aVar.f49558j = j14;
            aVar.f49557i = true;
            aVar.f49561m = false;
            for (O o12 : this.f49542t) {
                o12.f49634t = this.f49519I;
            }
            this.f49519I = -9223372036854775807L;
        }
        this.f49521K = l();
        this.f49534l.e(aVar, this, this.f49527e.a(this.f49513C));
        this.f49528f.e(new C23167s(aVar.f49549a, aVar.f49559k), new C23171w(1, -1, null, 0, androidx.media3.common.util.M.Q(aVar.f49558j), androidx.media3.common.util.M.Q(this.f49511A)));
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long seekToUs(long j12) {
        k();
        boolean[] zArr = this.f49547y.f49568b;
        if (!this.f49548z.g()) {
            j12 = 0;
        }
        this.f49515E = false;
        this.f49518H = j12;
        if (n()) {
            this.f49519I = j12;
            return j12;
        }
        if (this.f49513C != 7) {
            int length = this.f49542t.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (this.f49542t[i12].o(j12, false) || (!zArr[i12] && this.f49546x)) {
                }
            }
            return j12;
        }
        this.f49520J = false;
        this.f49519I = j12;
        this.f49522L = false;
        Loader loader = this.f49534l;
        if (loader.b()) {
            for (O o12 : this.f49542t) {
                o12.h();
            }
            loader.a();
        } else {
            loader.f50049c = null;
            for (O o13 : this.f49542t) {
                o13.n(false);
            }
        }
        return j12;
    }

    public final boolean t() {
        return this.f49515E || n();
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
    }
}
