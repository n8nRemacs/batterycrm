package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.ExtendedProfileAboutV2;
import com.avito.android.remote.model.ExtendedProfileAdvBanner;
import com.avito.android.remote.model.ExtendedProfileAdvertsTabs;
import com.avito.android.remote.model.ExtendedProfileBadgeBar;
import com.avito.android.remote.model.ExtendedProfileBadgeBarV3;
import com.avito.android.remote.model.ExtendedProfileBanner;
import com.avito.android.remote.model.ExtendedProfileBaseInfo;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import com.avito.android.remote.model.ExtendedProfileCarousel;
import com.avito.android.remote.model.ExtendedProfileCategorizer;
import com.avito.android.remote.model.ExtendedProfileContacts;
import com.avito.android.remote.model.ExtendedProfileElement;
import com.avito.android.remote.model.ExtendedProfileFloatingBuyBlock;
import com.avito.android.remote.model.ExtendedProfileGallery;
import com.avito.android.remote.model.ExtendedProfileGeo;
import com.avito.android.remote.model.ExtendedProfileJobCompanyCarousel;
import com.avito.android.remote.model.ExtendedProfileJobCompanyItemListHeader;
import com.avito.android.remote.model.ExtendedProfilePremiumBanner;
import com.avito.android.remote.model.ExtendedProfileSearchBar;
import com.avito.android.remote.model.ExtendedProfileSelections;
import com.avito.android.remote.model.ExtendedProfileSellerPromotions;
import com.avito.android.remote.model.ExtendedProfileTabsWithWidgets;
import com.avito.android.remote.model.ExtendedProfileText;
import com.avito.android.remote.model.ExtendedProfileTitle;
import com.avito.android.remote.model.ExtendedProfileUniversalWidget;
import com.my.tracker.ads.AdFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileElementTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ExtendedProfileElementTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileElementTypeAdapter extends RuntimeTypeAdapter<ExtendedProfileElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254176a;

    public ExtendedProfileElementTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254176a = P0.j(new kotlin.Q("title", ExtendedProfileTitle.class), new kotlin.Q("text", ExtendedProfileText.class), new kotlin.Q(AdvertDetailsBlockIdKt.GALLERY_BLOCK, ExtendedProfileGallery.class), new kotlin.Q("item_tabs", ExtendedProfileAdvertsTabs.class), new kotlin.Q("contacts", ExtendedProfileContacts.class), new kotlin.Q("badgebar_v2", ExtendedProfileBadgeBar.class), new kotlin.Q("badgebar_v3", ExtendedProfileBadgeBarV3.class), new kotlin.Q("seller_promotions", ExtendedProfileSellerPromotions.class), new kotlin.Q(AdFormat.BANNER, ExtendedProfileBanner.class), new kotlin.Q("premium_banner", ExtendedProfilePremiumBanner.class), new kotlin.Q("item_list_with_filters", ExtendedProfileSearchBar.class), new kotlin.Q("base_info", ExtendedProfileBaseInfo.class), new kotlin.Q("base_info_ml", ExtendedProfileBaseInfoMl.class), new kotlin.Q("job_company_base_info", ExtendedProfileBaseInfo.class), new kotlin.Q("geo", ExtendedProfileGeo.class), new kotlin.Q("categorizer", ExtendedProfileCategorizer.class), new kotlin.Q("job_categorizer", ExtendedProfileCategorizer.class), new kotlin.Q("window_carousel", ExtendedProfileCarousel.class), new kotlin.Q("about_v2", ExtendedProfileAboutV2.class), new kotlin.Q("tabs_with_widgets", ExtendedProfileTabsWithWidgets.class), new kotlin.Q("item_selections", ExtendedProfileSelections.class), new kotlin.Q("job_company_item_list_header", ExtendedProfileJobCompanyItemListHeader.class), new kotlin.Q("job_company_window_carousel_public", ExtendedProfileJobCompanyCarousel.class), new kotlin.Q("universal_widget_public", ExtendedProfileUniversalWidget.class), new kotlin.Q("adv_banner", ExtendedProfileAdvBanner.class), new kotlin.Q("floating_buy_block", ExtendedProfileFloatingBuyBlock.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends ExtendedProfileElement>> getMapping() {
        return this.f254176a;
    }
}
