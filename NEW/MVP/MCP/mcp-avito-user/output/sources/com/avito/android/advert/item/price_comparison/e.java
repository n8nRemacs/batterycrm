package com.avito.android.advert.item.price_comparison;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.price_comparison.c;
import com.avito.android.remote.model.model_card.PriceInfo;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceComparisonItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/price_comparison/e;", "Lcom/avito/android/advert/item/price_comparison/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c.a f78231b;

    @Inject
    public e(@k c.a aVar) {
        this.f78231b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        PriceComparisonItem priceComparisonItem = (PriceComparisonItem) aVar;
        PriceInfo priceInfo = priceComparisonItem.f78222e.getPriceInfo();
        if (priceInfo == null) {
            throw new IllegalStateException("No price provided");
        }
        gVar.Hq(priceInfo);
        gVar.a(new d(this, priceComparisonItem));
    }
}
