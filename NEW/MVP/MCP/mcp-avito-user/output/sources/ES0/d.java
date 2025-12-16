package Es0;

import As0.C13076a;
import As0.e;
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

/* compiled from: SbEditFromChatEventsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEs0/d;", "Lys0/f;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements InterfaceC50295f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f4368a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4369b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4370c;

    public d(@k InterfaceC28373a interfaceC28373a, @l @com.avito.android.service_booking.mvi.di.b String str, @h @l String str2) {
        this.f4368a = str;
        this.f4369b = str2;
        this.f4370c = interfaceC28373a;
    }

    @Override // ys0.InterfaceC50295f
    public final void b(@k String str) {
        this.f4370c.c(new C13076a(str, this.f4368a, this.f4369b));
    }

    @Override // ys0.InterfaceC50295f
    public final void d(@k String str, @l String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f4370c.c(new As0.c(str, this.f4368a, this.f4369b, str2));
    }

    @Override // ys0.InterfaceC50295f
    public final void e(@k String str) {
        this.f4370c.c(new As0.b(str, this.f4368a, this.f4369b));
    }

    @Override // ys0.InterfaceC50295f
    public final void g(@k String str) {
        this.f4370c.c(new e(str, this.f4368a, this.f4369b));
    }

    @Override // ys0.InterfaceC50295f
    public final void h(@l String str, @k String str2) {
        this.f4370c.c(new C13076a(str2, this.f4368a, this.f4369b));
    }

    @Override // ys0.InterfaceC50295f
    public final void i(@k String str, @l String str2) {
        this.f4370c.c(new As0.d(this.f4368a, this.f4369b, str));
    }

    @Override // ys0.InterfaceC50295f
    public final void j(@k SbCheckServiceEvent.ActionType actionType, @k String str) {
        this.f4370c.c(new C13076a(str, this.f4368a, this.f4369b));
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
