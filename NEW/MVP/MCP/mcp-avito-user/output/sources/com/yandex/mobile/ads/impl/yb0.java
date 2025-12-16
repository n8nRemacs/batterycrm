package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class yb0 implements vp {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tb0 f391990a;

    /* renamed from: b, reason: collision with root package name */
    private final int f391991b;

    public yb0(@j.N NativeAdAssets nativeAdAssets, int i12) {
        this.f391991b = i12;
        this.f391990a = new tb0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.vp
    public final boolean a(@j.N Context context) {
        int i12 = rj1.f389556b;
        int i13 = context.getResources().getDisplayMetrics().heightPixels;
        int i14 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA2 = this.f391990a.a();
        return i14 - (fA2 != null ? Math.round(fA2.floatValue() * ((float) i13)) : 0) >= this.f391991b;
    }
}
