package com.avito.android.advert_core.price_list.converter;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import com.avito.android.advert_core.price_list.PriceListGroupTitleItem;
import com.avito.android.advert_core.price_list.PriceListHeaderItem;
import com.avito.android.advert_core.price_list.PriceListItem;
import com.avito.android.advert_core.price_list.v2.AdvertPriceListV2Item;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.price_list.PriceList;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/converter/b;", "Lcom/avito/android/advert_core/price_list/converter/a;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.advert_core.price_list.converter.a
    @l
    public final List a(@l AdvertParameters advertParameters) {
        PriceList priceList;
        int i12;
        PriceListGroupTitleItem priceListGroupTitleItem;
        List list = null;
        if (advertParameters == null || (priceList = advertParameters.getPriceList()) == null) {
            return null;
        }
        String title = priceList.getTitle();
        int i13 = 1;
        PriceListHeaderItem priceListHeaderItem = new PriceListHeaderItem(0L, null, title == null ? "" : title, i13, 3, null);
        List<PriceList.Group> groups = priceList.getGroups();
        if (groups != null) {
            List arrayList = new ArrayList();
            for (PriceList.Group group : groups) {
                String title2 = group.getTitle();
                String str = title2 == null ? "" : title2;
                if (str.length() > 0) {
                    i12 = i13;
                    priceListGroupTitleItem = new PriceListGroupTitleItem(0L, null, str, i12, 3, null);
                } else {
                    i12 = i13;
                    priceListGroupTitleItem = null;
                }
                List<PriceList.Value> values = group.getValues();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(values, 10));
                for (PriceList.Value value : values) {
                    arrayList2.add(new PriceListItem(String.valueOf(value.hashCode()), value.getTitle(), value.getPrice(), i12));
                }
                ArrayList arrayList3 = new ArrayList();
                if (priceListGroupTitleItem != null) {
                    arrayList3.add(priceListGroupTitleItem);
                }
                arrayList3.addAll(arrayList2);
                C42745f0.h(arrayList3, arrayList);
                i13 = i12;
            }
            list = arrayList;
        }
        if (list == null) {
            list = C42784z0.f406748b;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(priceListHeaderItem);
        arrayList4.addAll(list);
        return arrayList4;
    }

    @Override // com.avito.android.advert_core.price_list.converter.a
    @k
    public final List<AdvertPriceListSectionItem> b(@k PriceList priceList) {
        ArrayList arrayList;
        List<PriceList.Group> groups = priceList.getGroups();
        if (groups != null) {
            List<PriceList.Group> list = groups;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (PriceList.Group group : list) {
                String strValueOf = String.valueOf(group.hashCode());
                String title = group.getTitle();
                Boolean boolIsCollapsed = group.isCollapsed();
                boolean z12 = !(boolIsCollapsed != null ? boolIsCollapsed.booleanValue() : false);
                Boolean areGroupsCollapsible = group.getAreGroupsCollapsible();
                boolean zBooleanValue = areGroupsCollapsible != null ? areGroupsCollapsible.booleanValue() : true;
                List<PriceList.Value> values = group.getValues();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(values, 10));
                for (PriceList.Value value : values) {
                    arrayList2.add(new AdvertPriceListV2Item(String.valueOf(value.hashCode()), value.getTitle(), value.getSubTitle(), value.getPrice(), value.getSubPrice(), value.getImv()));
                }
                arrayList.add(new AdvertPriceListSectionItem(0, strValueOf, title, arrayList2, z12, zBooleanValue));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
