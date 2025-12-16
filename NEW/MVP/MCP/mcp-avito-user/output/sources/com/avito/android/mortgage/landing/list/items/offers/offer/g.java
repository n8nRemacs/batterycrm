package com.avito.android.mortgage.landing.list.items.offers.offer;

import Y41.l;
import Y61.k;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: OfferView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/g;", "LTV0/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g extends TV0.e {

    /* compiled from: OfferView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void UZ(@k l<? super Boolean, G0> lVar);

    void V8(@k List<OfferBadge> list);

    void k(@k AttributedText attributedText);

    void nb(@Y61.l String str);

    void setChecked(boolean z12);

    void setTitle(@k String str);
}
