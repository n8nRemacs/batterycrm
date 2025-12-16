package com.avito.android.advert_details_items.price.realty;

import androidx.core.os.C22777e;
import com.avito.android.advert_details_items.price.realty.AdvertDetailsNormalizedAndHistoryPricesItem;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85237l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory f85238m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory priceHistory) {
        super(0);
        this.f85237l = fVar;
        this.f85238m = priceHistory;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f85237l;
        AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory priceHistory = this.f85238m;
        b.a.a(fVar.f85240b, priceHistory.f85226c, null, C22777e.b(new Q("key.item_price_history_context", priceHistory.f85225b), new Q("key.item_price_history_is_favorite", Boolean.valueOf(fVar.f85243e))), 2);
        return G0.f406611a;
    }
}
