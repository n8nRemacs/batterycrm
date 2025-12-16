package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;

/* loaded from: classes8.dex */
public final class i60 implements SkipInfo {

    /* renamed from: a, reason: collision with root package name */
    private final long f386339a;

    public i60(long j12) {
        this.f386339a = j12;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f386339a;
    }
}
