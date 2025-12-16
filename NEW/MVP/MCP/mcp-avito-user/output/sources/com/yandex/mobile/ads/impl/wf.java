package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.List;

/* loaded from: classes8.dex */
public final class wf {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391393a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InstreamAdPlayer f391394b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final VideoPlayer f391395c;

    public wf(@j.N Context context, @j.N jt jtVar, @j.N ro1 ro1Var) {
        this.f391393a = context.getApplicationContext();
        this.f391394b = jtVar;
        this.f391395c = ro1Var;
    }

    @j.N
    public final vf a(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N InstreamAd instreamAd) {
        return new vf(viewGroup, list, new InstreamAdBinder(this.f391393a, instreamAd, this.f391394b, this.f391395c));
    }
}
