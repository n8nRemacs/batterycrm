package com.avito.android.tariff_lf_constructor.configure.size;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.tariff_lf_constructor.configure.common.ui.PriceDotsView;
import com.avito.android.tariff_lf_constructor.configure.size.ConstructorConfigureSizeFragment;
import com.avito.android.tariff_lf_constructor.configure.size.k;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
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

/* compiled from: ConstructorConfigureSizeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ConstructorConfigureSizeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorConfigureSizeFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f300239G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f300240H0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300241A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300242B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300243C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300244D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300245E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300246F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f300247n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f300248o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i f300249p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f300250q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.size.ui.c f300251r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f300252s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47312b f300253t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300254u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300255v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300256w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300257x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300258y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300259z0;

    /* compiled from: ConstructorConfigureSizeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ConstructorConfigureSizeFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorConfigureSizeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar = ConstructorConfigureSizeFragment.this.f300249p0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(ConstructorConfigureSizeFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f300240H0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "description", "getDescription()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "totalInfoContainer", "getTotalInfoContainer()Lcom/avito/android/lib/design/banner/Banner;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "discount", "getDiscount()Lcom/avito/android/tariff_lf_constructor/configure/common/ui/PriceDotsView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "packagePrice", "getPackagePrice()Lcom/avito/android/tariff_lf_constructor/configure/common/ui/PriceDotsView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "totalPrice", "getTotalPrice()Lcom/avito/android/tariff_lf_constructor/configure/common/ui/PriceDotsView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSizeFragment.class, "updatePackageProgressBar", "getUpdatePackageProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var)};
        f300239G0 = new a(null);
    }

    public ConstructorConfigureSizeFragment() {
        super(0, 1, null);
        this.f300253t0 = new C47312b(null, 1, null);
        this.f300254u0 = new C47313c(null, 1, null);
        this.f300255v0 = new C47313c(null, 1, null);
        this.f300256w0 = new C47313c(null, 1, null);
        this.f300257x0 = new C47313c(null, 1, null);
        this.f300258y0 = new C47313c(null, 1, null);
        this.f300259z0 = new C47313c(null, 1, null);
        this.f300241A0 = new C47313c(null, 1, null);
        this.f300242B0 = new C47313c(null, 1, null);
        this.f300243C0 = new C47313c(null, 1, null);
        this.f300244D0 = new C47313c(null, 1, null);
        this.f300245E0 = new C47313c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement CreateTariffRouter");
        }
        this.f300246F0 = lVar;
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
        com.avito.android.tariff_lf_constructor.configure.size.di.h.a().a(this, string, string2, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300250q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar = this.f300249p0;
        if (iVar == null) {
            iVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f300252s0;
        iVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f300250q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_configure_size_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f300240H0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f300253t0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.j jVar = this.f300248o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        com.avito.android.tariff_lf_constructor.configure.size.ui.c cVar = this.f300251r0;
        if (cVar == null) {
            cVar = null;
        }
        recyclerView3.l(cVar, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f300255v0;
        n<Object> nVar4 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[2];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.size.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureSizeFragment f300262c;

            {
                this.f300262c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConstructorConfigureSizeFragment constructorConfigureSizeFragment = this.f300262c;
                switch (i12) {
                    case 0:
                        ConstructorConfigureSizeFragment.a aVar = ConstructorConfigureSizeFragment.f300239G0;
                        ActivityC22955m activityC22955mL1 = constructorConfigureSizeFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar = constructorConfigureSizeFragment.f300249p0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        iVar.r0();
                        break;
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        C47313c c47313c2 = this.f300256w0;
        n<Object> nVar6 = nVarArr[3];
        c47313c2.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.title);
        C47313c c47313c3 = this.f300257x0;
        n<Object> nVar7 = nVarArr[4];
        c47313c3.b(this, textView2);
        TextView textView3 = (TextView) view.findViewById(R.id.description);
        C47313c c47313c4 = this.f300258y0;
        n<Object> nVar8 = nVarArr[5];
        c47313c4.b(this, textView3);
        Banner banner = (Banner) view.findViewById(R.id.total_info_container);
        C47313c c47313c5 = this.f300259z0;
        n<Object> nVar9 = nVarArr[6];
        c47313c5.b(this, banner);
        D6.c(r5(), null, null, null, Integer.valueOf(D6.i(24, view.getContext())), 7);
        PriceDotsView priceDotsView = (PriceDotsView) r5().findViewById(R.id.total_price_view);
        C47313c c47313c6 = this.f300243C0;
        n<Object> nVar10 = nVarArr[9];
        c47313c6.b(this, priceDotsView);
        PriceDotsView priceDotsView2 = (PriceDotsView) r5().findViewById(R.id.discount_view);
        C47313c c47313c7 = this.f300241A0;
        n<Object> nVar11 = nVarArr[7];
        c47313c7.b(this, priceDotsView2);
        PriceDotsView priceDotsView3 = (PriceDotsView) r5().findViewById(R.id.package_price_view);
        C47313c c47313c8 = this.f300242B0;
        n<Object> nVar12 = nVarArr[8];
        c47313c8.b(this, priceDotsView3);
        Button button = (Button) r5().findViewById(R.id.btn_add_placing);
        C47313c c47313c9 = this.f300244D0;
        n<Object> nVar13 = nVarArr[10];
        c47313c9.b(this, button);
        n<Object> nVar14 = nVarArr[10];
        final int i13 = 1;
        ((Button) c47313c9.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.size.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureSizeFragment f300262c;

            {
                this.f300262c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConstructorConfigureSizeFragment constructorConfigureSizeFragment = this.f300262c;
                switch (i13) {
                    case 0:
                        ConstructorConfigureSizeFragment.a aVar = ConstructorConfigureSizeFragment.f300239G0;
                        ActivityC22955m activityC22955mL1 = constructorConfigureSizeFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar = constructorConfigureSizeFragment.f300249p0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        iVar.r0();
                        break;
                }
            }
        });
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c10 = this.f300254u0;
        n<Object> nVar15 = nVarArr[1];
        c47313c10.b(this, lVar);
        q5().f231600j = new b();
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c11 = this.f300245E0;
        n<Object> nVar16 = nVarArr[11];
        c47313c11.b(this, spinner);
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar = this.f300249p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getF300368b0().observe(getViewLifecycleOwner(), new k.a(new com.avito.android.tariff_lf_constructor.configure.size.b(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar2 = this.f300249p0;
        if (iVar2 == null) {
            iVar2 = null;
        }
        iVar2.getF300369c0().observe(getViewLifecycleOwner(), new k.a(new c(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar3 = this.f300249p0;
        if (iVar3 == null) {
            iVar3 = null;
        }
        iVar3.getF300370d0().observe(getViewLifecycleOwner(), new k.a(new d(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar4 = this.f300249p0;
        if (iVar4 == null) {
            iVar4 = null;
        }
        iVar4.getF300366Z().observe(getViewLifecycleOwner(), new k.a(new e(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar5 = this.f300249p0;
        if (iVar5 == null) {
            iVar5 = null;
        }
        iVar5.getF300371e0().observe(getViewLifecycleOwner(), new k.a(new f(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar6 = this.f300249p0;
        if (iVar6 == null) {
            iVar6 = null;
        }
        iVar6.getF300365Y().observe(getViewLifecycleOwner(), new k.a(new g(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar7 = this.f300249p0;
        if (iVar7 == null) {
            iVar7 = null;
        }
        iVar7.getF300372f0().observe(getViewLifecycleOwner(), new k.a(new h(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar8 = this.f300249p0;
        if (iVar8 == null) {
            iVar8 = null;
        }
        iVar8.getF300367a0().observe(getViewLifecycleOwner(), new k.a(new i(this)));
        com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i iVar9 = this.f300249p0;
        if (iVar9 == null) {
            iVar9 = null;
        }
        iVar9.getF300364X().observe(getViewLifecycleOwner(), new k.a(new j(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f300250q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f300254u0;
        n<Object> nVar = f300240H0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final Banner r5() {
        C47313c c47313c = this.f300259z0;
        n<Object> nVar = f300240H0[6];
        return (Banner) c47313c.a();
    }
}
