package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f391419a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final i50 f391420b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final cq f391421c = new cq();

    public wi(@j.N Context context, @j.N p60 p60Var, @j.N ff1<VideoAd> ff1Var, @j.N ri1 ri1Var, @j.N qe1 qe1Var, @j.N ch1 ch1Var) {
        this.f391419a = ff1Var;
        this.f391420b = new i50(context, p60Var, ff1Var, ri1Var, qe1Var, ch1Var);
    }

    public final void a(@j.N View view) {
        int iA2 = this.f391421c.a(view.getContext());
        if (TextUtils.isEmpty(this.f391419a.a().b()) || n6.a(3, iA2)) {
            view.setVisibility(8);
        } else {
            view.setOnClickListener(this.f391420b);
        }
    }
}
