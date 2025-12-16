package com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer;

import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.advert.item.hotel.hotel_offer.a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsInnerOfferPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsInnerOfferItem f76059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f76060m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AdvertDetailsInnerOfferItem advertDetailsInnerOfferItem, j jVar) {
        super(0);
        this.f76059l = advertDetailsInnerOfferItem;
        this.f76060m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        AdvertDetailsHotelOffer.Installment installment = this.f76059l.f76036f;
        if (installment != null && (deepLink = installment.f75869b) != null) {
            this.f76060m.f76061b.a(new a.e(deepLink));
        }
        return G0.f406611a;
    }
}
