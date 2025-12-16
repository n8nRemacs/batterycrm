package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23123n;
import androidx.media3.common.z;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.C23142k;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.Y;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.trackselection.r;
import com.adjust.sdk.network.ErrorCodes;
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
/* loaded from: classes.dex */
final class E implements Handler.Callback, InterfaceC23174z.a, r.a, U.d, C23142k.a, Y.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f48426A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f48427B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f48428C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f48429D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f48430E;

    /* renamed from: F, reason: collision with root package name */
    public int f48431F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f48432G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f48433H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f48434I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f48435J;

    /* renamed from: K, reason: collision with root package name */
    public int f48436K;

    /* renamed from: L, reason: collision with root package name */
    @j.P
    public g f48437L;

    /* renamed from: M, reason: collision with root package name */
    public long f48438M;

    /* renamed from: N, reason: collision with root package name */
    public int f48439N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f48440O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    public ExoPlaybackException f48441P;

    /* renamed from: Q, reason: collision with root package name */
    public long f48442Q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final c0[] f48443b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<c0> f48444c;

    /* renamed from: d, reason: collision with root package name */
    public final d0[] f48445d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.r f48446e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.s f48447f;

    /* renamed from: g, reason: collision with root package name */
    public final H f48448g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.d f48449h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC23123n f48450i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final HandlerThread f48451j;

    /* renamed from: k, reason: collision with root package name */
    public final Looper f48452k;

    /* renamed from: l, reason: collision with root package name */
    public final P.d f48453l;

    /* renamed from: m, reason: collision with root package name */
    public final P.b f48454m;

    /* renamed from: n, reason: collision with root package name */
    public final long f48455n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f48456o;

    /* renamed from: p, reason: collision with root package name */
    public final C23142k f48457p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f48458q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.media3.common.util.D f48459r;

    /* renamed from: s, reason: collision with root package name */
    public final C23177v f48460s;

    /* renamed from: t, reason: collision with root package name */
    public final M f48461t;

    /* renamed from: u, reason: collision with root package name */
    public final U f48462u;

    /* renamed from: v, reason: collision with root package name */
    public final C23140i f48463v;

    /* renamed from: w, reason: collision with root package name */
    public final long f48464w;

    /* renamed from: x, reason: collision with root package name */
    public g0 f48465x;

    /* renamed from: y, reason: collision with root package name */
    public X f48466y;

    /* renamed from: z, reason: collision with root package name */
    public d f48467z;

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<U.c> f48468a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.S f48469b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48470c;

        /* renamed from: d, reason: collision with root package name */
        public final long f48471d;

        public a() {
            throw null;
        }

        public a(List list, androidx.media3.exoplayer.source.S s5, int i12, long j12, D d12) {
            this.f48468a = list;
            this.f48469b = s5;
            this.f48470c = i12;
            this.f48471d = j12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f48472a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48473b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48474c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.S f48475d;

        public b(int i12, int i13, int i14, androidx.media3.exoplayer.source.S s5) {
            this.f48472a = i12;
            this.f48473b = i13;
            this.f48474c = i14;
            this.f48475d = s5;
        }
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
        public boolean f48476a;

        /* renamed from: b, reason: collision with root package name */
        public X f48477b;

        /* renamed from: c, reason: collision with root package name */
        public int f48478c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f48479d;

        /* renamed from: e, reason: collision with root package name */
        public int f48480e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f48481f;

        /* renamed from: g, reason: collision with root package name */
        public int f48482g;

        public d(X x12) {
            this.f48477b = x12;
        }

        public final void a(int i12) {
            this.f48476a |= i12 > 0;
            this.f48478c += i12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final A.b f48483a;

        /* renamed from: b, reason: collision with root package name */
        public final long f48484b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48485c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f48486d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f48487e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f48488f;

        public f(A.b bVar, long j12, long j13, boolean z12, boolean z13, boolean z14) {
            this.f48483a = bVar;
            this.f48484b = j12;
            this.f48485c = j13;
            this.f48486d = z12;
            this.f48487e = z13;
            this.f48488f = z14;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.P f48489a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48490b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48491c;

        public g(androidx.media3.common.P p12, int i12, long j12) {
            this.f48489a = p12;
            this.f48490b = i12;
            this.f48491c = j12;
        }
    }

    public E(c0[] c0VarArr, androidx.media3.exoplayer.trackselection.r rVar, androidx.media3.exoplayer.trackselection.s sVar, H h12, androidx.media3.exoplayer.upstream.d dVar, int i12, boolean z12, androidx.media3.exoplayer.analytics.a aVar, g0 g0Var, C23140i c23140i, long j12, boolean z13, Looper looper, androidx.media3.common.util.D d12, C23177v c23177v, androidx.media3.exoplayer.analytics.w wVar) {
        this.f48460s = c23177v;
        this.f48443b = c0VarArr;
        this.f48446e = rVar;
        this.f48447f = sVar;
        this.f48448g = h12;
        this.f48449h = dVar;
        this.f48431F = i12;
        this.f48432G = z12;
        this.f48465x = g0Var;
        this.f48463v = c23140i;
        this.f48464w = j12;
        this.f48427B = z13;
        this.f48459r = d12;
        this.f48455n = h12.b();
        this.f48456o = h12.a();
        X xI2 = X.i(sVar);
        this.f48466y = xI2;
        this.f48467z = new d(xI2);
        this.f48445d = new d0[c0VarArr.length];
        d0.f fVarC = rVar.c();
        for (int i13 = 0; i13 < c0VarArr.length; i13++) {
            c0VarArr[i13].z(i13, wVar);
            this.f48445d[i13] = c0VarArr[i13].s();
            if (fVarC != null) {
                this.f48445d[i13].k(fVarC);
            }
        }
        this.f48457p = new C23142k(this, d12);
        this.f48458q = new ArrayList<>();
        this.f48444c = W3.g();
        this.f48453l = new P.d();
        this.f48454m = new P.b();
        rVar.f50035a = this;
        rVar.f50036b = dVar;
        this.f48440O = true;
        InterfaceC23123n interfaceC23123nB = d12.b(looper, null);
        this.f48461t = new M(aVar, interfaceC23123nB);
        this.f48462u = new U(this, aVar, interfaceC23123nB, wVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f48451j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f48452k = looper2;
        this.f48450i = d12.b(looper2, this);
    }

    @j.P
    public static Pair<Object, Long> I(androidx.media3.common.P p12, g gVar, boolean z12, int i12, boolean z13, P.d dVar, P.b bVar) {
        Pair<Object, Long> pairQ;
        Object objJ;
        androidx.media3.common.P p13 = gVar.f48489a;
        if (p12.x()) {
            return null;
        }
        androidx.media3.common.P p14 = p13.x() ? p12 : p13;
        try {
            pairQ = p14.q(dVar, bVar, gVar.f48490b, gVar.f48491c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (p12.equals(p14)) {
            return pairQ;
        }
        if (p12.g(pairQ.first) != -1) {
            return (p14.o(pairQ.first, bVar).f47384g && p14.u(bVar.f47381d, dVar, 0L).f47421p == p14.g(pairQ.first)) ? p12.q(dVar, bVar, p12.o(pairQ.first, bVar).f47381d, gVar.f48491c) : pairQ;
        }
        if (z12 && (objJ = J(dVar, bVar, i12, z13, pairQ.first, p14, p12)) != null) {
            return p12.q(dVar, bVar, p12.o(objJ, bVar).f47381d, -9223372036854775807L);
        }
        return null;
    }

    @j.P
    public static Object J(P.d dVar, P.b bVar, int i12, boolean z12, Object obj, androidx.media3.common.P p12, androidx.media3.common.P p13) {
        int iG2 = p12.g(obj);
        int iP2 = p12.p();
        int iL2 = iG2;
        int iG3 = -1;
        for (int i13 = 0; i13 < iP2 && iG3 == -1; i13++) {
            iL2 = p12.l(iL2, bVar, dVar, i12, z12);
            if (iL2 == -1) {
                break;
            }
            iG3 = p13.g(p12.t(iL2));
        }
        if (iG3 == -1) {
            return null;
        }
        return p13.t(iG3);
    }

    public static void P(c0 c0Var, long j12) {
        c0Var.q();
        if (c0Var instanceof androidx.media3.exoplayer.text.d) {
            androidx.media3.exoplayer.text.d dVar = (androidx.media3.exoplayer.text.d) c0Var;
            C23110a.g(dVar.f49150m);
            dVar.f49873D = j12;
        }
    }

    public static boolean u(c0 c0Var) {
        return c0Var.getState() != 0;
    }

    public final void A() {
        this.f48467z.a(1);
        int i12 = 0;
        E(false, false, false, true);
        this.f48448g.f();
        Z(this.f48466y.f48593a.x() ? 4 : 2);
        androidx.media3.datasource.B bC2 = this.f48449h.c();
        U u12 = this.f48462u;
        C23110a.g(!u12.f48576k);
        u12.f48577l = bC2;
        while (true) {
            ArrayList arrayList = u12.f48567b;
            if (i12 >= arrayList.size()) {
                u12.f48576k = true;
                this.f48450i.f(2);
                return;
            } else {
                U.c cVar = (U.c) arrayList.get(i12);
                u12.e(cVar);
                u12.f48572g.add(cVar);
                i12++;
            }
        }
    }

    public final void B() {
        int i12 = 0;
        E(true, false, true, false);
        while (true) {
            c0[] c0VarArr = this.f48443b;
            if (i12 >= c0VarArr.length) {
                break;
            }
            this.f48445d[i12].j();
            c0VarArr[i12].release();
            i12++;
        }
        this.f48448g.g();
        Z(1);
        HandlerThread handlerThread = this.f48451j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f48426A = true;
            notifyAll();
        }
    }

    public final void C(int i12, int i13, androidx.media3.exoplayer.source.S s5) throws Throwable {
        this.f48467z.a(1);
        U u12 = this.f48462u;
        u12.getClass();
        C23110a.b(i12 >= 0 && i12 <= i13 && i13 <= u12.f48567b.size());
        u12.f48575j = s5;
        u12.g(i12, i13);
        p(u12.b(), false);
    }

    public final void D() throws ExoPlaybackException {
        float f12 = this.f48457p.getPlaybackParameters().f47236b;
        M m12 = this.f48461t;
        J j12 = m12.f48542h;
        J j13 = m12.f48543i;
        boolean z12 = true;
        for (J j14 = j12; j14 != null && j14.f48510d; j14 = j14.f48518l) {
            androidx.media3.exoplayer.trackselection.s sVarG = j14.g(f12, this.f48466y.f48593a);
            androidx.media3.exoplayer.trackselection.s sVar = j14.f48520n;
            if (sVar != null) {
                int length = sVar.f50039c.length;
                androidx.media3.exoplayer.trackselection.k[] kVarArr = sVarG.f50039c;
                if (length == kVarArr.length) {
                    for (int i12 = 0; i12 < kVarArr.length; i12++) {
                        if (sVarG.a(sVar, i12)) {
                        }
                    }
                    if (j14 == j13) {
                        z12 = false;
                    }
                }
            }
            if (z12) {
                M m13 = this.f48461t;
                J j15 = m13.f48542h;
                boolean zL2 = m13.l(j15);
                boolean[] zArr = new boolean[this.f48443b.length];
                long jA2 = j15.a(sVarG, this.f48466y.f48610r, zL2, zArr);
                X x12 = this.f48466y;
                boolean z13 = (x12.f48597e == 4 || jA2 == x12.f48610r) ? false : true;
                X x13 = this.f48466y;
                this.f48466y = s(x13.f48594b, jA2, x13.f48595c, x13.f48596d, z13, 5);
                if (z13) {
                    G(jA2);
                }
                boolean[] zArr2 = new boolean[this.f48443b.length];
                int i13 = 0;
                while (true) {
                    c0[] c0VarArr = this.f48443b;
                    if (i13 >= c0VarArr.length) {
                        break;
                    }
                    c0 c0Var = c0VarArr[i13];
                    boolean zU2 = u(c0Var);
                    zArr2[i13] = zU2;
                    androidx.media3.exoplayer.source.P p12 = j15.f48509c[i13];
                    if (zU2) {
                        if (p12 != c0Var.l()) {
                            f(c0Var);
                        } else if (zArr[i13]) {
                            c0Var.v(this.f48438M);
                        }
                    }
                    i13++;
                }
                i(zArr2);
            } else {
                this.f48461t.l(j14);
                if (j14.f48510d) {
                    j14.a(sVarG, Math.max(j14.f48512f.f48523b, this.f48438M - j14.f48521o), false, new boolean[j14.f48515i.length]);
                }
            }
            o(true);
            if (this.f48466y.f48597e != 4) {
                w();
                g0();
                this.f48450i.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[PHI: r4 r5 r7
  0x00bf: PHI (r4v4 androidx.media3.exoplayer.source.A$b) = (r4v3 androidx.media3.exoplayer.source.A$b), (r4v9 androidx.media3.exoplayer.source.A$b) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r5v2 long) = (r5v1 long), (r5v18 long) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r7v2 long) = (r7v1 long), (r7v10 long) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.E.E(boolean, boolean, boolean, boolean):void");
    }

    public final void F() {
        J j12 = this.f48461t.f48542h;
        this.f48428C = j12 != null && j12.f48512f.f48529h && this.f48427B;
    }

    public final void G(long j12) {
        J j13 = this.f48461t.f48542h;
        long j14 = j12 + (j13 == null ? 1000000000000L : j13.f48521o);
        this.f48438M = j14;
        this.f48457p.f49212b.a(j14);
        for (c0 c0Var : this.f48443b) {
            if (u(c0Var)) {
                c0Var.v(this.f48438M);
            }
        }
        for (J j15 = r0.f48542h; j15 != null; j15 = j15.f48518l) {
            for (androidx.media3.exoplayer.trackselection.k kVar : j15.f48520n.f50039c) {
                if (kVar != null) {
                    kVar.g();
                }
            }
        }
    }

    public final void H(androidx.media3.common.P p12, androidx.media3.common.P p13) {
        if (p12.x() && p13.x()) {
            return;
        }
        ArrayList<c> arrayList = this.f48458q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void K(boolean z12) throws ExoPlaybackException {
        A.b bVar = this.f48461t.f48542h.f48512f.f48522a;
        long jM2 = M(bVar, this.f48466y.f48610r, true, false);
        if (jM2 != this.f48466y.f48610r) {
            X x12 = this.f48466y;
            this.f48466y = s(bVar, jM2, x12.f48595c, x12.f48596d, z12, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    public final void L(g gVar) throws Throwable {
        long j12;
        long j13;
        boolean z12;
        A.b bVar;
        long j14;
        long j15;
        long j16;
        X x12;
        int i12;
        this.f48467z.a(1);
        Pair<Object, Long> pairI = I(this.f48466y.f48593a, gVar, true, this.f48431F, this.f48432G, this.f48453l, this.f48454m);
        if (pairI == null) {
            Pair<A.b, Long> pairL = l(this.f48466y.f48593a);
            bVar = (A.b) pairL.first;
            long jLongValue = ((Long) pairL.second).longValue();
            z12 = !this.f48466y.f48593a.x();
            j12 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            Object obj = pairI.first;
            long jLongValue2 = ((Long) pairI.second).longValue();
            long j17 = gVar.f48491c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            A.b bVarN = this.f48461t.n(this.f48466y.f48593a, obj, jLongValue2);
            if (bVarN.a()) {
                this.f48466y.f48593a.o(bVarN.f47212a, this.f48454m);
                j12 = this.f48454m.m(bVarN.f47213b) == bVarN.f47214c ? this.f48454m.f47385h.f47623c : 0L;
                j13 = j17;
                bVar = bVarN;
                z12 = true;
            } else {
                j12 = jLongValue2;
                j13 = j17;
                z12 = gVar.f48491c == -9223372036854775807L;
                bVar = bVarN;
            }
        }
        try {
            if (this.f48466y.f48593a.x()) {
                this.f48437L = gVar;
            } else {
                if (pairI != null) {
                    if (bVar.equals(this.f48466y.f48594b)) {
                        J j18 = this.f48461t.f48542h;
                        long jI2 = (j18 == null || !j18.f48510d || j12 == 0) ? j12 : j18.f48507a.i(j12, this.f48465x);
                        if (androidx.media3.common.util.M.Q(jI2) == androidx.media3.common.util.M.Q(this.f48466y.f48610r) && ((i12 = (x12 = this.f48466y).f48597e) == 2 || i12 == 3)) {
                            long j19 = x12.f48610r;
                            this.f48466y = s(bVar, j19, j13, j19, z12, 2);
                            return;
                        }
                        j15 = jI2;
                    } else {
                        j15 = j12;
                    }
                    boolean z13 = this.f48466y.f48597e == 4;
                    M m12 = this.f48461t;
                    long jM2 = M(bVar, j15, m12.f48542h != m12.f48543i, z13);
                    z12 |= j12 != jM2;
                    try {
                        X x13 = this.f48466y;
                        androidx.media3.common.P p12 = x13.f48593a;
                        h0(p12, bVar, p12, x13.f48594b, j13, true);
                        j16 = jM2;
                        this.f48466y = s(bVar, j16, j13, j16, z12, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        j14 = jM2;
                        this.f48466y = s(bVar, j14, j13, j14, z12, 2);
                        throw th;
                    }
                }
                if (this.f48466y.f48597e != 1) {
                    Z(4);
                }
                E(false, true, false, true);
            }
            j16 = j12;
            this.f48466y = s(bVar, j16, j13, j16, z12, 2);
        } catch (Throwable th3) {
            th = th3;
            j14 = j12;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    public final long M(A.b bVar, long j12, boolean z12, boolean z13) throws ExoPlaybackException {
        e0();
        this.f48429D = false;
        if (z13 || this.f48466y.f48597e == 3) {
            Z(2);
        }
        M m12 = this.f48461t;
        J j13 = m12.f48542h;
        J j14 = j13;
        while (j14 != null && !bVar.equals(j14.f48512f.f48522a)) {
            j14 = j14.f48518l;
        }
        if (z12 || j13 != j14 || (j14 != null && j14.f48521o + j12 < 0)) {
            c0[] c0VarArr = this.f48443b;
            for (c0 c0Var : c0VarArr) {
                f(c0Var);
            }
            if (j14 != null) {
                while (m12.f48542h != j14) {
                    m12.a();
                }
                m12.l(j14);
                j14.f48521o = 1000000000000L;
                i(new boolean[c0VarArr.length]);
            }
        }
        if (j14 != null) {
            m12.l(j14);
            if (!j14.f48510d) {
                j14.f48512f = j14.f48512f.b(j12);
            } else if (j14.f48511e) {
                ?? r92 = j14.f48507a;
                j12 = r92.seekToUs(j12);
                r92.discardBuffer(j12 - this.f48455n, this.f48456o);
            }
            G(j12);
            w();
        } else {
            m12.b();
            G(j12);
        }
        o(false);
        this.f48450i.f(2);
        return j12;
    }

    public final void N(Y y12) {
        Looper looper = y12.f48617f;
        Looper looper2 = this.f48452k;
        InterfaceC23123n interfaceC23123n = this.f48450i;
        if (looper != looper2) {
            interfaceC23123n.b(15, y12).a();
            return;
        }
        synchronized (y12) {
        }
        try {
            y12.f48612a.b(y12.f48615d, y12.f48616e);
            y12.b(true);
            int i12 = this.f48466y.f48597e;
            if (i12 == 3 || i12 == 2) {
                interfaceC23123n.f(2);
            }
        } catch (Throwable th2) {
            y12.b(true);
            throw th2;
        }
    }

    public final void O(Y y12) {
        Looper looper = y12.f48617f;
        if (looper.getThread().isAlive()) {
            this.f48459r.b(looper, null).d(new RunnableC23176u(1, this, y12));
        } else {
            androidx.media3.common.util.s.g();
            y12.b(false);
        }
    }

    public final void Q(boolean z12, @j.P AtomicBoolean atomicBoolean) {
        if (this.f48433H != z12) {
            this.f48433H = z12;
            if (!z12) {
                for (c0 c0Var : this.f48443b) {
                    if (!u(c0Var) && this.f48444c.remove(c0Var)) {
                        c0Var.reset();
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

    public final void R(a aVar) throws Throwable {
        this.f48467z.a(1);
        int i12 = aVar.f48470c;
        androidx.media3.exoplayer.source.S s5 = aVar.f48469b;
        List<U.c> list = aVar.f48468a;
        if (i12 != -1) {
            this.f48437L = new g(new a0(list, s5), aVar.f48470c, aVar.f48471d);
        }
        U u12 = this.f48462u;
        ArrayList arrayList = u12.f48567b;
        u12.g(0, arrayList.size());
        p(u12.a(arrayList.size(), list, s5), false);
    }

    public final void S(boolean z12) {
        if (z12 == this.f48435J) {
            return;
        }
        this.f48435J = z12;
        if (z12 || !this.f48466y.f48607o) {
            return;
        }
        this.f48450i.f(2);
    }

    public final void T(boolean z12) throws ExoPlaybackException {
        this.f48427B = z12;
        F();
        if (this.f48428C) {
            M m12 = this.f48461t;
            if (m12.f48543i != m12.f48542h) {
                K(true);
                o(false);
            }
        }
    }

    public final void U(int i12, int i13, boolean z12, boolean z13) {
        this.f48467z.a(z13 ? 1 : 0);
        d dVar = this.f48467z;
        dVar.f48476a = true;
        dVar.f48481f = true;
        dVar.f48482g = i13;
        this.f48466y = this.f48466y.d(i12, z12);
        this.f48429D = false;
        for (J j12 = this.f48461t.f48542h; j12 != null; j12 = j12.f48518l) {
            for (androidx.media3.exoplayer.trackselection.k kVar : j12.f48520n.f50039c) {
                if (kVar != null) {
                    kVar.f(z12);
                }
            }
        }
        if (!a0()) {
            e0();
            g0();
            return;
        }
        int i14 = this.f48466y.f48597e;
        InterfaceC23123n interfaceC23123n = this.f48450i;
        if (i14 == 3) {
            c0();
            interfaceC23123n.f(2);
        } else if (i14 == 2) {
            interfaceC23123n.f(2);
        }
    }

    public final void V(androidx.media3.common.G g12) {
        this.f48450i.k(16);
        C23142k c23142k = this.f48457p;
        c23142k.d(g12);
        androidx.media3.common.G playbackParameters = c23142k.getPlaybackParameters();
        r(playbackParameters, playbackParameters.f47236b, true, true);
    }

    public final void W(int i12) throws ExoPlaybackException {
        this.f48431F = i12;
        androidx.media3.common.P p12 = this.f48466y.f48593a;
        M m12 = this.f48461t;
        m12.f48540f = i12;
        if (!m12.o(p12)) {
            K(true);
        }
        o(false);
    }

    public final void X(boolean z12) throws ExoPlaybackException {
        this.f48432G = z12;
        androidx.media3.common.P p12 = this.f48466y.f48593a;
        M m12 = this.f48461t;
        m12.f48541g = z12;
        if (!m12.o(p12)) {
            K(true);
        }
        o(false);
    }

    public final void Y(androidx.media3.exoplayer.source.S s5) throws Throwable {
        this.f48467z.a(1);
        U u12 = this.f48462u;
        int size = u12.f48567b.size();
        if (s5.getLength() != size) {
            s5 = s5.c().g(0, size);
        }
        u12.f48575j = s5;
        p(u12.b(), false);
    }

    public final void Z(int i12) {
        X x12 = this.f48466y;
        if (x12.f48597e != i12) {
            if (i12 != 2) {
                this.f48442Q = -9223372036854775807L;
            }
            this.f48466y = x12.g(i12);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.r.a
    public final void a() {
        this.f48450i.f(10);
    }

    public final boolean a0() {
        X x12 = this.f48466y;
        return x12.f48604l && x12.f48605m == 0;
    }

    @Override // androidx.media3.exoplayer.Y.a
    public final synchronized void b(Y y12) {
        if (!this.f48426A && this.f48452k.getThread().isAlive()) {
            this.f48450i.b(14, y12).a();
            return;
        }
        androidx.media3.common.util.s.g();
        y12.b(false);
    }

    public final boolean b0(androidx.media3.common.P p12, A.b bVar) {
        if (bVar.a() || p12.x()) {
            return false;
        }
        int i12 = p12.o(bVar.f47212a, this.f48454m).f47381d;
        P.d dVar = this.f48453l;
        p12.v(i12, dVar);
        return dVar.a() && dVar.f47415j && dVar.f47412g != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.trackselection.r.a
    public final void c() {
        this.f48450i.f(26);
    }

    public final void c0() {
        this.f48429D = false;
        C23142k c23142k = this.f48457p;
        c23142k.f49217g = true;
        i0 i0Var = c23142k.f49212b;
        if (!i0Var.f49198c) {
            i0Var.f49197b.getClass();
            i0Var.f49200e = SystemClock.elapsedRealtime();
            i0Var.f49198c = true;
        }
        for (c0 c0Var : this.f48443b) {
            if (u(c0Var)) {
                c0Var.start();
            }
        }
    }

    public final void d(a aVar, int i12) throws Throwable {
        this.f48467z.a(1);
        U u12 = this.f48462u;
        if (i12 == -1) {
            i12 = u12.f48567b.size();
        }
        p(u12.a(i12, aVar.f48468a, aVar.f48469b), false);
    }

    public final void d0(boolean z12, boolean z13) {
        E(z12 || !this.f48433H, false, true, false);
        this.f48467z.a(z13 ? 1 : 0);
        this.f48448g.e();
        Z(1);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
    public final void e(InterfaceC23174z interfaceC23174z) {
        this.f48450i.b(8, interfaceC23174z).a();
    }

    public final void e0() {
        C23142k c23142k = this.f48457p;
        c23142k.f49217g = false;
        i0 i0Var = c23142k.f49212b;
        if (i0Var.f49198c) {
            i0Var.a(i0Var.c());
            i0Var.f49198c = false;
        }
        for (c0 c0Var : this.f48443b) {
            if (u(c0Var) && c0Var.getState() == 2) {
                c0Var.stop();
            }
        }
    }

    public final void f(c0 c0Var) {
        if (u(c0Var)) {
            C23142k c23142k = this.f48457p;
            if (c0Var == c23142k.f49214d) {
                c23142k.f49215e = null;
                c23142k.f49214d = null;
                c23142k.f49216f = true;
            }
            if (c0Var.getState() == 2) {
                c0Var.stop();
            }
            c0Var.N();
            this.f48436K--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    public final void f0() {
        J j12 = this.f48461t.f48544j;
        boolean z12 = this.f48430E || (j12 != null && j12.f48507a.isLoading());
        X x12 = this.f48466y;
        if (z12 != x12.f48599g) {
            this.f48466y = new X(x12.f48593a, x12.f48594b, x12.f48595c, x12.f48596d, x12.f48597e, x12.f48598f, z12, x12.f48600h, x12.f48601i, x12.f48602j, x12.f48603k, x12.f48604l, x12.f48605m, x12.f48606n, x12.f48608p, x12.f48609q, x12.f48610r, x12.f48611s, x12.f48607o);
        }
    }

    @Override // androidx.media3.exoplayer.source.Q.a
    public final void g(androidx.media3.exoplayer.source.Q q12) {
        this.f48450i.b(9, (InterfaceC23174z) q12).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Type inference failed for: r1v24, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0() {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.E.g0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05b8  */
    /* JADX WARN: Type inference failed for: r0v79, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v66, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.E.h():void");
    }

    public final void h0(androidx.media3.common.P p12, A.b bVar, androidx.media3.common.P p13, A.b bVar2, long j12, boolean z12) {
        if (!b0(p12, bVar)) {
            androidx.media3.common.G g12 = bVar.a() ? androidx.media3.common.G.f47232e : this.f48466y.f48606n;
            C23142k c23142k = this.f48457p;
            if (c23142k.getPlaybackParameters().equals(g12)) {
                return;
            }
            this.f48450i.k(16);
            c23142k.d(g12);
            r(this.f48466y.f48606n, g12.f47236b, false, false);
            return;
        }
        Object obj = bVar.f47212a;
        P.b bVar3 = this.f48454m;
        int i12 = p12.o(obj, bVar3).f47381d;
        P.d dVar = this.f48453l;
        p12.v(i12, dVar);
        z.g gVar = dVar.f47417l;
        int i13 = androidx.media3.common.util.M.f47887a;
        C23140i c23140i = this.f48463v;
        c23140i.getClass();
        c23140i.f49182h = androidx.media3.common.util.M.F(gVar.f48051b);
        c23140i.f49185k = androidx.media3.common.util.M.F(gVar.f48052c);
        c23140i.f49186l = androidx.media3.common.util.M.F(gVar.f48053d);
        float f12 = gVar.f48054e;
        if (f12 == -3.4028235E38f) {
            f12 = c23140i.f49175a;
        }
        c23140i.f49189o = f12;
        float f13 = gVar.f48055f;
        if (f13 == -3.4028235E38f) {
            f13 = c23140i.f49176b;
        }
        c23140i.f49188n = f13;
        if (f12 == 1.0f && f13 == 1.0f) {
            c23140i.f49182h = -9223372036854775807L;
        }
        c23140i.a();
        if (j12 != -9223372036854775807L) {
            c23140i.b(j(p12, obj, j12));
            return;
        }
        if (!androidx.media3.common.util.M.a(!p13.x() ? p13.u(p13.o(bVar2.f47212a, bVar3).f47381d, dVar, 0L).f47407b : null, dVar.f47407b) || z12) {
            c23140i.b(-9223372036854775807L);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        J j12;
        J j13;
        int i12;
        try {
            switch (message.what) {
                case 0:
                    A();
                    break;
                case 1:
                    U(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    L((g) message.obj);
                    break;
                case 4:
                    V((androidx.media3.common.G) message.obj);
                    break;
                case 5:
                    this.f48465x = (g0) message.obj;
                    break;
                case 6:
                    d0(false, true);
                    break;
                case 7:
                    B();
                    return true;
                case 8:
                    q((InterfaceC23174z) message.obj);
                    break;
                case 9:
                    m((InterfaceC23174z) message.obj);
                    break;
                case 10:
                    D();
                    break;
                case 11:
                    W(message.arg1);
                    break;
                case 12:
                    X(message.arg1 != 0);
                    break;
                case 13:
                    Q(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    Y y12 = (Y) message.obj;
                    y12.getClass();
                    N(y12);
                    break;
                case 15:
                    O((Y) message.obj);
                    break;
                case 16:
                    androidx.media3.common.G g12 = (androidx.media3.common.G) message.obj;
                    r(g12, g12.f47236b, true, false);
                    break;
                case 17:
                    R((a) message.obj);
                    break;
                case 18:
                    d((a) message.obj, message.arg1);
                    break;
                case 19:
                    z((b) message.obj);
                    break;
                case 20:
                    C(message.arg1, message.arg2, (androidx.media3.exoplayer.source.S) message.obj);
                    break;
                case 21:
                    Y((androidx.media3.exoplayer.source.S) message.obj);
                    break;
                case 22:
                    y();
                    break;
                case 23:
                    T(message.arg1 != 0);
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    S(message.arg1 == 1);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    D();
                    K(true);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    D();
                    K(true);
                    break;
                default:
                    return false;
            }
        } catch (ParserException e12) {
            boolean z12 = e12.f47424b;
            int i13 = e12.f47425c;
            if (i13 == 1) {
                i12 = z12 ? 3001 : 3003;
            } else {
                if (i13 == 4) {
                    i12 = z12 ? 3002 : 3004;
                }
                n(e12, i);
            }
            i = i12;
            n(e12, i);
        } catch (DataSourceException e13) {
            n(e13, e13.f48172b);
        } catch (ExoPlaybackException e14) {
            e = e14;
            int i14 = e.f48498j;
            M m12 = this.f48461t;
            if (i14 == 1 && (j13 = m12.f48543i) != null) {
                e = e.b(j13.f48512f.f48522a);
            }
            if (e.f48504p && this.f48441P == null) {
                androidx.media3.common.util.s.h("Recoverable renderer error", e);
                this.f48441P = e;
                InterfaceC23123n interfaceC23123n = this.f48450i;
                interfaceC23123n.i(interfaceC23123n.b(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f48441P;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f48441P;
                }
                androidx.media3.common.util.s.d("Playback error", e);
                if (e.f48498j == 1 && m12.f48542h != m12.f48543i) {
                    while (true) {
                        j12 = m12.f48542h;
                        if (j12 == m12.f48543i) {
                            break;
                        }
                        m12.a();
                    }
                    j12.getClass();
                    K k12 = j12.f48512f;
                    A.b bVar = k12.f48522a;
                    long j14 = k12.f48523b;
                    this.f48466y = s(bVar, j14, k12.f48524c, j14, true, 0);
                }
                d0(true, false);
                this.f48466y = this.f48466y.e(e);
            }
        } catch (DrmSession.DrmSessionException e15) {
            n(e15, e15.f49098b);
        } catch (BehindLiveWindowException e16) {
            n(e16, 1002);
        } catch (IOException e17) {
            n(e17, 2000);
        } catch (RuntimeException e18) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e18, ((e18 instanceof IllegalStateException) || (e18 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            androidx.media3.common.util.s.d("Playback error", exoPlaybackException2);
            d0(true, false);
            this.f48466y = this.f48466y.e(exoPlaybackException2);
        }
        x();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean[] r24) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.E.i(boolean[]):void");
    }

    public final synchronized void i0(C c12, long j12) {
        this.f48459r.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j12;
        boolean z12 = false;
        while (!((Boolean) c12.get()).booleanValue() && j12 > 0) {
            try {
                this.f48459r.getClass();
                wait(j12);
            } catch (InterruptedException unused) {
                z12 = true;
            }
            this.f48459r.getClass();
            j12 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
    }

    public final long j(androidx.media3.common.P p12, Object obj, long j12) {
        P.b bVar = this.f48454m;
        int i12 = p12.o(obj, bVar).f47381d;
        P.d dVar = this.f48453l;
        p12.v(i12, dVar);
        if (dVar.f47412g == -9223372036854775807L || !dVar.a() || !dVar.f47415j) {
            return -9223372036854775807L;
        }
        long j13 = dVar.f47413h;
        int i13 = androidx.media3.common.util.M.f47887a;
        return androidx.media3.common.util.M.F((j13 == -9223372036854775807L ? System.currentTimeMillis() : j13 + SystemClock.elapsedRealtime()) - dVar.f47412g) - (j12 + bVar.f47383f);
    }

    public final long k() {
        J j12 = this.f48461t.f48543i;
        if (j12 == null) {
            return 0L;
        }
        long jMax = j12.f48521o;
        if (!j12.f48510d) {
            return jMax;
        }
        int i12 = 0;
        while (true) {
            c0[] c0VarArr = this.f48443b;
            if (i12 >= c0VarArr.length) {
                return jMax;
            }
            if (u(c0VarArr[i12]) && c0VarArr[i12].l() == j12.f48509c[i12]) {
                long jP2 = c0VarArr[i12].p();
                if (jP2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jP2, jMax);
            }
            i12++;
        }
    }

    public final Pair<A.b, Long> l(androidx.media3.common.P p12) {
        if (p12.x()) {
            return Pair.create(X.f48592t, 0L);
        }
        Pair<Object, Long> pairQ = p12.q(this.f48453l, this.f48454m, p12.b(this.f48432G), -9223372036854775807L);
        A.b bVarN = this.f48461t.n(p12, pairQ.first, 0L);
        long jLongValue = ((Long) pairQ.second).longValue();
        if (bVarN.a()) {
            Object obj = bVarN.f47212a;
            P.b bVar = this.f48454m;
            p12.o(obj, bVar);
            jLongValue = bVarN.f47214c == bVar.m(bVarN.f47213b) ? bVar.f47385h.f47623c : 0L;
        }
        return Pair.create(bVarN, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    public final void m(InterfaceC23174z interfaceC23174z) {
        J j12 = this.f48461t.f48544j;
        if (j12 == null || j12.f48507a != interfaceC23174z) {
            return;
        }
        long j13 = this.f48438M;
        if (j12 != null) {
            C23110a.g(j12.f48518l == null);
            if (j12.f48510d) {
                j12.f48507a.reevaluateBuffer(j13 - j12.f48521o);
            }
        }
        w();
    }

    public final void n(IOException iOException, int i12) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i12);
        J j12 = this.f48461t.f48542h;
        if (j12 != null) {
            exoPlaybackException = exoPlaybackException.b(j12.f48512f.f48522a);
        }
        androidx.media3.common.util.s.d("Playback error", exoPlaybackException);
        d0(false, false);
        this.f48466y = this.f48466y.e(exoPlaybackException);
    }

    public final void o(boolean z12) {
        J j12 = this.f48461t.f48544j;
        A.b bVar = j12 == null ? this.f48466y.f48594b : j12.f48512f.f48522a;
        boolean zEquals = this.f48466y.f48603k.equals(bVar);
        if (!zEquals) {
            this.f48466y = this.f48466y.b(bVar);
        }
        X x12 = this.f48466y;
        x12.f48608p = j12 == null ? x12.f48610r : j12.d();
        X x13 = this.f48466y;
        long j13 = x13.f48608p;
        J j14 = this.f48461t.f48544j;
        x13.f48609q = j14 != null ? Math.max(0L, j13 - (this.f48438M - j14.f48521o)) : 0L;
        if ((!zEquals || z12) && j12 != null && j12.f48510d) {
            androidx.media3.exoplayer.source.Y y12 = j12.f48519m;
            androidx.media3.exoplayer.trackselection.s sVar = j12.f48520n;
            androidx.media3.common.P p12 = this.f48466y.f48593a;
            this.f48448g.j(this.f48443b, y12, sVar.f50039c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e3  */
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
    public final void p(androidx.media3.common.P r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.E.p(androidx.media3.common.P, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    public final void q(InterfaceC23174z interfaceC23174z) throws ExoPlaybackException {
        M m12 = this.f48461t;
        J j12 = m12.f48544j;
        if (j12 == null || j12.f48507a != interfaceC23174z) {
            return;
        }
        float f12 = this.f48457p.getPlaybackParameters().f47236b;
        androidx.media3.common.P p12 = this.f48466y.f48593a;
        j12.f48510d = true;
        j12.f48519m = j12.f48507a.getTrackGroups();
        androidx.media3.exoplayer.trackselection.s sVarG = j12.g(f12, p12);
        K k12 = j12.f48512f;
        long j13 = k12.f48526e;
        long j14 = k12.f48523b;
        long jA2 = j12.a(sVarG, (j13 == -9223372036854775807L || j14 < j13) ? j14 : Math.max(0L, j13 - 1), false, new boolean[j12.f48515i.length]);
        long j15 = j12.f48521o;
        K k13 = j12.f48512f;
        j12.f48521o = (k13.f48523b - jA2) + j15;
        j12.f48512f = k13.b(jA2);
        androidx.media3.exoplayer.source.Y y12 = j12.f48519m;
        androidx.media3.exoplayer.trackselection.s sVar = j12.f48520n;
        androidx.media3.common.P p13 = this.f48466y.f48593a;
        androidx.media3.exoplayer.trackselection.k[] kVarArr = sVar.f50039c;
        H h12 = this.f48448g;
        c0[] c0VarArr = this.f48443b;
        h12.j(c0VarArr, y12, kVarArr);
        if (j12 == m12.f48542h) {
            G(j12.f48512f.f48523b);
            i(new boolean[c0VarArr.length]);
            X x12 = this.f48466y;
            A.b bVar = x12.f48594b;
            long j16 = j12.f48512f.f48523b;
            this.f48466y = s(bVar, j16, x12.f48595c, j16, false, 5);
        }
        w();
    }

    public final void r(androidx.media3.common.G g12, float f12, boolean z12, boolean z13) {
        int i12;
        if (z12) {
            if (z13) {
                this.f48467z.a(1);
            }
            this.f48466y = this.f48466y.f(g12);
        }
        float f13 = g12.f47236b;
        J j12 = this.f48461t.f48542h;
        while (true) {
            i12 = 0;
            if (j12 == null) {
                break;
            }
            androidx.media3.exoplayer.trackselection.k[] kVarArr = j12.f48520n.f50039c;
            int length = kVarArr.length;
            while (i12 < length) {
                androidx.media3.exoplayer.trackselection.k kVar = kVarArr[i12];
                if (kVar != null) {
                    kVar.e(f13);
                }
                i12++;
            }
            j12 = j12.f48518l;
        }
        c0[] c0VarArr = this.f48443b;
        int length2 = c0VarArr.length;
        while (i12 < length2) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null) {
                c0Var.x(f12, g12.f47236b);
            }
            i12++;
        }
    }

    @InterfaceC42154j
    public final X s(A.b bVar, long j12, long j13, long j14, boolean z12, int i12) {
        androidx.media3.exoplayer.source.Y y12;
        androidx.media3.exoplayer.trackselection.s sVar;
        List<Metadata> listC;
        this.f48440O = (!this.f48440O && j12 == this.f48466y.f48610r && bVar.equals(this.f48466y.f48594b)) ? false : true;
        F();
        X x12 = this.f48466y;
        androidx.media3.exoplayer.source.Y y13 = x12.f48600h;
        androidx.media3.exoplayer.trackselection.s sVar2 = x12.f48601i;
        List<Metadata> list = x12.f48602j;
        if (this.f48462u.f48576k) {
            J j15 = this.f48461t.f48542h;
            androidx.media3.exoplayer.source.Y y14 = j15 == null ? androidx.media3.exoplayer.source.Y.f49705e : j15.f48519m;
            androidx.media3.exoplayer.trackselection.s sVar3 = j15 == null ? this.f48447f : j15.f48520n;
            androidx.media3.exoplayer.trackselection.k[] kVarArr = sVar3.f50039c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            boolean z13 = false;
            for (androidx.media3.exoplayer.trackselection.k kVar : kVarArr) {
                if (kVar != null) {
                    Metadata metadata = kVar.d(0).f47755k;
                    if (metadata == null) {
                        aVar.g(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar.g(metadata);
                        z13 = true;
                    }
                }
            }
            AbstractC37401r1 abstractC37401r1I = z13 ? aVar.i() : AbstractC37401r1.C();
            if (j15 != null) {
                K k12 = j15.f48512f;
                if (k12.f48524c != j13) {
                    j15.f48512f = k12.a(j13);
                }
            }
            listC = abstractC37401r1I;
            y12 = y14;
            sVar = sVar3;
        } else if (bVar.equals(x12.f48594b)) {
            y12 = y13;
            sVar = sVar2;
            listC = list;
        } else {
            y12 = androidx.media3.exoplayer.source.Y.f49705e;
            sVar = this.f48447f;
            listC = AbstractC37401r1.C();
        }
        if (z12) {
            d dVar = this.f48467z;
            if (!dVar.f48479d || dVar.f48480e == 5) {
                dVar.f48476a = true;
                dVar.f48479d = true;
                dVar.f48480e = i12;
            } else {
                C23110a.b(i12 == 5);
            }
        }
        X x13 = this.f48466y;
        long j16 = x13.f48608p;
        J j17 = this.f48461t.f48544j;
        return x13.c(bVar, j12, j13, j14, j17 == null ? 0L : Math.max(0L, j16 - (this.f48438M - j17.f48521o)), y12, sVar, listC);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    public final boolean t() {
        J j12 = this.f48461t.f48544j;
        if (j12 == null) {
            return false;
        }
        return (!j12.f48510d ? 0L : j12.f48507a.getNextLoadPositionUs()) != Long.MIN_VALUE;
    }

    public final boolean v() {
        J j12 = this.f48461t.f48542h;
        long j13 = j12.f48512f.f48526e;
        return j12.f48510d && (j13 == -9223372036854775807L || this.f48466y.f48610r < j13 || !a0());
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    public final void w() {
        boolean zH2;
        if (t()) {
            J j12 = this.f48461t.f48544j;
            long nextLoadPositionUs = !j12.f48510d ? 0L : j12.f48507a.getNextLoadPositionUs();
            J j13 = this.f48461t.f48544j;
            long jMax = j13 == null ? 0L : Math.max(0L, nextLoadPositionUs - (this.f48438M - j13.f48521o));
            J j14 = this.f48461t.f48542h;
            zH2 = this.f48448g.h(jMax, this.f48457p.getPlaybackParameters().f47236b);
            if (!zH2 && jMax < 500000 && (this.f48455n > 0 || this.f48456o)) {
                this.f48461t.f48542h.f48507a.discardBuffer(this.f48466y.f48610r, false);
                zH2 = this.f48448g.h(jMax, this.f48457p.getPlaybackParameters().f47236b);
            }
        } else {
            zH2 = false;
        }
        this.f48430E = zH2;
        if (zH2) {
            J j15 = this.f48461t.f48544j;
            long j16 = this.f48438M;
            C23110a.g(j15.f48518l == null);
            j15.f48507a.continueLoading(j16 - j15.f48521o);
        }
        f0();
    }

    public final void x() {
        d dVar = this.f48467z;
        X x12 = this.f48466y;
        boolean z12 = dVar.f48476a | (dVar.f48477b != x12);
        dVar.f48476a = z12;
        dVar.f48477b = x12;
        if (z12) {
            this.f48460s.a(dVar);
            this.f48467z = new d(this.f48466y);
        }
    }

    public final void y() throws Throwable {
        p(this.f48462u.b(), true);
    }

    public final void z(b bVar) throws Throwable {
        androidx.media3.common.P pB2;
        this.f48467z.a(1);
        int i12 = bVar.f48472a;
        U u12 = this.f48462u;
        u12.getClass();
        ArrayList arrayList = u12.f48567b;
        int i13 = bVar.f48473b;
        int i14 = bVar.f48474c;
        C23110a.b(i12 >= 0 && i12 <= i13 && i13 <= arrayList.size() && i14 >= 0);
        u12.f48575j = bVar.f48475d;
        if (i12 == i13 || i12 == i14) {
            pB2 = u12.b();
        } else {
            int iMin = Math.min(i12, i14);
            int iMax = Math.max(((i13 - i12) + i14) - 1, i13 - 1);
            int iW2 = ((U.c) arrayList.get(iMin)).f48586d;
            androidx.media3.common.util.M.E(arrayList, i12, i13, i14);
            while (iMin <= iMax) {
                U.c cVar = (U.c) arrayList.get(iMin);
                cVar.f48586d = iW2;
                iW2 += cVar.f48583a.f49843p.f49820g.w();
                iMin++;
            }
            pB2 = u12.b();
        }
        p(pB2, false);
    }
}
