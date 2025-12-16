package com.avito.android.hotel_booking.select_radio;

import Cd.C13243a;
import Fc1.D3;
import TI.a;
import TI.b;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.di.C29972i;
import com.avito.android.hotel_booking.di.C30782c;
import com.avito.android.hotel_booking.di.InterfaceC30799u;
import com.avito.android.hotel_booking.select_radio.mvi.HotelBookingSelectRadioScreen;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: SelectRadioFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/SelectRadioFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectRadioFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.hotel_booking.select_radio.f f163978h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f163979i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f163980j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f163981k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public com.avito.android.hotel_booking.select_radio.d f163982l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f163983m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f163977o0 = {m0.f406844a.e(new Y(SelectRadioFragment.class, "openParams", "getOpenParams()Lcom/avito/android/hotel_booking/select_radio/SelectRadioOpenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f163976n0 = new a(null);

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/SelectRadioFragment$a;", "", "<init>", "()V", "", "RESULT_RADIO_KEY", "Ljava/lang/String;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelectRadioFragment.f163976n0;
            SelectRadioFragment.this.g5().accept(a.d.f15516a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<TI.b, G0> {
        @Override // Y41.l
        public final G0 invoke(TI.b bVar) {
            TI.b bVar2 = bVar;
            SelectRadioFragment selectRadioFragment = (SelectRadioFragment) this.receiver;
            a aVar = SelectRadioFragment.f163976n0;
            selectRadioFragment.getClass();
            if (bVar2 instanceof b.a) {
                selectRadioFragment.dismiss();
            } else if (bVar2 instanceof b.C1056b) {
                FragmentManager parentFragmentManager = selectRadioFragment.getParentFragmentManager();
                String tag = selectRadioFragment.getTag();
                if (tag == null) {
                    tag = "";
                }
                parentFragmentManager.o0(C22777e.b(new Q("select_radio_result_key", ((b.C1056b) bVar2).f15518a)), tag);
                selectRadioFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LTI/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<TI.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TI.c cVar) {
            TI.c cVar2 = cVar;
            SelectRadioFragment selectRadioFragment = SelectRadioFragment.this;
            com.avito.konveyor.adapter.d dVar = selectRadioFragment.f163981k0;
            if (dVar == null) {
                dVar = null;
            }
            TI.d dVar2 = cVar2.f15526g;
            dVar.l(dVar2.f15527a, new RunnableC28882d(9, selectRadioFragment, dVar2));
            com.avito.android.hotel_booking.select_radio.d dVar3 = selectRadioFragment.f163982l0;
            Button button = dVar3 != null ? dVar3.f163999b : null;
            if (button != null) {
                button.setEnabled(dVar2.f15529c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI/a;", "it", "Lkotlin/G0;", "invoke", "(LTI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<TI.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TI.a aVar) {
            a aVar2 = SelectRadioFragment.f163976n0;
            SelectRadioFragment.this.g5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f163987l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f163987l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f163987l);
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
            return SelectRadioFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f163989l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f163989l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f163989l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f163990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f163990l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f163990l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f163991l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f163991l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f163991l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectRadioFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/hotel_booking/select_radio/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.hotel_booking.select_radio.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.hotel_booking.select_radio.e invoke() {
            com.avito.android.hotel_booking.select_radio.f fVar = SelectRadioFragment.this.f163978h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.hotel_booking.select_radio.e) fVar.get();
        }
    }

    public SelectRadioFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f163979i0 = new O0(m0.f406844a.b(com.avito.android.hotel_booking.select_radio.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f163983m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(HotelBookingSelectRadioScreen.f164018d, s.b(this), null, 4, null);
        C30782c.a().a((InterfaceC30799u) C29972i.a(C29972i.b(this), InterfaceC30799u.class), c28478k, new e(), (SelectRadioOpenParams) this.f163983m0.getValue(this, f163977o0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163980j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.lib.design.bottom_sheet.d f5() {
        Dialog dialog = getDialog();
        if (dialog instanceof com.avito.android.lib.design.bottom_sheet.d) {
            return (com.avito.android.lib.design.bottom_sheet.d) dialog;
        }
        return null;
    }

    public final com.avito.android.hotel_booking.select_radio.e g5() {
        return (com.avito.android.hotel_booking.select_radio.e) this.f163979i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163980j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.T();
        dVar.setOnCancelListener(new D3(this, 8));
        dVar.Q(new b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f163980j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f163980j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.hotel_booking_select_radio_dialog, (ViewGroup) null);
        this.f163982l0 = new com.avito.android.hotel_booking.select_radio.d(viewInflate);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f163980j0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, g5(), new c(1, this, SelectRadioFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioOneTimeEvent;)V", 0), new d());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.hotel_booking.select_radio.d dVar = this.f163982l0;
        if (dVar != null) {
            dVar.f163998a.setAdapter(null);
        }
        this.f163982l0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        Button button;
        super.onViewCreated(view, bundle);
        com.avito.android.hotel_booking.select_radio.d dVar = this.f163982l0;
        RecyclerView recyclerView = dVar != null ? dVar.f163998a : null;
        if (recyclerView != null) {
            com.avito.konveyor.adapter.d dVar2 = this.f163981k0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            recyclerView.setAdapter(dVar2);
        }
        com.avito.android.hotel_booking.select_radio.d dVar3 = this.f163982l0;
        if (dVar3 != null && (button = dVar3.f163999b) != null) {
            button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 24));
        }
        com.avito.android.lib.design.bottom_sheet.d dVarF5 = f5();
        if (dVarF5 != null) {
            dVarF5.S(C35835l0.g(requireContext()).y);
        }
        com.avito.android.lib.design.bottom_sheet.d dVarF52 = f5();
        if (dVarF52 != null) {
            dVarF52.K(true);
        }
        com.avito.android.lib.design.bottom_sheet.d dVarF53 = f5();
        if (dVarF53 != null) {
            dVarF53.J(true);
        }
        com.avito.android.lib.design.bottom_sheet.d dVarF54 = f5();
        if (dVarF54 != null) {
            com.avito.android.lib.design.bottom_sheet.d.M(dVarF54, ((SelectRadioOpenParams) this.f163983m0.getValue(this, f163977o0[0])).f163993b, true, true, 2);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f163980j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
