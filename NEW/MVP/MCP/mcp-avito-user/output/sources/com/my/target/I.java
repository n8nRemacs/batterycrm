package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.AbstractC36510e;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.my.target.P0;
import e11.C39916w0;
import e11.W1;

/* loaded from: classes7.dex */
public final class I implements d0.g, P0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final W1 f364402b = new W1(200);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final InterfaceC36534o f364403c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final a f364404d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public P0.a f364405e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public AbstractC36538a f364406f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public Uri f364407g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f364408h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364409i;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final InterfaceC36534o f364410b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public P0.a f364411c;

        /* renamed from: d, reason: collision with root package name */
        public int f364412d;

        /* renamed from: e, reason: collision with root package name */
        public float f364413e;

        public a(@j.N InterfaceC36534o interfaceC36534o) {
            this.f364410b = interfaceC36534o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC36534o interfaceC36534o = this.f364410b;
            try {
                float currentPosition = interfaceC36534o.getCurrentPosition() / 1000.0f;
                float duration = interfaceC36534o.getDuration() / 1000.0f;
                if (this.f364413e == currentPosition) {
                    this.f364412d++;
                } else {
                    P0.a aVar = this.f364411c;
                    if (aVar != null) {
                        aVar.a(currentPosition, duration);
                    }
                    this.f364413e = currentPosition;
                    if (this.f364412d > 0) {
                        this.f364412d = 0;
                    }
                }
                if (this.f364412d > 50) {
                    P0.a aVar2 = this.f364411c;
                    if (aVar2 != null) {
                        aVar2.k();
                    }
                    this.f364412d = 0;
                }
            } catch (Throwable th2) {
                String strI = androidx.camera.camera2.internal.G.i(th2, new StringBuilder("ExoVideoPlayer: Error - "));
                P0.a aVar3 = this.f364411c;
                if (aVar3 != null) {
                    aVar3.a(strI);
                }
            }
        }
    }

    public I(@j.N Context context) {
        InterfaceC36534o interfaceC36534oA = new InterfaceC36534o.c(context).a();
        this.f364403c = interfaceC36534oA;
        interfaceC36534oA.N(this);
        this.f364404d = new a(interfaceC36534oA);
    }

    @Override // com.my.target.P0
    public final void a() {
        try {
            boolean z12 = this.f364408h;
            InterfaceC36534o interfaceC36534o = this.f364403c;
            if (z12) {
                interfaceC36534o.setPlayWhenReady(true);
            } else {
                AbstractC36538a abstractC36538a = this.f364406f;
                if (abstractC36538a != null) {
                    interfaceC36534o.F(abstractC36538a);
                    interfaceC36534o.prepare();
                }
            }
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @Override // com.my.target.P0
    public final void b(@j.P U0 u02) {
        InterfaceC36534o interfaceC36534o = this.f364403c;
        try {
            if (u02 != null) {
                u02.setExoPlayer(interfaceC36534o);
            } else {
                interfaceC36534o.setVideoTextureView(null);
            }
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @Override // com.my.target.P0
    public final void c(@j.N Context context, @j.N Uri uri) {
        this.f364407g = uri;
        this.f364409i = false;
        P0.a aVar = this.f364405e;
        if (aVar != null) {
            aVar.g();
        }
        try {
            this.f364402b.a(this.f364404d);
            InterfaceC36534o interfaceC36534o = this.f364403c;
            interfaceC36534o.setPlayWhenReady(true);
            if (this.f364408h) {
                return;
            }
            AbstractC36538a abstractC36538aA = C39916w0.a(context, uri);
            this.f364406f = abstractC36538aA;
            interfaceC36534o.H(abstractC36538aA);
            interfaceC36534o.prepare();
        } catch (Throwable th2) {
            String strI = androidx.camera.camera2.internal.G.i(th2, new StringBuilder("ExoVideoPlayer: Error - "));
            P0.a aVar2 = this.f364405e;
            if (aVar2 != null) {
                aVar2.a(strI);
            }
        }
    }

    public final void d(@j.N Throwable th2) {
        String strI = androidx.camera.camera2.internal.G.i(th2, new StringBuilder("ExoVideoPlayer: Error - "));
        P0.a aVar = this.f364405e;
        if (aVar != null) {
            aVar.a(strI);
        }
    }

    @Override // com.my.target.P0
    public final void destroy() {
        this.f364407g = null;
        this.f364408h = false;
        this.f364409i = false;
        this.f364405e = null;
        this.f364402b.b(this.f364404d);
        InterfaceC36534o interfaceC36534o = this.f364403c;
        try {
            interfaceC36534o.setVideoTextureView(null);
            interfaceC36534o.x();
            interfaceC36534o.release();
            interfaceC36534o.s(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.my.target.P0
    public final void e() {
        com.google.android.exoplayer2.d0 d0Var = this.f364403c;
        try {
            d0Var.x();
            ((AbstractC36510e) d0Var).I();
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @Override // com.my.target.P0
    public final boolean f() {
        return this.f364408h && !this.f364409i;
    }

    @Override // com.my.target.P0
    public final void h() {
        try {
            setVolume(((double) this.f364403c.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.my.target.P0
    public final boolean i() {
        return this.f364408h && this.f364409i;
    }

    @Override // com.my.target.P0
    public final boolean j() {
        return this.f364408h;
    }

    @Override // com.my.target.P0
    public final void k() {
        com.google.android.exoplayer2.d0 d0Var = this.f364403c;
        try {
            ((AbstractC36510e) d0Var).seekTo(0L);
            d0Var.setPlayWhenReady(true);
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @Override // com.my.target.P0
    public final boolean l() {
        try {
            return this.f364403c.getVolume() == 0.0f;
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    @Override // com.my.target.P0
    public final void m() {
        try {
            this.f364403c.setVolume(1.0f);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        P0.a aVar = this.f364405e;
        if (aVar != null) {
            aVar.a(1.0f);
        }
    }

    @Override // com.my.target.P0
    @j.P
    public final Uri n() {
        return this.f364407g;
    }

    @Override // com.my.target.P0
    public final void o() {
        try {
            this.f364403c.setVolume(0.2f);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerError(@j.P PlaybackException playbackException) {
        this.f364409i = false;
        this.f364408h = false;
        if (this.f364405e != null) {
            StringBuilder sb2 = new StringBuilder("ExoVideoPlayer: Error - ");
            sb2.append(playbackException != null ? playbackException.getMessage() : "unknown video error");
            this.f364405e.a(sb2.toString());
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerStateChanged(boolean z12, int i12) {
        a aVar = this.f364404d;
        W1 w12 = this.f364402b;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                    this.f364409i = false;
                    this.f364408h = false;
                    float fP2 = p();
                    P0.a aVar2 = this.f364405e;
                    if (aVar2 != null) {
                        aVar2.a(fP2, fP2);
                    }
                    P0.a aVar3 = this.f364405e;
                    if (aVar3 != null) {
                        aVar3.onVideoCompleted();
                    }
                } else if (z12) {
                    P0.a aVar4 = this.f364405e;
                    if (aVar4 != null) {
                        aVar4.o();
                    }
                    if (!this.f364408h) {
                        this.f364408h = true;
                    } else if (this.f364409i) {
                        this.f364409i = false;
                        P0.a aVar5 = this.f364405e;
                        if (aVar5 != null) {
                            aVar5.i();
                        }
                    }
                } else if (!this.f364409i) {
                    this.f364409i = true;
                    P0.a aVar6 = this.f364405e;
                    if (aVar6 != null) {
                        aVar6.f();
                    }
                }
            } else if (!z12 || this.f364408h) {
                return;
            }
            w12.a(aVar);
            return;
        }
        if (this.f364408h) {
            this.f364408h = false;
            P0.a aVar7 = this.f364405e;
            if (aVar7 != null) {
                aVar7.j();
            }
        }
        w12.b(aVar);
    }

    @Override // com.my.target.P0
    public final float p() {
        try {
            return this.f364403c.getDuration() / 1000.0f;
        } catch (Throwable th2) {
            th2.getMessage();
            return 0.0f;
        }
    }

    @Override // com.my.target.P0
    public final long q() {
        try {
            return this.f364403c.getCurrentPosition();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0L;
        }
    }

    @Override // com.my.target.P0
    public final void r() {
        try {
            this.f364403c.setVolume(0.0f);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        P0.a aVar = this.f364405e;
        if (aVar != null) {
            aVar.a(0.0f);
        }
    }

    @Override // com.my.target.P0
    public final void setVolume(float f12) {
        try {
            this.f364403c.setVolume(f12);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        P0.a aVar = this.f364405e;
        if (aVar != null) {
            aVar.a(f12);
        }
    }

    @Override // com.my.target.P0
    public final void a(long j12) {
        try {
            ((AbstractC36510e) this.f364403c).seekTo(j12);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.my.target.P0
    public final void b() {
        if (!this.f364408h || this.f364409i) {
            return;
        }
        try {
            this.f364403c.setPlayWhenReady(false);
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @Override // com.my.target.P0
    public final void a(@j.P P0.a aVar) {
        this.f364405e = aVar;
        this.f364404d.f364411c = aVar;
    }
}
