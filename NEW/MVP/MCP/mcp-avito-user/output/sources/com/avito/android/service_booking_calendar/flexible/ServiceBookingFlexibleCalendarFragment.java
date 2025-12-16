package com.avito.android.service_booking_calendar.flexible;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.service_booking_calendar.flexible.content.b;
import com.avito.android.service_booking_calendar.flexible.data.mvi.m;
import com.avito.android.service_booking_calendar.flexible.header.a;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import com.avito.android.service_booking_calendar.flexible.perf_screen.ServicesBookingFlexibleCalendar;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.ui.fragments.BaseFragment;
import gt0.InterfaceC40733a;
import gt0.InterfaceC40735c;
import ht0.InterfaceC40984a;
import ht0.InterfaceC40985b;
import java.util.List;
import javax.inject.Inject;
import jt0.InterfaceC42426b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;

/* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/ServiceBookingFlexibleCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/service_booking_calendar/flexible/di/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingFlexibleCalendarFragment extends BaseFragment implements K<com.avito.android.service_booking_calendar.flexible.di.c>, InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f275609x0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_calendar.flexible.a f275610n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public a.e f275611o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public b.a f275612p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f275613q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public m f275614r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_calendar.flexible.content.h f275615s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f275616t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.avito.android.service_booking_calendar.flexible.header.a f275617u0;

    /* renamed from: v0, reason: collision with root package name */
    public com.avito.android.service_booking_calendar.flexible.content.b f275618v0;

    /* renamed from: w0, reason: collision with root package name */
    public com.avito.android.service_booking_calendar.flexible.di.c f275619w0;

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/ServiceBookingFlexibleCalendarFragment$a;", "", "<init>", "()V", "", "KEY_DAY_FOCUS", "Ljava/lang/String;", "RESULT_KEY_SETTINGS_STATUS", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<com.avito.android.service_booking_calendar.flexible.d, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.flexible.d dVar) {
            ((com.avito.android.service_booking_calendar.flexible.a) this.receiver).accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<com.avito.android.service_booking_calendar.flexible.d, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.flexible.d dVar) {
            ((com.avito.android.service_booking_calendar.flexible.a) this.receiver).accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<CalendarHeaderState, List<? extends InterfaceC40733a>> {
        @Override // Y41.l
        public final List<? extends InterfaceC40733a> invoke(CalendarHeaderState calendarHeaderState) {
            return ((com.avito.android.service_booking_calendar.flexible.content.h) this.receiver).a(calendarHeaderState);
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<com.avito.android.service_booking_calendar.flexible.d, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.flexible.d dVar) {
            ((com.avito.android.service_booking_calendar.flexible.a) this.receiver).accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements l<Object, G0> {
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment = (ServiceBookingFlexibleCalendarFragment) this.receiver;
            a aVar = ServiceBookingFlexibleCalendarFragment.f275609x0;
            serviceBookingFlexibleCalendarFragment.getClass();
            if (obj instanceof InterfaceC42426b.a ? true : obj instanceof InterfaceC40735c.a) {
                com.avito.android.service_booking_calendar.flexible.a aVar2 = serviceBookingFlexibleCalendarFragment.f275610n0;
                (aVar2 != null ? aVar2 : null).accept(InterfaceC40984a.C11282a.f397442a);
            } else if (obj instanceof InterfaceC42426b.C11588b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = serviceBookingFlexibleCalendarFragment.f275616t0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((InterfaceC42426b.C11588b) obj).f405886a, null, null, 6);
            } else if (obj instanceof InterfaceC40735c.C11234c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = serviceBookingFlexibleCalendarFragment.f275616t0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, ((InterfaceC40735c.C11234c) obj).f396918a, null, null, 6);
            } else {
                boolean z12 = obj instanceof InterfaceC40735c.d;
                if (z12 ? true : obj instanceof InterfaceC40735c.b) {
                    com.avito.android.service_booking_calendar.flexible.content.b bVar = serviceBookingFlexibleCalendarFragment.f275618v0;
                    com.avito.android.service_booking_calendar.flexible.content.b bVar2 = bVar != null ? bVar : null;
                    bVar2.getClass();
                    if (z12) {
                        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, bVar2.f275638c.f275648e, com.avito.android.printable_text.b.f(((InterfaceC40735c.d) obj).f396919a), null, null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, null, false, false, null, null, 4014);
                    } else if (obj instanceof InterfaceC40735c.b) {
                        InterfaceC40735c.b bVar3 = (InterfaceC40735c.b) obj;
                        bVar2.a(bVar3.f396916a, bVar3.f396917b, true);
                    }
                } else if (obj instanceof InterfaceC40985b.a) {
                    BookingSettingsStatus bookingSettingsStatus = BookingSettingsStatus.f278277c;
                    BookingSettingsStatus bookingSettingsStatus2 = ((InterfaceC40985b.a) obj).f397446a;
                    if (bookingSettingsStatus2 == bookingSettingsStatus) {
                        serviceBookingFlexibleCalendarFragment.requireActivity().setResult(-1);
                    } else {
                        ActivityC22955m activityC22955mRequireActivity = serviceBookingFlexibleCalendarFragment.requireActivity();
                        ServiceBookingFlexibleCalendarFragment.f275609x0.getClass();
                        Intent intent = new Intent();
                        intent.putExtra("result_key.settings_status", bookingSettingsStatus2);
                        activityC22955mRequireActivity.setResult(0, intent);
                    }
                    serviceBookingFlexibleCalendarFragment.requireActivity().onBackPressed();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements l<com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar) {
            com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a aVar2 = aVar;
            ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment = (ServiceBookingFlexibleCalendarFragment) this.receiver;
            m mVar = serviceBookingFlexibleCalendarFragment.f275614r0;
            if (mVar == null) {
                mVar = null;
            }
            for (com.avito.android.service_booking_calendar.flexible.d dVar : mVar.a(aVar2)) {
                com.avito.android.service_booking_calendar.flexible.a aVar3 = serviceBookingFlexibleCalendarFragment.f275610n0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.accept(dVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements l<CalendarHeaderState, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CalendarHeaderState calendarHeaderState) {
            CalendarHeaderState calendarHeaderState2 = calendarHeaderState;
            ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment = ServiceBookingFlexibleCalendarFragment.this;
            ScreenPerformanceTracker screenPerformanceTracker = serviceBookingFlexibleCalendarFragment.f275613q0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(calendarHeaderState2, screenPerformanceTracker, new com.avito.android.service_booking_calendar.flexible.i(serviceBookingFlexibleCalendarFragment));
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgt0/d;", "it", "Lkotlin/G0;", "invoke", "(Lgt0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements l<gt0.d, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(gt0.d dVar) {
            gt0.d dVar2 = dVar;
            com.avito.android.service_booking_calendar.flexible.content.b bVar = ServiceBookingFlexibleCalendarFragment.this.f275618v0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(dVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends H implements l<com.avito.android.service_booking_calendar.flexible.d, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.flexible.d dVar) {
            ((com.avito.android.service_booking_calendar.flexible.a) this.receiver).accept(dVar);
            return G0.f406611a;
        }
    }

    public ServiceBookingFlexibleCalendarFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        this.f275619w0 = com.avito.android.service_booking_calendar.flexible.di.a.a().a(new C28478k(ServicesBookingFlexibleCalendar.f276103d, s.c(this), null, 4, null), (com.avito.android.service_booking_calendar.flexible.di.d) C29972i.a(C29972i.b(this), com.avito.android.service_booking_calendar.flexible.di.d.class), cv.c.b(this), this, getChildFragmentManager(), arguments != null ? arguments.getString("key.day_focus") : null);
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f275613q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f275613q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.fragment_service_booking_calendar_flexible, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f275613q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        a.e eVar = this.f275611o0;
        if (eVar == null) {
            eVar = null;
        }
        com.avito.android.service_booking_calendar.flexible.a aVar = this.f275610n0;
        this.f275617u0 = eVar.a(view, new b(1, aVar != null ? aVar : null, com.avito.android.service_booking_calendar.flexible.a.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        b.a aVar2 = this.f275612p0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.android.service_booking_calendar.flexible.a aVar3 = this.f275610n0;
        this.f275618v0 = aVar2.a(view, new c(1, aVar3 != null ? aVar3 : null, com.avito.android.service_booking_calendar.flexible.a.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        com.avito.android.service_booking_calendar.flexible.a aVar4 = this.f275610n0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        n2<CalendarHeaderState> n2VarY4 = aVar4.y4();
        com.avito.android.service_booking_calendar.flexible.content.h hVar = this.f275615s0;
        d dVar = new d(1, hVar != null ? hVar : null, com.avito.android.service_booking_calendar.flexible.content.h.class, "transform", "transform(Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;)Ljava/util/List;", 0);
        com.avito.android.service_booking_calendar.flexible.a aVar5 = this.f275610n0;
        e eVar2 = new e(1, aVar5 != null ? aVar5 : null, com.avito.android.service_booking_calendar.flexible.a.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner), null, null, new com.avito.android.service_booking_calendar.flexible.f(viewLifecycleOwner, n2VarY4, dVar, eVar2, null), 3);
        com.avito.android.service_booking_calendar.flexible.a aVar6 = this.f275610n0;
        com.avito.android.arch.mvi.android.f.a(aVar6 != null ? aVar6 : null, getViewLifecycleOwner(), Lifecycle.State.f46682e, new f(1, this, ServiceBookingFlexibleCalendarFragment.class, "handleEvent", "handleEvent(Ljava/lang/Object;)V", 0), new g(1, this, ServiceBookingFlexibleCalendarFragment.class, "connectLoadFeature", "connectLoadFeature(Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/CalendarDataState;)V", 0));
        com.avito.android.service_booking_calendar.flexible.a aVar7 = this.f275610n0;
        if (aVar7 == null) {
            aVar7 = null;
        }
        n2<CalendarHeaderState> n2VarY42 = aVar7.y4();
        h hVar2 = new h();
        InterfaceC22983P viewLifecycleOwner2 = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner2), null, null, new com.avito.android.service_booking_calendar.flexible.e(viewLifecycleOwner2, n2VarY42, hVar2, null), 3);
        com.avito.android.service_booking_calendar.flexible.a aVar8 = this.f275610n0;
        if (aVar8 == null) {
            aVar8 = null;
        }
        n2<gt0.d> n2VarOd = aVar8.od();
        i iVar = new i();
        InterfaceC22983P viewLifecycleOwner3 = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner3), null, null, new com.avito.android.service_booking_calendar.flexible.e(viewLifecycleOwner3, n2VarOd, iVar, null), 3);
        com.avito.android.service_booking_calendar.flexible.a aVar9 = this.f275610n0;
        j jVar = new j(1, aVar9 != null ? aVar9 : null, com.avito.android.service_booking_calendar.flexible.a.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        com.avito.android.deeplink_handler.handler.composite.a aVar10 = this.f275616t0;
        if (aVar10 == null) {
            aVar10 = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.service_booking_calendar.flexible.g(jVar, null), y.a(aVar10.d9())), C22984Q.a(getViewLifecycleOwner()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.service_booking_calendar.flexible.di.c cVar = this.f275619w0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.Rf(this);
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.service_booking_calendar.flexible.di.c cVar = this.f275619w0;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }
}
