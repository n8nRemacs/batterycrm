package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.other_categories.OtherCategoriesItem;
import com.avito.android.advert.item.other_categories.item.CategoryItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.OtherCategories;
import com.avito.android.remote.model.OtherCategory;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsOtherCategoriesItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/a3;", "Lcom/avito/android/advert/item/blocks/items_factories/Z2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.a3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27925a3 implements Z2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73910a;

    @Inject
    public C27925a3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73910a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Z2
    @Y61.l
    public final OtherCategoriesItem a(@Y61.l OtherCategories otherCategories) {
        if (otherCategories == null) {
            return null;
        }
        String title = otherCategories.getTitle();
        Boolean showTitleArrow = otherCategories.getShowTitleArrow();
        boolean zBooleanValue = showTitleArrow != null ? showTitleArrow.booleanValue() : false;
        DeepLink titleDeepLink = otherCategories.getTitleDeepLink();
        List<OtherCategory> list = otherCategories.getList();
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (OtherCategory otherCategory : list) {
            arrayList.add(new CategoryItem(otherCategory.getTitle(), null, otherCategory.getSubtitle(), otherCategory.getImage(), otherCategory.getDeepLink(), otherCategory.getRightEdgeIcon(), 2, null));
        }
        return new OtherCategoriesItem(0L, null, title, arrayList, zBooleanValue, titleDeepLink, this.f73910a.getSpanCount(), null, null, 387, null);
    }
}
