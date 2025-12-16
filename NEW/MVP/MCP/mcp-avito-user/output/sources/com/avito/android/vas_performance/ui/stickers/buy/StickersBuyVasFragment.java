package com.avito.android.vas_performance.ui.stickers.buy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.StickersBuyVasScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.V2;
import com.avito.android.vas_performance.di.stickers.g;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;
import w50.InterfaceC49447a;
import xZ.C49899a;

/* compiled from: StickersBuyVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/StickersBuyVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class StickersBuyVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final a f321919K0;

    /* renamed from: L0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f321920L0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321921A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321922B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321923C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321924D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321925E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public ProgressBar f321926F0;

    /* renamed from: G0, reason: collision with root package name */
    public InterfaceC49447a f321927G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f321928H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public UL0.a f321929I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public C49899a f321930J0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f321931n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f321932o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public v f321933p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f321934q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f321935r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f321936s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.ui.recycler.e f321937t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f321938u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f321939v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f321940w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47312b f321941x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321942y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f321943z0;

    /* compiled from: StickersBuyVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/StickersBuyVasFragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSEABLE", "KEY_CURRENT_FLOW", "KEY_ITEM_ID", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StickersBuyVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            v vVar = StickersBuyVasFragment.this.f321933p0;
            if (vVar == null) {
                vVar = null;
            }
            vVar.ke();
            return G0.f406611a;
        }
    }

    /* compiled from: StickersBuyVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f321945b;

        public c(Y41.l lVar) {
            this.f321945b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return ((InterfaceC43072x) this.f321945b).equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return (InterfaceC43072x) this.f321945b;
        }

        public final int hashCode() {
            return ((InterfaceC43072x) this.f321945b).hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f321945b.invoke(obj);
        }
    }

    static {
        Y y12 = new Y(StickersBuyVasFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f321920L0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "infoSection", "getInfoSection()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "footerContainer", "getFooterContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "floatingFooter", "getFloatingFooter()Lcom/avito/android/mnz_common/ui/MnzFloatingFooter;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "infoText", "getInfoText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "infoIcon", "getInfoIcon()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyVasFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f321919K0 = new a(null);
    }

    public StickersBuyVasFragment() {
        super(0, 1, null);
        this.f321941x0 = new C47312b(null, 1, null);
        this.f321942y0 = new C47313c(null, 1, null);
        this.f321943z0 = new C47313c(null, 1, null);
        this.f321921A0 = new C47313c(null, 1, null);
        this.f321922B0 = new C47313c(null, 1, null);
        this.f321923C0 = new C47313c(null, 1, null);
        this.f321924D0 = new C47313c(null, 1, null);
        this.f321925E0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
            throw new IllegalStateException("checkoutContext must not be null");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("item_id")) == null) {
            throw new IllegalStateException("itemId must not be null");
        }
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f321927G0 = interfaceC49447a;
        Bundle arguments3 = getArguments();
        this.f321928H0 = (arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("closable")) : null).booleanValue();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        g.a aVarA = com.avito.android.vas_performance.di.stickers.d.a();
        boolean z12 = this.f321928H0;
        StickersBuyVasScreen stickersBuyVasScreen = StickersBuyVasScreen.f90500d;
        stickersBuyVasScreen.getClass();
        aVarA.a(string2, string, z12, this, stickersBuyVasScreen, StickersBuyVasScreen.f90501e, com.avito.android.analytics.screens.s.c(this), (com.avito.android.vas_performance.di.stickers.p) C29972i.a(C29972i.b(this), com.avito.android.vas_performance.di.stickers.p.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f321936s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f321940w0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f321936s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.stickers_vas_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        UL0.a aVar = this.f321929I0;
        if (aVar != null) {
            aVar.r();
        }
        this.f321929I0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        InterfaceC28373a interfaceC28373a = this.f321935r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        C47313c c47313c = this.f321925E0;
        kotlin.reflect.n<Object>[] nVarArr = f321920L0;
        kotlin.reflect.n<Object> nVar = nVarArr[7];
        c47313c.b(this, lVar);
        t5().f231600j = new b();
        this.f321926F0 = (ProgressBar) view.findViewById(R.id.stickers_navigation_progress_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        this.f321941x0.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.continue_button);
        C47313c c47313c2 = this.f321942y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c2.b(this, button);
        View viewFindViewById = view.findViewById(R.id.info_section_group);
        C47313c c47313c3 = this.f321943z0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, viewFindViewById);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.footer_container);
        C47313c c47313c4 = this.f321921A0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, viewGroup2);
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.stickers_vas_floating_footer);
        C47313c c47313c5 = this.f321922B0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c5.b(this, mnzFloatingFooter);
        TextView textView = (TextView) view.findViewById(R.id.info_text);
        C47313c c47313c6 = this.f321923C0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c6.b(this, textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.info_icon);
        C47313c c47313c7 = this.f321924D0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c7.b(this, imageView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("closable") : true;
        toolbar.setNavigationIcon(z12 ? R.drawable.ic_close_24 : R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new O91.j(3, this, z12));
        RecyclerView recyclerViewU5 = u5();
        com.avito.konveyor.adapter.j jVar = this.f321934q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewU5.setAdapter(jVar);
        RecyclerView recyclerViewU52 = u5();
        com.avito.android.vas_performance.ui.recycler.e eVar = this.f321937t0;
        if (eVar == null) {
            eVar = null;
        }
        recyclerViewU52.l(eVar, -1);
        final int i12 = 0;
        r5().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.ui.stickers.buy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyVasFragment f321948c;

            {
                this.f321948c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22) {
                StickersBuyVasFragment stickersBuyVasFragment = this.f321948c;
                switch (i12) {
                    case 0:
                        StickersBuyVasFragment.a aVar = StickersBuyVasFragment.f321919K0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a = stickersBuyVasFragment.f321930J0;
                            if (c49899a != null) {
                                stickersBuyVasFragment.u5().r0(c49899a);
                            }
                            C49899a c49899a2 = new C49899a(view2.getHeight());
                            stickersBuyVasFragment.u5().l(c49899a2, -1);
                            stickersBuyVasFragment.f321930J0 = c49899a2;
                            break;
                        }
                        break;
                    default:
                        StickersBuyVasFragment.a aVar2 = StickersBuyVasFragment.f321919K0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a3 = stickersBuyVasFragment.f321930J0;
                            if (c49899a3 != null) {
                                stickersBuyVasFragment.u5().r0(c49899a3);
                            }
                            C49899a c49899a4 = new C49899a(view2.getHeight());
                            stickersBuyVasFragment.u5().l(c49899a4, -1);
                            stickersBuyVasFragment.f321930J0 = c49899a4;
                            break;
                        }
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar9 = nVarArr[4];
        MnzFloatingFooter mnzFloatingFooter2 = (MnzFloatingFooter) c47313c5.a();
        final int i13 = 1;
        mnzFloatingFooter2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.ui.stickers.buy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyVasFragment f321948c;

            {
                this.f321948c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i132, int i14, int i15, int i16, int i17, int i18, int i19, int i22) {
                StickersBuyVasFragment stickersBuyVasFragment = this.f321948c;
                switch (i13) {
                    case 0:
                        StickersBuyVasFragment.a aVar = StickersBuyVasFragment.f321919K0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a = stickersBuyVasFragment.f321930J0;
                            if (c49899a != null) {
                                stickersBuyVasFragment.u5().r0(c49899a);
                            }
                            C49899a c49899a2 = new C49899a(view2.getHeight());
                            stickersBuyVasFragment.u5().l(c49899a2, -1);
                            stickersBuyVasFragment.f321930J0 = c49899a2;
                            break;
                        }
                        break;
                    default:
                        StickersBuyVasFragment.a aVar2 = StickersBuyVasFragment.f321919K0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a3 = stickersBuyVasFragment.f321930J0;
                            if (c49899a3 != null) {
                                stickersBuyVasFragment.u5().r0(c49899a3);
                            }
                            C49899a c49899a4 = new C49899a(view2.getHeight());
                            stickersBuyVasFragment.u5().l(c49899a4, -1);
                            stickersBuyVasFragment.f321930J0 = c49899a4;
                            break;
                        }
                        break;
                }
            }
        });
        v vVar = this.f321933p0;
        if (vVar == null) {
            vVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f321932o0;
        if (set == null) {
            set = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = vVar.f321983Y;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.vas_performance.ui.items.stickers.e) {
                io.reactivex.rxjava3.core.z<com.avito.android.vas_performance.ui.items.stickers.a> zVarH = ((com.avito.android.vas_performance.ui.items.stickers.e) dVar).h();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zVarH.getClass();
                I0 i0J0 = zVarH.C0(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(vVar.f321971M.e());
                t tVar = new t(vVar);
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(tVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.buy.u
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        v vVar2 = this.f321933p0;
        if (vVar2 == null) {
            vVar2 = null;
        }
        Set<TV0.d<?, ?>> set2 = this.f321932o0;
        if (set2 == null) {
            set2 = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = vVar2.f321984Z;
        cVar2.e();
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            TV0.d dVar2 = (TV0.d) it2.next();
            if (dVar2 instanceof com.avito.android.vas_performance.ui.items.stickers.e) {
                I0 i0J02 = ((com.avito.android.vas_performance.ui.items.stickers.e) dVar2).getF321738e().j0(vVar2.f321971M.e());
                r rVar = new r(vVar2);
                final V2 v23 = V2.f318762a;
                cVar2.b(i0J02.v0(rVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.buy.s
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v23.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        v vVar3 = this.f321933p0;
        if (vVar3 == null) {
            vVar3 = null;
        }
        vVar3.f321979U.observe(getViewLifecycleOwner(), new c(new d(1, this, StickersBuyVasFragment.class, "bindContentProgressOverlay", "bindContentProgressOverlay(Lcom/avito/android/util/LoadingState;)V", 0)));
        v vVar4 = this.f321933p0;
        if (vVar4 == null) {
            vVar4 = null;
        }
        vVar4.f321980V.observe(getViewLifecycleOwner(), new c(new e(1, this, StickersBuyVasFragment.class, "bindVasContextProgressButton", "bindVasContextProgressButton(Lcom/avito/android/util/LoadingState;)V", 0)));
        v vVar5 = this.f321933p0;
        if (vVar5 == null) {
            vVar5 = null;
        }
        final int i14 = 0;
        vVar5.f321975Q.observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.stickers.buy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyVasFragment f321950c;

            {
                this.f321950c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                View view2;
                Button button2;
                StickersBuyVasFragment stickersBuyVasFragment = this.f321950c;
                switch (i14) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        StickersBuyVasFragment.a aVar = StickersBuyVasFragment.f321919K0;
                        if (bool != null) {
                            stickersBuyVasFragment.r5().setVisibility(!bool.booleanValue() ? 0 : 8);
                            C47313c c47313c8 = stickersBuyVasFragment.f321922B0;
                            kotlin.reflect.n<Object> nVar10 = StickersBuyVasFragment.f321920L0[4];
                            ((MnzFloatingFooter) c47313c8.a()).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Q q12 = (Q) obj;
                        StickersBuyVasFragment.a aVar2 = StickersBuyVasFragment.f321919K0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null && (view2 = stickersBuyVasFragment.getView()) != null && (button2 = (Button) view2.findViewById(num.intValue())) != null) {
                            button2.setLoading(zBooleanValue);
                            break;
                        }
                        break;
                }
            }
        });
        v vVar6 = this.f321933p0;
        if (vVar6 == null) {
            vVar6 = null;
        }
        vVar6.f321978T.observe(getViewLifecycleOwner(), new c(new h(this)));
        v vVar7 = this.f321933p0;
        if (vVar7 == null) {
            vVar7 = null;
        }
        final int i15 = 1;
        vVar7.f321976R.observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.stickers.buy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyVasFragment f321950c;

            {
                this.f321950c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                View view2;
                Button button2;
                StickersBuyVasFragment stickersBuyVasFragment = this.f321950c;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        StickersBuyVasFragment.a aVar = StickersBuyVasFragment.f321919K0;
                        if (bool != null) {
                            stickersBuyVasFragment.r5().setVisibility(!bool.booleanValue() ? 0 : 8);
                            C47313c c47313c8 = stickersBuyVasFragment.f321922B0;
                            kotlin.reflect.n<Object> nVar10 = StickersBuyVasFragment.f321920L0[4];
                            ((MnzFloatingFooter) c47313c8.a()).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Q q12 = (Q) obj;
                        StickersBuyVasFragment.a aVar2 = StickersBuyVasFragment.f321919K0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null && (view2 = stickersBuyVasFragment.getView()) != null && (button2 = (Button) view2.findViewById(num.intValue())) != null) {
                            button2.setLoading(zBooleanValue);
                            break;
                        }
                        break;
                }
            }
        });
        v vVar8 = this.f321933p0;
        if (vVar8 == null) {
            vVar8 = null;
        }
        vVar8.f321973O.observe(getViewLifecycleOwner(), new c(new i(this)));
        v vVar9 = this.f321933p0;
        if (vVar9 == null) {
            vVar9 = null;
        }
        vVar9.f321974P.observe(getViewLifecycleOwner(), new c(new j(this)));
        q5().setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 8));
        ScreenPerformanceTracker screenPerformanceTracker = this.f321936s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final Button q5() {
        C47313c c47313c = this.f321942y0;
        kotlin.reflect.n<Object> nVar = f321920L0[1];
        return (Button) c47313c.a();
    }

    public final ViewGroup r5() {
        C47313c c47313c = this.f321921A0;
        kotlin.reflect.n<Object> nVar = f321920L0[3];
        return (ViewGroup) c47313c.a();
    }

    public final ImageView s5() {
        C47313c c47313c = this.f321924D0;
        kotlin.reflect.n<Object> nVar = f321920L0[6];
        return (ImageView) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l t5() {
        C47313c c47313c = this.f321925E0;
        kotlin.reflect.n<Object> nVar = f321920L0[7];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final RecyclerView u5() {
        kotlin.reflect.n<Object> nVar = f321920L0[0];
        return (RecyclerView) this.f321941x0.a();
    }
}
