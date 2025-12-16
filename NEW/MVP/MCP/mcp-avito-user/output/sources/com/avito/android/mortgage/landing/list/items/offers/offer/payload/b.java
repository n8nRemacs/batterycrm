package com.avito.android.mortgage.landing.list.items.offers.offer.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.android.mortgage.landing.list.items.offers.offer.payload.a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof OfferItem) || !(aVar2 instanceof OfferItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        OfferItem offerItem = (OfferItem) aVar2;
        boolean z12 = offerItem.f199847c;
        OfferItem offerItem2 = (OfferItem) aVar;
        if (z12 != offerItem2.f199847c) {
            arrayList.add(new a.b(z12));
        }
        AttributedText attributedText = offerItem.f199850f;
        if (!L.f(attributedText, offerItem2.f199850f)) {
            arrayList.add(new a.c(attributedText));
        }
        List<OfferBadge> list = offerItem.f199851g;
        if (!L.f(list, offerItem2.f199851g)) {
            arrayList.add(new a.C5906a(list));
        }
        return arrayList;
    }
}
