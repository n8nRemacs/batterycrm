package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.uj0;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.impl.z41;
import com.yandex.mobile.ads.impl.zm0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class i0 extends j0 implements z41, u {

    /* renamed from: G, reason: collision with root package name */
    @N
    private final w20 f392641G;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final h0 f392642H;

    public i0(@N Context context, @N h0 h0Var, @N w20 w20Var, @N C39385a c39385a) {
        super(context, c39385a);
        this.f392641G = w20Var;
        this.f392642H = h0Var;
        uj0 uj0VarD = c39385a.d();
        a(a(uj0VarD.c().e(), uj0VarD.a()));
    }

    @N
    private ky0.a a(@N List<nj0> list, @N n2 n2Var) {
        String strA = zm0.f392299d.a();
        d0 d0Var = new d0(list, n2Var);
        d0Var.a(1);
        d0Var.a(strA);
        d0Var.a(this.f392663l);
        return d0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392642H.addImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.impl.z41
    public final void b(@N ll0 ll0Var) {
        a((i0) ll0Var.b(), this.f392641G, (jl0) new ml0(ll0Var), c.f392603a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@N NativeAdViewBinder nativeAdViewBinder) {
        this.f392642H.bindNativeAd(nativeAdViewBinder);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(@N NativeAdViewBinder nativeAdViewBinder) {
        a((i0) nativeAdViewBinder.getNativeAdView(), this.f392641G, (jl0) new x(nativeAdViewBinder), c.f392603a);
    }

    @Override // com.yandex.mobile.ads.impl.z41
    @N
    public final ArrayList d() {
        return new ArrayList(this.f392642H.e());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdAssets getAdAssets() {
        return this.f392642H.getAdAssets();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdType getAdType() {
        return this.f392642H.getAdType();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @P
    public final String getInfo() {
        return this.f392642H.getInfo();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    @P
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        return this.f392674w;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    @N
    public final List<NativeAd> getNativeAds() {
        return new ArrayList(this.f392642H.e());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f392642H.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392642H.removeImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.j0, com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(@P NativeAdEventListener nativeAdEventListener) {
        this.f392642H.setNativeAdEventListener(nativeAdEventListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void b(@N ll0 ll0Var, @N vi viVar) {
        this.f392642H.b(ll0Var, viVar);
    }

    @Override // com.yandex.mobile.ads.impl.z41
    public final void a(@N ll0 ll0Var, @N vi viVar) {
        a(ll0Var.b(), this.f392641G, new ml0(ll0Var), viVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N NativeBannerView nativeBannerView) {
        this.f392642H.a(nativeBannerView);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N ll0 ll0Var) {
        this.f392642H.a(ll0Var);
    }
}
