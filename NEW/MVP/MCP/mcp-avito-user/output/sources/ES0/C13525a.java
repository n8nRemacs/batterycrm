package Es0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking.analytic_events.SBSpecialistScreenOpenEvent;
import com.avito.android.service_booking.analytic_events.SbCheckServiceEvent;
import com.avito.android.service_booking.analytic_events.SbSpecialistSelectedEvent;
import kotlin.Metadata;
import ys0.InterfaceC50295f;
import zs0.n;
import zs0.o;
import zs0.p;
import zs0.q;
import zs0.r;
import zs0.s;

/* compiled from: SbCreationBySellerEventsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEs0/a;", "Lys0/f;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Es0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13525a implements InterfaceC50295f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4360a;

    public C13525a(@k InterfaceC28373a interfaceC28373a) {
        this.f4360a = interfaceC28373a;
    }

    @Override // ys0.InterfaceC50295f
    public final void b(@k String str) {
        this.f4360a.c(new o());
    }

    @Override // ys0.InterfaceC50295f
    public final void d(@k String str, @l String str2) {
        this.f4360a.c(new q(str));
    }

    @Override // ys0.InterfaceC50295f
    public final void g(@k String str) {
        this.f4360a.c(new s(str));
    }

    @Override // ys0.InterfaceC50295f
    public final void h(@l String str, @k String str2) {
        this.f4360a.c(new p(str));
    }

    @Override // ys0.InterfaceC50295f
    public final void i(@k String str, @l String str2) {
        this.f4360a.c(new r());
    }

    @Override // ys0.InterfaceC50295f
    public final void j(@k SbCheckServiceEvent.ActionType actionType, @k String str) {
        this.f4360a.c(new n());
    }

    @Override // ys0.InterfaceC50295f
    public final void a() {
    }

    @Override // ys0.InterfaceC50295f
    public final void c(@k SbSpecialistSelectedEvent.SpecialistType specialistType) {
    }

    @Override // ys0.InterfaceC50295f
    public final void e(@k String str) {
    }

    @Override // ys0.InterfaceC50295f
    public final void f(@k SBSpecialistScreenOpenEvent.FromPageType fromPageType) {
    }
}
