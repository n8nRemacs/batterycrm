package com.avito.android.beduin.v2.page.impl.compose;

import Cd.C13243a;
import Hi.InterfaceC13994a;
import Hi.e;
import Ii.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.C29270c0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.impl.InterfaceC28868e;
import com.avito.android.beduin.v2.page.impl.compose.j;
import com.avito.android.beduin.v2.page.impl.compose.k;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import dU.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BeduinV2PageComposeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/BeduinV2PageComposeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/beduin/v2/interaction/flow/keyboard/f;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/beduin/v2/page/impl/e;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2PageComposeFragment extends BaseFragment implements FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, com.avito.beduin.v2.interaction.flow.keyboard.f, InterfaceC28477j.b, InterfaceC28868e {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.v2.page.impl.compose.i f104914n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f104915o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C f104916p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C29270c0 f104917q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104918r0;

    /* renamed from: s0, reason: collision with root package name */
    public ScreenPerformanceTracker f104919s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104920t0;

    /* renamed from: u0, reason: collision with root package name */
    public p f104921u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104922v0;

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = BeduinV2PageComposeFragment.this.f104919s0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            BeduinV2PageComposeFragment.this.i0();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                BeduinV2PageComposeFragment beduinV2PageComposeFragment = BeduinV2PageComposeFragment.this;
                q.b((com.avito.android.analytics.screens.compose.a) beduinV2PageComposeFragment.f104920t0.getValue(), r.c(-1848244653, new com.avito.android.beduin.v2.page.impl.compose.b(beduinV2PageComposeFragment), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/j;", "invoke", "()Lcom/avito/android/beduin/v2/page/impl/compose/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.beduin.v2.page.impl.compose.j> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.v2.page.impl.compose.j invoke() {
            j.a aVar = com.avito.android.beduin.v2.page.impl.compose.j.f104982d;
            Bundle arguments = BeduinV2PageComposeFragment.this.getArguments();
            aVar.getClass();
            String string = arguments != null ? arguments.getString("pagePath") : null;
            if (string == null) {
                string = "";
            }
            String string2 = arguments != null ? arguments.getString("scenarioParentId") : null;
            if (string2 == null) {
                string2 = "";
            }
            String string3 = arguments != null ? arguments.getString("scenarioId") : null;
            if (string3 == null) {
                string3 = "";
            }
            String string4 = arguments != null ? arguments.getString("screenName") : null;
            String str = string4 != null ? string4 : "";
            if (arguments != null) {
                arguments.getBoolean("scrollOnKeyboardShown", false);
            }
            return new com.avito.android.beduin.v2.page.impl.compose.j(string, string2, string3, str);
        }
    }

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<List<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final List<FV0.h> invoke() {
            Set<FV0.h> set = BeduinV2PageComposeFragment.this.q5().f104939J;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!(((FV0.h) obj) instanceof com.avito.beduin.v2.repository.environment.interactions.e)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f104928l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f104928l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f104928l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinV2PageComposeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f104930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f104930l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104930l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104931l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104931l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104931l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104932l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104932l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104932l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinV2PageComposeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/beduin/v2/page/impl/compose/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.beduin.v2.page.impl.compose.d> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.v2.page.impl.compose.d invoke() {
            com.avito.android.beduin.v2.page.impl.compose.i iVar = BeduinV2PageComposeFragment.this.f104914n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.beduin.v2.page.impl.compose.d) iVar.get();
        }
    }

    public BeduinV2PageComposeFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f104915o0 = new O0(m0.f406844a.b(com.avito.android.beduin.v2.page.impl.compose.d.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f104918r0 = C42727D.c(new d());
        this.f104920t0 = C42727D.c(new a());
        this.f104922v0 = C42727D.c(new e());
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // com.avito.beduin.v2.interaction.flow.keyboard.f
    public final void L4(boolean z12) {
        q5().le(new InterfaceC13994a.b(new Hi.f(z12)));
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        q5().le(new InterfaceC13994a.c(new e.b(str, str2, c36216aArr != null ? C42756l.g0(c36216aArr) : null, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3)));
        return new com.avito.android.beduin.v2.page.impl.compose.a(this, 0);
    }

    @Override // FV0.d
    public final void close() {
        androidx.core.content.j jVarRequireActivity = requireActivity();
        G0 g02 = null;
        com.avito.android.beduin.v2.page.i iVar = jVarRequireActivity instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) jVarRequireActivity : null;
        if (iVar != null) {
            iVar.w1();
            g02 = G0.f406611a;
        } else {
            InterfaceC23487e parentFragment = getParentFragment();
            com.avito.android.beduin.v2.page.i iVar2 = parentFragment instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) parentFragment : null;
            if (iVar2 != null) {
                iVar2.w1();
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            requireActivity().finish();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.beduin.v2.page.impl.InterfaceC28868e
    public final void i0() {
        q5().accept(new k.a(InterfaceC40047a.C11082a.f395204a));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        InterfaceC42726C interfaceC42726C = this.f104918r0;
        this.f104919s0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(((com.avito.android.beduin.v2.page.impl.compose.j) interfaceC42726C.getValue()).f104984b, s.c(this), null, 4, null));
        f.a aVarKa = ((f.b) C29972i.a(C29972i.b(this), f.b.class)).ka();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f104919s0;
        aVarKa.a(new C31138n0(K.a(aVarEd, screenPerformanceTracker == null ? null : screenPerformanceTracker, ((com.avito.android.beduin.v2.page.impl.compose.j) interfaceC42726C.getValue()).f104985c, cv.c.d(this), null, null, new ZS.c(true), 24)), ((com.avito.android.beduin.v2.page.impl.compose.j) interfaceC42726C.getValue()).f104983a).b(this);
        this.f104921u0 = ((p.b) C29972i.a(C29972i.b(this), p.b.class)).E8().f393874a.a(requireContext(), dU.s.f393875a, q5().f104938E);
        C c12 = this.f104916p0;
        if (c12 == null) {
            c12 = null;
        }
        c12.getF125491k().getClass();
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f104919s0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f104919s0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).c(this, g5());
        C19918B.a(requireActivity().getF21241d(), this, new b(), 2);
        FV0.i.a((Collection) this.f104922v0.getValue(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f104919s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-1949278285, new c(), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b((Collection) this.f104922v0.getValue());
        super.onDestroy();
    }

    public final com.avito.android.beduin.v2.page.impl.compose.d q5() {
        return (com.avito.android.beduin.v2.page.impl.compose.d) this.f104915o0.getValue();
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        q5().le(new InterfaceC13994a.c(new e.a(d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar)));
        return new com.avito.android.beduin.v2.page.impl.compose.a(this, 1);
    }

    @Override // FV0.c
    @Y61.k
    public final Fragment j1() {
        return this;
    }
}
