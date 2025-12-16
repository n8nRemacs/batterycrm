package com.avito.android.advert.item.safedeal.trust_factors.badge_bar;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrustFactorsBadgeBarPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/d;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/g;", "Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/TrustFactorsBadgeBarItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<g, TrustFactorsBadgeBarItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79040b;

    @Inject
    public d(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79040b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        TrustFactorsComponent.BadgeBar badgeBar = ((TrustFactorsBadgeBarItem) aVar).f79030d;
        badgeBar.getClass();
        SafeDeal.Component.BadgeBar badgeBar2 = badgeBar.f84255b;
        String title = badgeBar.f84256c;
        if (title == null) {
            title = badgeBar2.getTitle();
        }
        List listSingletonList = Collections.singletonList(new BadgeItem(title, 0, badgeBar2.getTitle(), badgeBar2.getDescription(), badgeBar2.getStyle().getBackgroundColor(), badgeBar2.getStyle().getHighlightedBackgroundColor(), badgeBar2.getStyle().getTextColor(), 1, 1, badgeBar2.getImage(), null, true, false, null, 13312, null));
        int i13 = AdvertBadgeBar.f124922o;
        int size = listSingletonList.size();
        AdvertBadgeBar advertBadgeBar = gVar.f79044c;
        advertBadgeBar.b(size, "", listSingletonList);
        DeepLink onTapDeepLink = badgeBar2.getOnTapDeepLink();
        l<? super BadgeItem, G0> cVar = onTapDeepLink != null ? new c(this, onTapDeepLink) : null;
        if (cVar == null) {
            cVar = f.f79042l;
        }
        advertBadgeBar.setOnBadgeClickListener(cVar);
    }
}
