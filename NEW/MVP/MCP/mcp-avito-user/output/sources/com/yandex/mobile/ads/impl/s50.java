package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class s50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final p60 f389790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f389791b;

    public s50(@Y61.k p60 p60Var, @Y61.k ff1<VideoAd> ff1Var) {
        this.f389790a = p60Var;
        this.f389791b = ff1Var;
    }

    @Y61.k
    public final String a() {
        int adPosition = this.f389791b.c().getAdPodInfo().getAdPosition();
        StringBuilder sbA = Cif.a("yma_");
        sbA.append(this.f389790a);
        sbA.append("_position_");
        sbA.append(adPosition);
        return sbA.toString();
    }
}
