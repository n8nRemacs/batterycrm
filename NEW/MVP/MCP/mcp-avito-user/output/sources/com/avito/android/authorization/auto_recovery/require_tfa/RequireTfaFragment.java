package com.avito.android.authorization.auto_recovery.require_tfa;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_confirmation.code_confirmation.Z;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import com.jakewharton.rxbinding4.view.C37722i;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kv.C43501a;
import l41.o;
import l41.r;
import qK0.C47313c;

/* compiled from: RequireTfaFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/require_tfa/RequireTfaFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RequireTfaFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f93297w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f93298x0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f93299n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93300o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f93301p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final C47313c f93302q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final C47313c f93303r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f93304s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47313c f93305t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f93306u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f93307v0;

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/require_tfa/RequireTfaFragment$a;", "", "<init>", "()V", "", "ARGS_REQUIRE_TFA", "Ljava/lang/String;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/authorization/auto_recovery/require_tfa/RequireTfaArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<RequireTfaArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final RequireTfaArguments invoke() {
            Bundle arguments = RequireTfaFragment.this.getArguments();
            if (arguments != null) {
                return (RequireTfaArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("require_tfa.args", RequireTfaArguments.class) : arguments.getParcelable("require_tfa.args"));
            }
            return null;
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            RequireTfaFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AutoRecoveryLink.Source source;
            RequireTfaFragment requireTfaFragment = RequireTfaFragment.this;
            com.avito.android.deeplink_handler.handler.composite.a aVar = requireTfaFragment.f93299n0;
            if (aVar == null) {
                aVar = null;
            }
            int i12 = Z.a.f119484a[((RequireTfaArguments) requireTfaFragment.f93301p0.getValue()).f93296b.ordinal()];
            if (i12 == 1) {
                source = AutoRecoveryLink.Source.f133907d;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                source = AutoRecoveryLink.Source.f133906c;
            }
            b.a.a(aVar, new AutoRecoveryLink(source.f133910b, AutoRecoveryLink.Scenario.f133901e, false, 4, null), null, null, 6);
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f93311b = new e<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof AutoRecoveryLink.Result;
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "apply", "(Lkv/a;)Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f93312b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (AutoRecoveryLink.Result) ((C43501a) obj).f413261b;
        }
    }

    /* compiled from: RequireTfaFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/auth/AutoRecoveryLink$Result;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AutoRecoveryLink.Result result = (AutoRecoveryLink.Result) obj;
            boolean z12 = result instanceof AutoRecoveryLink.Result.a;
            RequireTfaFragment requireTfaFragment = RequireTfaFragment.this;
            if (!z12) {
                if (result instanceof AutoRecoveryLink.Result.Success) {
                    if (((AutoRecoveryLink.Result.Success) result).f133892b != AutoRecoveryLink.Result.Success.ResultAction.f133895d) {
                        requireTfaFragment.requireActivity().finish();
                        return;
                    }
                    return;
                }
                return;
            }
            a aVar = RequireTfaFragment.f93297w0;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            C47313c c47313c = requireTfaFragment.f93304s0;
            n<Object> nVar = RequireTfaFragment.f93298x0[2];
            View view = (View) c47313c.a();
            PrintableText printableTextF = com.avito.android.printable_text.b.f(((AutoRecoveryLink.Result.a) result).f133898b);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
        }
    }

    static {
        Y y12 = new Y(RequireTfaFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f93298x0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(RequireTfaFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RequireTfaFragment.class, "contentRoot", "getContentRoot()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RequireTfaFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RequireTfaFragment.class, "loader", "getLoader()Lcom/avito/android/lib/design/spinner/overlay/SpinnerOverlay;", 0, n0Var)};
        f93297w0 = new a(null);
    }

    public RequireTfaFragment() {
        super(R.layout.require_tfa_fragment);
        this.f93301p0 = C42727D.c(new b());
        this.f93302q0 = new C47313c(null, 1, null);
        this.f93303r0 = new C47313c(null, 1, null);
        this.f93304s0 = new C47313c(null, 1, null);
        this.f93305t0 = new C47313c(null, 1, null);
        this.f93306u0 = new C47313c(null, 1, null);
        this.f93307v0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 1);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f93300o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f93307v0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerOverlay spinnerOverlay = (SpinnerOverlay) view.findViewById(R.id.require_tfa_progress);
        C47313c c47313c = this.f93306u0;
        n<Object>[] nVarArr = f93298x0;
        n<Object> nVar = nVarArr[4];
        c47313c.b(this, spinnerOverlay);
        TextView textView = (TextView) view.findViewById(R.id.require_tfa_title);
        C47313c c47313c2 = this.f93303r0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        View viewFindViewById = view.findViewById(R.id.require_tfa_content);
        C47313c c47313c3 = this.f93304s0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, viewFindViewById);
        Button button = (Button) view.findViewById(R.id.require_tfa_button);
        C47313c c47313c4 = this.f93305t0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, button);
        NavBar navBar = (NavBar) view.findViewById(R.id.require_tfa_nav_bar);
        navBar.c(R.attr.ic_close24, new c());
        C47313c c47313c5 = this.f93302q0;
        n<Object> nVar5 = nVarArr[0];
        c47313c5.b(this, navBar);
        n<Object> nVar6 = nVarArr[3];
        io.reactivex.rxjava3.disposables.d dVarT0 = C37722i.a((Button) c47313c4.a()).t0(new d());
        io.reactivex.rxjava3.disposables.c cVar = this.f93307v0;
        cVar.b(dVarT0);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f93299n0;
        if (aVar == null) {
            aVar = null;
        }
        cVar.b(aVar.d9().N(e.f93311b).d0(f.f93312b).t0(new g()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f93300o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.authorization.auto_recovery.require_tfa.di.a.a().a((com.avito.android.authorization.auto_recovery.require_tfa.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.auto_recovery.require_tfa.di.c.class), cv.c.b(this), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93300o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
