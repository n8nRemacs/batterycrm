package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.mortgage_snippet.MortgageSnippetItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ItemCardRedesign;
import com.avito.android.remote.model.mortgage.MortgageCalculatorConfiguration;
import com.avito.android.remote.model.mortgage.MortgageSnippet;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsMortgageSnippetItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/L2;", "Lcom/avito/android/advert/item/blocks/items_factories/K2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L2 implements K2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73798a;

    @Inject
    public L2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73798a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.K2
    @Y61.l
    public final MortgageSnippetItem a(@Y61.k AdvertDetails advertDetails) {
        Boolean mortgageEntryPointRedesign;
        MortgageCalculatorConfiguration mortgageCalculatorConfig = advertDetails.getMortgageCalculatorConfig();
        if (mortgageCalculatorConfig == null) {
            return null;
        }
        ItemCardRedesign itemCardRedesign = advertDetails.getItemCardRedesign();
        boolean zBooleanValue = (itemCardRedesign == null || (mortgageEntryPointRedesign = itemCardRedesign.getMortgageEntryPointRedesign()) == null) ? false : mortgageEntryPointRedesign.booleanValue();
        MortgageSnippet snippet = mortgageCalculatorConfig.getSnippet();
        String title = snippet != null ? snippet.getTitle() : null;
        MortgageSnippet snippet2 = mortgageCalculatorConfig.getSnippet();
        String paymentTemplate = snippet2 != null ? snippet2.getPaymentTemplate() : null;
        MortgageSnippet snippet3 = mortgageCalculatorConfig.getSnippet();
        String emptyPaymentTemplate = snippet3 != null ? snippet3.getEmptyPaymentTemplate() : null;
        MortgageSnippet snippet4 = mortgageCalculatorConfig.getSnippet();
        return new MortgageSnippetItem(zBooleanValue, title, paymentTemplate, emptyPaymentTemplate, snippet4 != null ? snippet4.getActionTitle() : null, this.f73798a.getSpanCount(), 0L, null, null, null, 960, null);
    }
}
