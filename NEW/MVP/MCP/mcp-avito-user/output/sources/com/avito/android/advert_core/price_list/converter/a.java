package com.avito.android.advert_core.price_list.converter;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.price_list.PriceList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PriceListItemsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/converter/a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: PriceListItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.price_list.converter.a$a, reason: collision with other inner class name */
    public static final class C2490a {
    }

    @l
    List a(@l AdvertParameters advertParameters);

    @k
    List<AdvertPriceListSectionItem> b(@k PriceList priceList);
}
