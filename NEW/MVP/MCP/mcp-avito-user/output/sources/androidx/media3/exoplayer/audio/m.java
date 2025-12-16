package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23092f;
import androidx.media3.common.C23108t;
import androidx.media3.common.G;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.e;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.I;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.h;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.e0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.common.base.D;
import j.InterfaceC42164u;
import j.P;
import j.X;

/* compiled from: DecoderAudioRenderer.java */
@J
/* loaded from: classes.dex */
public abstract class m<T extends androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.i, ? extends DecoderException>> extends AbstractC23136e implements I {

    /* renamed from: A, reason: collision with root package name */
    @P
    public DrmSession f48943A;

    /* renamed from: B, reason: collision with root package name */
    @P
    public DrmSession f48944B;

    /* renamed from: C, reason: collision with root package name */
    public int f48945C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f48946D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f48947E;

    /* renamed from: F, reason: collision with root package name */
    public long f48948F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f48949G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f48950H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f48951I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f48952J;

    /* renamed from: K, reason: collision with root package name */
    public long f48953K;

    /* renamed from: L, reason: collision with root package name */
    public final long[] f48954L;

    /* renamed from: M, reason: collision with root package name */
    public int f48955M;

    /* renamed from: p, reason: collision with root package name */
    public final h.a f48956p;

    /* renamed from: q, reason: collision with root package name */
    public final DefaultAudioSink f48957q;

    /* renamed from: r, reason: collision with root package name */
    public final DecoderInputBuffer f48958r;

    /* renamed from: s, reason: collision with root package name */
    public C23138g f48959s;

    /* renamed from: t, reason: collision with root package name */
    public C23108t f48960t;

    /* renamed from: u, reason: collision with root package name */
    public int f48961u;

    /* renamed from: v, reason: collision with root package name */
    public int f48962v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f48963w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public T f48964x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public DecoderInputBuffer f48965y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public androidx.media3.decoder.i f48966z;

    /* compiled from: DecoderAudioRenderer.java */
    @X
    public static final class b {
        @InterfaceC42164u
        public static void a(AudioSink audioSink, @P Object obj) {
            audioSink.a((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: DecoderAudioRenderer.java */
    public final class c implements AudioSink.a {
        public c(a aVar) {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void a(long j12) {
            h.a aVar = m.this.f48956p;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new f(0, j12, aVar));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void b(int i12, long j12, long j13) {
            h.a aVar = m.this.f48956p;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new g(aVar, i12, j12, j13, 0));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void b1(Exception exc) {
            androidx.media3.common.util.s.d("Audio sink error", exc);
            h.a aVar = m.this.f48956p;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new d(aVar, exc, 1));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void d() {
            m.this.f48950H = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.a
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            h.a aVar = m.this.f48956p;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new D.b(1, aVar, z12));
            }
        }
    }

    public m() {
        DefaultAudioSink.g gVar = new DefaultAudioSink.g();
        gVar.f48831b = (androidx.media3.exoplayer.audio.a) D.a(null, androidx.media3.exoplayer.audio.a.f48857c);
        gVar.f48832c = new DefaultAudioSink.i(new AudioProcessor[0]);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(gVar, null);
        super(1);
        this.f48956p = new h.a(null, null);
        this.f48957q = defaultAudioSink;
        defaultAudioSink.f48819r = new c(null);
        this.f48958r = new DecoderInputBuffer(0);
        this.f48945C = 0;
        this.f48947E = true;
        U(-9223372036854775807L);
        this.f48954L = new long[10];
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        h.a aVar = this.f48956p;
        this.f48960t = null;
        this.f48947E = true;
        U(-9223372036854775807L);
        try {
            DrmSession.e(this.f48944B, null);
            this.f48944B = null;
            T();
            this.f48957q.y();
        } finally {
            aVar.a(this.f48959s);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void E(boolean z12, boolean z13) throws IllegalStateException {
        C23138g c23138g = new C23138g();
        this.f48959s = c23138g;
        h.a aVar = this.f48956p;
        Handler handler = aVar.f48895a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.c(aVar, c23138g, 0));
        }
        e0 e0Var = this.f49142e;
        e0Var.getClass();
        boolean z14 = e0Var.f49154a;
        DefaultAudioSink defaultAudioSink = this.f48957q;
        if (z14) {
            defaultAudioSink.f();
        } else {
            defaultAudioSink.d();
        }
        androidx.media3.exoplayer.analytics.w wVar = this.f49144g;
        wVar.getClass();
        defaultAudioSink.f48818q = wVar;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) throws IllegalStateException, ExoPlaybackException {
        this.f48957q.g();
        this.f48948F = j12;
        this.f48949G = true;
        this.f48950H = true;
        this.f48951I = false;
        this.f48952J = false;
        T t12 = this.f48964x;
        if (t12 != null) {
            if (this.f48945C != 0) {
                T();
                R();
                return;
            }
            this.f48965y = null;
            if (this.f48966z != null) {
                throw null;
            }
            t12.flush();
            this.f48946D = false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void I() throws IllegalStateException {
        this.f48957q.u();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void J() throws IllegalStateException {
        W();
        this.f48957q.t();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void K(C23108t[] c23108tArr, long j12, long j13) {
        this.f48963w = false;
        if (this.f48953K == -9223372036854775807L) {
            U(j13);
            return;
        }
        int i12 = this.f48955M;
        long[] jArr = this.f48954L;
        if (i12 == jArr.length) {
            long j14 = jArr[i12 - 1];
            androidx.media3.common.util.s.g();
        } else {
            this.f48955M = i12 + 1;
        }
        jArr[this.f48955M - 1] = j13;
    }

    @aZ0.g
    public abstract androidx.media3.decoder.e M();

    public final void O() throws ExoPlaybackException, AudioSink.ConfigurationException {
        androidx.media3.decoder.i iVar = this.f48966z;
        DefaultAudioSink defaultAudioSink = this.f48957q;
        if (iVar == null) {
            androidx.media3.decoder.i iVar2 = (androidx.media3.decoder.i) this.f48964x.b();
            this.f48966z = iVar2;
            if (iVar2 == null) {
                return;
            }
            int i12 = iVar2.f48342d;
            if (i12 > 0) {
                this.f48959s.f49160f += i12;
                defaultAudioSink.f48780K = true;
            }
            if (iVar2.f(134217728)) {
                defaultAudioSink.f48780K = true;
                if (this.f48955M != 0) {
                    long[] jArr = this.f48954L;
                    U(jArr[0]);
                    int i13 = this.f48955M - 1;
                    this.f48955M = i13;
                    System.arraycopy(jArr, 1, jArr, 0, i13);
                }
            }
        }
        if (this.f48966z.f(4)) {
            if (this.f48945C != 2) {
                this.f48966z.getClass();
                throw null;
            }
            T();
            R();
            this.f48947E = true;
            return;
        }
        if (this.f48947E) {
            C23108t.b bVarA = Q().a();
            bVarA.f47771A = this.f48961u;
            bVarA.f47772B = this.f48962v;
            defaultAudioSink.c(bVarA.a(), null);
            this.f48947E = false;
        }
        this.f48966z.getClass();
        if (defaultAudioSink.n(null, this.f48966z.f48341c, 1)) {
            this.f48959s.f49159e++;
            this.f48966z.getClass();
            throw null;
        }
    }

    public final boolean P() throws ExoPlaybackException {
        T t12 = this.f48964x;
        if (t12 == null || this.f48945C == 2 || this.f48951I) {
            return false;
        }
        if (this.f48965y == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t12.a();
            this.f48965y = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f48945C == 1) {
            DecoderInputBuffer decoderInputBuffer2 = this.f48965y;
            decoderInputBuffer2.f48328b = 4;
            this.f48964x.d(decoderInputBuffer2);
            this.f48965y = null;
            this.f48945C = 2;
            return false;
        }
        F f12 = this.f49141d;
        f12.a();
        int iL2 = L(f12, this.f48965y, 0);
        if (iL2 == -5) {
            S(f12);
            return true;
        }
        if (iL2 != -4) {
            if (iL2 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f48965y.f(4)) {
            this.f48951I = true;
            this.f48964x.d(this.f48965y);
            this.f48965y = null;
            return false;
        }
        if (!this.f48963w) {
            this.f48963w = true;
            this.f48965y.e(134217728);
        }
        this.f48965y.k();
        this.f48965y.getClass();
        DecoderInputBuffer decoderInputBuffer3 = this.f48965y;
        if (this.f48949G && !decoderInputBuffer3.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            if (Math.abs(decoderInputBuffer3.f48325f - this.f48948F) > 500000) {
                this.f48948F = decoderInputBuffer3.f48325f;
            }
            this.f48949G = false;
        }
        this.f48964x.d(this.f48965y);
        this.f48946D = true;
        this.f48959s.f49157c++;
        this.f48965y = null;
        return true;
    }

    @aZ0.g
    public abstract C23108t Q();

    public final void R() throws ExoPlaybackException {
        h.a aVar = this.f48956p;
        if (this.f48964x != null) {
            return;
        }
        DrmSession drmSession = this.f48944B;
        DrmSession.e(this.f48943A, drmSession);
        this.f48943A = drmSession;
        if (drmSession != null && drmSession.c() == null && this.f48943A.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            H.a("createAudioDecoder");
            this.f48964x = (T) M();
            H.b();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.f48964x.getName();
            long j12 = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new e(aVar, name, jElapsedRealtime2, j12, 0));
            }
            this.f48959s.f49155a++;
        } catch (DecoderException e12) {
            androidx.media3.common.util.s.d("Audio codec error", e12);
            Handler handler2 = aVar.f48895a;
            if (handler2 != null) {
                handler2.post(new d(aVar, e12, 0));
            }
            throw B(e12, this.f48960t, false, 4001);
        } catch (OutOfMemoryError e13) {
            throw B(e13, this.f48960t, false, 4001);
        }
    }

    public final void S(F f12) throws ExoPlaybackException {
        C23108t c23108t = f12.f48506b;
        c23108t.getClass();
        DrmSession drmSession = f12.f48505a;
        DrmSession.e(this.f48944B, drmSession);
        this.f48944B = drmSession;
        C23108t c23108t2 = this.f48960t;
        this.f48960t = c23108t;
        this.f48961u = c23108t.f47739C;
        this.f48962v = c23108t.f47740D;
        T t12 = this.f48964x;
        h.a aVar = this.f48956p;
        if (t12 == null) {
            R();
            C23108t c23108t3 = this.f48960t;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new Me.m(aVar, c23108t3, (Object) null, 6));
                return;
            }
            return;
        }
        C23139h c23139h = drmSession != this.f48943A ? new C23139h(t12.getName(), c23108t2, c23108t, 0, 128) : new C23139h(t12.getName(), c23108t2, c23108t, 0, 1);
        if (c23139h.f49173d == 0) {
            if (this.f48946D) {
                this.f48945C = 1;
            } else {
                T();
                R();
                this.f48947E = true;
            }
        }
        C23108t c23108t4 = this.f48960t;
        Handler handler2 = aVar.f48895a;
        if (handler2 != null) {
            handler2.post(new Me.m(aVar, c23108t4, c23139h, 6));
        }
    }

    public final void T() {
        this.f48965y = null;
        this.f48966z = null;
        this.f48945C = 0;
        this.f48946D = false;
        T t12 = this.f48964x;
        if (t12 != null) {
            this.f48959s.f49156b++;
            t12.release();
            String name = this.f48964x.getName();
            h.a aVar = this.f48956p;
            Handler handler = aVar.f48895a;
            if (handler != null) {
                handler.post(new J11.c(11, aVar, name, false));
            }
            this.f48964x = null;
        }
        DrmSession.e(this.f48943A, null);
        this.f48943A = null;
    }

    public final void U(long j12) {
        this.f48953K = j12;
        if (j12 != -9223372036854775807L) {
            this.f48957q.getClass();
        }
    }

    @aZ0.g
    public abstract int V();

    public final void W() {
        long j12 = this.f48957q.j(a());
        if (j12 != Long.MIN_VALUE) {
            if (!this.f48950H) {
                j12 = Math.max(this.f48948F, j12);
            }
            this.f48948F = j12;
            this.f48950H = false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        return this.f48952J && this.f48957q.r();
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.Y.b
    public final void b(int i12, @P Object obj) throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f48957q;
        if (i12 == 2) {
            defaultAudioSink.F(((Float) obj).floatValue());
            return;
        }
        if (i12 == 3) {
            defaultAudioSink.z((C23091e) obj);
            return;
        }
        if (i12 == 6) {
            defaultAudioSink.C((C23092f) obj);
            return;
        }
        if (i12 == 12) {
            if (M.f47887a >= 23) {
                b.a(defaultAudioSink, obj);
            }
        } else if (i12 == 9) {
            defaultAudioSink.E(((Boolean) obj).booleanValue());
        } else {
            if (i12 != 10) {
                return;
            }
            defaultAudioSink.A(((Integer) obj).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.I
    public final long c() {
        if (this.f49145h == 2) {
            W();
        }
        return this.f48948F;
    }

    @Override // androidx.media3.exoplayer.I
    public final void d(G g12) {
        this.f48957q.D(g12);
    }

    @Override // androidx.media3.exoplayer.I
    public final G getPlaybackParameters() {
        return this.f48957q.f48771B;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) {
        if (!androidx.media3.common.D.g(c23108t.f47757m)) {
            return d0.e(0, 0, 0);
        }
        int iV2 = V();
        if (iV2 <= 2) {
            return d0.e(iV2, 0, 0);
        }
        return d0.e(iV2, 8, M.f47887a >= 21 ? 32 : 0);
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        return this.f48957q.o() || (this.f48960t != null && (C() || this.f48966z != null));
    }

    @Override // androidx.media3.exoplayer.c0
    public final void o(long j12, long j13) throws IllegalStateException, ExoPlaybackException {
        if (this.f48952J) {
            try {
                this.f48957q.w();
                return;
            } catch (AudioSink.WriteException e12) {
                throw B(e12, e12.f48766d, e12.f48765c, 5002);
            }
        }
        if (this.f48960t == null) {
            F f12 = this.f49141d;
            f12.a();
            this.f48958r.h();
            int iL2 = L(f12, this.f48958r, 2);
            if (iL2 != -5) {
                if (iL2 == -4) {
                    C23110a.g(this.f48958r.f(4));
                    this.f48951I = true;
                    try {
                        this.f48952J = true;
                        this.f48957q.w();
                        return;
                    } catch (AudioSink.WriteException e13) {
                        throw B(e13, null, false, 5002);
                    }
                }
                return;
            }
            S(f12);
        }
        R();
        if (this.f48964x != null) {
            try {
                H.a("drainAndFeed");
                O();
                while (P()) {
                }
                H.b();
                synchronized (this.f48959s) {
                }
            } catch (DecoderException e14) {
                androidx.media3.common.util.s.d("Audio codec error", e14);
                h.a aVar = this.f48956p;
                Handler handler = aVar.f48895a;
                if (handler != null) {
                    handler.post(new d(aVar, e14, 0));
                }
                throw B(e14, this.f48960t, false, 4003);
            } catch (AudioSink.ConfigurationException e15) {
                throw B(e15, e15.f48760b, false, 5001);
            } catch (AudioSink.InitializationException e16) {
                throw B(e16, e16.f48763d, e16.f48762c, 5001);
            } catch (AudioSink.WriteException e17) {
                throw B(e17, e17.f48766d, e17.f48765c, 5002);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    @P
    public final I w() {
        return this;
    }
}
