package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* loaded from: classes8.dex */
public final class yv0 implements sx<f01> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final m01 f392074a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Handler f392075b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final c4 f392076c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private String f392077d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private RewardedAdLoadListener f392078e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private x3 f392079f;

    public yv0(@Y61.k Context context, @Y61.k a4 a4Var, @Y61.k m01 m01Var, @Y61.k Handler handler, @Y61.k c4 c4Var) {
        this.f392074a = m01Var;
        this.f392075b = handler;
        this.f392076c = c4Var;
    }

    public final void a(@Y61.k n2 n2Var) {
        this.f392076c.b(new k5(n2Var));
    }

    public final void a(@Y61.k ky0.a aVar) {
        this.f392076c.a(aVar);
    }

    public /* synthetic */ yv0(Context context, a4 a4Var, m01 m01Var) {
        this(context, a4Var, m01Var, new Handler(Looper.getMainLooper()), new c4(context, a4Var));
    }

    public final void a(@Y61.l RewardedAdLoadListener rewardedAdLoadListener) {
        this.f392078e = rewardedAdLoadListener;
    }

    public final void a(@Y61.k x3 x3Var) {
        this.f392079f = x3Var;
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k f01 f01Var) {
        this.f392076c.a();
        this.f392075b.post(new A2(6, this, this.f392074a.a(f01Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yv0 yv0Var, l01 l01Var) {
        RewardedAdLoadListener rewardedAdLoadListener = yv0Var.f392078e;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(l01Var);
        }
        x3 x3Var = yv0Var.f392079f;
        if (x3Var != null) {
            x3Var.a();
        }
    }

    public final void a(@Y61.l String str) {
        this.f392077d = str;
    }

    @Override // com.yandex.mobile.ads.impl.sx
    public final void a(@Y61.k w2 w2Var) {
        this.f392076c.a(w2Var.b());
        this.f392075b.post(new A2(7, w2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w2 w2Var, yv0 yv0Var) {
        AdRequestError adRequestError = new AdRequestError(w2Var.a(), w2Var.c(), yv0Var.f392077d);
        RewardedAdLoadListener rewardedAdLoadListener = yv0Var.f392078e;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        x3 x3Var = yv0Var.f392079f;
        if (x3Var != null) {
            x3Var.a();
        }
    }
}
