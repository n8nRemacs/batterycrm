package com.avito.android.user_address.list;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.list.di.b;
import com.avito.android.user_address.list.perf.UserAddressListScreen;
import com.avito.android.util.C35966w1;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: UserAddressListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/list/UserAddressListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAddressListFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c {

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final a f307300z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.list.i f307301n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f307302o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public j f307303p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f307304q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.list.e f307305r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f307306s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f307307t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f307308u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_address.a f307309v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public Toolbar f307310w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public com.avito.android.user_address.list.view.d f307311x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f307312y0;

    /* compiled from: UserAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/list/UserAddressListFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserAddressListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$List;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List invoke() {
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list;
            Bundle arguments = UserAddressListFragment.this.getArguments();
            if (arguments != null) {
                list = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("list_params_key", UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List.class) : arguments.getParcelable("list_params_key"));
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: UserAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXG0/a;", "it", "Lkotlin/G0;", "invoke", "(LXG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<XG0.a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(XG0.a aVar) {
            a aVar2 = UserAddressListFragment.f307300z0;
            ((com.avito.android.user_address.list.h) UserAddressListFragment.this.f307302o0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f307315l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f307315l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f307315l);
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
            return UserAddressListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f307317l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f307317l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f307317l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f307318l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f307318l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f307318l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f307319l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f307319l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f307319l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/user_address/list/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/user_address/list/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.user_address.list.h> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_address.list.h invoke() {
            com.avito.android.user_address.list.i iVar = UserAddressListFragment.this.f307301n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.user_address.list.h) iVar.get();
        }
    }

    public UserAddressListFragment() {
        super(R.layout.fragment_user_address_list);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f307302o0 = new O0(m0.f406844a.b(com.avito.android.user_address.list.h.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f307312y0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        ((com.avito.android.user_address.g) requireActivity()).q1();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f307307t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f307307t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        O0 o02 = this.f307302o0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, (com.avito.android.user_address.list.h) o02.getValue(), new com.avito.android.user_address.list.a(1, this, UserAddressListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviOneTimeEvent;)V", 0), new com.avito.android.user_address.list.b(this));
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f307310w0 = toolbar;
        o5(toolbar);
        C35966w1.c(this).w("");
        Toolbar toolbar2 = this.f307310w0;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 21));
        }
        com.avito.android.user_address.list.h hVar = (com.avito.android.user_address.list.h) o02.getValue();
        j jVar = this.f307303p0;
        j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f307304q0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.user_address.list.e eVar = this.f307305r0;
        com.avito.android.user_address.list.e eVar2 = eVar != null ? eVar : null;
        InterfaceC28373a interfaceC28373a = this.f307308u0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.user_address.a aVar3 = this.f307309v0;
        this.f307311x0 = new com.avito.android.user_address.list.view.d(view, hVar, jVar2, aVar2, eVar2, interfaceC28373a2, aVar3 != null ? aVar3 : null, this.f307310w0);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f307307t0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(UserAddressListScreen.f307424d, s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.user_address.list.di.a.a();
        com.avito.android.user_address.list.di.c cVar = (com.avito.android.user_address.list.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_address.list.di.c.class);
        Resources resources = getResources();
        UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List) this.f307312y0.getValue();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        com.avito.android.user_address.di.b bVar = ((UserAddressActivity) requireActivity()).f307104n;
        aVarA.a(resources, new c(), c28478k, list, cVar, interfaceC39417aB, bVar == null ? null : bVar).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f307307t0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
