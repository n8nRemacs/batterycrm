package ys0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking.analytic_events.SBSpecialistScreenOpenEvent;
import com.avito.android.service_booking.analytic_events.SbCheckServiceEvent;
import com.avito.android.service_booking.analytic_events.SbSpecialistSelectedEvent;
import kotlin.Metadata;

/* compiled from: SbEventsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys0/f;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50295f {
    void a();

    void b(@k String str);

    void c(@k SbSpecialistSelectedEvent.SpecialistType specialistType);

    void d(@k String str, @l String str2);

    void e(@k String str);

    void f(@k SBSpecialistScreenOpenEvent.FromPageType fromPageType);

    void g(@k String str);

    void h(@l String str, @k String str2);

    void i(@k String str, @l String str2);

    void j(@k SbCheckServiceEvent.ActionType actionType, @k String str);
}
