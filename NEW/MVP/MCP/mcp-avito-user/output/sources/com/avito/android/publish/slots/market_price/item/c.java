package com.avito.android.publish.slots.market_price.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.MarketPriceItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketPriceItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/slots/market_price/item/c;", "LTV0/d;", "Lcom/avito/android/publish/slots/market_price/item/h;", "Lcom/avito/android/items/MarketPriceItem;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements TV0.d<h, MarketPriceItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        MarketPriceItem marketPriceItem = (MarketPriceItem) aVar;
        hVar.QQ(marketPriceItem.f173902c);
        CharSequence charSequence = marketPriceItem.f173904e;
        if (charSequence == null) {
            hVar.zQ(false);
        } else {
            hVar.P2(charSequence);
            hVar.zQ(true);
        }
        MarketPriceItem.a aVar2 = marketPriceItem.f173903d;
        if (aVar2 != null) {
            hVar.Pq(aVar2.f173914b, aVar2.f173913a);
            String str = aVar2.f173915c;
            if (str == null) {
                str = "";
            }
            hVar.tf(str);
            hVar.YE(aVar2.f173916d);
        }
        hVar.Tv(aVar2 != null);
        hVar.t60(marketPriceItem.f173905f);
    }
}
