package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class r41 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k60 f389382a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final SkipInfo f389383b;

    public r41(@j.N k60 k60Var, @j.N VideoAd videoAd) {
        this.f389382a = k60Var;
        this.f389383b = videoAd.getSkipInfo();
    }

    public final void a(@j.N View view, @j.N t50 t50Var) {
        if (this.f389383b == null) {
            view.setVisibility(8);
            return;
        }
        view.setOnClickListener(new q41(this.f389382a));
        if (!t50Var.c()) {
            view.setEnabled(false);
        } else {
            view.setVisibility(0);
            view.setEnabled(true);
        }
    }
}
