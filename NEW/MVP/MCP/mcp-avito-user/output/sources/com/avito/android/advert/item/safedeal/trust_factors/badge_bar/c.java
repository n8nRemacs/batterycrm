package com.avito.android.advert.item.safedeal.trust_factors.badge_bar;

import Y41.l;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsBadgeBarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<BadgeItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f79038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f79039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, DeepLink deepLink) {
        super(1);
        this.f79038l = dVar;
        this.f79039m = deepLink;
    }

    @Override // Y41.l
    public final G0 invoke(BadgeItem badgeItem) {
        d dVar = this.f79038l;
        dVar.f79040b.c(this.f79039m, null);
        return G0.f406611a;
    }
}
