package androidx.media3.exoplayer;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;

/* compiled from: NoSampleRenderer.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public abstract class W implements c0, d0 {

    /* renamed from: b, reason: collision with root package name */
    public int f48589b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public androidx.media3.exoplayer.source.P f48590c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48591d;

    @Override // androidx.media3.exoplayer.c0
    public final void A(e0 e0Var, C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, boolean z12, boolean z13, long j13, long j14) {
        C23110a.g(this.f48589b == 0);
        this.f48589b = 1;
        y(c23108tArr, p12, j13, j14);
    }

    @Override // androidx.media3.exoplayer.c0
    public final void N() {
        C23110a.g(this.f48589b == 1);
        this.f48589b = 0;
        this.f48590c = null;
        this.f48591d = false;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean a() {
        return true;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int f() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.c0
    public final int getState() {
        return this.f48589b;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) {
        return d0.e(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.c0
    @j.P
    public final androidx.media3.exoplayer.source.P l() {
        return this.f48590c;
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final int m() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final long p() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void q() {
        this.f48591d = true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void reset() {
        C23110a.g(this.f48589b == 0);
    }

    @Override // androidx.media3.exoplayer.c0
    public final void start() {
        C23110a.g(this.f48589b == 1);
        this.f48589b = 2;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void stop() {
        C23110a.g(this.f48589b == 2);
        this.f48589b = 1;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean t() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean u() {
        return this.f48591d;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void v(long j12) {
        this.f48591d = false;
    }

    @Override // androidx.media3.exoplayer.c0
    @j.P
    public final I w() {
        return null;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void y(C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, long j13) {
        C23110a.g(!this.f48591d);
        this.f48590c = p12;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void r() {
    }

    @Override // androidx.media3.exoplayer.c0
    public final d0 s() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Y.b
    public final void b(int i12, @j.P Object obj) {
    }

    @Override // androidx.media3.exoplayer.c0
    public final void z(int i12, androidx.media3.exoplayer.analytics.w wVar) {
    }
}
