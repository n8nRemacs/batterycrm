package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;

/* compiled from: NoSampleRenderer.java */
/* loaded from: classes6.dex */
public abstract class Z implements h0, i0 {

    /* renamed from: b, reason: collision with root package name */
    public int f343736b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.source.M f343737c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f343738d;

    @Override // com.google.android.exoplayer2.h0
    public final void N() {
        C36585a.d(this.f343736b == 1);
        this.f343736b = 0;
        this.f343737c = null;
        this.f343738d = false;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.exoplayer2.i0
    public final int f() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.h0
    public final int getState() {
        return this.f343736b;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void j(I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, long j13) {
        C36585a.d(!this.f343738d);
        this.f343737c = m12;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void k(j0 j0Var, I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, boolean z12, boolean z13, long j13, long j14) {
        C36585a.d(this.f343736b == 0);
        this.f343736b = 1;
        j(iArr, m12, j13, j14);
    }

    @Override // com.google.android.exoplayer2.h0
    @j.P
    public final com.google.android.exoplayer2.source.M l() {
        return this.f343737c;
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final int m() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final long p() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void q() {
        this.f343738d = true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void reset() {
        C36585a.d(this.f343736b == 0);
    }

    @Override // com.google.android.exoplayer2.h0
    public final void start() {
        C36585a.d(this.f343736b == 1);
        this.f343736b = 2;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void stop() {
        C36585a.d(this.f343736b == 2);
        this.f343736b = 1;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean t() {
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean u() {
        return this.f343738d;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void v(long j12) {
        this.f343738d = false;
    }

    @Override // com.google.android.exoplayer2.h0
    @j.P
    public final com.google.android.exoplayer2.util.x w() {
        return null;
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) {
        return i0.e(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.h0
    public final void r() {
    }

    @Override // com.google.android.exoplayer2.h0
    public final i0 s() {
        return this;
    }

    @Override // com.google.android.exoplayer2.e0.b
    public final void b(int i12, @j.P Object obj) {
    }

    @Override // com.google.android.exoplayer2.h0
    public final void i(int i12, com.google.android.exoplayer2.analytics.p pVar) {
    }
}
