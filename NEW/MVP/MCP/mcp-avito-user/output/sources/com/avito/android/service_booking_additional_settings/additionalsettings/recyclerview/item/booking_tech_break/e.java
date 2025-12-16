package com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break;

import Y61.k;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdditionalSettingsTechBreakPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/e;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/recyclerview/item/booking_tech_break/c;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f275070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f275071c;

    @Inject
    public e() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f275070b = e2VarB;
        this.f275071c = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AdditionalSettingsElementsContentItem additionalSettingsElementsContentItem = (AdditionalSettingsElementsContentItem) aVar;
        ((g) eVar).la(additionalSettingsElementsContentItem, new d(additionalSettingsElementsContentItem, this));
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.c
    @k
    /* renamed from: z4, reason: from getter */
    public final e2 getF275071c() {
        return this.f275071c;
    }
}
