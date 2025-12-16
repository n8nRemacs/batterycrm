package com.avito.android.hotel_booking.konveyor.offer;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BookingFormOfferPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/offer/d;", "LTV0/d;", "Lcom/avito/android/hotel_booking/konveyor/offer/f;", "Lcom/avito/android/hotel_booking/konveyor/offer/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RI.b, G0> f163720b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super RI.b, G0> lVar) {
        this.f163720b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        c cVar = (c) aVar;
        fVar.z2(cVar.f163718b);
        AttributedText attributedText = cVar.f163719c;
        fVar.F(attributedText);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 13));
    }
}
