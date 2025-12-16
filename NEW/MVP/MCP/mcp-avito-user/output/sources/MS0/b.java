package Ms0;

import Ns0.C14608a;
import Ns0.d;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.events.SelectSheetEventType;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsToastInternalAction;
import com.avito.android.service_booking_utils.events.ScreenFailedToOpenEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSettingsAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMs0/b;", "LMs0/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14525a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f11041a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f11041a = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ms0.InterfaceC14525a
    public final void a(@k ServiceBookingAdditionalSettingsInternalAction serviceBookingAdditionalSettingsInternalAction) {
        String str;
        boolean z12 = serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.SuccessContent;
        InterfaceC28373a interfaceC28373a = this.f11041a;
        if (z12) {
            interfaceC28373a.c(new C14608a());
            return;
        }
        SelectSheetEventType selectSheetEventType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.ShowError) {
            interfaceC28373a.c(new ScreenFailedToOpenEvent(ScreenFailedToOpenEvent.Screen.f278348e, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
            return;
        }
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader) {
            com.avito.android.analytics.provider.clickstream.a aVar = ((ServiceBookingAdditionalSettingsInternalAction.OnSendDataShowLoader) serviceBookingAdditionalSettingsInternalAction).f274982b;
            if (aVar != null) {
                interfaceC28373a.c(aVar);
                return;
            }
            return;
        }
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.OnShowSelectSheet) {
            String requestId = ((ServiceBookingAdditionalSettingsInternalAction.OnShowSelectSheet) serviceBookingAdditionalSettingsInternalAction).f274983b.getRequestId();
            if (L.f(requestId, "TIME_GAP_SELECTION_REQUEST_ID")) {
                selectSheetEventType = SelectSheetEventType.f274872c;
            } else if (L.f(requestId, "TECH_BREAK_SELECTION_REQUEST_ID")) {
                selectSheetEventType = SelectSheetEventType.f274873d;
            }
            if (selectSheetEventType != null) {
                interfaceC28373a.c(new Ns0.c(selectSheetEventType));
                return;
            }
            return;
        }
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast) {
            com.avito.android.analytics.provider.clickstream.a aVar2 = ((ServiceBookingAdditionalSettingsToastInternalAction.ShowErrorToast) serviceBookingAdditionalSettingsInternalAction).f275008c;
            if (aVar2 != null) {
                interfaceC28373a.c(aVar2);
                return;
            }
            return;
        }
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast) {
            com.avito.android.analytics.provider.clickstream.a aVar3 = ((ServiceBookingAdditionalSettingsToastInternalAction.ShowSuccessToast) serviceBookingAdditionalSettingsInternalAction).f275010c;
            if (aVar3 != null) {
                interfaceC28373a.c(aVar3);
                return;
            }
            return;
        }
        if (serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.OnTimeGapItemSelected) {
            String str2 = ((ServiceBookingAdditionalSettingsInternalAction.OnTimeGapItemSelected) serviceBookingAdditionalSettingsInternalAction).f274985b;
            if (str2 != null) {
                interfaceC28373a.c(new d(SelectSheetEventType.f274872c, str2));
                return;
            }
            return;
        }
        if (!(serviceBookingAdditionalSettingsInternalAction instanceof ServiceBookingAdditionalSettingsInternalAction.OnTechBreakItemSelected) || (str = ((ServiceBookingAdditionalSettingsInternalAction.OnTechBreakItemSelected) serviceBookingAdditionalSettingsInternalAction).f274984b) == null) {
            return;
        }
        interfaceC28373a.c(new d(SelectSheetEventType.f274873d, str));
    }
}
