package androidx.media3.exoplayer.video;

import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.C23108t;
import androidx.media3.common.X;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.drm.DrmSession;
import j.InterfaceC42153i;
import j.P;

/* compiled from: DecoderVideoRenderer.java */
@J
/* loaded from: classes.dex */
public abstract class a extends AbstractC23136e {

    /* renamed from: A, reason: collision with root package name */
    public int f50188A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f50189B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f50190C;

    /* renamed from: D, reason: collision with root package name */
    public long f50191D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f50192E;

    /* renamed from: F, reason: collision with root package name */
    @P
    public X f50193F;

    /* renamed from: G, reason: collision with root package name */
    public int f50194G;

    /* renamed from: H, reason: collision with root package name */
    public C23138g f50195H;

    /* renamed from: p, reason: collision with root package name */
    public C23108t f50196p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.j, ? extends DecoderException> f50197q;

    /* renamed from: r, reason: collision with root package name */
    public DecoderInputBuffer f50198r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.media3.decoder.j f50199s;

    /* renamed from: t, reason: collision with root package name */
    public int f50200t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public Object f50201u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public Surface f50202v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public f f50203w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public g f50204x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public DrmSession f50205y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public DrmSession f50206z;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.exoplayer.AbstractC23136e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r2 = this;
            r0 = 0
            r2.f50196p = r0
            r2.f50193F = r0
            r1 = 0
            r2.f50190C = r1
            androidx.media3.exoplayer.drm.DrmSession r1 = r2.f50206z     // Catch: java.lang.Throwable -> L13
            androidx.media3.exoplayer.drm.DrmSession.e(r1, r0)     // Catch: java.lang.Throwable -> L13
            r2.f50206z = r0     // Catch: java.lang.Throwable -> L13
            r2.R()     // Catch: java.lang.Throwable -> L13
            throw r0
        L13:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.a.D():void");
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void E(boolean z12, boolean z13) {
        this.f50195H = new C23138g();
        throw null;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) throws ExoPlaybackException {
        this.f50192E = false;
        this.f50190C = false;
        this.f50191D = -9223372036854775807L;
        androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.j, ? extends DecoderException> eVar = this.f50197q;
        if (eVar == null) {
            throw null;
        }
        if (this.f50188A != 0) {
            R();
            Q();
            throw null;
        }
        this.f50198r = null;
        if (this.f50199s != null) {
            throw null;
        }
        eVar.flush();
        this.f50189B = false;
        throw null;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void I() {
        this.f50194G = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        int i12 = M.f47887a;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void J() {
        if (this.f50194G <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    public abstract androidx.media3.decoder.e M();

    public final void O(long j12) throws ExoPlaybackException {
        if (this.f50199s == null) {
            androidx.media3.decoder.j jVarB = this.f50197q.b();
            this.f50199s = jVarB;
            if (jVarB == null) {
                return;
            }
            this.f50195H.f49160f += jVarB.f48342d;
        }
        if (this.f50199s.f(4)) {
            if (this.f50188A != 2) {
                this.f50199s.getClass();
                throw null;
            }
            R();
            Q();
            return;
        }
        if (this.f50191D == -9223372036854775807L) {
            this.f50191D = j12;
        }
        androidx.media3.decoder.j jVar = this.f50199s;
        long j13 = jVar.f48341c - j12;
        if (this.f50200t != -1) {
            throw null;
        }
        if (j13 >= -30000) {
            return;
        }
        this.f50195H.f49160f++;
        jVar.getClass();
        throw null;
    }

    public final boolean P() throws ExoPlaybackException {
        androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.j, ? extends DecoderException> eVar = this.f50197q;
        if (eVar == null || this.f50188A == 2 || this.f50192E) {
            return false;
        }
        if (this.f50198r == null) {
            DecoderInputBuffer decoderInputBufferA = eVar.a();
            this.f50198r = decoderInputBufferA;
            if (decoderInputBufferA == null) {
                return false;
            }
        }
        if (this.f50188A == 1) {
            DecoderInputBuffer decoderInputBuffer = this.f50198r;
            decoderInputBuffer.f48328b = 4;
            this.f50197q.d(decoderInputBuffer);
            this.f50198r = null;
            this.f50188A = 2;
            return false;
        }
        F f12 = this.f49141d;
        f12.a();
        int iL2 = L(f12, this.f50198r, 0);
        if (iL2 != -5) {
            if (iL2 != -4) {
                if (iL2 == -3) {
                    return false;
                }
                throw new IllegalStateException();
            }
            if (!this.f50198r.f(4)) {
                long j12 = this.f50198r.f48325f;
                throw null;
            }
            this.f50192E = true;
            this.f50197q.d(this.f50198r);
            this.f50198r = null;
            return false;
        }
        C23108t c23108t = f12.f48506b;
        c23108t.getClass();
        DrmSession drmSession = f12.f48505a;
        DrmSession.e(this.f50206z, drmSession);
        this.f50206z = drmSession;
        C23108t c23108t2 = this.f50196p;
        this.f50196p = c23108t;
        androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.j, ? extends DecoderException> eVar2 = this.f50197q;
        if (eVar2 == null) {
            Q();
            throw null;
        }
        if ((drmSession != this.f50205y ? new C23139h(eVar2.getName(), c23108t2, c23108t, 0, 128) : new C23139h(eVar2.getName(), c23108t2, c23108t, 0, 1)).f49173d != 0) {
            throw null;
        }
        if (this.f50189B) {
            this.f50188A = 1;
            throw null;
        }
        R();
        Q();
        throw null;
    }

    public final void Q() throws ExoPlaybackException {
        if (this.f50197q != null) {
            return;
        }
        DrmSession drmSession = this.f50206z;
        DrmSession.e(this.f50205y, drmSession);
        this.f50205y = drmSession;
        if (drmSession != null && drmSession.c() == null && this.f50205y.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f50197q = M();
            S();
            SystemClock.elapsedRealtime();
            this.f50197q.getClass();
            throw null;
        } catch (DecoderException e12) {
            s.d("Video codec error", e12);
            throw null;
        } catch (OutOfMemoryError e13) {
            throw B(e13, this.f50196p, false, 4001);
        }
    }

    @InterfaceC42153i
    public final void R() {
        this.f50198r = null;
        this.f50199s = null;
        this.f50188A = 0;
        this.f50189B = false;
        androidx.media3.decoder.e<DecoderInputBuffer, ? extends androidx.media3.decoder.j, ? extends DecoderException> eVar = this.f50197q;
        if (eVar == null) {
            DrmSession.e(this.f50205y, null);
            this.f50205y = null;
        } else {
            this.f50195H.f49156b++;
            eVar.release();
            this.f50197q.getClass();
            throw null;
        }
    }

    public abstract void S();

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.Y.b
    public final void b(int i12, @P Object obj) {
        if (i12 != 1) {
            if (i12 == 7) {
                this.f50204x = (g) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f50202v = (Surface) obj;
            this.f50200t = 1;
        } else if (obj instanceof f) {
            this.f50203w = (f) obj;
            this.f50200t = 0;
        } else {
            this.f50200t = -1;
            obj = null;
        }
        if (this.f50201u == obj) {
            if (obj != null) {
                if (this.f50193F != null || this.f50190C) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.f50201u = obj;
        if (obj == null) {
            this.f50193F = null;
            this.f50190C = false;
            return;
        }
        if (this.f50197q != null) {
            S();
        }
        if (this.f50193F != null) {
            throw null;
        }
        this.f50190C = false;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        if (this.f50196p == null) {
            return false;
        }
        if (C() || this.f50199s != null) {
            return this.f50190C || this.f50200t == -1;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void o(long j12, long j13) throws ExoPlaybackException {
        if (this.f50196p == null) {
            this.f49141d.a();
            throw null;
        }
        Q();
        if (this.f50197q != null) {
            try {
                H.a("drainAndFeed");
                O(j12);
                P();
                H.b();
                synchronized (this.f50195H) {
                }
            } catch (DecoderException e12) {
                s.d("Video codec error", e12);
                throw null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void K(C23108t[] c23108tArr, long j12, long j13) {
    }
}
