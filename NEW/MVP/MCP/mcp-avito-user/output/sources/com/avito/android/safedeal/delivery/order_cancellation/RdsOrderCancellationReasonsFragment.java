package com.avito.android.safedeal.delivery.order_cancellation;

import Cd.C13243a;
import Hn0.InterfaceC14013a;
import Hn0.b;
import Hn0.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: RdsOrderCancellationReasonsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/RdsOrderCancellationReasonsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RdsOrderCancellationReasonsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public n f256075n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f256076o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f256077p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f256078q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f256079r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.delivery.order_cancellation.c f256080s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f256081t0;

    /* renamed from: u0, reason: collision with root package name */
    public o f256082u0;

    /* renamed from: v0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f256083v0;

    /* compiled from: RdsOrderCancellationReasonsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/RdsOrderCancellationReasonsFragment$a;", "", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: RdsOrderCancellationReasonsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Hn0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Hn0.b bVar) {
            Hn0.b bVar2 = bVar;
            RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment = (RdsOrderCancellationReasonsFragment) this.receiver;
            rdsOrderCancellationReasonsFragment.getClass();
            if (bVar2 instanceof b.a) {
                o oVar = rdsOrderCancellationReasonsFragment.f256082u0;
                (oVar != null ? oVar : null).w0(0);
            } else if (bVar2 instanceof b.C0437b) {
                o oVar2 = rdsOrderCancellationReasonsFragment.f256082u0;
                b.C0437b c0437b = (b.C0437b) bVar2;
                (oVar2 != null ? oVar2 : null).H0(c0437b.f7700a, c0437b.f7701b);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                com.avito.android.safedeal.delivery.order_cancellation.c cVar2 = rdsOrderCancellationReasonsFragment.f256080s0;
                com.avito.android.component.toast.c.c(cVar, rdsOrderCancellationReasonsFragment, com.avito.android.printable_text.b.f((cVar2 != null ? cVar2 : null).f256093a), null, null, null, 0, null, 1022);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RdsOrderCancellationReasonsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Hn0.c, G0> {
        public final void f(@Y61.k Hn0.c cVar) {
            RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment = (RdsOrderCancellationReasonsFragment) this.receiver;
            rdsOrderCancellationReasonsFragment.getClass();
            c.a aVar = cVar.f7703b;
            if (aVar instanceof c.a.C0438a) {
                c.a.C0438a c0438a = (c.a.C0438a) aVar;
                com.avito.android.recycler.data_aware.c cVar2 = rdsOrderCancellationReasonsFragment.f256079r0;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                cVar2.c(c0438a.f7705b);
                com.avito.android.progress_overlay.l lVar = rdsOrderCancellationReasonsFragment.f256083v0;
                (lVar != null ? lVar : null).j();
                return;
            }
            if (aVar instanceof c.a.C0439c) {
                com.avito.android.progress_overlay.l lVar2 = rdsOrderCancellationReasonsFragment.f256083v0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.k(null);
                return;
            }
            if (aVar instanceof c.a.b) {
                com.avito.android.progress_overlay.l lVar3 = rdsOrderCancellationReasonsFragment.f256083v0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.a(z.k(((c.a.b) aVar).f7707a));
                com.avito.android.progress_overlay.l lVar4 = rdsOrderCancellationReasonsFragment.f256083v0;
                (lVar4 != null ? lVar4 : null).f231600j = new k(rdsOrderCancellationReasonsFragment);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Hn0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256084l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f256084l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256084l);
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
            return RdsOrderCancellationReasonsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f256086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f256086l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256086l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256087l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256087l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256088l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256088l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RdsOrderCancellationReasonsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/delivery/order_cancellation/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<m> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = RdsOrderCancellationReasonsFragment.this.f256075n0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    public RdsOrderCancellationReasonsFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f256076o0 = new O0(m0.f406844a.b(m.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        androidx.core.content.j jVarL1 = l1();
        o oVar = jVarL1 instanceof o ? (o) jVarL1 : null;
        if (oVar == null) {
            throw new IllegalStateException("Parent activity must implement RdsOrderCancellationRouter");
        }
        this.f256082u0 = oVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f256081t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256081t0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (m) this.f256076o0.getValue(), new b(1, this, RdsOrderCancellationReasonsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsOneTimeEvent;)V", 0), new c(1, this, RdsOrderCancellationReasonsFragment.class, "render", "render(Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsState;)V", 0));
        return layoutInflater.inflate(R.layout.delivery_rds_order_cancellation_reasons_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256081t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
        toolbar.setNavigationOnClickListener(new com.avito.android.review_gallery.g(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.reasons_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.j jVar = this.f256078q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256081t0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.b(recyclerView);
        View viewFindViewById3 = view.findViewById(R.id.content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        InterfaceC28373a interfaceC28373a = this.f256077p0;
        this.f256083v0 = new com.avito.android.progress_overlay.l(viewGroup, R.id.reasons_recycler, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.safedeal.delivery.order_cancellation.j] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EXTRA_ORDER_ID")) == null) {
            throw new IllegalStateException("Order id must not be null");
        }
        com.avito.android.safedeal.delivery.di.component.a.a().a(getResources(), this, this, s.c(this), string, new p() { // from class: com.avito.android.safedeal.delivery.order_cancellation.j
            @Override // com.avito.android.safedeal.delivery.order_cancellation.p
            public final void a(InterfaceC14013a.C0436a c0436a) {
                ((m) this.f256360a.f256076o0.getValue()).accept(c0436a);
            }
        }, (com.avito.android.safedeal.delivery.di.component.b) C29972i.a(C29972i.b(this), com.avito.android.safedeal.delivery.di.component.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256081t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256081t0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}
