package com.avito.android.mortgage.landing.list.items.offers.offer;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.offers.offer.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OfferPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/e;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/g;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/OfferItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, OfferItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<String, Boolean, G0> f199858b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k p<? super String, ? super Boolean, G0> pVar) {
        this.f199858b = pVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (OfferItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        OfferItem offerItem = (OfferItem) aVar;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.offers.offer.payload.a> list2 = (List) obj;
        if (list2 != null) {
            for (com.avito.android.mortgage.landing.list.items.offers.offer.payload.a aVar2 : list2) {
                if (aVar2 instanceof a.b) {
                    gVar.setChecked(((a.b) aVar2).f199869a);
                } else if (aVar2 instanceof a.c) {
                    gVar.k(((a.c) aVar2).f199870a);
                } else if (aVar2 instanceof a.C5906a) {
                    gVar.V8(((a.C5906a) aVar2).f199868a);
                }
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            k(gVar, offerItem);
        }
    }

    public final void k(@k g gVar, @k OfferItem offerItem) {
        gVar.setTitle(offerItem.f199849e);
        gVar.k(offerItem.f199850f);
        gVar.V8(offerItem.f199851g);
        gVar.nb(offerItem.f199848d);
        gVar.setChecked(offerItem.f199847c);
        gVar.UZ(new d(this, offerItem));
    }
}
