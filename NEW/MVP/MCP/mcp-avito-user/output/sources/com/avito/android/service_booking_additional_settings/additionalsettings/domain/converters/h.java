package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSettingsBottomsheetTimeGapConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/h;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/g;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.g
    @Y61.k
    public final AdditionalSettingsElementsContentItem a(@Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.c cVar, @Y61.l Boolean bool) {
        String value = cVar.getValue();
        Boolean boolValueOf = Boolean.valueOf(cVar.getHasCloseButton());
        String resetTitle = cVar.getResetTitle();
        String bottomSheetTitle = cVar.getBottomSheetTitle();
        List<Rs0.b> listD = cVar.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        for (Rs0.b bVar : listD) {
            arrayList.add(new AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption(bVar.getTitle(), bVar.getId()));
        }
        return new AdditionalSettingsElementsContentItem(AdditionalSettingsElementsContentItem.AdditionalSettingsElementType.f275052c, q.a(cVar.getIconType()), cVar.getTitle(), cVar.getSubtitle(), new AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap(value, boolValueOf, resetTitle, bottomSheetTitle, arrayList), bool != null ? bool.booleanValue() : true, "BOTTOM_SHEET_TIME_GAP");
    }
}
