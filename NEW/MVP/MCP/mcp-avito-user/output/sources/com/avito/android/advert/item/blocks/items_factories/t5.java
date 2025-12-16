package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.compatibility.v3.GarageCompatibilityV3Item;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SparePartsFilters;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: GarageCompatibilityV3ItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/t5;", "Lcom/avito/android/advert/item/blocks/items_factories/s5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t5 implements s5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74034a;

    @Inject
    public t5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74034a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.s5
    @Y61.l
    public final GarageCompatibilityV3Item a(@Y61.k AdvertDetails advertDetails) {
        String str;
        Integer numY0;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, String> sparePartFiltersV4 = advertDetails.getSparePartFiltersV4();
        SparePartsFilters sparePartsFilters = advertDetails.getSparePartsFilters();
        Integer numY02 = null;
        if (!advertDetails.isActive() || (sparePartsFilters == null && sparePartFiltersV4 == null)) {
            return null;
        }
        if (sparePartsFilters == null) {
            Integer numY03 = (sparePartFiltersV4 == null || (str5 = sparePartFiltersV4.get("carBrand")) == null) ? null : C43066x.y0(str5);
            Integer numY04 = (sparePartFiltersV4 == null || (str4 = sparePartFiltersV4.get("carGeneration")) == null) ? null : C43066x.y0(str4);
            Integer numY05 = (sparePartFiltersV4 == null || (str3 = sparePartFiltersV4.get("carModel")) == null) ? null : C43066x.y0(str3);
            if (sparePartFiltersV4 != null && (str2 = sparePartFiltersV4.get("carModification")) != null) {
                numY02 = C43066x.y0(str2);
            }
            sparePartsFilters = new SparePartsFilters(numY03, numY04, numY05, numY02, (sparePartFiltersV4 == null || (str = sparePartFiltersV4.get(Navigation.MICRO_CATEGORY_ID)) == null || (numY0 = C43066x.y0(str)) == null) ? 0 : numY0.intValue(), null, 32, null);
        }
        return new GarageCompatibilityV3Item(0L, null, sparePartsFilters, sparePartFiltersV4, advertDetails.getId(), this.f74034a.a(), null, null, 195, null);
    }
}
