package com.avito.android.tariff.cpa.configure_info;

import Y41.l;
import Y61.k;
import aB0.C19752a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.TariffCpaConfigureInfoScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.tariff.cpa.configure_info.CpaConfigureInfoFragment;
import com.avito.android.tariff.cpa.configure_info.di.i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.konveyor.adapter.j;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;

/* compiled from: CpaConfigureInfoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/CpaConfigureInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class CpaConfigureInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @k
    public static final a f294438y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f294439z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f294440n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f294441o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpa.configure_info.viewmodel.k f294442p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f294443q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C19752a f294444r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f294445s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f294446t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47312b f294447u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f294448v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f294449w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47313c f294450x0;

    /* compiled from: CpaConfigureInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/CpaConfigureInfoFragment$a;", "", "<init>", "()V", "", "KEY_CPA_CONTEXT", "Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpaConfigureInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar = CpaConfigureInfoFragment.this.f294442p0;
            if (kVar == null) {
                kVar = null;
            }
            kVar.h0();
            return G0.f406611a;
        }
    }

    /* compiled from: CpaConfigureInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f294452b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(l lVar) {
            this.f294452b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f294452b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f294452b;
        }

        public final int hashCode() {
            return this.f294452b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f294452b.invoke(obj);
        }
    }

    static {
        Y y12 = new Y(CpaConfigureInfoFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f294439z0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CpaConfigureInfoFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpaConfigureInfoFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpaConfigureInfoFragment.class, "btnContinue", "getBtnContinue()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f294438y0 = new a(null);
    }

    public CpaConfigureInfoFragment() {
        super(0, 1, null);
        this.f294447u0 = new C47312b(null, 1, null);
        this.f294448v0 = new C47313c(null, 1, null);
        this.f294449w0 = new C47313c(null, 1, null);
        this.f294450x0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        String string;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("cpaContext")) == null) {
            throw new IllegalStateException("publication context must be set");
        }
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        i.a().a(this, (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), string, TariffCpaConfigureInfoScreen.f90527d, s.c(this)).a(this);
        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar = this.f294442p0;
        if (kVar == null) {
            kVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f294445s0;
        if (set == null) {
            set = null;
        }
        kVar.a(set);
        ScreenPerformanceTracker screenPerformanceTracker = this.f294443q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f294446t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f294443q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.cpa_configure_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f294439z0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f294447u0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        j jVar = this.f294441o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        C19752a c19752a = this.f294444r0;
        if (c19752a == null) {
            c19752a = null;
        }
        recyclerView3.l(c19752a, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f294449w0;
        n<Object> nVar4 = nVarArr[2];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[2];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpa.configure_info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpaConfigureInfoFragment f294454c;

            {
                this.f294454c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpaConfigureInfoFragment cpaConfigureInfoFragment = this.f294454c;
                switch (i12) {
                    case 0:
                        CpaConfigureInfoFragment.a aVar = CpaConfigureInfoFragment.f294438y0;
                        ActivityC22955m activityC22955mL1 = cpaConfigureInfoFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar = cpaConfigureInfoFragment.f294442p0;
                        if (kVar == null) {
                            kVar = null;
                        }
                        kVar.e6();
                        break;
                }
            }
        });
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f294448v0;
        n<Object> nVar6 = nVarArr[1];
        c47313c2.b(this, lVar);
        r5().f231600j = new b();
        Button button = (Button) view.findViewById(R.id.btn_continue);
        C47313c c47313c3 = this.f294450x0;
        n<Object> nVar7 = nVarArr[3];
        c47313c3.b(this, button);
        final int i13 = 1;
        q5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpa.configure_info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpaConfigureInfoFragment f294454c;

            {
                this.f294454c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpaConfigureInfoFragment cpaConfigureInfoFragment = this.f294454c;
                switch (i13) {
                    case 0:
                        CpaConfigureInfoFragment.a aVar = CpaConfigureInfoFragment.f294438y0;
                        ActivityC22955m activityC22955mL1 = cpaConfigureInfoFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar = cpaConfigureInfoFragment.f294442p0;
                        if (kVar == null) {
                            kVar = null;
                        }
                        kVar.e6();
                        break;
                }
            }
        });
        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar = this.f294442p0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.getF294559R().observe(getViewLifecycleOwner(), new c(new com.avito.android.tariff.cpa.configure_info.b(this)));
        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar2 = this.f294442p0;
        if (kVar2 == null) {
            kVar2 = null;
        }
        kVar2.k0().observe(getViewLifecycleOwner(), new c(new com.avito.android.tariff.cpa.configure_info.c(this)));
        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar3 = this.f294442p0;
        if (kVar3 == null) {
            kVar3 = null;
        }
        kVar3.t0().observe(getViewLifecycleOwner(), new c(new d(this)));
        com.avito.android.tariff.cpa.configure_info.viewmodel.k kVar4 = this.f294442p0;
        if (kVar4 == null) {
            kVar4 = null;
        }
        kVar4.getF294557P().observe(getViewLifecycleOwner(), new c(new e(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f294443q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final Button q5() {
        C47313c c47313c = this.f294450x0;
        n<Object> nVar = f294439z0[3];
        return (Button) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f294448v0;
        n<Object> nVar = f294439z0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
