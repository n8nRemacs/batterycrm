package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.zk0;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public class SliderAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final p f392584a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Context f392585b;

    public SliderAdLoader(@N Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f392585b = applicationContext;
        this.f392584a = new p(applicationContext, new ko1());
    }

    public void cancelLoading() {
        this.f392584a.a();
    }

    public void loadSlider(@N NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f392584a.b(nativeAdRequestConfiguration, new zk0(this.f392585b));
    }

    public void setSliderAdLoadListener(@P SliderAdLoadListener sliderAdLoadListener) {
        this.f392584a.a(sliderAdLoadListener);
    }
}
