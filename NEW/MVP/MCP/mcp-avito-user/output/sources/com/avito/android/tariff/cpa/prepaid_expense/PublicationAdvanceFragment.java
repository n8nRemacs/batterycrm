package com.avito.android.tariff.cpa.prepaid_expense;

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
import com.avito.android.analytics.screens.TariffPublicationAdvanceScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.tariff.cpa.prepaid_expense.PublicationAdvanceFragment;
import com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
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
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;

/* compiled from: PublicationAdvanceFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/PublicationAdvanceFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class PublicationAdvanceFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f294939y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f294940z0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f294941n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public p f294942o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f294943p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f294944q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpa.prepaid_expense.ui.d f294945r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f294946s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47312b f294947t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f294948u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f294949v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f294950w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f294951x0;

    /* compiled from: PublicationAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/PublicationAdvanceFragment$a;", "", "<init>", "()V", "", "KEY_PUBLICATION_CONTEXT", "Ljava/lang/String;", "KEY_REQUEST_PUBLICATION_ADVANCE", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PublicationAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            p pVar = PublicationAdvanceFragment.this.f294942o0;
            if (pVar == null) {
                pVar = null;
            }
            pVar.h0();
            return G0.f406611a;
        }
    }

    /* compiled from: PublicationAdvanceFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f294953b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f294953b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f294953b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f294953b;
        }

        public final int hashCode() {
            return this.f294953b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f294953b.invoke(obj);
        }
    }

    static {
        Y y12 = new Y(PublicationAdvanceFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f294940z0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PublicationAdvanceFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PublicationAdvanceFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PublicationAdvanceFragment.class, "saveAdvanceProgressBar", "getSaveAdvanceProgressBar()Lcom/avito/android/lib/design/spinner/Spinner;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PublicationAdvanceFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f294939y0 = new a(null);
    }

    public PublicationAdvanceFragment() {
        super(0, 1, null);
        this.f294947t0 = new C47312b(null, 1, null);
        this.f294948u0 = new C47313c(null, 1, null);
        this.f294949v0 = new C47313c(null, 1, null);
        this.f294950w0 = new C47313c(null, 1, null);
        this.f294951x0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("publicationContext")) == null) {
            throw new IllegalStateException("publication context must be set");
        }
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpa.prepaid_expense.di.a.a().a(this, getResources(), (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), string, TariffPublicationAdvanceScreen.f90532d, s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f294944q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f294946s0;
        if (aVar == null) {
            aVar = null;
        }
        C49166b.c(aVar, C49166b.a(this));
        p pVar = this.f294942o0;
        if (pVar == null) {
            pVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f294943p0;
        pVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f294944q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.publication_advance_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            K2.c(activityC22955mL1);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        kotlin.reflect.n<Object>[] nVarArr = f294940z0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f294947t0;
        c47312b.b(this, recyclerView);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.d dVar = this.f294941n0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView2.setAdapter(dVar);
        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        com.avito.android.tariff.cpa.prepaid_expense.ui.d dVar2 = this.f294945r0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView3.l(dVar2, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f294948u0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        c47313c.b(this, toolbar);
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpa.prepaid_expense.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PublicationAdvanceFragment f294955c;

            {
                this.f294955c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PublicationAdvanceFragment publicationAdvanceFragment = this.f294955c;
                switch (i12) {
                    case 0:
                        PublicationAdvanceFragment.a aVar = PublicationAdvanceFragment.f294939y0;
                        ActivityC22955m activityC22955mL1 = publicationAdvanceFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        PublicationAdvanceFragment.a aVar2 = PublicationAdvanceFragment.f294939y0;
                        ActivityC22955m activityC22955mL12 = publicationAdvanceFragment.l1();
                        if (activityC22955mL12 != null) {
                            K2.c(activityC22955mL12);
                        }
                        p pVar = publicationAdvanceFragment.f294942o0;
                        if (pVar == null) {
                            pVar = null;
                        }
                        pVar.M1();
                        break;
                }
            }
        });
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f294949v0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        c47313c2.b(this, lVar);
        r5().f231600j = new b();
        Spinner spinner = (Spinner) view.findViewById(R.id.progress_bar);
        C47313c c47313c3 = this.f294950w0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[3];
        c47313c3.b(this, spinner);
        Button button = (Button) view.findViewById(R.id.button);
        C47313c c47313c4 = this.f294951x0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[4];
        c47313c4.b(this, button);
        final int i13 = 1;
        q5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpa.prepaid_expense.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PublicationAdvanceFragment f294955c;

            {
                this.f294955c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PublicationAdvanceFragment publicationAdvanceFragment = this.f294955c;
                switch (i13) {
                    case 0:
                        PublicationAdvanceFragment.a aVar = PublicationAdvanceFragment.f294939y0;
                        ActivityC22955m activityC22955mL1 = publicationAdvanceFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        PublicationAdvanceFragment.a aVar2 = PublicationAdvanceFragment.f294939y0;
                        ActivityC22955m activityC22955mL12 = publicationAdvanceFragment.l1();
                        if (activityC22955mL12 != null) {
                            K2.c(activityC22955mL12);
                        }
                        p pVar = publicationAdvanceFragment.f294942o0;
                        if (pVar == null) {
                            pVar = null;
                        }
                        pVar.M1();
                        break;
                }
            }
        });
        p pVar = this.f294942o0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.getF295110T().observe(getViewLifecycleOwner(), new c(new com.avito.android.tariff.cpa.prepaid_expense.b(this)));
        p pVar2 = this.f294942o0;
        if (pVar2 == null) {
            pVar2 = null;
        }
        pVar2.getF295109S().observe(getViewLifecycleOwner(), new c(new com.avito.android.tariff.cpa.prepaid_expense.c(this)));
        p pVar3 = this.f294942o0;
        if (pVar3 == null) {
            pVar3 = null;
        }
        pVar3.k0().observe(getViewLifecycleOwner(), new c(new d(this)));
        p pVar4 = this.f294942o0;
        if (pVar4 == null) {
            pVar4 = null;
        }
        pVar4.getF295116Z().observe(getViewLifecycleOwner(), new c(new e(this)));
        p pVar5 = this.f294942o0;
        if (pVar5 == null) {
            pVar5 = null;
        }
        pVar5.w1().observe(getViewLifecycleOwner(), new c(new f(this)));
        p pVar6 = this.f294942o0;
        if (pVar6 == null) {
            pVar6 = null;
        }
        pVar6.t0().observe(getViewLifecycleOwner(), new c(new g(this)));
        p pVar7 = this.f294942o0;
        if (pVar7 == null) {
            pVar7 = null;
        }
        pVar7.u1().observe(getViewLifecycleOwner(), new c(new h(this)));
        p pVar8 = this.f294942o0;
        if (pVar8 == null) {
            pVar8 = null;
        }
        pVar8.p1().observe(getViewLifecycleOwner(), new c(new l(this)));
        p pVar9 = this.f294942o0;
        if (pVar9 == null) {
            pVar9 = null;
        }
        pVar9.getF295112V().observe(getViewLifecycleOwner(), new c(new m(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f294944q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final Button q5() {
        C47313c c47313c = this.f294951x0;
        kotlin.reflect.n<Object> nVar = f294940z0[4];
        return (Button) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f294949v0;
        kotlin.reflect.n<Object> nVar = f294940z0[2];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }
}
