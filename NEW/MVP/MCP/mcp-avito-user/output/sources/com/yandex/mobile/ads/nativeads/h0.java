package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.vq;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class h0 implements u {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final List<u> f392638a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final u f392639b;

    public h0(@N ArrayList arrayList) {
        this.f392638a = arrayList;
        this.f392639b = arrayList.isEmpty() ? null : (u) arrayList.get(0);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N NativeBannerView nativeBannerView) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.a(nativeBannerView);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.addImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void b(@N ll0 ll0Var, @N vi viVar) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.b(ll0Var, viVar);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@N NativeAdViewBinder nativeAdViewBinder) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.bindNativeAd(nativeAdViewBinder);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    @P
    public final List<vq> c() {
        u uVar = this.f392639b;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void destroy() {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.destroy();
        }
    }

    @N
    public final List<u> e() {
        return this.f392638a;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdAssets getAdAssets() {
        u uVar = this.f392639b;
        return uVar != null ? uVar.getAdAssets() : new f();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdType getAdType() {
        u uVar = this.f392639b;
        return uVar != null ? uVar.getAdType() : NativeAdType.CONTENT;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @P
    public final String getInfo() {
        u uVar = this.f392639b;
        if (uVar != null) {
            return uVar.getInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    @P
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        u uVar = this.f392639b;
        if (uVar == null) {
            return null;
        }
        return uVar.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.loadImages();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.removeImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickable
    public final void setCustomClickHandler(@P CustomClickHandler customClickHandler) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.setCustomClickHandler(customClickHandler);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(@P NativeAdEventListener nativeAdEventListener) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.setNativeAdEventListener(nativeAdEventListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z12) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.setShouldOpenLinksInApp(z12);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N ll0 ll0Var) {
        u uVar = this.f392639b;
        if (uVar != null) {
            uVar.a(ll0Var);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    @N
    public final om0 b() {
        u uVar = this.f392639b;
        return uVar != null ? uVar.b() : new om0(null, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    @P
    public final bl0 a() {
        u uVar = this.f392639b;
        if (uVar != null) {
            return uVar.a();
        }
        return null;
    }
}
