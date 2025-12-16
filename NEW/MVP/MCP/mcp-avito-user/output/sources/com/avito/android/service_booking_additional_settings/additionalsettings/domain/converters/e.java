package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSettingsBookingToggleConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/e;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/d;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.d
    @Y61.k
    public final AdditionalSettingsElementsContentItem a(@Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.a aVar, @Y61.l Boolean bool) {
        return new AdditionalSettingsElementsContentItem(AdditionalSettingsElementsContentItem.AdditionalSettingsElementType.f275051b, q.a(aVar.getIconType()), aVar.getTitle(), aVar.getSubtitle(), new AdditionalSettingsElementsContentItem.AdditionalSettingsElementBookingToggle(Boolean.valueOf(aVar.getValue())), bool != null ? bool.booleanValue() : true, "BOOKING_TOGGLE");
    }
}
