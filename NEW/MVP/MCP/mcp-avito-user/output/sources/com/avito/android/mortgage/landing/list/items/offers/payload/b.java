package com.avito.android.mortgage.landing.list.items.offers.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.offers.OffersItem;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.mortgage.landing.list.items.offers.payload.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OffersPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof OffersItem) || !(aVar2 instanceof OffersItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        OffersItem offersItem = (OffersItem) aVar2;
        OffersItem offersItem2 = (OffersItem) aVar;
        if (!L.f(offersItem.f199796e, offersItem2.f199796e)) {
            List<OfferItem> list = offersItem.f199796e;
            List<OfferItem> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                arrayList.add(new a.c(list));
            }
        }
        boolean z12 = offersItem.f199798g;
        if (z12 != offersItem2.f199798g) {
            arrayList.add(new a.C5907a(z12));
        }
        boolean z13 = offersItem.f199797f;
        if (z13 != offersItem2.f199797f || offersItem.isEmpty() != offersItem2.isEmpty()) {
            arrayList.add(new a.d(z13, offersItem.isEmpty()));
        }
        boolean z14 = offersItem.f199799h;
        if (z14 != offersItem2.f199799h) {
            arrayList.add(new a.b(z14));
        }
        return arrayList;
    }
}
