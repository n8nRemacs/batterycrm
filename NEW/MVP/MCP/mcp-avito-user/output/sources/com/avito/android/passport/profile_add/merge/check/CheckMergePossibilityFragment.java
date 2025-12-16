package com.avito.android.passport.profile_add.merge.check;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
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
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.passport.profile_add.merge.check.j;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.R0;
import d60.InterfaceC39512a;
import dagger.internal.t;
import dagger.internal.u;
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
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: CheckMergePossibilityFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/CheckMergePossibilityFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CheckMergePossibilityFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f212597x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f212598y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f212599n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f212600o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f212601p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public R0 f212602q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212603r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f212604s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47313c f212605t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f212606u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f212607v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f212608w0;

    /* compiled from: CheckMergePossibilityFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/CheckMergePossibilityFragment$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        public final /* synthetic */ Y41.a f212609l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f212609l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212609l);
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
            return CheckMergePossibilityFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f212611l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f212611l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212611l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212612l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212612l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212612l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212613l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212613l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212613l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CheckMergePossibilityFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/check/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.passport.profile_add.merge.check.f> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final com.avito.android.passport.profile_add.merge.check.f invoke() {
            u uVar = CheckMergePossibilityFragment.this.f212599n0;
            if (uVar == null) {
                uVar = null;
            }
            return (com.avito.android.passport.profile_add.merge.check.f) uVar.get();
        }
    }

    static {
        Y y12 = new Y(CheckMergePossibilityFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f212598y0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CheckMergePossibilityFragment.class, "errorTitle", "getErrorTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CheckMergePossibilityFragment.class, "errorMessage", "getErrorMessage()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CheckMergePossibilityFragment.class, "spinner", "getSpinner()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CheckMergePossibilityFragment.class, "retryButton", "getRetryButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f212597x0 = new a(null);
    }

    public CheckMergePossibilityFragment() {
        super(R.layout.passport_merge_accounts_check_fragment);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f212600o0 = new O0(m0.f406844a.b(com.avito.android.passport.profile_add.merge.check.f.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f212604s0 = new C47313c(null, 1, null);
        this.f212605t0 = new C47313c(null, 1, null);
        this.f212606u0 = new C47313c(null, 1, null);
        this.f212607v0 = new C47313c(null, 1, null);
        this.f212608w0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212603r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.nav_bar);
        navBar.c(R.attr.ic_close24, new com.avito.android.passport.profile_add.merge.check.d(this));
        C47313c c47313c = this.f212604s0;
        n<Object>[] nVarArr = f212598y0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        TextView textView = (TextView) view.findViewById(R.id.passport_merge_check_title);
        C47313c c47313c2 = this.f212605t0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_merge_check_message);
        C47313c c47313c3 = this.f212606u0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, textView2);
        Spinner spinner = (Spinner) view.findViewById(R.id.passport_merge_check_spinner);
        C47313c c47313c4 = this.f212607v0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, spinner);
        Button button = (Button) view.findViewById(R.id.passport_merge_check_retry_button);
        C47313c c47313c5 = this.f212608w0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, button);
        n<Object> nVar6 = nVarArr[4];
        ((Button) c47313c5.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 9));
        C22977J c22977jA = C22984Q.a(getViewLifecycleOwner());
        R0 r02 = this.f212602q0;
        if (r02 == null) {
            r02 = null;
        }
        C43259k.d(c22977jA, r02.b(), null, new com.avito.android.passport.profile_add.merge.check.b(this, null), 2);
        C22977J c22977jA2 = C22984Q.a(getViewLifecycleOwner());
        R0 r03 = this.f212602q0;
        if (r03 == null) {
            r03 = null;
        }
        C43259k.d(c22977jA2, r03.b(), null, new com.avito.android.passport.profile_add.merge.check.c(this, null), 2);
        ScreenPerformanceTracker screenPerformanceTracker = this.f212603r0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new j.c();
        j.b bVar = new j.b((InterfaceC39512a) C29972i.a(C29972i.b(this), InterfaceC39512a.class), cv.c.b(this), s.c(this), null);
        this.f212599n0 = bVar.f212641n;
        com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.f212628a.u4();
        t.c(aVarU4);
        this.f212601p0 = aVarU4;
        R0 r0C = bVar.f212629b.c();
        t.c(r0C);
        this.f212602q0 = r0C;
        ScreenPerformanceTracker screenPerformanceTracker = bVar.f212640m.get();
        this.f212603r0 = screenPerformanceTracker;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
