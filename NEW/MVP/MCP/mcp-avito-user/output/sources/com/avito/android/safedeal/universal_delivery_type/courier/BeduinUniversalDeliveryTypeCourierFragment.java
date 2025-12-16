package com.avito.android.safedeal.universal_delivery_type.courier;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.courier.di.a;
import com.avito.android.safedeal.universal_delivery_type.di.j;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import gj.m;
import gj.o;
import javax.inject.Inject;
import kj.InterfaceC42698a;
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
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/BeduinUniversalDeliveryTypeCourierFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeduinUniversalDeliveryTypeCourierFragment extends BaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: D0, reason: collision with root package name */
    @k
    public static final a f256442D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f256443E0;

    /* renamed from: A0, reason: collision with root package name */
    @k
    public final C47313c f256444A0;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public String f256445B0;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public String f256446C0;

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final Object f256447n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.universal_delivery_type.courier.h f256448o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final O0 f256449p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public gj.n f256450q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final Object f256451r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f256452s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.universal_delivery_type.l f256453t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f256454u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f256455v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f256456w0;

    /* renamed from: x0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f256457x0;

    /* renamed from: y0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f256458y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final C47313c f256459z0;

    /* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/BeduinUniversalDeliveryTypeCourierFragment$a;", "", "<init>", "()V", "", "INITIAL_CONTENT_EXTRA", "Ljava/lang/String;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.k> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment = BeduinUniversalDeliveryTypeCourierFragment.this;
            gj.n nVar = beduinUniversalDeliveryTypeCourierFragment.f256450q0;
            if (nVar == null) {
                nVar = null;
            }
            return m.a(nVar, beduinUniversalDeliveryTypeCourierFragment);
        }
    }

    /* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Courier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<UniversalDeliveryTypeContent.Tab.Courier> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalDeliveryTypeContent.Tab.Courier invoke() {
            Bundle arguments = BeduinUniversalDeliveryTypeCourierFragment.this.getArguments();
            if (arguments != null) {
                UniversalDeliveryTypeContent.Tab.Courier courier = (UniversalDeliveryTypeContent.Tab.Courier) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("initial_content_extra", UniversalDeliveryTypeContent.Tab.Courier.class) : arguments.getParcelable("initial_content_extra"));
                if (courier != null) {
                    return courier;
                }
            }
            throw new IllegalStateException("Need initial content extra argument");
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f256462l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256462l);
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
            return BeduinUniversalDeliveryTypeCourierFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f256464l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f256464l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256464l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256465l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256465l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256465l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256466l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256466l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256466l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/universal_delivery_type/courier/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.safedeal.universal_delivery_type.courier.g> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.safedeal.universal_delivery_type.courier.g invoke() {
            com.avito.android.safedeal.universal_delivery_type.courier.h hVar = BeduinUniversalDeliveryTypeCourierFragment.this.f256448o0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.safedeal.universal_delivery_type.courier.g) hVar.get();
        }
    }

    static {
        Y y12 = new Y(BeduinUniversalDeliveryTypeCourierFragment.class, "content", "getContent()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f256443E0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BeduinUniversalDeliveryTypeCourierFragment.class, "progressView", "getProgressView()Landroid/widget/ProgressBar;", 0, n0Var)};
        f256442D0 = new a(null);
    }

    public BeduinUniversalDeliveryTypeCourierFragment() {
        super(R.layout.fragment_universal_delivery_type_courier);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f256447n0 = C42727D.b(lazyThreadSafetyMode, new c());
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new f(new e()));
        this.f256449p0 = new O0(m0.f406844a.b(com.avito.android.safedeal.universal_delivery_type.courier.g.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f256451r0 = C42727D.b(lazyThreadSafetyMode, new b());
        this.f256459z0 = new C47313c(null, 1, null);
        this.f256444A0 = new C47313c(null, 1, null);
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        RecyclerView recyclerView;
        if (str.equals(this.f256445B0)) {
            recyclerView = this.f256455v0;
            if (recyclerView == null) {
                return null;
            }
        } else if (!str.equals(this.f256446C0) || (recyclerView = this.f256456w0) == null) {
            return null;
        }
        return recyclerView;
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        return B0(str);
    }

    @Override // gj.i
    @l
    public final o c1() {
        return null;
    }

    @Override // gj.i
    @k
    public final String m0() {
        return "main";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.horizontal_padding_re23);
        Integer numValueOf = Integer.valueOf(dimensionPixelSize);
        InterfaceC25659b interfaceC25659b = this.f256452s0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(numValueOf);
        aVarB.f100611g = q5().f256502N.B0();
        this.f256457x0 = aVarB;
        Integer numValueOf2 = Integer.valueOf(dimensionPixelSize);
        InterfaceC25659b interfaceC25659b2 = this.f256452s0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB2 = interfaceC25659b2.b(numValueOf2);
        aVarB2.f100611g = q5().f256502N.B0();
        this.f256458y0 = aVarB2;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f256457x0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        View viewFindViewById = view.findViewById(R.id.main_items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, abstractC25658a);
        this.f256455v0 = recyclerView;
        View viewFindViewById2 = requireView().findViewById(R.id.bottom_items_shadow);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        com.avito.android.delivery_common.f.a(recyclerView, 1, viewFindViewById2);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f256458y0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        View viewFindViewById3 = view.findViewById(R.id.bottom_items);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById3;
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView2, abstractC25658a2);
        this.f256456w0 = recyclerView2;
        View viewFindViewById4 = view.findViewById(R.id.content);
        C47313c c47313c = this.f256459z0;
        n<Object>[] nVarArr = f256443E0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById4);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        C47313c c47313c2 = this.f256444A0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, progressBar);
        ((gj.k) this.f256451r0.getValue()).l(q5().f256502N);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256454u0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new com.avito.android.safedeal.universal_delivery_type.courier.c(1, this, BeduinUniversalDeliveryTypeCourierFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierOneTimeEvent;)V", 0), new com.avito.android.safedeal.universal_delivery_type.courier.d(1, this, BeduinUniversalDeliveryTypeCourierFragment.class, "render", "render(Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierState;)V", 0));
        com.avito.android.safedeal.universal_delivery_type.l lVar = this.f256453t0;
        (lVar != null ? lVar : null).b();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(UniversalDeliveryTypeCourierScreen.f256468d, s.c(this), null, 4, null);
        a.InterfaceC7681a interfaceC7681aA = com.avito.android.safedeal.universal_delivery_type.courier.di.b.a();
        r rVar = new r(this, Long.valueOf(((j) requireActivity()).t1()), (String) null, 4, (C42822w) null);
        ?? r22 = this.f256447n0;
        interfaceC7681aA.a(rVar, (UniversalDeliveryTypeContent.Tab.Courier) r22.getValue(), ((UniversalDeliveryTypeContent.Tab.Courier) r22.getValue()).getOnInitActions(), ((UniversalDeliveryTypeContent.Tab.Courier) r22.getValue()).getTabType(), c28478k, (InterfaceC42698a) C29972i.a(C29972i.b(this), InterfaceC42698a.class), (com.avito.android.safedeal.universal_delivery_type.courier.di.c) C29972i.a(C29972i.b(this), com.avito.android.safedeal.universal_delivery_type.courier.di.c.class), cv.c.a((androidx.appcompat.app.m) requireActivity()), (j) requireActivity()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256454u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.safedeal.universal_delivery_type.courier.g q5() {
        return (com.avito.android.safedeal.universal_delivery_type.courier.g) this.f256449p0.getValue();
    }

    public final void r5(boolean z12) {
        C47313c c47313c = this.f256444A0;
        n<Object>[] nVarArr = f256443E0;
        n<Object> nVar = nVarArr[1];
        D6.G((ProgressBar) c47313c.a(), !z12);
        C47313c c47313c2 = this.f256459z0;
        n<Object> nVar2 = nVarArr[0];
        D6.G((View) c47313c2.a(), z12);
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
