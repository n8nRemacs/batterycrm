package com.my.target;

import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.my.target.P0;
import com.my.target.U0;
import com.my.target.b4;
import e11.C39852a1;
import e11.C39855b1;
import e11.C39913v0;
import e11.L1;
import e11.m2;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public class s1 implements L1, AudioManager.OnAudioFocusChangeListener, P0.a, U0.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final b4 f365132b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39913v0<com.my.target.common.models.e> f365133c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final P0 f365134d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final C39855b1 f365135e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final r1 f365136f;

    /* renamed from: g, reason: collision with root package name */
    public final float f365137g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final U0 f365138h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f365139i;

    public interface a {
    }

    public s1(@j.N C39913v0 c39913v0, @j.N U0 u02, @j.N b4 b4Var, @j.N U u12, @j.N P0 p02) {
        this.f365132b = b4Var;
        this.f365138h = u02;
        this.f365134d = p02;
        u02.setAdVideoViewListener(this);
        this.f365133c = c39913v0;
        C39855b1 c39855b1A = C39855b1.a(c39913v0.f394702a);
        this.f365135e = c39855b1A;
        this.f365136f = new r1(c39913v0, u12.f364614b, u12.f364615c);
        c39855b1A.c(u02);
        this.f365137g = c39913v0.f394724w;
        p02.a(this);
        p02.setVolume(c39913v0.f394862P ? 0.0f : 1.0f);
    }

    @Override // com.my.target.P0.a
    public final void a(float f12) {
        this.f365132b.f364732e.setSoundState(f12 != 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@j.N com.my.target.common.models.e eVar) {
        Uri uri;
        String str = (String) eVar.f394307d;
        int i12 = eVar.f394305b;
        int i13 = eVar.f394306c;
        U0 u02 = this.f365138h;
        u02.b(i12, i13);
        P0 p02 = this.f365134d;
        if (str != null) {
            this.f365139i = true;
            uri = Uri.parse(str);
        } else {
            this.f365139i = false;
            uri = Uri.parse(eVar.f394304a);
        }
        p02.c(u02.getContext(), uri);
    }

    public final void d() {
        AudioManager audioManager = (AudioManager) this.f365138h.getContext().getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
        this.f365134d.b();
    }

    public final void e() {
        AudioManager audioManager;
        com.my.target.common.models.e eVar = (com.my.target.common.models.e) this.f365133c.f394856J;
        this.f365136f.e();
        if (eVar != null) {
            P0 p02 = this.f365134d;
            boolean zL2 = p02.l();
            U0 u02 = this.f365138h;
            if (!zL2 && (audioManager = (AudioManager) u02.getContext().getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            p02.a(this);
            p02.b(u02);
            b(eVar);
        }
    }

    @Override // com.my.target.P0.a
    public final void f() {
        N0 n02 = this.f365132b.f364732e;
        n02.e(true);
        n02.a(0, null);
        n02.d(false);
    }

    @Override // com.my.target.P0.a
    public final void g() {
        this.f365132b.d();
    }

    @Override // com.my.target.P0.a
    public final void i() {
        N0 n02 = this.f365132b.f364732e;
        n02.e(false);
        n02.b(false);
        n02.g();
        n02.d(false);
    }

    @Override // com.my.target.P0.a
    public final void k() {
        this.f365136f.h();
        this.f365132b.c();
        P0 p02 = this.f365134d;
        p02.e();
        p02.destroy();
    }

    @Override // com.my.target.P0.a
    public final void o() {
        b4 b4Var = this.f365132b;
        N0 n02 = b4Var.f364732e;
        n02.e(false);
        n02.b(false);
        n02.g();
        n02.d(false);
        b4Var.f364734g.setVisible(true);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i12) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            m2.d(new androidx.camera.video.internal.audio.q(i12, 21, this));
        } else if (i12 == -2 || i12 == -1) {
            d();
        }
    }

    @Override // com.my.target.P0.a
    public final void onVideoCompleted() {
        b4 b4Var = this.f365132b;
        C39913v0<com.my.target.common.models.e> c39913v0 = b4Var.f364729b.f394673N;
        N0 n02 = b4Var.f364732e;
        if (c39913v0 != null) {
            if (c39913v0.f394865S) {
                n02.a(2, !TextUtils.isEmpty(c39913v0.f394860N) ? c39913v0.f394860N : null);
                n02.e(true);
            } else {
                b4Var.f364744q = true;
            }
        }
        n02.b(true);
        n02.d(false);
        C39852a1 c39852a1 = b4Var.f364734g;
        c39852a1.setVisible(false);
        c39852a1.setTimeChanged(0.0f);
        b4Var.f364731d.h(n02.getContext());
        b4Var.e();
        this.f365134d.e();
    }

    @Override // com.my.target.U0.a
    public final void p() {
        P0 p02 = this.f365134d;
        if (!(p02 instanceof I)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        U0 u02 = this.f365138h;
        u02.setViewMode(1);
        p02.b(u02);
        com.my.target.common.models.e eVar = (com.my.target.common.models.e) this.f365133c.f394856J;
        if (!p02.f() || eVar == null) {
            return;
        }
        if (eVar.f394307d != 0) {
            this.f365139i = true;
        }
        b(eVar);
    }

    @Override // com.my.target.P0.a
    public final void a(float f12, float f13) {
        float f14 = this.f365137g;
        if (f12 > f14) {
            a(f13, f14);
            return;
        }
        if (f12 != 0.0f) {
            b4 b4Var = this.f365132b;
            if (b4Var.f364740m == b4.a.f364747d) {
                b4Var.f364741n = (long) (b4Var.f364742o - (1000.0f * f12));
            }
            b4Var.f364734g.setTimeChanged(f12);
            this.f365136f.a(f12, f13);
            this.f365135e.b(f12, f13);
        }
        if (f12 == f13) {
            P0 p02 = this.f365134d;
            if (p02.f()) {
                onVideoCompleted();
            }
            p02.e();
        }
    }

    @Override // com.my.target.P0.a
    public final void a(@j.N String str) {
        this.f365136f.g();
        boolean z12 = this.f365139i;
        P0 p02 = this.f365134d;
        if (z12) {
            this.f365139i = false;
            com.my.target.common.models.e eVar = (com.my.target.common.models.e) this.f365133c.f394856J;
            if (eVar != null) {
                p02.c(this.f365138h.getContext(), Uri.parse(eVar.f394304a));
                return;
            }
        }
        this.f365132b.c();
        p02.e();
        p02.destroy();
    }

    @Override // com.my.target.P0.a
    public final void j() {
    }
}
