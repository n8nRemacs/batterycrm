package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.df1;
import com.yandex.mobile.ads.impl.g40;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.h40;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.oe1;
import com.yandex.mobile.ads.impl.pe1;
import com.yandex.mobile.ads.impl.re1;
import com.yandex.mobile.ads.impl.v40;
import com.yandex.mobile.ads.impl.vb1;
import com.yandex.mobile.ads.impl.x40;
import com.yandex.mobile.ads.impl.xf1;
import com.yandex.mobile.ads.impl.y60;
import com.yandex.mobile.ads.impl.yf1;
import com.yandex.mobile.ads.impl.yk;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import j.K;
import j.N;
import j.P;
import java.util.Collections;
import java.util.List;

@K
/* loaded from: classes8.dex */
public class InstreamAdBinder implements vb1 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final InstreamAdPlayer f392459a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final VideoPlayer f392460b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final g60 f392461c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final c f392462d;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final h40 f392463e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private final x40 f392464f;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final y60 f392465g;

    /* renamed from: h, reason: collision with root package name */
    @N
    private final g40 f392466h;

    /* renamed from: i, reason: collision with root package name */
    @N
    private final re1 f392467i;

    /* renamed from: j, reason: collision with root package name */
    @N
    private final yf1 f392468j;

    public InstreamAdBinder(@N Context context, @N InstreamAd instreamAd, @N InstreamAdPlayer instreamAdPlayer, @N VideoPlayer videoPlayer) {
        this.f392459a = instreamAdPlayer;
        this.f392460b = videoPlayer;
        c cVar = new c(context, a(instreamAd), new v40(instreamAdPlayer), new e(videoPlayer));
        this.f392462d = cVar;
        g60 g60Var = new g60();
        this.f392461c = g60Var;
        cVar.a(g60Var);
        g40 g40Var = new g40();
        this.f392466h = g40Var;
        re1 re1Var = new re1();
        this.f392467i = re1Var;
        cVar.a(new yk(re1Var, g40Var));
        this.f392463e = h40.a();
        this.f392464f = new x40(this);
        this.f392465g = new y60(this);
        this.f392468j = new yf1();
    }

    public final void a(@P oe1 oe1Var) {
        this.f392466h.a(oe1Var);
    }

    public void bind(@N InstreamAdView instreamAdView) {
        a(instreamAdView, Collections.emptyList());
    }

    @Override // com.yandex.mobile.ads.impl.vb1
    public void invalidateAdPlayer() {
        this.f392464f.b(this.f392459a);
        this.f392462d.a();
    }

    public void invalidateVideoPlayer() {
        this.f392465g.b(this.f392460b);
        this.f392462d.b();
    }

    public void prepareAd() {
        this.f392462d.c();
    }

    public void setInstreamAdListener(@P InstreamAdListener instreamAdListener) {
        this.f392461c.a(instreamAdListener);
    }

    public void setVideoAdPlaybackListener(@P VideoAdPlaybackListener videoAdPlaybackListener) {
        xf1 xf1VarA;
        if (videoAdPlaybackListener != null) {
            this.f392468j.getClass();
            xf1VarA = yf1.a(videoAdPlaybackListener);
        } else {
            xf1VarA = null;
        }
        this.f392467i.a(xf1VarA);
    }

    public void unbind() {
        if (this.f392463e.a(this)) {
            this.f392462d.d();
        }
    }

    public final void a(@P pe1 pe1Var) {
        this.f392466h.a(pe1Var);
    }

    @N
    private static o60 a(@N InstreamAd instreamAd) {
        if (instreamAd instanceof o60) {
            return (o60) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }

    public final void a(@N lu luVar, @N List<df1> list) {
        InstreamAdBinder instreamAdBinderA = this.f392463e.a(luVar);
        if (!equals(instreamAdBinderA)) {
            if (instreamAdBinderA != null) {
                instreamAdBinderA.unbind();
            }
            if (this.f392463e.a(this)) {
                this.f392462d.d();
            }
            this.f392463e.a(luVar, this);
        }
        this.f392464f.a(this.f392459a);
        this.f392465g.a(this.f392460b);
        this.f392462d.a(luVar, list);
    }
}
