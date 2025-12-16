package St0;

import Tt0.C15405a;
import Tt0.d;
import Tt0.e;
import Tt0.f;
import Tt0.g;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_settings.work_hours.analytics.events.FromPage;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbWorkHoursActionsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSt0/b;", "LSt0/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: St0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15222b implements InterfaceC15221a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f15177a;

    @Inject
    public C15222b(@k InterfaceC28373a interfaceC28373a) {
        this.f15177a = interfaceC28373a;
    }

    @Override // St0.InterfaceC15221a
    public final void a(@k ServiceBookingWorkHoursInternalAction serviceBookingWorkHoursInternalAction) {
        boolean z12 = serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnBackButtonClicked;
        InterfaceC28373a interfaceC28373a = this.f15177a;
        if (z12) {
            interfaceC28373a.c(new C15405a(FromPage.f277921b));
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnTimeRestrictionClicked) {
            interfaceC28373a.c(new f());
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnFromSelectClicked) {
            interfaceC28373a.c(new Tt0.b(((ServiceBookingWorkHoursInternalAction.OnFromSelectClicked) serviceBookingWorkHoursInternalAction).f278085b));
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnToSelectClicked) {
            interfaceC28373a.c(new g(((ServiceBookingWorkHoursInternalAction.OnToSelectClicked) serviceBookingWorkHoursInternalAction).f278091b));
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnSaveDialogShown) {
            interfaceC28373a.c(new com.avito.android.service_booking_utils.events.a(((ServiceBookingWorkHoursInternalAction.OnSaveDialogShown) serviceBookingWorkHoursInternalAction).f278086b));
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.ContentLoadingError) {
            interfaceC28373a.c(new e());
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess) {
            interfaceC28373a.c(new com.avito.android.service_booking_utils.events.a(null, 1, null));
            return;
        }
        if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked) {
            ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (ServiceBookingWorkHoursInternalAction.OnActionButtonSaveDialogClicked) serviceBookingWorkHoursInternalAction;
            interfaceC28373a.c(new WorkHoursSaveClickEvent(onActionButtonSaveDialogClicked.f278076b, onActionButtonSaveDialogClicked.f278077c.f278375b));
        } else if (serviceBookingWorkHoursInternalAction instanceof ServiceBookingWorkHoursInternalAction.OnSchedulePeriodInputClicked) {
            interfaceC28373a.c(new d());
        }
    }
}
