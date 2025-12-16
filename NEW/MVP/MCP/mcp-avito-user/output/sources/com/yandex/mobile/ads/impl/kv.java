package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashSet f387269a;

    public kv(@j.N NativeAdAssets nativeAdAssets) {
        this.f387269a = fd.a(nativeAdAssets);
    }

    public final boolean a() {
        return this.f387269a.size() == 2 && (this.f387269a.contains("feedback") && this.f387269a.contains("media"));
    }
}
