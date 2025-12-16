package androidx.media3.exoplayer;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.d0;

/* compiled from: BaseRenderer.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23136e implements c0, d0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f49140c;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public e0 f49142e;

    /* renamed from: f, reason: collision with root package name */
    public int f49143f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.exoplayer.analytics.w f49144g;

    /* renamed from: h, reason: collision with root package name */
    public int f49145h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public androidx.media3.exoplayer.source.P f49146i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public C23108t[] f49147j;

    /* renamed from: k, reason: collision with root package name */
    public long f49148k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f49150m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f49151n;

    /* renamed from: o, reason: collision with root package name */
    @j.B
    @j.P
    public d0.f f49152o;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49139b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final F f49141d = new F();

    /* renamed from: l, reason: collision with root package name */
    public long f49149l = Long.MIN_VALUE;

    public AbstractC23136e(int i12) {
        this.f49140c = i12;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void A(e0 e0Var, C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, boolean z12, boolean z13, long j13, long j14) {
        C23110a.g(this.f49145h == 0);
        this.f49142e = e0Var;
        this.f49145h = 1;
        E(z12, z13);
        y(c23108tArr, p12, j13, j14);
        this.f49150m = false;
        this.f49149l = j12;
        F(j12, z12);
    }

    public final ExoPlaybackException B(Throwable th2, @j.P C23108t c23108t, boolean z12, int i12) {
        int i13;
        if (c23108t == null || this.f49151n) {
            i13 = 4;
        } else {
            this.f49151n = true;
            try {
                i13 = i(c23108t) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f49151n = false;
            }
        }
        return new ExoPlaybackException(1, th2, i12, getName(), this.f49143f, c23108t, c23108t == null ? 4 : i13, z12);
    }

    public final boolean C() {
        if (t()) {
            return this.f49150m;
        }
        androidx.media3.exoplayer.source.P p12 = this.f49146i;
        p12.getClass();
        return p12.n();
    }

    public final int L(F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
        androidx.media3.exoplayer.source.P p12 = this.f49146i;
        p12.getClass();
        int iE2 = p12.e(f12, decoderInputBuffer, i12);
        if (iE2 == -4) {
            if (decoderInputBuffer.f(4)) {
                this.f49149l = Long.MIN_VALUE;
                return this.f49150m ? -4 : -3;
            }
            long j12 = decoderInputBuffer.f48325f + this.f49148k;
            decoderInputBuffer.f48325f = j12;
            this.f49149l = Math.max(this.f49149l, j12);
        } else if (iE2 == -5) {
            C23108t c23108t = f12.f48506b;
            c23108t.getClass();
            long j13 = c23108t.f47761q;
            if (j13 != Long.MAX_VALUE) {
                C23108t.b bVarA = c23108t.a();
                bVarA.f47791o = j13 + this.f49148k;
                f12.f48506b = bVarA.a();
            }
        }
        return iE2;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void N() {
        C23110a.g(this.f49145h == 1);
        this.f49141d.a();
        this.f49145h = 0;
        this.f49146i = null;
        this.f49147j = null;
        this.f49150m = false;
        D();
    }

    @Override // androidx.media3.exoplayer.c0
    public boolean a() {
        return t();
    }

    @Override // androidx.media3.exoplayer.d0
    public int f() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.c0
    public final int getState() {
        return this.f49145h;
    }

    @Override // androidx.media3.exoplayer.d0
    public final void j() {
        synchronized (this.f49139b) {
            this.f49152o = null;
        }
    }

    @Override // androidx.media3.exoplayer.d0
    public final void k(d0.f fVar) {
        synchronized (this.f49139b) {
            this.f49152o = fVar;
        }
    }

    @Override // androidx.media3.exoplayer.c0
    @j.P
    public final androidx.media3.exoplayer.source.P l() {
        return this.f49146i;
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final int m() {
        return this.f49140c;
    }

    @Override // androidx.media3.exoplayer.c0
    public final long p() {
        return this.f49149l;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void q() {
        this.f49150m = true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void r() {
        androidx.media3.exoplayer.source.P p12 = this.f49146i;
        p12.getClass();
        p12.c();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void release() {
        C23110a.g(this.f49145h == 0);
        G();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void reset() {
        C23110a.g(this.f49145h == 0);
        this.f49141d.a();
        H();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void start() {
        C23110a.g(this.f49145h == 1);
        this.f49145h = 2;
        I();
    }

    @Override // androidx.media3.exoplayer.c0
    public final void stop() {
        C23110a.g(this.f49145h == 2);
        this.f49145h = 1;
        J();
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean t() {
        return this.f49149l == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean u() {
        return this.f49150m;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void v(long j12) {
        this.f49150m = false;
        this.f49149l = j12;
        F(j12, false);
    }

    @Override // androidx.media3.exoplayer.c0
    @j.P
    public I w() {
        return null;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void y(C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, long j13) {
        C23110a.g(!this.f49150m);
        this.f49146i = p12;
        if (this.f49149l == Long.MIN_VALUE) {
            this.f49149l = j12;
        }
        this.f49147j = c23108tArr;
        this.f49148k = j13;
        K(c23108tArr, j12, j13);
    }

    @Override // androidx.media3.exoplayer.c0
    public final void z(int i12, androidx.media3.exoplayer.analytics.w wVar) {
        this.f49143f = i12;
        this.f49144g = wVar;
    }

    public void D() {
    }

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    @Override // androidx.media3.exoplayer.c0
    public final d0 s() {
        return this;
    }

    public void E(boolean z12, boolean z13) {
    }

    public void F(long j12, boolean z12) {
    }

    @Override // androidx.media3.exoplayer.Y.b
    public void b(int i12, @j.P Object obj) {
    }

    public void K(C23108t[] c23108tArr, long j12, long j13) {
    }
}
