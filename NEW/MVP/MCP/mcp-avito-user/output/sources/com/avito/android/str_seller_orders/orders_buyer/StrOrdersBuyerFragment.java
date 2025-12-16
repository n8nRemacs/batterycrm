package com.avito.android.str_seller_orders.orders_buyer;

import Cd.C13243a;
import Gz0.C13936a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
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
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
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
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import pz0.C47173d;
import pz0.InterfaceC47170a;
import pz0.InterfaceC47172c;
import pz0.e;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrOrdersBuyerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/StrOrdersBuyerFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersBuyerFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.orders_buyer.c f288905n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f288906o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f288907p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f288908q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f288909r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f288910s0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f288904u0 = {m0.f406844a.e(new Y(StrOrdersBuyerFragment.class, "strOrdersView", "getStrOrdersView()Lcom/avito/android/str_seller_orders/orders_buyer/StrOrdersBuyerViewImpl;", 0))};

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f288903t0 = new a(null);

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/StrOrdersBuyerFragment$a;", "", "<init>", "()V", "", "ARG_HIDE_TOOLBAR_KEY", "Ljava/lang/String;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC47172c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47172c interfaceC47172c) {
            ActivityC22955m activityC22955mL1;
            InterfaceC47172c interfaceC47172c2 = interfaceC47172c;
            StrOrdersBuyerFragment strOrdersBuyerFragment = (StrOrdersBuyerFragment) this.receiver;
            a aVar = StrOrdersBuyerFragment.f288903t0;
            strOrdersBuyerFragment.getClass();
            if (interfaceC47172c2 instanceof InterfaceC47172c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strOrdersBuyerFragment.f288909r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC47172c.b) interfaceC47172c2).f428929a, null, null, 6);
            } else if ((interfaceC47172c2 instanceof InterfaceC47172c.a) && (activityC22955mL1 = strOrdersBuyerFragment.l1()) != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C47173d, G0> {
        @Override // Y41.l
        public final G0 invoke(C47173d c47173d) {
            C47173d c47173d2 = c47173d;
            C47313c c47313c = ((StrOrdersBuyerFragment) this.receiver).f288910s0;
            n<Object> nVar = StrOrdersBuyerFragment.f288904u0[0];
            com.avito.android.str_seller_orders.orders_buyer.g gVar = (com.avito.android.str_seller_orders.orders_buyer.g) c47313c.a();
            SwipeRefreshLayout swipeRefreshLayout = gVar.f288995e;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            pz0.e eVar = c47173d2.f428933c;
            boolean z12 = eVar instanceof e.c;
            LinearLayout linearLayout = gVar.f288997g;
            LinearLayout linearLayout2 = gVar.f288998h;
            RecyclerView recyclerView = gVar.f288996f;
            if (z12) {
                C13936a.f6902a.getClass();
                C13936a.a(recyclerView, linearLayout2);
                C13936a.b(linearLayout);
            } else if (eVar instanceof e.a) {
                C13936a.f6902a.getClass();
                C13936a.a(linearLayout, linearLayout2);
                C13936a.b(recyclerView);
                gVar.f288991a.l(((e.a) eVar).f428934a, null);
            } else if (eVar instanceof e.b) {
                e.b bVar = (e.b) eVar;
                C13936a.f6902a.getClass();
                C13936a.a(linearLayout, recyclerView);
                C13936a.b(linearLayout2);
                com.avito.android.printable_text.a.c(gVar.f288999i, bVar.f428935a);
                com.avito.android.printable_text.a.c(gVar.f289000j, bVar.f428936b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersBuyerFragment.f288903t0;
            StrOrdersBuyerFragment.this.q5().accept(InterfaceC47170a.f.f428924a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersBuyerFragment.f288903t0;
            StrOrdersBuyerFragment.this.q5().accept(InterfaceC47170a.c.f428921a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StrOrdersBuyerFragment.f288903t0;
            StrOrdersBuyerFragment.this.q5().accept(InterfaceC47170a.C12299a.f428919a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpz0/a;", "action", "Lkotlin/G0;", "invoke", "(Lpz0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC47170a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC47170a interfaceC47170a) {
            a aVar = StrOrdersBuyerFragment.f288903t0;
            StrOrdersBuyerFragment.this.q5().accept(interfaceC47170a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f288915l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f288915l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f288915l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrOrdersBuyerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f288917l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f288917l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f288917l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288918l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288918l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f288918l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288919l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288919l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f288919l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrOrdersBuyerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/orders_buyer/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.str_seller_orders.orders_buyer.b> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.orders_buyer.b invoke() {
            com.avito.android.str_seller_orders.orders_buyer.c cVar = StrOrdersBuyerFragment.this.f288905n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.str_seller_orders.orders_buyer.b) cVar.get();
        }
    }

    public StrOrdersBuyerFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f288906o0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.orders_buyer.b.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f288910s0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f288907p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f288907p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, StrOrdersBuyerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerOneTimeEvent;)V", 0), new c(1, this, StrOrdersBuyerFragment.class, "handleState", "handleState(Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerState;)V", 0));
        return layoutInflater.inflate(R.layout.str_orders_buyer_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f288908q0;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.str_seller_orders.orders_buyer.g gVar = new com.avito.android.str_seller_orders.orders_buyer.g(view, dVar, requireArguments().getBoolean("arg_hide_toolbar_key"), new d(), new e(), new f());
        C47313c c47313c = this.f288910s0;
        n<Object> nVar = f288904u0[0];
        c47313c.b(this, gVar);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders.orders_buyer.di.a.a().a((cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), s.c(this), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f288907p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders.orders_buyer.b q5() {
        return (com.avito.android.str_seller_orders.orders_buyer.b) this.f288906o0.getValue();
    }
}
