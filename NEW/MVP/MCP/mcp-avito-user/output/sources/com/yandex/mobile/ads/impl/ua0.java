package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;

/* loaded from: classes8.dex */
public final class ua0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390502a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p60 f390503b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39304a2 f390504c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ya0 f390505d;

    public ua0(@j.N Context context, @j.N p60 p60Var, @j.N C39304a2 c39304a2, @j.N ya0 ya0Var) {
        this.f390502a = context.getApplicationContext();
        this.f390503b = p60Var;
        this.f390504c = c39304a2;
        this.f390505d = ya0Var;
    }

    @j.N
    public final ta0 a(@j.N InstreamAdPlayer instreamAdPlayer) {
        return new ta0(this.f390502a, this.f390503b, new v40(instreamAdPlayer), this.f390504c, this.f390505d);
    }
}
