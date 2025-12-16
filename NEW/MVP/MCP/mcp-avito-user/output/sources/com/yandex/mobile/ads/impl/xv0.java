package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* loaded from: classes8.dex */
public final class xv0 implements ux {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Handler f391817a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private InterstitialAdEventListener f391818b;

    public xv0(@Y61.k Handler handler) {
        this.f391817a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(xv0 xv0Var) {
        InterstitialAdEventListener interstitialAdEventListener = xv0Var.f391818b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
    }

    public final void a(@Y61.l InterstitialAdEventListener interstitialAdEventListener) {
        this.f391818b = interstitialAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdClicked() {
        this.f391817a.post(new E2(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdDismissed() {
        this.f391817a.post(new E2(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdShown() {
        this.f391817a.post(new E2(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onImpression(@Y61.l ImpressionData impressionData) {
        this.f391817a.post(new A2(2, this, impressionData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xv0 xv0Var, ImpressionData impressionData) {
        InterstitialAdEventListener interstitialAdEventListener = xv0Var.f391818b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(xv0 xv0Var) {
        InterstitialAdEventListener interstitialAdEventListener = xv0Var.f391818b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
    }

    public /* synthetic */ xv0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public final void a(@Y61.k z4 z4Var) {
        this.f391817a.post(new A2(3, z4Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z4 z4Var, xv0 xv0Var) {
        u31 u31Var = new u31(z4Var.a());
        InterstitialAdEventListener interstitialAdEventListener = xv0Var.f391818b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToShow(u31Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xv0 xv0Var) {
        InterstitialAdEventListener interstitialAdEventListener = xv0Var.f391818b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
    }
}
