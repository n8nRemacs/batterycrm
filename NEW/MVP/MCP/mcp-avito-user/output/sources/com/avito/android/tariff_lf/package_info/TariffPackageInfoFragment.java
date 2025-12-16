package com.avito.android.tariff_lf.package_info;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.tariff_lf.package_info.e;
import com.avito.android.tariff_lf.package_info.viewmodel.l;
import com.avito.android.tariff_lf.package_info.viewmodel.w;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.konveyor.adapter.j;
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
import v50.C49166b;

/* compiled from: TariffPackageInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/TariffPackageInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class TariffPackageInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f299160A0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final a f299161z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public l f299162n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f299163o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public j f299164p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f299165q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f299166r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f299167s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f299168t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47312b f299169u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f299170v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f299171w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47313c f299172x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final w f299173y0;

    /* compiled from: TariffPackageInfoFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/TariffPackageInfoFragment$a;", "", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffPackageInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            l lVar = TariffPackageInfoFragment.this.f299162n0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(TariffPackageInfoFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f299160A0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TariffPackageInfoFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffPackageInfoFragment.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffPackageInfoFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f299161z0 = new a(null);
    }

    public TariffPackageInfoFragment() {
        super(0, 1, null);
        this.f299169u0 = new C47312b(null, 1, null);
        this.f299170v0 = new C47313c(null, 1, null);
        this.f299171w0 = new C47313c(null, 1, null);
        this.f299172x0 = new C47313c(null, 1, null);
        this.f299173y0 = new w();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("contract_id")) == null) {
            throw new IllegalStateException("contractId must be set");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("package_id")) == null) {
            throw new IllegalStateException("packageId must be set");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf.package_info.di.b.a().a(this, string, string2, (com.avito.android.tariff_lf.common.di.a) C29972i.a(C29972i.b(this), com.avito.android.tariff_lf.common.di.a.class), cv.c.b(this), s.c(this), getResources()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f299168t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f299167s0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f299168t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.package_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f299160A0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f299169u0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        j jVar = this.f299164p0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        ((RecyclerView) c47312b.a()).l(this.f299173y0, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f299170v0;
        n<Object> nVar4 = nVarArr[1];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[1];
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new i(this, 6));
        n<Object> nVar6 = nVarArr[1];
        ((Toolbar) c47313c.a()).setTextAlignment(4);
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        C47313c c47313c2 = this.f299171w0;
        n<Object> nVar7 = nVarArr[2];
        c47313c2.b(this, textView);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c3 = this.f299172x0;
        n<Object> nVar8 = nVarArr[3];
        c47313c3.b(this, lVar);
        q5().f231600j = new b();
        l lVar2 = this.f299162n0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.getF299317S().observe(getViewLifecycleOwner(), new e.a(new com.avito.android.tariff_lf.package_info.a(this)));
        l lVar3 = this.f299162n0;
        if (lVar3 == null) {
            lVar3 = null;
        }
        lVar3.getF299319U().observe(getViewLifecycleOwner(), new e.a(new com.avito.android.tariff_lf.package_info.b(this)));
        l lVar4 = this.f299162n0;
        if (lVar4 == null) {
            lVar4 = null;
        }
        lVar4.getF299318T().observe(getViewLifecycleOwner(), new e.a(new c(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f299168t0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f299172x0;
        n<Object> nVar = f299160A0[3];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
