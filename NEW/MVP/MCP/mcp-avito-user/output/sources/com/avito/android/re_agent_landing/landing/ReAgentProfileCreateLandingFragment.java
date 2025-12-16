package com.avito.android.re_agent_landing.landing;

import Cd.C13243a;
import Sh0.InterfaceC15186a;
import Sh0.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.re_agent_landing.landing.d;
import com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment;
import com.avito.android.re_agent_landing.landing.flows_dialog.model.ReAgentProfileCreateLandingFlowsArguments;
import com.avito.android.re_agent_landing.perf_const.ReAgentProfileCreateLandingScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ReAgentProfileCreateLandingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/ReAgentProfileCreateLandingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReAgentProfileCreateLandingFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f250556v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.re_agent_landing.landing.f f250557n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f250558o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f250559p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f250560q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f250561r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f250562s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.re_agent_landing.landing.d f250563t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f250564u0;

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/ReAgentProfileCreateLandingFragment$a;", "", "<init>", "()V", "", "RE_AGENT_PROFILE_CREATE_LANDING_ARG", "Ljava/lang/String;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/re_agent_landing/landing/ReAgentProfileCreateLandingArgs;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ReAgentProfileCreateLandingArgs> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ReAgentProfileCreateLandingArgs invoke() {
            Bundle bundleRequireArguments = ReAgentProfileCreateLandingFragment.this.requireArguments();
            return (ReAgentProfileCreateLandingArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("re_agent_profile_create_landing_arg", ReAgentProfileCreateLandingArgs.class) : bundleRequireArguments.getParcelable("re_agent_profile_create_landing_arg"));
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC15186a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15186a interfaceC15186a) {
            ((com.avito.android.re_agent_landing.landing.e) this.receiver).accept(interfaceC15186a);
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Sh0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Sh0.b bVar) {
            com.avito.android.re_agent_landing.landing.d dVar;
            Sh0.b bVar2 = bVar;
            ReAgentProfileCreateLandingFragment reAgentProfileCreateLandingFragment = (ReAgentProfileCreateLandingFragment) this.receiver;
            a aVar = ReAgentProfileCreateLandingFragment.f250556v0;
            reAgentProfileCreateLandingFragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = reAgentProfileCreateLandingFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else if (bVar2 instanceof b.c) {
                ReAgentProfileCreateLandingFlowsDialogFragment.a aVar2 = ReAgentProfileCreateLandingFlowsDialogFragment.f250622n0;
                ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments = new ReAgentProfileCreateLandingFlowsArguments(((b.c) bVar2).f15121a);
                aVar2.getClass();
                ReAgentProfileCreateLandingFlowsDialogFragment.a.a(reAgentProfileCreateLandingFlowsArguments).show(reAgentProfileCreateLandingFragment.getParentFragmentManager(), "re_agent_profile_create_landing_flows");
            } else if (bVar2 instanceof b.C1031b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = reAgentProfileCreateLandingFragment.f250559p0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((b.C1031b) bVar2).f15120a, null, null, 6);
            } else if ((bVar2 instanceof b.d) && (dVar = reAgentProfileCreateLandingFragment.f250563t0) != null) {
                int i12 = ((b.d) bVar2).f15122a;
                d.a aVar4 = dVar.f250578e;
                aVar4.f53878a = i12;
                RecyclerView.m layoutManager = dVar.f250575b.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.x1(aVar4);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.l<Sh0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Sh0.c cVar) {
            Sh0.c cVar2 = cVar;
            ReAgentProfileCreateLandingFragment reAgentProfileCreateLandingFragment = (ReAgentProfileCreateLandingFragment) this.receiver;
            a aVar = ReAgentProfileCreateLandingFragment.f250556v0;
            reAgentProfileCreateLandingFragment.getClass();
            if (cVar2.f15127d) {
                com.avito.android.re_agent_landing.landing.d dVar = reAgentProfileCreateLandingFragment.f250563t0;
                if (dVar != null) {
                    D6.w(dVar.f250575b);
                    D6.w(dVar.f250576c);
                    D6.H(dVar.f250577d);
                    G0 g02 = G0.f406611a;
                }
            } else if (cVar2.f15126c) {
                com.avito.android.re_agent_landing.landing.d dVar2 = reAgentProfileCreateLandingFragment.f250563t0;
                if (dVar2 != null) {
                    D6.H(dVar2.f250576c);
                    D6.w(dVar2.f250577d);
                    G0 g03 = G0.f406611a;
                }
            } else {
                UV0.c cVar3 = new UV0.c(cVar2.f15125b);
                com.avito.konveyor.adapter.a aVar2 = reAgentProfileCreateLandingFragment.f250562s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c(cVar3);
                com.avito.android.re_agent_landing.landing.d dVar3 = reAgentProfileCreateLandingFragment.f250563t0;
                if (dVar3 != null) {
                    D6.H(dVar3.f250575b);
                    D6.w(dVar3.f250576c);
                    D6.w(dVar3.f250577d);
                }
                ((com.avito.android.re_agent_landing.landing.e) reAgentProfileCreateLandingFragment.f250558o0.getValue()).accept(InterfaceC15186a.f.f15118a);
                G0 g04 = G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSh0/a;", "it", "Lkotlin/G0;", "invoke", "(LSh0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC15186a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15186a interfaceC15186a) {
            a aVar = ReAgentProfileCreateLandingFragment.f250556v0;
            ((com.avito.android.re_agent_landing.landing.e) ReAgentProfileCreateLandingFragment.this.f250558o0.getValue()).accept(interfaceC15186a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f250567l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f250567l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f250567l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ReAgentProfileCreateLandingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f250569l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f250569l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f250569l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f250570l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f250570l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f250570l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f250571l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f250571l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f250571l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/re_agent_landing/landing/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.re_agent_landing.landing.e> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.re_agent_landing.landing.e invoke() {
            com.avito.android.re_agent_landing.landing.f fVar = ReAgentProfileCreateLandingFragment.this.f250557n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.re_agent_landing.landing.e) fVar.get();
        }
    }

    public ReAgentProfileCreateLandingFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f250558o0 = new O0(m0.f406844a.b(com.avito.android.re_agent_landing.landing.e.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f250564u0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f250560q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.re_agent_profile_create_landing_fragment, viewGroup, false);
        com.avito.konveyor.adapter.j jVar = this.f250561r0;
        if (jVar == null) {
            jVar = null;
        }
        O0 o02 = this.f250558o0;
        this.f250563t0 = new com.avito.android.re_agent_landing.landing.d(viewInflate, jVar, new c(1, (com.avito.android.re_agent_landing.landing.e) o02.getValue(), com.avito.android.re_agent_landing.landing.e.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f250560q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.re_agent_landing.landing.e) o02.getValue(), new d(1, this, ReAgentProfileCreateLandingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingOneTimeEvent;)V", 0), new e(1, this, ReAgentProfileCreateLandingFragment.class, "render", "render(Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingState;)Lkotlin/Unit;", 8));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f250563t0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((com.avito.android.re_agent_landing.landing.e) this.f250558o0.getValue()).accept(InterfaceC15186a.d.f15116a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f250560q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.re_agent_landing.landing.di.a.a().a((com.avito.android.re_agent_landing.di.c) C29972i.a(C29972i.b(this), com.avito.android.re_agent_landing.di.c.class), cv.c.b(this), (ReAgentProfileCreateLandingArgs) this.f250564u0.getValue(), new C28478k(ReAgentProfileCreateLandingScreen.f250843d, s.c(this), null, 4, null), new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f250560q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
