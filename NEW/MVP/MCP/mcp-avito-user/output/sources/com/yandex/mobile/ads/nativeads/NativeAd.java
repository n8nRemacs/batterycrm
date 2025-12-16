package com.yandex.mobile.ads.nativeads;

import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface NativeAd {
    void addImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(@N NativeAdViewBinder nativeAdViewBinder);

    @N
    NativeAdAssets getAdAssets();

    @N
    NativeAdType getAdType();

    @P
    String getInfo();

    void loadImages();

    void removeImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(@P NativeAdEventListener nativeAdEventListener);
}
