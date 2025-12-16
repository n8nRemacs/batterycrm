package Es0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking.analytic_events.SBSpecialistScreenOpenEvent;
import com.avito.android.service_booking.analytic_events.SbCheckServiceEvent;
import com.avito.android.service_booking.analytic_events.SbSpecialistSelectedEvent;
import com.avito.android.service_booking.mvi.di.g;
import com.avito.android.service_booking.mvi.di.h;
import kotlin.Metadata;
import ys0.InterfaceC50295f;
import zs0.C50623a;
import zs0.C50624b;
import zs0.t;
import zs0.u;

/* compiled from: SbCreationEventsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEs0/b;", "Lys0/f;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC50295f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f4361a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4362b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f4363c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4364d;

    public b(@l @com.avito.android.service_booking.mvi.di.a String str, @h @l String str2, @g @l String str3, @k InterfaceC28373a interfaceC28373a) {
        this.f4361a = str;
        this.f4362b = str2;
        this.f4363c = str3;
        this.f4364d = interfaceC28373a;
    }

    @Override // ys0.InterfaceC50295f
    public final void a() {
        String str = this.f4361a;
        if (str != null) {
            this.f4364d.c(new t(str, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void b(@k String str) {
        String str2 = this.f4361a;
        if (str2 != null) {
            this.f4364d.c(new C50624b(str2, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void c(@k SbSpecialistSelectedEvent.SpecialistType specialistType) {
        String str = this.f4361a;
        if (str != null) {
            this.f4364d.c(new SbSpecialistSelectedEvent(specialistType, str, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void d(@k String str, @l String str2) {
        String str3 = this.f4361a;
        if (str3 != null) {
            this.f4364d.c(new zs0.k(str, str3, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void e(@k String str) {
        String str2 = this.f4361a;
        if (str2 != null) {
            this.f4364d.c(new C50623a(str, str2, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void f(@k SBSpecialistScreenOpenEvent.FromPageType fromPageType) {
        String str = this.f4361a;
        if (str != null) {
            this.f4364d.c(new SBSpecialistScreenOpenEvent(str, fromPageType));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void g(@k String str) {
        String str2 = this.f4361a;
        if (str2 != null) {
            this.f4364d.c(new u(str, str2, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void i(@k String str, @l String str2) {
        String str3 = this.f4361a;
        if (str3 != null) {
            this.f4364d.c(new zs0.l(str2, str, str3, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void j(@k SbCheckServiceEvent.ActionType actionType, @k String str) {
        String str2 = this.f4361a;
        if (str2 != null) {
            this.f4364d.c(new SbCheckServiceEvent(actionType, str2, this.f4362b, this.f4363c));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void h(@l String str, @k String str2) {
    }
}
