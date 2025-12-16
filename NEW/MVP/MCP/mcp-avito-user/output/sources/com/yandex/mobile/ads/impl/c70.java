package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class c70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qg1 f384187a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final p60 f384188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f384189c;

    /* renamed from: d, reason: collision with root package name */
    private final h60 f384190d = h60.a();

    public c70(@Y61.k qg1 qg1Var, @Y61.k p60 p60Var, @Y61.k ff1<VideoAd> ff1Var) {
        this.f384187a = qg1Var;
        this.f384188b = p60Var;
        this.f384189c = ff1Var;
    }

    public final boolean a() {
        pg1 pg1Var;
        AdPodInfo adPodInfo = this.f384189c.c().getAdPodInfo();
        if (!this.f384190d.b() || adPodInfo.getAdPosition() <= 1) {
            String type = this.f384188b.getType();
            int iHashCode = type.hashCode();
            pg1Var = (iHashCode == -1183812830 ? type.equals(InstreamAdBreakType.INROLL) : iHashCode == 830323571 ? type.equals(InstreamAdBreakType.PAUSEROLL) : iHashCode == 1055572677 && type.equals(InstreamAdBreakType.MIDROLL)) ? adPodInfo.getAdPosition() == 1 ? pg1.f388824d : pg1.f388822b : pg1.f388822b;
        } else {
            pg1Var = pg1.f388824d;
        }
        return this.f384187a.a(pg1Var);
    }
}
