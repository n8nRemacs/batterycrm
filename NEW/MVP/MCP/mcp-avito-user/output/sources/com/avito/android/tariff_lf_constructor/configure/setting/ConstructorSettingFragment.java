package com.avito.android.tariff_lf_constructor.configure.setting;

import Y61.l;
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
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.tariff_lf_constructor.configure.setting.j;
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

/* compiled from: ConstructorSettingFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/ConstructorSettingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class ConstructorSettingFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f300022A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f300023B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f300024n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f300025o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j f300026p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f300027q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f300028r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public BD0.b f300029s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f300030t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47312b f300031u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300032v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300033w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300034x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f300035y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300036z0;

    /* compiled from: ConstructorSettingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/ConstructorSettingFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorSettingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar = ConstructorSettingFragment.this.f300026p0;
            if (jVar == null) {
                jVar = null;
            }
            jVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(ConstructorSettingFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f300023B0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ConstructorSettingFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorSettingFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorSettingFragment.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ConstructorSettingFragment.class, "savePackageProgressBar", "getSavePackageProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var)};
        f300022A0 = new a(null);
    }

    public ConstructorSettingFragment() {
        super(0, 1, null);
        this.f300031u0 = new C47312b(null, 1, null);
        this.f300032v0 = new C47313c(null, 1, null);
        this.f300033w0 = new C47313c(null, 1, null);
        this.f300034x0 = new C47313c(null, 1, null);
        this.f300035y0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = context instanceof com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l ? (com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l) context : null;
        if (lVar == null) {
            throw new IllegalStateException("Parent activity must implement ConstructorTariffRouter");
        }
        this.f300036z0 = lVar;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("configure_context") : null;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_constructor.configure.setting.di.h.a().a(this, string, (InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f300027q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar = this.f300026p0;
        if (jVar == null) {
            jVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f300030t0;
        jVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f300027q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.constructor_setting_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f300023B0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f300031u0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.j jVar = this.f300025o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        BD0.b bVar = this.f300029s0;
        if (bVar == null) {
            bVar = null;
        }
        recyclerView3.l(bVar, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f300033w0;
        n<Object> nVar4 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[2];
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 10));
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        C47313c c47313c2 = this.f300034x0;
        n<Object> nVar6 = nVarArr[3];
        c47313c2.b(this, textView);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c3 = this.f300032v0;
        n<Object> nVar7 = nVarArr[1];
        c47313c3.b(this, lVar);
        q5().f231600j = new b();
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c4 = this.f300035y0;
        n<Object> nVar8 = nVarArr[4];
        c47313c4.b(this, spinner);
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar2 = this.f300026p0;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.getF300214Y().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.tariff_lf_constructor.configure.setting.a(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar3 = this.f300026p0;
        if (jVar3 == null) {
            jVar3 = null;
        }
        jVar3.getF300215Z().observe(getViewLifecycleOwner(), new j.a(new com.avito.android.tariff_lf_constructor.configure.setting.b(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar4 = this.f300026p0;
        if (jVar4 == null) {
            jVar4 = null;
        }
        jVar4.y8().observe(getViewLifecycleOwner(), new j.a(new c(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar5 = this.f300026p0;
        if (jVar5 == null) {
            jVar5 = null;
        }
        jVar5.Jc().observe(getViewLifecycleOwner(), new j.a(new d(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar6 = this.f300026p0;
        if (jVar6 == null) {
            jVar6 = null;
        }
        jVar6.k0().observe(getViewLifecycleOwner(), new j.a(new e(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar7 = this.f300026p0;
        if (jVar7 == null) {
            jVar7 = null;
        }
        jVar7.y8().observe(getViewLifecycleOwner(), new j.a(new f(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar8 = this.f300026p0;
        if (jVar8 == null) {
            jVar8 = null;
        }
        jVar8.getF300217b0().observe(getViewLifecycleOwner(), new j.a(new g(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar9 = this.f300026p0;
        if (jVar9 == null) {
            jVar9 = null;
        }
        jVar9.getF300216a0().observe(getViewLifecycleOwner(), new j.a(new h(this)));
        com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j jVar10 = this.f300026p0;
        if (jVar10 == null) {
            jVar10 = null;
        }
        jVar10.getF300213X().observe(getViewLifecycleOwner(), new j.a(new i(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f300027q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f300032v0;
        n<Object> nVar = f300023B0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
