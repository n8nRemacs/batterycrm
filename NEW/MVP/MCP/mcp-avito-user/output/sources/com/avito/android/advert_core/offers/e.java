package com.avito.android.advert_core.offers;

import Y61.l;
import com.avito.android.advert.item.Z0;
import com.avito.android.remote.model.Offers;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OffersItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/e;", "Lcom/avito/android/advert_core/offers/c;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Z0 f83816b;

    @Inject
    public e() {
    }

    @Override // com.avito.android.advert_core.offers.c
    public final void I4(@l Z0 z02) {
        this.f83816b = z02;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        OffersItem offersItem = (OffersItem) aVar;
        Offers offers = offersItem.f83794b;
        gVar.setTitle(offers.getTitle());
        gVar.gD(offersItem.f83795c);
        gVar.AE(offers.getOffersButtonTitle());
        gVar.rO(new d(this, offersItem));
    }

    @Override // com.avito.android.advert_core.offers.c
    public final void c0() {
        this.f83816b = null;
    }
}
