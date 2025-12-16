package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.M;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.S;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import j.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.Http2;

/* compiled from: HlsChunkSource.java */
/* loaded from: classes6.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    public final j f346292a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36583m f346293b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36583m f346294c;

    /* renamed from: d, reason: collision with root package name */
    public final t f346295d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f346296e;

    /* renamed from: f, reason: collision with root package name */
    public final I[] f346297f;

    /* renamed from: g, reason: collision with root package name */
    public final HlsPlaylistTracker f346298g;

    /* renamed from: h, reason: collision with root package name */
    public final V f346299h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final List<I> f346300i;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f346302k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f346303l;

    /* renamed from: n, reason: collision with root package name */
    @P
    public BehindLiveWindowException f346305n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public Uri f346306o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f346307p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.k f346308q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f346310s;

    /* renamed from: j, reason: collision with root package name */
    public final g f346301j = new g();

    /* renamed from: m, reason: collision with root package name */
    public byte[] f346304m = U.f348110e;

    /* renamed from: r, reason: collision with root package name */
    public long f346309r = -9223372036854775807L;

    /* compiled from: HlsChunkSource.java */
    public static final class a extends com.google.android.exoplayer2.source.chunk.k {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f346311l;

        @Override // com.google.android.exoplayer2.source.chunk.k
        public final void b(int i12, byte[] bArr) {
            this.f346311l = Arrays.copyOf(bArr, i12);
        }
    }

    /* compiled from: HlsChunkSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public com.google.android.exoplayer2.source.chunk.e f346312a = null;

        /* renamed from: b, reason: collision with root package name */
        public boolean f346313b = false;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Uri f346314c = null;
    }

    /* compiled from: HlsChunkSource.java */
    @k0
    public static final class c extends com.google.android.exoplayer2.source.chunk.b {

        /* renamed from: d, reason: collision with root package name */
        public final List<f.C10596f> f346315d;

        /* renamed from: e, reason: collision with root package name */
        public final long f346316e;

        public c(long j12, List list) {
            super(list.size() - 1);
            this.f346316e = j12;
            this.f346315d = list;
        }

        @Override // com.google.android.exoplayer2.source.chunk.n
        public final long a() {
            long j12 = this.f346215c;
            if (j12 < 0 || j12 > this.f346214b) {
                throw new NoSuchElementException();
            }
            return this.f346316e + this.f346315d.get((int) j12).f346498f;
        }

        @Override // com.google.android.exoplayer2.source.chunk.n
        public final long b() {
            long j12 = this.f346215c;
            if (j12 < 0 || j12 > this.f346214b) {
                throw new NoSuchElementException();
            }
            f.C10596f c10596f = this.f346315d.get((int) j12);
            return this.f346316e + c10596f.f346498f + c10596f.f346496d;
        }
    }

    /* compiled from: HlsChunkSource.java */
    public static final class d extends com.google.android.exoplayer2.trackselection.b {

        /* renamed from: g, reason: collision with root package name */
        public int f346317g;

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int a() {
            return this.f346317g;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void n(long j12, long j13, long j14, List<? extends com.google.android.exoplayer2.source.chunk.m> list, com.google.android.exoplayer2.source.chunk.n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (p(this.f346317g, jElapsedRealtime)) {
                for (int i12 = this.f347159b - 1; i12 >= 0; i12--) {
                    if (!p(i12, jElapsedRealtime)) {
                        this.f346317g = i12;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        @P
        public final Object r() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int s() {
            return 0;
        }
    }

    /* compiled from: HlsChunkSource.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final f.C10596f f346318a;

        /* renamed from: b, reason: collision with root package name */
        public final long f346319b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346320c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f346321d;

        public e(f.C10596f c10596f, long j12, int i12) {
            this.f346318a = c10596f;
            this.f346319b = j12;
            this.f346320c = i12;
            this.f346321d = (c10596f instanceof f.b) && ((f.b) c10596f).f346488n;
        }
    }

    public h(j jVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, I[] iArr, i iVar, @P M m12, t tVar, @P List<I> list, com.google.android.exoplayer2.analytics.p pVar) {
        this.f346292a = jVar;
        this.f346298g = hlsPlaylistTracker;
        this.f346296e = uriArr;
        this.f346297f = iArr;
        this.f346295d = tVar;
        this.f346300i = list;
        this.f346302k = pVar;
        InterfaceC36583m interfaceC36583mA = iVar.a();
        this.f346293b = interfaceC36583mA;
        if (m12 != null) {
            interfaceC36583mA.k(m12);
        }
        this.f346294c = iVar.a();
        this.f346299h = new V("", iArr);
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < uriArr.length; i13++) {
            if ((iArr[i13].f343469f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        V v12 = this.f346299h;
        int[] iArrG = com.google.common.primitives.l.g(arrayList);
        d dVar = new d(v12, iArrG);
        I i14 = v12.f346151e[iArrG[0]];
        while (true) {
            if (i12 >= dVar.f347159b) {
                i12 = -1;
                break;
            } else if (dVar.f347161d[i12] == i14) {
                break;
            } else {
                i12++;
            }
        }
        dVar.f346317g = i12;
        this.f346308q = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.source.chunk.n[] a(@j.P com.google.android.exoplayer2.source.hls.l r19, long r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.h.a(com.google.android.exoplayer2.source.hls.l, long):com.google.android.exoplayer2.source.chunk.n[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(l lVar) {
        if (lVar.f346340o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.f fVarD = this.f346298g.d(false, this.f346296e[this.f346299h.a(lVar.f346221d)]);
        fVarD.getClass();
        int i12 = (int) (lVar.f346231j - fVarD.f346475k);
        if (i12 < 0) {
            return 1;
        }
        AbstractC37401r1 abstractC37401r1 = fVarD.f346482r;
        AbstractC37401r1 abstractC37401r12 = i12 < abstractC37401r1.size() ? ((f.e) abstractC37401r1.get(i12)).f346493n : fVarD.f346483s;
        int size = abstractC37401r12.size();
        int i13 = lVar.f346340o;
        if (i13 >= size) {
            return 2;
        }
        f.b bVar = (f.b) abstractC37401r12.get(i13);
        if (bVar.f346488n) {
            return 0;
        }
        return U.a(Uri.parse(S.c(fVarD.f346530a, bVar.f346494b)), lVar.f346219b.f347929a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> c(@P l lVar, boolean z12, com.google.android.exoplayer2.source.hls.playlist.f fVar, long j12, long j13) {
        boolean z13 = true;
        if (lVar != null && !z12) {
            boolean z14 = lVar.f346332I;
            long j14 = lVar.f346231j;
            int i12 = lVar.f346340o;
            if (!z14) {
                return new Pair<>(Long.valueOf(j14), Integer.valueOf(i12));
            }
            if (i12 == -1) {
                j14 = j14 != -1 ? j14 + 1 : -1L;
            }
            return new Pair<>(Long.valueOf(j14), Integer.valueOf(i12 != -1 ? i12 + 1 : -1));
        }
        long j15 = j12 + fVar.f346485u;
        long j16 = (lVar == null || this.f346307p) ? j13 : lVar.f346224g;
        boolean z15 = fVar.f346479o;
        long j17 = fVar.f346475k;
        AbstractC37401r1 abstractC37401r1 = fVar.f346482r;
        if (!z15 && j16 >= j15) {
            return new Pair<>(Long.valueOf(j17 + abstractC37401r1.size()), -1);
        }
        long j18 = j16 - j12;
        Long lValueOf = Long.valueOf(j18);
        int i13 = 0;
        if (this.f346298g.n() && lVar != null) {
            z13 = false;
        }
        int iD2 = U.d(abstractC37401r1, lValueOf, z13);
        long j19 = iD2 + j17;
        if (iD2 >= 0) {
            f.e eVar = (f.e) abstractC37401r1.get(iD2);
            long j22 = eVar.f346498f + eVar.f346496d;
            AbstractC37401r1 abstractC37401r12 = fVar.f346483s;
            AbstractC37401r1 abstractC37401r13 = j18 < j22 ? eVar.f346493n : abstractC37401r12;
            while (true) {
                if (i13 >= abstractC37401r13.size()) {
                    break;
                }
                f.b bVar = (f.b) abstractC37401r13.get(i13);
                if (j18 >= bVar.f346498f + bVar.f346496d) {
                    i13++;
                } else if (bVar.f346487m) {
                    j19 += abstractC37401r13 != abstractC37401r12 ? 0L : 1L;
                    i = i13;
                }
            }
        }
        return new Pair<>(Long.valueOf(j19), Integer.valueOf(i));
    }

    @P
    public final com.google.android.exoplayer2.source.chunk.e d(@P Uri uri, int i12) {
        if (uri == null) {
            return null;
        }
        g gVar = this.f346301j;
        byte[] bArrRemove = gVar.f346291a.remove(uri);
        if (bArrRemove != null) {
            gVar.f346291a.put(uri, bArrRemove);
            return null;
        }
        p.b bVar = new p.b();
        bVar.f347939a = uri;
        bVar.f347947i = 1;
        com.google.android.exoplayer2.upstream.p pVarA = bVar.a();
        I i13 = this.f346297f[i12];
        int iS2 = this.f346308q.s();
        Object objR = this.f346308q.r();
        byte[] bArr = this.f346304m;
        a aVar = new a(this.f346294c, pVarA, 3, i13, iS2, objR, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr = U.f348110e;
        }
        aVar.f346228j = bArr;
        return aVar;
    }
}
