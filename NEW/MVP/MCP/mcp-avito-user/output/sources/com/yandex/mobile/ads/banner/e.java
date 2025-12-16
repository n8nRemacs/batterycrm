package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.e00;
import com.yandex.mobile.ads.impl.k5;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.w2;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class e implements t2 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Handler f382515a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @N
    private final c4 f382516b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private BannerAdEventListener f382517c;

    public e(@N Context context, @N a4 a4Var) {
        this.f382516b = new c4(context, a4Var);
    }

    public final void f() {
        this.f382515a.post(new m(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        BannerAdEventListener bannerAdEventListener = this.f382517c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
    }

    public final void a(@N n2 n2Var) {
        this.f382516b.b(new k5(n2Var));
    }

    public final void b(@P ImpressionData impressionData) {
        this.f382515a.post(new com.vk.id.captcha.web.h(3, this, impressionData));
    }

    public final void d() {
        this.f382516b.a();
        this.f382515a.post(new m(this, 2));
    }

    public final void e() {
        this.f382515a.post(new m(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        BannerAdEventListener bannerAdEventListener = this.f382517c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
            bannerAdEventListener.onLeftApplication();
        }
    }

    public final void a(@N e00 e00Var) {
        this.f382516b.a(e00Var);
    }

    public final void a(@N w2 w2Var) {
        this.f382516b.a(w2Var.b());
        this.f382515a.post(new com.vk.id.captcha.web.h(2, this, new AdRequestError(w2Var.a(), w2Var.c())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        BannerAdEventListener bannerAdEventListener = this.f382517c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        BannerAdEventListener bannerAdEventListener = this.f382517c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        BannerAdEventListener bannerAdEventListener = this.f382517c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoaded();
        }
    }

    public final void a(@P BannerAdEventListener bannerAdEventListener) {
        this.f382517c = bannerAdEventListener;
    }
}
