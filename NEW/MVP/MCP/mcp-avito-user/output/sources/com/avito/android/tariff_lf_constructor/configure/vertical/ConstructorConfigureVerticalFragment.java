package com.avito.android.tariff_lf_constructor.configure.vertical;

import A3.a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.h;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.konveyor.adapter.d;
import gD0.InterfaceC40574b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import l41.g;
import qK0.C47312b;
import qK0.C47313c;

/* compiled from: ConstructorConfigureVerticalFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/ConstructorConfigureVerticalFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorConfigureVerticalFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f300552y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f300553z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public d f300554n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f300555o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public GD0.a f300556p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f300557q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.account.plugin.rx.a f300558r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public h f300559s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47312b f300560t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f300561u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f300562v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300563w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f300564x0;

    /* compiled from: ConstructorConfigureVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/ConstructorConfigureVerticalFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorConfigureVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = ConstructorConfigureVerticalFragment.this.f300559s0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.O();
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorConfigureVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA3/a;", "it", "Lkotlin/G0;", "accept", "(LA3/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((A3.a) obj) instanceof a.InterfaceC0003a.c) {
                h hVar = ConstructorConfigureVerticalFragment.this.f300559s0;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.O();
            }
        }
    }

    static {
        Y y12 = new Y(ConstructorConfigureVerticalFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f300553z0 = new n[]{n0Var.e(y12), e.s(ConstructorConfigureVerticalFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), e.s(ConstructorConfigureVerticalFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var)};
        f300552y0 = new a(null);
    }

    public ConstructorConfigureVerticalFragment() {
        super(0, 1, null);
        this.f300560t0 = new C47312b(null, 1, null);
        this.f300561u0 = new C47313c(null, 1, null);
        this.f300562v0 = new C47313c(null, 1, null);
        this.f300564x0 = new io.reactivex.rxjava3.disposables.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement ConstructorTariffRouter");
        }
        this.f300563w0 = lVar;
        com.avito.android.tariff_lf_constructor.configure.vertical.di.h.a().a(this, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300555o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        h hVar = this.f300559s0;
        if (hVar == null) {
            hVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f300557q0;
        hVar.ke(set != null ? set : null, this.f300563w0);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f300555o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_configure_vertical_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f300564x0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f300553z0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f300560t0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        d dVar = this.f300554n0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView2.setAdapter(dVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        GD0.a aVar = this.f300556p0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView3.l(aVar, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f300562v0;
        n<Object> nVar4 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[2];
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new i(this, 14));
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f300561u0;
        n<Object> nVar6 = nVarArr[1];
        c47313c2.b(this, lVar);
        q5().f231600j = new b();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.tariff_lf_constructor.configure.vertical.a(this, null), 3);
        com.avito.android.account.plugin.rx.a aVar2 = this.f300558r0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f300564x0.b(aVar2.getF68171a().t0(new c()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f300555o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f300561u0;
        n<Object> nVar = f300553z0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
