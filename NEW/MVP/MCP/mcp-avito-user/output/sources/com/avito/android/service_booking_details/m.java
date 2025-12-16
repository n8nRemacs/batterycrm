package com.avito.android.service_booking_details;

import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ServiceBookingItemDetailsUxfLinksFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_details/m;", "Lcom/avito/android/service_booking_details/l;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements l {
    @Inject
    public m() {
    }

    @Override // com.avito.android.service_booking_details.l
    @Y61.k
    public final UxFeedbackStartCampaignLink a(@Y61.k BookingEditFlow bookingEditFlow) {
        Map mapC = P0.c();
        return new UxFeedbackStartCampaignLink(bookingEditFlow.f277174b, true, P0.c(), mapC);
    }
}
