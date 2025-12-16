package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

/* loaded from: classes8.dex */
public final class eg1 implements AdPodInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f384924a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384925b;

    public eg1(int i12, int i13) {
        this.f384925b = i12;
        this.f384924a = i13;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f384924a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f384925b;
    }
}
