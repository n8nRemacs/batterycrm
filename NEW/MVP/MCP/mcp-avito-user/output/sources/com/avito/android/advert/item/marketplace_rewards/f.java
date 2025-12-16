package com.avito.android.advert.item.marketplace_rewards;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.rewards.RewardsBanner;
import com.avito.android.remote.model.rewards.RewardsButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MarketplaceRewardsBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RewardsBanner f77479l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f77480m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RewardsBanner rewardsBanner, g gVar) {
        super(0);
        this.f77479l = rewardsBanner;
        this.f77480m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        RewardsButton button = this.f77479l.getButton();
        if (button != null && (deepLink = button.getDeepLink()) != null) {
            b.a.a(this.f77480m.f77481b, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
