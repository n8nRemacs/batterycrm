package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.C36507b;
import com.google.android.exoplayer2.C36509d;
import com.google.android.exoplayer2.G;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.audio.C36506d;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.O;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36592h;
import com.google.android.exoplayer2.util.C36599o;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.InterfaceC36601q;
import com.google.android.exoplayer2.video.spherical.k;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42164u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes6.dex */
final class C extends AbstractC36510e implements InterfaceC36534o, InterfaceC36534o.a, InterfaceC36534o.f, InterfaceC36534o.e, InterfaceC36534o.d {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f343308n0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final C36509d f343309A;

    /* renamed from: B, reason: collision with root package name */
    public final p0 f343310B;

    /* renamed from: C, reason: collision with root package name */
    public final u0 f343311C;

    /* renamed from: D, reason: collision with root package name */
    public final v0 f343312D;

    /* renamed from: E, reason: collision with root package name */
    public final long f343313E;

    /* renamed from: F, reason: collision with root package name */
    public int f343314F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f343315G;

    /* renamed from: H, reason: collision with root package name */
    public int f343316H;

    /* renamed from: I, reason: collision with root package name */
    public int f343317I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f343318J;

    /* renamed from: K, reason: collision with root package name */
    public int f343319K;

    /* renamed from: L, reason: collision with root package name */
    public final l0 f343320L;

    /* renamed from: M, reason: collision with root package name */
    public com.google.android.exoplayer2.source.O f343321M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f343322N;

    /* renamed from: O, reason: collision with root package name */
    public d0.c f343323O;

    /* renamed from: P, reason: collision with root package name */
    public P f343324P;

    /* renamed from: Q, reason: collision with root package name */
    @j.P
    public AudioTrack f343325Q;

    /* renamed from: R, reason: collision with root package name */
    @j.P
    public Object f343326R;

    /* renamed from: S, reason: collision with root package name */
    @j.P
    public Surface f343327S;

    /* renamed from: T, reason: collision with root package name */
    @j.P
    public SurfaceHolder f343328T;

    /* renamed from: U, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.video.spherical.k f343329U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f343330V;

    /* renamed from: W, reason: collision with root package name */
    @j.P
    public TextureView f343331W;

    /* renamed from: X, reason: collision with root package name */
    public final int f343332X;

    /* renamed from: Y, reason: collision with root package name */
    public int f343333Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f343334Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f343335a0;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.u f343336b;

    /* renamed from: b0, reason: collision with root package name */
    public final C36506d f343337b0;

    /* renamed from: c, reason: collision with root package name */
    public final d0.c f343338c;

    /* renamed from: c0, reason: collision with root package name */
    public float f343339c0;

    /* renamed from: d, reason: collision with root package name */
    public final C36592h f343340d = new C36592h();

    /* renamed from: d0, reason: collision with root package name */
    public boolean f343341d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f343342e;

    /* renamed from: e0, reason: collision with root package name */
    public com.google.android.exoplayer2.text.d f343343e0;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f343344f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f343345f0;

    /* renamed from: g, reason: collision with root package name */
    public final h0[] f343346g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f343347g0;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.t f343348h;

    /* renamed from: h0, reason: collision with root package name */
    public C36533n f343349h0;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC36601q f343350i;

    /* renamed from: i0, reason: collision with root package name */
    public com.google.android.exoplayer2.video.o f343351i0;

    /* renamed from: j, reason: collision with root package name */
    public final C36562u f343352j;

    /* renamed from: j0, reason: collision with root package name */
    public P f343353j0;

    /* renamed from: k, reason: collision with root package name */
    public final G f343354k;

    /* renamed from: k0, reason: collision with root package name */
    public b0 f343355k0;

    /* renamed from: l, reason: collision with root package name */
    public final C36604u<d0.g> f343356l;

    /* renamed from: l0, reason: collision with root package name */
    public int f343357l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC36534o.b> f343358m;

    /* renamed from: m0, reason: collision with root package name */
    public long f343359m0;

    /* renamed from: n, reason: collision with root package name */
    public final s0.b f343360n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f343361o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f343362p;

    /* renamed from: q, reason: collision with root package name */
    public final y.a f343363q;

    /* renamed from: r, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.a f343364r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f343365s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC36574d f343366t;

    /* renamed from: u, reason: collision with root package name */
    public final long f343367u;

    /* renamed from: v, reason: collision with root package name */
    public final long f343368v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.L f343369w;

    /* renamed from: x, reason: collision with root package name */
    public final c f343370x;

    /* renamed from: y, reason: collision with root package name */
    public final d f343371y;

    /* renamed from: z, reason: collision with root package name */
    public final C36507b f343372z;

    /* compiled from: ExoPlayerImpl.java */
    @j.X
    public static final class b {
        @InterfaceC42164u
        public static com.google.android.exoplayer2.analytics.p a(Context context, C c12, boolean z12) {
            MediaMetricsManager mediaMetricsManagerA = androidx.credentials.provider.r.a(context.getSystemService("media_metrics"));
            com.google.android.exoplayer2.analytics.l lVar = mediaMetricsManagerA == null ? null : new com.google.android.exoplayer2.analytics.l(context, mediaMetricsManagerA.createPlaybackSession());
            if (lVar == null) {
                return new com.google.android.exoplayer2.analytics.p(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z12) {
                c12.getClass();
                c12.f343364r.XL(lVar);
            }
            return new com.google.android.exoplayer2.analytics.p(lVar.f343808d.getSessionId());
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public static final class d implements com.google.android.exoplayer2.video.j, com.google.android.exoplayer2.video.spherical.a, e0.b {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.video.j f343374b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.video.spherical.a f343375c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.video.j f343376d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.video.spherical.a f343377e;

        public d() {
        }

        @Override // com.google.android.exoplayer2.e0.b
        public final void b(int i12, @j.P Object obj) {
            if (i12 == 7) {
                this.f343374b = (com.google.android.exoplayer2.video.j) obj;
                return;
            }
            if (i12 == 8) {
                this.f343375c = (com.google.android.exoplayer2.video.spherical.a) obj;
                return;
            }
            if (i12 != 10000) {
                return;
            }
            com.google.android.exoplayer2.video.spherical.k kVar = (com.google.android.exoplayer2.video.spherical.k) obj;
            if (kVar == null) {
                this.f343376d = null;
                this.f343377e = null;
            } else {
                this.f343376d = kVar.getVideoFrameMetadataListener();
                this.f343377e = kVar.getCameraMotionListener();
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.a
        public final void c() {
            com.google.android.exoplayer2.video.spherical.a aVar = this.f343377e;
            if (aVar != null) {
                aVar.c();
            }
            com.google.android.exoplayer2.video.spherical.a aVar2 = this.f343375c;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.a
        public final void d(long j12, float[] fArr) {
            com.google.android.exoplayer2.video.spherical.a aVar = this.f343377e;
            if (aVar != null) {
                aVar.d(j12, fArr);
            }
            com.google.android.exoplayer2.video.spherical.a aVar2 = this.f343375c;
            if (aVar2 != null) {
                aVar2.d(j12, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.j
        public final void e(long j12, long j13, I i12, @j.P MediaFormat mediaFormat) {
            com.google.android.exoplayer2.video.j jVar = this.f343376d;
            if (jVar != null) {
                jVar.e(j12, j13, i12, mediaFormat);
            }
            com.google.android.exoplayer2.video.j jVar2 = this.f343374b;
            if (jVar2 != null) {
                jVar2.e(j12, j13, i12, mediaFormat);
            }
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public static final class e implements V {

        /* renamed from: a, reason: collision with root package name */
        public final Object f343378a;

        /* renamed from: b, reason: collision with root package name */
        public s0 f343379b;

        public e(Object obj, s0 s0Var) {
            this.f343378a = obj;
            this.f343379b = s0Var;
        }

        @Override // com.google.android.exoplayer2.V
        public final Object c() {
            return this.f343378a;
        }

        @Override // com.google.android.exoplayer2.V
        public final s0 d() {
            return this.f343379b;
        }
    }

    static {
        H.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C(InterfaceC36534o.c cVar) {
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i12 = com.google.android.exoplayer2.util.U.f348106a;
            Context context = cVar.f345771a;
            Looper looper = cVar.f345779i;
            this.f343342e = context.getApplicationContext();
            C36607v c36607v = cVar.f345778h;
            com.google.android.exoplayer2.util.L l12 = cVar.f345772b;
            c36607v.getClass();
            this.f343364r = new com.google.android.exoplayer2.analytics.j(l12);
            this.f343337b0 = cVar.f345780j;
            this.f343332X = cVar.f345781k;
            this.f343341d0 = false;
            this.f343313E = cVar.f345788r;
            c cVar2 = new c(null);
            this.f343370x = cVar2;
            this.f343371y = new d();
            Handler handler = new Handler(looper);
            h0[] h0VarArrA = cVar.f345773c.get().a(handler, cVar2, cVar2, cVar2, cVar2);
            this.f343346g = h0VarArrA;
            C36585a.d(h0VarArrA.length > 0);
            this.f343348h = (com.google.android.exoplayer2.trackselection.t) cVar.f345775e.get();
            this.f343363q = cVar.f345774d.get();
            this.f343366t = (InterfaceC36574d) cVar.f345777g.get();
            this.f343362p = cVar.f345782l;
            this.f343320L = cVar.f345783m;
            this.f343367u = cVar.f345784n;
            this.f343368v = cVar.f345785o;
            this.f343322N = false;
            this.f343365s = looper;
            this.f343369w = l12;
            this.f343344f = this;
            this.f343356l = new C36604u<>(looper, l12, new C36562u(this));
            this.f343358m = new CopyOnWriteArraySet<>();
            this.f343361o = new ArrayList();
            this.f343321M = new O.a();
            this.f343336b = new com.google.android.exoplayer2.trackselection.u(new j0[h0VarArrA.length], new com.google.android.exoplayer2.trackselection.k[h0VarArrA.length], t0.f346708c, null);
            this.f343360n = new s0.b();
            d0.c.a aVar = new d0.c.a();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28, 31};
            C36599o.b bVar = aVar.f344192a;
            bVar.getClass();
            for (int i13 = 0; i13 < 21; i13++) {
                bVar.a(iArr[i13]);
            }
            com.google.android.exoplayer2.trackselection.t tVar = this.f343348h;
            tVar.getClass();
            aVar.a(29, tVar instanceof com.google.android.exoplayer2.trackselection.g);
            d0.c cVarB = aVar.b();
            this.f343338c = cVarB;
            d0.c.a aVar2 = new d0.c.a();
            C36599o.b bVar2 = aVar2.f344192a;
            C36599o c36599o = cVarB.f344191b;
            bVar2.getClass();
            for (int i14 = 0; i14 < c36599o.f348141a.size(); i14++) {
                bVar2.a(c36599o.a(i14));
            }
            bVar2.a(4);
            bVar2.a(10);
            this.f343323O = aVar2.b();
            this.f343350i = this.f343369w.b(this.f343365s, null);
            C36562u c36562u = new C36562u(this);
            this.f343352j = c36562u;
            this.f343355k0 = b0.i(this.f343336b);
            this.f343364r.Ih(this.f343344f, this.f343365s);
            int i15 = com.google.android.exoplayer2.util.U.f348106a;
            com.google.android.exoplayer2.analytics.p pVar = i15 < 31 ? new com.google.android.exoplayer2.analytics.p() : b.a(this.f343342e, this, cVar.f345789s);
            h0[] h0VarArr = this.f343346g;
            com.google.android.exoplayer2.trackselection.t tVar2 = this.f343348h;
            com.google.android.exoplayer2.trackselection.u uVar = this.f343336b;
            cVar.f345776f.getClass();
            this.f343354k = new G(h0VarArr, tVar2, uVar, new C36530k(), this.f343366t, this.f343314F, this.f343315G, this.f343364r, this.f343320L, cVar.f345786p, cVar.f345787q, this.f343322N, this.f343365s, this.f343369w, c36562u, pVar);
            this.f343339c0 = 1.0f;
            this.f343314F = 0;
            P p12 = P.f343601H;
            this.f343324P = p12;
            this.f343353j0 = p12;
            int iGenerateAudioSessionId = -1;
            this.f343357l0 = -1;
            if (i15 < 21) {
                AudioTrack audioTrack = this.f343325Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f343325Q.release();
                    this.f343325Q = null;
                }
                if (this.f343325Q == null) {
                    this.f343325Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f343335a0 = this.f343325Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f343342e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f343335a0 = iGenerateAudioSessionId;
            }
            this.f343343e0 = com.google.android.exoplayer2.text.d.f346846c;
            this.f343345f0 = true;
            N(this.f343364r);
            this.f343366t.b(new Handler(this.f343365s), this.f343364r);
            this.f343358m.add(this.f343370x);
            C36507b c36507b = new C36507b(context, handler, this.f343370x);
            this.f343372z = c36507b;
            c36507b.a();
            C36509d c36509d = new C36509d(context, handler, this.f343370x);
            this.f343309A = c36509d;
            if (!com.google.android.exoplayer2.util.U.a(null, null)) {
                c36509d.f344187e = 0;
            }
            p0 p0Var = new p0(context, handler, this.f343370x);
            this.f343310B = p0Var;
            int iY2 = com.google.android.exoplayer2.util.U.y(this.f343337b0.f343973d);
            if (p0Var.f345857f != iY2) {
                p0Var.f345857f = iY2;
                p0Var.b();
                p0Var.f345854c.b();
            }
            u0 u0Var = new u0();
            this.f343311C = u0Var;
            v0 v0Var = new v0();
            this.f343312D = v0Var;
            this.f343349h0 = V(p0Var);
            this.f343351i0 = com.google.android.exoplayer2.video.o.f348320f;
            this.f343348h.e(this.f343337b0);
            f0(1, 10, Integer.valueOf(this.f343335a0));
            f0(2, 10, Integer.valueOf(this.f343335a0));
            f0(1, 3, this.f343337b0);
            f0(2, 4, Integer.valueOf(this.f343332X));
            f0(2, 5, 0);
            f0(1, 9, Boolean.valueOf(this.f343341d0));
            f0(2, 7, this.f343371y);
            f0(6, 8, this.f343371y);
            this.f343340d.c();
        } catch (Throwable th2) {
            this.f343340d.c();
            throw th2;
        }
    }

    public static C36533n V(p0 p0Var) {
        p0Var.getClass();
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        AudioManager audioManager = p0Var.f345855d;
        return new C36533n(0, i12 >= 28 ? audioManager.getStreamMinVolume(p0Var.f345857f) : 0, audioManager.getStreamMaxVolume(p0Var.f345857f));
    }

    public static long Z(b0 b0Var) {
        s0.d dVar = new s0.d();
        s0.b bVar = new s0.b();
        b0Var.f344158a.g(b0Var.f344159b.f346696a, bVar);
        long j12 = b0Var.f344160c;
        if (j12 != -9223372036854775807L) {
            return bVar.f345874f + j12;
        }
        return b0Var.f344158a.m(bVar.f345872d, dVar, 0L).f345892n;
    }

    public static boolean a0(b0 b0Var) {
        return b0Var.f344162e == 3 && b0Var.f344169l && b0Var.f344170m == 0;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void D(@j.P SurfaceView surfaceView) {
        o0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o0();
        if (holder == null || holder != this.f343328T) {
            return;
        }
        M();
    }

    @Override // com.google.android.exoplayer2.InterfaceC36534o
    public final void F(com.google.android.exoplayer2.source.y yVar) {
        o0();
        g0(Collections.singletonList(yVar));
    }

    @Override // com.google.android.exoplayer2.d0
    public final Looper G() {
        return this.f343365s;
    }

    @Override // com.google.android.exoplayer2.InterfaceC36534o
    public final void H(com.google.android.exoplayer2.source.y yVar) {
        o0();
        List listSingletonList = Collections.singletonList(yVar);
        o0();
        g0(listSingletonList);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void I() {
        int i12;
        Pair<Object, Long> pairC0;
        o0();
        int iMin = Math.min(Integer.MAX_VALUE, this.f343361o.size());
        ArrayList arrayList = this.f343361o;
        boolean z12 = false;
        C36585a.b(iMin >= 0 && iMin <= arrayList.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        s0 currentTimeline = getCurrentTimeline();
        int size = arrayList.size();
        this.f343316H++;
        for (int i13 = iMin - 1; i13 >= 0; i13--) {
            arrayList.remove(i13);
        }
        this.f343321M = this.f343321M.g(iMin);
        f0 f0Var = new f0(arrayList, this.f343321M);
        b0 b0Var = this.f343355k0;
        long contentPosition = getContentPosition();
        if (currentTimeline.p() || f0Var.p()) {
            i12 = currentMediaItemIndex;
            if (!currentTimeline.p() && f0Var.p()) {
                z12 = true;
            }
            int iY2 = z12 ? -1 : Y();
            if (z12) {
                contentPosition = -9223372036854775807L;
            }
            pairC0 = c0(f0Var, iY2, contentPosition);
        } else {
            i12 = currentMediaItemIndex;
            pairC0 = currentTimeline.i(this.f344362a, this.f343360n, getCurrentMediaItemIndex(), com.google.android.exoplayer2.util.U.H(contentPosition));
            Object obj = pairC0.first;
            if (f0Var.b(obj) == -1) {
                Object objI = G.I(this.f344362a, this.f343360n, this.f343314F, this.f343315G, obj, currentTimeline, f0Var);
                if (objI != null) {
                    s0.b bVar = this.f343360n;
                    f0Var.g(objI, bVar);
                    int i14 = bVar.f345872d;
                    s0.d dVar = this.f344362a;
                    f0Var.m(i14, dVar, 0L);
                    pairC0 = c0(f0Var, i14, com.google.android.exoplayer2.util.U.R(dVar.f345892n));
                } else {
                    pairC0 = c0(f0Var, -1, -9223372036854775807L);
                }
            }
        }
        b0 b0VarB0 = b0(b0Var, f0Var, pairC0);
        int i15 = b0VarB0.f344162e;
        if (i15 != 1 && i15 != 4 && iMin > 0 && iMin == size && i12 >= b0VarB0.f344158a.o()) {
            b0VarB0 = b0VarB0.g(4);
        }
        this.f343354k.f343416i.j(iMin, this.f343321M).a();
        m0(b0VarB0, 0, 1, false, !b0VarB0.f344159b.f346696a.equals(this.f343355k0.f344159b.f346696a), 4, X(b0VarB0), -1);
    }

    @Override // com.google.android.exoplayer2.InterfaceC36534o
    public final void J() {
        o0();
        if (this.f343322N) {
            return;
        }
        this.f343322N = true;
        this.f343354k.f343416i.c(23, 1, 0).a();
    }

    @Override // com.google.android.exoplayer2.InterfaceC36534o
    public final void L(com.google.android.exoplayer2.analytics.b bVar) {
        this.f343364r.Vw(bVar);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void M() {
        o0();
        e0();
        i0(null);
        d0(0, 0);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void N(d0.g gVar) {
        gVar.getClass();
        this.f343356l.a(gVar);
    }

    public final P U() {
        s0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.f343353j0;
        }
        O o12 = currentTimeline.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345882d;
        P p12 = this.f343353j0;
        p12.getClass();
        P.b bVar = new P.b(p12, null);
        P p13 = o12.f343531e;
        if (p13 != null) {
            CharSequence charSequence = p13.f343610b;
            if (charSequence != null) {
                bVar.f343640a = charSequence;
            }
            CharSequence charSequence2 = p13.f343611c;
            if (charSequence2 != null) {
                bVar.f343641b = charSequence2;
            }
            CharSequence charSequence3 = p13.f343612d;
            if (charSequence3 != null) {
                bVar.f343642c = charSequence3;
            }
            CharSequence charSequence4 = p13.f343613e;
            if (charSequence4 != null) {
                bVar.f343643d = charSequence4;
            }
            CharSequence charSequence5 = p13.f343614f;
            if (charSequence5 != null) {
                bVar.f343644e = charSequence5;
            }
            CharSequence charSequence6 = p13.f343615g;
            if (charSequence6 != null) {
                bVar.f343645f = charSequence6;
            }
            CharSequence charSequence7 = p13.f343616h;
            if (charSequence7 != null) {
                bVar.f343646g = charSequence7;
            }
            g0 g0Var = p13.f343617i;
            if (g0Var != null) {
                bVar.f343647h = g0Var;
            }
            g0 g0Var2 = p13.f343618j;
            if (g0Var2 != null) {
                bVar.f343648i = g0Var2;
            }
            byte[] bArr = p13.f343619k;
            if (bArr != null) {
                bVar.f343649j = (byte[]) bArr.clone();
                bVar.f343650k = p13.f343620l;
            }
            Uri uri = p13.f343621m;
            if (uri != null) {
                bVar.f343651l = uri;
            }
            Integer num = p13.f343622n;
            if (num != null) {
                bVar.f343652m = num;
            }
            Integer num2 = p13.f343623o;
            if (num2 != null) {
                bVar.f343653n = num2;
            }
            Integer num3 = p13.f343624p;
            if (num3 != null) {
                bVar.f343654o = num3;
            }
            Boolean bool = p13.f343625q;
            if (bool != null) {
                bVar.f343655p = bool;
            }
            Integer num4 = p13.f343626r;
            if (num4 != null) {
                bVar.f343656q = num4;
            }
            Integer num5 = p13.f343627s;
            if (num5 != null) {
                bVar.f343656q = num5;
            }
            Integer num6 = p13.f343628t;
            if (num6 != null) {
                bVar.f343657r = num6;
            }
            Integer num7 = p13.f343629u;
            if (num7 != null) {
                bVar.f343658s = num7;
            }
            Integer num8 = p13.f343630v;
            if (num8 != null) {
                bVar.f343659t = num8;
            }
            Integer num9 = p13.f343631w;
            if (num9 != null) {
                bVar.f343660u = num9;
            }
            Integer num10 = p13.f343632x;
            if (num10 != null) {
                bVar.f343661v = num10;
            }
            CharSequence charSequence8 = p13.f343633y;
            if (charSequence8 != null) {
                bVar.f343662w = charSequence8;
            }
            CharSequence charSequence9 = p13.f343634z;
            if (charSequence9 != null) {
                bVar.f343663x = charSequence9;
            }
            CharSequence charSequence10 = p13.f343603A;
            if (charSequence10 != null) {
                bVar.f343664y = charSequence10;
            }
            Integer num11 = p13.f343604B;
            if (num11 != null) {
                bVar.f343665z = num11;
            }
            Integer num12 = p13.f343605C;
            if (num12 != null) {
                bVar.f343635A = num12;
            }
            CharSequence charSequence11 = p13.f343606D;
            if (charSequence11 != null) {
                bVar.f343636B = charSequence11;
            }
            CharSequence charSequence12 = p13.f343607E;
            if (charSequence12 != null) {
                bVar.f343637C = charSequence12;
            }
            CharSequence charSequence13 = p13.f343608F;
            if (charSequence13 != null) {
                bVar.f343638D = charSequence13;
            }
            Bundle bundle = p13.f343609G;
            if (bundle != null) {
                bVar.f343639E = bundle;
            }
        }
        return new P(bVar, null);
    }

    public final e0 W(e0.b bVar) {
        int iY2 = Y();
        s0 s0Var = this.f343355k0.f344158a;
        if (iY2 == -1) {
            iY2 = 0;
        }
        G g12 = this.f343354k;
        return new e0(g12, bVar, s0Var, iY2, this.f343369w, g12.f343418k);
    }

    public final long X(b0 b0Var) {
        if (b0Var.f344158a.p()) {
            return com.google.android.exoplayer2.util.U.H(this.f343359m0);
        }
        if (b0Var.f344159b.a()) {
            return b0Var.f344176s;
        }
        s0 s0Var = b0Var.f344158a;
        y.b bVar = b0Var.f344159b;
        long j12 = b0Var.f344176s;
        Object obj = bVar.f346696a;
        s0.b bVar2 = this.f343360n;
        s0Var.g(obj, bVar2);
        return j12 + bVar2.f345874f;
    }

    public final int Y() {
        if (this.f343355k0.f344158a.p()) {
            return this.f343357l0;
        }
        b0 b0Var = this.f343355k0;
        return b0Var.f344158a.g(b0Var.f344159b.f346696a, this.f343360n).f345872d;
    }

    @Override // com.google.android.exoplayer2.d0
    public final long b() {
        o0();
        return 3000L;
    }

    public final b0 b0(b0 b0Var, s0 s0Var, @j.P Pair<Object, Long> pair) {
        C36585a.b(s0Var.p() || pair != null);
        s0 s0Var2 = b0Var.f344158a;
        b0 b0VarH = b0Var.h(s0Var);
        if (s0Var.p()) {
            y.b bVar = b0.f344157t;
            long jH2 = com.google.android.exoplayer2.util.U.H(this.f343359m0);
            b0 b0VarA = b0VarH.b(bVar, jH2, jH2, jH2, 0L, com.google.android.exoplayer2.source.W.f346153e, this.f343336b, AbstractC37401r1.C()).a(bVar);
            b0VarA.f344174q = b0VarA.f344176s;
            return b0VarA;
        }
        Object obj = b0VarH.f344159b.f346696a;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        boolean zEquals = obj.equals(pair.first);
        y.b bVar2 = !zEquals ? new y.b(pair.first) : b0VarH.f344159b;
        long jLongValue = ((Long) pair.second).longValue();
        long jH3 = com.google.android.exoplayer2.util.U.H(getContentPosition());
        if (!s0Var2.p()) {
            jH3 -= s0Var2.g(obj, this.f343360n).f345874f;
        }
        if (!zEquals || jLongValue < jH3) {
            C36585a.d(!bVar2.a());
            b0 b0VarA2 = b0VarH.b(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? com.google.android.exoplayer2.source.W.f346153e : b0VarH.f344165h, !zEquals ? this.f343336b : b0VarH.f344166i, !zEquals ? AbstractC37401r1.C() : b0VarH.f344167j).a(bVar2);
            b0VarA2.f344174q = jLongValue;
            return b0VarA2;
        }
        if (jLongValue == jH3) {
            int iB2 = s0Var.b(b0VarH.f344168k.f346696a);
            if (iB2 == -1 || s0Var.f(iB2, this.f343360n, false).f345872d != s0Var.g(bVar2.f346696a, this.f343360n).f345872d) {
                s0Var.g(bVar2.f346696a, this.f343360n);
                long jB2 = bVar2.a() ? this.f343360n.b(bVar2.f346697b, bVar2.f346698c) : this.f343360n.f345873e;
                b0VarH = b0VarH.b(bVar2, b0VarH.f344176s, b0VarH.f344176s, b0VarH.f344161d, jB2 - b0VarH.f344176s, b0VarH.f344165h, b0VarH.f344166i, b0VarH.f344167j).a(bVar2);
                b0VarH.f344174q = jB2;
            }
        } else {
            C36585a.d(!bVar2.a());
            long jMax = Math.max(0L, b0VarH.f344175r - (jLongValue - jH3));
            long j12 = b0VarH.f344174q;
            if (b0VarH.f344168k.equals(b0VarH.f344159b)) {
                j12 = jLongValue + jMax;
            }
            b0VarH = b0VarH.b(bVar2, jLongValue, jLongValue, jLongValue, jMax, b0VarH.f344165h, b0VarH.f344166i, b0VarH.f344167j);
            b0VarH.f344174q = j12;
        }
        return b0VarH;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void c(List list) {
        o0();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(this.f343363q.a((O) list.get(i12)));
        }
        g0(arrayList);
    }

    @j.P
    public final Pair<Object, Long> c0(s0 s0Var, int i12, long j12) {
        if (s0Var.p()) {
            this.f343357l0 = i12;
            if (j12 == -9223372036854775807L) {
                j12 = 0;
            }
            this.f343359m0 = j12;
            return null;
        }
        if (i12 == -1 || i12 >= s0Var.o()) {
            i12 = s0Var.a(this.f343315G);
            j12 = com.google.android.exoplayer2.util.U.R(s0Var.m(i12, this.f344362a, 0L).f345892n);
        }
        return s0Var.i(this.f344362a, this.f343360n, i12, com.google.android.exoplayer2.util.U.H(j12));
    }

    @Override // com.google.android.exoplayer2.d0
    public final void d(c0 c0Var) {
        o0();
        if (this.f343355k0.f344171n.equals(c0Var)) {
            return;
        }
        b0 b0VarF = this.f343355k0.f(c0Var);
        this.f343316H++;
        this.f343354k.f343416i.b(4, c0Var).a();
        m0(b0VarF, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void d0(final int i12, final int i13) {
        if (i12 == this.f343333Y && i13 == this.f343334Z) {
            return;
        }
        this.f343333Y = i12;
        this.f343334Z = i13;
        this.f343356l.f(24, new C36604u.a() { // from class: com.google.android.exoplayer2.x
            @Override // com.google.android.exoplayer2.util.C36604u.a
            public final void invoke(Object obj) {
                int i14 = C.f343308n0;
                ((d0.g) obj).onSurfaceSizeChanged(i12, i13);
            }
        });
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.video.o e() {
        o0();
        return this.f343351i0;
    }

    public final void e0() {
        com.google.android.exoplayer2.video.spherical.k kVar = this.f343329U;
        c cVar = this.f343370x;
        if (kVar != null) {
            e0 e0VarW = W(this.f343371y);
            C36585a.d(!e0VarW.f344369g);
            e0VarW.f344366d = 10000;
            C36585a.d(!e0VarW.f344369g);
            e0VarW.f344367e = null;
            e0VarW.c();
            this.f343329U.f348381b.remove(cVar);
            this.f343329U = null;
        }
        TextureView textureView = this.f343331W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == cVar) {
                this.f343331W.setSurfaceTextureListener(null);
            }
            this.f343331W = null;
        }
        SurfaceHolder surfaceHolder = this.f343328T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(cVar);
            this.f343328T = null;
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final void f(int i12, long j12) {
        o0();
        this.f343364r.yc();
        s0 s0Var = this.f343355k0.f344158a;
        if (i12 < 0 || (!s0Var.p() && i12 >= s0Var.o())) {
            throw new IllegalSeekPositionException();
        }
        this.f343316H++;
        if (isPlayingAd()) {
            G.d dVar = new G.d(this.f343355k0);
            dVar.a(1);
            this.f343352j.a(dVar);
            return;
        }
        int i13 = getPlaybackState() != 1 ? 2 : 1;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        b0 b0VarB0 = b0(this.f343355k0.g(i13), s0Var, c0(s0Var, i12, j12));
        long jH2 = com.google.android.exoplayer2.util.U.H(j12);
        G g12 = this.f343354k;
        g12.getClass();
        g12.f343416i.b(3, new G.g(s0Var, i12, jH2)).a();
        m0(b0VarB0, 0, 1, true, true, 1, X(b0VarB0), currentMediaItemIndex);
    }

    public final void f0(int i12, int i13, @j.P Object obj) {
        for (h0 h0Var : this.f343346g) {
            if (h0Var.m() == i12) {
                e0 e0VarW = W(h0Var);
                C36585a.d(!e0VarW.f344369g);
                e0VarW.f344366d = i13;
                C36585a.d(!e0VarW.f344369g);
                e0VarW.f344367e = obj;
                e0VarW.c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.trackselection.r g() {
        o0();
        return this.f343348h.a();
    }

    public final void g0(List list) {
        o0();
        Y();
        getCurrentPosition();
        this.f343316H++;
        ArrayList arrayList = this.f343361o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i12 = size - 1; i12 >= 0; i12--) {
                arrayList.remove(i12);
            }
            this.f343321M = this.f343321M.g(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            X.c cVar = new X.c((com.google.android.exoplayer2.source.y) list.get(i13), this.f343362p);
            arrayList2.add(cVar);
            arrayList.add(i13, new e(cVar.f343731b, cVar.f343730a.f346679p));
        }
        this.f343321M = this.f343321M.f(arrayList2.size());
        f0 f0Var = new f0(arrayList, this.f343321M);
        boolean zP2 = f0Var.p();
        int i14 = f0Var.f345408f;
        if (!zP2 && -1 >= i14) {
            throw new IllegalSeekPositionException();
        }
        int iA2 = f0Var.a(this.f343315G);
        b0 b0VarB0 = b0(this.f343355k0, f0Var, c0(f0Var, iA2, -9223372036854775807L));
        int i15 = b0VarB0.f344162e;
        if (iA2 != -1 && i15 != 1) {
            i15 = (f0Var.p() || iA2 >= i14) ? 4 : 2;
        }
        b0 b0VarG = b0VarB0.g(i15);
        long jH2 = com.google.android.exoplayer2.util.U.H(-9223372036854775807L);
        com.google.android.exoplayer2.source.O o12 = this.f343321M;
        G g12 = this.f343354k;
        g12.getClass();
        g12.f343416i.b(17, new G.a(arrayList2, o12, iA2, jH2, null)).a();
        m0(b0VarG, 0, 1, false, (this.f343355k0.f344159b.f346696a.equals(b0VarG.f344159b.f346696a) || this.f343355k0.f344158a.p()) ? false : true, 4, X(b0VarG), -1);
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getContentPosition() {
        o0();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        b0 b0Var = this.f343355k0;
        s0 s0Var = b0Var.f344158a;
        Object obj = b0Var.f344159b.f346696a;
        s0.b bVar = this.f343360n;
        s0Var.g(obj, bVar);
        b0 b0Var2 = this.f343355k0;
        if (b0Var2.f344160c != -9223372036854775807L) {
            return com.google.android.exoplayer2.util.U.R(bVar.f345874f) + com.google.android.exoplayer2.util.U.R(this.f343355k0.f344160c);
        }
        return com.google.android.exoplayer2.util.U.R(b0Var2.f344158a.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345892n);
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdGroupIndex() {
        o0();
        if (isPlayingAd()) {
            return this.f343355k0.f344159b.f346697b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdIndexInAdGroup() {
        o0();
        if (isPlayingAd()) {
            return this.f343355k0.f344159b.f346698c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentMediaItemIndex() {
        o0();
        int iY2 = Y();
        if (iY2 == -1) {
            return 0;
        }
        return iY2;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentPeriodIndex() {
        o0();
        if (this.f343355k0.f344158a.p()) {
            return 0;
        }
        b0 b0Var = this.f343355k0;
        return b0Var.f344158a.b(b0Var.f344159b.f346696a);
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getCurrentPosition() {
        o0();
        return com.google.android.exoplayer2.util.U.R(X(this.f343355k0));
    }

    @Override // com.google.android.exoplayer2.d0
    public final s0 getCurrentTimeline() {
        o0();
        return this.f343355k0.f344158a;
    }

    @Override // com.google.android.exoplayer2.d0
    public final t0 getCurrentTracks() {
        o0();
        return this.f343355k0.f344166i.f347339d;
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getDuration() {
        o0();
        if (!isPlayingAd()) {
            return i();
        }
        b0 b0Var = this.f343355k0;
        y.b bVar = b0Var.f344159b;
        s0 s0Var = b0Var.f344158a;
        Object obj = bVar.f346696a;
        s0.b bVar2 = this.f343360n;
        s0Var.g(obj, bVar2);
        return com.google.android.exoplayer2.util.U.R(bVar2.b(bVar.f346697b, bVar.f346698c));
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean getPlayWhenReady() {
        o0();
        return this.f343355k0.f344169l;
    }

    @Override // com.google.android.exoplayer2.d0
    public final c0 getPlaybackParameters() {
        o0();
        return this.f343355k0.f344171n;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackState() {
        o0();
        return this.f343355k0.f344162e;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackSuppressionReason() {
        o0();
        return this.f343355k0.f344170m;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getRepeatMode() {
        o0();
        return this.f343314F;
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getTotalBufferedDuration() {
        o0();
        return com.google.android.exoplayer2.util.U.R(this.f343355k0.f344175r);
    }

    @Override // com.google.android.exoplayer2.d0
    public final float getVolume() {
        o0();
        return this.f343339c0;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void h(boolean z12) {
        o0();
        if (this.f343315G != z12) {
            this.f343315G = z12;
            this.f343354k.f343416i.c(12, z12 ? 1 : 0, 0).a();
            r rVar = new r(z12, 0);
            C36604u<d0.g> c36604u = this.f343356l;
            c36604u.c(9, rVar);
            k0();
            c36604u.b();
        }
    }

    public final void h0(SurfaceHolder surfaceHolder) {
        this.f343330V = false;
        this.f343328T = surfaceHolder;
        surfaceHolder.addCallback(this.f343370x);
        Surface surface = this.f343328T.getSurface();
        if (surface == null || !surface.isValid()) {
            d0(0, 0);
        } else {
            Rect surfaceFrame = this.f343328T.getSurfaceFrame();
            d0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void i0(@j.P Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        for (h0 h0Var : this.f343346g) {
            if (h0Var.m() == 2) {
                e0 e0VarW = W(h0Var);
                C36585a.d(!e0VarW.f344369g);
                e0VarW.f344366d = 1;
                C36585a.d(true ^ e0VarW.f344369g);
                e0VarW.f344367e = obj;
                e0VarW.c();
                arrayList.add(e0VarW);
            }
        }
        Object obj2 = this.f343326R;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).a(this.f343313E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z12 = true;
            }
            Object obj3 = this.f343326R;
            Surface surface = this.f343327S;
            if (obj3 == surface) {
                surface.release();
                this.f343327S = null;
            }
        }
        this.f343326R = obj;
        if (z12) {
            j0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean isPlayingAd() {
        o0();
        return this.f343355k0.f344159b.a();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long j() {
        o0();
        return this.f343368v;
    }

    public final void j0(@j.P ExoPlaybackException exoPlaybackException) {
        b0 b0Var = this.f343355k0;
        b0 b0VarA = b0Var.a(b0Var.f344159b);
        b0VarA.f344174q = b0VarA.f344176s;
        b0VarA.f344175r = 0L;
        b0 b0VarG = b0VarA.g(1);
        if (exoPlaybackException != null) {
            b0VarG = b0VarG.e(exoPlaybackException);
        }
        b0 b0Var2 = b0VarG;
        this.f343316H++;
        this.f343354k.f343416i.h(6).a();
        m0(b0Var2, 0, 1, false, b0Var2.f344158a.p() && !this.f343355k0.f344158a.p(), 4, X(b0Var2), -1);
    }

    public final void k0() {
        d0.c cVar = this.f343323O;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        C c12 = (C) this.f343344f;
        boolean zIsPlayingAd = c12.isPlayingAd();
        boolean zS2 = c12.S();
        boolean zP2 = c12.P();
        boolean zO2 = c12.O();
        boolean zR2 = c12.R();
        boolean zQ2 = c12.Q();
        boolean zP3 = c12.getCurrentTimeline().p();
        d0.c.a aVar = new d0.c.a();
        C36599o c36599o = this.f343338c.f344191b;
        C36599o.b bVar = aVar.f344192a;
        bVar.getClass();
        for (int i13 = 0; i13 < c36599o.f348141a.size(); i13++) {
            bVar.a(c36599o.a(i13));
        }
        boolean z12 = !zIsPlayingAd;
        aVar.a(4, z12);
        aVar.a(5, zS2 && !zIsPlayingAd);
        aVar.a(6, zP2 && !zIsPlayingAd);
        aVar.a(7, !zP3 && (zP2 || !zR2 || zS2) && !zIsPlayingAd);
        aVar.a(8, zO2 && !zIsPlayingAd);
        aVar.a(9, !zP3 && (zO2 || (zR2 && zQ2)) && !zIsPlayingAd);
        aVar.a(10, z12);
        aVar.a(11, zS2 && !zIsPlayingAd);
        aVar.a(12, zS2 && !zIsPlayingAd);
        d0.c cVarB = aVar.b();
        this.f343323O = cVarB;
        if (cVarB.equals(cVar)) {
            return;
        }
        this.f343356l.c(13, new C36562u(this));
    }

    @Override // com.google.android.exoplayer2.d0
    public final long l() {
        o0();
        if (this.f343355k0.f344158a.p()) {
            return this.f343359m0;
        }
        b0 b0Var = this.f343355k0;
        if (b0Var.f344168k.f346699d != b0Var.f344159b.f346699d) {
            return com.google.android.exoplayer2.util.U.R(b0Var.f344158a.m(getCurrentMediaItemIndex(), this.f344362a, 0L).f345893o);
        }
        long j12 = b0Var.f344174q;
        if (this.f343355k0.f344168k.a()) {
            b0 b0Var2 = this.f343355k0;
            s0.b bVarG = b0Var2.f344158a.g(b0Var2.f344168k.f346696a, this.f343360n);
            long jD2 = bVarG.d(this.f343355k0.f344168k.f346697b);
            j12 = jD2 == Long.MIN_VALUE ? bVarG.f345873e : jD2;
        }
        b0 b0Var3 = this.f343355k0;
        s0 s0Var = b0Var3.f344158a;
        Object obj = b0Var3.f344168k.f346696a;
        s0.b bVar = this.f343360n;
        s0Var.g(obj, bVar);
        return com.google.android.exoplayer2.util.U.R(j12 + bVar.f345874f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void l0(int i12, int i13, boolean z12) {
        int i14 = 0;
        ?? r32 = (!z12 || i12 == -1) ? 0 : 1;
        if (r32 != 0 && i12 != 1) {
            i14 = 1;
        }
        b0 b0Var = this.f343355k0;
        if (b0Var.f344169l == r32 && b0Var.f344170m == i14) {
            return;
        }
        this.f343316H++;
        b0 b0VarD = b0Var.d(i14, r32);
        this.f343354k.f343416i.c(1, r32, i14).a();
        m0(b0VarD, 0, i13, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.text.d m() {
        o0();
        return this.f343343e0;
    }

    public final void m0(final b0 b0Var, final int i12, final int i13, boolean z12, boolean z13, final int i14, long j12, int i15) {
        Pair pair;
        int i16;
        final O o12;
        boolean z14;
        boolean z15;
        int i17;
        Object obj;
        O o13;
        Object obj2;
        int i18;
        long j13;
        long j14;
        long jZ2;
        long jZ3;
        Object obj3;
        O o14;
        Object obj4;
        int i19;
        b0 b0Var2 = this.f343355k0;
        this.f343355k0 = b0Var;
        boolean zEquals = b0Var2.f344158a.equals(b0Var.f344158a);
        s0 s0Var = b0Var2.f344158a;
        s0 s0Var2 = b0Var.f344158a;
        if (s0Var2.p() && s0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (s0Var2.p() != s0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            y.b bVar = b0Var2.f344159b;
            Object obj5 = bVar.f346696a;
            s0.b bVar2 = this.f343360n;
            int i22 = s0Var.g(obj5, bVar2).f345872d;
            s0.d dVar = this.f344362a;
            Object obj6 = s0Var.m(i22, dVar, 0L).f345880b;
            y.b bVar3 = b0Var.f344159b;
            if (obj6.equals(s0Var2.m(s0Var2.g(bVar3.f346696a, bVar2).f345872d, dVar, 0L).f345880b)) {
                pair = (z13 && i14 == 0 && bVar.f346699d < bVar3.f346699d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z13 && i14 == 0) {
                    i16 = 1;
                } else if (z13 && i14 == 1) {
                    i16 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i16 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i16));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        P pU2 = this.f343324P;
        if (zBooleanValue) {
            o12 = !b0Var.f344158a.p() ? b0Var.f344158a.m(b0Var.f344158a.g(b0Var.f344159b.f346696a, this.f343360n).f345872d, this.f344362a, 0L).f345882d : null;
            this.f343353j0 = P.f343601H;
        } else {
            o12 = null;
        }
        if (zBooleanValue || !b0Var2.f344167j.equals(b0Var.f344167j)) {
            P p12 = this.f343353j0;
            p12.getClass();
            P.b bVar4 = new P.b(p12, null);
            List<Metadata> list = b0Var.f344167j;
            for (int i23 = 0; i23 < list.size(); i23++) {
                Metadata metadata = list.get(i23);
                int i24 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f345623b;
                    if (i24 < entryArr.length) {
                        entryArr[i24].f4(bVar4);
                        i24++;
                    }
                }
            }
            this.f343353j0 = new P(bVar4, null);
            pU2 = U();
        }
        boolean zEquals2 = pU2.equals(this.f343324P);
        this.f343324P = pU2;
        boolean z16 = b0Var2.f344169l != b0Var.f344169l;
        boolean z17 = b0Var2.f344162e != b0Var.f344162e;
        if (z17 || z16) {
            n0();
        }
        boolean z18 = b0Var2.f344164g != b0Var.f344164g;
        if (!b0Var2.f344158a.equals(b0Var.f344158a)) {
            final int i25 = 0;
            this.f343356l.c(0, new C36604u.a() { // from class: com.google.android.exoplayer2.A
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj7) {
                    int i26 = i12;
                    Object obj8 = b0Var;
                    d0.g gVar = (d0.g) obj7;
                    switch (i25) {
                        case 0:
                            int i27 = C.f343308n0;
                            gVar.onTimelineChanged(((b0) obj8).f344158a, i26);
                            break;
                        case 1:
                            int i28 = C.f343308n0;
                            gVar.onPlayWhenReadyChanged(((b0) obj8).f344169l, i26);
                            break;
                        default:
                            int i29 = C.f343308n0;
                            gVar.onMediaItemTransition((O) obj8, i26);
                            break;
                    }
                }
            });
        }
        if (z13) {
            s0.b bVar5 = new s0.b();
            if (b0Var2.f344158a.p()) {
                z14 = z17;
                z15 = z18;
                i17 = i15;
                obj = null;
                o13 = null;
                obj2 = null;
                i18 = -1;
            } else {
                Object obj7 = b0Var2.f344159b.f346696a;
                b0Var2.f344158a.g(obj7, bVar5);
                int i26 = bVar5.f345872d;
                int iB2 = b0Var2.f344158a.b(obj7);
                z14 = z17;
                z15 = z18;
                obj2 = obj7;
                obj = b0Var2.f344158a.m(i26, this.f344362a, 0L).f345880b;
                o13 = this.f344362a.f345882d;
                i17 = i26;
                i18 = iB2;
            }
            if (i14 == 0) {
                if (b0Var2.f344159b.a()) {
                    y.b bVar6 = b0Var2.f344159b;
                    jZ2 = bVar5.b(bVar6.f346697b, bVar6.f346698c);
                    jZ3 = Z(b0Var2);
                } else if (b0Var2.f344159b.f346700e != -1) {
                    jZ2 = Z(this.f343355k0);
                    jZ3 = jZ2;
                } else {
                    j13 = bVar5.f345874f;
                    j14 = bVar5.f345873e;
                    jZ2 = j13 + j14;
                    jZ3 = jZ2;
                }
            } else if (b0Var2.f344159b.a()) {
                jZ2 = b0Var2.f344176s;
                jZ3 = Z(b0Var2);
            } else {
                j13 = bVar5.f345874f;
                j14 = b0Var2.f344176s;
                jZ2 = j13 + j14;
                jZ3 = jZ2;
            }
            long jR2 = com.google.android.exoplayer2.util.U.R(jZ2);
            long jR3 = com.google.android.exoplayer2.util.U.R(jZ3);
            y.b bVar7 = b0Var2.f344159b;
            final d0.k kVar = new d0.k(obj, i17, o13, obj2, i18, jR2, jR3, bVar7.f346697b, bVar7.f346698c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f343355k0.f344158a.p()) {
                obj3 = null;
                o14 = null;
                obj4 = null;
                i19 = -1;
            } else {
                b0 b0Var3 = this.f343355k0;
                Object obj8 = b0Var3.f344159b.f346696a;
                b0Var3.f344158a.g(obj8, this.f343360n);
                int iB3 = this.f343355k0.f344158a.b(obj8);
                s0 s0Var3 = this.f343355k0.f344158a;
                s0.d dVar2 = this.f344362a;
                i19 = iB3;
                obj3 = s0Var3.m(currentMediaItemIndex, dVar2, 0L).f345880b;
                o14 = dVar2.f345882d;
                obj4 = obj8;
            }
            long jR4 = com.google.android.exoplayer2.util.U.R(j12);
            long jR5 = this.f343355k0.f344159b.a() ? com.google.android.exoplayer2.util.U.R(Z(this.f343355k0)) : jR4;
            y.b bVar8 = this.f343355k0.f344159b;
            final d0.k kVar2 = new d0.k(obj3, currentMediaItemIndex, o14, obj4, i19, jR4, jR5, bVar8.f346697b, bVar8.f346698c);
            this.f343356l.c(11, new C36604u.a() { // from class: com.google.android.exoplayer2.B
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    d0.g gVar = (d0.g) obj9;
                    int i27 = C.f343308n0;
                    int i28 = i14;
                    gVar.onPositionDiscontinuity(i28);
                    gVar.onPositionDiscontinuity(kVar, kVar2, i28);
                }
            });
        } else {
            z14 = z17;
            z15 = z18;
        }
        if (zBooleanValue) {
            final int i27 = 2;
            this.f343356l.c(1, new C36604u.a() { // from class: com.google.android.exoplayer2.A
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj72) {
                    int i262 = iIntValue;
                    Object obj82 = o12;
                    d0.g gVar = (d0.g) obj72;
                    switch (i27) {
                        case 0:
                            int i272 = C.f343308n0;
                            gVar.onTimelineChanged(((b0) obj82).f344158a, i262);
                            break;
                        case 1:
                            int i28 = C.f343308n0;
                            gVar.onPlayWhenReadyChanged(((b0) obj82).f344169l, i262);
                            break;
                        default:
                            int i29 = C.f343308n0;
                            gVar.onMediaItemTransition((O) obj82, i262);
                            break;
                    }
                }
            });
        }
        if (b0Var2.f344163f != b0Var.f344163f) {
            final int i28 = 0;
            this.f343356l.c(10, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i28) {
                        case 0:
                            int i29 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i32 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i33 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i34 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i35 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i36 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i37 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
            if (b0Var.f344163f != null) {
                final int i29 = 1;
                this.f343356l.c(10, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                    @Override // com.google.android.exoplayer2.util.C36604u.a
                    public final void invoke(Object obj9) {
                        b0 b0Var4 = b0Var;
                        d0.g gVar = (d0.g) obj9;
                        switch (i29) {
                            case 0:
                                int i292 = C.f343308n0;
                                gVar.onPlayerErrorChanged(b0Var4.f344163f);
                                break;
                            case 1:
                                int i32 = C.f343308n0;
                                gVar.onPlayerError(b0Var4.f344163f);
                                break;
                            case 2:
                                int i33 = C.f343308n0;
                                gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                                break;
                            case 3:
                                int i34 = C.f343308n0;
                                gVar.onLoadingChanged(b0Var4.f344164g);
                                gVar.onIsLoadingChanged(b0Var4.f344164g);
                                break;
                            case 4:
                                int i35 = C.f343308n0;
                                gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                                break;
                            case 5:
                                int i36 = C.f343308n0;
                                gVar.onPlaybackStateChanged(b0Var4.f344162e);
                                break;
                            case 6:
                                int i37 = C.f343308n0;
                                gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                                break;
                            case 7:
                                gVar.onIsPlayingChanged(C.a0(b0Var4));
                                break;
                            default:
                                int i38 = C.f343308n0;
                                gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                                break;
                        }
                    }
                });
            }
        }
        com.google.android.exoplayer2.trackselection.u uVar = b0Var2.f344166i;
        com.google.android.exoplayer2.trackselection.u uVar2 = b0Var.f344166i;
        if (uVar != uVar2) {
            this.f343348h.b(uVar2.f347340e);
            final int i32 = 2;
            this.f343356l.c(2, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i32) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i33 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i34 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i35 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i36 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i37 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f343356l.c(14, new C36561t(this.f343324P, 0));
        }
        if (z15) {
            final int i33 = 3;
            this.f343356l.c(3, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i33) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i34 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i35 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i36 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i37 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (z14 || z16) {
            final int i34 = 4;
            this.f343356l.c(-1, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i34) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i342 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i35 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i36 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i37 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i35 = 5;
            this.f343356l.c(4, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i35) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i342 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i352 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i36 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i37 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (z16) {
            final int i36 = 1;
            this.f343356l.c(5, new C36604u.a() { // from class: com.google.android.exoplayer2.A
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj72) {
                    int i262 = i13;
                    Object obj82 = b0Var;
                    d0.g gVar = (d0.g) obj72;
                    switch (i36) {
                        case 0:
                            int i272 = C.f343308n0;
                            gVar.onTimelineChanged(((b0) obj82).f344158a, i262);
                            break;
                        case 1:
                            int i282 = C.f343308n0;
                            gVar.onPlayWhenReadyChanged(((b0) obj82).f344169l, i262);
                            break;
                        default:
                            int i292 = C.f343308n0;
                            gVar.onMediaItemTransition((O) obj82, i262);
                            break;
                    }
                }
            });
        }
        if (b0Var2.f344170m != b0Var.f344170m) {
            final int i37 = 6;
            this.f343356l.c(6, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i37) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i342 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i352 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i362 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i372 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i38 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (a0(b0Var2) != a0(b0Var)) {
            final int i38 = 7;
            this.f343356l.c(7, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i38) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i342 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i352 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i362 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i372 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i382 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (!b0Var2.f344171n.equals(b0Var.f344171n)) {
            final int i39 = 8;
            this.f343356l.c(12, new C36604u.a() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj9) {
                    b0 b0Var4 = b0Var;
                    d0.g gVar = (d0.g) obj9;
                    switch (i39) {
                        case 0:
                            int i292 = C.f343308n0;
                            gVar.onPlayerErrorChanged(b0Var4.f344163f);
                            break;
                        case 1:
                            int i322 = C.f343308n0;
                            gVar.onPlayerError(b0Var4.f344163f);
                            break;
                        case 2:
                            int i332 = C.f343308n0;
                            gVar.onTracksChanged(b0Var4.f344166i.f347339d);
                            break;
                        case 3:
                            int i342 = C.f343308n0;
                            gVar.onLoadingChanged(b0Var4.f344164g);
                            gVar.onIsLoadingChanged(b0Var4.f344164g);
                            break;
                        case 4:
                            int i352 = C.f343308n0;
                            gVar.onPlayerStateChanged(b0Var4.f344169l, b0Var4.f344162e);
                            break;
                        case 5:
                            int i362 = C.f343308n0;
                            gVar.onPlaybackStateChanged(b0Var4.f344162e);
                            break;
                        case 6:
                            int i372 = C.f343308n0;
                            gVar.onPlaybackSuppressionReasonChanged(b0Var4.f344170m);
                            break;
                        case 7:
                            gVar.onIsPlayingChanged(C.a0(b0Var4));
                            break;
                        default:
                            int i382 = C.f343308n0;
                            gVar.onPlaybackParametersChanged(b0Var4.f344171n);
                            break;
                    }
                }
            });
        }
        if (z12) {
            this.f343356l.c(-1, new C36607v(2));
        }
        k0();
        this.f343356l.b();
        if (b0Var2.f344172o != b0Var.f344172o) {
            Iterator<InterfaceC36534o.b> it = this.f343358m.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        if (b0Var2.f344173p != b0Var.f344173p) {
            Iterator<InterfaceC36534o.b> it2 = this.f343358m.iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final d0.c n() {
        o0();
        return this.f343323O;
    }

    public final void n0() {
        int playbackState = getPlaybackState();
        v0 v0Var = this.f343312D;
        u0 u0Var = this.f343311C;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                o0();
                boolean z12 = this.f343355k0.f344173p;
                getPlayWhenReady();
                u0Var.getClass();
                getPlayWhenReady();
                v0Var.getClass();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        u0Var.getClass();
        v0Var.getClass();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean o() {
        o0();
        return this.f343315G;
    }

    public final void o0() {
        this.f343340d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f343365s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i12 = com.google.android.exoplayer2.util.U.f348106a;
            Locale locale = Locale.US;
            String strA = androidx.camera.core.Q.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f343345f0) {
                throw new IllegalStateException(strA);
            }
            C36605v.a(strA, this.f343347g0 ? null : new IllegalStateException());
            this.f343347g0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final P p() {
        o0();
        return this.f343324P;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void prepare() {
        o0();
        boolean playWhenReady = getPlayWhenReady();
        int iC2 = this.f343309A.c(2, playWhenReady);
        l0(iC2, (!playWhenReady || iC2 == 1) ? 1 : 2, playWhenReady);
        b0 b0Var = this.f343355k0;
        if (b0Var.f344162e != 1) {
            return;
        }
        b0 b0VarE = b0Var.e(null);
        b0 b0VarG = b0VarE.g(b0VarE.f344158a.p() ? 4 : 2);
        this.f343316H++;
        this.f343354k.f343416i.h(0).a();
        m0(b0VarG, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.d0
    public final long q() {
        o0();
        return this.f343367u;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void release() {
        boolean z12;
        AudioTrack audioTrack;
        int i12 = 0;
        Integer.toHexString(System.identityHashCode(this));
        int i13 = com.google.android.exoplayer2.util.U.f348106a;
        HashSet<String> hashSet = H.f343454a;
        synchronized (H.class) {
        }
        o0();
        if (com.google.android.exoplayer2.util.U.f348106a < 21 && (audioTrack = this.f343325Q) != null) {
            audioTrack.release();
            this.f343325Q = null;
        }
        this.f343372z.a();
        p0 p0Var = this.f343310B;
        p0.c cVar = p0Var.f345856e;
        if (cVar != null) {
            try {
                p0Var.f345852a.unregisterReceiver(cVar);
            } catch (RuntimeException e12) {
                C36605v.a("Error unregistering stream volume receiver", e12);
            }
            p0Var.f345856e = null;
        }
        this.f343311C.getClass();
        this.f343312D.getClass();
        C36509d c36509d = this.f343309A;
        c36509d.f344185c = null;
        c36509d.a();
        G g12 = this.f343354k;
        synchronized (g12) {
            if (g12.f343392A || !g12.f343417j.isAlive()) {
                z12 = true;
            } else {
                g12.f343416i.f(7);
                g12.h0(new E(g12, i12), g12.f343430w);
                z12 = g12.f343392A;
            }
        }
        if (!z12) {
            this.f343356l.f(10, new C36607v(i12));
        }
        this.f343356l.d();
        this.f343350i.a();
        this.f343366t.g(this.f343364r);
        b0 b0VarG = this.f343355k0.g(1);
        this.f343355k0 = b0VarG;
        b0 b0VarA = b0VarG.a(b0VarG.f344159b);
        this.f343355k0 = b0VarA;
        b0VarA.f344174q = b0VarA.f344176s;
        this.f343355k0.f344175r = 0L;
        this.f343364r.release();
        this.f343348h.c();
        e0();
        Surface surface = this.f343327S;
        if (surface != null) {
            surface.release();
            this.f343327S = null;
        }
        this.f343343e0 = com.google.android.exoplayer2.text.d.f346846c;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void s(d0.g gVar) {
        gVar.getClass();
        this.f343356l.e(gVar);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setPlayWhenReady(boolean z12) {
        o0();
        int iC2 = this.f343309A.c(getPlaybackState(), z12);
        int i12 = 1;
        if (z12 && iC2 != 1) {
            i12 = 2;
        }
        l0(iC2, i12, z12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setRepeatMode(final int i12) {
        o0();
        if (this.f343314F != i12) {
            this.f343314F = i12;
            this.f343354k.f343416i.c(11, i12, 0).a();
            C36604u.a<d0.g> aVar = new C36604u.a() { // from class: com.google.android.exoplayer2.w
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj) {
                    int i13 = C.f343308n0;
                    ((d0.g) obj).onRepeatModeChanged(i12);
                }
            };
            C36604u<d0.g> c36604u = this.f343356l;
            c36604u.c(8, aVar);
            k0();
            c36604u.b();
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVideoTextureView(@j.P TextureView textureView) {
        o0();
        if (textureView == null) {
            M();
            return;
        }
        e0();
        this.f343331W = textureView;
        textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this.f343370x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            i0(null);
            d0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            i0(surface);
            this.f343327S = surface;
            d0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVolume(float f12) {
        o0();
        final float fJ2 = com.google.android.exoplayer2.util.U.j(f12, 0.0f, 1.0f);
        if (this.f343339c0 == fJ2) {
            return;
        }
        this.f343339c0 = fJ2;
        f0(1, 2, Float.valueOf(this.f343309A.f344188f * fJ2));
        this.f343356l.f(22, new C36604u.a() { // from class: com.google.android.exoplayer2.z
            @Override // com.google.android.exoplayer2.util.C36604u.a
            public final void invoke(Object obj) {
                int i12 = C.f343308n0;
                ((d0.g) obj).onVolumeChanged(fJ2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.d0
    public final void t(@j.P SurfaceView surfaceView) {
        o0();
        if (surfaceView instanceof com.google.android.exoplayer2.video.i) {
            e0();
            i0(surfaceView);
            h0(surfaceView.getHolder());
            return;
        }
        boolean z12 = surfaceView instanceof com.google.android.exoplayer2.video.spherical.k;
        c cVar = this.f343370x;
        if (z12) {
            e0();
            this.f343329U = (com.google.android.exoplayer2.video.spherical.k) surfaceView;
            e0 e0VarW = W(this.f343371y);
            C36585a.d(!e0VarW.f344369g);
            e0VarW.f344366d = 10000;
            com.google.android.exoplayer2.video.spherical.k kVar = this.f343329U;
            C36585a.d(true ^ e0VarW.f344369g);
            e0VarW.f344367e = kVar;
            e0VarW.c();
            this.f343329U.f348381b.add(cVar);
            i0(this.f343329U.getVideoSurface());
            h0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o0();
        if (holder == null) {
            M();
            return;
        }
        e0();
        this.f343330V = true;
        this.f343328T = holder;
        holder.addCallback(cVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            i0(null);
            d0(0, 0);
        } else {
            i0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            d0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.d0
    public final void v(@j.P TextureView textureView) {
        o0();
        if (textureView == null || textureView != this.f343331W) {
            return;
        }
        M();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void w(com.google.android.exoplayer2.trackselection.r rVar) {
        o0();
        com.google.android.exoplayer2.trackselection.t tVar = this.f343348h;
        tVar.getClass();
        if (!(tVar instanceof com.google.android.exoplayer2.trackselection.g) || rVar.equals(tVar.a())) {
            return;
        }
        tVar.f(rVar);
        this.f343356l.f(19, new C36561t(rVar, 1));
    }

    @Override // com.google.android.exoplayer2.d0
    public final void x() {
        o0();
        o0();
        this.f343309A.c(1, getPlayWhenReady());
        j0(null);
        this.f343343e0 = com.google.android.exoplayer2.text.d.f346846c;
    }

    @Override // com.google.android.exoplayer2.InterfaceC36534o
    public final void y(com.google.android.exoplayer2.analytics.b bVar) {
        bVar.getClass();
        this.f343364r.XL(bVar);
    }

    /* compiled from: ExoPlayerImpl.java */
    public final class c implements com.google.android.exoplayer2.video.n, com.google.android.exoplayer2.audio.i, com.google.android.exoplayer2.text.n, com.google.android.exoplayer2.metadata.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, k.b, C36509d.c, C36507b.InterfaceC10572b, p0.b, InterfaceC36534o.b {
        public c(a aVar) {
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void E2(long j12, long j13, String str) {
            C.this.f343364r.E2(j12, j13, str);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void F2(int i12, long j12, long j13) {
            C.this.f343364r.F2(i12, j12, j13);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void I2(String str) {
            C.this.f343364r.I2(str);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void L2(String str) {
            C.this.f343364r.L2(str);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void M7(I i12, @j.P com.google.android.exoplayer2.decoder.h hVar) {
            C c12 = C.this;
            c12.getClass();
            c12.f343364r.M7(i12, hVar);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void R2(int i12, long j12) {
            C.this.f343364r.R2(i12, j12);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void Yc(I i12, @j.P com.google.android.exoplayer2.decoder.h hVar) {
            C c12 = C.this;
            c12.getClass();
            c12.f343364r.Yc(i12, hVar);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void Yd(com.google.android.exoplayer2.decoder.f fVar) {
            C c12 = C.this;
            c12.getClass();
            c12.f343364r.Yd(fVar);
        }

        @Override // com.google.android.exoplayer2.p0.b
        public final void a(final int i12, final boolean z12) {
            C.this.f343356l.f(30, new C36604u.a() { // from class: com.google.android.exoplayer2.D
                @Override // com.google.android.exoplayer2.util.C36604u.a
                public final void invoke(Object obj) {
                    ((d0.g) obj).onDeviceVolumeChanged(i12, z12);
                }
            });
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void a2(long j12, Object obj) {
            C c12 = C.this;
            c12.f343364r.a2(j12, obj);
            if (c12.f343326R == obj) {
                c12.f343356l.f(26, new C36607v(3));
            }
        }

        @Override // com.google.android.exoplayer2.p0.b
        public final void b() {
            C c12 = C.this;
            C36533n c36533nV = C.V(c12.f343310B);
            if (c36533nV.equals(c12.f343349h0)) {
                return;
            }
            c12.f343349h0 = c36533nV;
            c12.f343356l.f(29, new C36561t(c36533nV, 6));
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void b1(Exception exc) {
            C.this.f343364r.b1(exc);
        }

        @Override // com.google.android.exoplayer2.InterfaceC36534o.b
        public final void c() {
            int i12 = C.f343308n0;
            C.this.n0();
        }

        @Override // com.google.android.exoplayer2.C36509d.c
        public final void d() {
            int i12 = C.f343308n0;
            C c12 = C.this;
            c12.f0(1, 2, Float.valueOf(c12.f343339c0 * c12.f343309A.f344188f));
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void d2(long j12, long j13, String str) {
            C.this.f343364r.d2(j12, j13, str);
        }

        @Override // com.google.android.exoplayer2.C36507b.InterfaceC10572b
        public final void e() {
            int i12 = C.f343308n0;
            C.this.l0(-1, 3, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.k.b
        public final void f(Surface surface) {
            int i12 = C.f343308n0;
            C.this.i0(surface);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void f3(long j12) {
            C.this.f343364r.f3(j12);
        }

        @Override // com.google.android.exoplayer2.video.spherical.k.b
        public final void g() {
            int i12 = C.f343308n0;
            C.this.i0(null);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void g2(int i12, long j12) {
            C.this.f343364r.g2(i12, j12);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void g3(Exception exc) {
            C.this.f343364r.g3(exc);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void g9(com.google.android.exoplayer2.decoder.f fVar) {
            C.this.f343364r.g9(fVar);
        }

        @Override // com.google.android.exoplayer2.C36509d.c
        public final void h(int i12) {
            C c12 = C.this;
            boolean playWhenReady = c12.getPlayWhenReady();
            int i13 = 1;
            if (playWhenReady && i12 != 1) {
                i13 = 2;
            }
            c12.l0(i12, i13, playWhenReady);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void l2(Exception exc) {
            C.this.f343364r.l2(exc);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void md(com.google.android.exoplayer2.decoder.f fVar) {
            C.this.f343364r.md(fVar);
        }

        @Override // com.google.android.exoplayer2.text.n
        public final void onCues(com.google.android.exoplayer2.text.d dVar) {
            C c12 = C.this;
            c12.f343343e0 = dVar;
            c12.f343356l.f(27, new C36561t(dVar, 4));
        }

        @Override // com.google.android.exoplayer2.metadata.d
        public final void onMetadata(Metadata metadata) {
            C c12 = C.this;
            P p12 = c12.f343353j0;
            p12.getClass();
            P.b bVar = new P.b(p12, null);
            int i12 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f345623b;
                if (i12 >= entryArr.length) {
                    break;
                }
                entryArr[i12].f4(bVar);
                i12++;
            }
            c12.f343353j0 = new P(bVar, null);
            P pU2 = c12.U();
            boolean zEquals = pU2.equals(c12.f343324P);
            C36604u<d0.g> c36604u = c12.f343356l;
            if (!zEquals) {
                c12.f343324P = pU2;
                c36604u.c(14, new C36561t(this, 2));
            }
            c36604u.c(28, new C36561t(metadata, 5));
            c36604u.b();
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            C c12 = C.this;
            if (c12.f343341d0 == z12) {
                return;
            }
            c12.f343341d0 = z12;
            c12.f343356l.f(23, new r(z12, 1));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
            int i14 = C.f343308n0;
            C c12 = C.this;
            c12.getClass();
            Surface surface = new Surface(surfaceTexture);
            c12.i0(surface);
            c12.f343327S = surface;
            c12.d0(i12, i13);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i12 = C.f343308n0;
            C c12 = C.this;
            c12.i0(null);
            c12.d0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
            int i14 = C.f343308n0;
            C.this.d0(i12, i13);
        }

        @Override // com.google.android.exoplayer2.video.n
        public final void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
            C c12 = C.this;
            c12.f343351i0 = oVar;
            c12.f343356l.f(25, new C36561t(oVar, 7));
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            int i15 = C.f343308n0;
            C.this.d0(i13, i14);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C c12 = C.this;
            if (c12.f343330V) {
                c12.i0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C c12 = C.this;
            if (c12.f343330V) {
                c12.i0(null);
            }
            c12.d0(0, 0);
        }

        @Override // com.google.android.exoplayer2.audio.i
        public final void u8(com.google.android.exoplayer2.decoder.f fVar) {
            C c12 = C.this;
            c12.getClass();
            c12.f343364r.u8(fVar);
        }

        @Override // com.google.android.exoplayer2.text.n
        public final void onCues(List<com.google.android.exoplayer2.text.a> list) {
            C.this.f343356l.f(27, new C36561t(list, 3));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    @Override // com.google.android.exoplayer2.d0
    @j.P
    public final ExoPlaybackException a() {
        o0();
        return this.f343355k0.f344163f;
    }
}
