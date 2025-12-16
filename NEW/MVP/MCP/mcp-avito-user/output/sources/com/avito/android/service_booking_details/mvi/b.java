package com.avito.android.service_booking_details.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import com.avito.android.service_booking_utils.events.FromPageType;
import hu0.C41167a;
import hu0.C41168b;
import hu0.C41169c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import st0.C48412a;
import st0.C48414c;

/* compiled from: ServiceBookingDetailsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/b;", "Lcom/avito/android/service_booking_details/mvi/a;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f277359a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f277360b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @com.avito.android.service_booking_details.di.a @Y61.k String str) {
        this.f277359a = interfaceC28373a;
        this.f277360b = str;
    }

    @Override // com.avito.android.service_booking_details.mvi.a
    public final void a(@Y61.k ServiceBookingItemDetailsInternalAction serviceBookingItemDetailsInternalAction) {
        boolean z12 = serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.Content;
        InterfaceC28373a interfaceC28373a = this.f277359a;
        if (z12) {
            interfaceC28373a.c(new C48414c("card_seller"));
            return;
        }
        if (serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.Error) {
            interfaceC28373a.c(new e());
            return;
        }
        if (serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.OnSuccessActionResult) {
            String str = ((ServiceBookingItemDetailsInternalAction.OnSuccessActionResult) serviceBookingItemDetailsInternalAction).f277374b;
            if (str != null) {
                interfaceC28373a.c(new C48412a("card_seller", str));
                G0 g02 = G0.f406611a;
                return;
            }
            return;
        }
        if (serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.OnFailureActionResult) {
            String str2 = ((ServiceBookingItemDetailsInternalAction.OnFailureActionResult) serviceBookingItemDetailsInternalAction).f277370b;
            if (str2 != null) {
                interfaceC28373a.c(new C48412a("card_seller", str2));
                G0 g03 = G0.f406611a;
                return;
            }
            return;
        }
        if (serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.OnShowPhone) {
            interfaceC28373a.c(new C41168b(((ServiceBookingItemDetailsInternalAction.OnShowPhone) serviceBookingItemDetailsInternalAction).f277372b, FromPageType.f278333d));
            return;
        }
        boolean z13 = serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.CopyPhoneToClipboard;
        String str3 = this.f277360b;
        if (z13) {
            interfaceC28373a.c(new C41167a(str3, FromPageType.f278333d));
        } else if (serviceBookingItemDetailsInternalAction instanceof ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast) {
            interfaceC28373a.c(new C41169c(str3, FromPageType.f278333d));
        }
    }
}
