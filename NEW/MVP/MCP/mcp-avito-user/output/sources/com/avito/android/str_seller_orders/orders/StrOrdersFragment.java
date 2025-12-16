package com.avito.android.str_seller_orders.orders;

import Cd.C13243a;
import Y41.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersIntentFactory;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kz0.C43520a;
import mz0.C44158c;
import mz0.InterfaceC44156a;
import mz0.InterfaceC44157b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrOrdersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/StrOrdersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f288822t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f288823u0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.orders.c f288824n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f288825o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f288826p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C43520a f288827q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f288828r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f288829s0;

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/StrOrdersFragment$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static StrOrdersFragment a(@Y61.k StrSellerOrdersIntentFactory.InitialTab initialTab, @Y61.k Map map) {
            StrOrdersFragment strOrdersFragment = new StrOrdersFragment();
            StrOrdersOpenParams strOrdersOpenParams = new StrOrdersOpenParams(initialTab, map);
            strOrdersFragment.f288829s0.setValue(strOrdersFragment, StrOrdersFragment.f288823u0[1], strOrdersOpenParams);
            return strOrdersFragment;
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC44157b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44157b interfaceC44157b) {
            ActivityC22955m activityC22955mL1;
            StrOrdersFragment strOrdersFragment = (StrOrdersFragment) this.receiver;
            a aVar = StrOrdersFragment.f288822t0;
            strOrdersFragment.getClass();
            if ((interfaceC44157b instanceof InterfaceC44157b.a) && (activityC22955mL1 = strOrdersFragment.l1()) != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<C44158c, G0> {
        @Override // Y41.l
        public final G0 invoke(C44158c c44158c) {
            C47313c c47313c = ((StrOrdersFragment) this.receiver).f288828r0;
            n<Object> nVar = StrOrdersFragment.f288823u0[0];
            ((com.avito.android.str_seller_orders.orders.e) c47313c.a()).a(c44158c);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersFragment.f288822t0;
            ((com.avito.android.str_seller_orders.orders.b) StrOrdersFragment.this.f288825o0.getValue()).accept(InterfaceC44156a.C11850a.f414836a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<Integer, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = StrOrdersFragment.f288822t0;
            ((com.avito.android.str_seller_orders.orders.b) StrOrdersFragment.this.f288825o0.getValue()).accept(new InterfaceC44156a.b(Integer.valueOf(iIntValue)));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f288832l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f288832l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f288832l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrOrdersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f288834l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f288834l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f288834l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288835l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288835l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f288835l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288836l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288836l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f288836l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/orders/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.str_seller_orders.orders.b> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.orders.b invoke() {
            com.avito.android.str_seller_orders.orders.c cVar = StrOrdersFragment.this.f288824n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.str_seller_orders.orders.b) cVar.get();
        }
    }

    static {
        Y y12 = new Y(StrOrdersFragment.class, "strOrdersView", "getStrOrdersView()Lcom/avito/android/str_seller_orders/orders/StrOrdersView;", 0);
        n0 n0Var = m0.f406844a;
        f288823u0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StrOrdersFragment.class, "openParams", "getOpenParams()Lcom/avito/android/str_seller_orders/orders/StrOrdersOpenParams;", 0, n0Var)};
        f288822t0 = new a(null);
    }

    public StrOrdersFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f288825o0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.orders.b.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f288828r0 = new C47313c(null, 1, null);
        this.f288829s0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f288826p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f288826p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.str_seller_orders.orders.b) this.f288825o0.getValue(), new b(1, this, StrOrdersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersOneTimeEvent;)V", 0), new c(1, this, StrOrdersFragment.class, "handleState", "handleState(Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersState;)V", 0));
        return layoutInflater.inflate(R.layout.str_orders_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43520a c43520a = this.f288827q0;
        if (c43520a == null) {
            c43520a = null;
        }
        com.avito.android.str_seller_orders.orders.f fVar = new com.avito.android.str_seller_orders.orders.f(view, c43520a, new d(), new e());
        C47313c c47313c = this.f288828r0;
        n<Object> nVar = f288823u0[0];
        c47313c.b(this, fVar);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders.orders.di.a.a().a((cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), s.c(this), this, (StrOrdersOpenParams) this.f288829s0.getValue(this, f288823u0[1])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f288826p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
