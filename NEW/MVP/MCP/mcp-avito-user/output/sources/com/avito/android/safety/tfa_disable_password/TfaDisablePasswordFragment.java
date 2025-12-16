package com.avito.android.safety.tfa_disable_password;

import Cd.C13243a;
import Zd.InterfaceC19542a;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.C22984Q;
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
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import com.avito.android.safety.tfa_disable_password.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import dagger.internal.u;
import java.io.Serializable;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import wo0.InterfaceC49659a;
import z1.AbstractC50339a;

/* compiled from: TfaDisablePasswordFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/TfaDisablePasswordFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TfaDisablePasswordFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f258071x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f258072y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f258073n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f258074o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f258075p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f258076q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258077r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258078s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258079t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258080u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258081v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f258082w0;

    /* compiled from: TfaDisablePasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/TfaDisablePasswordFragment$a;", "", "<init>", "()V", "", "IS_SUCCESS_ARG", "Ljava/lang/String;", "REQUEST_KEY", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f258083l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f258083l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f258083l);
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
            return TfaDisablePasswordFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f258085l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f258085l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f258085l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258086l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f258086l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f258087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f258087l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f258087l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TfaDisablePasswordFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safety/tfa_disable_password/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<m> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final m invoke() {
            u uVar = TfaDisablePasswordFragment.this.f258073n0;
            if (uVar == null) {
                uVar = null;
            }
            return (m) uVar.get();
        }
    }

    static {
        Y y12 = new Y(TfaDisablePasswordFragment.class, "confirmButton", "getConfirmButton()Lcom/avito/android/lib/design/button/Button;", 0);
        n0 n0Var = m0.f406844a;
        f258072y0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TfaDisablePasswordFragment.class, "passwordInput", "getPasswordInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TfaDisablePasswordFragment.class, "passwordCc", "getPasswordCc()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TfaDisablePasswordFragment.class, "scrollView", "getScrollView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TfaDisablePasswordFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TfaDisablePasswordFragment.class, "forgotPasswordAction", "getForgotPasswordAction()Landroid/widget/TextView;", 0, n0Var)};
        f258071x0 = new a(null);
    }

    public TfaDisablePasswordFragment() {
        super(0, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f258076q0 = new O0(m0.f406844a.b(m.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f258077r0 = new C47313c(null, 1, null);
        this.f258078s0 = new C47313c(null, 1, null);
        this.f258079t0 = new C47313c(null, 1, null);
        this.f258080u0 = new C47313c(null, 1, null);
        this.f258081v0 = new C47313c(null, 1, null);
        this.f258082w0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.tfa_disable_password_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tfa_disable_pw_scroll);
        C47313c c47313c = this.f258080u0;
        kotlin.reflect.n<Object>[] nVarArr = f258072y0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        c47313c.b(this, viewFindViewById);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.tfa_disable_pw_cc);
        C47313c c47313c2 = this.f258079t0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, componentContainer);
        Input input = (Input) view.findViewById(R.id.tfa_disable_pw_input);
        input.setInputType(144);
        C47313c c47313c3 = this.f258078s0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, input);
        Button button = (Button) view.findViewById(R.id.tfa_disable_pw_confirm_button);
        C47313c c47313c4 = this.f258077r0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[0];
        c47313c4.b(this, button);
        View viewFindViewById2 = view.findViewById(R.id.tfa_disable_pw_nav_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c5 = this.f258081v0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, (NavBar) viewFindViewById2);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258074o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (m) this.f258076q0.getValue(), new com.avito.android.safety.tfa_disable_password.g(1, this, TfaDisablePasswordFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordOneTimeEvent;)V", 0), new h(1, this, TfaDisablePasswordFragment.class, "renderState", "renderState(Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordState;)V", 0));
        com.avito.android.lib.design.input.n.c(q5(), new i(this));
        C43175k.K(new C43197r1(new j(this, null), y.a(com.avito.android.lib.design.input.n.a(q5(), 6))), C22984Q.a(getViewLifecycleOwner()));
        final int i12 = 0;
        q5().setRightIconListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.tfa_disable_password.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TfaDisablePasswordFragment f258102c;

            {
                this.f258102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TfaDisablePasswordFragment tfaDisablePasswordFragment = this.f258102c;
                switch (i12) {
                    case 0:
                        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.d.f441783a);
                        break;
                    case 1:
                        TfaDisablePasswordFragment.a aVar2 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.b.f441781a);
                        break;
                    default:
                        TfaDisablePasswordFragment.a aVar3 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.c.f441782a);
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar6 = nVarArr[0];
        final int i13 = 1;
        ((Button) c47313c4.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.tfa_disable_password.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TfaDisablePasswordFragment f258102c;

            {
                this.f258102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TfaDisablePasswordFragment tfaDisablePasswordFragment = this.f258102c;
                switch (i13) {
                    case 0:
                        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.d.f441783a);
                        break;
                    case 1:
                        TfaDisablePasswordFragment.a aVar2 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.b.f441781a);
                        break;
                    default:
                        TfaDisablePasswordFragment.a aVar3 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.c.f441782a);
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar7 = nVarArr[4];
        ((NavBar) c47313c5.a()).c(R.attr.ic_arrowBack24, new k(this));
        kotlin.reflect.n<Object> nVar8 = nVarArr[4];
        com.avito.android.lib.design.text_view.a aVarB = ((NavBar) c47313c5.a()).b(com.avito.android.printable_text.b.c(R.string.safety_settings_tfa_disable_pw_toolbar_action, new Serializable[0]));
        Resources resources = aVarB.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        aVarB.setTextColor(resources.getColor(R.color.gray54, null));
        final int i14 = 2;
        aVarB.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.tfa_disable_password.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TfaDisablePasswordFragment f258102c;

            {
                this.f258102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TfaDisablePasswordFragment tfaDisablePasswordFragment = this.f258102c;
                switch (i14) {
                    case 0:
                        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.d.f441783a);
                        break;
                    case 1:
                        TfaDisablePasswordFragment.a aVar2 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.b.f441781a);
                        break;
                    default:
                        TfaDisablePasswordFragment.a aVar3 = TfaDisablePasswordFragment.f258071x0;
                        tfaDisablePasswordFragment.r5(InterfaceC49659a.c.f441782a);
                        break;
                }
            }
        });
        C47313c c47313c6 = this.f258082w0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[5];
        c47313c6.b(this, aVarB);
        kotlin.reflect.n<Object> nVar10 = nVarArr[4];
        NavBar navBar = (NavBar) c47313c5.a();
        kotlin.reflect.n<Object> nVar11 = nVarArr[5];
        navBar.setActions((TextView) c47313c6.a());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258074o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c((com.avito.android.safety.tfa_disable_password.c) C29972i.a(C29972i.b(this), com.avito.android.safety.tfa_disable_password.c.class), s.c(this), this, Boolean.valueOf(bundle != null), null);
        this.f258073n0 = cVar.f258096h;
        this.f258074o0 = cVar.f258095g.get();
        this.f258075p0 = cVar.f258089a.x();
        ScreenPerformanceTracker screenPerformanceTracker = this.f258074o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f258074o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
    }

    public final Input q5() {
        C47313c c47313c = this.f258078s0;
        kotlin.reflect.n<Object> nVar = f258072y0[1];
        return (Input) c47313c.a();
    }

    public final void r5(InterfaceC49659a interfaceC49659a) {
        ((m) this.f258076q0.getValue()).accept(interfaceC49659a);
    }

    public final void s5(boolean z12) {
        C47313c c47313c = this.f258080u0;
        kotlin.reflect.n<Object> nVar = f258072y0[3];
        K2.d((View) c47313c.a(), true);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SafetYSettingsTfaDisSucArg", z12);
        G0 g02 = G0.f406611a;
        parentFragmentManager.o0(bundle, "SafetySettingsTfaDisReqKey");
        H hE2 = getParentFragmentManager().e();
        hE2.m(this);
        hE2.e();
    }
}
