package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.fmp.offer.AdvertDetailsFmpOfferItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.fmp.FmpOfferButton;
import com.avito.android.remote.fmp.FmpOfferCondition;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.fmp.Fmp;
import com.avito.android.remote.model.fmp.FmpOffer;
import com.avito.android.remote.model.fmp.OfferCondition;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.FmpButton;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsFmpOfferItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/D1;", "Lcom/avito/android/advert/item/blocks/items_factories/C1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D1 implements C1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73727a;

    @Inject
    public D1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73727a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.C1
    @Y61.l
    public final AdvertDetailsFmpOfferItem a(@Y61.k AdvertDetails advertDetails) {
        FmpOffer offer;
        ArrayList arrayList;
        FmpOfferButton fmpOfferButton;
        Fmp fmp = advertDetails.getFmp();
        if (fmp == null || (offer = fmp.getOffer()) == null) {
            return null;
        }
        AttributedText title = offer.getTitle();
        List<OfferCondition> conditions = offer.getConditions();
        if (conditions != null) {
            List<OfferCondition> list = conditions;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new FmpOfferCondition(((OfferCondition) it.next()).getTitle()));
            }
        } else {
            arrayList = null;
        }
        FmpButton button = offer.getButton();
        if (button != null) {
            String text = button.getText();
            DeepLink deeplink = button.getDeeplink();
            String style = button.getStyle();
            List<FmpAnalyticsEvent> onClick = button.getOnClick();
            fmpOfferButton = new FmpOfferButton(text, deeplink, style, onClick != null ? F1.a(onClick) : null);
        } else {
            fmpOfferButton = null;
        }
        List<FmpAnalyticsEvent> onAppear = offer.getOnAppear();
        return new AdvertDetailsFmpOfferItem(title, arrayList, fmpOfferButton, onAppear != null ? F1.a(onAppear) : null, offer.getLegal(), 0L, null, this.f73727a.a(), null, null, 864, null);
    }
}
