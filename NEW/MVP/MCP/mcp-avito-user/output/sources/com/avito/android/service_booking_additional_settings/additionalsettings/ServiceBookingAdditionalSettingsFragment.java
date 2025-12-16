package com.avito.android.service_booking_additional_settings.additionalsettings;

import Cd.C13243a;
import Os0.InterfaceC14732a;
import Os0.b;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import com.avito.android.service_booking_additional_settings.additionalsettings.f;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import com.avito.android.service_booking_additional_settings.additionalsettings.perf_screen.ServiceBookingAdditionalSettingsScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sK0.C48065c;
import z1.AbstractC50339a;

/* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/ServiceBookingAdditionalSettingsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingAdditionalSettingsFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f274816u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public f.a f274817n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Ls0.c f274818o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public u f274819p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f274820q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.service_booking_additional_settings.additionalsettings.f f274821r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f274822s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f274823t0;

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/ServiceBookingAdditionalSettingsFragment$a;", "", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Os0.b, G0> {
        public final void f(@Y61.k Os0.b bVar) {
            ServiceBookingAdditionalSettingsFragment serviceBookingAdditionalSettingsFragment = (ServiceBookingAdditionalSettingsFragment) this.receiver;
            a aVar = ServiceBookingAdditionalSettingsFragment.f274816u0;
            serviceBookingAdditionalSettingsFragment.getClass();
            if (L.f(bVar, b.a.f12644a)) {
                serviceBookingAdditionalSettingsFragment.requireActivity().setResult(-1);
                serviceBookingAdditionalSettingsFragment.requireActivity().finish();
                return;
            }
            boolean z12 = bVar instanceof b.d;
            com.avito.android.lib.design.toast_bar.k kVarB = null;
            List listSingletonList = null;
            if (!(z12 ? true : bVar instanceof b.e)) {
                if (bVar instanceof b.c) {
                    Arguments arguments = ((b.c) bVar).f12646a;
                    com.avito.android.select.bottom_sheet.c.a(serviceBookingAdditionalSettingsFragment, arguments).show(serviceBookingAdditionalSettingsFragment.getParentFragmentManager(), arguments.getRequestId());
                    return;
                } else {
                    if (bVar instanceof b.C0816b) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = serviceBookingAdditionalSettingsFragment.f274823t0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, ((b.C0816b) bVar).f12645a, null, null, 6);
                        return;
                    }
                    return;
                }
            }
            if (z12) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                com.avito.android.service_booking_additional_settings.additionalsettings.f fVar = serviceBookingAdditionalSettingsFragment.f274821r0;
                MaterialToolbar materialToolbar = (MaterialToolbar) (fVar != null ? fVar : null).f274956h.f275111a.getValue();
                ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, materialToolbar, ((b.d) bVar).f12647a, null, null, null, f.c.a.b(), 2750, toastBarPosition, null, false, false, null, null, 3982);
                return;
            }
            if (bVar instanceof b.e) {
                com.avito.android.service_booking_additional_settings.additionalsettings.f fVar2 = serviceBookingAdditionalSettingsFragment.f274821r0;
                if (fVar2 == null) {
                    fVar2 = null;
                }
                com.avito.android.lib.design.toast_bar.k kVar = fVar2.f274956h.f275117g;
                if (kVar != null) {
                    kVar.f();
                }
                com.avito.android.service_booking_additional_settings.additionalsettings.f fVar3 = serviceBookingAdditionalSettingsFragment.f274821r0;
                if (fVar3 == null) {
                    fVar3 = null;
                }
                s sVar = fVar3.f274956h;
                View view = serviceBookingAdditionalSettingsFragment.getView();
                if (view != null) {
                    com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                    BookingToggleToast bookingToggleToast = ((b.e) bVar).f12648a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(bookingToggleToast.f274835c);
                    ToastBarPosition toastBarPosition2 = ToastBarPosition.f181045c;
                    f.a aVar3 = f.a.f125253a;
                    String str = bookingToggleToast.f274834b;
                    if (str != null) {
                        listSingletonList = Collections.singletonList(new c.a.C3719a(str, bookingToggleToast.f274837e, null, com.avito.android.service_booking_additional_settings.additionalsettings.a.f274832l, 4, null));
                    }
                    kVarB = com.avito.android.component.toast.c.b(cVar2, view, printableTextF, null, listSingletonList, null, aVar3, bookingToggleToast.f274836d, toastBarPosition2, null, false, false, null, null, 3978);
                }
                sVar.f275117g = kVarB;
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Os0.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ServiceBookingAdditionalSettingsState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState) {
            ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState2 = serviceBookingAdditionalSettingsState;
            com.avito.android.service_booking_additional_settings.additionalsettings.f fVar = ServiceBookingAdditionalSettingsFragment.this.f274821r0;
            if (fVar == null) {
                fVar = null;
            }
            s sVar = fVar.f274956h;
            if (serviceBookingAdditionalSettingsState2.f274991b) {
                C42670a.d(sVar.f275116f);
            } else if (serviceBookingAdditionalSettingsState2.f274993d != null) {
                sVar.f275116f.c(null, new com.avito.android.service_booking_additional_settings.additionalsettings.g(fVar, serviceBookingAdditionalSettingsState2));
            } else {
                sVar.f275116f.b();
                boolean z12 = serviceBookingAdditionalSettingsState2.f274994e.f274997c;
                D6.F((RecyclerView) sVar.f275115e.getValue(), !z12);
                D6.G((Spinner) sVar.f275113c.getValue(), z12);
                ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent = serviceBookingAdditionalSettingsState2.f274992c;
                if (serviceBookingAdditionalSettingsContent != null) {
                    fVar.f274951c.c(new UV0.c(serviceBookingAdditionalSettingsContent.f275001e));
                    fVar.f274952d.notifyDataSetChanged();
                }
                ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsAppBar additionalSettingsAppBar = serviceBookingAdditionalSettingsContent != null ? serviceBookingAdditionalSettingsContent.f274998b : null;
                ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsHelpButton additionalSettingsHelpButton = serviceBookingAdditionalSettingsContent != null ? serviceBookingAdditionalSettingsContent.f274999c : null;
                MaterialToolbar materialToolbar = (MaterialToolbar) sVar.f275111a.getValue();
                materialToolbar.setTitle(additionalSettingsAppBar != null ? additionalSettingsAppBar.f275002b : null);
                if (additionalSettingsAppBar != null && !additionalSettingsAppBar.f275003c) {
                    materialToolbar.setNavigationIcon((Drawable) null);
                }
                InterfaceC42726C interfaceC42726C = sVar.f275112b;
                ((TextView) interfaceC42726C.getValue()).setText(additionalSettingsHelpButton != null ? additionalSettingsHelpButton.f275004b : null);
                D6.G((TextView) interfaceC42726C.getValue(), additionalSettingsHelpButton != null);
                ((TextView) interfaceC42726C.getValue()).setTextColor(C48065c.c(materialToolbar.getContext(), additionalSettingsHelpButton != null ? additionalSettingsHelpButton.f275006d : null));
                ((TextView) interfaceC42726C.getValue()).setOnClickListener(new com.avito.android.service_booking_additional_settings.additionalsettings.e(fVar, 0));
                AttributedText attributedText = serviceBookingAdditionalSettingsContent != null ? serviceBookingAdditionalSettingsContent.f275000d : null;
                InterfaceC42726C interfaceC42726C2 = sVar.f275114d;
                D6.G((TextView) interfaceC42726C2.getValue(), true);
                com.avito.android.util.text.j.a((TextView) interfaceC42726C2.getValue(), attributedText, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC14732a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14732a interfaceC14732a) {
            ((t) this.receiver).accept(interfaceC14732a);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_additional_settings/additionalsettings/ServiceBookingAdditionalSettingsFragment$e", "Landroidx/activity/x;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends x {
        public e() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = ServiceBookingAdditionalSettingsFragment.f274816u0;
            ServiceBookingAdditionalSettingsFragment.this.q5().accept(InterfaceC14732a.C0814a.f12631a);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f274826l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f274826l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f274826l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ServiceBookingAdditionalSettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f274828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f274828l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f274828l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f274829l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f274829l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f274829l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f274830l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f274830l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f274830l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/service_booking_additional_settings/additionalsettings/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<t> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = ServiceBookingAdditionalSettingsFragment.this.f274819p0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public ServiceBookingAdditionalSettingsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f274820q0 = new O0(m0.f406844a.b(t.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f274822s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C22960s.b(this, "REQUEST_ITEM_SELECTION_KEY", new com.avito.android.service_booking_additional_settings.additionalsettings.b(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f274822s0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, ServiceBookingAdditionalSettingsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.srv_fragment_additional_settings, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f274822s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        f.a aVar = this.f274817n0;
        this.f274821r0 = (aVar != null ? aVar : null).a(view, new d(1, q5(), t.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        requireActivity().getF21241d().a(getViewLifecycleOwner(), new e());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.service_booking_additional_settings.di.k.a().a(new C28478k(ServiceBookingAdditionalSettingsScreen.f275029d, com.avito.android.analytics.screens.s.c(this), "serviceBookingAdditionalSettings"), (com.avito.android.service_booking_additional_settings.di.j) C29972i.a(C29972i.b(this), com.avito.android.service_booking_additional_settings.di.j.class), cv.c.b(this)).zi(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f274822s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final t q5() {
        return (t) this.f274820q0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
    }
}
