package com.avito.android.publish.free_delivery;

import Cd.C13243a;
import Y41.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.free_delivery.perf.FreeDeliveryPerfScreen;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import he0.C40926c;
import he0.InterfaceC40924a;
import he0.InterfaceC40925b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import u3.l;
import z1.AbstractC50339a;

/* compiled from: FreeDeliveryFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/publish/free_delivery/FreeDeliveryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/fragments/c;", "LId0/e;", "<init>", "()V", "a", "Lhe0/c;", VoiceInfo.STATE, "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FreeDeliveryFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.ui.fragments.c, Id0.e {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f235742u0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.free_delivery.j f235743n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f235744o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public C0 f235745p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public l<SimpleTestGroupWithNone> f235746q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f235747r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f235748s0;

    /* renamed from: t0, reason: collision with root package name */
    public com.avito.android.publish.free_delivery.h f235749t0;

    /* compiled from: FreeDeliveryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/free_delivery/FreeDeliveryFragment$a;", "", "<init>", "()V", "", "DISMISS_HINT_DELAY_MS", "J", "DISPLAY_HINT_DELAY_MS", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FreeDeliveryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = FreeDeliveryFragment.this.f235744o0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: FreeDeliveryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC40925b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40925b interfaceC40925b) {
            InterfaceC40925b interfaceC40925b2 = interfaceC40925b;
            FreeDeliveryFragment freeDeliveryFragment = (FreeDeliveryFragment) this.receiver;
            int i12 = FreeDeliveryFragment.f235742u0;
            freeDeliveryFragment.getClass();
            if (L.f(interfaceC40925b2, InterfaceC40925b.a.f397323a)) {
                K2.e(freeDeliveryFragment);
                com.avito.android.publish.free_delivery.h hVar = freeDeliveryFragment.f235749t0;
                (hVar != null ? hVar : null).h();
            } else if (L.f(interfaceC40925b2, InterfaceC40925b.c.f397325a)) {
                K2.e(freeDeliveryFragment);
                C0 c02 = freeDeliveryFragment.f235745p0;
                (c02 != null ? c02 : null).ye();
            } else if (L.f(interfaceC40925b2, InterfaceC40925b.C11266b.f397324a)) {
                C0 c03 = freeDeliveryFragment.f235745p0;
                if (c03 == null) {
                    c03 = null;
                }
                c03.xe(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FreeDeliveryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhe0/c;", "it", "Lkotlin/G0;", "invoke", "(Lhe0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C40926c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f235751l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C40926c c40926c) {
            return G0.f406611a;
        }
    }

    /* compiled from: FreeDeliveryFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f235753m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z12) {
            super(2);
            this.f235753m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                int i12 = FreeDeliveryFragment.f235742u0;
                FreeDeliveryFragment freeDeliveryFragment = FreeDeliveryFragment.this;
                com.akita.compose.theme.re23.c.a(false, r.c(1814990524, new com.avito.android.publish.free_delivery.e(freeDeliveryFragment, this.f235753m, C22126m3.b(freeDeliveryFragment.q5().getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f235754l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f235754l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f235754l);
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
            return FreeDeliveryFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f235756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f235756l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f235756l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f235757l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f235757l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f235757l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f235758l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f235758l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f235758l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FreeDeliveryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/free_delivery/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/free_delivery/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.publish.free_delivery.i> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.free_delivery.i invoke() {
            com.avito.android.publish.free_delivery.j jVar = FreeDeliveryFragment.this.f235743n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.publish.free_delivery.i) jVar.get();
        }
    }

    static {
        new a(null);
    }

    public FreeDeliveryFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f235747r0 = new O0(m0.f406844a.b(com.avito.android.publish.free_delivery.i.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f235748s0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        q5().accept(InterfaceC40924a.f.f397319a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.RedesignPublishTheme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f235749t0 = (com.avito.android.publish.free_delivery.h) context;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f235744o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, FreeDeliveryFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryOneTimeEvent;)V", 0), d.f235751l);
        l<SimpleTestGroupWithNone> lVar = this.f235746q0;
        if (lVar == null) {
            lVar = null;
        }
        boolean zB2 = lVar.f439745a.f439749b.b();
        l<SimpleTestGroupWithNone> lVar2 = this.f235746q0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        if (lVar2.f439745a.f439749b.a()) {
            l<SimpleTestGroupWithNone> lVar3 = this.f235746q0;
            (lVar3 != null ? lVar3 : null).b();
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1726039863, new e(zB2), true));
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C33862g0 c33862g0 = new C33862g0(requireView().getRootView(), Boolean.TRUE);
        c33862g0.b(new com.avito.android.publish.free_delivery.a(this), new com.avito.android.publish.free_delivery.b(this));
        c33862g0.c(R.drawable.ic_back_24_black);
        ScreenPerformanceTracker screenPerformanceTracker = this.f235744o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.publish.free_delivery.di.a.a().a((com.avito.android.publish.free_delivery.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.free_delivery.di.c.class), new C28478k(FreeDeliveryPerfScreen.f235871d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f235744o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f235744o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.publish.free_delivery.i q5() {
        return (com.avito.android.publish.free_delivery.i) this.f235747r0.getValue();
    }
}
