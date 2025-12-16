package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.n6;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.qa1;
import com.yandex.mobile.ads.impl.tz0;
import com.yandex.mobile.ads.impl.uj0;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import j.N;
import j.P;
import java.util.Collections;

/* loaded from: classes8.dex */
public abstract class m extends j0 implements u {

    /* renamed from: G, reason: collision with root package name */
    @N
    private final r f392685G;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final c f392686H;

    /* renamed from: I, reason: collision with root package name */
    @N
    private final qa1 f392687I;

    /* renamed from: J, reason: collision with root package name */
    @N
    private final d0 f392688J;

    /* renamed from: K, reason: collision with root package name */
    @N
    private final cn0 f392689K;

    /* renamed from: L, reason: collision with root package name */
    @N
    protected w20 f392690L;

    public m(@N Context context, @N nj0 nj0Var, @N r rVar, @N w20 w20Var, @N C39385a c39385a) {
        super(context, c39385a);
        this.f392685G = rVar;
        this.f392690L = w20Var;
        uj0 uj0VarD = c39385a.d();
        this.f392686H = c.a(uj0VarD.c().h());
        d0 d0VarA = a(nj0Var, uj0VarD.a());
        this.f392688J = d0VarA;
        a(d0VarA);
        this.f392687I = new qa1();
        this.f392689K = new cn0();
    }

    @N
    private d0 a(@N nj0 nj0Var, @N n2 n2Var) {
        d0 d0Var = new d0(Collections.singletonList(nj0Var), n2Var);
        int iG2 = nj0Var.g();
        if (iG2 != 0) {
            d0Var.a(tz0.a(iG2));
        }
        d0Var.a(this.f392663l);
        return d0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392685G.a(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void b(@N ll0 ll0Var, @N vi viVar) {
        View viewB = ll0Var.b();
        this.f392687I.a(viewB, new l(this));
        a(viewB, this.f392690L, new ml0(ll0Var), viVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@N NativeAdViewBinder nativeAdViewBinder) {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.f392687I.a(nativeAdView, new l(this));
        a(nativeAdView, new x(nativeAdViewBinder), c.f392603a, 1);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdAssets getAdAssets() {
        return this.f392685G.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @N
    public final NativeAdType getAdType() {
        int iA2;
        int iB2 = this.f392685G.b();
        this.f392689K.getClass();
        NativeAdType nativeAdType = NativeAdType.CONTENT;
        return (iB2 == 0 || (iA2 = n6.a(iB2)) == 0) ? nativeAdType : iA2 != 1 ? iA2 != 2 ? nativeAdType : NativeAdType.MEDIA : NativeAdType.APP_INSTALL;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @P
    public final String getInfo() {
        return this.f392685G.c();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    @P
    public final com.yandex.mobile.ads.nativeads.video.a getNativeAdVideoController() {
        return this.f392674w;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f392685G.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@N NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392685G.b(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.j0, com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z12) {
        super.setShouldOpenLinksInApp(z12);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N NativeBannerView nativeBannerView) {
        com.yandex.mobile.ads.nativeads.template.c cVar = new com.yandex.mobile.ads.nativeads.template.c(nativeBannerView);
        nativeBannerView.a((NativeBannerView) this);
        a(nativeBannerView, cVar, this.f392686H, 2);
    }

    @Override // com.yandex.mobile.ads.nativeads.u
    public final void a(@N ll0 ll0Var) {
        View viewB = ll0Var.b();
        this.f392687I.a(viewB, new l(this));
        a(viewB, new ml0(ll0Var), c.f392603a, 2);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroid/view/View;>(TT;Lcom/yandex/mobile/ads/impl/jl0;Lcom/yandex/mobile/ads/nativeads/c;Ljava/lang/Object;)V */
    private void a(@N View view, @N jl0 jl0Var, @N c cVar, @N int i12) {
        this.f392688J.a(i12);
        a((m) view, this.f392690L, jl0Var, cVar);
    }

    @Override // com.yandex.mobile.ads.nativeads.j0
    public final void a(@N Context context) {
        this.f392687I.a(context);
        super.a(context);
    }
}
