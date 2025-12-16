package com.avito.android.beduin.ui.screen.fragment.tabs;

import Hr.InterfaceC14024a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.google.android.material.appbar.MaterialToolbar;
import gj.InterfaceC40691b;
import gj.o;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: TabsScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/TabsScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/BeduinBaseScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;", "Lcom/avito/android/universal_map/d;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes11.dex */
public final class TabsScreenFragment extends BeduinBaseScreenFragment<TabsScreenModel> implements com.avito.android.universal_map.d, InterfaceC28477j.b, com.avito.android.ui.fragments.c, com.avito.android.ui.status_bar.a {

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public static final a f104306N0;

    /* renamed from: O0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104307O0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104308A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104309B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104310C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104311D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104312E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.common.navigation_bar.b f104313F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.i f104314G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f104315H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public q f104316I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public InterfaceC14024a f104317J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104318K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final O0 f104319L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final e f104320M0;

    /* compiled from: TabsScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/TabsScreenFragment$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TabsScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104321a;

        static {
            int[] iArr = new int[ScreenStyle.values().length];
            try {
                iArr[ScreenStyle.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f104321a = iArr;
        }
    }

    /* compiled from: TabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            TabsScreenFragment tabsScreenFragment = TabsScreenFragment.this;
            com.avito.android.beduin.ui.screen.fragment.o oVar = tabsScreenFragment.f104119n0;
            if (oVar == null) {
                oVar = null;
            }
            return oVar.a(TabsScreenModel.class, tabsScreenFragment.s5());
        }
    }

    /* compiled from: TabsScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/a;", "invoke", "()Lcom/avito/android/beduin/ui/screen/fragment/tabs/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.beduin.ui.screen.fragment.tabs.a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.ui.screen.fragment.tabs.a invoke() {
            TabsScreenFragment tabsScreenFragment = TabsScreenFragment.this;
            com.avito.android.universal_map.i iVar = tabsScreenFragment.f104314G0;
            if (iVar == null) {
                iVar = null;
            }
            InterfaceC14024a interfaceC14024a = tabsScreenFragment.f104317J0;
            return new com.avito.android.beduin.ui.screen.fragment.tabs.a(tabsScreenFragment, iVar, interfaceC14024a != null ? interfaceC14024a : null);
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/avito/android/util/J6", "Lkotlin/properties/h;", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements kotlin.properties.h<View, com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e> {
        @Override // kotlin.properties.g
        public final Object getValue(Object obj, kotlin.reflect.n nVar) {
            Object tag = ((View) obj).getTag(R.id.beduin_tabs_wrapper);
            if (!(tag instanceof com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e)) {
                tag = null;
            }
            return (com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e) tag;
        }

        @Override // kotlin.properties.h
        public final void setValue(View view, kotlin.reflect.n nVar, com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e eVar) {
            view.setTag(R.id.beduin_tabs_wrapper, eVar);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TabsScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f104325l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f104325l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104325l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104326l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104326l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104326l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104327l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104327l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    static {
        Y y12 = new Y(TabsScreenFragment.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0);
        n0 n0Var = m0.f406844a;
        f104307O0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TabsScreenFragment.class, "navigationNarRightRecyclerView", "getNavigationNarRightRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TabsScreenFragment.class, "tabsContainer", "getTabsContainer()Landroid/widget/FrameLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TabsScreenFragment.class, "pager", "getPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TabsScreenFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/beduin_shared/model/progress_overlay/BeduinProgressOverlay;", 0, n0Var), n0Var.f(new a0("tabsWrapper", "getTabsWrapper(Landroid/view/ViewGroup;)Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/TabsWrapper;", TabsScreenFragment.class))};
        f104306N0 = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabsScreenFragment() {
        super(R.layout.beduin_tabs_fragment);
        int i12 = 1;
        this.f104308A0 = new C47313c(null, i12, 0 == true ? 1 : 0);
        this.f104309B0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104310C0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104311D0 = new C47313c(new com.avito.android.authorization.auto_recovery.phone_confirm.b(24));
        this.f104312E0 = new C47313c(0 == true ? 1 : 0, i12, 0 == true ? 1 : 0);
        this.f104318K0 = C42727D.c(new d());
        c cVar = new c();
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f104319L0 = new O0(m0.f406844a.b(s.class), new h(interfaceC42726CB), cVar, new i(interfaceC42726CB));
        this.f104320M0 = new e();
    }

    public static final void A5(TabsScreenModel tabsScreenModel, TabsScreenModel tabsScreenModel2, Y41.l<? super TabsScreenModel, ? extends Object> lVar, Y41.a<G0> aVar) {
        if (tabsScreenModel == null || !L.f(lVar.invoke(tabsScreenModel), lVar.invoke(tabsScreenModel2))) {
            aVar.invoke();
        }
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        InterfaceC23487e interfaceC23487eB = C35966w1.b(this);
        if (interfaceC23487eB instanceof gj.i) {
            return ((gj.i) interfaceC23487eB).B0(str);
        }
        if (interfaceC23487eB instanceof com.avito.android.beduin.ui.screen.fragment.tab.a) {
            return ((com.avito.android.beduin.ui.screen.fragment.tab.a) interfaceC23487eB).B0(str);
        }
        return null;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, gj.i
    @Y61.k
    public final gj.o c1() {
        return new gj.o(new o.a(w5(), ToastBarPosition.f181047e), new o.a(y5(), ToastBarPosition.f181045c));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (com.avito.android.ui.fragments.e.a(this)) {
            return true;
        }
        z5();
        return true;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, gj.i
    @Y61.k
    public final String m0() {
        InterfaceC23487e interfaceC23487eB = C35966w1.b(this);
        return interfaceC23487eB instanceof gj.i ? ((gj.i) interfaceC23487eB).m0() : interfaceC23487eB instanceof com.avito.android.beduin.ui.screen.fragment.tab.a ? ((com.avito.android.beduin.ui.screen.fragment.tab.a) interfaceC23487eB).m0() : "main";
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, super.m5(context, bundle), Integer.valueOf(R.style.Theme_DesignSystem_LookAndFeel));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.ui.status_bar.e eVar = this.f104315H0;
        if (eVar == null) {
            eVar = null;
        }
        q qVar = this.f104316I0;
        eVar.c(this, Collections.singletonList(qVar != null ? qVar : null));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.beduin_toolbar);
        C47313c c47313c = this.f104308A0;
        kotlin.reflect.n<Object>[] nVarArr = f104307O0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, materialToolbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_navigation_bar_right_list);
        C47313c c47313c2 = this.f104309B0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, recyclerView);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.tabs_container);
        C47313c c47313c3 = this.f104310C0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, frameLayout);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.pager);
        C47313c c47313c4 = this.f104311D0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, viewPager2);
        ScreenStyle screenStyle = s5().f104144d;
        if ((screenStyle == null ? -1 : b.f104321a[screenStyle.ordinal()]) == 1) {
            MaterialToolbar materialToolbarY5 = y5();
            Context context = getContext();
            materialToolbarY5.setNavigationIcon(context != null ? C35835l0.m(context, R.attr.ic_arrowBack24, R.attr.black) : null);
        } else {
            y5().setNavigationIcon(R.drawable.ic_close_24);
        }
        y5().setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 14));
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47313c2.a();
        recyclerView2.setItemAnimator(null);
        com.avito.android.beduin.common.navigation_bar.b bVar = this.f104313F0;
        if (bVar == null) {
            bVar = null;
        }
        recyclerView2.getContext();
        com.avito.android.beduin_shared.model.utils.h.a(recyclerView2, bVar, new LinearLayoutManager(0, false));
        com.avito.android.beduin.common.navigation_bar.b bVar2 = this.f104313F0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.f100611g = q5().f104251E.f104269d.B0();
        s sVarQ5 = q5();
        com.avito.android.beduin.common.navigation_bar.b bVar3 = this.f104313F0;
        com.avito.android.beduin_shared.model.utils.l.a(sVarQ5.f104366T, bVar3 != null ? bVar3 : null, this.f104128w0);
        w5().setUserInputEnabled(false);
        w5().setSaveEnabled(false);
        w5().setAdapter((com.avito.android.beduin.ui.screen.fragment.tabs.a) this.f104318K0.getValue());
        View viewFindViewById = view.findViewById(R.id.beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.beduin_shared.model.progress_overlay.a aVar = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById, new o(view));
        C47313c c47313c5 = this.f104312E0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c5.b(this, aVar);
        InterfaceC40691b interfaceC40691b = q5().f104251E.f104269d;
        kotlin.reflect.n<Object> nVar7 = nVarArr[4];
        com.avito.android.beduin_shared.model.utils.b.c(interfaceC40691b, this, (com.avito.android.beduin_shared.model.progress_overlay.a) c47313c5.a());
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    public final Class<TabsScreenModel> r5() {
        return TabsScreenModel.class;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment, gj.i
    public final void t0() {
        s sVarQ5 = q5();
        InterfaceC40691b interfaceC40691b = sVarQ5.f104364R.f104269d;
        TabsScreenModel tabsScreenModel = (TabsScreenModel) sVarQ5.f104253K.getValue();
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, tabsScreenModel != null ? tabsScreenModel.d() : null);
        o8();
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    public final void t5(@Y61.k com.avito.android.beduin.di.screen.b bVar) {
        bVar.d(this);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    public final void u5(com.avito.android.beduin.ui.screen.fragment.i iVar, com.avito.android.beduin.ui.screen.fragment.i iVar2) {
        TabsScreenModel tabsScreenModel = (TabsScreenModel) iVar;
        TabsScreenModel tabsScreenModel2 = (TabsScreenModel) iVar2;
        A5(tabsScreenModel, tabsScreenModel2, com.avito.android.beduin.ui.screen.fragment.tabs.e.f104337l, new com.avito.android.beduin.ui.screen.fragment.tabs.f(this, tabsScreenModel2));
        A5(tabsScreenModel, tabsScreenModel2, com.avito.android.beduin.ui.screen.fragment.tabs.g.f104340l, new com.avito.android.beduin.ui.screen.fragment.tabs.h(this, tabsScreenModel2));
        A5(tabsScreenModel, tabsScreenModel2, com.avito.android.beduin.ui.screen.fragment.tabs.i.f104343l, new com.avito.android.beduin.ui.screen.fragment.tabs.j(this, tabsScreenModel2));
        A5(tabsScreenModel, tabsScreenModel2, k.f104347l, new m(this, tabsScreenModel2));
        A5(tabsScreenModel, tabsScreenModel2, n.f104360l, new com.avito.android.beduin.ui.screen.fragment.tabs.b(this, tabsScreenModel2));
        A5(tabsScreenModel, tabsScreenModel2, com.avito.android.beduin.ui.screen.fragment.tabs.c.f104334l, new com.avito.android.beduin.ui.screen.fragment.tabs.d(this, tabsScreenModel2));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment
    @Y61.k
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public final s q5() {
        return (s) this.f104319L0.getValue();
    }

    public final ViewPager2 w5() {
        C47313c c47313c = this.f104311D0;
        kotlin.reflect.n<Object> nVar = f104307O0[3];
        return (ViewPager2) c47313c.a();
    }

    public final FrameLayout x5() {
        C47313c c47313c = this.f104310C0;
        kotlin.reflect.n<Object> nVar = f104307O0[2];
        return (FrameLayout) c47313c.a();
    }

    public final MaterialToolbar y5() {
        C47313c c47313c = this.f104308A0;
        kotlin.reflect.n<Object> nVar = f104307O0[0];
        return (MaterialToolbar) c47313c.a();
    }

    public final void z5() {
        s sVarQ5 = q5();
        InterfaceC40691b interfaceC40691b = sVarQ5.f104364R.f104269d;
        TabsScreenModel tabsScreenModel = (TabsScreenModel) sVarQ5.f104253K.getValue();
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, tabsScreenModel != null ? tabsScreenModel.c() : null);
        s sVarQ52 = q5();
        InterfaceC40691b interfaceC40691b2 = sVarQ52.f104364R.f104269d;
        TabsScreenModel tabsScreenModel2 = (TabsScreenModel) sVarQ52.f104253K.getValue();
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b2, tabsScreenModel2 != null ? tabsScreenModel2.d() : null);
        o8();
    }
}
