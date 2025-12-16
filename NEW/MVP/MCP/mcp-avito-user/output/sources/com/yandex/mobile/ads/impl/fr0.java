package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class fr0 implements vp {

    /* renamed from: a, reason: collision with root package name */
    private final int f385484a;

    public fr0(int i12) {
        this.f385484a = i12;
    }

    @Override // com.yandex.mobile.ads.impl.vp
    public final boolean a(@j.N Context context) {
        return this.f385484a == context.getResources().getConfiguration().orientation;
    }
}
