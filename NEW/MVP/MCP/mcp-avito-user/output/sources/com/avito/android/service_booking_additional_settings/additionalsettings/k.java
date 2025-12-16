package com.avito.android.service_booking_additional_settings.additionalsettings;

import Os0.InterfaceC14732a;
import com.avito.android.service_booking_additional_settings.additionalsettings.ServiceBookingAdditionalSettingsFragment;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingAdditionalSettingsStateRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementSheetTimeGap;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/AdditionalSettingsElementsContentItem$AdditionalSettingsElementSheetTimeGap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f274962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar) {
        super(1);
        this.f274962l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap additionalSettingsElementSheetTimeGap) {
        AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap additionalSettingsElementSheetTimeGap2 = additionalSettingsElementSheetTimeGap;
        ((ServiceBookingAdditionalSettingsFragment.d) this.f274962l.f274950b).invoke(new InterfaceC14732a.c(new InterfaceC14732a.c.C0815a(additionalSettingsElementSheetTimeGap2.f275048f, additionalSettingsElementSheetTimeGap2.f275044b, additionalSettingsElementSheetTimeGap2.f275047e, true, null, 16, null), "TIME_GAP_SELECTION_REQUEST_ID"));
        return G0.f406611a;
    }
}
