package com.avito.android.publish.params_suggest;

import Id0.InterfaceC14062b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.di.C29972i;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.publish.C0;
import com.avito.android.publish.Q0;
import com.avito.android.publish.params_suggest.f;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ParamsSuggestionsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/params_suggest/ParamsSuggestionsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ParamsSuggestionsFragment extends Fragment implements com.avito.android.ui.fragments.c, InterfaceC14062b, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f238174n0 = {m0.f406844a.e(new Y(ParamsSuggestionsFragment.class, "stepIndex", "getStepIndex()I", 0))};

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public u f238175f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f238176g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public Z f238177h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public C0 f238178i0;

    /* renamed from: j0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f238179j0;

    /* renamed from: k0, reason: collision with root package name */
    public s f238180k0;

    /* renamed from: l0, reason: collision with root package name */
    public F f238181l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final kotlin.properties.h f238182m0;

    public ParamsSuggestionsFragment() {
        kotlin.properties.c.f406879a.getClass();
        this.f238182m0 = kotlin.properties.c.a();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        C0 c02 = this.f238178i0;
        if (c02 == null) {
            c02 = null;
        }
        c02.ye();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        List<CategoryPublishStep> steps;
        super.onActivityCreated(bundle);
        s sVar = this.f238180k0;
        String strO = null;
        if (sVar == null) {
            sVar = null;
        }
        int iIntValue = ((Number) this.f238182m0.getValue(this, f238174n0[0])).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        C0 c02 = sVar.f238243K;
        CategoryPublishStep categoryPublishStepRe = c02.re(numValueOf);
        if (categoryPublishStepRe == null) {
            return;
        }
        if (categoryPublishStepRe instanceof CategoryPublishStep.Request) {
            if (!L.f(((CategoryPublishStep.Request) categoryPublishStepRe).getShouldSkip(), Boolean.FALSE)) {
                c02.xe(null);
                return;
            }
            I<List<d>> iA2 = sVar.f238241E.a(c02.f231861Y.getNavigation(), c02.f231873k0);
            InterfaceC35745a5 interfaceC35745a5 = sVar.f238242J;
            z<T> zVarR0 = iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).F().d0(n.f238236b).m0(o.f238237b).r0(P2.c.f318721a);
            p pVar = new p(sVar);
            l41.g<? super Throwable> qVar = new q<>(sVar);
            zVarR0.getClass();
            sVar.f238245M.b(zVarR0.v0(pVar, qVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
            return;
        }
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters != null && (steps = categoryParameters.getSteps()) != null) {
            strO = C42745f0.O(steps, null, null, null, r.f238240l, 31);
        }
        StringBuilder sbJ = G.j(iIntValue, "Wrong step in ParamsSuggestionsViewModel!\n                | vm.stepIndex=", ",\n                | state.stepIndex=");
        sbJ.append(c02.f231861Y.getStepIndex());
        sbJ.append(",\n                | navigation=");
        sbJ.append(c02.f231861Y.getNavigation());
        sbJ.append(",\n                | steps=");
        sbJ.append(strO);
        String strF0 = C43066x.F0(sbJ.toString());
        c02.f231846J.r(strF0, new IllegalStateException(strF0), NonFatalErrorEvent.a.C4323a.f147930a);
        c02.f231859W.postValue(Q0.z.f232069c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments.getInt("step_index");
        kotlin.properties.h hVar = this.f238182m0;
        kotlin.reflect.n<?>[] nVarArr = f238174n0;
        hVar.setValue(this, nVarArr[0], Integer.valueOf(i12));
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.publish.params_suggest.di.a.a().a((com.avito.android.publish.params_suggest.di.d) C29972i.a(C29972i.b(this), com.avito.android.publish.params_suggest.di.d.class), ((Number) hVar.getValue(this, nVarArr[0])).intValue()).b(this);
        Z z12 = this.f238177h0;
        if (z12 == null) {
            z12 = null;
        }
        z12.a(fA2.b());
        u uVar = this.f238175f0;
        this.f238180k0 = (s) R0.a(this, uVar != null ? uVar : null).a(s.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        D.f90335a.getClass();
        this.f238181l0 = D.a.a();
        return layoutInflater.inflate(R.layout.loading_progress_overlay_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f238176g0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 18, null);
        this.f238179j0 = lVar;
        lVar.k(null);
        s sVar = this.f238180k0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.f238246N.observe(getViewLifecycleOwner(), new f.a(new e(this)));
        Z z12 = this.f238177h0;
        if (z12 == null) {
            z12 = null;
        }
        F f12 = this.f238181l0;
        z12.b((f12 != null ? f12 : null).b());
    }
}
