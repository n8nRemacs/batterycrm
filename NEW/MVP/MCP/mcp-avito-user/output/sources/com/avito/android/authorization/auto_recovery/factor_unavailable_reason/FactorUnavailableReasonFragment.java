package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonArguments;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.a;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
import dagger.internal.u;
import javax.inject.Inject;
import kotlin.C42727D;
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
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: FactorUnavailableReasonFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FactorUnavailableReasonFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f93079y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f93080z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f93081n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f93082o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93083p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93084q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93085r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93086s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93087t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93088u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93089v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93090w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f93091x0;

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonFragment$a;", "", "<init>", "()V", "", "ARGS_PHONE_UNAVAILABLE_REASON", "Ljava/lang/String;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/FactorUnavailableReasonArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<FactorUnavailableReasonArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final FactorUnavailableReasonArguments invoke() {
            Bundle arguments = FactorUnavailableReasonFragment.this.getArguments();
            if (arguments != null) {
                return (FactorUnavailableReasonArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("phone_unavailable_reason.args", FactorUnavailableReasonArguments.class) : arguments.getParcelable("phone_unavailable_reason.args"));
            }
            return null;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f93093l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f93093l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f93093l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return FactorUnavailableReasonFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f93095l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f93095l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f93095l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93096l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93096l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f93096l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93097l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f93097l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<l> {
        public h() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final l invoke() {
            u uVar = FactorUnavailableReasonFragment.this.f93081n0;
            if (uVar == null) {
                uVar = null;
            }
            return (l) uVar.get();
        }
    }

    static {
        Y y12 = new Y(FactorUnavailableReasonFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f93080z0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "contentRoot", "getContentRoot()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "radioFactorUnavailable", "getRadioFactorUnavailable()Lcom/avito/android/lib/design/list_item/ListItemRadio;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "radioMessageNotComing", "getRadioMessageNotComing()Lcom/avito/android/lib/design/list_item/ListItemRadio;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FactorUnavailableReasonFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f93079y0 = new a(null);
    }

    public FactorUnavailableReasonFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f93082o0 = new O0(m0.f406844a.b(l.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f93083p0 = new C47313c(null, 1, null);
        this.f93084q0 = new C47313c(null, 1, null);
        this.f93085r0 = new C47313c(null, 1, null);
        this.f93086s0 = new C47313c(null, 1, null);
        this.f93087t0 = new C47313c(null, 1, null);
        this.f93088u0 = new C47313c(null, 1, null);
        this.f93089v0 = new C47313c(null, 1, null);
        this.f93091x0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 0);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        int i12;
        ScreenPerformanceTracker screenPerformanceTracker = this.f93090w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        FactorUnavailableReasonArguments factorUnavailableReasonArguments = (FactorUnavailableReasonArguments) this.f93091x0.getValue();
        if (factorUnavailableReasonArguments instanceof FactorUnavailableReasonArguments.Email) {
            i12 = R.layout.unavailable_factor_reason_email_fragment;
        } else {
            if (!(factorUnavailableReasonArguments instanceof FactorUnavailableReasonArguments.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.layout.unavailable_factor_reason_phone_fragment;
        }
        return layoutInflater.inflate(i12, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.unavailable_factor_reason_nav_bar);
        navBar.c(R.attr.ic_arrowBack24, new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.h(this));
        C47313c c47313c = this.f93083p0;
        n<Object>[] nVarArr = f93080z0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        TextView textView = (TextView) view.findViewById(R.id.unavailable_factor_reason_title);
        C47313c c47313c2 = this.f93084q0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        View viewFindViewById = view.findViewById(R.id.unavailable_factor_reason_root);
        C47313c c47313c3 = this.f93085r0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, viewFindViewById);
        ListItemRadio listItemRadio = (ListItemRadio) view.findViewById(R.id.unavailable_factor_reason_factor_unavailable_radio);
        C47313c c47313c4 = this.f93086s0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, listItemRadio);
        ListItemRadio listItemRadio2 = (ListItemRadio) view.findViewById(R.id.unavailable_factor_reason_message_not_coming_radio);
        C47313c c47313c5 = this.f93087t0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, listItemRadio2);
        TextView textView2 = (TextView) view.findViewById(R.id.unavailable_factor_reason_error_text);
        C47313c c47313c6 = this.f93088u0;
        n<Object> nVar6 = nVarArr[5];
        c47313c6.b(this, textView2);
        Button button = (Button) view.findViewById(R.id.unavailable_factor_reason_button);
        C47313c c47313c7 = this.f93089v0;
        n<Object> nVar7 = nVarArr[6];
        c47313c7.b(this, button);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.g(this, null), 3);
        n<Object> nVar8 = nVarArr[3];
        ((ListItemRadio) c47313c4.a()).e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(0, this, FactorUnavailableReasonAction.Select.f93147b));
        n<Object> nVar9 = nVarArr[4];
        ((ListItemRadio) c47313c5.a()).e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(0, this, FactorUnavailableReasonAction.Select.f93148c));
        n<Object> nVar10 = nVarArr[6];
        ((Button) c47313c7.a()).setOnClickListener(new B(this, 21));
        ScreenPerformanceTracker screenPerformanceTracker = this.f93090w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.c();
        com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c cVar = (com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        FactorUnavailableReasonArguments factorUnavailableReasonArguments = (FactorUnavailableReasonArguments) this.f93091x0.getValue();
        factorUnavailableReasonArguments.getClass();
        a.b bVar = new a.b(new j(), cVar, interfaceC39417aB, rVarC, factorUnavailableReasonArguments, null);
        this.f93081n0 = bVar.f93103e;
        ScreenPerformanceTracker screenPerformanceTracker = bVar.f93106h.get();
        this.f93090w0 = screenPerformanceTracker;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final void q5(FactorUnavailableReasonAction factorUnavailableReasonAction) {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.f(this, factorUnavailableReasonAction, null), 3);
    }
}
