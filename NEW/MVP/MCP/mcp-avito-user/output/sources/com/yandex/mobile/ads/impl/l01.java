package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class l01 implements RewardedAd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final f01 f387342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final zv0 f387343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final oa0 f387344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ma0 f387345d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final AtomicBoolean f387346e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final AdInfo f387347f;

    public l01(@Y61.k Context context, @Y61.k f01 f01Var, @Y61.k zv0 zv0Var, @Y61.k oa0 oa0Var, @Y61.k ma0 ma0Var) {
        this.f387342a = f01Var;
        this.f387343b = zv0Var;
        this.f387344c = oa0Var;
        this.f387345d = ma0Var;
        this.f387346e = new AtomicBoolean(false);
        this.f387347f = f01Var.l();
        f01Var.a(zv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l01 l01Var, Activity activity) {
        if (l01Var.f387346e.getAndSet(true)) {
            l01Var.f387343b.a(a5.f383408a);
        } else {
            l01Var.f387342a.a(activity);
        }
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    @Y61.k
    public final AdInfo getInfo() {
        return this.f387347f;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(@Y61.l RewardedAdEventListener rewardedAdEventListener) {
        this.f387344c.a();
        this.f387343b.a(rewardedAdEventListener);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(@Y61.k Activity activity) {
        this.f387344c.a();
        this.f387345d.a(new H(16, this, activity));
    }

    public /* synthetic */ l01(Context context, f01 f01Var, zv0 zv0Var) {
        this(context, f01Var, zv0Var, new oa0(context), new ma0());
    }
}
