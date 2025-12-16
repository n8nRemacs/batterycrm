package com.avito.android.authorization.auto_recovery.recovery_availability;

import Y41.l;
import Y61.k;
import Zd.InterfaceC19542a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.ui.fragments.BaseFragment;
import com.jakewharton.rxbinding4.view.C37722i;
import j.e0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: RecoveryAvailabilityFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/recovery_availability/RecoveryAvailabilityFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecoveryAvailabilityFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f93270y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f93271z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f93272n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f93273o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93274p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93275q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final h<G0> f93276r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f93277s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f93278t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f93279u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f93280v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f93281w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47313c f93282x0;

    /* compiled from: RecoveryAvailabilityFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/recovery_availability/RecoveryAvailabilityFragment$a;", "", "<init>", "()V", "", "ARGS_RECOVERY_AVAILABILITY", "Ljava/lang/String;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecoveryAvailabilityFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/authorization/auto_recovery/recovery_availability/RecoveryAvailabilityArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<RecoveryAvailabilityArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final RecoveryAvailabilityArguments invoke() {
            Bundle arguments = RecoveryAvailabilityFragment.this.getArguments();
            if (arguments != null) {
                return (RecoveryAvailabilityArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("recovery_availability.args", RecoveryAvailabilityArguments.class) : arguments.getParcelable("recovery_availability.args"));
            }
            return null;
        }
    }

    /* compiled from: RecoveryAvailabilityFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Integer, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            num.intValue();
            RecoveryAvailabilityFragment recoveryAvailabilityFragment = RecoveryAvailabilityFragment.this;
            a aVar = RecoveryAvailabilityFragment.f93270y0;
            ActivityC22955m activityC22955mRequireActivity = recoveryAvailabilityFragment.requireActivity();
            activityC22955mRequireActivity.setResult(-1);
            activityC22955mRequireActivity.finish();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(RecoveryAvailabilityFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f93271z0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(RecoveryAvailabilityFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RecoveryAvailabilityFragment.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(RecoveryAvailabilityFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f93270y0 = new a(null);
    }

    public RecoveryAvailabilityFragment() {
        super(R.layout.recovery_availability_fragment);
        this.f93276r0 = registerForActivityResult(new com.avito.android.authorization.auto_recovery.recovery_availability.a(this, new c()), new C28629h(0));
        this.f93277s0 = C42727D.c(new b());
        this.f93278t0 = new io.reactivex.rxjava3.disposables.c();
        this.f93279u0 = new C47313c(null, 1, null);
        this.f93280v0 = new C47313c(null, 1, null);
        this.f93281w0 = new C47313c(null, 1, null);
        this.f93282x0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f93274p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f93278t0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.recovery_availability_title);
        C47313c c47313c = this.f93280v0;
        n<Object>[] nVarArr = f93271z0;
        n<Object> nVar = nVarArr[1];
        c47313c.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.recovery_availability_subtitle);
        C47313c c47313c2 = this.f93281w0;
        n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, textView2);
        Button button = (Button) view.findViewById(R.id.recovery_availability_button);
        C47313c c47313c3 = this.f93282x0;
        n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, button);
        NavBar navBar = (NavBar) view.findViewById(R.id.recovery_availability_nav_bar);
        navBar.c(R.attr.ic_close24, new com.avito.android.authorization.auto_recovery.recovery_availability.c(this));
        C47313c c47313c4 = this.f93279u0;
        n<Object> nVar4 = nVarArr[0];
        c47313c4.b(this, navBar);
        boolean z12 = ((RecoveryAvailabilityArguments) this.f93277s0.getValue()).f93269b;
        io.reactivex.rxjava3.disposables.c cVar = this.f93278t0;
        if (z12) {
            q5(R.string.recovery_availability_start_title, R.string.recovery_availability_start_subtitle, R.string.recovery_availability_start_action);
            d dVar = new d(0, this, RecoveryAvailabilityFragment.class, "openHelpCenter", "openHelpCenter()V", 0);
            n<Object> nVar5 = nVarArr[3];
            cVar.b(C37722i.a((Button) c47313c3.a()).t0(new f(dVar)));
        } else {
            q5(R.string.recovery_availability_refusal_title, R.string.recovery_availability_refusal_subtitle, R.string.recovery_availability_refusal_action);
            e eVar = new e(0, this, RecoveryAvailabilityFragment.class, "openAuth", "openAuth()V", 0);
            n<Object> nVar6 = nVarArr[3];
            cVar.b(C37722i.a((Button) c47313c3.a()).t0(new f(eVar)));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f93274p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.authorization.auto_recovery.recovery_availability.di.a.a().a((com.avito.android.authorization.auto_recovery.recovery_availability.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.auto_recovery.recovery_availability.di.c.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93274p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final void q5(@e0 int i12, @e0 int i13, @e0 int i14) {
        C47313c c47313c = this.f93280v0;
        n<Object>[] nVarArr = f93271z0;
        n<Object> nVar = nVarArr[1];
        ((TextView) c47313c.a()).setText(getText(i12));
        C47313c c47313c2 = this.f93281w0;
        n<Object> nVar2 = nVarArr[2];
        ((TextView) c47313c2.a()).setText(getText(i13));
        C47313c c47313c3 = this.f93282x0;
        n<Object> nVar3 = nVarArr[3];
        ((Button) c47313c3.a()).setText(i14);
    }
}
