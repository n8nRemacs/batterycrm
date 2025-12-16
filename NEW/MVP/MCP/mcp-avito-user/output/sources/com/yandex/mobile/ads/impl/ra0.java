package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* loaded from: classes8.dex */
public final class ra0 implements Inroll, Pauseroll, vb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final p60 f389451a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ua0 f389452b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ya0 f389453c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vf1 f389454d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final x40 f389455e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private ta0 f389456f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private InstreamAdPlayer f389457g;

    public ra0(@j.N Context context, @j.N p60 p60Var, @j.N C39304a2 c39304a2) {
        this.f389451a = p60Var;
        ya0 ya0Var = new ya0();
        this.f389453c = ya0Var;
        this.f389452b = new ua0(context, p60Var, c39304a2, ya0Var);
        this.f389454d = new vf1();
        this.f389455e = new x40(this);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @j.N
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f389451a;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f389457g;
        if (instreamAdPlayer != null) {
            this.f389455e.b(instreamAdPlayer);
        }
        this.f389456f = null;
        this.f389457g = null;
    }

    @Override // com.yandex.mobile.ads.impl.vb1
    public final void invalidateAdPlayer() {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f389457g;
        if (instreamAdPlayer != null) {
            this.f389455e.b(instreamAdPlayer);
        }
        this.f389456f = null;
        this.f389457g = null;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@j.N InstreamAdView instreamAdView) {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.a(instreamAdView);
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@j.N InstreamAdPlayer instreamAdPlayer) {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.a();
        }
        InstreamAdPlayer instreamAdPlayer2 = this.f389457g;
        if (instreamAdPlayer2 != null) {
            this.f389455e.b(instreamAdPlayer2);
        }
        this.f389456f = null;
        this.f389457g = instreamAdPlayer;
        this.f389455e.a(instreamAdPlayer);
        ta0 ta0VarA = this.f389452b.a(instreamAdPlayer);
        this.f389456f = ta0VarA;
        ta0VarA.a(this.f389454d);
        this.f389456f.c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        ta0 ta0Var = this.f389456f;
        if (ta0Var != null) {
            ta0Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@j.P InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f389453c.a(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@j.P VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f389454d.a(videoAdPlaybackListener);
    }
}
