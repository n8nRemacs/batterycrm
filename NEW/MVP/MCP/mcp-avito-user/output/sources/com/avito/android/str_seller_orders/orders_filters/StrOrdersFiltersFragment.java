package com.avito.android.str_seller_orders.orders_filters;

import Cd.C13243a;
import Fc1.D3;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
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
import qz0.InterfaceC47467a;
import qz0.InterfaceC47468b;
import z1.AbstractC50339a;

/* compiled from: StrOrdersFiltersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/StrOrdersFiltersFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersFiltersFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.orders_filters.d f289103h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f289104i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f289105j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f289106k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f289107l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.str_seller_orders.orders_filters.b f289108m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f289102o0 = {m0.f406844a.e(new Y(StrOrdersFiltersFragment.class, "openParams", "getOpenParams()Lcom/avito/android/str_seller_orders/orders_filters/StrOrdersFiltersOpenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f289101n0 = new a(null);

    /* compiled from: StrOrdersFiltersFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/StrOrdersFiltersFragment$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "RESULT_KEY", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersFiltersFragment.f289101n0;
            StrOrdersFiltersFragment.this.f5().accept(InterfaceC47467a.d.f429543a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC47468b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47468b interfaceC47468b) {
            InterfaceC47468b interfaceC47468b2 = interfaceC47468b;
            StrOrdersFiltersFragment strOrdersFiltersFragment = (StrOrdersFiltersFragment) this.receiver;
            a aVar = StrOrdersFiltersFragment.f289101n0;
            strOrdersFiltersFragment.getClass();
            if (interfaceC47468b2 instanceof InterfaceC47468b.a) {
                strOrdersFiltersFragment.dismiss();
            } else if (interfaceC47468b2 instanceof InterfaceC47468b.C12349b) {
                strOrdersFiltersFragment.getParentFragmentManager().o0(C22777e.b(new Q("str_orders_filters_result_key", ((InterfaceC47468b.C12349b) interfaceC47468b2).f429546a)), "str_orders_filters_request_key");
                strOrdersFiltersFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqz0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lqz0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<qz0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(qz0.c cVar) {
            com.avito.android.str_seller_orders.orders_filters.b bVar;
            Button button;
            a aVar = StrOrdersFiltersFragment.f289101n0;
            StrOrdersFiltersFragment strOrdersFiltersFragment = StrOrdersFiltersFragment.this;
            strOrdersFiltersFragment.getClass();
            qz0.d dVar = cVar.f429555h;
            String str = dVar.f429556a;
            if (str != null && (bVar = strOrdersFiltersFragment.f289108m0) != null && (button = bVar.f289127b) != null) {
                button.setText(str);
            }
            com.avito.konveyor.adapter.d dVar2 = strOrdersFiltersFragment.f289106k0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.l(dVar.f429557b, null);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersFiltersFragment.f289101n0;
            StrOrdersFiltersFragment.this.f5().accept(InterfaceC47467a.c.f429542a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersFiltersFragment.f289101n0;
            StrOrdersFiltersFragment.this.f5().accept(InterfaceC47467a.b.f429541a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqz0/a;", "it", "Lkotlin/G0;", "invoke", "(Lqz0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC47467a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC47467a interfaceC47467a) {
            a aVar = StrOrdersFiltersFragment.f289101n0;
            StrOrdersFiltersFragment.this.f5().accept(interfaceC47467a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f289114l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f289114l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f289114l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrOrdersFiltersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f289116l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f289116l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f289116l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289117l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289117l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f289117l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289118l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289118l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f289118l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrOrdersFiltersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/orders_filters/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.str_seller_orders.orders_filters.c> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.orders_filters.c invoke() {
            com.avito.android.str_seller_orders.orders_filters.d dVar = StrOrdersFiltersFragment.this.f289103h0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.str_seller_orders.orders_filters.c) dVar.get();
        }
    }

    public StrOrdersFiltersFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f289104i0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.orders_filters.c.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f289107l0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders.orders_filters.di.a.a().a((com.avito.android.str_seller_orders.orders_filters.di.e) C29972i.a(C29972i.b(this), com.avito.android.str_seller_orders.orders_filters.di.e.class), s.b(this), new g(), (StrOrdersFiltersOpenParams) this.f289107l0.getValue(this, f289102o0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289105j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders.orders_filters.c f5() {
        return (com.avito.android.str_seller_orders.orders_filters.c) this.f289104i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289105j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        dVar.T();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.setOnCancelListener(new D3(this, 18));
        dVar.Q(new b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f289105j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f289105j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f289105j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, f5(), new c(1, this, StrOrdersFiltersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersOneTimeEvent;)V", 0), new d());
        return LayoutInflater.from(getContext()).inflate(R.layout.str_orders_filters_fragment, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.str_seller_orders.orders_filters.b bVar = this.f289108m0;
        RecyclerView recyclerView = bVar != null ? bVar.f289126a : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.f289108m0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289105j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        Dialog dialog = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
        if (dVar != null) {
            dVar.y(R.drawable.ic_back_24);
            int iD2 = C35835l0.d(R.attr.gray54, requireContext());
            q qVar = dVar.f178530x;
            if (qVar != null) {
                qVar.d(iD2);
            }
            dVar.L(((StrOrdersFiltersOpenParams) this.f289107l0.getValue(this, f289102o0[0])).f289123e.f289156b, getString(R.string.str_orders_filters_clear_text), true, true);
            dVar.P(new e());
            dVar.R(new f());
        }
        com.avito.android.str_seller_orders.orders_filters.b bVar = new com.avito.android.str_seller_orders.orders_filters.b(view);
        this.f289108m0 = bVar;
        Button button = bVar.f289127b;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 12));
        }
        com.avito.android.str_seller_orders.orders_filters.b bVar2 = this.f289108m0;
        if (bVar2 == null || (recyclerView = bVar2.f289126a) == null) {
            return;
        }
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        com.avito.konveyor.adapter.d dVar2 = this.f289106k0;
        recyclerView.setAdapter(dVar2 != null ? dVar2 : null);
    }
}
