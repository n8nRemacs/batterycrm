package com.avito.android.vas_performance.ui.stickers.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.StickersEditVasScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.vas_performance.di.stickers.l;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.S;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: StickersEditVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/StickersEditVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class StickersEditVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f322004B0;

    /* renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f322005C0;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f322006A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f322007n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f322008o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public q f322009p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f322010q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f322011r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f322012s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.ui.recycler.e f322013t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f322014u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47312b f322015v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f322016w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f322017x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public ProgressBar f322018y0;

    /* renamed from: z0, reason: collision with root package name */
    public InterfaceC49447a f322019z0;

    /* compiled from: StickersEditVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/StickersEditVasFragment$a;", "", "<init>", "()V", "", "KEY_CLOSEABLE", "Ljava/lang/String;", "KEY_ITEM_ID", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StickersEditVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            q qVar = StickersEditVasFragment.this.f322009p0;
            if (qVar == null) {
                qVar = null;
            }
            qVar.le();
            return G0.f406611a;
        }
    }

    /* compiled from: StickersEditVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f322021b;

        public c(Y41.l lVar) {
            this.f322021b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return ((InterfaceC43072x) this.f322021b).equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return (InterfaceC43072x) this.f322021b;
        }

        public final int hashCode() {
            return ((InterfaceC43072x) this.f322021b).hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322021b.invoke(obj);
        }
    }

    static {
        Y y12 = new Y(StickersEditVasFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f322005C0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StickersEditVasFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersEditVasFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f322004B0 = new a(null);
    }

    public StickersEditVasFragment() {
        super(0, 1, null);
        this.f322015v0 = new C47312b(null, 1, null);
        this.f322016w0 = new C47313c(null, 1, null);
        this.f322017x0 = new C47313c(null, 1, null);
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
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("item_id")) == null) {
            throw new IllegalStateException("itemId must not be null");
        }
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f322019z0 = interfaceC49447a;
        Bundle arguments2 = getArguments();
        this.f322006A0 = (arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("closable")) : null).booleanValue();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        l.a aVarA = com.avito.android.vas_performance.di.stickers.e.a();
        boolean z12 = this.f322006A0;
        StickersEditVasScreen stickersEditVasScreen = StickersEditVasScreen.f90502d;
        stickersEditVasScreen.getClass();
        aVarA.a(string, z12, this, stickersEditVasScreen, StickersEditVasScreen.f90503e, com.avito.android.analytics.screens.s.c(this), (com.avito.android.vas_performance.di.stickers.p) C29972i.a(C29972i.b(this), com.avito.android.vas_performance.di.stickers.p.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f322012s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322014u0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f322012s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.stickers_vas_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        InterfaceC28373a interfaceC28373a = this.f322011r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        C47313c c47313c = this.f322017x0;
        kotlin.reflect.n<Object>[] nVarArr = f322005C0;
        kotlin.reflect.n<Object> nVar = nVarArr[2];
        c47313c.b(this, lVar);
        r5().f231600j = new b();
        this.f322018y0 = (ProgressBar) view.findViewById(R.id.stickers_navigation_progress_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        this.f322015v0.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.continue_button);
        C47313c c47313c2 = this.f322016w0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c2.b(this, button);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("closable") : true;
        toolbar.setNavigationIcon(z12 ? R.drawable.ic_close_24_black : R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new O91.j(4, this, z12));
        RecyclerView recyclerViewS5 = s5();
        com.avito.konveyor.adapter.j jVar = this.f322010q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewS5.setAdapter(jVar);
        RecyclerView recyclerViewS52 = s5();
        com.avito.android.vas_performance.ui.recycler.e eVar = this.f322013t0;
        if (eVar == null) {
            eVar = null;
        }
        recyclerViewS52.l(eVar, -1);
        new S(C37722i.f(q5()).d0(new f(this)).N(g.f322027b)).n(new h(this), new i(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        q qVar = this.f322009p0;
        if (qVar == null) {
            qVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f322008o0;
        if (set == null) {
            set = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = qVar.f322047T;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.vas_performance.ui.items.stickers.e) {
                z<com.avito.android.vas_performance.ui.items.stickers.a> zVarH = ((com.avito.android.vas_performance.ui.items.stickers.e) dVar).h();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zVarH.getClass();
                I0 i0J0 = zVarH.C0(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(qVar.f322039L.e());
                o oVar = new o(qVar);
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(oVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.edit.p
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        q qVar2 = this.f322009p0;
        if (qVar2 == null) {
            qVar2 = null;
        }
        qVar2.f322044Q.observe(getViewLifecycleOwner(), new c(new com.avito.android.vas_performance.ui.stickers.edit.b(1, this, StickersEditVasFragment.class, "bindProgressOverlay", "bindProgressOverlay(Lcom/avito/android/util/LoadingState;)V", 0)));
        q qVar3 = this.f322009p0;
        if (qVar3 == null) {
            qVar3 = null;
        }
        qVar3.f322043P.observe(getViewLifecycleOwner(), new c(new com.avito.android.vas_performance.ui.stickers.edit.c(this)));
        q qVar4 = this.f322009p0;
        if (qVar4 == null) {
            qVar4 = null;
        }
        qVar4.f322041N.observe(getViewLifecycleOwner(), new c(new d(this)));
        q qVar5 = this.f322009p0;
        if (qVar5 == null) {
            qVar5 = null;
        }
        qVar5.f322042O.observe(getViewLifecycleOwner(), new c(new e(this)));
        q5().setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.vas_performance.ui.stickers.edit.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12;
                Action action;
                final q qVar6 = this.f322022b.f322009p0;
                DeepLink deepLink = null;
                if (qVar6 == null) {
                    qVar6 = null;
                }
                GL0.c cVar2 = qVar6.f322045R;
                String alertMessage = cVar2 != null ? cVar2.getAlertMessage() : null;
                GL0.c cVar3 = qVar6.f322045R;
                boolean z13 = false;
                if (cVar3 != null && qVar6.f322049V.size() == cVar3.getMaxSelectedCount()) {
                    z13 = true;
                }
                if (qVar6.ke() == 0) {
                    GL0.c cVar4 = qVar6.f322045R;
                    if (cVar4 != null && (action = cVar4.getAction()) != null) {
                        deepLink = action.getDeepLink();
                    }
                    qVar6.f322042O.postValue(deepLink);
                    return;
                }
                if (alertMessage != null && (i12 = qVar6.f322050W) == 0 && !z13) {
                    qVar6.f322050W = i12 + 1;
                    qVar6.f322041N.postValue(alertMessage);
                } else {
                    I0 i0J02 = qVar6.f322038K.i(qVar6.f322036E, qVar6.f322049V).j0(qVar6.f322039L.e());
                    l41.g gVar = new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.edit.m
                        @Override // l41.g
                        public final void accept(Object obj) {
                            Action action2;
                            P2<?> p22 = (P2) obj;
                            q qVar7 = qVar6;
                            boolean z14 = p22 instanceof P2.b;
                            C23038g0<P2<?>> c23038g0 = qVar7.f322044Q;
                            DeepLink deepLink2 = null;
                            if (z14) {
                                c23038g0.postValue(p22);
                                GL0.c cVar5 = qVar7.f322045R;
                                if (cVar5 != null && (action2 = cVar5.getAction()) != null) {
                                    deepLink2 = action2.getDeepLink();
                                }
                                qVar7.f322042O.postValue(deepLink2);
                                return;
                            }
                            if (!(p22 instanceof P2.a)) {
                                if (!(p22 instanceof P2.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c23038g0.postValue(p22);
                            } else {
                                ApiError apiError = ((P2.a) p22).f318719a;
                                ScreenPerformanceTracker.a.d(qVar7.f322040M, null, null, new J.a(apiError), null, 11);
                                ScreenPerformanceTracker screenPerformanceTracker = qVar7.f322040M;
                                screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
                                c23038g0.postValue(p22);
                                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
                            }
                        }
                    };
                    final V2 v23 = V2.f318762a;
                    qVar6.f322046S.b(i0J02.v0(gVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.edit.n
                        @Override // l41.g
                        public final void accept(Object obj) {
                            v23.f((Throwable) obj);
                        }
                    }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker = this.f322012s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final Button q5() {
        C47313c c47313c = this.f322016w0;
        kotlin.reflect.n<Object> nVar = f322005C0[1];
        return (Button) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f322017x0;
        kotlin.reflect.n<Object> nVar = f322005C0[2];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final RecyclerView s5() {
        kotlin.reflect.n<Object> nVar = f322005C0[0];
        return (RecyclerView) this.f322015v0.a();
    }
}
