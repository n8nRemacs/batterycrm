package Es0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking.analytic_events.SBSpecialistScreenOpenEvent;
import com.avito.android.service_booking.analytic_events.SbCheckServiceEvent;
import com.avito.android.service_booking.analytic_events.SbSpecialistSelectedEvent;
import com.avito.android.service_booking.mvi.di.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ys0.InterfaceC50295f;
import zs0.C50625c;
import zs0.e;
import zs0.f;
import zs0.g;
import zs0.i;

/* compiled from: SbEditEventsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEs0/c;", "Lys0/f;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC50295f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f4365a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4366b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4367c;

    public c(@k InterfaceC28373a interfaceC28373a, @l @com.avito.android.service_booking.mvi.di.b String str, @h @l String str2) {
        this.f4365a = str;
        this.f4366b = str2;
        this.f4367c = interfaceC28373a;
    }

    @Override // ys0.InterfaceC50295f
    public final void b(@k String str) {
        String str2 = this.f4365a;
        if (str2 != null) {
            this.f4367c.c(new e(str2, this.f4366b, str));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void d(@k String str, @l String str2) {
        String str3 = this.f4365a;
        if (str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            this.f4367c.c(new g(str, str3, this.f4366b, str2));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void e(@k String str) {
        String str2 = this.f4365a;
        if (str2 != null) {
            this.f4367c.c(new zs0.d(str, str2, this.f4366b));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void g(@k String str) {
        String str2 = this.f4365a;
        if (str2 != null) {
            this.f4367c.c(new i(str, str2, this.f4366b));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void h(@l String str, @k String str2) {
        String str3 = this.f4365a;
        if (str3 != null) {
            this.f4367c.c(new f(str3, this.f4366b, str2));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void i(@k String str, @l String str2) {
        String str3 = this.f4365a;
        if (str3 != null) {
            this.f4367c.c(new zs0.h(str3, this.f4366b, str));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void j(@k SbCheckServiceEvent.ActionType actionType, @k String str) {
        String str2 = this.f4365a;
        if (str2 != null) {
            this.f4367c.c(new C50625c(str, str2, this.f4366b));
        }
    }

    @Override // ys0.InterfaceC50295f
    public final void a() {
    }

    @Override // ys0.InterfaceC50295f
    public final void c(@k SbSpecialistSelectedEvent.SpecialistType specialistType) {
    }

    @Override // ys0.InterfaceC50295f
    public final void f(@k SBSpecialistScreenOpenEvent.FromPageType fromPageType) {
    }
}
