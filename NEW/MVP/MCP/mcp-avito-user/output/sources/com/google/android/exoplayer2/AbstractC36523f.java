package com.google.android.exoplayer2;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: BaseRenderer.java */
/* renamed from: com.google.android.exoplayer2.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36523f implements h0, i0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f345396b;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public j0 f345398d;

    /* renamed from: e, reason: collision with root package name */
    public int f345399e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.analytics.p f345400f;

    /* renamed from: g, reason: collision with root package name */
    public int f345401g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.source.M f345402h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public I[] f345403i;

    /* renamed from: j, reason: collision with root package name */
    public long f345404j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f345406l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f345407m;

    /* renamed from: c, reason: collision with root package name */
    public final J f345397c = new J();

    /* renamed from: k, reason: collision with root package name */
    public long f345405k = Long.MIN_VALUE;

    public AbstractC36523f(int i12) {
        this.f345396b = i12;
    }

    public final boolean A() {
        if (t()) {
            return this.f345406l;
        }
        com.google.android.exoplayer2.source.M m12 = this.f345402h;
        m12.getClass();
        return m12.n();
    }

    public final int I(J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
        com.google.android.exoplayer2.source.M m12 = this.f345402h;
        m12.getClass();
        int iG2 = m12.g(j12, decoderInputBuffer, i12);
        if (iG2 == -4) {
            if (decoderInputBuffer.f(4)) {
                this.f345405k = Long.MIN_VALUE;
                return this.f345406l ? -4 : -3;
            }
            long j13 = decoderInputBuffer.f344207f + this.f345404j;
            decoderInputBuffer.f344207f = j13;
            this.f345405k = Math.max(this.f345405k, j13);
        } else if (iG2 == -5) {
            I i13 = j12.f343521b;
            i13.getClass();
            long j14 = i13.f343480q;
            if (j14 != Long.MAX_VALUE) {
                I.b bVarA = i13.a();
                bVarA.f343508o = j14 + this.f345404j;
                j12.f343521b = bVarA.a();
            }
        }
        return iG2;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void N() {
        C36585a.d(this.f345401g == 1);
        this.f345397c.a();
        this.f345401g = 0;
        this.f345402h = null;
        this.f345403i = null;
        this.f345406l = false;
        B();
    }

    @Override // com.google.android.exoplayer2.h0
    public boolean a() {
        return t();
    }

    @Override // com.google.android.exoplayer2.i0
    public int f() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.h0
    public final int getState() {
        return this.f345401g;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void i(int i12, com.google.android.exoplayer2.analytics.p pVar) {
        this.f345399e = i12;
        this.f345400f = pVar;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void j(I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, long j13) {
        C36585a.d(!this.f345406l);
        this.f345402h = m12;
        if (this.f345405k == Long.MIN_VALUE) {
            this.f345405k = j12;
        }
        this.f345403i = iArr;
        this.f345404j = j13;
        H(iArr, j12, j13);
    }

    @Override // com.google.android.exoplayer2.h0
    public final void k(j0 j0Var, I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, boolean z12, boolean z13, long j13, long j14) {
        C36585a.d(this.f345401g == 0);
        this.f345398d = j0Var;
        this.f345401g = 1;
        C(z12, z13);
        j(iArr, m12, j13, j14);
        this.f345406l = false;
        this.f345405k = j12;
        D(j12, z12);
    }

    @Override // com.google.android.exoplayer2.h0
    @j.P
    public final com.google.android.exoplayer2.source.M l() {
        return this.f345402h;
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final int m() {
        return this.f345396b;
    }

    @Override // com.google.android.exoplayer2.h0
    public final long p() {
        return this.f345405k;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void q() {
        this.f345406l = true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void r() {
        com.google.android.exoplayer2.source.M m12 = this.f345402h;
        m12.getClass();
        m12.c();
    }

    @Override // com.google.android.exoplayer2.h0
    public final void reset() {
        C36585a.d(this.f345401g == 0);
        this.f345397c.a();
        E();
    }

    @Override // com.google.android.exoplayer2.h0
    public final void start() {
        C36585a.d(this.f345401g == 1);
        this.f345401g = 2;
        F();
    }

    @Override // com.google.android.exoplayer2.h0
    public final void stop() {
        C36585a.d(this.f345401g == 2);
        this.f345401g = 1;
        G();
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean t() {
        return this.f345405k == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean u() {
        return this.f345406l;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void v(long j12) {
        this.f345406l = false;
        this.f345405k = j12;
        D(j12, false);
    }

    @Override // com.google.android.exoplayer2.h0
    @j.P
    public com.google.android.exoplayer2.util.x w() {
        return null;
    }

    public final ExoPlaybackException z(Throwable th2, @j.P I i12, boolean z12, int i13) {
        int iY2;
        if (i12 == null || this.f345407m) {
            iY2 = 4;
        } else {
            this.f345407m = true;
            try {
                iY2 = y(i12) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f345407m = false;
            }
        }
        return new ExoPlaybackException(1, th2, i13, getName(), this.f345399e, i12, i12 == null ? 4 : iY2, z12);
    }

    public void B() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    @Override // com.google.android.exoplayer2.h0
    public final i0 s() {
        return this;
    }

    public void C(boolean z12, boolean z13) {
    }

    public void D(long j12, boolean z12) {
    }

    @Override // com.google.android.exoplayer2.e0.b
    public void b(int i12, @j.P Object obj) {
    }

    public void H(I[] iArr, long j12, long j13) {
    }
}
