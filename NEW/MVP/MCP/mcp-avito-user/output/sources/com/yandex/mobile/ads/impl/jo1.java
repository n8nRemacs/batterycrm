package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;

/* loaded from: classes8.dex */
public final class jo1 implements Reward {

    /* renamed from: a, reason: collision with root package name */
    private final int f386943a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f386944b;

    public jo1(int i12, @j.N String str) {
        this.f386943a = i12;
        this.f386944b = str;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f386943a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    @j.N
    public final String getType() {
        return this.f386944b;
    }
}
