package com.avito.android.tariff_lf_constructor.configure.category;

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
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.tariff_lf_constructor.configure.category.g;
import com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.konveyor.adapter.j;
import fD0.C40279a;
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
import qK0.C47312b;
import qK0.C47313c;

/* compiled from: ConstructorConfigureCategoryFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/ConstructorConfigureCategoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorConfigureCategoryFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f299338y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f299339z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f299340n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f299341o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public i f299342p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f299343q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C40279a f299344r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f299345s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47312b f299346t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f299347u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f299348v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f299349w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f299350x0;

    /* compiled from: ConstructorConfigureCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/ConstructorConfigureCategoryFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorConfigureCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = ConstructorConfigureCategoryFragment.this.f299342p0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(ConstructorConfigureCategoryFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f299339z0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureCategoryFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureCategoryFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureCategoryFragment.class, "updatePackageProgressBar", "getUpdatePackageProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var)};
        f299338y0 = new a(null);
    }

    public ConstructorConfigureCategoryFragment() {
        super(0, 1, null);
        this.f299346t0 = new C47312b(null, 1, null);
        this.f299347u0 = new C47313c(null, 1, null);
        this.f299348v0 = new C47313c(null, 1, null);
        this.f299349w0 = new C47313c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement CreateTariffRouter");
        }
        this.f299350x0 = lVar;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("configure_context")) == null) {
            throw new IllegalStateException("configure context must be set");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("configure_package_id")) == null) {
            throw new IllegalStateException("configure package id must be set");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_constructor.configure.category.di.h.a().a(this, string, string2, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f299343q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        i iVar = this.f299342p0;
        if (iVar == null) {
            iVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f299345s0;
        iVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f299343q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_configure_category_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f299339z0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f299346t0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        j jVar = this.f299341o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        C40279a c40279a = this.f299344r0;
        if (c40279a == null) {
            c40279a = null;
        }
        recyclerView3.l(c40279a, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f299348v0;
        n<Object> nVar4 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[2];
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 7));
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f299347u0;
        n<Object> nVar6 = nVarArr[1];
        c47313c2.b(this, lVar);
        q5().f231600j = new b();
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c3 = this.f299349w0;
        n<Object> nVar7 = nVarArr[3];
        c47313c3.b(this, spinner);
        i iVar = this.f299342p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getF299457Z().observe(getViewLifecycleOwner(), new g.a(new com.avito.android.tariff_lf_constructor.configure.category.a(this)));
        i iVar2 = this.f299342p0;
        if (iVar2 == null) {
            iVar2 = null;
        }
        iVar2.k0().observe(getViewLifecycleOwner(), new g.a(new com.avito.android.tariff_lf_constructor.configure.category.b(this)));
        i iVar3 = this.f299342p0;
        if (iVar3 == null) {
            iVar3 = null;
        }
        iVar3.getF299454W().observe(getViewLifecycleOwner(), new g.a(new c(this)));
        i iVar4 = this.f299342p0;
        if (iVar4 == null) {
            iVar4 = null;
        }
        iVar4.getF299456Y().observe(getViewLifecycleOwner(), new g.a(new d(this)));
        i iVar5 = this.f299342p0;
        if (iVar5 == null) {
            iVar5 = null;
        }
        iVar5.getF299453V().observe(getViewLifecycleOwner(), new g.a(new e(this)));
        i iVar6 = this.f299342p0;
        if (iVar6 == null) {
            iVar6 = null;
        }
        iVar6.getF299455X().observe(getViewLifecycleOwner(), new g.a(new f(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f299343q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f299347u0;
        n<Object> nVar = f299339z0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
