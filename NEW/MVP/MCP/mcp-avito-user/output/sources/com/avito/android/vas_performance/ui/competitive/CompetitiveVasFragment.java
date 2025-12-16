package com.avito.android.vas_performance.ui.competitive;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;
import xZ.C49899a;

/* compiled from: CompetitiveVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/CompetitiveVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompetitiveVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f321463C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public InterfaceC49447a f321464A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f321465B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f321466n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f321467o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public p f321468p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f321469q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f321470r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f321471s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f321472t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f321473u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f321474v0;

    /* renamed from: w0, reason: collision with root package name */
    public Button f321475w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f321476x0;

    /* renamed from: y0, reason: collision with root package name */
    public MnzFloatingFooter f321477y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public C49899a f321478z0;

    /* compiled from: CompetitiveVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/CompetitiveVasFragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSEABLE", "KEY_ITEM_ID", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CompetitiveVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            p pVar = CompetitiveVasFragment.this.f321468p0;
            if (pVar == null) {
                pVar = null;
            }
            pVar.ke();
            return G0.f406611a;
        }
    }

    /* compiled from: CompetitiveVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f321480b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f321480b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f321480b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f321480b;
        }

        public final int hashCode() {
            return this.f321480b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f321480b.invoke(obj);
        }
    }

    public CompetitiveVasFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
            throw new IllegalStateException("checkoutContext must not be null");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("item_id")) == null) {
            throw new IllegalStateException("itemId must not be null");
        }
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f321464A0 = interfaceC49447a;
        Bundle arguments3 = getArguments();
        this.f321465B0 = (arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("closable")) : null).booleanValue();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_performance.di.competitive.s.a().a(string2, string, this.f321465B0, this, com.avito.android.analytics.screens.s.c(this), (com.avito.android.vas_performance.di.competitive.i) C29972i.a(C29972i.b(this), com.avito.android.vas_performance.di.competitive.i.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f321471s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f321472t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f321471s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.competitive_vas_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        InterfaceC28373a interfaceC28373a = this.f321470r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        this.f321476x0 = lVar;
        lVar.f231600j = new b();
        this.f321474v0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f321475w0 = (Button) view.findViewById(R.id.continue_button);
        this.f321477y0 = (MnzFloatingFooter) view.findViewById(R.id.competitive_vas_floating_footer);
        Button button = this.f321475w0;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 7));
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("closable") : true;
        toolbar.setNavigationIcon(z12 ? R.drawable.ic_close_24 : R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new O91.j(2, this, z12));
        RecyclerView recyclerView = this.f321474v0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        com.avito.konveyor.adapter.j jVar = this.f321469q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f321474v0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.l(new com.avito.android.vas_performance.ui.recycler.b(), -1);
        Button button2 = this.f321475w0;
        if (button2 == null) {
            button2 = null;
        }
        button2.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(3, this, button2));
        MnzFloatingFooter mnzFloatingFooter = this.f321477y0;
        if (mnzFloatingFooter == null) {
            mnzFloatingFooter = null;
        }
        mnzFloatingFooter.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(3, this, mnzFloatingFooter));
        p pVar = this.f321468p0;
        if (pVar == null) {
            pVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f321467o0;
        if (set == null) {
            set = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = pVar.f321510X;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z13 = dVar instanceof com.avito.android.vas_performance.ui.items.competitive_vas_tabs.e;
            InterfaceC35745a5 interfaceC35745a5 = pVar.f321499M;
            if (z13) {
                io.reactivex.rxjava3.subjects.e f321672c = ((com.avito.android.vas_performance.ui.items.competitive_vas_tabs.e) dVar).getF321672c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f321672c.getClass();
                I0 i0J0 = f321672c.C0(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                n nVar = new n(pVar);
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(nVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.o
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.vas_performance.ui.items.competitive_vas.e) {
                io.reactivex.rxjava3.subjects.e f321633c = ((com.avito.android.vas_performance.ui.items.competitive_vas.e) dVar).getF321633c();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                f321633c.getClass();
                I0 i0J02 = f321633c.C0(50L, timeUnit2, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                l lVar2 = new l(pVar);
                final V2 v23 = V2.f318762a;
                cVar.b(i0J02.v0(lVar2, new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.m
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v23.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.vas_performance.ui.items.competitive_vas_info_action.d) {
                io.reactivex.rxjava3.subjects.e f321655c = ((com.avito.android.vas_performance.ui.items.competitive_vas_info_action.d) dVar).getF321655c();
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                f321655c.getClass();
                B0 b0D0 = f321655c.C0(50L, timeUnit3, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e()).d0(i.f321488b);
                final com.avito.android.util.architecture_components.D<DeepLink> d12 = pVar.f321504R;
                l41.g gVar = new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.j
                    @Override // l41.g
                    public final void accept(Object obj) {
                        d12.setValue((DeepLink) obj);
                    }
                };
                final V2 v24 = V2.f318762a;
                cVar.b(b0D0.v0(gVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.k
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v24.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        p pVar2 = this.f321468p0;
        if (pVar2 == null) {
            pVar2 = null;
        }
        pVar2.f321502P.observe(getViewLifecycleOwner(), new c(new com.avito.android.vas_performance.ui.competitive.c(this)));
        p pVar3 = this.f321468p0;
        if (pVar3 == null) {
            pVar3 = null;
        }
        pVar3.f321504R.observe(getViewLifecycleOwner(), new c(new d(this)));
        p pVar4 = this.f321468p0;
        if (pVar4 == null) {
            pVar4 = null;
        }
        pVar4.f321503Q.observe(getViewLifecycleOwner(), new c(new e(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f321471s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
