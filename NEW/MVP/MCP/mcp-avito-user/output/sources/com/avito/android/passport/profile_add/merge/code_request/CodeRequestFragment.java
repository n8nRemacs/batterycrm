package com.avito.android.passport.profile_add.merge.code_request;

import Cd.C13243a;
import Oa1.B;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
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
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.profile_add.merge.code_request.p;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import d60.InterfaceC39512a;
import dagger.internal.t;
import dagger.internal.u;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: CodeRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/CodeRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CodeRequestFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f212821B0;

    /* renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f212822C0;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f212823A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f212824n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f212825o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212826p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public r60.d f212827q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f212828r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212829s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212830t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212831u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212832v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212833w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212834x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212835y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212836z0;

    /* compiled from: CodeRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/CodeRequestFragment$a;", "", "<init>", "()V", "", "EXTRA_BACK_ICON", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CodeRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$a$a, reason: collision with other inner class name */
        public static final class C6366a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f212837l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6366a(boolean z12) {
                super(1);
                this.f212837l = z12;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putBoolean("passport.add_profile.merge.back_icon", this.f212837l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CodeRequestFragment a(boolean z12) {
            CodeRequestFragment codeRequestFragment = new CodeRequestFragment();
            C35966w1.a(codeRequestFragment, -1, new C6366a(z12));
            return codeRequestFragment;
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212838l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f212838l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212838l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CodeRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f212840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f212840l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212840l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212841l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212841l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212842l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212842l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CodeRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/code_request/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<n> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final n invoke() {
            u uVar = CodeRequestFragment.this.f212824n0;
            if (uVar == null) {
                uVar = null;
            }
            return (n) uVar.get();
        }
    }

    static {
        Y y12 = new Y(CodeRequestFragment.class, "root", "getRoot()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f212822C0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "phoneInput", "getPhoneInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "phoneInputContainer", "getPhoneInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "requestCodeButton", "getRequestCodeButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "phoneHint", "getPhoneHint()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeRequestFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay2/ProgressOverlay;", 0, n0Var)};
        f212821B0 = new a(null);
    }

    public CodeRequestFragment() {
        super(R.layout.passport_merge_accounts_request_code_fragment);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f212828r0 = new O0(m0.f406844a.b(n.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f212829s0 = new C47313c(null, 1, null);
        this.f212830t0 = new C47313c(null, 1, null);
        this.f212831u0 = new C47313c(null, 1, null);
        this.f212832v0 = new C47313c(null, 1, null);
        this.f212833w0 = new C47313c(null, 1, null);
        this.f212834x0 = new C47313c(null, 1, null);
        this.f212835y0 = new C47313c(null, 1, null);
        this.f212836z0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212826p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.passport_confirm_ownership_request_code_nav_bar);
        navBar.c(this.f212823A0 ? R.attr.ic_arrowBack24 : R.attr.ic_close24, new i(this));
        C47313c c47313c = this.f212830t0;
        kotlin.reflect.n<Object>[] nVarArr = f212822C0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, navBar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.passport_request_ownership_screen_root);
        C47313c c47313c2 = this.f212829s0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, viewGroup);
        C42670a c42670a = new C42670a((ViewGroup) view.findViewById(R.id.passport_confirm_ownership_request_code_progress_container), new j(view), 0, 4, null);
        C47313c c47313c3 = this.f212836z0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[7];
        c47313c3.b(this, c42670a);
        TextView textView = (TextView) view.findViewById(R.id.passport_confirm_ownership_request_code_title);
        C47313c c47313c4 = this.f212831u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, textView);
        Input input = (Input) view.findViewById(R.id.passport_confirm_ownership_request_code_input);
        C47313c c47313c5 = this.f212832v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c5.b(this, input);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.passport_confirm_ownership_request_code_input_cc);
        C47313c c47313c6 = this.f212833w0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c6.b(this, componentContainer);
        Button button = (Button) view.findViewById(R.id.passport_confirm_ownership_request_code_button);
        C47313c c47313c7 = this.f212834x0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, button);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_confirm_ownership_request_code_legal);
        C47313c c47313c8 = this.f212835y0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c8.b(this, textView2);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.passport.profile_add.merge.code_request.b(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.passport.profile_add.merge.code_request.c(this, null), 3);
        com.avito.android.util.concurrent.b.f318855a.post(new B(4, new h(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f212826p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new p.c();
        p.b bVar = new p.b((InterfaceC39512a) C29972i.a(C29972i.b(this), InterfaceC39512a.class), cv.c.b(this), s.c(this), null);
        this.f212824n0 = bVar.f212910n;
        InterfaceC39512a interfaceC39512a = bVar.f212897a;
        InterfaceC28373a interfaceC28373aA = interfaceC39512a.a();
        t.c(interfaceC28373aA);
        this.f212825o0 = interfaceC28373aA;
        this.f212826p0 = bVar.f212909m.get();
        this.f212827q0 = interfaceC39512a.X1();
        this.f212823A0 = requireArguments().getBoolean("passport.add_profile.merge.back_icon");
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f212825o0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            r60.d dVar = this.f212827q0;
            if (dVar == null) {
                dVar = null;
            }
            interfaceC28373a.c(new H50.g(dVar.getHash()));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f212826p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final Input q5() {
        C47313c c47313c = this.f212832v0;
        kotlin.reflect.n<Object> nVar = f212822C0[3];
        return (Input) c47313c.a();
    }

    public final n r5() {
        return (n) this.f212828r0.getValue();
    }
}
