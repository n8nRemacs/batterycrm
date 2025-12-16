package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.AbstractC23093g;
import androidx.media3.common.B;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.C23107s;
import androidx.media3.common.C23108t;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.common.util.InterfaceC23123n;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.C23133b;
import androidx.media3.exoplayer.C23135d;
import androidx.media3.exoplayer.E;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.Y;
import androidx.media3.exoplayer.j0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.S;
import androidx.media3.exoplayer.video.spherical.i;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42164u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes.dex */
final class A extends AbstractC23093g implements InterfaceC23144m, InterfaceC23144m.a, InterfaceC23144m.f, InterfaceC23144m.e, InterfaceC23144m.d {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f48357h0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final k0 f48358A;

    /* renamed from: B, reason: collision with root package name */
    public final l0 f48359B;

    /* renamed from: C, reason: collision with root package name */
    public final long f48360C;

    /* renamed from: D, reason: collision with root package name */
    public int f48361D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f48362E;

    /* renamed from: F, reason: collision with root package name */
    public int f48363F;

    /* renamed from: G, reason: collision with root package name */
    public int f48364G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f48365H;

    /* renamed from: I, reason: collision with root package name */
    public int f48366I;

    /* renamed from: J, reason: collision with root package name */
    public androidx.media3.exoplayer.source.S f48367J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f48368K;

    /* renamed from: L, reason: collision with root package name */
    public H.c f48369L;

    /* renamed from: M, reason: collision with root package name */
    public androidx.media3.common.B f48370M;

    /* renamed from: N, reason: collision with root package name */
    public androidx.media3.common.B f48371N;

    /* renamed from: O, reason: collision with root package name */
    @j.P
    public AudioTrack f48372O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    public Surface f48373P;

    /* renamed from: Q, reason: collision with root package name */
    @j.P
    public Surface f48374Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f48375R;

    /* renamed from: S, reason: collision with root package name */
    public androidx.media3.common.util.C f48376S;

    /* renamed from: T, reason: collision with root package name */
    public final int f48377T;

    /* renamed from: U, reason: collision with root package name */
    public C23091e f48378U;

    /* renamed from: V, reason: collision with root package name */
    public float f48379V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f48380W;

    /* renamed from: X, reason: collision with root package name */
    public androidx.media3.common.text.b f48381X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f48382Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f48383Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f48384a0;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.s f48385b;

    /* renamed from: b0, reason: collision with root package name */
    public final C23104o f48386b0;

    /* renamed from: c, reason: collision with root package name */
    public final H.c f48387c;

    /* renamed from: c0, reason: collision with root package name */
    public androidx.media3.common.X f48388c0;

    /* renamed from: d, reason: collision with root package name */
    public final C23118i f48389d = new C23118i();

    /* renamed from: d0, reason: collision with root package name */
    public androidx.media3.common.B f48390d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f48391e;

    /* renamed from: e0, reason: collision with root package name */
    public X f48392e0;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.H f48393f;

    /* renamed from: f0, reason: collision with root package name */
    public int f48394f0;

    /* renamed from: g, reason: collision with root package name */
    public final c0[] f48395g;

    /* renamed from: g0, reason: collision with root package name */
    public long f48396g0;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.r f48397h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC23123n f48398i;

    /* renamed from: j, reason: collision with root package name */
    public final C23177v f48399j;

    /* renamed from: k, reason: collision with root package name */
    public final E f48400k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.util.r<H.g> f48401l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC23144m.b> f48402m;

    /* renamed from: n, reason: collision with root package name */
    public final P.b f48403n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f48404o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f48405p;

    /* renamed from: q, reason: collision with root package name */
    public final A.a f48406q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.media3.exoplayer.analytics.a f48407r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f48408s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.d f48409t;

    /* renamed from: u, reason: collision with root package name */
    public final long f48410u;

    /* renamed from: v, reason: collision with root package name */
    public final long f48411v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.media3.common.util.D f48412w;

    /* renamed from: x, reason: collision with root package name */
    public final d f48413x;

    /* renamed from: y, reason: collision with root package name */
    public final C23133b f48414y;

    /* renamed from: z, reason: collision with root package name */
    public final C23135d f48415z;

    /* compiled from: ExoPlayerImpl.java */
    @j.X
    public static final class b {
        @InterfaceC42164u
        public static androidx.media3.exoplayer.analytics.w a(Context context, A a12, boolean z12) {
            MediaMetricsManager mediaMetricsManagerA = androidx.credentials.provider.r.a(context.getSystemService("media_metrics"));
            androidx.media3.exoplayer.analytics.s sVar = mediaMetricsManagerA == null ? null : new androidx.media3.exoplayer.analytics.s(context, mediaMetricsManagerA.createPlaybackSession());
            if (sVar == null) {
                androidx.media3.common.util.s.g();
                return new androidx.media3.exoplayer.analytics.w(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z12) {
                a12.getClass();
                a12.f48407r.Ac(sVar);
            }
            return new androidx.media3.exoplayer.analytics.w(sVar.f48721c.getSessionId());
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public static final class d implements androidx.media3.exoplayer.video.g, androidx.media3.exoplayer.video.spherical.a, Y.b {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public androidx.media3.exoplayer.video.g f48417b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public androidx.media3.exoplayer.video.spherical.a f48418c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public androidx.media3.exoplayer.video.g f48419d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public androidx.media3.exoplayer.video.spherical.a f48420e;

        public d() {
        }

        @Override // androidx.media3.exoplayer.Y.b
        public final void b(int i12, @j.P Object obj) {
            if (i12 == 7) {
                this.f48417b = (androidx.media3.exoplayer.video.g) obj;
                return;
            }
            if (i12 == 8) {
                this.f48418c = (androidx.media3.exoplayer.video.spherical.a) obj;
                return;
            }
            if (i12 != 10000) {
                return;
            }
            androidx.media3.exoplayer.video.spherical.i iVar = (androidx.media3.exoplayer.video.spherical.i) obj;
            if (iVar == null) {
                this.f48419d = null;
                this.f48420e = null;
            } else {
                this.f48419d = iVar.getVideoFrameMetadataListener();
                this.f48420e = iVar.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.a
        public final void c() {
            androidx.media3.exoplayer.video.spherical.a aVar = this.f48420e;
            if (aVar != null) {
                aVar.c();
            }
            androidx.media3.exoplayer.video.spherical.a aVar2 = this.f48418c;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.a
        public final void d(long j12, float[] fArr) {
            androidx.media3.exoplayer.video.spherical.a aVar = this.f48420e;
            if (aVar != null) {
                aVar.d(j12, fArr);
            }
            androidx.media3.exoplayer.video.spherical.a aVar2 = this.f48418c;
            if (aVar2 != null) {
                aVar2.d(j12, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void e(long j12, long j13, C23108t c23108t, @j.P MediaFormat mediaFormat) {
            androidx.media3.exoplayer.video.g gVar = this.f48419d;
            if (gVar != null) {
                gVar.e(j12, j13, c23108t, mediaFormat);
            }
            androidx.media3.exoplayer.video.g gVar2 = this.f48417b;
            if (gVar2 != null) {
                gVar2.e(j12, j13, c23108t, mediaFormat);
            }
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    public static final class e implements N {

        /* renamed from: a, reason: collision with root package name */
        public final Object f48421a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.media3.common.P f48422b;

        public e(Object obj, androidx.media3.common.P p12) {
            this.f48421a = obj;
            this.f48422b = p12;
        }

        @Override // androidx.media3.exoplayer.N
        public final Object c() {
            return this.f48421a;
        }

        @Override // androidx.media3.exoplayer.N
        public final androidx.media3.common.P d() {
            return this.f48422b;
        }
    }

    static {
        androidx.media3.common.A.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public A(InterfaceC23144m.c cVar) {
        C23091e c23091e;
        int i12 = 2;
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i13 = androidx.media3.common.util.M.f47887a;
            androidx.media3.common.util.s.f();
            Context context = cVar.f49222a;
            Context applicationContext = context.getApplicationContext();
            this.f48391e = applicationContext;
            C23179x c23179x = cVar.f49229h;
            androidx.media3.common.util.D d12 = cVar.f49223b;
            c23179x.getClass();
            androidx.media3.exoplayer.analytics.p pVar = new androidx.media3.exoplayer.analytics.p(d12);
            this.f48407r = pVar;
            this.f48378U = cVar.f49231j;
            this.f48375R = cVar.f49234m;
            this.f48380W = false;
            this.f48360C = cVar.f49241t;
            c cVar2 = new c(null);
            this.f48413x = new d();
            Handler handler = new Handler(cVar.f49230i);
            c0[] c0VarArrA = cVar.f49224c.get().a(handler, cVar2, cVar2, cVar2, cVar2);
            this.f48395g = c0VarArrA;
            C23110a.g(c0VarArrA.length > 0);
            androidx.media3.exoplayer.trackselection.r rVar = (androidx.media3.exoplayer.trackselection.r) cVar.f49226e.get();
            this.f48397h = rVar;
            this.f48406q = cVar.f49225d.get();
            androidx.media3.exoplayer.upstream.d dVar = (androidx.media3.exoplayer.upstream.d) cVar.f49228g.get();
            this.f48409t = dVar;
            this.f48405p = cVar.f49235n;
            g0 g0Var = cVar.f49236o;
            this.f48410u = cVar.f49237p;
            this.f48411v = cVar.f49238q;
            this.f48368K = false;
            Looper looper = cVar.f49230i;
            this.f48408s = looper;
            this.f48412w = d12;
            this.f48393f = this;
            this.f48401l = new androidx.media3.common.util.r<>(looper, d12, new C23177v(this, i12));
            CopyOnWriteArraySet<InterfaceC23144m.b> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.f48402m = copyOnWriteArraySet;
            this.f48404o = new ArrayList();
            this.f48367J = new S.a();
            androidx.media3.exoplayer.trackselection.s sVar = new androidx.media3.exoplayer.trackselection.s(new e0[c0VarArrA.length], new androidx.media3.exoplayer.trackselection.k[c0VarArrA.length], androidx.media3.common.V.f47535c, null);
            this.f48385b = sVar;
            this.f48403n = new P.b();
            H.c.a aVar = new H.c.a();
            aVar.f47244a.b(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            aVar.b(29, rVar instanceof androidx.media3.exoplayer.trackselection.g);
            aVar.b(23, false);
            aVar.b(25, false);
            aVar.b(33, false);
            aVar.b(26, false);
            aVar.b(34, false);
            H.c cVarC = aVar.c();
            this.f48387c = cVarC;
            H.c.a aVar2 = new H.c.a();
            C23107s.b bVar = aVar2.f47244a;
            C23107s c23107s = cVarC.f47242b;
            bVar.getClass();
            for (int i14 = 0; i14 < c23107s.f47700a.size(); i14++) {
                bVar.a(c23107s.b(i14));
            }
            bVar.a(4);
            bVar.a(10);
            this.f48369L = aVar2.c();
            this.f48398i = d12.b(looper, null);
            C23177v c23177v = new C23177v(this, 3);
            this.f48399j = c23177v;
            this.f48392e0 = X.i(sVar);
            pVar.zc(this, looper);
            int i15 = androidx.media3.common.util.M.f47887a;
            androidx.media3.exoplayer.analytics.w wVar = i15 < 31 ? new androidx.media3.exoplayer.analytics.w() : b.a(applicationContext, this, cVar.f49242u);
            cVar.f49227f.getClass();
            this.f48400k = new E(c0VarArrA, rVar, sVar, new C23141j(), dVar, this.f48361D, this.f48362E, pVar, g0Var, cVar.f49239r, cVar.f49240s, this.f48368K, looper, d12, c23177v, wVar);
            this.f48379V = 1.0f;
            this.f48361D = 0;
            androidx.media3.common.B b12 = androidx.media3.common.B.f47110J;
            this.f48370M = b12;
            this.f48371N = b12;
            this.f48390d0 = b12;
            int iGenerateAudioSessionId = -1;
            this.f48394f0 = -1;
            if (i15 < 21) {
                AudioTrack audioTrack = this.f48372O;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    c23091e = null;
                } else {
                    this.f48372O.release();
                    c23091e = null;
                    this.f48372O = null;
                }
                if (this.f48372O == null) {
                    this.f48372O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f48377T = this.f48372O.getAudioSessionId();
            } else {
                c23091e = null;
                AudioManager audioManager = (AudioManager) this.f48391e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f48377T = iGenerateAudioSessionId;
            }
            this.f48381X = androidx.media3.common.text.b.f47856d;
            this.f48382Y = true;
            this.f48401l.a(pVar);
            dVar.b(new Handler(looper), pVar);
            copyOnWriteArraySet.add(cVar2);
            C23133b c23133b = new C23133b(context, handler, cVar2);
            this.f48414y = c23133b;
            c23133b.a(cVar.f49233l);
            C23135d c23135d = new C23135d(context, handler, cVar2);
            this.f48415z = c23135d;
            c23135d.b(cVar.f49232k ? this.f48378U : c23091e);
            k0 k0Var = new k0();
            this.f48358A = k0Var;
            l0 l0Var = new l0();
            this.f48359B = l0Var;
            C23104o.b bVar2 = new C23104o.b(0);
            bVar2.f47697b = 0;
            bVar2.f47698c = 0;
            this.f48386b0 = bVar2.a();
            this.f48388c0 = androidx.media3.common.X.f47549f;
            this.f48376S = androidx.media3.common.util.C.f47872c;
            this.f48397h.g(this.f48378U);
            q0(1, 10, Integer.valueOf(this.f48377T));
            q0(2, 10, Integer.valueOf(this.f48377T));
            q0(1, 3, this.f48378U);
            q0(2, 4, Integer.valueOf(this.f48375R));
            q0(2, 5, 0);
            q0(1, 9, Boolean.valueOf(this.f48380W));
            q0(2, 7, this.f48413x);
            q0(6, 8, this.f48413x);
            this.f48389d.d();
        } catch (Throwable th2) {
            this.f48389d.d();
            throw th2;
        }
    }

    public static long l0(X x12) {
        P.d dVar = new P.d();
        P.b bVar = new P.b();
        x12.f48593a.o(x12.f48594b.f47212a, bVar);
        long j12 = x12.f48595c;
        if (j12 != -9223372036854775807L) {
            return bVar.f47383f + j12;
        }
        return x12.f48593a.u(bVar.f47381d, dVar, 0L).f47419n;
    }

    @Override // androidx.media3.common.H
    public final boolean A() {
        y0();
        return false;
    }

    @Override // androidx.media3.common.H
    public final void E(H.g gVar) {
        y0();
        gVar.getClass();
        this.f48401l.e(gVar);
    }

    @Override // androidx.media3.common.H
    public final void F(H.g gVar) {
        gVar.getClass();
        this.f48401l.a(gVar);
    }

    @Override // androidx.media3.common.H
    public final Looper G() {
        return this.f48408s;
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void H(int i12) {
        y0();
    }

    @Override // androidx.media3.common.H
    public final void I(@j.P Surface surface) {
        y0();
        s0(surface);
        int i12 = surface == null ? 0 : -1;
        o0(i12, i12);
    }

    @Override // androidx.media3.exoplayer.InterfaceC23144m
    public final void J() {
        y0();
        if (this.f48368K) {
            return;
        }
        this.f48368K = true;
        this.f48400k.f48450i.c(23, 1, 0).a();
    }

    @Override // androidx.media3.common.H
    public final void K(androidx.media3.common.B b12) {
        y0();
        b12.getClass();
        if (b12.equals(this.f48371N)) {
            return;
        }
        this.f48371N = b12;
        this.f48401l.f(15, new C23177v(this, 0));
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void L(boolean z12) {
        y0();
    }

    @Override // androidx.media3.common.H
    public final void M(List<androidx.media3.common.z> list, int i12, long j12) {
        y0();
        ArrayList arrayListF0 = f0(list);
        y0();
        r0(arrayListF0, i12, j12, false);
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void N() {
        y0();
    }

    @Override // androidx.media3.common.H
    public final void O(int i12, int i13, List<androidx.media3.common.z> list) {
        y0();
        C23110a.b(i12 >= 0 && i13 >= i12);
        ArrayList arrayList = this.f48404o;
        int size = arrayList.size();
        if (i12 > size) {
            return;
        }
        int iMin = Math.min(i13, size);
        ArrayList arrayListF0 = f0(list);
        if (!arrayList.isEmpty()) {
            X xP02 = p0(d0(this.f48392e0, iMin, arrayListF0), i12, iMin);
            w0(xP02, 0, 1, !xP02.f48594b.f47212a.equals(this.f48392e0.f48594b.f47212a), 4, i0(xP02), -1, false);
        } else {
            boolean z12 = this.f48394f0 == -1;
            y0();
            r0(arrayListF0, -1, -9223372036854775807L, z12);
        }
    }

    @Override // androidx.media3.common.H
    public final void P(int i12) {
        y0();
    }

    @Override // androidx.media3.common.H
    public final C23091e Q() {
        y0();
        return this.f48378U;
    }

    @Override // androidx.media3.common.H
    public final void R(int i12, int i13) {
        y0();
    }

    @Override // androidx.media3.common.H
    public final void T(int i12, List<androidx.media3.common.z> list) {
        y0();
        ArrayList arrayListF0 = f0(list);
        y0();
        C23110a.b(i12 >= 0);
        ArrayList arrayList = this.f48404o;
        int iMin = Math.min(i12, arrayList.size());
        if (!arrayList.isEmpty()) {
            w0(d0(this.f48392e0, iMin, arrayListF0), 0, 1, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z12 = this.f48394f0 == -1;
        y0();
        r0(arrayListF0, -1, -9223372036854775807L, z12);
    }

    @Override // androidx.media3.common.H
    public final long U() {
        y0();
        if (!isPlayingAd()) {
            return l();
        }
        X x12 = this.f48392e0;
        return x12.f48603k.equals(x12.f48594b) ? androidx.media3.common.util.M.Q(this.f48392e0.f48608p) : getDuration();
    }

    @Override // androidx.media3.common.H
    public final void W(int i12, int i13, int i14) {
        y0();
        C23110a.b(i12 >= 0 && i12 <= i13 && i14 >= 0);
        ArrayList arrayList = this.f48404o;
        int size = arrayList.size();
        int iMin = Math.min(i13, size);
        int iMin2 = Math.min(i14, size - (iMin - i12));
        if (i12 >= size || i12 == iMin || i12 == iMin2) {
            return;
        }
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        this.f48363F++;
        androidx.media3.common.util.M.E(arrayList, i12, iMin, iMin2);
        a0 a0Var = new a0(arrayList, this.f48367J);
        X x12 = this.f48392e0;
        X xM02 = m0(x12, a0Var, k0(currentTimeline, a0Var, j0(x12), h0(this.f48392e0)));
        androidx.media3.exoplayer.source.S s5 = this.f48367J;
        E e12 = this.f48400k;
        e12.getClass();
        e12.f48450i.b(19, new E.b(i12, iMin, iMin2, s5)).a();
        w0(xM02, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.InterfaceC23144m
    public final void X(C23091e c23091e, boolean z12) {
        y0();
        if (this.f48384a0) {
            return;
        }
        boolean zA2 = androidx.media3.common.util.M.a(this.f48378U, c23091e);
        int i12 = 1;
        androidx.media3.common.util.r<H.g> rVar = this.f48401l;
        if (!zA2) {
            this.f48378U = c23091e;
            q0(1, 3, c23091e);
            rVar.c(20, new C23149s(c23091e, 2));
        }
        C23091e c23091e2 = z12 ? c23091e : null;
        C23135d c23135d = this.f48415z;
        c23135d.b(c23091e2);
        this.f48397h.g(c23091e);
        boolean playWhenReady = getPlayWhenReady();
        int iD2 = c23135d.d(getPlaybackState(), playWhenReady);
        if (playWhenReady && iD2 != 1) {
            i12 = 2;
        }
        v0(iD2, i12, playWhenReady);
        rVar.b();
    }

    @Override // androidx.media3.common.AbstractC23093g
    public final void a0(int i12, long j12, boolean z12) {
        y0();
        C23110a.b(i12 >= 0);
        this.f48407r.yc();
        androidx.media3.common.P p12 = this.f48392e0.f48593a;
        if (p12.x() || i12 < p12.w()) {
            this.f48363F++;
            if (isPlayingAd()) {
                androidx.media3.common.util.s.g();
                E.d dVar = new E.d(this.f48392e0);
                dVar.a(1);
                this.f48399j.a(dVar);
                return;
            }
            X xG2 = this.f48392e0;
            int i13 = xG2.f48597e;
            if (i13 == 3 || (i13 == 4 && !p12.x())) {
                xG2 = this.f48392e0.g(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            X xM02 = m0(xG2, p12, n0(p12, i12, j12));
            long jF2 = androidx.media3.common.util.M.F(j12);
            E e12 = this.f48400k;
            e12.getClass();
            e12.f48450i.b(3, new E.g(p12, i12, jF2)).a();
            w0(xM02, 0, 1, true, 1, i0(xM02), currentMediaItemIndex, z12);
        }
    }

    @Override // androidx.media3.common.H
    public final long b() {
        y0();
        return 3000L;
    }

    @Override // androidx.media3.common.H
    public final void c(List list) {
        y0();
        ArrayList arrayListF0 = f0(list);
        y0();
        r0(arrayListF0, -1, -9223372036854775807L, true);
    }

    public final ArrayList c0(int i12, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            U.c cVar = new U.c((androidx.media3.exoplayer.source.A) arrayList.get(i13), this.f48405p);
            arrayList2.add(cVar);
            this.f48404o.add(i13 + i12, new e(cVar.f48584b, cVar.f48583a.f49843p));
        }
        this.f48367J = this.f48367J.g(i12, arrayList2.size());
        return arrayList2;
    }

    @Override // androidx.media3.common.H
    public final void d(androidx.media3.common.G g12) {
        y0();
        if (g12 == null) {
            g12 = androidx.media3.common.G.f47232e;
        }
        if (this.f48392e0.f48606n.equals(g12)) {
            return;
        }
        X xF2 = this.f48392e0.f(g12);
        this.f48363F++;
        this.f48400k.f48450i.b(4, g12).a();
        w0(xF2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final X d0(X x12, int i12, ArrayList arrayList) {
        androidx.media3.common.P p12 = x12.f48593a;
        this.f48363F++;
        ArrayList arrayListC0 = c0(i12, arrayList);
        a0 a0Var = new a0(this.f48404o, this.f48367J);
        X xM02 = m0(x12, a0Var, k0(p12, a0Var, j0(x12), h0(x12)));
        androidx.media3.exoplayer.source.S s5 = this.f48367J;
        E e12 = this.f48400k;
        e12.getClass();
        e12.f48450i.j(new E.a(arrayListC0, s5, -1, -9223372036854775807L, null), 18, i12, 0).a();
        return xM02;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.X e() {
        y0();
        return this.f48388c0;
    }

    public final androidx.media3.common.B e0() {
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            return this.f48390d0;
        }
        androidx.media3.common.z zVar = currentTimeline.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47409d;
        androidx.media3.common.B b12 = this.f48390d0;
        b12.getClass();
        B.b bVar = new B.b(b12, null);
        bVar.c(zVar.f47981e);
        return bVar.a();
    }

    public final ArrayList f0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(this.f48406q.a((androidx.media3.common.z) list.get(i12)));
        }
        return arrayList;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.U g() {
        y0();
        return this.f48397h.b();
    }

    public final Y g0(Y.b bVar) {
        int iJ02 = j0(this.f48392e0);
        androidx.media3.common.P p12 = this.f48392e0.f48593a;
        if (iJ02 == -1) {
            iJ02 = 0;
        }
        E e12 = this.f48400k;
        return new Y(e12, bVar, p12, iJ02, this.f48412w, e12.f48452k);
    }

    @Override // androidx.media3.common.H
    public final long getContentPosition() {
        y0();
        return h0(this.f48392e0);
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdGroupIndex() {
        y0();
        if (isPlayingAd()) {
            return this.f48392e0.f48594b.f47213b;
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdIndexInAdGroup() {
        y0();
        if (isPlayingAd()) {
            return this.f48392e0.f48594b.f47214c;
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentMediaItemIndex() {
        y0();
        int iJ02 = j0(this.f48392e0);
        if (iJ02 == -1) {
            return 0;
        }
        return iJ02;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentPeriodIndex() {
        y0();
        if (this.f48392e0.f48593a.x()) {
            return 0;
        }
        X x12 = this.f48392e0;
        return x12.f48593a.g(x12.f48594b.f47212a);
    }

    @Override // androidx.media3.common.H
    public final long getCurrentPosition() {
        y0();
        return androidx.media3.common.util.M.Q(i0(this.f48392e0));
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.P getCurrentTimeline() {
        y0();
        return this.f48392e0.f48593a;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.V getCurrentTracks() {
        y0();
        return this.f48392e0.f48601i.f50040d;
    }

    @Override // androidx.media3.common.H
    public final C23104o getDeviceInfo() {
        y0();
        return this.f48386b0;
    }

    @Override // androidx.media3.common.H
    public final long getDuration() {
        y0();
        if (!isPlayingAd()) {
            return i();
        }
        X x12 = this.f48392e0;
        A.b bVar = x12.f48594b;
        Object obj = bVar.f47212a;
        androidx.media3.common.P p12 = x12.f48593a;
        P.b bVar2 = this.f48403n;
        p12.o(obj, bVar2);
        return androidx.media3.common.util.M.Q(bVar2.a(bVar.f47213b, bVar.f47214c));
    }

    @Override // androidx.media3.common.H
    public final boolean getPlayWhenReady() {
        y0();
        return this.f48392e0.f48604l;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.G getPlaybackParameters() {
        y0();
        return this.f48392e0.f48606n;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackState() {
        y0();
        return this.f48392e0.f48597e;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackSuppressionReason() {
        y0();
        return this.f48392e0.f48605m;
    }

    @Override // androidx.media3.common.H
    public final int getRepeatMode() {
        y0();
        return this.f48361D;
    }

    @Override // androidx.media3.common.H
    public final long getTotalBufferedDuration() {
        y0();
        return androidx.media3.common.util.M.Q(this.f48392e0.f48609q);
    }

    @Override // androidx.media3.common.H
    public final float getVolume() {
        y0();
        return this.f48379V;
    }

    @Override // androidx.media3.common.H
    public final void h(boolean z12) {
        y0();
        if (this.f48362E != z12) {
            this.f48362E = z12;
            this.f48400k.f48450i.c(12, z12 ? 1 : 0, 0).a();
            C23178w c23178w = new C23178w(z12, 0);
            androidx.media3.common.util.r<H.g> rVar = this.f48401l;
            rVar.c(9, c23178w);
            u0();
            rVar.b();
        }
    }

    public final long h0(X x12) {
        if (!x12.f48594b.a()) {
            return androidx.media3.common.util.M.Q(i0(x12));
        }
        Object obj = x12.f48594b.f47212a;
        androidx.media3.common.P p12 = x12.f48593a;
        P.b bVar = this.f48403n;
        p12.o(obj, bVar);
        long j12 = x12.f48595c;
        return j12 == -9223372036854775807L ? androidx.media3.common.util.M.Q(p12.u(j0(x12), this.f47663a, 0L).f47419n) : androidx.media3.common.util.M.Q(bVar.f47383f) + androidx.media3.common.util.M.Q(j12);
    }

    public final long i0(X x12) {
        if (x12.f48593a.x()) {
            return androidx.media3.common.util.M.F(this.f48396g0);
        }
        long j12 = x12.f48607o ? x12.j() : x12.f48610r;
        if (x12.f48594b.a()) {
            return j12;
        }
        androidx.media3.common.P p12 = x12.f48593a;
        Object obj = x12.f48594b.f47212a;
        P.b bVar = this.f48403n;
        p12.o(obj, bVar);
        return j12 + bVar.f47383f;
    }

    @Override // androidx.media3.common.H
    public final boolean isLoading() {
        y0();
        return this.f48392e0.f48599g;
    }

    @Override // androidx.media3.common.H
    public final boolean isPlayingAd() {
        y0();
        return this.f48392e0.f48594b.a();
    }

    @Override // androidx.media3.common.H
    public final long j() {
        y0();
        return this.f48411v;
    }

    public final int j0(X x12) {
        if (x12.f48593a.x()) {
            return this.f48394f0;
        }
        return x12.f48593a.o(x12.f48594b.f47212a, this.f48403n).f47381d;
    }

    @j.P
    public final Pair<Object, Long> k0(androidx.media3.common.P p12, androidx.media3.common.P p13, int i12, long j12) {
        if (p12.x() || p13.x()) {
            boolean z12 = !p12.x() && p13.x();
            return n0(p13, z12 ? -1 : i12, z12 ? -9223372036854775807L : j12);
        }
        Pair<Object, Long> pairQ = p12.q(this.f47663a, this.f48403n, i12, androidx.media3.common.util.M.F(j12));
        Object obj = pairQ.first;
        if (p13.g(obj) != -1) {
            return pairQ;
        }
        Object objJ = E.J(this.f47663a, this.f48403n, this.f48361D, this.f48362E, obj, p12, p13);
        if (objJ == null) {
            return n0(p13, -1, -9223372036854775807L);
        }
        P.b bVar = this.f48403n;
        p13.o(objJ, bVar);
        int i13 = bVar.f47381d;
        P.d dVar = this.f47663a;
        p13.u(i13, dVar, 0L);
        return n0(p13, i13, androidx.media3.common.util.M.Q(dVar.f47419n));
    }

    @Override // androidx.media3.common.H
    public final long l() {
        y0();
        if (this.f48392e0.f48593a.x()) {
            return this.f48396g0;
        }
        X x12 = this.f48392e0;
        if (x12.f48603k.f47215d != x12.f48594b.f47215d) {
            return androidx.media3.common.util.M.Q(x12.f48593a.u(getCurrentMediaItemIndex(), this.f47663a, 0L).f47420o);
        }
        long j12 = x12.f48608p;
        if (this.f48392e0.f48603k.a()) {
            X x13 = this.f48392e0;
            P.b bVarO = x13.f48593a.o(x13.f48603k.f47212a, this.f48403n);
            long j13 = bVarO.j(this.f48392e0.f48603k.f47213b);
            j12 = j13 == Long.MIN_VALUE ? bVarO.f47382e : j13;
        }
        X x14 = this.f48392e0;
        androidx.media3.common.P p12 = x14.f48593a;
        Object obj = x14.f48603k.f47212a;
        P.b bVar = this.f48403n;
        p12.o(obj, bVar);
        return androidx.media3.common.util.M.Q(j12 + bVar.f47383f);
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.text.b m() {
        y0();
        return this.f48381X;
    }

    public final X m0(X x12, androidx.media3.common.P p12, @j.P Pair<Object, Long> pair) {
        C23110a.b(p12.x() || pair != null);
        androidx.media3.common.P p13 = x12.f48593a;
        long jH02 = h0(x12);
        X xH2 = x12.h(p12);
        if (p12.x()) {
            A.b bVar = X.f48592t;
            long jF2 = androidx.media3.common.util.M.F(this.f48396g0);
            X xB2 = xH2.c(bVar, jF2, jF2, jF2, 0L, androidx.media3.exoplayer.source.Y.f49705e, this.f48385b, AbstractC37401r1.C()).b(bVar);
            xB2.f48608p = xB2.f48610r;
            return xB2;
        }
        Object obj = xH2.f48594b.f47212a;
        int i12 = androidx.media3.common.util.M.f47887a;
        boolean zEquals = obj.equals(pair.first);
        A.b bVar2 = !zEquals ? new A.b(pair.first) : xH2.f48594b;
        long jLongValue = ((Long) pair.second).longValue();
        long jF3 = androidx.media3.common.util.M.F(jH02);
        if (!p13.x()) {
            jF3 -= p13.o(obj, this.f48403n).f47383f;
        }
        if (!zEquals || jLongValue < jF3) {
            C23110a.g(!bVar2.a());
            X xB3 = xH2.c(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? androidx.media3.exoplayer.source.Y.f49705e : xH2.f48600h, !zEquals ? this.f48385b : xH2.f48601i, !zEquals ? AbstractC37401r1.C() : xH2.f48602j).b(bVar2);
            xB3.f48608p = jLongValue;
            return xB3;
        }
        if (jLongValue != jF3) {
            C23110a.g(!bVar2.a());
            long jMax = Math.max(0L, xH2.f48609q - (jLongValue - jF3));
            long j12 = xH2.f48608p;
            if (xH2.f48603k.equals(xH2.f48594b)) {
                j12 = jLongValue + jMax;
            }
            X xC2 = xH2.c(bVar2, jLongValue, jLongValue, jLongValue, jMax, xH2.f48600h, xH2.f48601i, xH2.f48602j);
            xC2.f48608p = j12;
            return xC2;
        }
        int iG2 = p12.g(xH2.f48603k.f47212a);
        if (iG2 != -1 && p12.n(iG2, this.f48403n, false).f47381d == p12.o(bVar2.f47212a, this.f48403n).f47381d) {
            return xH2;
        }
        p12.o(bVar2.f47212a, this.f48403n);
        long jA2 = bVar2.a() ? this.f48403n.a(bVar2.f47213b, bVar2.f47214c) : this.f48403n.f47382e;
        X xB4 = xH2.c(bVar2, xH2.f48610r, xH2.f48610r, xH2.f48596d, jA2 - xH2.f48610r, xH2.f48600h, xH2.f48601i, xH2.f48602j).b(bVar2);
        xB4.f48608p = jA2;
        return xB4;
    }

    @Override // androidx.media3.common.H
    public final H.c n() {
        y0();
        return this.f48369L;
    }

    @j.P
    public final Pair<Object, Long> n0(androidx.media3.common.P p12, int i12, long j12) {
        if (p12.x()) {
            this.f48394f0 = i12;
            if (j12 == -9223372036854775807L) {
                j12 = 0;
            }
            this.f48396g0 = j12;
            return null;
        }
        if (i12 == -1 || i12 >= p12.w()) {
            i12 = p12.b(this.f48362E);
            j12 = androidx.media3.common.util.M.Q(p12.u(i12, this.f47663a, 0L).f47419n);
        }
        return p12.q(this.f47663a, this.f48403n, i12, androidx.media3.common.util.M.F(j12));
    }

    @Override // androidx.media3.common.H
    public final boolean o() {
        y0();
        return this.f48362E;
    }

    public final void o0(final int i12, final int i13) {
        androidx.media3.common.util.C c12 = this.f48376S;
        if (i12 == c12.f47873a && i13 == c12.f47874b) {
            return;
        }
        this.f48376S = new androidx.media3.common.util.C(i12, i13);
        this.f48401l.f(24, new r.a() { // from class: androidx.media3.exoplayer.t
            @Override // androidx.media3.common.util.r.a
            public final void invoke(Object obj) {
                int i14 = A.f48357h0;
                ((H.g) obj).onSurfaceSizeChanged(i12, i13);
            }
        });
        q0(2, 14, new androidx.media3.common.util.C(i12, i13));
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.B p() {
        y0();
        return this.f48370M;
    }

    public final X p0(X x12, int i12, int i13) {
        int iJ02 = j0(x12);
        long jH02 = h0(x12);
        ArrayList arrayList = this.f48404o;
        int size = arrayList.size();
        this.f48363F++;
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            arrayList.remove(i14);
        }
        this.f48367J = this.f48367J.f(i12, i13);
        a0 a0Var = new a0(arrayList, this.f48367J);
        X xM02 = m0(x12, a0Var, k0(x12.f48593a, a0Var, iJ02, jH02));
        int i15 = xM02.f48597e;
        if (i15 != 1 && i15 != 4 && i12 < i13 && i13 == size && iJ02 >= xM02.f48593a.w()) {
            xM02 = xM02.g(4);
        }
        this.f48400k.f48450i.j(this.f48367J, 20, i12, i13).a();
        return xM02;
    }

    @Override // androidx.media3.common.H
    public final void prepare() {
        y0();
        boolean playWhenReady = getPlayWhenReady();
        int iD2 = this.f48415z.d(2, playWhenReady);
        v0(iD2, (!playWhenReady || iD2 == 1) ? 1 : 2, playWhenReady);
        X x12 = this.f48392e0;
        if (x12.f48597e != 1) {
            return;
        }
        X xE2 = x12.e(null);
        X xG2 = xE2.g(xE2.f48593a.x() ? 4 : 2);
        this.f48363F++;
        this.f48400k.f48450i.h(0).a();
        w0(xG2, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.H
    public final long q() {
        y0();
        return this.f48410u;
    }

    public final void q0(int i12, int i13, @j.P Object obj) {
        for (c0 c0Var : this.f48395g) {
            if (c0Var.m() == i12) {
                Y yG02 = g0(c0Var);
                C23110a.g(!yG02.f48618g);
                yG02.f48615d = i13;
                C23110a.g(!yG02.f48618g);
                yG02.f48616e = obj;
                C23110a.g(!yG02.f48618g);
                yG02.f48618g = true;
                yG02.f48613b.b(yG02);
            }
        }
    }

    @Override // androidx.media3.common.H
    public final void r(int i12, boolean z12) {
        y0();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(java.util.ArrayList r19, int r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.A.r0(java.util.ArrayList, int, long, boolean):void");
    }

    @Override // androidx.media3.common.H
    public final void release() {
        boolean z12;
        AudioTrack audioTrack;
        int i12 = 0;
        Integer.toHexString(System.identityHashCode(this));
        int i13 = androidx.media3.common.util.M.f47887a;
        HashSet<String> hashSet = androidx.media3.common.A.f47108a;
        synchronized (androidx.media3.common.A.class) {
            HashSet<String> hashSet2 = androidx.media3.common.A.f47108a;
        }
        androidx.media3.common.util.s.f();
        y0();
        if (androidx.media3.common.util.M.f47887a < 21 && (audioTrack = this.f48372O) != null) {
            audioTrack.release();
            this.f48372O = null;
        }
        this.f48414y.a(false);
        this.f48358A.getClass();
        this.f48359B.getClass();
        C23135d c23135d = this.f48415z;
        c23135d.f49018c = null;
        c23135d.a();
        E e12 = this.f48400k;
        synchronized (e12) {
            if (e12.f48426A || !e12.f48452k.getThread().isAlive()) {
                z12 = true;
            } else {
                e12.f48450i.f(7);
                e12.i0(new C(e12, i12), e12.f48464w);
                z12 = e12.f48426A;
            }
        }
        if (!z12) {
            this.f48401l.f(10, new C23179x(0));
        }
        this.f48401l.d();
        this.f48398i.a();
        this.f48409t.a(this.f48407r);
        X x12 = this.f48392e0;
        if (x12.f48607o) {
            this.f48392e0 = x12.a();
        }
        X xG2 = this.f48392e0.g(1);
        this.f48392e0 = xG2;
        X xB2 = xG2.b(xG2.f48594b);
        this.f48392e0 = xB2;
        xB2.f48608p = xB2.f48610r;
        this.f48392e0.f48609q = 0L;
        this.f48407r.release();
        this.f48397h.e();
        Surface surface = this.f48374Q;
        if (surface != null) {
            surface.release();
            this.f48374Q = null;
        }
        this.f48381X = androidx.media3.common.text.b.f47856d;
        this.f48384a0 = true;
    }

    @Override // androidx.media3.common.H
    public final void s(int i12) {
        y0();
    }

    public final void s0(@j.P Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        for (c0 c0Var : this.f48395g) {
            if (c0Var.m() == 2) {
                Y yG02 = g0(c0Var);
                C23110a.g(!yG02.f48618g);
                yG02.f48615d = 1;
                C23110a.g(!yG02.f48618g);
                yG02.f48616e = surface;
                C23110a.g(!yG02.f48618g);
                yG02.f48618g = true;
                yG02.f48613b.b(yG02);
                arrayList.add(yG02);
            }
        }
        Surface surface2 = this.f48373P;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Y) it.next()).a(this.f48360C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z12 = true;
            }
            Surface surface3 = this.f48373P;
            Surface surface4 = this.f48374Q;
            if (surface3 == surface4) {
                surface4.release();
                this.f48374Q = null;
            }
        }
        this.f48373P = surface;
        if (z12) {
            t0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    @Override // androidx.media3.common.H
    public final void setPlayWhenReady(boolean z12) {
        y0();
        int iD2 = this.f48415z.d(getPlaybackState(), z12);
        int i12 = 1;
        if (z12 && iD2 != 1) {
            i12 = 2;
        }
        v0(iD2, i12, z12);
    }

    @Override // androidx.media3.common.H
    public final void setRepeatMode(final int i12) {
        y0();
        if (this.f48361D != i12) {
            this.f48361D = i12;
            this.f48400k.f48450i.c(11, i12, 0).a();
            r.a<H.g> aVar = new r.a() { // from class: androidx.media3.exoplayer.y
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj) {
                    int i13 = A.f48357h0;
                    ((H.g) obj).onRepeatModeChanged(i12);
                }
            };
            androidx.media3.common.util.r<H.g> rVar = this.f48401l;
            rVar.c(8, aVar);
            u0();
            rVar.b();
        }
    }

    @Override // androidx.media3.common.H
    public final void setVolume(float f12) {
        y0();
        final float fJ2 = androidx.media3.common.util.M.j(f12, 0.0f, 1.0f);
        if (this.f48379V == fJ2) {
            return;
        }
        this.f48379V = fJ2;
        q0(1, 2, Float.valueOf(this.f48415z.f49022g * fJ2));
        this.f48401l.f(22, new r.a() { // from class: androidx.media3.exoplayer.p
            @Override // androidx.media3.common.util.r.a
            public final void invoke(Object obj) {
                int i12 = A.f48357h0;
                ((H.g) obj).onVolumeChanged(fJ2);
            }
        });
    }

    @Override // androidx.media3.common.H
    public final void stop() {
        y0();
        this.f48415z.d(1, getPlayWhenReady());
        t0(null);
        this.f48381X = new androidx.media3.common.text.b(AbstractC37401r1.C(), this.f48392e0.f48610r);
    }

    @Override // androidx.media3.common.H
    public final void t(int i12, int i13) {
        y0();
        C23110a.b(i12 >= 0 && i13 >= i12);
        int size = this.f48404o.size();
        int iMin = Math.min(i13, size);
        if (i12 >= size || i12 == iMin) {
            return;
        }
        X xP02 = p0(this.f48392e0, i12, iMin);
        w0(xP02, 0, 1, !xP02.f48594b.f47212a.equals(this.f48392e0.f48594b.f47212a), 4, i0(xP02), -1, false);
    }

    public final void t0(@j.P ExoPlaybackException exoPlaybackException) {
        X x12 = this.f48392e0;
        X xB2 = x12.b(x12.f48594b);
        xB2.f48608p = xB2.f48610r;
        xB2.f48609q = 0L;
        X xG2 = xB2.g(1);
        if (exoPlaybackException != null) {
            xG2 = xG2.e(exoPlaybackException);
        }
        this.f48363F++;
        this.f48400k.f48450i.h(6).a();
        w0(xG2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void u0() {
        int i12 = 1;
        H.c cVar = this.f48369L;
        int i13 = androidx.media3.common.util.M.f47887a;
        A a12 = (A) this.f48393f;
        boolean zIsPlayingAd = a12.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = a12.isCurrentMediaItemSeekable();
        boolean Z12 = a12.Z();
        boolean zY2 = a12.Y();
        boolean zIsCurrentMediaItemLive = a12.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = a12.isCurrentMediaItemDynamic();
        boolean zX2 = a12.getCurrentTimeline().x();
        H.c.a aVar = new H.c.a();
        C23107s c23107s = this.f48387c.f47242b;
        C23107s.b bVar = aVar.f47244a;
        bVar.getClass();
        boolean z12 = false;
        for (int i14 = 0; i14 < c23107s.f47700a.size(); i14++) {
            bVar.a(c23107s.b(i14));
        }
        boolean z13 = !zIsPlayingAd;
        aVar.b(4, z13);
        aVar.b(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        aVar.b(6, Z12 && !zIsPlayingAd);
        aVar.b(7, !zX2 && (Z12 || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        aVar.b(8, zY2 && !zIsPlayingAd);
        aVar.b(9, !zX2 && (zY2 || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        aVar.b(10, z13);
        aVar.b(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z12 = true;
        }
        aVar.b(12, z12);
        H.c cVarC = aVar.c();
        this.f48369L = cVarC;
        if (cVarC.equals(cVar)) {
            return;
        }
        this.f48401l.c(13, new C23177v(this, i12));
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void v() {
        y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void v0(int i12, int i13, boolean z12) {
        int i14 = 0;
        ?? r15 = (!z12 || i12 == -1) ? 0 : 1;
        if (r15 != 0 && i12 != 1) {
            i14 = 1;
        }
        X x12 = this.f48392e0;
        if (x12.f48604l == r15 && x12.f48605m == i14) {
            return;
        }
        this.f48363F++;
        boolean z13 = x12.f48607o;
        X xA2 = x12;
        if (z13) {
            xA2 = x12.a();
        }
        X xD2 = xA2.d(i14, r15);
        this.f48400k.f48450i.c(1, r15, i14).a();
        w0(xD2, 0, i13, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.H
    public final int w() {
        y0();
        return 0;
    }

    public final void w0(final X x12, final int i12, final int i13, boolean z12, final int i14, long j12, int i15, boolean z13) {
        Pair pair;
        int i16;
        final androidx.media3.common.z zVar;
        boolean z14;
        boolean z15;
        int i17;
        Object obj;
        androidx.media3.common.z zVar2;
        Object obj2;
        int i18;
        long j13;
        long j14;
        long jL02;
        long jL03;
        Object obj3;
        androidx.media3.common.z zVar3;
        Object obj4;
        int i19;
        X x13 = this.f48392e0;
        this.f48392e0 = x12;
        boolean zEquals = x13.f48593a.equals(x12.f48593a);
        androidx.media3.common.P p12 = x13.f48593a;
        androidx.media3.common.P p13 = x12.f48593a;
        if (p13.x() && p12.x()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (p13.x() != p12.x()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            A.b bVar = x13.f48594b;
            Object obj5 = bVar.f47212a;
            P.b bVar2 = this.f48403n;
            int i22 = p12.o(obj5, bVar2).f47381d;
            P.d dVar = this.f47663a;
            Object obj6 = p12.u(i22, dVar, 0L).f47407b;
            A.b bVar3 = x12.f48594b;
            if (obj6.equals(p13.u(p13.o(bVar3.f47212a, bVar2).f47381d, dVar, 0L).f47407b)) {
                pair = (z12 && i14 == 0 && bVar.f47215d < bVar3.f47215d) ? new Pair(Boolean.TRUE, 0) : (z12 && i14 == 1 && z13) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z12 && i14 == 0) {
                    i16 = 1;
                } else if (z12 && i14 == 1) {
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
        androidx.media3.common.B bE02 = this.f48370M;
        if (zBooleanValue) {
            zVar = !x12.f48593a.x() ? x12.f48593a.u(x12.f48593a.o(x12.f48594b.f47212a, this.f48403n).f47381d, this.f47663a, 0L).f47409d : null;
            this.f48390d0 = androidx.media3.common.B.f47110J;
        } else {
            zVar = null;
        }
        if (zBooleanValue || !x13.f48602j.equals(x12.f48602j)) {
            androidx.media3.common.B b12 = this.f48390d0;
            b12.getClass();
            B.b bVar4 = new B.b(b12, null);
            List<Metadata> list = x12.f48602j;
            for (int i23 = 0; i23 < list.size(); i23++) {
                Metadata metadata = list.get(i23);
                int i24 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f47361b;
                    if (i24 < entryArr.length) {
                        entryArr[i24].J5(bVar4);
                        i24++;
                    }
                }
            }
            this.f48390d0 = bVar4.a();
            bE02 = e0();
        }
        boolean zEquals2 = bE02.equals(this.f48370M);
        this.f48370M = bE02;
        boolean z16 = x13.f48604l != x12.f48604l;
        boolean z17 = x13.f48597e != x12.f48597e;
        if (z17 || z16) {
            x0();
        }
        boolean z18 = x13.f48599g != x12.f48599g;
        if (!zEquals) {
            final int i25 = 0;
            this.f48401l.c(0, new r.a() { // from class: androidx.media3.exoplayer.z
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj7) {
                    int i26 = i12;
                    Object obj8 = x12;
                    H.g gVar = (H.g) obj7;
                    switch (i25) {
                        case 0:
                            int i27 = A.f48357h0;
                            gVar.v(((X) obj8).f48593a, i26);
                            break;
                        case 1:
                            int i28 = A.f48357h0;
                            gVar.onPlayWhenReadyChanged(((X) obj8).f48604l, i26);
                            break;
                        default:
                            int i29 = A.f48357h0;
                            gVar.w(i26, (androidx.media3.common.z) obj8);
                            break;
                    }
                }
            });
        }
        if (z12) {
            P.b bVar5 = new P.b();
            if (x13.f48593a.x()) {
                z14 = z17;
                z15 = z18;
                i17 = i15;
                obj = null;
                zVar2 = null;
                obj2 = null;
                i18 = -1;
            } else {
                Object obj7 = x13.f48594b.f47212a;
                x13.f48593a.o(obj7, bVar5);
                int i26 = bVar5.f47381d;
                int iG2 = x13.f48593a.g(obj7);
                z14 = z17;
                z15 = z18;
                obj = x13.f48593a.u(i26, this.f47663a, 0L).f47407b;
                zVar2 = this.f47663a.f47409d;
                i17 = i26;
                i18 = iG2;
                obj2 = obj7;
            }
            if (i14 == 0) {
                if (x13.f48594b.a()) {
                    A.b bVar6 = x13.f48594b;
                    jL02 = bVar5.a(bVar6.f47213b, bVar6.f47214c);
                    jL03 = l0(x13);
                } else if (x13.f48594b.f47216e != -1) {
                    jL02 = l0(this.f48392e0);
                    jL03 = jL02;
                } else {
                    j13 = bVar5.f47383f;
                    j14 = bVar5.f47382e;
                    jL02 = j13 + j14;
                    jL03 = jL02;
                }
            } else if (x13.f48594b.a()) {
                jL02 = x13.f48610r;
                jL03 = l0(x13);
            } else {
                j13 = bVar5.f47383f;
                j14 = x13.f48610r;
                jL02 = j13 + j14;
                jL03 = jL02;
            }
            long jQ2 = androidx.media3.common.util.M.Q(jL02);
            long jQ3 = androidx.media3.common.util.M.Q(jL03);
            A.b bVar7 = x13.f48594b;
            final H.k kVar = new H.k(obj, i17, zVar2, obj2, i18, jQ2, jQ3, bVar7.f47213b, bVar7.f47214c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f48392e0.f48593a.x()) {
                obj3 = null;
                zVar3 = null;
                obj4 = null;
                i19 = -1;
            } else {
                X x14 = this.f48392e0;
                Object obj8 = x14.f48594b.f47212a;
                x14.f48593a.o(obj8, this.f48403n);
                int iG3 = this.f48392e0.f48593a.g(obj8);
                androidx.media3.common.P p14 = this.f48392e0.f48593a;
                P.d dVar2 = this.f47663a;
                i19 = iG3;
                obj3 = p14.u(currentMediaItemIndex, dVar2, 0L).f47407b;
                zVar3 = dVar2.f47409d;
                obj4 = obj8;
            }
            long jQ4 = androidx.media3.common.util.M.Q(j12);
            long jQ5 = this.f48392e0.f48594b.a() ? androidx.media3.common.util.M.Q(l0(this.f48392e0)) : jQ4;
            A.b bVar8 = this.f48392e0.f48594b;
            final H.k kVar2 = new H.k(obj3, currentMediaItemIndex, zVar3, obj4, i19, jQ4, jQ5, bVar8.f47213b, bVar8.f47214c);
            this.f48401l.c(11, new r.a() { // from class: androidx.media3.exoplayer.r
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    H.g gVar = (H.g) obj9;
                    int i27 = A.f48357h0;
                    int i28 = i14;
                    gVar.onPositionDiscontinuity(i28);
                    gVar.t(i28, kVar, kVar2);
                }
            });
        } else {
            z14 = z17;
            z15 = z18;
        }
        if (zBooleanValue) {
            final int i27 = 2;
            this.f48401l.c(1, new r.a() { // from class: androidx.media3.exoplayer.z
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj72) {
                    int i262 = iIntValue;
                    Object obj82 = zVar;
                    H.g gVar = (H.g) obj72;
                    switch (i27) {
                        case 0:
                            int i272 = A.f48357h0;
                            gVar.v(((X) obj82).f48593a, i262);
                            break;
                        case 1:
                            int i28 = A.f48357h0;
                            gVar.onPlayWhenReadyChanged(((X) obj82).f48604l, i262);
                            break;
                        default:
                            int i29 = A.f48357h0;
                            gVar.w(i262, (androidx.media3.common.z) obj82);
                            break;
                    }
                }
            });
        }
        if (x13.f48598f != x12.f48598f) {
            final int i28 = 2;
            this.f48401l.c(10, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i28) {
                        case 0:
                            int i29 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i32 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i33 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i34 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i35 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i36 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i37 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
            if (x12.f48598f != null) {
                final int i29 = 3;
                this.f48401l.c(10, new r.a() { // from class: androidx.media3.exoplayer.q
                    @Override // androidx.media3.common.util.r.a
                    public final void invoke(Object obj9) {
                        X x15 = x12;
                        H.g gVar = (H.g) obj9;
                        switch (i29) {
                            case 0:
                                int i292 = A.f48357h0;
                                gVar.onIsPlayingChanged(x15.k());
                                break;
                            case 1:
                                int i32 = A.f48357h0;
                                gVar.m(x15.f48606n);
                                break;
                            case 2:
                                int i33 = A.f48357h0;
                                gVar.p(x15.f48598f);
                                break;
                            case 3:
                                int i34 = A.f48357h0;
                                gVar.g(x15.f48598f);
                                break;
                            case 4:
                                int i35 = A.f48357h0;
                                gVar.j(x15.f48601i.f50040d);
                                break;
                            case 5:
                                int i36 = A.f48357h0;
                                gVar.onLoadingChanged(x15.f48599g);
                                gVar.onIsLoadingChanged(x15.f48599g);
                                break;
                            case 6:
                                int i37 = A.f48357h0;
                                gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                                break;
                            case 7:
                                int i38 = A.f48357h0;
                                gVar.onPlaybackStateChanged(x15.f48597e);
                                break;
                            default:
                                int i39 = A.f48357h0;
                                gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                                break;
                        }
                    }
                });
            }
        }
        androidx.media3.exoplayer.trackselection.s sVar = x13.f48601i;
        androidx.media3.exoplayer.trackselection.s sVar2 = x12.f48601i;
        if (sVar != sVar2) {
            this.f48397h.d(sVar2.f50041e);
            final int i32 = 4;
            this.f48401l.c(2, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i32) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i33 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i34 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i35 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i36 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i37 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f48401l.c(14, new C23149s(this.f48370M, 0));
        }
        if (z15) {
            final int i33 = 5;
            this.f48401l.c(3, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i33) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i34 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i35 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i36 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i37 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (z14 || z16) {
            final int i34 = 6;
            this.f48401l.c(-1, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i34) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i342 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i35 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i36 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i37 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i35 = 7;
            this.f48401l.c(4, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i35) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i342 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i352 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i36 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i37 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (z16) {
            final int i36 = 1;
            this.f48401l.c(5, new r.a() { // from class: androidx.media3.exoplayer.z
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj72) {
                    int i262 = i13;
                    Object obj82 = x12;
                    H.g gVar = (H.g) obj72;
                    switch (i36) {
                        case 0:
                            int i272 = A.f48357h0;
                            gVar.v(((X) obj82).f48593a, i262);
                            break;
                        case 1:
                            int i282 = A.f48357h0;
                            gVar.onPlayWhenReadyChanged(((X) obj82).f48604l, i262);
                            break;
                        default:
                            int i292 = A.f48357h0;
                            gVar.w(i262, (androidx.media3.common.z) obj82);
                            break;
                    }
                }
            });
        }
        if (x13.f48605m != x12.f48605m) {
            final int i37 = 8;
            this.f48401l.c(6, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i37) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i342 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i352 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i362 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i372 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i38 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (x13.k() != x12.k()) {
            final int i38 = 0;
            this.f48401l.c(7, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i38) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i342 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i352 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i362 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i372 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i382 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i39 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        if (!x13.f48606n.equals(x12.f48606n)) {
            final int i39 = 1;
            this.f48401l.c(12, new r.a() { // from class: androidx.media3.exoplayer.q
                @Override // androidx.media3.common.util.r.a
                public final void invoke(Object obj9) {
                    X x15 = x12;
                    H.g gVar = (H.g) obj9;
                    switch (i39) {
                        case 0:
                            int i292 = A.f48357h0;
                            gVar.onIsPlayingChanged(x15.k());
                            break;
                        case 1:
                            int i322 = A.f48357h0;
                            gVar.m(x15.f48606n);
                            break;
                        case 2:
                            int i332 = A.f48357h0;
                            gVar.p(x15.f48598f);
                            break;
                        case 3:
                            int i342 = A.f48357h0;
                            gVar.g(x15.f48598f);
                            break;
                        case 4:
                            int i352 = A.f48357h0;
                            gVar.j(x15.f48601i.f50040d);
                            break;
                        case 5:
                            int i362 = A.f48357h0;
                            gVar.onLoadingChanged(x15.f48599g);
                            gVar.onIsLoadingChanged(x15.f48599g);
                            break;
                        case 6:
                            int i372 = A.f48357h0;
                            gVar.onPlayerStateChanged(x15.f48604l, x15.f48597e);
                            break;
                        case 7:
                            int i382 = A.f48357h0;
                            gVar.onPlaybackStateChanged(x15.f48597e);
                            break;
                        default:
                            int i392 = A.f48357h0;
                            gVar.onPlaybackSuppressionReasonChanged(x15.f48605m);
                            break;
                    }
                }
            });
        }
        u0();
        this.f48401l.b();
        if (x13.f48607o != x12.f48607o) {
            Iterator<InterfaceC23144m.b> it = this.f48402m.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public final void x0() {
        int playbackState = getPlaybackState();
        l0 l0Var = this.f48359B;
        k0 k0Var = this.f48358A;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                y0();
                boolean z12 = this.f48392e0.f48607o;
                getPlayWhenReady();
                k0Var.getClass();
                getPlayWhenReady();
                l0Var.getClass();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        k0Var.getClass();
        l0Var.getClass();
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.B y() {
        y0();
        return this.f48371N;
    }

    public final void y0() {
        this.f48389d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f48408s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i12 = androidx.media3.common.util.M.f47887a;
            Locale locale = Locale.US;
            String strA = androidx.camera.core.Q.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f48382Y) {
                throw new IllegalStateException(strA);
            }
            androidx.media3.common.util.s.h(strA, this.f48383Z ? null : new IllegalStateException());
            this.f48383Z = true;
        }
    }

    @Override // androidx.media3.common.H
    public final void z(androidx.media3.common.U u12) {
        y0();
        androidx.media3.exoplayer.trackselection.r rVar = this.f48397h;
        rVar.getClass();
        if (!(rVar instanceof androidx.media3.exoplayer.trackselection.g) || u12.equals(rVar.b())) {
            return;
        }
        rVar.h(u12);
        this.f48401l.f(19, new C23149s(u12, 1));
    }

    @Override // androidx.media3.common.H
    @j.P
    public final ExoPlaybackException a() {
        y0();
        return this.f48392e0.f48598f;
    }

    /* compiled from: ExoPlayerImpl.java */
    public final class c implements androidx.media3.exoplayer.video.l, androidx.media3.exoplayer.audio.h, androidx.media3.exoplayer.text.c, androidx.media3.exoplayer.metadata.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, i.b, C23135d.c, C23133b.InterfaceC1826b, j0.b, InterfaceC23144m.b {
        public c(a aVar) {
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void E2(long j12, long j13, String str) {
            A.this.f48407r.E2(j12, j13, str);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void F2(int i12, long j12, long j13) {
            A.this.f48407r.F2(i12, j12, j13);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void I2(String str) {
            A.this.f48407r.I2(str);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void L2(String str) {
            A.this.f48407r.L2(str);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void R2(int i12, long j12) {
            A.this.f48407r.R2(i12, j12);
        }

        @Override // androidx.media3.exoplayer.text.c
        public final void a(androidx.media3.common.text.b bVar) {
            A a12 = A.this;
            a12.f48381X = bVar;
            a12.f48401l.f(27, new C23149s(bVar, 4));
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void a2(long j12, Object obj) {
            A a12 = A.this;
            a12.f48407r.a2(j12, obj);
            if (a12.f48373P == obj) {
                a12.f48401l.f(26, new C23179x(3));
            }
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void b(androidx.media3.common.X x12) {
            A a12 = A.this;
            a12.f48388c0 = x12;
            a12.f48401l.f(25, new C23149s(x12, 7));
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void b1(Exception exc) {
            A.this.f48407r.b1(exc);
        }

        @Override // androidx.media3.exoplayer.InterfaceC23144m.b
        public final void c() {
            int i12 = A.f48357h0;
            A.this.x0();
        }

        @Override // androidx.media3.exoplayer.metadata.b
        public final void d(Metadata metadata) {
            A a12 = A.this;
            androidx.media3.common.B b12 = a12.f48390d0;
            b12.getClass();
            B.b bVar = new B.b(b12, null);
            int i12 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f47361b;
                if (i12 >= entryArr.length) {
                    break;
                }
                entryArr[i12].J5(bVar);
                i12++;
            }
            a12.f48390d0 = bVar.a();
            androidx.media3.common.B bE02 = a12.e0();
            boolean zEquals = bE02.equals(a12.f48370M);
            androidx.media3.common.util.r<H.g> rVar = a12.f48401l;
            if (!zEquals) {
                a12.f48370M = bE02;
                rVar.c(14, new C23149s(this, 3));
            }
            rVar.c(28, new C23149s(metadata, 5));
            rVar.b();
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void d2(long j12, long j13, String str) {
            A.this.f48407r.d2(j12, j13, str);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void f3(long j12) {
            A.this.f48407r.f3(j12);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void g2(int i12, long j12) {
            A.this.f48407r.g2(i12, j12);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void g3(Exception exc) {
            A.this.f48407r.g3(exc);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void h3(C23138g c23138g) {
            A a12 = A.this;
            a12.getClass();
            a12.f48407r.h3(c23138g);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void i3(C23108t c23108t, @j.P C23139h c23139h) {
            A a12 = A.this;
            a12.getClass();
            a12.f48407r.i3(c23108t, c23139h);
        }

        @Override // androidx.media3.exoplayer.video.l
        public final void j3(C23138g c23138g) {
            A.this.f48407r.j3(c23138g);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void k3(C23138g c23138g) {
            A a12 = A.this;
            a12.getClass();
            a12.f48407r.k3(c23138g);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void l2(Exception exc) {
            A.this.f48407r.l2(exc);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void l3(C23108t c23108t, @j.P C23139h c23139h) {
            A a12 = A.this;
            a12.getClass();
            a12.f48407r.l3(c23108t, c23139h);
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void m3(C23138g c23138g) {
            A.this.f48407r.m3(c23138g);
        }

        @Override // androidx.media3.exoplayer.text.c
        public final void onCues(List<androidx.media3.common.text.a> list) {
            A.this.f48401l.f(27, new C23149s(list, 6));
        }

        @Override // androidx.media3.exoplayer.audio.h
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            A a12 = A.this;
            if (a12.f48380W == z12) {
                return;
            }
            a12.f48380W = z12;
            a12.f48401l.f(23, new C23178w(z12, 1));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
            int i14 = A.f48357h0;
            A a12 = A.this;
            a12.getClass();
            Surface surface = new Surface(surfaceTexture);
            a12.s0(surface);
            a12.f48374Q = surface;
            a12.o0(i12, i13);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i12 = A.f48357h0;
            A a12 = A.this;
            a12.s0(null);
            a12.o0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
            int i14 = A.f48357h0;
            A.this.o0(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            int i15 = A.f48357h0;
            A.this.o0(i13, i14);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            int i12 = A.f48357h0;
            A.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            int i12 = A.f48357h0;
            A a12 = A.this;
            a12.getClass();
            a12.o0(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
