package com.avito.android.publish.slots.market_price_v2.item;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLinkV2;
import com.avito.android.deep_linking.links.x;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceBadge;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: MarketPriceV2Presenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/market_price_v2/item/n;", "Lcom/avito/android/publish/slots/market_price_v2/item/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f244578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f244579c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f244580d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f244581e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f244582f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f244583g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f244584h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f244585i;

    @Inject
    public n(@Y61.k f fVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k a aVar2) {
        this.f244578b = fVar;
        this.f244579c = aVar;
        this.f244580d = aVar2;
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244581e = cVar;
        this.f244582f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244583g = cVar2;
        this.f244584h = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar;
        G0 g02;
        p pVar = (p) eVar;
        JO.l lVar = (JO.l) aVar;
        Context f244596i = pVar.getF244596i();
        MarketPriceResponse.PriceRangeV2 priceRangeV2 = lVar.f8957e;
        String description = priceRangeV2.getDescription();
        MarketPriceBadge priceBadge = priceRangeV2.getPriceBadge();
        f fVar = this.f244578b;
        pVar.dl(fVar.b(f244596i, description, priceBadge));
        com.avito.android.util.text.a aVar2 = this.f244579c;
        AttributedText attributedText = lVar.f8956d;
        if (attributedText == null) {
            pVar.zE(null, null);
        } else {
            final int i13 = 1;
            attributedText.setOnUrlClickListener(new x(this) { // from class: com.avito.android.publish.slots.market_price_v2.item.l

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f244575c;

                {
                    this.f244575c = this;
                }

                @Override // com.avito.android.deep_linking.links.x
                public final boolean X(String str) {
                    switch (i13) {
                        case 0:
                            this.f244575c.f244581e.accept(str);
                            break;
                        default:
                            this.f244575c.f244581e.accept(str);
                            break;
                    }
                    return true;
                }
            });
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(6, this, lVar));
            if (this.f244585i) {
                mVar = null;
            } else {
                List<Attribute> attributes = attributedText.getAttributes();
                ArrayList arrayList = new ArrayList();
                for (Object obj : attributes) {
                    if (obj instanceof DeepLinkAttribute) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                mVar = null;
                while (it.hasNext()) {
                    DeepLink deepLink = ((DeepLinkAttribute) it.next()).getDeepLink();
                    if ((deepLink instanceof ImvCarsDetailsLink) || (deepLink instanceof ImvCarsDetailsLinkV2)) {
                        mVar = new m(this, lVar);
                    }
                }
            }
            pVar.zE(aVar2.c(pVar.getF244596i(), attributedText), mVar);
        }
        pVar.BC(priceRangeV2.getHighlightedText());
        AttributedText badgeText = priceRangeV2.getBadgeText();
        Long l12 = lVar.f8958f;
        Long l13 = lVar.f8959g;
        if (badgeText != null) {
            String strA = fVar.a(l13, l12, badgeText.getText());
            if (!strA.equals(badgeText.getText())) {
                badgeText = new AttributedText(strA, badgeText.getAttributes(), 0, 4, null);
            }
            final int i14 = 0;
            badgeText.setOnUrlClickListener(new x(this) { // from class: com.avito.android.publish.slots.market_price_v2.item.l

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f244575c;

                {
                    this.f244575c = this;
                }

                @Override // com.avito.android.deep_linking.links.x
                public final boolean X(String str) {
                    switch (i14) {
                        case 0:
                            this.f244575c.f244581e.accept(str);
                            break;
                        default:
                            this.f244575c.f244581e.accept(str);
                            break;
                    }
                    return true;
                }
            });
            badgeText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 15));
            pVar.PR(aVar2.c(pVar.getF244596i(), badgeText));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            pVar.PR(null);
        }
        pVar.Bx();
        UniversalColor noticeColor = priceRangeV2.getNoticeColor();
        Integer numValueOf = noticeColor != null ? Integer.valueOf(C48063a.f437606a.a(pVar.getF244596i(), noticeColor)) : null;
        List<String> notices = priceRangeV2.getNotices();
        if (notices != null) {
            Iterator<T> it2 = notices.iterator();
            while (it2.hasNext()) {
                pVar.TS(numValueOf, fVar.a(l13, l12, (String) it2.next()));
            }
        }
        pVar.rk(priceRangeV2.getCallout());
        pVar.bY(lVar.f8960h);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.k
    @Y61.k
    public final z<DeepLink> j() {
        return this.f244584h;
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.k
    @Y61.k
    public final z<String> l() {
        return this.f244582f;
    }
}
