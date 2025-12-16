package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class w70 implements InterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final q70 f391322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final xv0 f391323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final oa0 f391324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ma0 f391325d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final AtomicBoolean f391326e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final AdInfo f391327f;

    public w70(@Y61.k Context context, @Y61.k q70 q70Var, @Y61.k xv0 xv0Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var) {
        this.f391322a = q70Var;
        this.f391323b = xv0Var;
        this.f391324c = oa0Var;
        this.f391325d = ma0Var;
        this.f391326e = new AtomicBoolean(false);
        this.f391327f = q70Var.l();
        q70Var.a(xv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w70 w70Var, Activity activity) {
        if (w70Var.f391326e.getAndSet(true)) {
            w70Var.f391323b.a(a5.f383408a);
        } else {
            w70Var.f391322a.a(activity);
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    @Y61.k
    public final AdInfo getInfo() {
        return this.f391327f;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(@Y61.l InterstitialAdEventListener interstitialAdEventListener) {
        this.f391324c.a();
        this.f391323b.a(interstitialAdEventListener);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(@Y61.k Activity activity) {
        this.f391324c.a();
        this.f391325d.a(new H(29, this, activity));
    }

    public /* synthetic */ w70(Context context, q70 q70Var, xv0 xv0Var) {
        this(context, q70Var, xv0Var, new oa0(context), new ma0());
    }
}
