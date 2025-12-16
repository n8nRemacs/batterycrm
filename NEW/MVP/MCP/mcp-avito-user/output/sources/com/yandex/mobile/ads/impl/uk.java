package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class uk implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f390581a;

    /* renamed from: b, reason: collision with root package name */
    private final int f390582b;

    public uk(@j.N NativeAdAssets nativeAdAssets, int i12) {
        this.f390581a = nativeAdAssets;
        this.f390582b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        vk vkVar = new vk(this.f390581a, this.f390582b);
        ImageView imageViewA = vkVar.a(extendedNativeAdView);
        ImageView imageViewB = vkVar.b(extendedNativeAdView);
        if (imageViewA != null) {
            imageViewA.setId(R.id.favicon);
        }
        if (imageViewB != null) {
            imageViewB.setId(R.id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
