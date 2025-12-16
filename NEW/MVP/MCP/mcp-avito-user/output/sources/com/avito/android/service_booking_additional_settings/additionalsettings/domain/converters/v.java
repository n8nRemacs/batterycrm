package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSettingsTechBreakConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/v;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/u;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements u {
    @Inject
    public v() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.u
    @Y61.k
    public final AdditionalSettingsElementsContentItem a(@Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.b bVar, @Y61.l Boolean bool) {
        String value = bVar.getValue();
        Boolean boolValueOf = Boolean.valueOf(bVar.getHasCloseButton());
        String bottomSheetTitle = bVar.getBottomSheetTitle();
        String bottomSheetDescription = bVar.getBottomSheetDescription();
        List<Rs0.b> listF = bVar.f();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
        for (Rs0.b bVar2 : listF) {
            arrayList.add(new AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption(bVar2.getTitle(), bVar2.getId()));
        }
        b.a badge = bVar.getBadge();
        return new AdditionalSettingsElementsContentItem(AdditionalSettingsElementsContentItem.AdditionalSettingsElementType.f275053d, q.a(bVar.getIconType()), bVar.getTitle(), bVar.getSubtitle(), new AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem(value, boolValueOf, bottomSheetTitle, bottomSheetDescription, arrayList, badge != null ? new AdditionalSettingsElementsContentItem.AdditionalSettingsTechBreakItem.TechBreakBadgeItem(badge.getBadgeStyle(), badge.getText()) : null), bool != null ? bool.booleanValue() : true, "BOTTOM_SHEET_TECH_BREAK");
    }
}
