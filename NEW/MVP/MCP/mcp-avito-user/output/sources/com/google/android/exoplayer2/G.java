package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.C36531l;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.trackselection.t;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.InterfaceC36601q;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.W3;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.InterfaceC42154j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes6.dex */
final class G implements Handler.Callback, InterfaceC36559w.a, t.a, X.d, C36531l.a, e0.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f343392A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f343393B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f343394C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f343395D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f343396E;

    /* renamed from: F, reason: collision with root package name */
    public int f343397F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f343398G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f343399H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f343400I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f343401J;

    /* renamed from: K, reason: collision with root package name */
    public int f343402K;

    /* renamed from: L, reason: collision with root package name */
    @j.P
    public g f343403L;

    /* renamed from: M, reason: collision with root package name */
    public long f343404M;

    /* renamed from: N, reason: collision with root package name */
    public int f343405N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f343406O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    public ExoPlaybackException f343407P;

    /* renamed from: Q, reason: collision with root package name */
    public long f343408Q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final h0[] f343409b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<h0> f343410c;

    /* renamed from: d, reason: collision with root package name */
    public final i0[] f343411d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.t f343412e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.u f343413f;

    /* renamed from: g, reason: collision with root package name */
    public final N f343414g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC36574d f343415h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC36601q f343416i;

    /* renamed from: j, reason: collision with root package name */
    public final HandlerThread f343417j;

    /* renamed from: k, reason: collision with root package name */
    public final Looper f343418k;

    /* renamed from: l, reason: collision with root package name */
    public final s0.d f343419l;

    /* renamed from: m, reason: collision with root package name */
    public final s0.b f343420m;

    /* renamed from: n, reason: collision with root package name */
    public final long f343421n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f343422o;

    /* renamed from: p, reason: collision with root package name */
    public final C36531l f343423p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f343424q;

    /* renamed from: r, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.L f343425r;

    /* renamed from: s, reason: collision with root package name */
    public final C36562u f343426s;

    /* renamed from: t, reason: collision with root package name */
    public final U f343427t;

    /* renamed from: u, reason: collision with root package name */
    public final X f343428u;

    /* renamed from: v, reason: collision with root package name */
    public final C36529j f343429v;

    /* renamed from: w, reason: collision with root package name */
    public final long f343430w;

    /* renamed from: x, reason: collision with root package name */
    public l0 f343431x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f343432y;

    /* renamed from: z, reason: collision with root package name */
    public d f343433z;

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<X.c> f343434a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.O f343435b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343436c;

        /* renamed from: d, reason: collision with root package name */
        public final long f343437d;

        public a() {
            throw null;
        }

        public a(List list, com.google.android.exoplayer2.source.O o12, int i12, long j12, F f12) {
            this.f343434a = list;
            this.f343435b = o12;
            this.f343436c = i12;
            this.f343437d = j12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static class b {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class c implements Comparable<c> {
        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f343438a;

        /* renamed from: b, reason: collision with root package name */
        public b0 f343439b;

        /* renamed from: c, reason: collision with root package name */
        public int f343440c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f343441d;

        /* renamed from: e, reason: collision with root package name */
        public int f343442e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f343443f;

        /* renamed from: g, reason: collision with root package name */
        public int f343444g;

        public d(b0 b0Var) {
            this.f343439b = b0Var;
        }

        public final void a(int i12) {
            this.f343438a |= i12 > 0;
            this.f343440c += i12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final y.b f343445a;

        /* renamed from: b, reason: collision with root package name */
        public final long f343446b;

        /* renamed from: c, reason: collision with root package name */
        public final long f343447c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f343448d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f343449e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f343450f;

        public f(y.b bVar, long j12, long j13, boolean z12, boolean z13, boolean z14) {
            this.f343445a = bVar;
            this.f343446b = j12;
            this.f343447c = j13;
            this.f343448d = z12;
            this.f343449e = z13;
            this.f343450f = z14;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final s0 f343451a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343452b;

        /* renamed from: c, reason: collision with root package name */
        public final long f343453c;

        public g(s0 s0Var, int i12, long j12) {
            this.f343451a = s0Var;
            this.f343452b = i12;
            this.f343453c = j12;
        }
    }

    public G(h0[] h0VarArr, com.google.android.exoplayer2.trackselection.t tVar, com.google.android.exoplayer2.trackselection.u uVar, N n12, InterfaceC36574d interfaceC36574d, int i12, boolean z12, com.google.android.exoplayer2.analytics.a aVar, l0 l0Var, C36529j c36529j, long j12, boolean z13, Looper looper, com.google.android.exoplayer2.util.L l12, C36562u c36562u, com.google.android.exoplayer2.analytics.p pVar) {
        this.f343426s = c36562u;
        this.f343409b = h0VarArr;
        this.f343412e = tVar;
        this.f343413f = uVar;
        this.f343414g = n12;
        this.f343415h = interfaceC36574d;
        this.f343397F = i12;
        this.f343398G = z12;
        this.f343431x = l0Var;
        this.f343429v = c36529j;
        this.f343430w = j12;
        this.f343393B = z13;
        this.f343425r = l12;
        this.f343421n = n12.b();
        this.f343422o = n12.a();
        b0 b0VarI = b0.i(uVar);
        this.f343432y = b0VarI;
        this.f343433z = new d(b0VarI);
        this.f343411d = new i0[h0VarArr.length];
        for (int i13 = 0; i13 < h0VarArr.length; i13++) {
            h0VarArr[i13].i(i13, pVar);
            this.f343411d[i13] = h0VarArr[i13].s();
        }
        this.f343423p = new C36531l(this, l12);
        this.f343424q = new ArrayList<>();
        this.f343410c = W3.g();
        this.f343419l = new s0.d();
        this.f343420m = new s0.b();
        tVar.f347334a = this;
        tVar.f347335b = interfaceC36574d;
        this.f343406O = true;
        Handler handler = new Handler(looper);
        this.f343427t = new U(aVar, handler);
        this.f343428u = new X(this, aVar, handler, pVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f343417j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f343418k = looper2;
        this.f343416i = l12.b(looper2, this);
    }

    @j.P
    public static Pair<Object, Long> H(s0 s0Var, g gVar, boolean z12, int i12, boolean z13, s0.d dVar, s0.b bVar) {
        Pair<Object, Long> pairI;
        Object objI;
        s0 s0Var2 = gVar.f343451a;
        if (s0Var.p()) {
            return null;
        }
        s0 s0Var3 = s0Var2.p() ? s0Var : s0Var2;
        try {
            pairI = s0Var3.i(dVar, bVar, gVar.f343452b, gVar.f343453c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (s0Var.equals(s0Var3)) {
            return pairI;
        }
        if (s0Var.b(pairI.first) != -1) {
            return (s0Var3.g(pairI.first, bVar).f345875g && s0Var3.m(bVar.f345872d, dVar, 0L).f345894p == s0Var3.b(pairI.first)) ? s0Var.i(dVar, bVar, s0Var.g(pairI.first, bVar).f345872d, gVar.f343453c) : pairI;
        }
        if (z12 && (objI = I(dVar, bVar, i12, z13, pairI.first, s0Var3, s0Var)) != null) {
            return s0Var.i(dVar, bVar, s0Var.g(objI, bVar).f345872d, -9223372036854775807L);
        }
        return null;
    }

    @j.P
    public static Object I(s0.d dVar, s0.b bVar, int i12, boolean z12, Object obj, s0 s0Var, s0 s0Var2) {
        int iB2 = s0Var.b(obj);
        int iH2 = s0Var.h();
        int iD2 = iB2;
        int iB3 = -1;
        for (int i13 = 0; i13 < iH2 && iB3 == -1; i13++) {
            iD2 = s0Var.d(iD2, bVar, dVar, i12, z12);
            if (iD2 == -1) {
                break;
            }
            iB3 = s0Var2.b(s0Var.l(iD2));
        }
        if (iB3 == -1) {
            return null;
        }
        return s0Var2.l(iB3);
    }

    public static void O(h0 h0Var, long j12) {
        h0Var.q();
        if (h0Var instanceof com.google.android.exoplayer2.text.o) {
            com.google.android.exoplayer2.text.o oVar = (com.google.android.exoplayer2.text.o) h0Var;
            C36585a.d(oVar.f345406l);
            oVar.f346919B = j12;
        }
    }

    public static boolean t(h0 h0Var) {
        return h0Var.getState() != 0;
    }

    public final void A() {
        D(true, false, true, false);
        this.f343414g.g();
        Y(1);
        this.f343417j.quit();
        synchronized (this) {
            this.f343392A = true;
            notifyAll();
        }
    }

    public final void B(int i12, int i13, com.google.android.exoplayer2.source.O o12) throws Throwable {
        this.f343433z.a(1);
        X x12 = this.f343428u;
        x12.getClass();
        C36585a.b(i12 >= 0 && i12 <= i13 && i13 <= x12.f343712b.size());
        x12.f343720j = o12;
        x12.g(i12, i13);
        o(x12.b(), false);
    }

    public final void C() throws ExoPlaybackException {
        float f12 = this.f343423p.getPlaybackParameters().f344180b;
        U u12 = this.f343427t;
        Q q12 = u12.f343704h;
        Q q13 = u12.f343705i;
        boolean z12 = true;
        for (Q q14 = q12; q14 != null && q14.f343673d; q14 = q14.f343681l) {
            com.google.android.exoplayer2.trackselection.u uVarG = q14.g(f12, this.f343432y.f344158a);
            com.google.android.exoplayer2.trackselection.u uVar = q14.f343683n;
            if (uVar != null) {
                int length = uVar.f347338c.length;
                com.google.android.exoplayer2.trackselection.k[] kVarArr = uVarG.f347338c;
                if (length == kVarArr.length) {
                    for (int i12 = 0; i12 < kVarArr.length; i12++) {
                        if (uVarG.a(uVar, i12)) {
                        }
                    }
                    if (q14 == q13) {
                        z12 = false;
                    }
                }
            }
            if (z12) {
                U u13 = this.f343427t;
                Q q15 = u13.f343704h;
                boolean zK2 = u13.k(q15);
                boolean[] zArr = new boolean[this.f343409b.length];
                long jA2 = q15.a(uVarG, this.f343432y.f344176s, zK2, zArr);
                b0 b0Var = this.f343432y;
                boolean z13 = (b0Var.f344162e == 4 || jA2 == b0Var.f344176s) ? false : true;
                b0 b0Var2 = this.f343432y;
                this.f343432y = r(b0Var2.f344159b, jA2, b0Var2.f344160c, b0Var2.f344161d, z13, 5);
                if (z13) {
                    F(jA2);
                }
                boolean[] zArr2 = new boolean[this.f343409b.length];
                int i13 = 0;
                while (true) {
                    h0[] h0VarArr = this.f343409b;
                    if (i13 >= h0VarArr.length) {
                        break;
                    }
                    h0 h0Var = h0VarArr[i13];
                    boolean zT2 = t(h0Var);
                    zArr2[i13] = zT2;
                    com.google.android.exoplayer2.source.M m12 = q15.f343672c[i13];
                    if (zT2) {
                        if (m12 != h0Var.l()) {
                            e(h0Var);
                        } else if (zArr[i13]) {
                            h0Var.v(this.f343404M);
                        }
                    }
                    i13++;
                }
                h(zArr2);
            } else {
                this.f343427t.k(q14);
                if (q14.f343673d) {
                    q14.a(uVarG, Math.max(q14.f343675f.f343686b, this.f343404M - q14.f343684o), false, new boolean[q14.f343678i.length]);
                }
            }
            n(true);
            if (this.f343432y.f344162e != 4) {
                v();
                f0();
                this.f343416i.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[PHI: r4 r5 r7
  0x00bf: PHI (r4v4 com.google.android.exoplayer2.source.y$b) = (r4v3 com.google.android.exoplayer2.source.y$b), (r4v13 com.google.android.exoplayer2.source.y$b) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r5v2 long) = (r5v1 long), (r5v6 long) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r7v2 long) = (r7v1 long), (r7v7 long) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.G.D(boolean, boolean, boolean, boolean):void");
    }

    public final void E() {
        Q q12 = this.f343427t.f343704h;
        this.f343394C = q12 != null && q12.f343675f.f343692h && this.f343393B;
    }

    public final void F(long j12) {
        Q q12 = this.f343427t.f343704h;
        long j13 = j12 + (q12 == null ? 1000000000000L : q12.f343684o);
        this.f343404M = j13;
        this.f343423p.f345455b.a(j13);
        for (h0 h0Var : this.f343409b) {
            if (t(h0Var)) {
                h0Var.v(this.f343404M);
            }
        }
        for (Q q13 = r0.f343704h; q13 != null; q13 = q13.f343681l) {
            for (com.google.android.exoplayer2.trackselection.k kVar : q13.f343683n.f347338c) {
                if (kVar != null) {
                    kVar.g();
                }
            }
        }
    }

    public final void G(s0 s0Var, s0 s0Var2) {
        if (s0Var.p() && s0Var2.p()) {
            return;
        }
        ArrayList<c> arrayList = this.f343424q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void J(boolean z12) throws ExoPlaybackException {
        y.b bVar = this.f343427t.f343704h.f343675f.f343685a;
        long jL2 = L(bVar, this.f343432y.f344176s, true, false);
        if (jL2 != this.f343432y.f344176s) {
            b0 b0Var = this.f343432y;
            this.f343432y = r(bVar, jL2, b0Var.f344160c, b0Var.f344161d, z12, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    public final void K(g gVar) throws Throwable {
        long j12;
        long j13;
        boolean z12;
        y.b bVar;
        long j14;
        long j15;
        long j16;
        b0 b0Var;
        int i12;
        this.f343433z.a(1);
        Pair<Object, Long> pairH = H(this.f343432y.f344158a, gVar, true, this.f343397F, this.f343398G, this.f343419l, this.f343420m);
        if (pairH == null) {
            Pair<y.b, Long> pairK = k(this.f343432y.f344158a);
            bVar = (y.b) pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            z12 = !this.f343432y.f344158a.p();
            j12 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            Object obj = pairH.first;
            long jLongValue2 = ((Long) pairH.second).longValue();
            long j17 = gVar.f343453c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            y.b bVarM = this.f343427t.m(this.f343432y.f344158a, obj, jLongValue2);
            if (bVarM.a()) {
                this.f343432y.f344158a.g(bVarM.f346696a, this.f343420m);
                j12 = this.f343420m.f(bVarM.f346697b) == bVarM.f346698c ? this.f343420m.f345876h.f346184d : 0L;
                j13 = j17;
                bVar = bVarM;
                z12 = true;
            } else {
                j12 = jLongValue2;
                j13 = j17;
                z12 = gVar.f343453c == -9223372036854775807L;
                bVar = bVarM;
            }
        }
        try {
            if (this.f343432y.f344158a.p()) {
                this.f343403L = gVar;
            } else {
                if (pairH != null) {
                    if (bVar.equals(this.f343432y.f344159b)) {
                        Q q12 = this.f343427t.f343704h;
                        long jD2 = (q12 == null || !q12.f343673d || j12 == 0) ? j12 : q12.f343670a.d(j12, this.f343431x);
                        if (com.google.android.exoplayer2.util.U.R(jD2) == com.google.android.exoplayer2.util.U.R(this.f343432y.f344176s) && ((i12 = (b0Var = this.f343432y).f344162e) == 2 || i12 == 3)) {
                            long j18 = b0Var.f344176s;
                            this.f343432y = r(bVar, j18, j13, j18, z12, 2);
                            return;
                        }
                        j15 = jD2;
                    } else {
                        j15 = j12;
                    }
                    boolean z13 = this.f343432y.f344162e == 4;
                    U u12 = this.f343427t;
                    long jL2 = L(bVar, j15, u12.f343704h != u12.f343705i, z13);
                    boolean z14 = (j12 != jL2) | z12;
                    try {
                        b0 b0Var2 = this.f343432y;
                        s0 s0Var = b0Var2.f344158a;
                        g0(s0Var, bVar, s0Var, b0Var2.f344159b, j13);
                        z12 = z14;
                        j16 = jL2;
                        this.f343432y = r(bVar, j16, j13, j16, z12, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = z14;
                        j14 = jL2;
                        this.f343432y = r(bVar, j14, j13, j14, z12, 2);
                        throw th;
                    }
                }
                if (this.f343432y.f344162e != 1) {
                    Y(4);
                }
                D(false, true, false, true);
            }
            j16 = j12;
            this.f343432y = r(bVar, j16, j13, j16, z12, 2);
        } catch (Throwable th3) {
            th = th3;
            j14 = j12;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    public final long L(y.b bVar, long j12, boolean z12, boolean z13) throws ExoPlaybackException {
        d0();
        this.f343395D = false;
        if (z13 || this.f343432y.f344162e == 3) {
            Y(2);
        }
        U u12 = this.f343427t;
        Q q12 = u12.f343704h;
        Q q13 = q12;
        while (q13 != null && !bVar.equals(q13.f343675f.f343685a)) {
            q13 = q13.f343681l;
        }
        if (z12 || q12 != q13 || (q13 != null && q13.f343684o + j12 < 0)) {
            h0[] h0VarArr = this.f343409b;
            for (h0 h0Var : h0VarArr) {
                e(h0Var);
            }
            if (q13 != null) {
                while (u12.f343704h != q13) {
                    u12.a();
                }
                u12.k(q13);
                q13.f343684o = 1000000000000L;
                h(new boolean[h0VarArr.length]);
            }
        }
        if (q13 != null) {
            u12.k(q13);
            if (!q13.f343673d) {
                q13.f343675f = q13.f343675f.b(j12);
            } else if (q13.f343674e) {
                ?? r92 = q13.f343670a;
                j12 = r92.seekToUs(j12);
                r92.discardBuffer(j12 - this.f343421n, this.f343422o);
            }
            F(j12);
            v();
        } else {
            u12.b();
            F(j12);
        }
        n(false);
        this.f343416i.f(2);
        return j12;
    }

    public final void M(e0 e0Var) {
        Looper looper = e0Var.f344368f;
        Looper looper2 = this.f343418k;
        InterfaceC36601q interfaceC36601q = this.f343416i;
        if (looper != looper2) {
            interfaceC36601q.b(15, e0Var).a();
            return;
        }
        synchronized (e0Var) {
        }
        try {
            e0Var.f344363a.b(e0Var.f344366d, e0Var.f344367e);
            e0Var.b(true);
            int i12 = this.f343432y.f344162e;
            if (i12 == 3 || i12 == 2) {
                interfaceC36601q.f(2);
            }
        } catch (Throwable th2) {
            e0Var.b(true);
            throw th2;
        }
    }

    public final void N(e0 e0Var) {
        Looper looper = e0Var.f344368f;
        if (looper.getThread().isAlive()) {
            this.f343425r.b(looper, null).d(new RunnableC36610y(1, this, e0Var));
        } else {
            e0Var.b(false);
        }
    }

    public final void P(boolean z12, @j.P AtomicBoolean atomicBoolean) {
        if (this.f343399H != z12) {
            this.f343399H = z12;
            if (!z12) {
                for (h0 h0Var : this.f343409b) {
                    if (!t(h0Var) && this.f343410c.remove(h0Var)) {
                        h0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(a aVar) throws Throwable {
        this.f343433z.a(1);
        int i12 = aVar.f343436c;
        com.google.android.exoplayer2.source.O o12 = aVar.f343435b;
        List<X.c> list = aVar.f343434a;
        if (i12 != -1) {
            this.f343403L = new g(new f0(list, o12), aVar.f343436c, aVar.f343437d);
        }
        X x12 = this.f343428u;
        ArrayList arrayList = x12.f343712b;
        x12.g(0, arrayList.size());
        o(x12.a(arrayList.size(), list, o12), false);
    }

    public final void R(boolean z12) {
        if (z12 == this.f343401J) {
            return;
        }
        this.f343401J = z12;
        b0 b0Var = this.f343432y;
        int i12 = b0Var.f344162e;
        if (z12 || i12 == 4 || i12 == 1) {
            this.f343432y = b0Var.c(z12);
        } else {
            this.f343416i.f(2);
        }
    }

    public final void S(boolean z12) throws ExoPlaybackException {
        this.f343393B = z12;
        E();
        if (this.f343394C) {
            U u12 = this.f343427t;
            if (u12.f343705i != u12.f343704h) {
                J(true);
                n(false);
            }
        }
    }

    public final void T(int i12, int i13, boolean z12, boolean z13) {
        this.f343433z.a(z13 ? 1 : 0);
        d dVar = this.f343433z;
        dVar.f343438a = true;
        dVar.f343443f = true;
        dVar.f343444g = i13;
        this.f343432y = this.f343432y.d(i12, z12);
        this.f343395D = false;
        for (Q q12 = this.f343427t.f343704h; q12 != null; q12 = q12.f343681l) {
            for (com.google.android.exoplayer2.trackselection.k kVar : q12.f343683n.f347338c) {
                if (kVar != null) {
                    kVar.f(z12);
                }
            }
        }
        if (!Z()) {
            d0();
            f0();
            return;
        }
        int i14 = this.f343432y.f344162e;
        InterfaceC36601q interfaceC36601q = this.f343416i;
        if (i14 == 3) {
            b0();
            interfaceC36601q.f(2);
        } else if (i14 == 2) {
            interfaceC36601q.f(2);
        }
    }

    public final void U(c0 c0Var) {
        C36531l c36531l = this.f343423p;
        c36531l.d(c0Var);
        c0 playbackParameters = c36531l.getPlaybackParameters();
        q(playbackParameters, playbackParameters.f344180b, true, true);
    }

    public final void V(int i12) throws ExoPlaybackException {
        this.f343397F = i12;
        s0 s0Var = this.f343432y.f344158a;
        U u12 = this.f343427t;
        u12.f343702f = i12;
        if (!u12.n(s0Var)) {
            J(true);
        }
        n(false);
    }

    public final void W(boolean z12) throws ExoPlaybackException {
        this.f343398G = z12;
        s0 s0Var = this.f343432y.f344158a;
        U u12 = this.f343427t;
        u12.f343703g = z12;
        if (!u12.n(s0Var)) {
            J(true);
        }
        n(false);
    }

    public final void X(com.google.android.exoplayer2.source.O o12) throws Throwable {
        this.f343433z.a(1);
        X x12 = this.f343428u;
        int size = x12.f343712b.size();
        if (o12.getLength() != size) {
            o12 = o12.c().f(size);
        }
        x12.f343720j = o12;
        o(x12.b(), false);
    }

    public final void Y(int i12) {
        b0 b0Var = this.f343432y;
        if (b0Var.f344162e != i12) {
            if (i12 != 2) {
                this.f343408Q = -9223372036854775807L;
            }
            this.f343432y = b0Var.g(i12);
        }
    }

    public final boolean Z() {
        b0 b0Var = this.f343432y;
        return b0Var.f344169l && b0Var.f344170m == 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.t.a
    public final void a() {
        this.f343416i.f(10);
    }

    public final boolean a0(s0 s0Var, y.b bVar) {
        if (bVar.a() || s0Var.p()) {
            return false;
        }
        int i12 = s0Var.g(bVar.f346696a, this.f343420m).f345872d;
        s0.d dVar = this.f343419l;
        s0Var.n(i12, dVar);
        return dVar.a() && dVar.f345888j && dVar.f345885g != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e0.a
    public final synchronized void b(e0 e0Var) {
        if (!this.f343392A && this.f343417j.isAlive()) {
            this.f343416i.b(14, e0Var).a();
            return;
        }
        e0Var.b(false);
    }

    public final void b0() {
        this.f343395D = false;
        C36531l c36531l = this.f343423p;
        c36531l.f345460g = true;
        com.google.android.exoplayer2.util.K k12 = c36531l.f345455b;
        if (!k12.f348088c) {
            k12.f348087b.getClass();
            k12.f348090e = SystemClock.elapsedRealtime();
            k12.f348088c = true;
        }
        for (h0 h0Var : this.f343409b) {
            if (t(h0Var)) {
                h0Var.start();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
    public final void c(InterfaceC36559w interfaceC36559w) {
        this.f343416i.b(8, interfaceC36559w).a();
    }

    public final void c0(boolean z12, boolean z13) {
        D(z12 || !this.f343399H, false, true, false);
        this.f343433z.a(z13 ? 1 : 0);
        this.f343414g.e();
        Y(1);
    }

    public final void d(a aVar, int i12) throws Throwable {
        this.f343433z.a(1);
        X x12 = this.f343428u;
        if (i12 == -1) {
            i12 = x12.f343712b.size();
        }
        o(x12.a(i12, aVar.f343434a, aVar.f343435b), false);
    }

    public final void d0() {
        C36531l c36531l = this.f343423p;
        c36531l.f345460g = false;
        com.google.android.exoplayer2.util.K k12 = c36531l.f345455b;
        if (k12.f348088c) {
            k12.a(k12.c());
            k12.f348088c = false;
        }
        for (h0 h0Var : this.f343409b) {
            if (t(h0Var) && h0Var.getState() == 2) {
                h0Var.stop();
            }
        }
    }

    public final void e(h0 h0Var) {
        if (t(h0Var)) {
            C36531l c36531l = this.f343423p;
            if (h0Var == c36531l.f345457d) {
                c36531l.f345458e = null;
                c36531l.f345457d = null;
                c36531l.f345459f = true;
            }
            if (h0Var.getState() == 2) {
                h0Var.stop();
            }
            h0Var.N();
            this.f343402K--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    public final void e0() {
        Q q12 = this.f343427t.f343706j;
        boolean z12 = this.f343396E || (q12 != null && q12.f343670a.isLoading());
        b0 b0Var = this.f343432y;
        if (z12 != b0Var.f344164g) {
            this.f343432y = new b0(b0Var.f344158a, b0Var.f344159b, b0Var.f344160c, b0Var.f344161d, b0Var.f344162e, b0Var.f344163f, z12, b0Var.f344165h, b0Var.f344166i, b0Var.f344167j, b0Var.f344168k, b0Var.f344169l, b0Var.f344170m, b0Var.f344171n, b0Var.f344174q, b0Var.f344175r, b0Var.f344176s, b0Var.f344172o, b0Var.f344173p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05b3  */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.G.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.G.f0():void");
    }

    @Override // com.google.android.exoplayer2.source.N.a
    public final void g(com.google.android.exoplayer2.source.N n12) {
        this.f343416i.b(9, (InterfaceC36559w) n12).a();
    }

    public final void g0(s0 s0Var, y.b bVar, s0 s0Var2, y.b bVar2, long j12) {
        if (!a0(s0Var, bVar)) {
            c0 c0Var = bVar.a() ? c0.f344179e : this.f343432y.f344171n;
            C36531l c36531l = this.f343423p;
            if (c36531l.getPlaybackParameters().equals(c0Var)) {
                return;
            }
            c36531l.d(c0Var);
            return;
        }
        Object obj = bVar.f346696a;
        s0.b bVar3 = this.f343420m;
        int i12 = s0Var.g(obj, bVar3).f345872d;
        s0.d dVar = this.f343419l;
        s0Var.n(i12, dVar);
        O.g gVar = dVar.f345890l;
        int i13 = com.google.android.exoplayer2.util.U.f348106a;
        C36529j c36529j = this.f343429v;
        c36529j.getClass();
        c36529j.f345429h = com.google.android.exoplayer2.util.U.H(gVar.f343561b);
        c36529j.f345432k = com.google.android.exoplayer2.util.U.H(gVar.f343562c);
        c36529j.f345433l = com.google.android.exoplayer2.util.U.H(gVar.f343563d);
        float f12 = gVar.f343564e;
        if (f12 == -3.4028235E38f) {
            f12 = c36529j.f345422a;
        }
        c36529j.f345436o = f12;
        float f13 = gVar.f343565f;
        if (f13 == -3.4028235E38f) {
            f13 = c36529j.f345423b;
        }
        c36529j.f345435n = f13;
        if (f12 == 1.0f && f13 == 1.0f) {
            c36529j.f345429h = -9223372036854775807L;
        }
        c36529j.a();
        if (j12 != -9223372036854775807L) {
            c36529j.b(i(s0Var, obj, j12));
            return;
        }
        if (com.google.android.exoplayer2.util.U.a(!s0Var2.p() ? s0Var2.m(s0Var2.g(bVar2.f346696a, bVar3).f345872d, dVar, 0L).f345880b : null, dVar.f345880b)) {
            return;
        }
        c36529j.b(-9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean[] r24) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.G.h(boolean[]):void");
    }

    public final synchronized void h0(E e12, long j12) {
        this.f343425r.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j12;
        boolean z12 = false;
        while (!((Boolean) e12.get()).booleanValue() && j12 > 0) {
            try {
                this.f343425r.getClass();
                wait(j12);
            } catch (InterruptedException unused) {
                z12 = true;
            }
            this.f343425r.getClass();
            j12 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i12;
        Q q12;
        try {
            switch (message.what) {
                case 0:
                    z();
                    break;
                case 1:
                    T(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    K((g) message.obj);
                    break;
                case 4:
                    U((c0) message.obj);
                    break;
                case 5:
                    this.f343431x = (l0) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    A();
                    return true;
                case 8:
                    p((InterfaceC36559w) message.obj);
                    break;
                case 9:
                    l((InterfaceC36559w) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    W(message.arg1 != 0);
                    break;
                case 13:
                    P(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    e0 e0Var = (e0) message.obj;
                    e0Var.getClass();
                    M(e0Var);
                    break;
                case 15:
                    N((e0) message.obj);
                    break;
                case 16:
                    c0 c0Var = (c0) message.obj;
                    q(c0Var, c0Var.f344180b, true, false);
                    break;
                case 17:
                    Q((a) message.obj);
                    break;
                case 18:
                    d((a) message.obj, message.arg1);
                    break;
                case 19:
                    y((b) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (com.google.android.exoplayer2.source.O) message.obj);
                    break;
                case 21:
                    X((com.google.android.exoplayer2.source.O) message.obj);
                    break;
                case 22:
                    x();
                    break;
                case 23:
                    S(message.arg1 != 0);
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    R(message.arg1 == 1);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e12) {
            e = e12;
            if (e.f343384d == 1 && (q12 = this.f343427t.f343705i) != null) {
                e = e.b(q12.f343675f.f343685a);
            }
            if (e.f343390j && this.f343407P == null) {
                C36605v.a("Recoverable renderer error", e);
                this.f343407P = e;
                InterfaceC36601q interfaceC36601q = this.f343416i;
                interfaceC36601q.i(interfaceC36601q.b(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f343407P;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f343407P;
                }
                C36605v.a("Playback error", e);
                c0(true, false);
                this.f343432y = this.f343432y.e(e);
            }
        } catch (ParserException e13) {
            boolean z12 = e13.f343666b;
            int i13 = e13.f343667c;
            if (i13 == 1) {
                i12 = z12 ? 3001 : 3003;
            } else {
                if (i13 == 4) {
                    i12 = z12 ? 3002 : 3004;
                }
                m(e13, i);
            }
            i = i12;
            m(e13, i);
        } catch (DrmSession.DrmSessionException e14) {
            m(e14, e14.f344327b);
        } catch (BehindLiveWindowException e15) {
            m(e15, 1002);
        } catch (DataSourceException e16) {
            m(e16, e16.f347727b);
        } catch (IOException e17) {
            m(e17, 2000);
        } catch (RuntimeException e18) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e18, ((e18 instanceof IllegalStateException) || (e18 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            C36605v.a("Playback error", exoPlaybackException2);
            c0(true, false);
            this.f343432y = this.f343432y.e(exoPlaybackException2);
        }
        w();
        return true;
    }

    public final long i(s0 s0Var, Object obj, long j12) {
        s0.b bVar = this.f343420m;
        int i12 = s0Var.g(obj, bVar).f345872d;
        s0.d dVar = this.f343419l;
        s0Var.n(i12, dVar);
        if (dVar.f345885g == -9223372036854775807L || !dVar.a() || !dVar.f345888j) {
            return -9223372036854775807L;
        }
        long j13 = dVar.f345886h;
        int i13 = com.google.android.exoplayer2.util.U.f348106a;
        return com.google.android.exoplayer2.util.U.H((j13 == -9223372036854775807L ? System.currentTimeMillis() : j13 + SystemClock.elapsedRealtime()) - dVar.f345885g) - (j12 + bVar.f345874f);
    }

    public final long j() {
        Q q12 = this.f343427t.f343705i;
        if (q12 == null) {
            return 0L;
        }
        long jMax = q12.f343684o;
        if (!q12.f343673d) {
            return jMax;
        }
        int i12 = 0;
        while (true) {
            h0[] h0VarArr = this.f343409b;
            if (i12 >= h0VarArr.length) {
                return jMax;
            }
            if (t(h0VarArr[i12]) && h0VarArr[i12].l() == q12.f343672c[i12]) {
                long jP2 = h0VarArr[i12].p();
                if (jP2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jP2, jMax);
            }
            i12++;
        }
    }

    public final Pair<y.b, Long> k(s0 s0Var) {
        if (s0Var.p()) {
            return Pair.create(b0.f344157t, 0L);
        }
        Pair<Object, Long> pairI = s0Var.i(this.f343419l, this.f343420m, s0Var.a(this.f343398G), -9223372036854775807L);
        y.b bVarM = this.f343427t.m(s0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarM.a()) {
            Object obj = bVarM.f346696a;
            s0.b bVar = this.f343420m;
            s0Var.g(obj, bVar);
            jLongValue = bVarM.f346698c == bVar.f(bVarM.f346697b) ? bVar.f345876h.f346184d : 0L;
        }
        return Pair.create(bVarM, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    public final void l(InterfaceC36559w interfaceC36559w) {
        Q q12 = this.f343427t.f343706j;
        if (q12 == null || q12.f343670a != interfaceC36559w) {
            return;
        }
        long j12 = this.f343404M;
        if (q12 != null) {
            C36585a.d(q12.f343681l == null);
            if (q12.f343673d) {
                q12.f343670a.reevaluateBuffer(j12 - q12.f343684o);
            }
        }
        v();
    }

    public final void m(IOException iOException, int i12) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i12);
        Q q12 = this.f343427t.f343704h;
        if (q12 != null) {
            exoPlaybackException = exoPlaybackException.b(q12.f343675f.f343685a);
        }
        C36605v.a("Playback error", exoPlaybackException);
        c0(false, false);
        this.f343432y = this.f343432y.e(exoPlaybackException);
    }

    public final void n(boolean z12) {
        Q q12 = this.f343427t.f343706j;
        y.b bVar = q12 == null ? this.f343432y.f344159b : q12.f343675f.f343685a;
        boolean zEquals = this.f343432y.f344168k.equals(bVar);
        if (!zEquals) {
            this.f343432y = this.f343432y.a(bVar);
        }
        b0 b0Var = this.f343432y;
        b0Var.f344174q = q12 == null ? b0Var.f344176s : q12.d();
        b0 b0Var2 = this.f343432y;
        long j12 = b0Var2.f344174q;
        Q q13 = this.f343427t.f343706j;
        b0Var2.f344175r = q13 != null ? Math.max(0L, j12 - (this.f343404M - q13.f343684o)) : 0L;
        if ((!zEquals || z12) && q12 != null && q12.f343673d) {
            this.f343414g.i(this.f343409b, q12.f343683n.f347338c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.google.android.exoplayer2.s0 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.G.o(com.google.android.exoplayer2.s0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    public final void p(InterfaceC36559w interfaceC36559w) throws ExoPlaybackException {
        U u12 = this.f343427t;
        Q q12 = u12.f343706j;
        if (q12 == null || q12.f343670a != interfaceC36559w) {
            return;
        }
        float f12 = this.f343423p.getPlaybackParameters().f344180b;
        s0 s0Var = this.f343432y.f344158a;
        q12.f343673d = true;
        q12.f343682m = q12.f343670a.getTrackGroups();
        com.google.android.exoplayer2.trackselection.u uVarG = q12.g(f12, s0Var);
        S s5 = q12.f343675f;
        long j12 = s5.f343689e;
        long j13 = s5.f343686b;
        long jA2 = q12.a(uVarG, (j12 == -9223372036854775807L || j13 < j12) ? j13 : Math.max(0L, j12 - 1), false, new boolean[q12.f343678i.length]);
        long j14 = q12.f343684o;
        S s12 = q12.f343675f;
        q12.f343684o = (s12.f343686b - jA2) + j14;
        q12.f343675f = s12.b(jA2);
        com.google.android.exoplayer2.trackselection.k[] kVarArr = q12.f343683n.f347338c;
        N n12 = this.f343414g;
        h0[] h0VarArr = this.f343409b;
        n12.i(h0VarArr, kVarArr);
        if (q12 == u12.f343704h) {
            F(q12.f343675f.f343686b);
            h(new boolean[h0VarArr.length]);
            b0 b0Var = this.f343432y;
            y.b bVar = b0Var.f344159b;
            long j15 = q12.f343675f.f343686b;
            this.f343432y = r(bVar, j15, b0Var.f344160c, j15, false, 5);
        }
        v();
    }

    public final void q(c0 c0Var, float f12, boolean z12, boolean z13) {
        int i12;
        if (z12) {
            if (z13) {
                this.f343433z.a(1);
            }
            this.f343432y = this.f343432y.f(c0Var);
        }
        float f13 = c0Var.f344180b;
        Q q12 = this.f343427t.f343704h;
        while (true) {
            i12 = 0;
            if (q12 == null) {
                break;
            }
            com.google.android.exoplayer2.trackselection.k[] kVarArr = q12.f343683n.f347338c;
            int length = kVarArr.length;
            while (i12 < length) {
                com.google.android.exoplayer2.trackselection.k kVar = kVarArr[i12];
                if (kVar != null) {
                    kVar.e(f13);
                }
                i12++;
            }
            q12 = q12.f343681l;
        }
        h0[] h0VarArr = this.f343409b;
        int length2 = h0VarArr.length;
        while (i12 < length2) {
            h0 h0Var = h0VarArr[i12];
            if (h0Var != null) {
                h0Var.x(f12, c0Var.f344180b);
            }
            i12++;
        }
    }

    @InterfaceC42154j
    public final b0 r(y.b bVar, long j12, long j13, long j14, boolean z12, int i12) {
        com.google.android.exoplayer2.source.W w12;
        com.google.android.exoplayer2.trackselection.u uVar;
        List<Metadata> listC;
        this.f343406O = (!this.f343406O && j12 == this.f343432y.f344176s && bVar.equals(this.f343432y.f344159b)) ? false : true;
        E();
        b0 b0Var = this.f343432y;
        com.google.android.exoplayer2.source.W w13 = b0Var.f344165h;
        com.google.android.exoplayer2.trackselection.u uVar2 = b0Var.f344166i;
        List<Metadata> list = b0Var.f344167j;
        if (this.f343428u.f343721k) {
            Q q12 = this.f343427t.f343704h;
            com.google.android.exoplayer2.source.W w14 = q12 == null ? com.google.android.exoplayer2.source.W.f346153e : q12.f343682m;
            com.google.android.exoplayer2.trackselection.u uVar3 = q12 == null ? this.f343413f : q12.f343683n;
            com.google.android.exoplayer2.trackselection.k[] kVarArr = uVar3.f347338c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            boolean z13 = false;
            for (com.google.android.exoplayer2.trackselection.k kVar : kVarArr) {
                if (kVar != null) {
                    Metadata metadata = kVar.d(0).f343474k;
                    if (metadata == null) {
                        aVar.g(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar.g(metadata);
                        z13 = true;
                    }
                }
            }
            AbstractC37401r1 abstractC37401r1I = z13 ? aVar.i() : AbstractC37401r1.C();
            if (q12 != null) {
                S s5 = q12.f343675f;
                if (s5.f343687c != j13) {
                    q12.f343675f = s5.a(j13);
                }
            }
            listC = abstractC37401r1I;
            w12 = w14;
            uVar = uVar3;
        } else if (bVar.equals(b0Var.f344159b)) {
            w12 = w13;
            uVar = uVar2;
            listC = list;
        } else {
            w12 = com.google.android.exoplayer2.source.W.f346153e;
            uVar = this.f343413f;
            listC = AbstractC37401r1.C();
        }
        if (z12) {
            d dVar = this.f343433z;
            if (!dVar.f343441d || dVar.f343442e == 5) {
                dVar.f343438a = true;
                dVar.f343441d = true;
                dVar.f343442e = i12;
            } else {
                C36585a.b(i12 == 5);
            }
        }
        b0 b0Var2 = this.f343432y;
        long j15 = b0Var2.f344174q;
        Q q13 = this.f343427t.f343706j;
        return b0Var2.b(bVar, j12, j13, j14, q13 == null ? 0L : Math.max(0L, j15 - (this.f343404M - q13.f343684o)), w12, uVar, listC);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    public final boolean s() {
        Q q12 = this.f343427t.f343706j;
        if (q12 == null) {
            return false;
        }
        return (!q12.f343673d ? 0L : q12.f343670a.getNextLoadPositionUs()) != Long.MIN_VALUE;
    }

    public final boolean u() {
        Q q12 = this.f343427t.f343704h;
        long j12 = q12.f343675f.f343689e;
        return q12.f343673d && (j12 == -9223372036854775807L || this.f343432y.f344176s < j12 || !Z());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    public final void v() {
        boolean zH2;
        boolean zS2 = s();
        U u12 = this.f343427t;
        if (zS2) {
            Q q12 = u12.f343706j;
            long nextLoadPositionUs = !q12.f343673d ? 0L : q12.f343670a.getNextLoadPositionUs();
            Q q13 = u12.f343706j;
            zH2 = this.f343414g.h(q13 != null ? Math.max(0L, nextLoadPositionUs - (this.f343404M - q13.f343684o)) : 0L, this.f343423p.getPlaybackParameters().f344180b);
        } else {
            zH2 = false;
        }
        this.f343396E = zH2;
        if (zH2) {
            Q q14 = u12.f343706j;
            long j12 = this.f343404M;
            C36585a.d(q14.f343681l == null);
            q14.f343670a.continueLoading(j12 - q14.f343684o);
        }
        e0();
    }

    public final void w() {
        d dVar = this.f343433z;
        b0 b0Var = this.f343432y;
        boolean z12 = dVar.f343438a | (dVar.f343439b != b0Var);
        dVar.f343438a = z12;
        dVar.f343439b = b0Var;
        if (z12) {
            this.f343426s.a(dVar);
            this.f343433z = new d(this.f343432y);
        }
    }

    public final void x() throws Throwable {
        o(this.f343428u.b(), true);
    }

    public final void y(b bVar) throws Throwable {
        this.f343433z.a(1);
        bVar.getClass();
        X x12 = this.f343428u;
        x12.getClass();
        C36585a.b(x12.f343712b.size() >= 0);
        x12.f343720j = null;
        o(x12.b(), false);
    }

    public final void z() {
        this.f343433z.a(1);
        int i12 = 0;
        D(false, false, false, true);
        this.f343414g.f();
        Y(this.f343432y.f344158a.p() ? 4 : 2);
        com.google.android.exoplayer2.upstream.M mC2 = this.f343415h.c();
        X x12 = this.f343428u;
        C36585a.d(!x12.f343721k);
        x12.f343722l = mC2;
        while (true) {
            ArrayList arrayList = x12.f343712b;
            if (i12 >= arrayList.size()) {
                x12.f343721k = true;
                this.f343416i.f(2);
                return;
            } else {
                X.c cVar = (X.c) arrayList.get(i12);
                x12.e(cVar);
                x12.f343719i.add(cVar);
                i12++;
            }
        }
    }
}
