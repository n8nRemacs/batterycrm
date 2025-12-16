package com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ServiceBookingAdditionalSettingsLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/e;", "LKu/a;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<ServiceBookingAdditionalSettingsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ServiceBookingAdditionalSettingsLink();
    }
}
