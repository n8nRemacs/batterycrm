package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen;

import Cd.C13243a;
import WK.b;
import Y41.p;
import Y61.l;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.m;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.C43108m;
import z1.AbstractC50339a;

/* compiled from: IacFinishedFeedbackScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "viewModelState", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacFinishedFeedbackScreenFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f166628t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.i f166629n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f166630o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public XK.a f166631p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f166632q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public N0 f166633r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C43108m f166634s0;

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenFragment$a;", "", "<init>", "()V", "", "KEY_SCREEN_ARGUMENT", "Ljava/lang/String;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f166635l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<WK.b, G0> {
        public final void f(@Y61.k WK.b bVar) {
            IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment = (IacFinishedFeedbackScreenFragment) this.receiver;
            a aVar = IacFinishedFeedbackScreenFragment.f166628t0;
            iacFinishedFeedbackScreenFragment.getClass();
            if (bVar instanceof b.C1263b) {
                C43259k.d(androidx.view.N0.a(iacFinishedFeedbackScreenFragment.r5()), null, null, new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.a(iacFinishedFeedbackScreenFragment, null), 3);
            } else if ((bVar instanceof b.a) && iacFinishedFeedbackScreenFragment.f166633r0 == null) {
                iacFinishedFeedbackScreenFragment.f166633r0 = C43259k.d(androidx.view.N0.a(iacFinishedFeedbackScreenFragment.r5()), null, null, new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.b(bVar, iacFinishedFeedbackScreenFragment, null), 3);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(WK.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<IacFinishedFeedbackScreenState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f166636l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState) {
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<A, Integer, G0> {
        public e() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = IacFinishedFeedbackScreenFragment.f166628t0;
                IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment = IacFinishedFeedbackScreenFragment.this;
                InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(iacFinishedFeedbackScreenFragment.r5().getState(), a13);
                XK.a aVar2 = iacFinishedFeedbackScreenFragment.f166631p0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                m.a(aVar2.a((IacFinishedFeedbackScreenState) interfaceC22204y1B.getF42167b()), new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.c(iacFinishedFeedbackScreenFragment), new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.d(iacFinishedFeedbackScreenFragment), new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.e(iacFinishedFeedbackScreenFragment), new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.f(iacFinishedFeedbackScreenFragment), iacFinishedFeedbackScreenFragment.f166634s0, a13, 262144);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f166638l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f166638l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f166638l);
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
            return IacFinishedFeedbackScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f166640l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f166640l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f166640l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166641l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166641l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f166641l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166642l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f166642l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: IacFinishedFeedbackScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h invoke() {
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.i iVar = IacFinishedFeedbackScreenFragment.this.f166629n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h) iVar.get();
        }
    }

    public IacFinishedFeedbackScreenFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f166630o0 = new O0(m0.f406844a.b(com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f166634s0 = kotlinx.coroutines.channels.A.a(0, null, b.f166635l, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f166632q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f166632q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new c(1, this, IacFinishedFeedbackScreenFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenEvent;)V", 0), d.f166636l);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1855275962, new e(), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        N0 n02 = this.f166633r0;
        if (n02 != null) {
            ((V0) n02).c(null);
            q5();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166632q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.a.a();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Resources resources = getResources();
        r rVarC = s.c(this);
        com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c cVar = (com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            f166628t0.getClass();
            iacFinishedFeedbackScreenArgument = (IacFinishedFeedbackScreenArgument) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("screen_argument", IacFinishedFeedbackScreenArgument.class) : arguments.getParcelable("screen_argument"));
        } else {
            iacFinishedFeedbackScreenArgument = null;
        }
        if (iacFinishedFeedbackScreenArgument == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(this, activityC22955mRequireActivity, resources, rVarC, iacFinishedFeedbackScreenArgument, cVar).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166632q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final void q5() {
        N0 n02 = this.f166633r0;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }

    public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h r5() {
        return (com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.h) this.f166630o0.getValue();
    }
}
