package com.avito.android.model_card.screen.ui;

import Cd.C13243a;
import EZ.a;
import Y61.k;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.model_card.screen.ModelCardScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.y6;
import gj.m;
import gj.o;
import javax.inject.Inject;
import kd0.C42670a;
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
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ModelCardFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/model_card/screen/ui/ModelCardFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModelCardFragment extends BaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: H0, reason: collision with root package name */
    @k
    public static final a f198116H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f198117I0;

    /* renamed from: A0, reason: collision with root package name */
    @k
    public final C47312b f198118A0;

    /* renamed from: B0, reason: collision with root package name */
    @k
    public final C47312b f198119B0;

    /* renamed from: C0, reason: collision with root package name */
    public ViewGroup f198120C0;

    /* renamed from: D0, reason: collision with root package name */
    public Group f198121D0;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public String f198122E0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public String f198123F0;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public String f198124G0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.model_card.screen.ui.e f198125n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f198126o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.common.component.adapter.b f198127p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f198128q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.common.navigation_bar.b f198129r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.view.a f198130s0;

    /* renamed from: t0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f198131t0;

    /* renamed from: u0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f198132u0;

    /* renamed from: v0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f198133v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f198134w0;

    /* renamed from: x0, reason: collision with root package name */
    public com.avito.android.beduin_shared.model.progress_overlay.a f198135x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final C47312b f198136y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final C47312b f198137z0;

    /* compiled from: ModelCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/model_card/screen/ui/ModelCardFragment$a;", "", "<init>", "()V", "", "MODEL_CARD_CONTENT_TYPE_PERF", "Ljava/lang/String;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ModelCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f198138l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(G0 g02) {
            return G0.f406611a;
        }
    }

    /* compiled from: ModelCardFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<FZ.c, G0> {
        @Override // Y41.l
        public final G0 invoke(FZ.c cVar) {
            int i12 = 1;
            FZ.c cVar2 = cVar;
            ModelCardFragment modelCardFragment = (ModelCardFragment) this.receiver;
            a aVar = ModelCardFragment.f198116H0;
            modelCardFragment.getClass();
            modelCardFragment.f198122E0 = cVar2.f4783d;
            modelCardFragment.f198123F0 = cVar2.f4784e;
            modelCardFragment.f198124G0 = cVar2.f4785f;
            AbstractC25658a<? extends RecyclerView.C> abstractC25658a = modelCardFragment.f198131t0;
            if (abstractC25658a == null) {
                abstractC25658a = null;
            }
            abstractC25658a.m(cVar2.f4786g);
            com.avito.android.beduin.common.navigation_bar.b bVar = modelCardFragment.f198129r0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.m(cVar2.f4787h);
            AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = modelCardFragment.f198132u0;
            if (abstractC25658a2 == null) {
                abstractC25658a2 = null;
            }
            abstractC25658a2.m(cVar2.f4789j);
            AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = modelCardFragment.f198133v0;
            if (abstractC25658a3 == null) {
                abstractC25658a3 = null;
            }
            abstractC25658a3.m(cVar2.f4788i);
            if (cVar2.f4781b) {
                modelCardFragment.q5(true);
            } else {
                Throwable th2 = cVar2.f4782c;
                if (th2 != null) {
                    modelCardFragment.q5(false);
                    com.avito.android.beduin_shared.model.progress_overlay.a aVar2 = modelCardFragment.f198135x0;
                    (aVar2 != null ? aVar2 : null).e(new b.a(modelCardFragment.requireContext(), z.l(th2), null, null, null, new com.avito.android.model_card.screen.ui.a(modelCardFragment, i12), 28, null));
                } else {
                    modelCardFragment.q5(false);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f198139l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f198139l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f198139l);
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
            return ModelCardFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f198141l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f198141l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f198141l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198142l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198142l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f198142l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198143l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198143l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f198143l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ModelCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/model_card/screen/ui/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/model_card/screen/ui/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.model_card.screen.ui.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.model_card.screen.ui.d invoke() {
            com.avito.android.model_card.screen.ui.e eVar = ModelCardFragment.this.f198125n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.model_card.screen.ui.d) eVar.get();
        }
    }

    static {
        Y y12 = new Y(ModelCardFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f198117I0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ModelCardFragment.class, "navBarMainView", "getNavBarMainView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ModelCardFragment.class, "navBarRightView", "getNavBarRightView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ModelCardFragment.class, "mainRecyclerView", "getMainRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ModelCardFragment.class, "bottomRecyclerView", "getBottomRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f198116H0 = new a(null);
    }

    public ModelCardFragment() {
        super(R.layout.model_card_fragment);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f198126o0 = new O0(m0.f406844a.b(com.avito.android.model_card.screen.ui.d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f198134w0 = new C47313c(null, 1, null);
        this.f198136y0 = new C47312b(null, 1, null);
        this.f198137z0 = new C47312b(null, 1, null);
        this.f198118A0 = new C47312b(null, 1, null);
        this.f198119B0 = new C47312b(null, 1, null);
    }

    public static RecyclerView s5(View view, int i12, AbstractC25658a abstractC25658a) {
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, abstractC25658a);
        return recyclerView;
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        String str2 = this.f198122E0;
        if (str2 == null) {
            str2 = "top";
        }
        boolean zEquals = str.equals(str2);
        n<Object>[] nVarArr = f198117I0;
        if (zEquals) {
            n<Object> nVar = nVarArr[1];
            return (RecyclerView) this.f198136y0.a();
        }
        if (str.equals(m0())) {
            n<Object> nVar2 = nVarArr[3];
            return (RecyclerView) this.f198118A0.a();
        }
        String str3 = this.f198124G0;
        if (str3 == null) {
            str3 = "bottom";
        }
        if (!str.equals(str3)) {
            return null;
        }
        n<Object> nVar3 = nVarArr[4];
        return (RecyclerView) this.f198119B0.a();
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        String str2 = this.f198124G0;
        if (str2 == null) {
            str2 = "bottom";
        }
        if (!str.equals(str2)) {
            return B0(str);
        }
        ViewGroup viewGroup = this.f198120C0;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // gj.i
    @l
    public final o c1() {
        return null;
    }

    @Override // gj.i
    @k
    public final String m0() {
        String str = this.f198123F0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f198128q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.beduin.view.a aVar = this.f198130s0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (aVar == null) {
            aVar = null;
        }
        gj.k kVarA = m.a(aVar, this);
        O0 o02 = this.f198126o0;
        ((com.avito.android.beduin.view.c) kVarA).l(((com.avito.android.model_card.screen.ui.d) o02.getValue()).f198148N);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        C47313c c47313c = this.f198134w0;
        n<Object>[] nVarArr = f198117I0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, (Toolbar) viewFindViewById);
        n<Object> nVar2 = nVarArr[0];
        Toolbar toolbar = (Toolbar) c47313c.a();
        o5(toolbar);
        C35966w1.c(this).w(null);
        toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, toolbar.getContext()));
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(C35835l0.e(R.attr.black, toolbar.getContext()));
        }
        toolbar.setNavigationOnClickListener(new com.avito.android.model_card.screen.ui.a(this, 0));
        Integer numValueOf = Integer.valueOf(y6.b(16));
        this.f198131t0 = r5(numValueOf);
        this.f198132u0 = r5(numValueOf);
        this.f198133v0 = r5(numValueOf);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_toolbar_right_list);
        recyclerView.setItemAnimator(null);
        com.avito.android.beduin.common.navigation_bar.b bVar = this.f198129r0;
        if (bVar == null) {
            bVar = null;
        }
        recyclerView.getContext();
        com.avito.android.beduin_shared.model.utils.h.a(recyclerView, bVar, new LinearLayoutManager(0, false));
        int i12 = 2;
        n<Object> nVar3 = nVarArr[2];
        this.f198137z0.b(this, recyclerView);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f198131t0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        RecyclerView recyclerViewS5 = s5(view, R.id.beduin_toolbar_list, abstractC25658a);
        n<Object> nVar4 = nVarArr[1];
        this.f198136y0.b(this, recyclerViewS5);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f198132u0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        RecyclerView recyclerViewS52 = s5(view, R.id.beduin_main_list, abstractC25658a2);
        n<Object> nVar5 = nVarArr[3];
        C47312b c47312b = this.f198118A0;
        c47312b.b(this, recyclerViewS52);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f198133v0;
        if (abstractC25658a3 == null) {
            abstractC25658a3 = null;
        }
        RecyclerView recyclerViewS53 = s5(view, R.id.beduin_bottom_list, abstractC25658a3);
        recyclerViewS53.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 16));
        n<Object> nVar6 = nVarArr[4];
        this.f198119B0.b(this, recyclerViewS53);
        View viewFindViewById2 = view.findViewById(R.id.beduin_bottom_list_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f198120C0 = (ViewGroup) viewFindViewById2;
        ScreenPerformanceTracker screenPerformanceTracker = this.f198128q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        n<Object> nVar7 = nVarArr[3];
        screenPerformanceTracker.b((RecyclerView) c47312b.a());
        View viewFindViewById3 = view.findViewById(R.id.beduin_overlay_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f198135x0 = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById3, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        View viewFindViewById4 = view.findViewById(R.id.beduin_content_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f198121D0 = (Group) viewFindViewById4;
        com.avito.android.model_card.screen.ui.d dVar = (com.avito.android.model_card.screen.ui.d) o02.getValue();
        com.avito.android.beduin_shared.model.progress_overlay.a aVar2 = this.f198135x0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.android.beduin_shared.model.utils.b.c(dVar.f198148N, this, aVar2);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198128q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, (com.avito.android.model_card.screen.ui.d) o02.getValue(), b.f198138l, new c(1, this, ModelCardFragment.class, "render", "render(Lcom/avito/android/model_card/screen/mvi/entity/ModelCardState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f198128q0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        ModelCardArguments modelCardArguments;
        Bundle arguments = getArguments();
        if (arguments != null) {
            modelCardArguments = (ModelCardArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("model-card-arguments", ModelCardArguments.class) : arguments.getParcelable("model-card-arguments"));
        } else {
            modelCardArguments = null;
        }
        if (modelCardArguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((a.InterfaceC0239a) C29972i.a(C29972i.b(this), a.InterfaceC0239a.class)).Gh().a(modelCardArguments, cv.c.d(this), new C28478k(ModelCardScreen.f198057d, s.c(this), "modelCard")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198128q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198128q0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final void q5(boolean z12) {
        Group group = this.f198121D0;
        if (group == null) {
            group = null;
        }
        group.setVisibility(!z12 ? 0 : 8);
        n<Object>[] nVarArr = f198117I0;
        n<Object> nVar = nVarArr[2];
        ((RecyclerView) this.f198137z0.a()).setVisibility(!z12 ? 0 : 8);
        n<Object> nVar2 = nVarArr[1];
        ((RecyclerView) this.f198136y0.a()).setVisibility(z12 ? 8 : 0);
        if (z12) {
            com.avito.android.beduin_shared.model.progress_overlay.a aVar = this.f198135x0;
            C42670a.d(aVar != null ? aVar : null);
        } else {
            com.avito.android.beduin_shared.model.progress_overlay.a aVar2 = this.f198135x0;
            (aVar2 != null ? aVar2 : null).b();
        }
    }

    public final AbstractC25658a<? extends RecyclerView.C> r5(Integer num) {
        com.avito.android.beduin.common.component.adapter.b bVar = this.f198127p0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        com.avito.android.beduin.common.component.adapter.a aVar = new com.avito.android.beduin.common.component.adapter.a(num);
        aVar.f100611g = ((com.avito.android.model_card.screen.ui.d) this.f198126o0.getValue()).f198148N.B0();
        return aVar;
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
