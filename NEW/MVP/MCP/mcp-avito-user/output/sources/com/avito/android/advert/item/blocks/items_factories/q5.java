package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.ab_tests.configs.SparePartsGarageItemCompatV2RenaissanceTestGroup;
import com.avito.android.advert.item.compatibility.v2.GarageCompatibilityV2Item;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.SparePartsParameters;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GarageCompatibilityV2ItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/q5;", "Lcom/avito/android/advert/item/blocks/items_factories/p5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q5 implements InterfaceC28032p5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74014a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup> f74015b;

    @Inject
    public q5(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup> fVar) {
        this.f74014a = jVar;
        this.f74015b = fVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28032p5
    @Y61.l
    public final GarageCompatibilityV2Item a(@Y61.k AdvertDetails advertDetails) {
        SparePartsParameters sparePartsParams = advertDetails.getSparePartsParams();
        SparePartsGarageItemCompatV2RenaissanceTestGroup sparePartsGarageItemCompatV2RenaissanceTestGroupA = this.f74015b.a();
        sparePartsGarageItemCompatV2RenaissanceTestGroupA.getClass();
        if (sparePartsGarageItemCompatV2RenaissanceTestGroupA == SparePartsGarageItemCompatV2RenaissanceTestGroup.f67924c || sparePartsGarageItemCompatV2RenaissanceTestGroupA == SparePartsGarageItemCompatV2RenaissanceTestGroup.f67925d || !advertDetails.isActive() || sparePartsParams == null) {
            return null;
        }
        return new GarageCompatibilityV2Item(0L, null, sparePartsParams, advertDetails.getId(), this.f74014a.a(), null, null, 99, null);
    }
}
