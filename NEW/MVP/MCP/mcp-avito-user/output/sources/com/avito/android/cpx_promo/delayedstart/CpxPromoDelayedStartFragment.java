package com.avito.android.cpx_promo.delayedstart;

import Cd.C13243a;
import Y41.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bs.InterfaceC25698a;
import bs.InterfaceC25699b;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.delayedstart.di.a;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartState;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import z1.AbstractC50339a;

/* compiled from: CpxPromoDelayedStartFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/CpxPromoDelayedStartFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoDelayedStartFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final b f126813r0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.cpx_promo.delayedstart.f f126814n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f126815o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126816p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f126817q0;

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/CpxPromoDelayedStartFragment$a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TextView f126818a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f126819b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Button f126820c;

        public a(@Y61.k NavBar navBar, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k Button button) {
            this.f126818a = textView;
            this.f126819b = textView2;
            this.f126820c = button;
        }
    }

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/CpxPromoDelayedStartFragment$b;", "", "<init>", "()V", "", "ARG_CONTENT", "Ljava/lang/String;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = CpxPromoDelayedStartFragment.f126813r0;
            ((com.avito.android.cpx_promo.delayedstart.e) CpxPromoDelayedStartFragment.this.f126815o0.getValue()).accept(InterfaceC25698a.C2019a.f57493a);
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends C42801a implements l<InterfaceC25699b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC25699b interfaceC25699b) {
            InterfaceC25699b interfaceC25699b2 = interfaceC25699b;
            CpxPromoDelayedStartFragment cpxPromoDelayedStartFragment = (CpxPromoDelayedStartFragment) this.receiver;
            b bVar = CpxPromoDelayedStartFragment.f126813r0;
            cpxPromoDelayedStartFragment.getClass();
            if (interfaceC25699b2 instanceof InterfaceC25699b.C2020b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = cpxPromoDelayedStartFragment.f126816p0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, ((InterfaceC25699b.C2020b) interfaceC25699b2).f57496a, null, null, 6);
                G0 g02 = G0.f406611a;
            } else {
                if (!(interfaceC25699b2 instanceof InterfaceC25699b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivityC22955m activityC22955mL1 = cpxPromoDelayedStartFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    G0 g03 = G0.f406611a;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<CpxPromoDelayedStartState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f126822l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CpxPromoDelayedStartFragment cpxPromoDelayedStartFragment, a aVar) {
            super(1);
            this.f126822l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(CpxPromoDelayedStartState cpxPromoDelayedStartState) {
            CpxPromoDelayedStartState cpxPromoDelayedStartState2 = cpxPromoDelayedStartState;
            b bVar = CpxPromoDelayedStartFragment.f126813r0;
            a aVar = this.f126822l;
            com.avito.android.util.text.j.a(aVar.f126818a, cpxPromoDelayedStartState2.f126866b, null);
            com.avito.android.util.text.j.a(aVar.f126819b, cpxPromoDelayedStartState2.f126867c, null);
            CpxPromoButton cpxPromoButton = cpxPromoDelayedStartState2.f126868d;
            com.avito.android.lib.design.button.b.a(aVar.f126820c, cpxPromoButton != null ? cpxPromoButton.getTitle() : null, false);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f126823l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f126823l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f126823l);
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
            return CpxPromoDelayedStartFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f126825l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f126825l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126825l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126826l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126826l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126826l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126827l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126827l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126827l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxPromoDelayedStartFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpx_promo/delayedstart/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.cpx_promo.delayedstart.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cpx_promo.delayedstart.e invoke() {
            com.avito.android.cpx_promo.delayedstart.f fVar = CpxPromoDelayedStartFragment.this.f126814n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.cpx_promo.delayedstart.e) fVar.get();
        }
    }

    public CpxPromoDelayedStartFragment() {
        super(R.layout.fragment_cpx_promo_delayed_start);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f126815o0 = new O0(m0.f406844a.b(com.avito.android.cpx_promo.delayedstart.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f126817q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.nav_bar);
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        Button button = (Button) view.findViewById(R.id.button);
        a aVar = new a(navBar, textView, textView2, button);
        navBar.c(R.attr.ic_arrowBack24, new c());
        button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 9));
        ScreenPerformanceTracker screenPerformanceTracker = this.f126817q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, (com.avito.android.cpx_promo.delayedstart.e) this.f126815o0.getValue(), new d(1, this, CpxPromoDelayedStartFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartOneTimeEvent;)Lkotlin/Unit;", 8), new e(this, aVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126817q0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3781a interfaceC3781aA = com.avito.android.cpx_promo.delayedstart.di.h.a();
        com.avito.android.cpx_promo.impl.di.d dVar = (com.avito.android.cpx_promo.impl.di.d) C29972i.a(C29972i.b(this), Object.class);
        r rVarC = s.c(this);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("arg.content", CpxPromoDelayedStartContent.class) : arguments.getParcelable("arg.content");
        if (parcelable == null) {
            throw new IllegalArgumentException("arg.content - param must be not null");
        }
        interfaceC3781aA.a(dVar, rVarC, interfaceC39417aB, (CpxPromoDelayedStartContent) parcelable).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126817q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126817q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f126816p0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }
}
