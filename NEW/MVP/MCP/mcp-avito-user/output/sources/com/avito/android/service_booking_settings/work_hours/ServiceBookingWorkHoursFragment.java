package com.avito.android.service_booking_settings.work_hours;

import Cd.C13243a;
import Ut0.C15567b;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_settings.perf_screen.ServiceBookingWorkHoursScreen;
import com.avito.android.service_booking_settings.work_hours.h;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.Option;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.V2;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingWorkHoursFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/ServiceBookingWorkHoursFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/h$c;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/h$d;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/h$b;", "<init>", "()V", "a", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingWorkHoursFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p, h.c, h.d, h.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f277896A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_settings.work_hours.f f277897n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f277898o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f277899p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f277900q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f277901r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f277902s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f277903t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a f277904u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.service_booking_settings.work_hours.item.schedule_period.c f277905v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public h.a f277906w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.service_booking_settings.work_hours.h f277907x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f277908y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final c f277909z0;

    /* compiled from: ServiceBookingWorkHoursFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/ServiceBookingWorkHoursFragment$a;", "", "<init>", "()V", "", "SERVICE_BOOKING_WORK_HOURS_ARGUMENT", "Ljava/lang/String;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ServiceBookingWorkHoursFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursFragment$a$a, reason: collision with other inner class name */
        public static final class C8253a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f277910l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f277911m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8253a(boolean z12, String str) {
                super(1);
                this.f277910l = z12;
                this.f277911m = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("work_hours_argument", new ServiceBookingWorkHoursArgument(this.f277910l, this.f277911m));
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ServiceBookingWorkHoursFragment a(@Y61.l String str, boolean z12) {
            ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment = new ServiceBookingWorkHoursFragment();
            C35966w1.a(serviceBookingWorkHoursFragment, 1, new C8253a(z12, str));
            return serviceBookingWorkHoursFragment;
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingWorkHoursFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/service_booking_settings/work_hours/ServiceBookingWorkHoursArgument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ServiceBookingWorkHoursArgument> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ServiceBookingWorkHoursArgument invoke() {
            ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument;
            Bundle arguments = ServiceBookingWorkHoursFragment.this.getArguments();
            if (arguments != null) {
                serviceBookingWorkHoursArgument = (ServiceBookingWorkHoursArgument) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("work_hours_argument", ServiceBookingWorkHoursArgument.class) : arguments.getParcelable("work_hours_argument"));
            } else {
                serviceBookingWorkHoursArgument = null;
            }
            if (serviceBookingWorkHoursArgument != null) {
                return serviceBookingWorkHoursArgument;
            }
            throw new IllegalArgumentException("Argument parameter is not provided");
        }
    }

    /* compiled from: ServiceBookingWorkHoursFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_settings/work_hours/ServiceBookingWorkHoursFragment$c", "Landroidx/activity/x;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.view.x {
        public c() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = ServiceBookingWorkHoursFragment.f277896A0;
            ServiceBookingWorkHoursFragment.this.q5().accept(a.C8259a.f278094a);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f277914l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f277914l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f277914l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServiceBookingWorkHoursFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f277916l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f277916l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f277916l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f277917l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f277917l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f277917l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f277918l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f277918l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f277918l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServiceBookingWorkHoursFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_settings/work_hours/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.service_booking_settings.work_hours.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_booking_settings.work_hours.e invoke() {
            com.avito.android.service_booking_settings.work_hours.f fVar = ServiceBookingWorkHoursFragment.this.f277897n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.service_booking_settings.work_hours.e) fVar.get();
        }
    }

    public ServiceBookingWorkHoursFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f277898o0 = new O0(m0.f406844a.b(com.avito.android.service_booking_settings.work_hours.e.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f277908y0 = C42727D.c(new b());
        this.f277909z0 = new c();
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h.c
    public final void N2(boolean z12, @Y61.k C15567b c15567b) {
        q5().accept(new a.c(z12, c15567b));
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h.b
    public final void U(int i12) {
        q5().accept(new a.m(i12));
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        if (str.equals("WORK_HOURS_TIME_GAP_SELECT_REQUEST_ID")) {
            com.avito.android.service_booking_settings.work_hours.e eVarQ5 = q5();
            Object objG = C42745f0.G(list);
            eVarQ5.accept(new a.l(objG instanceof Option ? (Option) objG : null));
        } else {
            if (!str.equals("WORK_HOURS_SCHEDULE_RESTRICTION_SELECT_REQUEST_ID")) {
                V2.f318762a.e("ServiceBookingWorkHoursFragment:onSelected unexpected requestId ".concat(str), null);
                return;
            }
            com.avito.android.service_booking_settings.work_hours.e eVarQ52 = q5();
            Object objG2 = C42745f0.G(list);
            eVarQ52.accept(new a.j(objG2 instanceof SchedulePeriod.ScheduleOptionsItem ? (SchedulePeriod.ScheduleOptionsItem) objG2 : null));
        }
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h.d
    public final void n2(@Y61.k org.threeten.bp.g gVar, @Y61.k org.threeten.bp.g gVar2, @Y61.k C15567b c15567b) {
        q5().accept(new a.d(gVar, gVar2, c15567b));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f277902s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.fragment_service_booking_settings, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        h.a aVar = this.f277906w0;
        if (aVar == null) {
            aVar = null;
        }
        this.f277907x0 = aVar.a(view, q5());
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f277909z0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f277902s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, q5(), com.avito.android.analytics.screens.mvi.k.f90658l, new com.avito.android.service_booking_settings.work_hours.a(this));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.service_booking_settings.work_hours.b(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f277902s0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        new D();
        F f12 = new F();
        f12.c();
        com.avito.android.service_booking_settings.di.work_hours.a.a().a(requireContext(), getF42820b(), (ServiceBookingWorkHoursArgument) this.f277908y0.getValue(), this, this, this, cv.c.b(this), (com.avito.android.service_booking_settings.di.work_hours.d) C29972i.a(C29972i.b(this), com.avito.android.service_booking_settings.di.work_hours.d.class), new C28478k(ServiceBookingWorkHoursScreen.f277893d, com.avito.android.analytics.screens.s.c(this), "serviceBookingWorkHours")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f277902s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(f12.b());
    }

    public final com.avito.android.service_booking_settings.work_hours.e q5() {
        return (com.avito.android.service_booking_settings.work_hours.e) this.f277898o0.getValue();
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h.b
    public final void x(int i12) {
        q5().accept(new a.e(i12));
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
