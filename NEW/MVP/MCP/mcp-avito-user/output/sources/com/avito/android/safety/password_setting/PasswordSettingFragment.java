package com.avito.android.safety.password_setting;

import Cd.r;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
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
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.safety.password_setting.m;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import so0.InterfaceC48391a;
import z1.AbstractC50339a;

/* compiled from: PasswordSettingFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/password_setting/PasswordSettingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PasswordSettingFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f257418v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f257419w0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f257420n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f257421o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public m.a f257422p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f257423q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257424r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257425s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257426t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257427u0;

    /* compiled from: PasswordSettingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_setting/PasswordSettingFragment$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f257429m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar) {
            super(0);
            this.f257429m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(PasswordSettingFragment.this, this.f257429m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PasswordSettingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f257431l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f257431l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f257431l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f257432l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f257432l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f257432l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f257433l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f257433l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f257433l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PasswordSettingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/safety/password_setting/m;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/safety/password_setting/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<C23060r0, m> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final m invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            m.a aVar = PasswordSettingFragment.this.f257422p0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    static {
        Y y12 = new Y(PasswordSettingFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0);
        n0 n0Var = m0.f406844a;
        f257419w0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PasswordSettingFragment.class, "passwordInput", "getPasswordInput()Lcom/avito/android/password_tip/PasswordTipInput;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordSettingFragment.class, "scrollView", "getScrollView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordSettingFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var)};
        f257418v0 = new a(null);
    }

    public PasswordSettingFragment() {
        super(0, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f257423q0 = new O0(m0.f406844a.b(m.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f257424r0 = new C47313c(null, 1, null);
        this.f257425s0 = new C47313c(null, 1, null);
        this.f257426t0 = new C47313c(null, 1, null);
        this.f257427u0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1505) {
            r5(new InterfaceC48391a.b(i13 == -1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.password_setting_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.password_setting_scroll_view);
        C47313c c47313c = this.f257426t0;
        kotlin.reflect.n<Object>[] nVarArr = f257419w0;
        kotlin.reflect.n<Object> nVar = nVarArr[2];
        c47313c.b(this, viewFindViewById);
        PasswordTipInput passwordTipInput = (PasswordTipInput) view.findViewById(R.id.password_setting_input_tip_password);
        C47313c c47313c2 = this.f257425s0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, passwordTipInput);
        Button button = (Button) view.findViewById(R.id.password_setting_button_add);
        C47313c c47313c3 = this.f257424r0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        c47313c3.b(this, button);
        View viewFindViewById2 = view.findViewById(R.id.password_setting_nav_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c4 = this.f257427u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, (NavBar) viewFindViewById2);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257421o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (m) this.f257423q0.getValue(), new com.avito.android.safety.password_setting.b(1, this, PasswordSettingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingOneTimeEvent;)V", 0), new com.avito.android.safety.password_setting.c(1, this, PasswordSettingFragment.class, "renderState", "renderState(Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState;)V", 0));
        com.avito.android.lib.design.input.n.c(q5().f213951b, new com.avito.android.safety.password_setting.d(this));
        C43175k.K(new C43197r1(new com.avito.android.safety.password_setting.e(this, null), y.a(q5().getDoneCallbacks())), C22984Q.a(getViewLifecycleOwner()));
        kotlin.reflect.n<Object> nVar5 = nVarArr[0];
        ((Button) c47313c3.a()).setOnClickListener(new com.avito.android.review_gallery.g(this, 4));
        kotlin.reflect.n<Object> nVar6 = nVarArr[3];
        ((NavBar) c47313c4.a()).c(R.attr.ic_arrowBack24, new com.avito.android.safety.password_setting.f(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f257421o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.safety.password_setting.di.a.a().a((com.avito.android.safety.password_setting.di.c) C29972i.a(C29972i.b(this), com.avito.android.safety.password_setting.di.c.class), cv.c.b(this), requireActivity(), s.c(this), getResources(), bundle != null ? G.a(bundle, "presenter_state") : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257421o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f257421o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
    }

    public final PasswordTipInput q5() {
        C47313c c47313c = this.f257425s0;
        kotlin.reflect.n<Object> nVar = f257419w0[1];
        return (PasswordTipInput) c47313c.a();
    }

    public final void r5(InterfaceC48391a interfaceC48391a) {
        ((m) this.f257423q0.getValue()).accept(interfaceC48391a);
    }
}
