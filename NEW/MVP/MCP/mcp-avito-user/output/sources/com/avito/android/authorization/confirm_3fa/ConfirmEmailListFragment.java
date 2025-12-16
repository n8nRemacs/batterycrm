package com.avito.android.authorization.confirm_3fa;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.authorization.confirm_3fa.p;
import com.avito.android.authorization.event.ConfirmEmailListOpenedEvent;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.ui.fragments.BaseFragment;
import dagger.internal.t;
import dagger.internal.u;
import ge.InterfaceC40665a;
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
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ConfirmEmailListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/ConfirmEmailListFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/BaseFragment;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConfirmEmailListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f93538A0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f93539z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f93540n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public RecyclerView.l f93541o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public u f93542p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f93543q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f93544r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93545s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93546t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93547u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93548v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93549w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f93550x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f93551y0;

    /* compiled from: ConfirmEmailListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/ConfirmEmailListFragment$a;", "", "<init>", "()V", "", "ARGS_EMAIL_LIST", "Ljava/lang/String;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConfirmEmailListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ConfirmEmailListFragment.f93539z0;
            ConfirmEmailListFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmEmailListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge/a;", "it", "Lkotlin/G0;", "invoke", "(Lge/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC40665a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40665a interfaceC40665a) {
            ((n) ConfirmEmailListFragment.this.f93551y0.getValue()).accept(interfaceC40665a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f93554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f93554l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f93554l);
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
            return ConfirmEmailListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f93556l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f93556l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f93556l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93557l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f93557l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f93558l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f93558l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f93558l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ConfirmEmailListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/authorization/confirm_3fa/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<n> {
        public i() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final n invoke() {
            u uVar = ConfirmEmailListFragment.this.f93542p0;
            if (uVar == null) {
                uVar = null;
            }
            return (n) uVar.get();
        }
    }

    static {
        Y y12 = new Y(ConfirmEmailListFragment.class, "scroll", "getScroll()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f93538A0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConfirmEmailListFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConfirmEmailListFragment.class, "progress", "getProgress()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConfirmEmailListFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var)};
        f93539z0 = new a(null);
    }

    public ConfirmEmailListFragment() {
        super(R.layout.confirm_email_list_fragment);
        this.f93547u0 = new C47313c(null, 1, null);
        this.f93548v0 = new C47313c(null, 1, null);
        this.f93549w0 = new C47313c(null, 1, null);
        this.f93550x0 = new C47313c(null, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f93551y0 = new O0(m0.f406844a.b(n.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f93545s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.confirm_email_list_recycler);
        com.avito.konveyor.adapter.d dVar = this.f93540n0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        C47313c c47313c = this.f93548v0;
        kotlin.reflect.n<Object>[] nVarArr = f93538A0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, recyclerView);
        View viewFindViewById = view.findViewById(R.id.confirm_email_list_progress);
        C47313c c47313c2 = this.f93549w0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, viewFindViewById);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.authorization.confirm_3fa.d(this, null), 3);
        View viewFindViewById2 = view.findViewById(R.id.confirm_email_list_scroll);
        C47313c c47313c3 = this.f93547u0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        c47313c3.b(this, viewFindViewById2);
        NavBar navBar = (NavBar) view.findViewById(R.id.confirm_email_list_nav_bar);
        navBar.c(R.attr.ic_close24, new b());
        C47313c c47313c4 = this.f93550x0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, navBar);
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47313c.a();
        RecyclerView.l lVar = this.f93541o0;
        if (lVar == null) {
            lVar = null;
        }
        recyclerView2.l(lVar, -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93545s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ConfirmEmailList confirmEmailList;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        Object[] objArr = 0;
        if (arguments != null) {
            confirmEmailList = (ConfirmEmailList) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("ConfirmEmailListFragment.emailList", ConfirmEmailList.class) : arguments.getParcelable("ConfirmEmailListFragment.emailList"));
        } else {
            confirmEmailList = null;
        }
        if (confirmEmailList == null) {
            throw new IllegalArgumentException("Email list must not be null for ConfirmEmailListFragment");
        }
        new p.c();
        p.b bVar = new p.b(new com.avito.android.authorization.confirm_3fa.h(), (com.avito.android.authorization.confirm_3fa.b) C29972i.a(C29972i.b(this), com.avito.android.authorization.confirm_3fa.b.class), cv.c.b(this), s.c(this), requireActivity(), confirmEmailList, new c(), null);
        this.f93540n0 = bVar.f93633g.get();
        this.f93541o0 = bVar.f93634h.get();
        this.f93542p0 = bVar.f93644r;
        this.f93543q0 = bVar.f93647u.get();
        com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.f93627a.u4();
        t.c(aVarU4);
        this.f93544r0 = aVarU4;
        this.f93545s0 = bVar.f93642p.get();
        InterfaceC28373a interfaceC28373aA = bVar.f93628b.a();
        t.c(interfaceC28373aA);
        this.f93546t0 = interfaceC28373aA;
        ScreenPerformanceTracker screenPerformanceTracker = this.f93545s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f93546t0;
            InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
            ConfirmEmailListOpenedEvent.Source[] sourceArr = ConfirmEmailListOpenedEvent.Source.f93853b;
            interfaceC28373a2.c(new ConfirmEmailListOpenedEvent());
        }
    }
}
