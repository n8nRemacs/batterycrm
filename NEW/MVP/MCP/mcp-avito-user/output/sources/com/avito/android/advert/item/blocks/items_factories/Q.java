package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.advert_badge_bar_light.AdvertDetailsBadgeBarLightItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeBar;
import h4.InterfaceC40768a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBadgeBarLightFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/Q;", "Lcom/avito/android/advert/item/blocks/items_factories/P;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73834a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40768a f73835b;

    @Inject
    public Q(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k InterfaceC40768a interfaceC40768a) {
        this.f73834a = jVar;
        this.f73835b = interfaceC40768a;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.P
    @Y61.l
    public final AdvertDetailsBadgeBarLightItem a(@Y61.k AdvertDetails advertDetails) {
        List<AdvertBadge> badges;
        AdvertBadgeBar badgeBarLight = advertDetails.getBadgeBarLight();
        ArrayList arrayListA = (badgeBarLight == null || (badges = badgeBarLight.getBadges()) == null) ? null : this.f73835b.a(badges);
        AdvertBadgeBar badgeBarLight2 = advertDetails.getBadgeBarLight();
        boolean z12 = (badgeBarLight2 != null ? badgeBarLight2.getPosition() : null) == AdvertBadgeBar.Position.UNDER_GALLERY;
        if (arrayListA == null || arrayListA.isEmpty()) {
            return null;
        }
        return new AdvertDetailsBadgeBarLightItem(0L, null, arrayListA, z12, this.f73834a.a(), null, null, 99, null);
    }
}
