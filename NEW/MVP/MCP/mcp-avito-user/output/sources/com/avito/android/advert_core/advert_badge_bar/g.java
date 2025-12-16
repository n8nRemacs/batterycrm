package com.avito.android.advert_core.advert_badge_bar;

import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertBadgeBarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<BadgeItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f82725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertBadgeBarItem f82726m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdvertBadgeBarItem advertBadgeBarItem, f fVar) {
        super(1);
        this.f82725l = fVar;
        this.f82726m = advertBadgeBarItem;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.advert_core.advert_badge_bar.e$a, java.lang.Object] */
    @Override // Y41.l
    public final G0 invoke(BadgeItem badgeItem) {
        ?? r02;
        BadgeItem badgeItem2 = badgeItem;
        f fVar = this.f82725l;
        fVar.f82722b.c(new h8.b(this.f82726m.f82708d, badgeItem2.f124944c));
        DeepLink deepLink = badgeItem2.f124953l;
        if (deepLink != null && (r02 = fVar.f82723c) != 0) {
            r02.f(deepLink);
        }
        return G0.f406611a;
    }
}
