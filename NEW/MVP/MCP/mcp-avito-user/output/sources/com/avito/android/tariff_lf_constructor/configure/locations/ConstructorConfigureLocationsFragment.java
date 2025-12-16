package com.avito.android.tariff_lf_constructor.configure.locations;

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
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.tariff_lf_constructor.configure.locations.m;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import gD0.InterfaceC40574b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
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
import oD0.C44629c;
import qK0.C47312b;
import qK0.C47313c;
import xZ.C49899a;

/* compiled from: ConstructorConfigureLocationsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/ConstructorConfigureLocationsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorConfigureLocationsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f299851F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f299852G0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299853A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299854B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public y f299855C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f299856D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public C49899a f299857E0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f299858n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f299859o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i f299860p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f299861q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C44629c f299862r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f299863s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47312b f299864t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299865u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299866v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299867w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299868x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299869y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f299870z0;

    /* compiled from: ConstructorConfigureLocationsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/ConstructorConfigureLocationsFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorConfigureLocationsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar = ConstructorConfigureLocationsFragment.this.f299860p0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(ConstructorConfigureLocationsFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f299852G0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "searchEditText", "getSearchEditText()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "emptySearchText", "getEmptySearchText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "bottomBlockView", "getBottomBlockView()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorConfigureLocationsFragment.class, "updatePackageProgressBar", "getUpdatePackageProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var)};
        f299851F0 = new a(null);
    }

    public ConstructorConfigureLocationsFragment() {
        super(0, 1, null);
        this.f299864t0 = new C47312b(null, 1, null);
        this.f299865u0 = new C47313c(null, 1, null);
        this.f299866v0 = new C47313c(null, 1, null);
        this.f299867w0 = new C47313c(null, 1, null);
        this.f299868x0 = new C47313c(null, 1, null);
        this.f299869y0 = new C47313c(null, 1, null);
        this.f299870z0 = new C47313c(null, 1, null);
        this.f299853A0 = new C47313c(null, 1, null);
        this.f299854B0 = new C47313c(null, 1, null);
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
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement CreateTariffRouter");
        }
        this.f299856D0 = lVar;
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
        com.avito.android.tariff_lf_constructor.configure.locations.di.j.a().a(this, string, string2, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f299861q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar = this.f299860p0;
        if (iVar == null) {
            iVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f299863s0;
        iVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f299861q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_configure_locations_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        y yVar = this.f299855C0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        kotlin.reflect.n<Object>[] nVarArr = f299852G0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        this.f299864t0.b(this, recyclerView);
        RecyclerView recyclerViewR5 = r5();
        com.avito.konveyor.adapter.j jVar = this.f299859o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewR5.setAdapter(jVar);
        RecyclerView recyclerViewR52 = r5();
        C44629c c44629c = this.f299862r0;
        if (c44629c == null) {
            c44629c = null;
        }
        recyclerViewR52.l(c44629c, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f299866v0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[2];
        c47313c.b(this, toolbar);
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.locations.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureLocationsFragment f299873c;

            {
                this.f299873c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = this.f299873c.f299856D0;
                        if (lVar != null) {
                            lVar.x0(true);
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar = this.f299873c.f299860p0;
                        if (iVar == null) {
                            iVar = null;
                        }
                        iVar.r0();
                        break;
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.title);
        C47313c c47313c2 = this.f299867w0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[3];
        c47313c2.b(this, textView);
        Input input = (Input) view.findViewById(R.id.search_edit_text);
        C47313c c47313c3 = this.f299868x0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c3.b(this, input);
        TextView textView2 = (TextView) view.findViewById(R.id.empty_text_view);
        C47313c c47313c4 = this.f299869y0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[5];
        c47313c4.b(this, textView2);
        Button button = (Button) view.findViewById(R.id.continue_button);
        C47313c c47313c5 = this.f299870z0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[6];
        c47313c5.b(this, button);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.constructor_configure_locations_bottom_block);
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 23));
        C47313c c47313c6 = this.f299853A0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[7];
        c47313c6.b(this, viewGroup);
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c7 = this.f299854B0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c7.b(this, spinner);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c8 = this.f299865u0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[1];
        c47313c8.b(this, lVar);
        q5().f231600j = new b();
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar = this.f299860p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getF299999V().observe(getViewLifecycleOwner(), new m.a(new e(this)));
        kotlin.reflect.n<Object> nVar11 = nVarArr[4];
        com.avito.android.lib.design.input.n.c((Input) c47313c3.a(), new f(this));
        kotlin.reflect.n<Object> nVar12 = nVarArr[6];
        final int i13 = 1;
        ((Button) c47313c5.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.locations.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConstructorConfigureLocationsFragment f299873c;

            {
                this.f299873c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar2 = this.f299873c.f299856D0;
                        if (lVar2 != null) {
                            lVar2.x0(true);
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar2 = this.f299873c.f299860p0;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        iVar2.r0();
                        break;
                }
            }
        });
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar2 = this.f299860p0;
        if (iVar2 == null) {
            iVar2 = null;
        }
        iVar2.getF300000W().observe(getViewLifecycleOwner(), new m.a(new g(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar3 = this.f299860p0;
        if (iVar3 == null) {
            iVar3 = null;
        }
        iVar3.k0().observe(getViewLifecycleOwner(), new m.a(new h(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar4 = this.f299860p0;
        if (iVar4 == null) {
            iVar4 = null;
        }
        iVar4.getF299998U().observe(getViewLifecycleOwner(), new m.a(new i(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar5 = this.f299860p0;
        if (iVar5 == null) {
            iVar5 = null;
        }
        iVar5.getF300003Z().observe(getViewLifecycleOwner(), new m.a(new j(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar6 = this.f299860p0;
        if (iVar6 == null) {
            iVar6 = null;
        }
        iVar6.getF300004a0().observe(getViewLifecycleOwner(), new m.a(new k(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar7 = this.f299860p0;
        if (iVar7 == null) {
            iVar7 = null;
        }
        iVar7.getF299997T().observe(getViewLifecycleOwner(), new m.a(new l(this)));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar8 = this.f299860p0;
        if (iVar8 == null) {
            iVar8 = null;
        }
        iVar8.getF300002Y().observe(getViewLifecycleOwner(), new m.a(new com.avito.android.tariff_lf_constructor.configure.locations.b(this)));
        this.f299855C0 = (y) K2.h(requireActivity()).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new c(this));
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar9 = this.f299860p0;
        if (iVar9 == null) {
            iVar9 = null;
        }
        iVar9.getF300001X().observe(getViewLifecycleOwner(), new m.a(new d(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f299861q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f299865u0;
        kotlin.reflect.n<Object> nVar = f299852G0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final RecyclerView r5() {
        kotlin.reflect.n<Object> nVar = f299852G0[0];
        return (RecyclerView) this.f299864t0.a();
    }
}
