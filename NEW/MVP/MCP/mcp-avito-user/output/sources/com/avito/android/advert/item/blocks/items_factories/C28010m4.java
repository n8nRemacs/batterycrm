package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestItem;
import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSearchSuggests;
import com.avito.android.remote.model.SuggestAnalyticsData;
import com.avito.android.remote.model.search_suggests.AdvertSearchSuggest;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsSearchSuggestsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/m4;", "Lcom/avito/android/advert/item/blocks/items_factories/l4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.m4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28010m4 implements InterfaceC28003l4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73990a;

    @Inject
    public C28010m4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73990a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28003l4
    @Y61.k
    public final AdvertDetailsSearchSuggestsItem a(@Y61.k AdvertDetails advertDetails) {
        ArrayList arrayList;
        List<AdvertSearchSuggest> suggests;
        AdvertSearchSuggests searchSuggests = advertDetails.getSearchSuggests();
        String title = searchSuggests != null ? searchSuggests.getTitle() : null;
        AdvertSearchSuggests searchSuggests2 = advertDetails.getSearchSuggests();
        if (searchSuggests2 == null || (suggests = searchSuggests2.getSuggests()) == null) {
            arrayList = null;
        } else {
            List<AdvertSearchSuggest> list = suggests;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (AdvertSearchSuggest advertSearchSuggest : list) {
                SuggestAnalyticsData analyticsData = advertSearchSuggest.getAnalyticsData();
                arrayList2.add(new AdvertDetailsSearchSuggestItem(advertSearchSuggest.getIcon(), advertSearchSuggest.getTitle(), advertSearchSuggest.getDescription(), advertSearchSuggest.getDeeplink(), analyticsData != null ? analyticsData.getCid() : null, analyticsData != null ? analyticsData.getIid() : null, analyticsData != null ? analyticsData.getType() : null));
            }
            arrayList = arrayList2;
        }
        return new AdvertDetailsSearchSuggestsItem(0L, null, title, arrayList, advertDetails.getId(), advertDetails.getCategoryId(), this.f73990a.a(), 3, null);
    }
}
