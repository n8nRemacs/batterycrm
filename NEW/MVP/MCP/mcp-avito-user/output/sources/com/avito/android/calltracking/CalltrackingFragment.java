package com.avito.android.calltracking;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.calltracking.I;
import com.avito.android.calltracking.U;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.architecture_components.C35748b;
import com.avito.android.util.architecture_components.C35750d;
import com.avito.android.util.architecture_components.C35751e;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/calltracking/CalltrackingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalltrackingFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f113554s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public M f113555n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.jakewharton.rxrelay3.c<I> f113556o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public y f113557p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC29279g f113558q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f113559r0;

    /* compiled from: CalltrackingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/calltracking/CalltrackingFragment$a;", "", "<init>", "()V", "", "EXTRA_SCREEN_TYPE", "Ljava/lang/String;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CalltrackingFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/architecture_components/b;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/architecture_components/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C35748b<?>, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C35748b<?> c35748b) {
            U.a aVarA;
            C35748b<?> c35748b2 = c35748b;
            a aVar = CalltrackingFragment.f113554s0;
            CalltrackingFragment calltrackingFragment = CalltrackingFragment.this;
            if (!c35748b2.f318808b) {
                if (c35748b2 instanceof C35750d) {
                    ActivityC22955m activityC22955mL1 = calltrackingFragment.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.finish();
                    }
                } else if (c35748b2 instanceof com.avito.android.util.architecture_components.F) {
                    C35751e c35751eA = ((com.avito.android.util.architecture_components.F) c35748b2).a();
                    if (c35751eA != null) {
                        ActivityC22955m activityC22955mL12 = calltrackingFragment.l1();
                        if (activityC22955mL12 != null) {
                            activityC22955mL12.finish();
                        }
                        calltrackingFragment.startActivity(c35751eA.f318812a);
                    }
                } else {
                    if (c35748b2 instanceof com.avito.android.util.architecture_components.G) {
                        if (((com.avito.android.util.architecture_components.G) c35748b2).a() != null) {
                            calltrackingFragment.startActivityForResult(null, 0);
                        }
                    } else if ((c35748b2 instanceof U) && (aVarA = ((U) c35748b2).a()) != null) {
                        View viewInflate = LayoutInflater.from(calltrackingFragment.requireContext()).inflate(R.layout.calltracking_bottom_sheet, (ViewGroup) null);
                        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(calltrackingFragment.requireContext(), 0, 2, null);
                        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                        dVar.G(viewInflate, true);
                        dVar.setCancelable(true);
                        dVar.setCanceledOnTouchOutside(true);
                        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(calltrackingFragment, 14));
                        C29277e c29277e = new C29277e(viewInflate);
                        InterfaceC29279g interfaceC29279g = calltrackingFragment.f113558q0;
                        (interfaceC29279g != null ? interfaceC29279g : null).a(c29277e, aVarA.f113635a, aVarA.f113636b);
                        com.avito.android.lib.util.g.a(dVar);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CalltrackingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f113561b;

        public c(Y41.l lVar) {
            this.f113561b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f113561b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f113561b;
        }

        public final int hashCode() {
            return this.f113561b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113561b.invoke(obj);
        }
    }

    public CalltrackingFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_calltracking, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        y yVar = this.f113557p0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.t();
        InterfaceC29279g interfaceC29279g = this.f113558q0;
        if (interfaceC29279g == null) {
            interfaceC29279g = null;
        }
        interfaceC29279g.clear();
        M m12 = this.f113555n0;
        if (m12 == null) {
            m12 = null;
        }
        m12.k0().removeObservers(getViewLifecycleOwner());
        M m13 = this.f113555n0;
        (m13 != null ? m13 : null).ba();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.jakewharton.rxrelay3.c<I> cVar = this.f113556o0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.accept(I.e.f113579a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        y yVar = this.f113557p0;
        if (yVar == null) {
            yVar = null;
        }
        com.avito.konveyor.adapter.j jVar = this.f113559r0;
        if (jVar == null) {
            jVar = null;
        }
        yVar.a(new K(view, jVar));
        M m12 = this.f113555n0;
        if (m12 == null) {
            m12 = null;
        }
        com.jakewharton.rxrelay3.c<I> cVar = this.f113556o0;
        if (cVar == null) {
            cVar = null;
        }
        m12.a4(cVar);
        M m13 = this.f113555n0;
        (m13 != null ? m13 : null).k0().observe(getViewLifecycleOwner(), new c(new b()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        com.avito.android.calltracking.di.q.a().a((com.avito.android.calltracking.di.d) C29972i.a(C29972i.b(this), com.avito.android.calltracking.di.d.class), (com.avito.android.calltracking.di.f) C29972i.a(C29972i.b(this), com.avito.android.calltracking.di.f.class), cv.c.b(this), getResources(), new C29288p(this), CalltrackingScreenType.valueOf(arguments != null ? arguments.getString("extra_screen_type") : null)).a(this);
    }
}
