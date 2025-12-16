package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.e;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: DecoderAudioRenderer.java */
/* loaded from: classes6.dex */
public abstract class o<T extends com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.k, ? extends DecoderException>> extends AbstractC36523f implements com.google.android.exoplayer2.util.x {

    /* renamed from: A, reason: collision with root package name */
    public int f344050A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f344051B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f344052C;

    /* renamed from: D, reason: collision with root package name */
    public long f344053D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f344054E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f344055F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f344056G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f344057H;

    /* renamed from: n, reason: collision with root package name */
    public final i.a f344058n;

    /* renamed from: o, reason: collision with root package name */
    public final DefaultAudioSink f344059o;

    /* renamed from: p, reason: collision with root package name */
    public final DecoderInputBuffer f344060p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.exoplayer2.decoder.f f344061q;

    /* renamed from: r, reason: collision with root package name */
    public I f344062r;

    /* renamed from: s, reason: collision with root package name */
    public int f344063s;

    /* renamed from: t, reason: collision with root package name */
    public int f344064t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f344065u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public T f344066v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public DecoderInputBuffer f344067w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.decoder.k f344068x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public DrmSession f344069y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public DrmSession f344070z;

    /* compiled from: DecoderAudioRenderer.java */
    public final class b implements AudioSink.a {
        public b(a aVar) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void a(long j12) {
            i.a aVar = o.this.f344058n;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.f(1, j12, aVar));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void b(int i12, long j12, long j13) {
            i.a aVar = o.this.f344058n;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.g(aVar, i12, j12, j13, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void b1(Exception exc) {
            C36605v.a("Audio sink error", exc);
            i.a aVar = o.this.f344058n;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new g(aVar, exc, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void d() {
            o.this.f344055F = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            i.a aVar = o.this.f344058n;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new D.b(13, aVar, z12));
            }
        }
    }

    public o() {
        DefaultAudioSink.e eVar = new DefaultAudioSink.e();
        eVar.f343923a = (e) com.google.common.base.D.a(null, e.f343983c);
        eVar.f343924b = new DefaultAudioSink.g(new AudioProcessor[0]);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(eVar, null);
        super(1);
        this.f344058n = new i.a(null, null);
        this.f344059o = defaultAudioSink;
        defaultAudioSink.f343911r = new b(null);
        this.f344060p = new DecoderInputBuffer(0);
        this.f344050A = 0;
        this.f344052C = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        i.a aVar = this.f344058n;
        this.f344062r = null;
        this.f344052C = true;
        try {
            DrmSession.g(this.f344070z, null);
            this.f344070z = null;
            Q();
            this.f344059o.y();
        } finally {
            aVar.a(this.f344061q);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void C(boolean z12, boolean z13) throws IllegalStateException {
        com.google.android.exoplayer2.decoder.f fVar = new com.google.android.exoplayer2.decoder.f();
        this.f344061q = fVar;
        i.a aVar = this.f344058n;
        Handler handler = aVar.f343996a;
        if (handler != null) {
            handler.post(new h(aVar, fVar, 0));
        }
        j0 j0Var = this.f345398d;
        j0Var.getClass();
        boolean z14 = j0Var.f345445a;
        DefaultAudioSink defaultAudioSink = this.f344059o;
        if (z14) {
            defaultAudioSink.e();
        } else {
            defaultAudioSink.c();
        }
        com.google.android.exoplayer2.analytics.p pVar = this.f345400f;
        pVar.getClass();
        defaultAudioSink.f343910q = pVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) throws IllegalStateException, ExoPlaybackException {
        this.f344059o.f();
        this.f344053D = j12;
        this.f344054E = true;
        this.f344055F = true;
        this.f344056G = false;
        this.f344057H = false;
        T t12 = this.f344066v;
        if (t12 != null) {
            if (this.f344050A != 0) {
                Q();
                O();
                return;
            }
            this.f344067w = null;
            if (this.f344068x != null) {
                throw null;
            }
            t12.flush();
            this.f344051B = false;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void F() throws IllegalStateException {
        this.f344059o.u();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void G() throws IllegalStateException {
        S();
        this.f344059o.t();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void H(I[] iArr, long j12, long j13) {
        this.f344065u = false;
    }

    public abstract com.google.android.exoplayer2.decoder.e J();

    public final void K() throws ExoPlaybackException, AudioSink.ConfigurationException {
        com.google.android.exoplayer2.decoder.k kVar = this.f344068x;
        DefaultAudioSink defaultAudioSink = this.f344059o;
        if (kVar == null) {
            com.google.android.exoplayer2.decoder.k kVar2 = (com.google.android.exoplayer2.decoder.k) this.f344066v.b();
            this.f344068x = kVar2;
            if (kVar2 == null) {
                return;
            }
            int i12 = kVar2.f344236d;
            if (i12 > 0) {
                this.f344061q.f344228f += i12;
                defaultAudioSink.f343872G = true;
            }
            if (kVar2.f(134217728)) {
                defaultAudioSink.f343872G = true;
            }
        }
        if (this.f344068x.f(4)) {
            if (this.f344050A != 2) {
                this.f344068x.getClass();
                throw null;
            }
            Q();
            O();
            this.f344052C = true;
            return;
        }
        if (this.f344052C) {
            I.b bVarA = M().a();
            bVarA.f343490A = this.f344063s;
            bVarA.f343491B = this.f344064t;
            defaultAudioSink.b(bVarA.a(), null);
            this.f344052C = false;
        }
        this.f344068x.getClass();
        if (defaultAudioSink.n(null, this.f344068x.f344235c, 1)) {
            this.f344061q.f344227e++;
            this.f344068x.getClass();
            throw null;
        }
    }

    public final boolean L() throws ExoPlaybackException {
        T t12 = this.f344066v;
        if (t12 == null || this.f344050A == 2 || this.f344056G) {
            return false;
        }
        if (this.f344067w == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t12.a();
            this.f344067w = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f344050A == 1) {
            DecoderInputBuffer decoderInputBuffer2 = this.f344067w;
            decoderInputBuffer2.f344210b = 4;
            this.f344066v.d(decoderInputBuffer2);
            this.f344067w = null;
            this.f344050A = 2;
            return false;
        }
        J j12 = this.f345397c;
        j12.a();
        int I12 = I(j12, this.f344067w, 0);
        if (I12 == -5) {
            P(j12);
            return true;
        }
        if (I12 != -4) {
            if (I12 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f344067w.f(4)) {
            this.f344056G = true;
            this.f344066v.d(this.f344067w);
            this.f344067w = null;
            return false;
        }
        if (!this.f344065u) {
            this.f344065u = true;
            this.f344067w.e(134217728);
        }
        this.f344067w.k();
        this.f344067w.getClass();
        DecoderInputBuffer decoderInputBuffer3 = this.f344067w;
        if (this.f344054E && !decoderInputBuffer3.f(BeduinInputModel.MIN_TEXT_VERSION)) {
            if (Math.abs(decoderInputBuffer3.f344207f - this.f344053D) > 500000) {
                this.f344053D = decoderInputBuffer3.f344207f;
            }
            this.f344054E = false;
        }
        this.f344066v.d(this.f344067w);
        this.f344051B = true;
        this.f344061q.f344225c++;
        this.f344067w = null;
        return true;
    }

    public abstract I M();

    public final void O() throws ExoPlaybackException {
        i.a aVar = this.f344058n;
        if (this.f344066v != null) {
            return;
        }
        DrmSession drmSession = this.f344070z;
        DrmSession.g(this.f344069y, drmSession);
        this.f344069y = drmSession;
        if (drmSession != null && drmSession.c() == null && this.f344069y.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.google.android.exoplayer2.util.P.a("createAudioDecoder");
            this.f344066v = (T) J();
            com.google.android.exoplayer2.util.P.b();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.f344066v.getName();
            long j12 = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.e(aVar, name, jElapsedRealtime2, j12, 2));
            }
            this.f344061q.f344223a++;
        } catch (DecoderException e12) {
            C36605v.a("Audio codec error", e12);
            Handler handler2 = aVar.f343996a;
            if (handler2 != null) {
                handler2.post(new g(aVar, e12, 0));
            }
            throw z(e12, this.f344062r, false, 4001);
        } catch (OutOfMemoryError e13) {
            throw z(e13, this.f344062r, false, 4001);
        }
    }

    public final void P(J j12) throws ExoPlaybackException {
        I i12 = j12.f343521b;
        i12.getClass();
        DrmSession drmSession = j12.f343520a;
        DrmSession.g(this.f344070z, drmSession);
        this.f344070z = drmSession;
        I i13 = this.f344062r;
        this.f344062r = i12;
        this.f344063s = i12.f343460C;
        this.f344064t = i12.f343461D;
        T t12 = this.f344066v;
        i.a aVar = this.f344058n;
        if (t12 == null) {
            O();
            I i14 = this.f344062r;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new com.avito.konveyor.item_visibility_tracker.c(aVar, i14, null, 1));
                return;
            }
            return;
        }
        com.google.android.exoplayer2.decoder.h hVar = drmSession != this.f344069y ? new com.google.android.exoplayer2.decoder.h(t12.getName(), i13, i12, 0, 128) : new com.google.android.exoplayer2.decoder.h(t12.getName(), i13, i12, 0, 1);
        if (hVar.f344240d == 0) {
            if (this.f344051B) {
                this.f344050A = 1;
            } else {
                Q();
                O();
                this.f344052C = true;
            }
        }
        I i15 = this.f344062r;
        Handler handler2 = aVar.f343996a;
        if (handler2 != null) {
            handler2.post(new com.avito.konveyor.item_visibility_tracker.c(aVar, i15, hVar, 1));
        }
    }

    public final void Q() {
        this.f344067w = null;
        this.f344068x = null;
        this.f344050A = 0;
        this.f344051B = false;
        T t12 = this.f344066v;
        if (t12 != null) {
            this.f344061q.f344224b++;
            t12.release();
            String name = this.f344066v.getName();
            i.a aVar = this.f344058n;
            Handler handler = aVar.f343996a;
            if (handler != null) {
                handler.post(new RunnableC34589p(23, aVar, name));
            }
            this.f344066v = null;
        }
        DrmSession.g(this.f344069y, null);
        this.f344069y = null;
    }

    public abstract int R();

    public final void S() {
        long jH2 = this.f344059o.h(a());
        if (jH2 != Long.MIN_VALUE) {
            if (!this.f344055F) {
                jH2 = Math.max(this.f344053D, jH2);
            }
            this.f344053D = jH2;
            this.f344055F = false;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public final boolean a() {
        return this.f344057H && this.f344059o.r();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.e0.b
    public final void b(int i12, @P Object obj) throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.f344059o;
        if (i12 == 2) {
            defaultAudioSink.G(((Float) obj).floatValue());
            return;
        }
        if (i12 == 3) {
            defaultAudioSink.z((C36506d) obj);
            return;
        }
        if (i12 == 6) {
            defaultAudioSink.D((l) obj);
        } else if (i12 == 9) {
            defaultAudioSink.F(((Boolean) obj).booleanValue());
        } else {
            if (i12 != 10) {
                return;
            }
            defaultAudioSink.B(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.exoplayer2.util.x
    public final long c() {
        if (this.f345401g == 2) {
            S();
        }
        return this.f344053D;
    }

    @Override // com.google.android.exoplayer2.util.x
    public final void d(c0 c0Var) {
        this.f344059o.E(c0Var);
    }

    @Override // com.google.android.exoplayer2.util.x
    public final c0 getPlaybackParameters() {
        return this.f344059o.k();
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        return this.f344059o.o() || (this.f344062r != null && (A() || this.f344068x != null));
    }

    @Override // com.google.android.exoplayer2.h0
    public final void o(long j12, long j13) throws ExoPlaybackException, IllegalStateException {
        if (this.f344057H) {
            try {
                this.f344059o.w();
                return;
            } catch (AudioSink.WriteException e12) {
                throw z(e12, e12.f343858d, e12.f343857c, 5002);
            }
        }
        if (this.f344062r == null) {
            J j14 = this.f345397c;
            j14.a();
            this.f344060p.h();
            int I12 = I(j14, this.f344060p, 2);
            if (I12 != -5) {
                if (I12 == -4) {
                    C36585a.d(this.f344060p.f(4));
                    this.f344056G = true;
                    try {
                        this.f344057H = true;
                        this.f344059o.w();
                        return;
                    } catch (AudioSink.WriteException e13) {
                        throw z(e13, null, false, 5002);
                    }
                }
                return;
            }
            P(j14);
        }
        O();
        if (this.f344066v != null) {
            try {
                com.google.android.exoplayer2.util.P.a("drainAndFeed");
                K();
                while (L()) {
                }
                com.google.android.exoplayer2.util.P.b();
                synchronized (this.f344061q) {
                }
            } catch (AudioSink.ConfigurationException e14) {
                throw z(e14, e14.f343852b, false, 5001);
            } catch (AudioSink.InitializationException e15) {
                throw z(e15, e15.f343855d, e15.f343854c, 5001);
            } catch (AudioSink.WriteException e16) {
                throw z(e16, e16.f343858d, e16.f343857c, 5002);
            } catch (DecoderException e17) {
                C36605v.a("Audio codec error", e17);
                i.a aVar = this.f344058n;
                Handler handler = aVar.f343996a;
                if (handler != null) {
                    handler.post(new g(aVar, e17, 0));
                }
                throw z(e17, this.f344062r, false, 4003);
            }
        }
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) {
        if (!com.google.android.exoplayer2.util.z.k(i12.f343476m)) {
            return i0.e(0, 0, 0);
        }
        int iR2 = R();
        if (iR2 <= 2) {
            return i0.e(iR2, 0, 0);
        }
        return i0.e(iR2, 8, U.f348106a >= 21 ? 32 : 0);
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    @P
    public final com.google.android.exoplayer2.util.x w() {
        return this;
    }
}
