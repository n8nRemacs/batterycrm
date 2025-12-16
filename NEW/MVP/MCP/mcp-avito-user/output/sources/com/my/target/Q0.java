package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.view.ViewGroup;
import com.my.target.X;
import com.my.target.Y;
import e11.C39855b1;
import e11.C39872h0;
import e11.C39913v0;
import e11.m2;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public class Q0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39913v0<com.my.target.common.models.e> f364521a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final a f364522b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ViewGroup f364523c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39855b1 f364524d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final r1 f364525e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final X.a f364526f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final com.my.target.ads.a f364527g;

    /* renamed from: h, reason: collision with root package name */
    public float f364528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364529i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364530j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364531k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364532l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364533m = true;

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(@j.N C39872h0 c39872h0, @j.N C39913v0 c39913v0, @j.N InterfaceC37806q interfaceC37806q, @j.N X.a aVar, @j.N com.my.target.ads.a aVar2) {
        this.f364521a = c39913v0;
        this.f364526f = aVar;
        this.f364527g = aVar2;
        a aVar3 = new a();
        this.f364522b = aVar3;
        this.f364523c = (ViewGroup) interfaceC37806q;
        interfaceC37806q.setMediaListener(aVar3);
        C39855b1 c39855b1A = C39855b1.a(c39913v0.f394702a);
        this.f364524d = c39855b1A;
        c39855b1A.c(interfaceC37806q.getPromoMediaView());
        this.f364525e = new r1(c39913v0, c39872h0.f394604a, c39872h0.f394605b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewGroup, com.my.target.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
    public static void b(Q0 q02, int i12) {
        q02.getClass();
        if (i12 == -3) {
            if (q02.f364529i) {
                return;
            }
            q02.f364523c.a(1);
            return;
        }
        if (i12 != -2 && i12 != -1) {
            if ((i12 == 1 || i12 == 2 || i12 == 4) && !q02.f364529i) {
                q02.e();
                return;
            }
            return;
        }
        ?? r32 = q02.f364523c;
        r32.b();
        q02.a(r32.getView().getContext());
        if (!r32.f() || r32.i()) {
            return;
        }
        q02.f364525e.f();
    }

    public final void a(@j.N Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f364522b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
    public final void c() {
        ?? r02 = this.f364523c;
        a(r02.getView().getContext());
        r02.destroy();
    }

    public final void d(@j.N Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f364522b, 3, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
    public final void e() {
        ?? r02 = this.f364523c;
        if (r02.f()) {
            d(r02.getView().getContext());
        }
        r02.a(2);
    }

    public class a implements Y.a {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        public final void a() {
            Q0 q02 = Q0.this;
            boolean z12 = q02.f364529i;
            r1 r1Var = q02.f364525e;
            if (z12) {
                q02.e();
                r1Var.d(true);
                q02.f364529i = false;
            } else {
                ?? r12 = q02.f364523c;
                q02.a(r12.getView().getContext());
                r12.a(0);
                r1Var.d(false);
                q02.f364529i = true;
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.my.target.q] */
        @Override // com.my.target.Y.a
        public final void b() {
            Q0 q02 = Q0.this;
            q02.f364523c.c(q02.f364533m);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, com.my.target.q] */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.my.target.v] */
        @Override // com.my.target.Y.a
        public final void c() {
            Q0 q02 = Q0.this;
            q02.a(q02.f364523c.getView().getContext());
            q02.f364525e.f();
            q02.f364523c.b();
        }

        @Override // com.my.target.P0.a
        public final void k() {
            Q0 q02 = Q0.this;
            q02.f364525e.h();
            q02.c();
            q02.f364527g.f();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        @Override // com.my.target.Y.a
        public final void l() {
            Q0 q02 = Q0.this;
            boolean z12 = q02.f364529i;
            ?? r22 = q02.f364523c;
            if (!z12) {
                q02.d(r22.getView().getContext());
            }
            r22.c(q02.f364533m);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        @Override // com.my.target.Y.a
        public final void n() {
            Q0 q02 = Q0.this;
            q02.f364525e.i();
            ?? r12 = q02.f364523c;
            r12.a();
            if (!q02.f364529i) {
                q02.e();
            } else {
                q02.a(r12.getView().getContext());
                r12.a(0);
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        @Override // com.my.target.P0.a
        public final void o() {
            Q0 q02 = Q0.this;
            boolean z12 = q02.f364530j;
            ?? r22 = q02.f364523c;
            if (z12 && q02.f364521a.f394872Z == 0.0f) {
                r22.d();
            }
            r22.c();
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i12) {
            if (Looper.getMainLooper().isCurrentThread()) {
                Q0.b(Q0.this, i12);
            } else {
                m2.d(new androidx.camera.video.internal.audio.q(i12, 20, this));
            }
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        @Override // com.my.target.P0.a
        public final void onVideoCompleted() {
            Q0 q02 = Q0.this;
            if (q02.f364532l) {
                return;
            }
            q02.f364532l = true;
            ?? r12 = q02.f364523c;
            r12.d();
            q02.a(r12.getView().getContext());
            r12.a(q02.f364521a.f394865S);
            q02.f364526f.h(r12.getView().getContext());
            r12.d();
            r12.e();
            q02.f364525e.e();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, com.my.target.q] */
        @Override // com.my.target.P0.a
        public final void a(float f12) {
            Q0.this.f364523c.b(f12 <= 0.0f);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.my.target.q] */
        /* JADX WARN: Type inference failed for: r1v10, types: [android.view.ViewGroup, com.my.target.v] */
        @Override // com.my.target.P0.a
        public final void a(float f12, float f13) {
            Q0 q02 = Q0.this;
            q02.f364523c.setTimeChanged(f12);
            q02.f364532l = false;
            if (!q02.f364531k) {
                q02.f364531k = true;
            }
            if (q02.f364530j) {
                C39913v0<com.my.target.common.models.e> c39913v0 = q02.f364521a;
                if (c39913v0.f394863Q && c39913v0.f394872Z <= f12) {
                    q02.f364523c.d();
                }
            }
            float f14 = q02.f364528h;
            if (f12 > f14) {
                a(f14, f14);
                return;
            }
            q02.f364524d.b(f12, f13);
            q02.f364525e.a(f12, f13);
            if (f12 == q02.f364528h) {
                onVideoCompleted();
            }
        }

        @Override // com.my.target.P0.a
        public final void f() {
        }

        @Override // com.my.target.P0.a
        public final void g() {
        }

        @Override // com.my.target.P0.a
        public final void i() {
        }

        @Override // com.my.target.P0.a
        public final void j() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewGroup, com.my.target.q] */
        @Override // com.my.target.P0.a
        public final void a(@j.N String str) {
            Q0 q02 = Q0.this;
            q02.f364525e.g();
            if (q02.f364533m) {
                q02.f364533m = false;
                q02.f364523c.c(false);
            } else {
                q02.c();
                q02.f364527g.f();
            }
        }
    }
}
