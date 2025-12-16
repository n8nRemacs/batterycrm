package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* loaded from: classes8.dex */
public final class tb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f390148a;

    public tb0(@j.N NativeAdAssets nativeAdAssets) {
        this.f390148a = nativeAdAssets;
    }

    @j.P
    public final Float a() {
        NativeAdMedia media = this.f390148a.getMedia();
        NativeAdImage image = this.f390148a.getImage();
        if (media != null) {
            return Float.valueOf(media.getAspectRatio());
        }
        if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
            return null;
        }
        return Float.valueOf(image.getWidth() / image.getHeight());
    }
}
