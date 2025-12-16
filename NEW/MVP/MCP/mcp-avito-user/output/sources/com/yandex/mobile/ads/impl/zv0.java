package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* loaded from: classes8.dex */
public final class zv0 implements ux, t01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Handler f392351a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private RewardedAdEventListener f392352b;

    public zv0(@Y61.k Handler handler) {
        this.f392351a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(zv0 zv0Var) {
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdShown();
        }
    }

    public final void a(@Y61.l RewardedAdEventListener rewardedAdEventListener) {
        this.f392352b = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdClicked() {
        this.f392351a.post(new G2(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdDismissed() {
        this.f392351a.post(new G2(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onAdShown() {
        this.f392351a.post(new G2(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final void onImpression(@Y61.l ImpressionData impressionData) {
        this.f392351a.post(new A2(8, this, impressionData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zv0 zv0Var, ImpressionData impressionData) {
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(zv0 zv0Var) {
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdDismissed();
        }
    }

    public /* synthetic */ zv0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public final void a(@Y61.k z4 z4Var) {
        this.f392351a.post(new A2(10, z4Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z4 z4Var, zv0 zv0Var) {
        u31 u31Var = new u31(z4Var.a());
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(u31Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zv0 zv0Var) {
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
    }

    @Override // com.yandex.mobile.ads.impl.t01
    public final void a(@Y61.k jo1 jo1Var) {
        this.f392351a.post(new A2(9, this, jo1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zv0 zv0Var, Reward reward) {
        RewardedAdEventListener rewardedAdEventListener = zv0Var.f392352b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(reward);
        }
    }
}
