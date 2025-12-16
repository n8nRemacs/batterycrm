package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.RepairServicesCalculator;
import com.avito.android.repair_calculator.AdvertDetailsRepairCalculatorItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRepairCalculatorItemFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/O3;", "Lcom/avito/android/advert/item/blocks/items_factories/N3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O3 implements N3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73822a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73823b;

    @Inject
    public O3(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73822a = b22;
        this.f73823b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.N3
    @Y61.l
    public final AdvertDetailsRepairCalculatorItem a(@Y61.k AdvertDetails advertDetails) {
        RepairServicesCalculator repairServicesCalculator;
        com.avito.android.B2 b22 = this.f73822a;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.B2.f67184X[30];
        if (!((Boolean) b22.f67190F.a().invoke()).booleanValue() || (repairServicesCalculator = advertDetails.getRepairServicesCalculator()) == null) {
            return null;
        }
        String id2 = advertDetails.getId();
        String xHash = advertDetails.getXHash();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsRepairCalculatorItem(repairServicesCalculator, id2, xHash, "ITEM_REPAIR_CALCULATOR_BANNER", this.f73823b.a());
    }
}
