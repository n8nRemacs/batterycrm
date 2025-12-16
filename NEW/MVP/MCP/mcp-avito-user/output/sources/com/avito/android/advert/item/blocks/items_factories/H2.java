package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.mortgage_calculator.MortgageCalculatorItem;
import com.avito.android.mortgage_calculator.model.MortgageCalculatorConfig;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.mortgage.MortgageCalculatorConfiguration;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsMortgageCalculatorItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/H2;", "Lcom/avito/android/advert/item/blocks/items_factories/G2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H2 implements G2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73764a;

    @Inject
    public H2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73764a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.G2
    @Y61.l
    public final MortgageCalculatorItem a(@Y61.k AdvertDetails advertDetails) {
        MortgageCalculatorConfiguration mortgageCalculatorConfig = advertDetails.getMortgageCalculatorConfig();
        if (mortgageCalculatorConfig == null) {
            return null;
        }
        return new MortgageCalculatorItem(new MortgageCalculatorConfig(mortgageCalculatorConfig.getEntityType(), mortgageCalculatorConfig.getEntityId(), "avito_item_calculator", mortgageCalculatorConfig.getEntityId(), null, mortgageCalculatorConfig.getEntityType(), 16, null), this.f73764a.getSpanCount(), 0L, null, null, null, 60, null);
    }
}
