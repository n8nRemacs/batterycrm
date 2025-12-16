package com.avito.android.service_booking_utils.ux_feedback;

import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ServiceBookingSettingsSuccessUxfLinkFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/ux_feedback/i;", "Lcom/avito/android/service_booking_utils/ux_feedback/h;", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.service_booking_utils.ux_feedback.h
    public final UxFeedbackStartCampaignLink a() {
        return new UxFeedbackStartCampaignLink("srv_booking_success_save_settings", false, P0.c(), null);
    }
}
