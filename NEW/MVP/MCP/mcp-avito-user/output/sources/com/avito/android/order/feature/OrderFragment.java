package com.avito.android.order.feature;

import Cd.C13243a;
import P40.a;
import P40.b;
import P40.c;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.TabBaseFragment;
import gj.m;
import gj.o;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: OrderFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/order/feature/OrderFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrderFragment extends TabBaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f209481G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f209482H0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f209483A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f209484B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47312b f209485C0;

    /* renamed from: D0, reason: collision with root package name */
    public l f209486D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public ProgressDialog f209487E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public String f209488F0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.order.feature.h f209489t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f209490u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public gj.n f209491v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public AbstractC25658a<? extends RecyclerView.C> f209492w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f209493x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209494y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209495z0;

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/order/feature/OrderFragment$a;", "", "<init>", "()V", "", "KEY_ORDER_ID", "Ljava/lang/String;", "KEY_SEGMENT", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static OrderFragment a(@Y61.k String str, @Y61.k OrderScreenSegment orderScreenSegment) {
            OrderFragment orderFragment = new OrderFragment();
            orderFragment.setArguments(C22777e.b(new Q("key_order_id", str), new Q("key_segment", orderScreenSegment)));
            return orderFragment;
        }

        public a() {
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<P40.b, G0> {
        @Override // Y41.l
        public final G0 invoke(P40.b bVar) {
            P40.b bVar2 = bVar;
            OrderFragment orderFragment = (OrderFragment) this.receiver;
            a aVar = OrderFragment.f209481G0;
            orderFragment.getClass();
            if (bVar2 instanceof b.a) {
                ApiError apiError = ((b.a) bVar2).f12818a;
                com.avito.android.component.toast.b.c(orderFragment, apiError.getF244063c(), null, new f.c(apiError), 382);
            } else if (bVar2 instanceof b.C0830b) {
                f.c.f125255c.getClass();
                com.avito.android.component.toast.b.c(orderFragment, ((b.C0830b) bVar2).f12819a, null, f.c.a.b(), 382);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<P40.c, G0> {
        @Override // Y41.l
        public final G0 invoke(P40.c cVar) {
            P40.c cVar2 = cVar;
            OrderFragment orderFragment = (OrderFragment) this.receiver;
            a aVar = OrderFragment.f209481G0;
            C47313c c47313c = orderFragment.f209483A0;
            n<Object> nVar = OrderFragment.f209482H0[0];
            ((Toolbar) c47313c.a()).setTitle(cVar2.f12820b);
            c.a aVar2 = cVar2.f12823e;
            if (aVar2 instanceof c.a.C0831a) {
                c.a.C0831a c0831a = (c.a.C0831a) aVar2;
                orderFragment.f209488F0 = c0831a.f12825a;
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a = orderFragment.f209492w0;
                if (abstractC25658a == null) {
                    abstractC25658a = null;
                }
                abstractC25658a.m(c0831a.f12826b);
                if (c0831a.f12827c) {
                    orderFragment.f209487E0 = ProgressDialog.show(orderFragment.l1(), null, orderFragment.getString(R.string.order_wait), true, false);
                } else {
                    ProgressDialog progressDialog = orderFragment.f209487E0;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    orderFragment.f209487E0 = null;
                }
                l lVar = orderFragment.f209486D0;
                (lVar != null ? lVar : null).j();
            } else if (aVar2 instanceof c.a.b) {
                ApiError apiError = ((c.a.b) aVar2).f12828a;
                l lVar2 = orderFragment.f209486D0;
                (lVar2 != null ? lVar2 : null).a(z.k(apiError));
            } else if (L.f(aVar2, c.a.C0832c.f12829a)) {
                l lVar3 = orderFragment.f209486D0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.k(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = OrderFragment.this.requireArguments().getString("key_order_id");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Order id required parameter");
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/order/OrderScreenSegment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<OrderScreenSegment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final OrderScreenSegment invoke() {
            Parcelable parcelable = OrderFragment.this.requireArguments().getParcelable("key_segment");
            OrderScreenSegment orderScreenSegment = parcelable instanceof OrderScreenSegment ? (OrderScreenSegment) parcelable : null;
            return orderScreenSegment == null ? new OrderScreenSegment(null) : orderScreenSegment;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f209498l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f209498l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f209498l);
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
            return OrderFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f209500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f209500l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f209500l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209501l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209501l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f209501l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f209502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f209502l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f209502l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: OrderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/order/feature/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/order/feature/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.order.feature.g> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.order.feature.g invoke() {
            com.avito.android.order.feature.h hVar = OrderFragment.this.f209489t0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.order.feature.g) hVar.get();
        }
    }

    static {
        Y y12 = new Y(OrderFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f209482H0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(OrderFragment.class, "rootView", "getRootView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(OrderFragment.class, "mainRecyclerView", "getMainRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f209481G0 = new a(null);
    }

    public OrderFragment() {
        super(R.layout.order_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f209490u0 = new O0(m0.f406844a.b(com.avito.android.order.feature.g.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f209494y0 = C42727D.c(new d());
        this.f209495z0 = C42727D.c(new e());
        this.f209483A0 = new C47313c(null, 1, null);
        this.f209484B0 = new C47313c(null, 1, null);
        this.f209485C0 = new C47312b(null, 1, null);
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        if (!str.equals(this.f209488F0)) {
            return null;
        }
        n<Object> nVar = f209482H0[2];
        return (RecyclerView) this.f209485C0.a();
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final o c1() {
        C47313c c47313c = this.f209484B0;
        n<Object>[] nVarArr = f209482H0;
        n<Object> nVar = nVarArr[1];
        o.a aVar = new o.a((View) c47313c.a(), ToastBarPosition.f181047e);
        C47313c c47313c2 = this.f209483A0;
        n<Object> nVar2 = nVarArr[0];
        return new o(aVar, new o.a((Toolbar) c47313c2.a(), ToastBarPosition.f181045c));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f209488F0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f209493x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        ((com.avito.android.order.feature.g) this.f209490u0.getValue()).accept(a.c.f12817a);
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((com.avito.android.order.feature.g) this.f209490u0.getValue()).accept(a.b.f12816a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.order_fragment_root);
        C47313c c47313c = this.f209484B0;
        n<Object>[] nVarArr = f209482H0;
        n<Object> nVar = nVarArr[1];
        c47313c.b(this, viewFindViewById);
        gj.n nVar2 = this.f209491v0;
        if (nVar2 == null) {
            nVar2 = null;
        }
        gj.k kVarA = m.a(nVar2, this);
        O0 o02 = this.f209490u0;
        ((com.avito.android.beduin.view.c) kVarA).l(((com.avito.android.order.feature.g) o02.getValue()).f209589N);
        View viewFindViewById2 = view.findViewById(R.id.beduin_main_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        n<Object> nVar3 = nVarArr[2];
        C47312b c47312b = this.f209485C0;
        c47312b.b(this, (RecyclerView) viewFindViewById2);
        n<Object> nVar4 = nVarArr[2];
        RecyclerView recyclerView = (RecyclerView) c47312b.a();
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f209492w0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, abstractC25658a);
        ScreenPerformanceTracker screenPerformanceTracker = this.f209493x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        n<Object> nVar5 = nVarArr[2];
        screenPerformanceTracker.b((RecyclerView) c47312b.a());
        View viewFindViewById3 = view.findViewById(R.id.beduin_toolbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        C47313c c47313c2 = this.f209483A0;
        n<Object> nVar6 = nVarArr[0];
        c47313c2.b(this, (Toolbar) viewFindViewById3);
        n<Object> nVar7 = nVarArr[0];
        Toolbar toolbar = (Toolbar) c47313c2.a();
        toolbar.setTitle((CharSequence) null);
        toolbar.setNavigationOnClickListener(new com.avito.android.order.feature.c(this, 0));
        View viewFindViewById4 = view.findViewById(R.id.beduin_overlay_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        l lVar = new l((ViewGroup) viewFindViewById4, R.id.beduin_main_list, null, 0, 0, 28, null);
        this.f209486D0 = lVar;
        lVar.f231600j = new com.avito.android.order.feature.d(this);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f209493x0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.order.feature.g) o02.getValue(), new b(1, this, OrderFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/order/feature/mvi/entity/OrderOneTimeEvent;)V", 0), new c(1, this, OrderFragment.class, "render", "render(Lcom/avito/android/order/feature/mvi/entity/OrderState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f209493x0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.order.feature.di.a.a().a((String) this.f209494y0.getValue(), new C28478k(OrderScreen.f209504d, s.c(this), null, 4, null), (com.avito.android.order.feature.di.c) C29972i.a(C29972i.b(this), com.avito.android.order.feature.di.c.class), cv.c.b(this), (OrderScreenSegment) this.f209495z0.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f209493x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f209493x0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
