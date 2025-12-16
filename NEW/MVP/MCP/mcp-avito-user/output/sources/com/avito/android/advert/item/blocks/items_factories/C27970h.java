package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.additionalSeller.AdditionalSellerButtonItem;
import com.avito.android.advert.item.additionalSeller.analytics.ButtonItemAnalyticsInfo;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdditionalSellerAnalyticsInfo;
import com.avito.android.remote.model.AdditionalSellerButtons;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsAdditionalSellerButtonItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/h;", "Lcom/avito/android/advert/item/blocks/items_factories/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27970h implements InterfaceC27963g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73960a;

    @Inject
    public C27970h(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73960a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27963g
    @Y61.l
    public final AdditionalSellerButtonItem a(@Y61.k AdvertDetails advertDetails) {
        AdditionalSellerButtons buttons;
        AdditionalSeller additionalSeller = advertDetails.getAdditionalSeller();
        ButtonItemAnalyticsInfo buttonItemAnalyticsInfo = null;
        if (additionalSeller == null || (buttons = additionalSeller.getButtons()) == null) {
            return null;
        }
        int iA2 = this.f73960a.a();
        boolean zIsRedesign = advertDetails.isRedesign();
        boolean zIsRestyle = advertDetails.isRestyle();
        ArrayList<String> arrayList = com.avito.android.advert_core.contactbar.v.f83271a;
        SerpResultCategoryDetails categoryDetails = advertDetails.getCategoryDetails();
        boolean zR2 = C42745f0.r(arrayList, categoryDetails != null ? categoryDetails.getMicroCategoryId() : null);
        AdditionalSellerAnalyticsInfo analyticsInfo = additionalSeller.getAnalyticsInfo();
        if (analyticsInfo != null) {
            String id2 = advertDetails.getId();
            Integer cardModelId = analyticsInfo.getCardModelId();
            int iIntValue = cardModelId != null ? cardModelId.intValue() : -1;
            Integer catalogId = analyticsInfo.getCatalogId();
            buttonItemAnalyticsInfo = new ButtonItemAnalyticsInfo(id2, iIntValue, catalogId != null ? catalogId.intValue() : -1);
        }
        return new AdditionalSellerButtonItem(0L, null, iA2, null, null, buttons, zIsRedesign, zIsRestyle, zR2, buttonItemAnalyticsInfo, 27, null);
    }
}
