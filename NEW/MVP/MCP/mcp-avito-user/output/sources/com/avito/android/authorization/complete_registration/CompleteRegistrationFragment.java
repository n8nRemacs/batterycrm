package com.avito.android.authorization.complete_registration;

import Cd.C13243a;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C22960s;
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
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.PlaceholderType;
import com.avito.android.authorization.auth.InterfaceC28641u;
import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.jakewharton.rxbinding4.view.C37722i;
import ee.InterfaceC40093a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import z1.AbstractC50339a;

/* compiled from: CompleteRegistrationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/complete_registration/CompleteRegistrationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/deep_linking/links/w;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CompleteRegistrationFragment extends BaseFragment implements InterfaceC28477j.b, w {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f93381E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f93382F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93383A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93384B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93385C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93386D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public Zd.p f93387n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93388o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public r f93389p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f93390q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93391r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f93392s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28641u f93393t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f93394u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93395v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93396w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93397x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93398y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93399z0;

    /* compiled from: CompleteRegistrationFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/authorization/complete_registration/CompleteRegistrationFragment$a;", "", "<init>", "()V", "", "KEY_HASH", "Ljava/lang/String;", "KEY_LOGIN", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CompleteRegistrationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InputType inputType = InputType.f93479b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CompleteRegistrationFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            ParsingPermissionFragment.f93867D0.getClass();
            InterfaceC40093a.C11094a c11094a = new InterfaceC40093a.C11094a(ParsingPermissionFragment.a.a(bundle2), ParsingPermissionFragment.a.b(bundle2));
            a aVar = CompleteRegistrationFragment.f93381E0;
            CompleteRegistrationFragment.this.s5(c11094a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f93401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f93401l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f93401l);
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
            return CompleteRegistrationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f93403l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f93403l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f93403l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93404l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93404l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f93404l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93405l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f93405l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CompleteRegistrationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/authorization/complete_registration/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/authorization/complete_registration/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<q> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = CompleteRegistrationFragment.this.f93389p0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    static {
        Y y12 = new Y(CompleteRegistrationFragment.class, "contentView", "getContentView()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f93382F0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "scrollView", "getScrollView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "nameInputContainer", "getNameInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "nameInput", "getNameInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "passwordInput", "getPasswordInput()Lcom/avito/android/password_tip/PasswordTipInput;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "registerButton", "getRegisterButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CompleteRegistrationFragment.class, "agreementView", "getAgreementView()Landroid/widget/TextView;", 0, n0Var)};
        f93381E0 = new a(null);
    }

    public CompleteRegistrationFragment() {
        super(R.layout.complete_registration_fragment);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f93394u0 = new O0(m0.f406844a.b(q.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f93395v0 = new C47313c(null, 1, null);
        this.f93396w0 = new C47313c(null, 1, null);
        this.f93397x0 = new C47313c(null, 1, null);
        this.f93398y0 = new C47313c(null, 1, null);
        this.f93399z0 = new C47313c(null, 1, null);
        this.f93383A0 = new C47313c(null, 1, null);
        this.f93384B0 = new C47313c(null, 1, null);
        this.f93385C0 = new C47313c(null, 1, null);
        this.f93386D0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f93392s0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "fragment_result_key", new c());
        if (bundle != null) {
            s5(InterfaceC40093a.d.f395266a);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.complete_registration_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C47313c c47313c = this.f93395v0;
        kotlin.reflect.n<Object>[] nVarArr = f93382F0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.complete_registration_scroll_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C47313c c47313c2 = this.f93396w0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.complete_registration_nav_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c3 = this.f93397x0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, (NavBar) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.complete_registration_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c4 = this.f93385C0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[7];
        c47313c4.b(this, (TextView) viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.complete_registration_name_input_cc);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        C47313c c47313c5 = this.f93398y0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c5.b(this, (ComponentContainer) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(R.id.complete_registration_name_input);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        C47313c c47313c6 = this.f93399z0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c6.b(this, (Input) viewFindViewById6);
        View viewFindViewById7 = view.findViewById(R.id.complete_registration_password_tip_input);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.password_tip.PasswordTipInput");
        }
        C47313c c47313c7 = this.f93383A0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, (PasswordTipInput) viewFindViewById7);
        View viewFindViewById8 = view.findViewById(R.id.complete_registration_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c8 = this.f93384B0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c8.b(this, (Button) viewFindViewById8);
        View viewFindViewById9 = view.findViewById(R.id.complete_registration_user_agreement);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById9;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Zd.p pVar = this.f93387n0;
        if (pVar == null) {
            pVar = null;
        }
        AttributedText attributedTextA = pVar.a(textView.getResources(), PlaceholderType.f92739c);
        attributedTextA.setOnDeepLinkClickListener(this);
        com.avito.android.util.text.j.c(textView, attributedTextA, null);
        C47313c c47313c9 = this.f93386D0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, textView);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93388o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (q) this.f93394u0.getValue(), new com.avito.android.authorization.complete_registration.d(1, this, CompleteRegistrationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationOneTimeEvent;)V", 0), new com.avito.android.authorization.complete_registration.e(1, this, CompleteRegistrationFragment.class, "renderState", "renderState(Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationState;)V", 0));
        com.avito.android.lib.design.input.n.c(q5(), new com.avito.android.authorization.complete_registration.g(this));
        C43175k.K(new C43197r1(new com.avito.android.authorization.complete_registration.h(this, null), y.a(com.avito.android.lib.design.input.n.a(q5(), 5))), C22984Q.a(getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new com.avito.android.authorization.complete_registration.i(this, null), new com.avito.android.authorization.complete_registration.f(y.a(C37722i.c(q5())))), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.lib.design.input.n.c(r5().f213951b, new j(this));
        C43175k.K(new C43197r1(new k(this, null), y.a(r5().getDoneCallbacks())), C22984Q.a(getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new l(this, null), y.a(r5().getOnFocused())), C22984Q.a(getViewLifecycleOwner()));
        kotlin.reflect.n<Object> nVar10 = nVarArr[6];
        C43175k.K(new C43197r1(new m(this, null), y.a(C37722i.a((Button) c47313c8.a()))), C22984Q.a(getViewLifecycleOwner()));
        kotlin.reflect.n<Object> nVar11 = nVarArr[2];
        ((NavBar) c47313c3.a()).c(R.attr.ic_arrowBack24, new n(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f93388o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("complete_reg.login");
        com.avito.android.authorization.complete_registration.di.e.a().a((com.avito.android.authorization.complete_registration.di.b) C29972i.a(C29972i.b(this), com.avito.android.authorization.complete_registration.di.b.class), this, requireActivity(), com.avito.android.analytics.screens.s.c(this), getResources(), string, requireArguments().getString("complete_reg.hash"), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93388o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f93388o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f93391r0;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new he.g(string));
        }
    }

    public final Input q5() {
        C47313c c47313c = this.f93399z0;
        kotlin.reflect.n<Object> nVar = f93382F0[4];
        return (Input) c47313c.a();
    }

    public final PasswordTipInput r5() {
        C47313c c47313c = this.f93383A0;
        kotlin.reflect.n<Object> nVar = f93382F0[5];
        return (PasswordTipInput) c47313c.a();
    }

    public final void s5(InterfaceC40093a interfaceC40093a) {
        ((q) this.f93394u0.getValue()).accept(interfaceC40093a);
    }

    public final boolean t5(InputType inputType) {
        int iOrdinal = inputType.ordinal();
        if (iOrdinal == 0) {
            final int i12 = 0;
            return q5().post(new Runnable(this) { // from class: com.avito.android.authorization.complete_registration.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ CompleteRegistrationFragment f93408c;

                {
                    this.f93408c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CompleteRegistrationFragment completeRegistrationFragment = this.f93408c;
                    switch (i12) {
                        case 0:
                            CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
                            completeRegistrationFragment.q5().v();
                            completeRegistrationFragment.q5().q();
                            break;
                        default:
                            CompleteRegistrationFragment.a aVar2 = CompleteRegistrationFragment.f93381E0;
                            completeRegistrationFragment.r5().e();
                            break;
                    }
                }
            });
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        final int i13 = 1;
        return r5().post(new Runnable(this) { // from class: com.avito.android.authorization.complete_registration.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CompleteRegistrationFragment f93408c;

            {
                this.f93408c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CompleteRegistrationFragment completeRegistrationFragment = this.f93408c;
                switch (i13) {
                    case 0:
                        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
                        completeRegistrationFragment.q5().v();
                        completeRegistrationFragment.q5().q();
                        break;
                    default:
                        CompleteRegistrationFragment.a aVar2 = CompleteRegistrationFragment.f93381E0;
                        completeRegistrationFragment.r5().e();
                        break;
                }
            }
        });
    }
}
