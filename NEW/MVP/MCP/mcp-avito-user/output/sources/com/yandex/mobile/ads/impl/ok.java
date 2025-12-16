package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class ok {
    @j.N
    public static sk a(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener, @j.N up upVar) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        return new sk(new hy(uVar, plVar, nativeAdEventListener), new d9(adAssets), new oc0(adAssets), new ow0(adAssets), upVar);
    }
}
