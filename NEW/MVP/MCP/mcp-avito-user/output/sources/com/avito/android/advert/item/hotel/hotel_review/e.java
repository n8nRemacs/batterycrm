package com.avito.android.advert.item.hotel.hotel_review;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertHotelReviewPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/e;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_review/g;", "Lcom/avito/android/advert/item/hotel/hotel_review/AdvertHotelReviewItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, AdvertHotelReviewItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f76262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<com.avito.konveyor.adapter.d> f76263c;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @K5.e @k h31.e<com.avito.konveyor.adapter.d> eVar) {
        this.f76262b = aVar;
        this.f76263c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertHotelReviewItem advertHotelReviewItem = (AdvertHotelReviewItem) aVar;
        gVar.b(advertHotelReviewItem.f76234g);
        gVar.q(advertHotelReviewItem.f76235h);
        ButtonAction buttonAction = advertHotelReviewItem.f76237j;
        gVar.ex(buttonAction);
        List<TV0.a> list = advertHotelReviewItem.f76236i;
        gVar.oF(O2.a(list));
        h31.e<com.avito.konveyor.adapter.d> eVar2 = this.f76263c;
        gVar.eV(eVar2.get());
        com.avito.konveyor.adapter.d dVar = eVar2.get();
        if (list == null) {
            list = C42784z0.f406748b;
        }
        dVar.l(list, null);
        DeepLink deeplink = buttonAction != null ? buttonAction.getDeeplink() : null;
        if (deeplink != null) {
            gVar.Pm(new c(this, deeplink));
        } else {
            gVar.Pm(null);
        }
        gVar.t(new d(gVar));
    }
}
