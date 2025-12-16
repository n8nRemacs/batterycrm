package com.google.android.exoplayer2.video;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.util.C36605v;
import j.InterfaceC42153i;
import j.P;

/* compiled from: DecoderVideoRenderer.java */
/* loaded from: classes6.dex */
public abstract class c extends AbstractC36523f {

    /* renamed from: A, reason: collision with root package name */
    public boolean f348192A;

    /* renamed from: B, reason: collision with root package name */
    public long f348193B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f348194C;

    /* renamed from: D, reason: collision with root package name */
    @P
    public o f348195D;

    /* renamed from: E, reason: collision with root package name */
    public int f348196E;

    /* renamed from: F, reason: collision with root package name */
    public com.google.android.exoplayer2.decoder.f f348197F;

    /* renamed from: n, reason: collision with root package name */
    public I f348198n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException> f348199o;

    /* renamed from: p, reason: collision with root package name */
    public DecoderInputBuffer f348200p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.exoplayer2.decoder.l f348201q;

    /* renamed from: r, reason: collision with root package name */
    public int f348202r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public Object f348203s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public Surface f348204t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public i f348205u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public j f348206v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public DrmSession f348207w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public DrmSession f348208x;

    /* renamed from: y, reason: collision with root package name */
    public int f348209y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f348210z;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // com.google.android.exoplayer2.AbstractC36523f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r2 = this;
            r0 = 0
            r2.f348198n = r0
            r2.f348195D = r0
            r1 = 0
            r2.f348192A = r1
            com.google.android.exoplayer2.drm.DrmSession r1 = r2.f348208x     // Catch: java.lang.Throwable -> L13
            com.google.android.exoplayer2.drm.DrmSession.g(r1, r0)     // Catch: java.lang.Throwable -> L13
            r2.f348208x = r0     // Catch: java.lang.Throwable -> L13
            r2.O()     // Catch: java.lang.Throwable -> L13
            throw r0
        L13:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.B():void");
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void C(boolean z12, boolean z13) {
        this.f348197F = new com.google.android.exoplayer2.decoder.f();
        throw null;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) throws ExoPlaybackException {
        this.f348194C = false;
        this.f348192A = false;
        this.f348193B = -9223372036854775807L;
        com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException> eVar = this.f348199o;
        if (eVar == null) {
            throw null;
        }
        if (this.f348209y != 0) {
            O();
            M();
            throw null;
        }
        this.f348200p = null;
        if (this.f348201q != null) {
            throw null;
        }
        eVar.flush();
        this.f348210z = false;
        throw null;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void F() {
        this.f348196E = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void G() {
        if (this.f348196E <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    public abstract com.google.android.exoplayer2.decoder.e J();

    public final void K(long j12) throws ExoPlaybackException {
        if (this.f348201q == null) {
            com.google.android.exoplayer2.decoder.l lVarB = this.f348199o.b();
            this.f348201q = lVarB;
            if (lVarB == null) {
                return;
            }
            this.f348197F.f344228f += lVarB.f344236d;
        }
        if (this.f348201q.f(4)) {
            if (this.f348209y != 2) {
                this.f348201q.getClass();
                throw null;
            }
            O();
            M();
            return;
        }
        if (this.f348193B == -9223372036854775807L) {
            this.f348193B = j12;
        }
        com.google.android.exoplayer2.decoder.l lVar = this.f348201q;
        long j13 = lVar.f344235c - j12;
        if (this.f348202r != -1) {
            throw null;
        }
        if (j13 >= -30000) {
            return;
        }
        this.f348197F.f344228f++;
        lVar.getClass();
        throw null;
    }

    public final boolean L() throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException> eVar = this.f348199o;
        if (eVar == null || this.f348209y == 2 || this.f348194C) {
            return false;
        }
        if (this.f348200p == null) {
            DecoderInputBuffer decoderInputBufferA = eVar.a();
            this.f348200p = decoderInputBufferA;
            if (decoderInputBufferA == null) {
                return false;
            }
        }
        if (this.f348209y == 1) {
            DecoderInputBuffer decoderInputBuffer = this.f348200p;
            decoderInputBuffer.f344210b = 4;
            this.f348199o.d(decoderInputBuffer);
            this.f348200p = null;
            this.f348209y = 2;
            return false;
        }
        J j12 = this.f345397c;
        j12.a();
        int I12 = I(j12, this.f348200p, 0);
        if (I12 != -5) {
            if (I12 != -4) {
                if (I12 == -3) {
                    return false;
                }
                throw new IllegalStateException();
            }
            if (!this.f348200p.f(4)) {
                long j13 = this.f348200p.f344207f;
                throw null;
            }
            this.f348194C = true;
            this.f348199o.d(this.f348200p);
            this.f348200p = null;
            return false;
        }
        I i12 = j12.f343521b;
        i12.getClass();
        DrmSession drmSession = j12.f343520a;
        DrmSession.g(this.f348208x, drmSession);
        this.f348208x = drmSession;
        I i13 = this.f348198n;
        this.f348198n = i12;
        com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException> eVar2 = this.f348199o;
        if (eVar2 == null) {
            M();
            throw null;
        }
        if ((drmSession != this.f348207w ? new com.google.android.exoplayer2.decoder.h(eVar2.getName(), i13, i12, 0, 128) : new com.google.android.exoplayer2.decoder.h(eVar2.getName(), i13, i12, 0, 1)).f344240d != 0) {
            throw null;
        }
        if (this.f348210z) {
            this.f348209y = 1;
            throw null;
        }
        O();
        M();
        throw null;
    }

    public final void M() throws ExoPlaybackException {
        if (this.f348199o != null) {
            return;
        }
        DrmSession drmSession = this.f348208x;
        DrmSession.g(this.f348207w, drmSession);
        this.f348207w = drmSession;
        if (drmSession != null && drmSession.c() == null && this.f348207w.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f348199o = J();
            P();
            SystemClock.elapsedRealtime();
            this.f348199o.getClass();
            throw null;
        } catch (DecoderException e12) {
            C36605v.a("Video codec error", e12);
            throw null;
        } catch (OutOfMemoryError e13) {
            throw z(e13, this.f348198n, false, 4001);
        }
    }

    @InterfaceC42153i
    public final void O() {
        this.f348200p = null;
        this.f348201q = null;
        this.f348209y = 0;
        this.f348210z = false;
        com.google.android.exoplayer2.decoder.e<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException> eVar = this.f348199o;
        if (eVar == null) {
            DrmSession.g(this.f348207w, null);
            this.f348207w = null;
        } else {
            this.f348197F.f344224b++;
            eVar.release();
            this.f348199o.getClass();
            throw null;
        }
    }

    public abstract void P();

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.e0.b
    public final void b(int i12, @P Object obj) {
        if (i12 != 1) {
            if (i12 == 7) {
                this.f348206v = (j) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f348204t = (Surface) obj;
            this.f348202r = 1;
        } else if (obj instanceof i) {
            this.f348205u = (i) obj;
            this.f348202r = 0;
        } else {
            this.f348202r = -1;
            obj = null;
        }
        if (this.f348203s == obj) {
            if (obj != null) {
                if (this.f348195D != null || this.f348192A) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.f348203s = obj;
        if (obj == null) {
            this.f348195D = null;
            this.f348192A = false;
            return;
        }
        if (this.f348199o != null) {
            P();
        }
        if (this.f348195D != null) {
            throw null;
        }
        this.f348192A = false;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        if (this.f348198n == null) {
            return false;
        }
        if (A() || this.f348201q != null) {
            return this.f348192A || this.f348202r == -1;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void o(long j12, long j13) throws ExoPlaybackException {
        if (this.f348198n == null) {
            this.f345397c.a();
            throw null;
        }
        M();
        if (this.f348199o != null) {
            try {
                com.google.android.exoplayer2.util.P.a("drainAndFeed");
                K(j12);
                L();
                com.google.android.exoplayer2.util.P.b();
                synchronized (this.f348197F) {
                }
            } catch (DecoderException e12) {
                C36605v.a("Video codec error", e12);
                throw null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void H(I[] iArr, long j12, long j13) {
    }
}
