package com.avito.android.tariff_lf_constructor.configure.subcategories;

import a90.ViewOnLayoutChangeListenerC19701a;
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
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.tariff_lf_constructor.configure.subcategories.ConstructorConfigureSubCategoryFragment;
import com.avito.android.tariff_lf_constructor.configure.subcategories.a;
import com.avito.android.ui.fragments.BaseFragment;
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
import xZ.C49899a;

/* compiled from: ConstructorConfigureSubCategoriesFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/ConstructorConfigureSubCategoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorConfigureSubCategoryFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f300415C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f300416D0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300417A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public C49899a f300418B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f300419n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f300420o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h f300421p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f300422q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f300423r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47312b f300424s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300425t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300426u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300427v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300428w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300429x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300430y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300431z0;

    /* compiled from: ConstructorConfigureSubCategoriesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/ConstructorConfigureSubCategoryFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = ConstructorConfigureSubCategoryFragment.this.f300421p0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(ConstructorConfigureSubCategoryFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f300416D0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "categoryButton", "getCategoryButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "continueButtonView", "getContinueButtonView()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "bottomBlockView", "getBottomBlockView()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureSubCategoryFragment.class, "updatePackageProgressBar", "getUpdatePackageProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var)};
        f300415C0 = new a(null);
    }

    public ConstructorConfigureSubCategoryFragment() {
        super(0, 1, null);
        this.f300424s0 = new C47312b(null, 1, null);
        this.f300425t0 = new C47313c(null, 1, null);
        this.f300426u0 = new C47313c(null, 1, null);
        this.f300427v0 = new C47313c(null, 1, null);
        this.f300428w0 = new C47313c(null, 1, null);
        this.f300429x0 = new C47313c(null, 1, null);
        this.f300430y0 = new C47313c(null, 1, null);
        this.f300431z0 = new C47313c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        String string2;
        String string3;
        super.onAttach(context);
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement CreateTariffRouter");
        }
        this.f300417A0 = lVar;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("configure_context")) == null) {
            throw new IllegalStateException("configure context must be set");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("configure_package_id")) == null) {
            throw new IllegalStateException("configure package id must be set");
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("configure_category_id")) == null) {
            throw new IllegalStateException("configure category id must be set");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_constructor.configure.subcategories.di.i.a().a(this, string, string2, string3, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300422q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = this.f300421p0;
        if (hVar == null) {
            hVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f300423r0;
        hVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f300422q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_configure_sub_categories_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f300416D0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f300424s0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.j jVar = this.f300420o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f300426u0;
        n<Object> nVar3 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar4 = nVarArr[2];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.subcategories.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureSubCategoryFragment f300435c;

            {
                this.f300435c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = this.f300435c;
                switch (i12) {
                    case 0:
                        ConstructorConfigureSubCategoryFragment.a aVar = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL1 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        ConstructorConfigureSubCategoryFragment.a aVar2 = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL12 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL12 != null) {
                            activityC22955mL12.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = constructorConfigureSubCategoryFragment.f300421p0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.r0();
                        break;
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.category_title);
        C47313c c47313c2 = this.f300427v0;
        n<Object> nVar5 = nVarArr[3];
        c47313c2.b(this, textView);
        Button button = (Button) view.findViewById(R.id.category_button);
        C47313c c47313c3 = this.f300428w0;
        n<Object> nVar6 = nVarArr[4];
        c47313c3.b(this, button);
        final int i13 = 1;
        q5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.subcategories.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureSubCategoryFragment f300435c;

            {
                this.f300435c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = this.f300435c;
                switch (i13) {
                    case 0:
                        ConstructorConfigureSubCategoryFragment.a aVar = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL1 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        ConstructorConfigureSubCategoryFragment.a aVar2 = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL12 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL12 != null) {
                            activityC22955mL12.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = constructorConfigureSubCategoryFragment.f300421p0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.r0();
                        break;
                }
            }
        });
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c4 = this.f300425t0;
        n<Object> nVar7 = nVarArr[1];
        c47313c4.b(this, lVar);
        r5().f231600j = new b();
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c5 = this.f300431z0;
        n<Object> nVar8 = nVarArr[7];
        c47313c5.b(this, spinner);
        Button button2 = (Button) view.findViewById(R.id.continue_button);
        C47313c c47313c6 = this.f300429x0;
        n<Object> nVar9 = nVarArr[5];
        c47313c6.b(this, button2);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.constructor_configure_sub_categories_bottom_block);
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 24));
        C47313c c47313c7 = this.f300430y0;
        n<Object> nVar10 = nVarArr[6];
        c47313c7.b(this, viewGroup);
        n<Object> nVar11 = nVarArr[5];
        final int i14 = 2;
        ((Button) c47313c6.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.subcategories.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureSubCategoryFragment f300435c;

            {
                this.f300435c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConstructorConfigureSubCategoryFragment constructorConfigureSubCategoryFragment = this.f300435c;
                switch (i14) {
                    case 0:
                        ConstructorConfigureSubCategoryFragment.a aVar = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL1 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        ConstructorConfigureSubCategoryFragment.a aVar2 = ConstructorConfigureSubCategoryFragment.f300415C0;
                        ActivityC22955m activityC22955mL12 = constructorConfigureSubCategoryFragment.l1();
                        if (activityC22955mL12 != null) {
                            activityC22955mL12.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = constructorConfigureSubCategoryFragment.f300421p0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.r0();
                        break;
                }
            }
        });
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar = this.f300421p0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.getF300535c0().observe(getViewLifecycleOwner(), new a.C9185a(new c(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar2 = this.f300421p0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.getF300538f0().observe(getViewLifecycleOwner(), new a.C9185a(new d(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar3 = this.f300421p0;
        if (hVar3 == null) {
            hVar3 = null;
        }
        hVar3.getF300536d0().observe(getViewLifecycleOwner(), new a.C9185a(new e(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar4 = this.f300421p0;
        if (hVar4 == null) {
            hVar4 = null;
        }
        hVar4.k0().observe(getViewLifecycleOwner(), new a.C9185a(new f(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar5 = this.f300421p0;
        if (hVar5 == null) {
            hVar5 = null;
        }
        hVar5.getF300534b0().observe(getViewLifecycleOwner(), new a.C9185a(new g(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar6 = this.f300421p0;
        if (hVar6 == null) {
            hVar6 = null;
        }
        hVar6.getF300540h0().observe(getViewLifecycleOwner(), new a.C9185a(new h(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar7 = this.f300421p0;
        if (hVar7 == null) {
            hVar7 = null;
        }
        hVar7.getF300539g0().observe(getViewLifecycleOwner(), new a.C9185a(new i(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar8 = this.f300421p0;
        if (hVar8 == null) {
            hVar8 = null;
        }
        hVar8.getF300537e0().observe(getViewLifecycleOwner(), new a.C9185a(new j(this)));
        com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h hVar9 = this.f300421p0;
        if (hVar9 == null) {
            hVar9 = null;
        }
        hVar9.getF300533a0().observe(getViewLifecycleOwner(), new a.C9185a(new k(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f300422q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final Button q5() {
        C47313c c47313c = this.f300428w0;
        n<Object> nVar = f300416D0[4];
        return (Button) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f300425t0;
        n<Object> nVar = f300416D0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
