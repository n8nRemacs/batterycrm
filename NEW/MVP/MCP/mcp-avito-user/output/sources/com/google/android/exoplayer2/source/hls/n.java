package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.InterfaceC36544g;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.N;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.q;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.M;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.W1;
import j.P;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMediaPeriod.java */
/* loaded from: classes6.dex */
public final class n implements InterfaceC36559w, q.b, HlsPlaylistTracker.b {

    /* renamed from: b, reason: collision with root package name */
    public final j f346352b;

    /* renamed from: c, reason: collision with root package name */
    public final HlsPlaylistTracker f346353c;

    /* renamed from: d, reason: collision with root package name */
    public final i f346354d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final M f346355e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f346356f;

    /* renamed from: g, reason: collision with root package name */
    public final e.a f346357g;

    /* renamed from: h, reason: collision with root package name */
    public final z f346358h;

    /* renamed from: i, reason: collision with root package name */
    public final A.a f346359i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC36572b f346360j;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC36544g f346363m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f346364n;

    /* renamed from: o, reason: collision with root package name */
    public final int f346365o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f346366p;

    /* renamed from: q, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f346367q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public InterfaceC36559w.a f346368r;

    /* renamed from: s, reason: collision with root package name */
    public int f346369s;

    /* renamed from: t, reason: collision with root package name */
    public W f346370t;

    /* renamed from: w, reason: collision with root package name */
    public int f346373w;

    /* renamed from: x, reason: collision with root package name */
    public N f346374x;

    /* renamed from: k, reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.M, Integer> f346361k = new IdentityHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    public final t f346362l = new t();

    /* renamed from: u, reason: collision with root package name */
    public q[] f346371u = new q[0];

    /* renamed from: v, reason: collision with root package name */
    public q[] f346372v = new q[0];

    public n(j jVar, HlsPlaylistTracker hlsPlaylistTracker, i iVar, @P M m12, com.google.android.exoplayer2.drm.f fVar, e.a aVar, z zVar, A.a aVar2, InterfaceC36572b interfaceC36572b, InterfaceC36544g interfaceC36544g, boolean z12, int i12, boolean z13, com.google.android.exoplayer2.analytics.p pVar) {
        this.f346352b = jVar;
        this.f346353c = hlsPlaylistTracker;
        this.f346354d = iVar;
        this.f346355e = m12;
        this.f346356f = fVar;
        this.f346357g = aVar;
        this.f346358h = zVar;
        this.f346359i = aVar2;
        this.f346360j = interfaceC36572b;
        this.f346363m = interfaceC36544g;
        this.f346364n = z12;
        this.f346365o = i12;
        this.f346366p = z13;
        this.f346367q = pVar;
        this.f346374x = interfaceC36544g.a(new N[0]);
    }

    public static I i(I i12, @P I i13, boolean z12) {
        String strQ;
        Metadata metadata;
        int i14;
        String str;
        int i15;
        int i16;
        String str2;
        if (i13 != null) {
            strQ = i13.f343473j;
            metadata = i13.f343474k;
            i15 = i13.f343489z;
            i14 = i13.f343468e;
            i16 = i13.f343469f;
            str = i13.f343467d;
            str2 = i13.f343466c;
        } else {
            strQ = U.q(1, i12.f343473j);
            metadata = i12.f343474k;
            if (z12) {
                i15 = i12.f343489z;
                i14 = i12.f343468e;
                i16 = i12.f343469f;
                str = i12.f343467d;
                str2 = i12.f343466c;
            } else {
                i14 = 0;
                str = null;
                i15 = -1;
                i16 = 0;
                str2 = null;
            }
        }
        String strE = com.google.android.exoplayer2.util.z.e(strQ);
        int i17 = z12 ? i12.f343470g : -1;
        int i18 = z12 ? i12.f343471h : -1;
        I.b bVar = new I.b();
        bVar.f343494a = i12.f343465b;
        bVar.f343495b = str2;
        bVar.f343503j = i12.f343475l;
        bVar.f343504k = strE;
        bVar.f343501h = strQ;
        bVar.f343502i = metadata;
        bVar.f343499f = i17;
        bVar.f343500g = i18;
        bVar.f343517x = i15;
        bVar.f343497d = i14;
        bVar.f343498e = i16;
        bVar.f343496c = str;
        return bVar.a();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public final void a() {
        for (q qVar : this.f346371u) {
            ArrayList<l> arrayList = qVar.f346572o;
            if (!arrayList.isEmpty()) {
                l lVar = (l) W1.d(arrayList);
                int iB2 = qVar.f346562e.b(lVar);
                if (iB2 == 1) {
                    lVar.f346335L = true;
                } else if (iB2 == 2 && !qVar.f346554U) {
                    Loader loader = qVar.f346568k;
                    if (loader.c()) {
                        loader.a();
                    }
                }
            }
        }
        this.f346368r.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.net.Uri r17, com.google.android.exoplayer2.upstream.z.d r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.exoplayer2.source.hls.q[] r2 = r0.f346371u
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L85
            r8 = r2[r6]
            com.google.android.exoplayer2.source.hls.h r9 = r8.f346562e
            android.net.Uri[] r10 = r9.f346296e
            boolean r11 = com.google.android.exoplayer2.util.U.m(r10, r1)
            if (r11 != 0) goto L1c
            r14 = r18
        L19:
            r4 = 1
            goto L81
        L1c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3b
            com.google.android.exoplayer2.trackselection.k r13 = r9.f346308q
            com.google.android.exoplayer2.upstream.z$a r13 = com.google.android.exoplayer2.trackselection.s.a(r13)
            com.google.android.exoplayer2.upstream.z r8 = r8.f346567j
            r14 = r18
            com.google.android.exoplayer2.upstream.z$b r8 = r8.c(r13, r14)
            if (r8 == 0) goto L3d
            int r13 = r8.f348022a
            r15 = 2
            if (r13 != r15) goto L3d
            long r4 = r8.f348023b
            goto L3e
        L3b:
            r14 = r18
        L3d:
            r4 = r11
        L3e:
            r8 = 0
        L3f:
            int r13 = r10.length
            r15 = -1
            if (r8 >= r13) goto L4f
            r13 = r10[r8]
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L4c
            goto L50
        L4c:
            int r8 = r8 + 1
            goto L3f
        L4f:
            r8 = r15
        L50:
            if (r8 != r15) goto L53
            goto L7b
        L53:
            com.google.android.exoplayer2.trackselection.k r10 = r9.f346308q
            int r8 = r10.h(r8)
            if (r8 != r15) goto L5c
            goto L7b
        L5c:
            boolean r10 = r9.f346310s
            android.net.Uri r13 = r9.f346306o
            boolean r13 = r1.equals(r13)
            r10 = r10 | r13
            r9.f346310s = r10
            int r10 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r10 == 0) goto L7b
            com.google.android.exoplayer2.trackselection.k r10 = r9.f346308q
            boolean r8 = r10.q(r8, r4)
            if (r8 == 0) goto L80
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r8 = r9.f346298g
            boolean r8 = r8.o(r1, r4)
            if (r8 == 0) goto L80
        L7b:
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L80
            goto L19
        L80:
            r4 = 0
        L81:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L85:
            com.google.android.exoplayer2.source.w$a r1 = r0.f346368r
            r1.g(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.b(android.net.Uri, com.google.android.exoplayer2.upstream.z$d, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        if (this.f346370t != null) {
            return this.f346374x.continueLoading(j12);
        }
        for (q qVar : this.f346371u) {
            if (!qVar.f346538E) {
                qVar.continueLoading(qVar.f346550Q);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        for (q qVar : this.f346372v) {
            if (qVar.f346535B == 2) {
                h hVar = qVar.f346562e;
                int iA2 = hVar.f346308q.a();
                Uri[] uriArr = hVar.f346296e;
                int length = uriArr.length;
                HlsPlaylistTracker hlsPlaylistTracker = hVar.f346298g;
                com.google.android.exoplayer2.source.hls.playlist.f fVarD = (iA2 >= length || iA2 == -1) ? null : hlsPlaylistTracker.d(true, uriArr[hVar.f346308q.o()]);
                if (fVarD == null) {
                    return j12;
                }
                AbstractC37401r1 abstractC37401r1 = fVarD.f346482r;
                if (abstractC37401r1.isEmpty() || !fVarD.f346532c) {
                    return j12;
                }
                long jF2 = fVarD.f346472h - hlsPlaylistTracker.f();
                long j13 = j12 - jF2;
                int iD2 = U.d(abstractC37401r1, Long.valueOf(j13), true);
                long j14 = ((f.e) abstractC37401r1.get(iD2)).f346498f;
                return l0Var.a(j13, j14, iD2 != abstractC37401r1.size() - 1 ? ((f.e) abstractC37401r1.get(iD2 + 1)).f346498f : j14) + jF2;
            }
        }
        return j12;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
        for (q qVar : this.f346372v) {
            if (qVar.f346537D && !qVar.r()) {
                int length = qVar.f346580w.length;
                for (int i12 = 0; i12 < length; i12++) {
                    qVar.f346580w[i12].h(j12, z12, qVar.f346548O[i12]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.HashMap] */
    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.exoplayer2.source.InterfaceC36559w.a r26, long r27) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.e(com.google.android.exoplayer2.source.w$a, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(com.google.android.exoplayer2.trackselection.k[] r38, boolean[] r39, com.google.android.exoplayer2.source.M[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.n.f(com.google.android.exoplayer2.trackselection.k[], boolean[], com.google.android.exoplayer2.source.M[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.N.a
    public final void g(N n12) {
        this.f346368r.g(this);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        return this.f346374x.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        return this.f346374x.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        W w12 = this.f346370t;
        w12.getClass();
        return w12;
    }

    public final q h(String str, int i12, Uri[] uriArr, I[] iArr, @P I i13, @P List<I> list, Map<String, DrmInitData> map, long j12) {
        h hVar = new h(this.f346352b, this.f346353c, uriArr, iArr, this.f346354d, this.f346355e, this.f346362l, list, this.f346367q);
        A.a aVar = this.f346359i;
        return new q(str, i12, this, hVar, map, this.f346360j, j12, i13, this.f346356f, this.f346357g, this.f346358h, aVar, this.f346365o);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        return this.f346374x.isLoading();
    }

    public final void j() {
        int i12 = this.f346369s - 1;
        this.f346369s = i12;
        if (i12 > 0) {
            return;
        }
        int i13 = 0;
        for (q qVar : this.f346371u) {
            qVar.k();
            i13 += qVar.f346543J.f346155b;
        }
        V[] vArr = new V[i13];
        int i14 = 0;
        for (q qVar2 : this.f346371u) {
            qVar2.k();
            int i15 = qVar2.f346543J.f346155b;
            int i16 = 0;
            while (i16 < i15) {
                qVar2.k();
                vArr[i14] = qVar2.f346543J.a(i16);
                i16++;
                i14++;
            }
        }
        this.f346370t = new W(vArr);
        this.f346368r.c(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() throws ParserException {
        for (q qVar : this.f346371u) {
            qVar.t();
            if (qVar.f346554U && !qVar.f346538E) {
                throw ParserException.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        this.f346374x.reevaluateBuffer(j12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long seekToUs(long j12) {
        q[] qVarArr = this.f346372v;
        if (qVarArr.length > 0) {
            boolean zW2 = qVarArr[0].w(j12, false);
            int i12 = 1;
            while (true) {
                q[] qVarArr2 = this.f346372v;
                if (i12 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i12].w(j12, zW2);
                i12++;
            }
            if (zW2) {
                this.f346362l.f346604a.clear();
            }
        }
        return j12;
    }
}
