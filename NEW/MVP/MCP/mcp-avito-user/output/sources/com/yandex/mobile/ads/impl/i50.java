package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class i50 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ri1 f386328a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f386329b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final qe1 f386330c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final br0 f386331d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ch1 f386332e;

    public i50(@j.N Context context, @j.N p60 p60Var, @j.N ff1<VideoAd> ff1Var, @j.N ri1 ri1Var, @j.N qe1 qe1Var, @j.N ch1 ch1Var) {
        this.f386329b = ff1Var;
        this.f386328a = ri1Var;
        this.f386330c = qe1Var;
        this.f386331d = new f60(context, p60Var, ff1Var).a();
        this.f386332e = ch1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.N View view) {
        this.f386328a.m();
        this.f386330c.onAdClicked(this.f386329b.c());
        String strA = this.f386332e.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f386331d.a(strA);
    }
}
