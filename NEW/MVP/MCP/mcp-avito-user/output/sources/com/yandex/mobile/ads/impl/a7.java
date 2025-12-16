package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;

/* loaded from: classes8.dex */
final class a7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final BiddingSettings f383426a;

    public a7(@j.N BiddingSettings biddingSettings) {
        this.f383426a = biddingSettings;
    }

    @j.P
    public final AdUnitIdBiddingSettings a(@j.P String str) {
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : this.f383426a.c()) {
            if (adUnitIdBiddingSettings.c().equals(str)) {
                return adUnitIdBiddingSettings;
            }
        }
        return null;
    }
}
