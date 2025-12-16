package com.avito.android.vas_performance.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.PerformanceVasScreen;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.vas_performance.ui.j;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.S;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;

/* compiled from: PerformanceVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/PerformanceVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "DS_TCH_BDGT_AVITO_LOOK_AND_FEEL_THEME_DEPRECATION"})
/* loaded from: classes5.dex */
public final class PerformanceVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f321384B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f321385A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f321386n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f321387o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.o f321388p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f321389q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f321390r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f321391s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public TL0.a f321392t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f321393u0;

    /* renamed from: v0, reason: collision with root package name */
    public Button f321394v0;

    /* renamed from: w0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f321395w0;

    /* renamed from: x0, reason: collision with root package name */
    public InterfaceC49447a f321396x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f321397y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f321398z0;

    /* compiled from: PerformanceVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/PerformanceVasFragment$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PerformanceVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = PerformanceVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("advert_id")) == null) {
                throw new IllegalStateException("advertId must not be null");
            }
            return string;
        }
    }

    /* compiled from: PerformanceVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = PerformanceVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
                throw new IllegalStateException("checkoutContext must not be null");
            }
            return string;
        }
    }

    /* compiled from: PerformanceVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = PerformanceVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("currentFlow")) == null) {
                throw new IllegalStateException("currentFlow must not be null");
            }
            return string;
        }
    }

    /* compiled from: PerformanceVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.vas_performance.o oVar = PerformanceVasFragment.this.f321388p0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.h0();
            return G0.f406611a;
        }
    }

    public PerformanceVasFragment() {
        super(0, 1, null);
        this.f321397y0 = C42727D.c(new c());
        this.f321398z0 = C42727D.c(new b());
        this.f321385A0 = C42727D.c(new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_LookAndFeel));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f321396x0 = interfaceC49447a;
        com.avito.android.vas_performance.di.perfomance.a.a().a((com.avito.android.vas_performance.di.perfomance.n) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), new com.avito.android.vas_performance.di.perfomance.q((String) this.f321398z0.getValue(), (String) this.f321397y0.getValue()), this, com.avito.android.analytics.screens.s.c(this), PerformanceVasScreen.f90446d).a(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f321390r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        TL0.a aVar = this.f321392t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e();
        return layoutInflater.inflate(R.layout.performance_vas_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f321389q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new sL0.b((String) this.f321398z0.getValue(), (String) this.f321385A0.getValue()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        InterfaceC28373a interfaceC28373a2 = this.f321389q0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a2 != null ? interfaceC28373a2 : null, 0, 0, 24, null);
        this.f321395w0 = lVar;
        lVar.f231600j = new e();
        this.f321393u0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        Button button = (Button) view.findViewById(R.id.skip_button);
        this.f321394v0 = button;
        button.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 6));
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("closable") : true;
        toolbar.setNavigationIcon(z12 ? R.drawable.ic_close_24 : R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new O91.j(1, this, z12));
        com.avito.konveyor.adapter.a aVar = this.f321387o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f321386n0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        RecyclerView recyclerView = this.f321393u0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f321393u0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.l(new com.avito.android.vas_performance.ui.recycler.d(requireContext().getResources()), -1);
        Button button2 = this.f321394v0;
        if (button2 == null) {
            button2 = null;
        }
        new S(C37722i.f(button2).d0(new f(this)).N(g.f321533b)).n(new h(this), new i(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        com.avito.android.vas_performance.o oVar = this.f321388p0;
        if (oVar == null) {
            oVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f321391s0;
        if (set == null) {
            set = null;
        }
        oVar.a(set);
        com.avito.android.vas_performance.o oVar2 = this.f321388p0;
        if (oVar2 == null) {
            oVar2 = null;
        }
        oVar2.getF321881Z().observe(getViewLifecycleOwner(), new L91.e(this, 10));
        com.avito.android.vas_performance.o oVar3 = this.f321388p0;
        if (oVar3 == null) {
            oVar3 = null;
        }
        oVar3.getF321884c0().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.vas_performance.ui.b(this)));
        com.avito.android.vas_performance.o oVar4 = this.f321388p0;
        if (oVar4 == null) {
            oVar4 = null;
        }
        oVar4.getF321882a0().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.vas_performance.ui.c(this)));
        com.avito.android.vas_performance.o oVar5 = this.f321388p0;
        if (oVar5 == null) {
            oVar5 = null;
        }
        oVar5.getF321883b0().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.vas_performance.ui.d(this)));
        com.avito.android.vas_performance.o oVar6 = this.f321388p0;
        if (oVar6 == null) {
            oVar6 = null;
        }
        oVar6.getF321885d0().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.vas_performance.ui.e(this)));
        TL0.a aVar3 = this.f321392t0;
        (aVar3 != null ? aVar3 : null).d();
    }
}
