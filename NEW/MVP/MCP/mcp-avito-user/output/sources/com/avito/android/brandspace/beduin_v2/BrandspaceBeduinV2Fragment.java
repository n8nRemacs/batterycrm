package com.avito.android.brandspace.beduin_v2;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cU.v;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.brandspace.di.a;
import com.avito.android.brandspace.di.p;
import com.avito.android.brandspace.perf_const.BrandspaceScreen;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.ownership.Owners;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import ik.C41418c;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BrandspaceBeduinV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/BrandspaceBeduinV2Fragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandspaceBeduinV2Fragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.brandspace.beduin_v2.d f107505o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final O0 f107506p0;

    /* renamed from: q0, reason: collision with root package name */
    public ScreenPerformanceTracker f107507q0;

    /* renamed from: r0, reason: collision with root package name */
    public BeduinView f107508r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f107509s0;

    /* renamed from: t0, reason: collision with root package name */
    public s f107510t0;

    /* compiled from: BrandspaceBeduinV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<C41418c, G0> {
        @Override // Y41.l
        public final G0 invoke(C41418c c41418c) {
            BrandspaceBeduinV2Fragment brandspaceBeduinV2Fragment = (BrandspaceBeduinV2Fragment) this.receiver;
            brandspaceBeduinV2Fragment.getClass();
            C41418c.a aVar = c41418c.f398711b;
            if (!(aVar instanceof C41418c.a.C11391a) && (aVar instanceof C41418c.a.b)) {
                BeduinView beduinView = brandspaceBeduinV2Fragment.f107508r0;
                if (beduinView == null) {
                    beduinView = null;
                }
                beduinView.b(((C41418c.a.b) aVar).f398713a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BrandspaceBeduinV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Set<FV0.h>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            return ((com.avito.android.brandspace.beduin_v2.b) BrandspaceBeduinV2Fragment.this.f107506p0.getValue()).f107519J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f107512l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f107512l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f107512l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BrandspaceBeduinV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f107514l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f107514l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f107514l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107515l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f107515l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f107516l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f107516l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f107516l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BrandspaceBeduinV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/brandspace/beduin_v2/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.brandspace.beduin_v2.b> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.brandspace.beduin_v2.b invoke() {
            com.avito.android.brandspace.beduin_v2.d dVar = BrandspaceBeduinV2Fragment.this.f107505o0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.brandspace.beduin_v2.b) dVar.get();
        }
    }

    public BrandspaceBeduinV2Fragment() {
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f107506p0 = new O0(m0.f406844a.b(com.avito.android.brandspace.beduin_v2.b.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f107509s0 = C42727D.c(new b());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getSupportFragmentManager().p0("key_brandspace_beduin_v2_request", this, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f107507q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.brandspace_fragment_beduin_v2, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        BeduinView beduinView = (BeduinView) view.findViewById(R.id.brandspace_beduin_v2_view);
        s sVar = this.f107510t0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f107510t0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f107508r0 = beduinView;
        ScreenPerformanceTracker screenPerformanceTracker = this.f107507q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, (com.avito.android.brandspace.beduin_v2.b) this.f107506p0.getValue(), com.avito.android.analytics.screens.mvi.g.f90655l, new a(1, this, BrandspaceBeduinV2Fragment.class, "render", "render(Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2State;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f107507q0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        BrandspaceScreen brandspaceScreen = BrandspaceScreen.f107762d;
        this.f107507q0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(brandspaceScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null));
        ZS.b bVar = new ZS.b(brandspaceScreen, Owners.f210488g, (String) null, 4, (C42822w) null);
        a.InterfaceC3220a interfaceC3220aA = p.a();
        ScreenPerformanceTracker screenPerformanceTracker = this.f107507q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f107507q0;
        interfaceC3220aA.a(screenPerformanceTracker, new C31138n0(K.a(aVarEd, screenPerformanceTracker2 == null ? null : screenPerformanceTracker2, bVar, cv.c.d(this), null, null, null, 56)), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this), (Fu.d) C29972i.a(C29972i.b(this), Fu.d.class)).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f107507q0;
        ScreenPerformanceTracker screenPerformanceTracker4 = screenPerformanceTracker3 == null ? null : screenPerformanceTracker3;
        O0 o02 = this.f107506p0;
        this.f107510t0 = aVarFd.a(contextRequireContext, screenPerformanceTracker4, ((com.avito.android.brandspace.beduin_v2.b) o02.getValue()).f107520K, v.f57891a, ((com.avito.android.brandspace.beduin_v2.b) o02.getValue()).f107518E);
        ScreenPerformanceTracker screenPerformanceTracker5 = this.f107507q0;
        if (screenPerformanceTracker5 == null) {
            screenPerformanceTracker5 = null;
        }
        screenPerformanceTracker5.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker6 = this.f107507q0;
        (screenPerformanceTracker6 != null ? screenPerformanceTracker6 : null).c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @k
    public final s q5() {
        s sVar = this.f107510t0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f107509s0.getValue();
    }

    @Override // FV0.d
    public final void close() {
    }
}
