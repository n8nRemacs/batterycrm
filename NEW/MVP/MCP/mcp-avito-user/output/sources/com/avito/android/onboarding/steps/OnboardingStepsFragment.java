package com.avito.android.onboarding.steps;

import Cd.C13243a;
import H40.a;
import H40.b;
import H40.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.OnboardingStepsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
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
import rV.InterfaceC47597a;
import z1.AbstractC50339a;

/* compiled from: OnboardingStepsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/steps/OnboardingStepsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingStepsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f209259v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f209260n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public t f209261o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f209262p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public q f209263q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f209264r0;

    /* renamed from: s0, reason: collision with root package name */
    public ViewPager2 f209265s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public String f209266t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final d f209267u0;

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/steps/OnboardingStepsFragment$a;", "", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<H40.c, G0> {
        @Override // Y41.l
        public final G0 invoke(H40.c cVar) {
            ActivityC22955m activityC22955mL1;
            OnboardingStepsFragment onboardingStepsFragment = (OnboardingStepsFragment) this.receiver;
            a aVar = OnboardingStepsFragment.f209259v0;
            onboardingStepsFragment.getClass();
            if (L.f(cVar, c.a.f6940a) && (activityC22955mL1 = onboardingStepsFragment.l1()) != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<H40.d, G0> {
        @Override // Y41.l
        public final G0 invoke(H40.d dVar) {
            H40.d dVar2 = dVar;
            OnboardingStepsFragment onboardingStepsFragment = (OnboardingStepsFragment) this.receiver;
            a aVar = OnboardingStepsFragment.f209259v0;
            onboardingStepsFragment.getClass();
            H40.a aVar2 = dVar2.f6943b;
            if (aVar2 instanceof a.c) {
                com.avito.android.progress_overlay.l lVar = onboardingStepsFragment.f209264r0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (aVar2 instanceof a.b) {
                q qVar = onboardingStepsFragment.f209263q0;
                if (qVar == null) {
                    qVar = null;
                }
                qVar.f209372e = dVar2.f6944c.getItems();
                qVar.notifyDataSetChanged();
                com.avito.android.progress_overlay.l lVar2 = onboardingStepsFragment.f209264r0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.j();
            } else if (aVar2 instanceof a.C0394a) {
                com.avito.android.progress_overlay.l lVar3 = onboardingStepsFragment.f209264r0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.a("");
            }
            ViewPager2 viewPager2 = onboardingStepsFragment.f209265s0;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            int currentItem = viewPager2.getCurrentItem();
            Integer num = dVar2.f6945d;
            if (num == null || currentItem != num.intValue()) {
                ViewPager2 viewPager22 = onboardingStepsFragment.f209265s0;
                if (viewPager22 == null) {
                    viewPager22 = null;
                }
                d dVar3 = onboardingStepsFragment.f209267u0;
                viewPager22.i(dVar3);
                if (num != null) {
                    int iIntValue = num.intValue();
                    ViewPager2 viewPager23 = onboardingStepsFragment.f209265s0;
                    if (viewPager23 == null) {
                        viewPager23 = null;
                    }
                    viewPager23.g(iIntValue, false);
                }
                ViewPager2 viewPager24 = onboardingStepsFragment.f209265s0;
                (viewPager24 != null ? viewPager24 : null).e(dVar3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/onboarding/steps/OnboardingStepsFragment$d", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ViewPager2.i {
        public d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            a aVar = OnboardingStepsFragment.f209259v0;
            ((s) OnboardingStepsFragment.this.f209262p0.getValue()).accept(new b.c(i12));
        }
    }

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH40/b;", "it", "Lkotlin/G0;", "invoke", "(LH40/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<H40.b, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(H40.b bVar) {
            a aVar = OnboardingStepsFragment.f209259v0;
            ((s) OnboardingStepsFragment.this.f209262p0.getValue()).accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f209270l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f209270l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f209270l);
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
            return OnboardingStepsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f209272l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f209272l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f209272l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209273l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209273l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f209273l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209274l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f209274l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: OnboardingStepsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/onboarding/steps/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<s> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = OnboardingStepsFragment.this.f209261o0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public OnboardingStepsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f209262p0 = new O0(m0.f406844a.b(s.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f209267u0 = new d();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f209260n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.onboarding_steps_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewPager2 viewPager2 = this.f209265s0;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.i(this.f209267u0);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.view_pager);
        this.f209265s0 = viewPager2;
        q qVar = this.f209263q0;
        if (qVar == null) {
            qVar = null;
        }
        viewPager2.setAdapter(qVar);
        ViewPager2 viewPager22 = this.f209265s0;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        viewPager22.e(this.f209267u0);
        PageIndicator pageIndicator = (PageIndicator) view.findViewById(R.id.page_indicator_view_pager);
        ViewPager2 viewPager23 = this.f209265s0;
        if (viewPager23 == null) {
            viewPager23 = null;
        }
        InterfaceC47597a<?> interfaceC47597a = pageIndicator.f179877m;
        if (interfaceC47597a != null) {
            interfaceC47597a.a();
        }
        rV.i iVar = new rV.i(pageIndicator.f179886v);
        iVar.b(viewPager23);
        pageIndicator.f179877m = iVar;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        String str = this.f209266t0;
        if (str != null) {
            toolbar.setTitle(str);
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC31873b(this, 28));
        toolbar.setTextAlignment(4);
        View viewFindViewById = view.findViewById(R.id.content_holder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.view_pager, null, 0, 0, 28, null);
        this.f209264r0 = lVar;
        lVar.f231600j = new com.avito.android.onboarding.steps.f(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f209260n0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (s) this.f209262p0.getValue(), new b(1, this, OnboardingStepsFragment.class, "handle", "handle(Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsOneTimeEvent;)V", 0), new c(1, this, OnboardingStepsFragment.class, "render", "render(Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f209260n0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            OnboardingStepsScreenParams onboardingStepsScreenParams = (OnboardingStepsScreenParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("extra_onboarding_screen_params", OnboardingStepsScreenParams.class) : arguments.getParcelable("extra_onboarding_screen_params"));
            if (onboardingStepsScreenParams != null) {
                this.f209266t0 = onboardingStepsScreenParams.f209277c;
                D.f90335a.getClass();
                F fA2 = D.a.a();
                com.avito.android.onboarding.steps.di.a.a().a(new C28478k(OnboardingStepsScreen.f90438d, com.avito.android.analytics.screens.s.c(this), "onboarding-steps"), onboardingStepsScreenParams.f209276b, onboardingStepsScreenParams.f209278d, new e(), cv.c.b(this), (com.avito.android.onboarding.steps.di.e) C29972i.a(C29972i.b(this), com.avito.android.onboarding.steps.di.e.class)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f209260n0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f209260n0;
                (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
                return;
            }
        }
        throw new IllegalStateException("OnboardingStepsScreenParams from bundle must not be null");
    }
}
