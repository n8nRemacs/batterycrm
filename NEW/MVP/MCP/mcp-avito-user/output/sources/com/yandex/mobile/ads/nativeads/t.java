package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.gl0;
import com.yandex.mobile.ads.impl.k5;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.vk0;
import com.yandex.mobile.ads.impl.w2;
import com.yandex.mobile.ads.impl.y2;
import com.yandex.mobile.ads.impl.y6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final vk0 f392729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Handler f392730b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final c4 f392731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private NativeAdLoadListener f392732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private NativeBulkAdLoadListener f392733e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private SliderAdLoadListener f392734f;

    public t(@Y61.k Context context, @Y61.k a4 a4Var, @Y61.k vk0 vk0Var) {
        this.f392729a = vk0Var;
        this.f392731c = new c4(context, a4Var);
    }

    public final void a(@Y61.k n2 n2Var) {
        this.f392731c.b(new k5(n2Var));
    }

    public final void b(@Y61.k w2 w2Var) {
        a(w2Var);
    }

    public final void a(@Y61.k gl0 gl0Var) {
        this.f392731c.a(gl0Var);
    }

    public final void a(@Y61.l NativeAdLoadListener nativeAdLoadListener) {
        this.f392732d = nativeAdLoadListener;
    }

    public final void a(@Y61.l NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f392733e = nativeBulkAdLoadListener;
    }

    public final void a(@Y61.l SliderAdLoadListener sliderAdLoadListener) {
        this.f392734f = sliderAdLoadListener;
    }

    public final void a() {
        this.f392730b.removeCallbacksAndMessages(null);
    }

    public final void a(@Y61.k NativeAd nativeAd) {
        y2.a(y6.f391938e.a());
        this.f392731c.a();
        this.f392730b.post(new com.vk.id.captcha.web.h(7, this, nativeAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, NativeAd nativeAd) {
        NativeAdLoadListener nativeAdLoadListener = tVar.f392732d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdLoaded(nativeAd);
        }
        ((q) tVar.f392729a).b();
    }

    public final void a(@Y61.k ArrayList arrayList) {
        y2.a(y6.f391938e.a());
        this.f392731c.a();
        this.f392730b.post(new com.vk.id.captcha.web.h(6, this, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, List list) {
        NativeBulkAdLoadListener nativeBulkAdLoadListener = tVar.f392733e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsLoaded(list);
        }
        ((q) tVar.f392729a).b();
    }

    public final void a(@Y61.k SliderAd sliderAd) {
        y2.a(y6.f391938e.a());
        this.f392731c.a();
        this.f392730b.post(new com.vk.id.captcha.web.h(5, this, sliderAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, SliderAd sliderAd) {
        SliderAdLoadListener sliderAdLoadListener = tVar.f392734f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdLoaded(sliderAd);
        }
        ((q) tVar.f392729a).b();
    }

    private final void a(w2 w2Var) {
        this.f392731c.a(w2Var.b());
        this.f392730b.post(new com.vk.id.captcha.web.h(8, w2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w2 w2Var, t tVar) {
        AdRequestError adRequestError = new AdRequestError(w2Var.a(), w2Var.c());
        NativeAdLoadListener nativeAdLoadListener = tVar.f392732d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        NativeBulkAdLoadListener nativeBulkAdLoadListener = tVar.f392733e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsFailedToLoad(adRequestError);
        }
        SliderAdLoadListener sliderAdLoadListener = tVar.f392734f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdFailedToLoad(adRequestError);
        }
        ((q) tVar.f392729a).b();
    }
}
