package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* loaded from: classes8.dex */
public final class wv0 implements sx<q70> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final x70 f391499a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Handler f391500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final c4 f391501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private InterstitialAdLoadListener f391502d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private x3 f391503e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private String f391504f;

    public wv0(@Y61.k Context context, @Y61.k a4 a4Var, @Y61.k x70 x70Var, @Y61.k Handler handler, @Y61.k c4 c4Var) {
        this.f391499a = x70Var;
        this.f391500b = handler;
        this.f391501c = c4Var;
    }

    public final void a(@Y61.k n2 n2Var) {
        this.f391501c.b(new k5(n2Var));
    }

    public final void a(@Y61.k ky0.a aVar) {
        this.f391501c.a(aVar);
    }

    public /* synthetic */ wv0(Context context, a4 a4Var, x70 x70Var) {
        this(context, a4Var, x70Var, new Handler(Looper.getMainLooper()), new c4(context, a4Var));
    }

    public final void a(@Y61.l InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f391502d = interstitialAdLoadListener;
    }

    public final void a(@Y61.k x3 x3Var) {
        this.f391503e = x3Var;
    }

    public final void a(@Y61.l String str) {
        this.f391504f = str;
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k q70 q70Var) {
        this.f391501c.a();
        this.f391500b.post(new A2(this, this.f391499a.a(q70Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wv0 wv0Var, w70 w70Var) {
        InterstitialAdLoadListener interstitialAdLoadListener = wv0Var.f391502d;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdLoaded(w70Var);
        }
        x3 x3Var = wv0Var.f391503e;
        if (x3Var != null) {
            x3Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k w2 w2Var) {
        this.f391501c.a(w2Var.b());
        this.f391500b.post(new A2(0, w2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w2 w2Var, wv0 wv0Var) {
        AdRequestError adRequestError = new AdRequestError(w2Var.a(), w2Var.c(), wv0Var.f391504f);
        InterstitialAdLoadListener interstitialAdLoadListener = wv0Var.f391502d;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        x3 x3Var = wv0Var.f391503e;
        if (x3Var != null) {
            x3Var.a();
        }
    }
}
