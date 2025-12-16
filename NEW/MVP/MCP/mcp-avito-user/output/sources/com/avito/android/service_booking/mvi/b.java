package com.avito.android.service_booking.mvi;

import Y61.k;
import android.content.Context;
import com.avito.android.service_booking.analytic_events.SbCheckServiceEvent;
import com.avito.android.service_booking.analytic_events.SbSpecialistSelectedEvent;
import com.avito.android.service_booking.mvi.di.v;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qt0.C47440d;
import ys0.InterfaceC50295f;

/* compiled from: SbActionsTrackerWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/b;", "Lcom/avito/android/service_booking/mvi/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f274310a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f274311b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC50295f f274312c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.mvi.domain.a f274313d;

    @Inject
    public b(@v @k String str, @k Context context, @k InterfaceC50295f interfaceC50295f, @k com.avito.android.service_booking.mvi.domain.a aVar) {
        this.f274310a = str;
        this.f274311b = context;
        this.f274312c = interfaceC50295f;
        this.f274313d = aVar;
    }

    @Override // com.avito.android.service_booking.mvi.a
    public final void a(@k ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction) {
        boolean z12 = serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.ServiceBookingErrorAction;
        String str = this.f274310a;
        InterfaceC50295f interfaceC50295f = this.f274312c;
        if (z12) {
            interfaceC50295f.i(str, ((ServiceBookingMviStepInternalAction.ServiceBookingErrorAction) serviceBookingMviStepInternalAction).getF274694b().getMessage());
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsError) {
            Throwable th2 = ((C47440d.c.b) ((ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsError) serviceBookingMviStepInternalAction).f274709c.f406620c).f429422a;
            interfaceC50295f.i(str, th2 != null ? th2.getMessage() : null);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.ShowToastError) {
            ServiceBookingMviStepInternalAction.ShowToastError showToastError = (ServiceBookingMviStepInternalAction.ShowToastError) serviceBookingMviStepInternalAction;
            String str2 = showToastError.f274701d;
            if (str2 != null) {
                str = str2;
            }
            interfaceC50295f.i(str, showToastError.f274699b.k0(this.f274311b));
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.ShowError) {
            interfaceC50295f.i(str, ((ServiceBookingMviStepInternalAction.ShowError) serviceBookingMviStepInternalAction).f274698b.getMessage());
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.Finish) {
            interfaceC50295f.e(str);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnServiceClicked) {
            interfaceC50295f.j(((ServiceBookingMviStepInternalAction.OnServiceClicked) serviceBookingMviStepInternalAction).f274681b.f429409e ? SbCheckServiceEvent.ActionType.f274156d : SbCheckServiceEvent.ActionType.f274155c, str);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnAnySpecialistClicked) {
            interfaceC50295f.c(SbSpecialistSelectedEvent.SpecialistType.f274161c);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnSpecialistClicked) {
            interfaceC50295f.c(SbSpecialistSelectedEvent.SpecialistType.f274162d);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OpenNextStep) {
            String str3 = ((ServiceBookingMviStepInternalAction.OpenNextStep) serviceBookingMviStepInternalAction).f274691d;
            if (str3 != null) {
                interfaceC50295f.d(str, str3);
                return;
            }
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnInputFocused) {
            interfaceC50295f.h(((ServiceBookingMviStepInternalAction.OnInputFocused) serviceBookingMviStepInternalAction).f274680b.f276228c, str);
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnServiceInfoClicked) {
            interfaceC50295f.a();
            return;
        }
        if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnDaySelected ? true : serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.OnSlotSelected) {
            interfaceC50295f.b(str);
        } else if (serviceBookingMviStepInternalAction instanceof ServiceBookingMviStepInternalAction.SuccessContent) {
            if (L.f(str, "specialists_list")) {
                interfaceC50295f.f(this.f274313d.a(((ServiceBookingMviStepInternalAction.SuccessContent) serviceBookingMviStepInternalAction).f274703b.f274726h));
            } else {
                interfaceC50295f.g(str);
            }
        }
    }
}
