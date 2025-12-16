package com.avito.android.beduin.v2.benchmark.impl;

import Cd.C13243a;
import Ci.InterfaceC13306a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import cU.s;
import cU.v;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.BeduinV2PageScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BeduinV2BenchmarkPageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/BeduinV2BenchmarkPageFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2BenchmarkPageFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f104583w0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.v2.benchmark.impl.e f104584o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f104585p0;

    /* renamed from: q0, reason: collision with root package name */
    public ScreenPerformanceTracker f104586q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f104587r0;

    /* renamed from: s0, reason: collision with root package name */
    public BeduinView f104588s0;

    /* renamed from: t0, reason: collision with root package name */
    public l f104589t0;

    /* renamed from: u0, reason: collision with root package name */
    public s f104590u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104591v0;

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/BeduinV2BenchmarkPageFragment$a;", "", "<init>", "()V", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = BeduinV2BenchmarkPageFragment.f104583w0;
            BeduinV2BenchmarkPageFragment.this.s5().accept(InterfaceC40047a.C11082a.f395204a);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<BeduinOneTimeEvent, G0> {
        @Override // Y41.l
        public final G0 invoke(BeduinOneTimeEvent beduinOneTimeEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent2 = beduinOneTimeEvent;
            BeduinV2BenchmarkPageFragment beduinV2BenchmarkPageFragment = (BeduinV2BenchmarkPageFragment) this.receiver;
            a aVar = BeduinV2BenchmarkPageFragment.f104583w0;
            beduinV2BenchmarkPageFragment.getClass();
            if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.ShowToastBar) {
                com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                BeduinView beduinView = beduinV2BenchmarkPageFragment.f104588s0;
                BeduinView beduinView2 = beduinView != null ? beduinView : null;
                bVar.getClass();
                com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView2, (BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent2);
            } else if (beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.a) {
                BeduinView beduinView3 = beduinV2BenchmarkPageFragment.f104588s0;
                (beduinView3 != null ? beduinView3 : null).c(((BeduinOneTimeEvent.a) beduinOneTimeEvent2).f176280a);
            } else {
                if (!(beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.b ? true : beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.d)) {
                    boolean z12 = beduinOneTimeEvent2 instanceof BeduinOneTimeEvent.c;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeT/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LeT/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<AbstractC40048c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC40048c abstractC40048c) {
            AbstractC40048c abstractC40048c2 = abstractC40048c;
            a aVar = BeduinV2BenchmarkPageFragment.f104583w0;
            BeduinV2BenchmarkPageFragment beduinV2BenchmarkPageFragment = BeduinV2BenchmarkPageFragment.this;
            if (abstractC40048c2 instanceof AbstractC40048c.d) {
                l lVar = beduinV2BenchmarkPageFragment.f104589t0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (abstractC40048c2 instanceof AbstractC40048c.a) {
                l lVar2 = beduinV2BenchmarkPageFragment.f104589t0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.j();
                BeduinView beduinView = beduinV2BenchmarkPageFragment.f104588s0;
                (beduinView != null ? beduinView : null).b(((AbstractC40048c.a) abstractC40048c2).getF395211c());
            } else if (abstractC40048c2 instanceof AbstractC40048c.b) {
                V2.f318762a.f(((AbstractC40048c.b) abstractC40048c2).f395216b);
                l lVar3 = beduinV2BenchmarkPageFragment.f104589t0;
                (lVar3 != null ? lVar3 : null).a("");
            } else {
                boolean z12 = abstractC40048c2 instanceof AbstractC40048c.C11084c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Set<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = BeduinV2BenchmarkPageFragment.f104583w0;
            return BeduinV2BenchmarkPageFragment.this.s5().f104603J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f104595l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f104595l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f104595l);
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
            return BeduinV2BenchmarkPageFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f104597l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f104597l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104597l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104598l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104598l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104598l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104599l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104599l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104599l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinV2BenchmarkPageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/beduin/v2/benchmark/impl/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.beduin.v2.benchmark.impl.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.beduin.v2.benchmark.impl.c invoke() {
            com.avito.android.beduin.v2.benchmark.impl.e eVar = BeduinV2BenchmarkPageFragment.this.f104584o0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.beduin.v2.benchmark.impl.c) eVar.get();
        }
    }

    public BeduinV2BenchmarkPageFragment() {
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f104585p0 = new O0(m0.f406844a.b(com.avito.android.beduin.v2.benchmark.impl.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f104591v0 = C42727D.c(new e());
    }

    @Override // FV0.d
    public final void close() {
        requireActivity().finish();
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C19918B.a(requireActivity().getF21241d(), this, new b(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f104586q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_beduin_v2_benchmark, viewGroup, false);
        BeduinView beduinView = (BeduinView) viewInflate.findViewById(R.id.beduin);
        s sVar = this.f104590u0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f104590u0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f104588s0 = beduinView;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        InterfaceC28373a interfaceC28373a = this.f104587r0;
        this.f104589t0 = new l(viewGroup2, R.id.beduin, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f104586q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), new c(1, this, BeduinV2BenchmarkPageFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 0), new d());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f104586q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extraSampleId") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("screenName") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C28478k c28478k = new C28478k(new BeduinV2PageScreen(string2), com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f104586q0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        ZS.b bVar = new ZS.b(new BeduinV2PageScreen(string2), Owners.f210556y, (String) null, 4, (C42822w) null);
        InterfaceC13306a.InterfaceC0122a interfaceC0122aKk = ((InterfaceC13306a.b) C29972i.a(C29972i.b(this), InterfaceC13306a.b.class)).Kk();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f104586q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        interfaceC0122aKk.a(new C31138n0(K.a(aVarEd, screenPerformanceTracker, bVar, cv.c.d(this), null, null, null, 56)), string, c28478k.f90636a).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f104586q0;
        this.f104590u0 = aVarFd.a(contextRequireContext, screenPerformanceTracker2 == null ? null : screenPerformanceTracker2, s5().f104604K, v.f57891a, s5().f104602E);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f104586q0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f104586q0;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f104590u0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f104591v0.getValue();
    }

    public final com.avito.android.beduin.v2.benchmark.impl.c s5() {
        return (com.avito.android.beduin.v2.benchmark.impl.c) this.f104585p0.getValue();
    }
}
