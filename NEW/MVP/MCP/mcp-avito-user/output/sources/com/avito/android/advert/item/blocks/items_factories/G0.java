package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.di.C27710t;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.credit_broker.CalculatorPosition;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsV2Product;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCreditCalculatorItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/G0;", "Lcom/avito/android/advert/item/blocks/items_factories/F0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G0 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f73752a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73753b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73754c;

    @Inject
    public G0(@Y61.k com.avito.android.credits.q qVar, @Y61.k com.avito.android.advert.item.similars.j jVar, @C27710t.q boolean z12) {
        this.f73752a = qVar;
        this.f73753b = jVar;
        this.f73754c = z12;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.F0
    @Y61.l
    public final CreditCalculatorItem a(@Y61.k AdvertDetails advertDetails, @Y61.k AdvertDetailsStyle advertDetailsStyle) {
        CreditCalculator data;
        if (this.f73754c || (data = this.f73752a.getData()) == null) {
            return null;
        }
        CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
        InstallmentsV2Product installmentsV2Product = creditInfo instanceof InstallmentsV2Product ? (InstallmentsV2Product) creditInfo : null;
        if (installmentsV2Product != null && installmentsV2Product.getTitle() == null && installmentsV2Product.getAttributedSubtitle() == null && installmentsV2Product.getLoanTerms() == null) {
            return null;
        }
        CreditCalculator.Type type = CreditCalculator.Type.f128979d;
        CreditCalculator.Type type2 = data.f128957g;
        Integer numValueOf = (!(type2 == type || type2 == CreditCalculator.Type.f128980e) || advertDetailsStyle == AdvertDetailsStyle.f84411e) ? null : Integer.valueOf(I0.f73771a);
        CalculatorPosition calculatorPosition = data.f128962l;
        if (calculatorPosition == null) {
            calculatorPosition = CalculatorPosition.DEFAULT;
        }
        CalculatorPosition calculatorPosition2 = calculatorPosition;
        com.avito.android.credits.models.e eVar = data instanceof com.avito.android.credits.models.e ? (com.avito.android.credits.models.e) data : null;
        return new CreditCalculatorItem(data.f128957g, calculatorPosition2, eVar != null ? eVar.f129002A : null, !advertDetails.isRedesign(), numValueOf, 0L, null, this.f73753b.a(), null, null, 864, null);
    }
}
