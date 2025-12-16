package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.h5;
import com.yandex.mobile.ads.impl.ko1;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public final class BannerAdView extends h {

    /* renamed from: h, reason: collision with root package name */
    @N
    private final h5 f382507h;

    /* renamed from: i, reason: collision with root package name */
    @N
    private final VideoController f382508i;

    public BannerAdView(@N Context context) {
        this(context, null);
    }

    @Override // com.yandex.mobile.ads.banner.h
    @N
    public final f a(@N Context context, @N e eVar, @N a4 a4Var) {
        return new f(context, new ko1(), this, eVar, a4Var);
    }

    @Override // com.yandex.mobile.ads.banner.h
    public void destroy() {
        super.destroy();
    }

    @Override // com.yandex.mobile.ads.banner.h
    @P
    public BannerAdSize getAdSize() {
        return super.getAdSize();
    }

    @N
    public VideoController getVideoController() {
        return this.f382508i;
    }

    public void loadAd(@N AdRequest adRequest) {
        this.f382507h.getClass();
        b(h5.a(adRequest));
    }

    @Override // com.yandex.mobile.ads.banner.h
    public void setAdSize(@N BannerAdSize bannerAdSize) {
        super.setAdSize(bannerAdSize);
    }

    @Override // com.yandex.mobile.ads.banner.h
    public void setAdUnitId(@N String str) {
        super.setAdUnitId(str);
    }

    @Override // com.yandex.mobile.ads.banner.h
    public void setBannerAdEventListener(@P BannerAdEventListener bannerAdEventListener) {
        super.setBannerAdEventListener(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.banner.h
    public void setShouldOpenLinksInApp(boolean z12) {
        super.setShouldOpenLinksInApp(z12);
    }

    public BannerAdView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f382507h = new h5();
        this.f382508i = new VideoController(b());
    }
}
