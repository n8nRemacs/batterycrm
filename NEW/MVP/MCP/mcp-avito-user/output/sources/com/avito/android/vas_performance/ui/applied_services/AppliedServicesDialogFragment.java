package com.avito.android.vas_performance.ui.applied_services;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mnz_common.ui.ActionFloatingFooter;
import com.avito.android.remote.model.Action;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.di.applied_services.a;
import com.avito.android.vas_performance.ui.applied_services.AppliedServicesDialogFragment;
import com.avito.android.vas_performance.ui.applied_services.j;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xZ.C49899a;

/* compiled from: AppliedServicesDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/AppliedServicesDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppliedServicesDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f321405s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public RecyclerView f321406h0;

    /* renamed from: i0, reason: collision with root package name */
    public ActionFloatingFooter f321407i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f321408j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public j f321409k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f321410l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f321411m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f321412n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f321413o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.vas_performance.screens.applied_services.ui.a f321414p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public C49899a f321415q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321416r0;

    /* compiled from: AppliedServicesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/AppliedServicesDialogFragment$a;", "", "<init>", "()V", "", "KEY_ADVERT_ID", "Ljava/lang/String;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AppliedServicesDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f321417b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f321417b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f321417b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f321417b;
        }

        public final int hashCode() {
            return this.f321417b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f321417b.invoke(obj);
        }
    }

    public AppliedServicesDialogFragment() {
        super(0, 1, null);
        this.f321416r0 = new io.reactivex.rxjava3.disposables.c();
    }

    public final void f5(List<? extends TV0.a> list) {
        com.avito.android.vas_performance.screens.applied_services.ui.a aVar = this.f321414p0;
        if (aVar != null) {
            aVar.B();
        }
        com.avito.konveyor.adapter.a aVar2 = this.f321411m0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
        RecyclerView recyclerView = this.f321406h0;
        RecyclerView.Adapter adapter = (recyclerView != null ? recyclerView : null).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        com.avito.android.lib.design.bottom_sheet.q qVar = ((com.avito.android.lib.design.bottom_sheet.d) getDialog()).f178530x;
        if (qVar != null) {
            qVar.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        super.onAttach(context);
        com.avito.android.vas_performance.screens.applied_services.ui.a aVar = context instanceof com.avito.android.vas_performance.screens.applied_services.ui.a ? (com.avito.android.vas_performance.screens.applied_services.ui.a) context : null;
        if (aVar == null) {
            throw new IllegalStateException("context must implement AppliedServiceListener");
        }
        this.f321414p0 = aVar;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("advert_id")) == null) {
            throw new IllegalStateException("advert id must be set");
        }
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC9914a interfaceC9914aA = com.avito.android.vas_performance.di.applied_services.h.a();
        interfaceC9914aA.b(new com.avito.android.vas_performance.di.applied_services.c(this, string));
        interfaceC9914aA.d((com.avito.android.vas_performance.di.applied_services.b) C29972i.a(C29972i.b(this), com.avito.android.vas_performance.di.applied_services.b.class));
        interfaceC9914aA.a(cv.c.b(this));
        interfaceC9914aA.c(com.avito.android.analytics.screens.s.b(this));
        interfaceC9914aA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f321413o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f321413o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.D(R.layout.applied_services_fragment, true);
        com.avito.android.lib.design.bottom_sheet.j.a(dVar, false, true, Integer.valueOf(C35835l0.d(R.attr.blackAlpha8, dVar.getContext())));
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        this.f321406h0 = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        ActionFloatingFooter actionFloatingFooter = (ActionFloatingFooter) dVar.findViewById(R.id.applied_services_action_floating_footer);
        this.f321407i0 = actionFloatingFooter;
        actionFloatingFooter.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.avito.android.vas_performance.ui.applied_services.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                AppliedServicesDialogFragment.a aVar = AppliedServicesDialogFragment.f321405s0;
                if (view.getHeight() > 0) {
                    AppliedServicesDialogFragment appliedServicesDialogFragment = this.f321418b;
                    C49899a c49899a = appliedServicesDialogFragment.f321415q0;
                    if (c49899a != null) {
                        RecyclerView recyclerView = appliedServicesDialogFragment.f321406h0;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        recyclerView.r0(c49899a);
                    }
                    C49899a c49899a2 = new C49899a(view.getHeight());
                    RecyclerView recyclerView2 = appliedServicesDialogFragment.f321406h0;
                    (recyclerView2 != null ? recyclerView2 : null).l(c49899a2, -1);
                    appliedServicesDialogFragment.f321415q0 = c49899a2;
                }
            }
        });
        com.avito.konveyor.adapter.a aVar = this.f321411m0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f321410l0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        Resources resources = requireContext().getResources();
        RecyclerView recyclerView = this.f321406h0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f321406h0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.l(new com.avito.android.vas_performance.ui.recycler.a(resources), -1);
        j jVar2 = this.f321409k0;
        if (jVar2 == null) {
            jVar2 = null;
        }
        Set<TV0.d<?, ?>> set = this.f321408j0;
        if (set == null) {
            set = null;
        }
        jVar2.z(set);
        j jVar3 = this.f321409k0;
        if (jVar3 == null) {
            jVar3 = null;
        }
        jVar3.k0().observe(requireActivity(), new b(new d(this)));
        j jVar4 = this.f321409k0;
        if (jVar4 == null) {
            jVar4 = null;
        }
        jVar4.getF321455S().observe(requireActivity(), new InterfaceC23040h0() { // from class: com.avito.android.vas_performance.ui.applied_services.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                com.avito.android.vas_performance.screens.applied_services.ui.a aVar3;
                P2 p22 = (P2) obj;
                AppliedServicesDialogFragment.a aVar4 = AppliedServicesDialogFragment.f321405s0;
                if (p22 == null) {
                    return;
                }
                boolean z12 = p22 instanceof P2.b;
                AppliedServicesDialogFragment appliedServicesDialogFragment = this.f321419b;
                if (!z12) {
                    if (p22 instanceof P2.a) {
                        com.avito.android.vas_performance.screens.applied_services.ui.a aVar5 = appliedServicesDialogFragment.f321414p0;
                        if (aVar5 != null) {
                            aVar5.v1(((P2.a) p22).f318719a);
                            return;
                        }
                        return;
                    }
                    if (!(p22 instanceof P2.c) || (aVar3 = appliedServicesDialogFragment.f321414p0) == null) {
                        return;
                    }
                    aVar3.t2();
                    return;
                }
                T t12 = ((P2.b) p22).f318720a;
                if (t12 instanceof List) {
                    appliedServicesDialogFragment.f5((List) t12);
                    return;
                }
                if (t12 instanceof j.a) {
                    j.a aVar6 = (j.a) t12;
                    Action action = aVar6.f321430c;
                    ActionFloatingFooter actionFloatingFooter2 = appliedServicesDialogFragment.f321407i0;
                    if (actionFloatingFooter2 == null) {
                        actionFloatingFooter2 = null;
                    }
                    Action action2 = aVar6.f321429b;
                    actionFloatingFooter2.setVisibility((action == null && action2 == null) ? 8 : 0);
                    ActionFloatingFooter actionFloatingFooter3 = appliedServicesDialogFragment.f321407i0;
                    if (actionFloatingFooter3 == null) {
                        actionFloatingFooter3 = null;
                    }
                    String title = action != null ? action.getTitle() : null;
                    g gVar = new g(action, appliedServicesDialogFragment);
                    Button button = actionFloatingFooter3.f197973b;
                    com.avito.android.lib.design.button.b.a(button, title, false);
                    button.setOnClickListener(new ru.avito.component.payments.method.b(7, gVar));
                    actionFloatingFooter3.a();
                    ActionFloatingFooter actionFloatingFooter4 = appliedServicesDialogFragment.f321407i0;
                    if (actionFloatingFooter4 == null) {
                        actionFloatingFooter4 = null;
                    }
                    String title2 = action2 != null ? action2.getTitle() : null;
                    h hVar = new h(action2, appliedServicesDialogFragment);
                    Button button2 = actionFloatingFooter4.f197975d;
                    com.avito.android.lib.design.button.b.a(button2, title2, false);
                    button2.setOnClickListener(new ru.avito.component.serp.job.d(1, hVar));
                    button2.setEnabled(true);
                    actionFloatingFooter4.a();
                    appliedServicesDialogFragment.f5(aVar6.f321428a);
                }
            }
        });
        j jVar5 = this.f321409k0;
        if (jVar5 == null) {
            jVar5 = null;
        }
        jVar5.getF321456T().observe(requireActivity(), new b(new e(this)));
        com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f321412n0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        this.f321416r0.b(aVar3.d9().t0(new c(this)));
        dVar.f178532z = false;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f321413o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f321416r0.e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f321414p0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}
