package com.avito.android.mortgage.landing.list.items.offers.offer;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferComparator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/c;", "Lcom/avito/android/recycler/data_aware/f;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.recycler.data_aware.f {
    @Override // com.avito.android.recycler.data_aware.f
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof OfferItem) || !(aVar2 instanceof OfferItem)) {
            return !L.f(aVar != null ? Long.valueOf(aVar.getF80616b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF80616b()) : null);
        }
        OfferItem offerItem = (OfferItem) aVar;
        OfferItem offerItem2 = (OfferItem) aVar2;
        return L.f(offerItem.f199846b, offerItem2.f199846b) && L.f(offerItem.f199850f, offerItem2.f199850f);
    }
}
