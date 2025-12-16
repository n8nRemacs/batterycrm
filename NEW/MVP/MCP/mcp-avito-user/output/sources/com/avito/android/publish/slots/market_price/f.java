package com.avito.android.publish.slots.market_price;

import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlotConfig;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import qf0.C47393a;

/* compiled from: MarketPriceSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "parameter", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<EditableParameter<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f244535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar) {
        super(1);
        this.f244535l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(EditableParameter<?> editableParameter) {
        MarketPriceResponse.MarketPrice marketPrice;
        List<MarketPriceResponse.PriceRange> priceRanges;
        Long lO2;
        long jLongValue;
        MarketPriceResponse.PriceRange priceRangeN;
        String id2 = editableParameter.getId();
        a aVar = this.f244535l;
        if (L.f(id2, ((MarketPriceSlotConfig) aVar.f244509b.getWidget().getConfig()).getPriceId())) {
            MarketPriceResponse marketPriceResponse = aVar.f244523p;
            if (marketPriceResponse != null && (marketPrice = marketPriceResponse.getMarketPrice()) != null) {
                long price = marketPrice.getPrice();
                MarketPriceResponse marketPriceResponse2 = aVar.f244523p;
                if (marketPriceResponse2 != null && (priceRanges = marketPriceResponse2.getPriceRanges()) != null && (lO2 = a.o(aVar.m())) != null && (priceRangeN = a.n((jLongValue = lO2.longValue()), priceRanges)) != null) {
                    aVar.f244516i.c(new C47393a(aVar.f244515h, jLongValue, price, priceRangeN));
                }
            }
            aVar.f244527t.accept(new f.b(SlotType.MARKET_PRICE, null));
        } else if (aVar.f244521n.contains(id2)) {
            aVar.p();
        }
        return G0.f406611a;
    }
}
