package com.avito.android.passport.profile_add.merge.code_confirm;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import b60.InterfaceC25416a;
import c60.InterfaceC26947a;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import com.avito.android.passport.profile_add.merge.code_confirm.o;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import d60.InterfaceC39512a;
import dagger.internal.t;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: CodeConfirmFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/CodeConfirmFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CodeConfirmFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f212682G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f212683H0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212684A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212685B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212686C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212687D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212688E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public String f212689F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public R0 f212690n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f212691o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.server_time.a f212692p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212693q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public u f212694r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f212695s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212696t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212697u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212698v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212699w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212700x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212701y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212702z0;

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/CodeConfirmFragment$a;", "", "<init>", "()V", "", "ARGS_CODE_CONFIRM", "Ljava/lang/String;", "", "NBSP", "C", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CodeConfirmFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$a$a, reason: collision with other inner class name */
        public static final class C6360a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CodeConfirmArgs f212703l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6360a(CodeConfirmArgs codeConfirmArgs) {
                super(1);
                this.f212703l = codeConfirmArgs;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("passport.add_profile.merge.confirm_ownership.confirm_code.args", this.f212703l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CodeConfirmFragment a(@Y61.k CodeConfirmArgs codeConfirmArgs) {
            CodeConfirmFragment codeConfirmFragment = new CodeConfirmFragment();
            C35966w1.a(codeConfirmFragment, -1, new C6360a(codeConfirmArgs));
            return codeConfirmFragment;
        }

        public a() {
        }
    }

    /* compiled from: CodeConfirmFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/merge/code_confirm/CodeConfirmArgs;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<CodeConfirmArgs> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final CodeConfirmArgs invoke() {
            Bundle bundleRequireArguments = CodeConfirmFragment.this.requireArguments();
            return (CodeConfirmArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.merge.confirm_ownership.confirm_code.args", CodeConfirmArgs.class) : bundleRequireArguments.getParcelable("passport.add_profile.merge.confirm_ownership.confirm_code.args"));
        }
    }

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return CodeConfirmFragment.this.getString(R.string.passport_accounts_merge_check_ownership_code_confirm_new_code);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212706l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f212706l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212706l);
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
            return CodeConfirmFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f212708l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f212708l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212708l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212709l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212709l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212709l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212710l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212710l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/p;", "invoke", "()Lcom/avito/android/passport/profile_add/merge/code_confirm/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<p> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            return new p((String) CodeConfirmFragment.this.f212697u0.getValue(), null, null, 6, null);
        }
    }

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/code_confirm/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<m> {
        public j() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final m invoke() {
            u uVar = CodeConfirmFragment.this.f212694r0;
            if (uVar == null) {
                uVar = null;
            }
            return (m) uVar.get();
        }
    }

    static {
        Y y12 = new Y(CodeConfirmFragment.class, "root", "getRoot()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f212683H0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "codeInput", "getCodeInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "codeInputContainer", "getCodeInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "confirmButton", "getConfirmButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "requestCodeButton", "getRequestCodeButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "tickingWrapper", "getTickingWrapper()Lcom/avito/android/lib/design/ticking_button/TickingButtonWrapper;", 0, n0Var)};
        f212682G0 = new a(null);
    }

    public CodeConfirmFragment() {
        super(R.layout.passport_merge_accounts_confirm_code_fragment);
        d dVar = new d(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f212695s0 = new O0(m0.f406844a.b(m.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f212696t0 = C42727D.c(new b());
        this.f212697u0 = C42727D.c(new c());
        this.f212698v0 = C42727D.c(new i());
        this.f212699w0 = new C47313c(null, 1, null);
        this.f212700x0 = new C47313c(null, 1, null);
        this.f212701y0 = new C47313c(null, 1, null);
        this.f212702z0 = new C47313c(null, 1, null);
        this.f212684A0 = new C47313c(null, 1, null);
        this.f212685B0 = new C47313c(null, 1, null);
        this.f212686C0 = new C47313c(null, 1, null);
        this.f212687D0 = new C47313c(null, 1, null);
        this.f212688E0 = new C47313c(new C31685o(8));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212693q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.passport_confirm_ownership_confirm_code_content);
        C47313c c47313c = this.f212699w0;
        kotlin.reflect.n<Object>[] nVarArr = f212683H0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        NavBar navBar = (NavBar) view.findViewById(R.id.nav_bar);
        navBar.c(R.attr.ic_arrowBack24, new com.avito.android.passport.profile_add.merge.code_confirm.g(this));
        C47313c c47313c2 = this.f212700x0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, navBar);
        Input input = (Input) view.findViewById(R.id.passport_confirm_ownership_confirm_code_input);
        C47313c c47313c3 = this.f212701y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, input);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.passport_confirm_ownership_confirm_code_cc);
        C47313c c47313c4 = this.f212702z0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, componentContainer);
        Button button = (Button) view.findViewById(R.id.passport_confirm_ownership_confirm_code);
        C47313c c47313c5 = this.f212684A0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, button);
        Button button2 = (Button) view.findViewById(R.id.passport_confirm_ownership_confirm_code_request_code);
        C47313c c47313c6 = this.f212687D0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[7];
        c47313c6.b(this, button2);
        TextView textView = (TextView) view.findViewById(R.id.passport_confirm_ownership_confirm_code_title);
        C47313c c47313c7 = this.f212685B0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_confirm_ownership_confirm_code_subtitle);
        C47313c c47313c8 = this.f212686C0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c8.b(this, textView2);
        com.avito.android.lib.design.ticking_button.b bVar = new com.avito.android.lib.design.ticking_button.b(t5(), getString(R.string.passport_accounts_merge_check_ownership_code_confirm_get_new_code), (p) this.f212698v0.getValue(), null);
        C47313c c47313c9 = this.f212688E0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, bVar);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.passport.profile_add.merge.code_confirm.h(this, null), 3);
        C22977J c22977jA = C22984Q.a(getViewLifecycleOwner());
        R0 r02 = this.f212690n0;
        if (r02 == null) {
            r02 = null;
        }
        C43259k.d(c22977jA, r02.b(), null, new com.avito.android.passport.profile_add.merge.code_confirm.c(this, null), 2);
        C22977J c22977jA2 = C22984Q.a(getViewLifecycleOwner());
        R0 r03 = this.f212690n0;
        if (r03 == null) {
            r03 = null;
        }
        C43259k.d(c22977jA2, r03.b(), null, new com.avito.android.passport.profile_add.merge.code_confirm.d(this, null), 2);
        com.avito.android.lib.design.input.n.c(r5(), new com.avito.android.passport.profile_add.merge.code_confirm.e(this));
        final int i12 = 0;
        s5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.code_confirm.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CodeConfirmFragment f212714c;

            {
                this.f212714c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CodeConfirmFragment codeConfirmFragment = this.f212714c;
                switch (i12) {
                    case 0:
                        CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                        codeConfirmFragment.u5().accept(new InterfaceC25416a.b(codeConfirmFragment.q5().f212680b, codeConfirmFragment.r5().getDeformattedText()));
                        break;
                    default:
                        CodeConfirmFragment.a aVar2 = CodeConfirmFragment.f212682G0;
                        codeConfirmFragment.u5().accept(new InterfaceC26947a.d(codeConfirmFragment.q5().f212680b));
                        break;
                }
            }
        });
        final int i13 = 1;
        t5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.passport.profile_add.merge.code_confirm.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CodeConfirmFragment f212714c;

            {
                this.f212714c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CodeConfirmFragment codeConfirmFragment = this.f212714c;
                switch (i13) {
                    case 0:
                        CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                        codeConfirmFragment.u5().accept(new InterfaceC25416a.b(codeConfirmFragment.q5().f212680b, codeConfirmFragment.r5().getDeformattedText()));
                        break;
                    default:
                        CodeConfirmFragment.a aVar2 = CodeConfirmFragment.f212682G0;
                        codeConfirmFragment.u5().accept(new InterfaceC26947a.d(codeConfirmFragment.q5().f212680b));
                        break;
                }
            }
        });
        C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.merge.code_confirm.f(this, null), y.a(com.avito.android.lib.design.input.n.a(r5(), 6))), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f212693q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new o.c();
        InterfaceC39512a interfaceC39512a = (InterfaceC39512a) C29972i.a(C29972i.b(this), InterfaceC39512a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        CodeConfirmArgs codeConfirmArgsQ5 = q5();
        r rVarC = s.c(this);
        codeConfirmArgsQ5.getClass();
        o.b bVar = new o.b(interfaceC39512a, interfaceC39417aB, codeConfirmArgsQ5, rVarC, null);
        InterfaceC39512a interfaceC39512a2 = bVar.f212778a;
        R0 r0C = interfaceC39512a2.c();
        t.c(r0C);
        this.f212690n0 = r0C;
        com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.f212779b.u4();
        t.c(aVarU4);
        this.f212691o0 = aVarU4;
        com.avito.android.server_time.a aVarT = interfaceC39512a2.T();
        t.c(aVarT);
        this.f212692p0 = aVarT;
        ScreenPerformanceTracker screenPerformanceTracker = bVar.f212782e.get();
        this.f212693q0 = screenPerformanceTracker;
        this.f212694r0 = bVar.f212797t;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final CodeConfirmArgs q5() {
        return (CodeConfirmArgs) this.f212696t0.getValue();
    }

    public final Input r5() {
        C47313c c47313c = this.f212701y0;
        kotlin.reflect.n<Object> nVar = f212683H0[2];
        return (Input) c47313c.a();
    }

    public final Button s5() {
        C47313c c47313c = this.f212684A0;
        kotlin.reflect.n<Object> nVar = f212683H0[4];
        return (Button) c47313c.a();
    }

    public final Button t5() {
        C47313c c47313c = this.f212687D0;
        kotlin.reflect.n<Object> nVar = f212683H0[7];
        return (Button) c47313c.a();
    }

    public final m u5() {
        return (m) this.f212695s0.getValue();
    }

    public final void v5(ApiError apiError, String str, Throwable th2) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        C47313c c47313c = this.f212699w0;
        kotlin.reflect.n<Object> nVar = f212683H0[0];
        View view = (View) c47313c.a();
        PrintableText printableTextF = str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.passport_common_error, new Serializable[0]);
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.a(apiError, th2), 0, toastBarPosition, null, false, false, null, null, 4014);
    }
}
