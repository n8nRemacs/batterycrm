package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import Ms0.InterfaceC14525a;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsToastInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingAdditionalSettingsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<ServiceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14525a f275023b;

    @Inject
    public l(@Y61.k InterfaceC14525a interfaceC14525a) {
        this.f275023b = interfaceC14525a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ServiceBookingAdditionalSettingsState a(ServiceBookingAdditionalSettingsInternalAction serviceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState) {
        ServiceBookingAdditionalSettingsInternalAction serviceBookingAdditionalSettingsInternalAction2 = serviceBookingAdditionalSettingsInternalAction;
        ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsStateA = serviceBookingAdditionalSettingsState;
        if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.ShowError) {
            serviceBookingAdditionalSettingsStateA = ServiceBookingAdditionalSettingsState.a(serviceBookingAdditionalSettingsStateA, null, z.l(((ServiceBookingAdditionalSettingsInternalAction.ShowError) serviceBookingAdditionalSettingsInternalAction2).f274986b), null, 26);
        } else if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.SuccessContent) {
            serviceBookingAdditionalSettingsStateA = ServiceBookingAdditionalSettingsState.a(serviceBookingAdditionalSettingsStateA, ((ServiceBookingAdditionalSettingsInternalAction.SuccessContent) serviceBookingAdditionalSettingsInternalAction2).f274988b, null, null, 24);
        } else {
            boolean z12 = serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader;
            ServiceBookingAdditionalSettingsState.ElementsShow elementsShow = serviceBookingAdditionalSettingsStateA.f274994e;
            if (z12) {
                serviceBookingAdditionalSettingsStateA = ServiceBookingAdditionalSettingsState.a(serviceBookingAdditionalSettingsStateA, null, null, ServiceBookingAdditionalSettingsState.ElementsShow.a(elementsShow, true), 23);
            } else if ((serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast) || (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast)) {
                serviceBookingAdditionalSettingsStateA = ServiceBookingAdditionalSettingsState.a(serviceBookingAdditionalSettingsStateA, null, null, ServiceBookingAdditionalSettingsState.ElementsShow.a(elementsShow, false), 23);
            } else if (serviceBookingAdditionalSettingsInternalAction2 instanceof ServiceBookingAdditionalSettingsInternalAction.Loading) {
                ServiceBookingAdditionalSettingsState.f274989g.getClass();
                serviceBookingAdditionalSettingsStateA = ServiceBookingAdditionalSettingsState.f274990h;
            }
        }
        this.f275023b.a(serviceBookingAdditionalSettingsInternalAction2);
        return serviceBookingAdditionalSettingsStateA;
    }
}
