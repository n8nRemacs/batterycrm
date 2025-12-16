package com.avito.android.advert.item.service_booking;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.S;
import com.avito.android.advert.item.service_booking.ServiceBookingItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_booking/f;", "Lcom/avito/android/advert/item/service_booking/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f79833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f79834c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T6.a f79835d;

    @Inject
    public f(@Y61.k S s5, @Y61.k m mVar, @Y61.k T6.a aVar) {
        this.f79833b = s5;
        this.f79834c = mVar;
        this.f79835d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) aVar;
        hVar.IB(serviceBookingItem);
        hVar.c(new d(this, serviceBookingItem));
        ServiceBookingItem.TooltipInfo tooltipInfo = serviceBookingItem.f79814e;
        if (tooltipInfo != null) {
            String str = tooltipInfo.f79824e;
            hVar.IF(tooltipInfo, !(str == null || str.length() == 0), new e(this, serviceBookingItem));
        }
    }
}
