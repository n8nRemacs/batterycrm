package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class uv0 implements sx<sa> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Handler f390635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final c4 f390636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final za f390637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private AppOpenAdLoadListener f390638d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private x3 f390639e;

    public uv0(@Y61.k Context context, @Y61.k a4 a4Var, @Y61.k Handler handler, @Y61.k c4 c4Var, @Y61.k za zaVar) {
        this.f390635a = handler;
        this.f390636b = c4Var;
        this.f390637c = zaVar;
    }

    public final void a(@Y61.l AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f390638d = appOpenAdLoadListener;
    }

    public final void a(@Y61.k x3 x3Var) {
        this.f390639e = x3Var;
    }

    public final void a(@Y61.k n2 n2Var) {
        this.f390636b.b(new k5(n2Var));
    }

    public /* synthetic */ uv0(Context context, a4 a4Var) {
        this(context, a4Var, new Handler(Looper.getMainLooper()), new c4(context, a4Var), new za(context));
    }

    public final void a(@Y61.k ky0.a aVar) {
        this.f390636b.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k w2 w2Var) {
        this.f390636b.a(w2Var.b());
        this.f390635a.post(new H(26, w2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w2 w2Var, uv0 uv0Var) {
        AdRequestError adRequestError = new AdRequestError(w2Var.a(), w2Var.c());
        AppOpenAdLoadListener appOpenAdLoadListener = uv0Var.f390638d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        x3 x3Var = uv0Var.f390639e;
        if (x3Var != null) {
            x3Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k sa saVar) {
        this.f390636b.a();
        this.f390635a.post(new H(25, this, this.f390637c.a(saVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(uv0 uv0Var, ya yaVar) {
        AppOpenAdLoadListener appOpenAdLoadListener = uv0Var.f390638d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdLoaded(yaVar);
        }
        x3 x3Var = uv0Var.f390639e;
        if (x3Var != null) {
            x3Var.a();
        }
    }
}
