package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes8.dex */
public final class vv0 implements ux {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Handler f391160a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private AppOpenAdEventListener f391161b;

    public vv0(@Y61.k Handler handler) {
        this.f391160a = handler;
    }

    public final void a(@Y61.l AppOpenAdEventListener appOpenAdEventListener) {
        this.f391161b = appOpenAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdClicked() {
        this.f391160a.post(new W1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdDismissed() {
        this.f391160a.post(new W1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdShown() {
        this.f391160a.post(new W1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onImpression(@Y61.l ImpressionData impressionData) {
        this.f391160a.post(new H(27, this, impressionData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(vv0 vv0Var) {
        AppOpenAdEventListener appOpenAdEventListener = vv0Var.f391161b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(vv0 vv0Var) {
        AppOpenAdEventListener appOpenAdEventListener = vv0Var.f391161b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdShown();
        }
    }

    public final void a(@Y61.k z4 z4Var) {
        this.f391160a.post(new H(28, z4Var, this));
    }

    public /* synthetic */ vv0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z4 z4Var, vv0 vv0Var) {
        u31 u31Var = new u31(z4Var.a());
        AppOpenAdEventListener appOpenAdEventListener = vv0Var.f391161b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdFailedToShow(u31Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vv0 vv0Var, ImpressionData impressionData) {
        AppOpenAdEventListener appOpenAdEventListener = vv0Var.f391161b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vv0 vv0Var) {
        AppOpenAdEventListener appOpenAdEventListener = vv0Var.f391161b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdClicked();
        }
    }
}
