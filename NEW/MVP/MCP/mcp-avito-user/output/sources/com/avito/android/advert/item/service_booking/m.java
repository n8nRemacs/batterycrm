package com.avito.android.advert.item.service_booking;

import com.avito.android.advert.item.W0;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ServiceBookingPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_booking/m;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface m {

    /* compiled from: ServiceBookingPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_booking/m$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void i(@Y61.k DeepLink deepLink, @Y61.k SbSignUpEvent.ServiceBookingSource serviceBookingSource);
    }

    void N(@Y61.l W0 w02);

    void a(@Y61.k DeepLink deepLink);

    void e0();

    void i();
}
