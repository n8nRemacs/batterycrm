package com.avito.android.publish.slots.market_price;

import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MarketPriceSlotWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2$b;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f244551b;

    public j(a aVar) {
        this.f244551b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        MarketPriceResponse.PriceDescription priceDescription;
        PriceParameter priceParameterM;
        String priceRecommend;
        a aVar = this.f244551b;
        MarketPriceResponse marketPriceResponse = aVar.f244523p;
        if (marketPriceResponse != null && (priceDescription = marketPriceResponse.getPriceDescription()) != null && (priceParameterM = aVar.m()) != null && a.o(priceParameterM) == null && (priceRecommend = priceDescription.getPriceRecommend()) != null && !C43066x.K(priceRecommend)) {
            priceParameterM.setValue(priceDescription.getPriceRecommend());
        }
        aVar.f244527t.accept(new f.b(SlotType.MARKET_PRICE, null));
    }
}
