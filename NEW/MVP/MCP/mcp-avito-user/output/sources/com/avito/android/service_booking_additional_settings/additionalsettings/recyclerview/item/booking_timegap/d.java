package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap;

import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingTimeGapPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdditionalSettingsElementsContentItem f275084l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f275085m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem, e eVar) {
        super(0);
        this.f275084l = additionalSettingsElementsContentItem;
        this.f275085m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdditionalSettingsElementsContentItem.AdditionalSettingsElementsSpecific additionalSettingsElementsSpecific = this.f275084l.f275040f;
        AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap additionalSettingsElementSheetTimeGap = additionalSettingsElementsSpecific instanceof AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap ? (AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap) additionalSettingsElementsSpecific : null;
        if (additionalSettingsElementSheetTimeGap != null) {
            this.f275085m.f275086b.K5(additionalSettingsElementSheetTimeGap);
        }
        return G0.f406611a;
    }
}
