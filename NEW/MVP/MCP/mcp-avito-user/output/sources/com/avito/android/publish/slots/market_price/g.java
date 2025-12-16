package com.avito.android.publish.slots.market_price;

import com.avito.android.remote.model.PriceBadge;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MarketPriceSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f244536b;

    public g(a aVar) {
        this.f244536b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        a aVar = this.f244536b;
        aVar.f244518k.n();
        ArrayList arrayList = null;
        if (!(typedResult instanceof TypedResult.Success)) {
            aVar.f244523p = null;
            aVar.f244524q = null;
            return;
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        aVar.f244523p = (MarketPriceResponse) success.getResult();
        List<MarketPriceResponse.PriceRange> priceRanges = ((MarketPriceResponse) success.getResult()).getPriceRanges();
        if (priceRanges != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = priceRanges.iterator();
            while (it.hasNext()) {
                PriceBadge priceBadge = ((MarketPriceResponse.PriceRange) it.next()).getPriceBadge();
                String title = priceBadge != null ? priceBadge.getTitle() : null;
                if (title != null) {
                    arrayList2.add(title);
                }
            }
            arrayList = arrayList2;
        }
        aVar.f244524q = arrayList;
    }
}
