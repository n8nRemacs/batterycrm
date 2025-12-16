package com.avito.android.advert.item.spare_parts;

import Y61.k;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.SparePartsParameters;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SparePartsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/d;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d {
    @k
    Z1 a(@k SparePartsParameters sparePartsParameters, @k String str);

    @k
    Z1 b(@k String str, @k Map map);

    @k
    Z1 c(@k SparePartsFilters sparePartsFilters, @k String str);

    void m0();
}
