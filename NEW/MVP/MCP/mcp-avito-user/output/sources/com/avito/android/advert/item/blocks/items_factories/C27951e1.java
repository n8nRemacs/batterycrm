package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.advert_docking_badge_bar.AdvertDetailsDockingBadgeBarItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.advert_docking_badge_bar.AdvertDockingBadgeBar;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDockingBadgeBarFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/e1;", "Lcom/avito/android/advert/item/blocks/items_factories/d1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27951e1 implements InterfaceC27944d1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73941a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert_badge_bar.j f73942b;

    @Inject
    public C27951e1(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert_core.advert_badge_bar.j jVar2) {
        this.f73941a = jVar;
        this.f73942b = jVar2;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27944d1
    @Y61.l
    public final AdvertDetailsDockingBadgeBarItem a(@Y61.k AdvertDetails advertDetails) {
        List<AdvertDockingBadgeBar.Badge> badges;
        if (advertDetails.getBadgeBarLight() != null) {
            return null;
        }
        AdvertDockingBadgeBar dockingBadgeBar = advertDetails.getDockingBadgeBar();
        ArrayList arrayListA = (dockingBadgeBar == null || (badges = dockingBadgeBar.getBadges()) == null) ? null : this.f73942b.a(badges);
        if (arrayListA == null || arrayListA.isEmpty()) {
            return null;
        }
        return new AdvertDetailsDockingBadgeBarItem(0L, null, arrayListA, this.f73941a.a(), null, null, 51, null);
    }
}
