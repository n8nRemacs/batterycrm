package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeBarParams;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeStyle;
import com.avito.android.remote.model.advert_badge_bar.BadgeBarOrientation;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertBadgeBarItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/b;", "Lcom/avito/android/advert/item/blocks/items_factories/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27928b implements InterfaceC27921a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73915a;

    @Inject
    public C27928b(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73915a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27921a
    @Y61.l
    public final AdvertBadgeBarItem a(@Y61.k AdvertDetails advertDetails) {
        BadgeBarOrientation display;
        AdvertBadgeBarParams view;
        AdvertBadgeBarParams view2;
        AdvertBadgeBarParams view3;
        Boolean showArrow;
        AdvertBadgeBarParams view4;
        AdvertBadgeBar badgeBar = advertDetails.getBadgeBar();
        String showMoreTitle = null;
        List<AdvertBadge> badges = badgeBar != null ? badgeBar.getBadges() : null;
        List<AdvertBadge> list = badges;
        if (list == null || list.isEmpty()) {
            return null;
        }
        AdvertBadgeBar badgeBar2 = advertDetails.getBadgeBar();
        if (badgeBar2 == null || (view4 = badgeBar2.getView()) == null || (display = view4.getDisplay()) == null) {
            display = BadgeBarOrientation.VERTICAL;
        }
        BadgeBarOrientation badgeBarOrientation = display;
        boolean z12 = badgeBarOrientation == BadgeBarOrientation.VERTICAL;
        List<AdvertBadge> list2 = badges;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (AdvertBadge advertBadge : list2) {
            String strValueOf = String.valueOf(advertBadge.getId());
            int id2 = advertBadge.getId();
            String title = advertBadge.getTitle();
            String description = advertBadge.getDescription();
            String str = description == null ? "" : description;
            AdvertBadgeStyle style = advertBadge.getStyle();
            UniversalColor backgroundColor = style != null ? style.getBackgroundColor() : null;
            AdvertBadgeStyle style2 = advertBadge.getStyle();
            UniversalColor backgroundPressedColor = style2 != null ? style2.getBackgroundPressedColor() : null;
            AdvertBadgeStyle style3 = advertBadge.getStyle();
            UniversalColor fontColor = style3 != null ? style3.getFontColor() : null;
            AdvertBadgeStyle style4 = advertBadge.getStyle();
            UniversalImage icon = style4 != null ? style4.getIcon() : null;
            DeepLink uri = advertBadge.getUri();
            AdvertBadgeBar badgeBar3 = advertDetails.getBadgeBar();
            arrayList.add(new BadgeItem(strValueOf, id2, title, str, backgroundColor, backgroundPressedColor, fontColor, 1, 1, icon, uri, (badgeBar3 == null || (view3 = badgeBar3.getView()) == null || (showArrow = view3.getShowArrow()) == null) ? false : showArrow.booleanValue(), false, null, 12288, null));
        }
        String id3 = advertDetails.getId();
        AdvertBadgeBar badgeBar4 = advertDetails.getBadgeBar();
        Integer preloadCount = (badgeBar4 == null || (view2 = badgeBar4.getView()) == null) ? null : view2.getPreloadCount();
        if (!z12) {
            preloadCount = null;
        }
        int iIntValue = preloadCount != null ? preloadCount.intValue() : arrayList.size();
        AdvertBadgeBar badgeBar5 = advertDetails.getBadgeBar();
        if (badgeBar5 != null && (view = badgeBar5.getView()) != null) {
            showMoreTitle = view.getShowMoreTitle();
        }
        return new AdvertBadgeBarItem(0L, null, id3, arrayList, badgeBarOrientation, iIntValue, showMoreTitle == null ? "" : showMoreTitle, false, this.f73915a.a(), null, null, 1539, null);
    }
}
