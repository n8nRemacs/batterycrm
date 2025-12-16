package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import androidx.recyclerview.widget.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsHotelOfferItem f76092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f76093m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f76094n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem, q qVar, h hVar) {
        super(0);
        this.f76092l = advertDetailsHotelOfferItem;
        this.f76093m = qVar;
        this.f76094n = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        q qVar = this.f76093m;
        this.f76092l.f76084h = qVar.os();
        ((P) this.f76094n.f76109p.getValue()).b(null);
        qVar.uT();
        qVar.setAdapter(null);
        return G0.f406611a;
    }
}
