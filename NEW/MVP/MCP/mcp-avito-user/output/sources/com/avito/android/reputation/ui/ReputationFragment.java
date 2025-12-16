package com.avito.android.reputation.ui;

import Cd.C13243a;
import Ki.C14316a;
import Li.b;
import Rm0.InterfaceC15059a;
import Rm0.c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import cU.s;
import cU0.C27106d;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ReputationScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.D0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.reputation.di.t;
import com.avito.android.reputation.di.u;
import com.avito.beduin.v2.interaction.navigation.flow.p;
import cv.InterfaceC39417a;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ReputationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/reputation/ui/ReputationFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/K;", "LLi/b;", "<init>", "()V", "a", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReputationFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b, K<Li.b> {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f254766A0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.reputation.ui.h f254767o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f254768p0;

    /* renamed from: q0, reason: collision with root package name */
    public ScreenPerformanceTracker f254769q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254770r0;

    /* renamed from: s0, reason: collision with root package name */
    public s f254771s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public p f254772t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254773u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254774v0;

    /* renamed from: w0, reason: collision with root package name */
    public Li.b f254775w0;

    /* renamed from: x0, reason: collision with root package name */
    public C42670a f254776x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254777y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f254778z0;

    /* compiled from: ReputationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/reputation/ui/ReputationFragment$a;", "", "<init>", "()V", "", "FRAGMENT_ARGS_KEY", "Ljava/lang/String;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ReputationFragment reputationFragment = ReputationFragment.this;
            androidx.core.content.j jVarRequireActivity = reputationFragment.requireActivity();
            G0 g02 = null;
            com.avito.android.beduin.v2.page.i iVar = jVarRequireActivity instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) jVarRequireActivity : null;
            if (iVar != null) {
                iVar.w1();
                g02 = G0.f406611a;
            } else {
                InterfaceC23487e parentFragment = reputationFragment.getParentFragment();
                com.avito.android.beduin.v2.page.i iVar2 = parentFragment instanceof com.avito.android.beduin.v2.page.i ? (com.avito.android.beduin.v2.page.i) parentFragment : null;
                if (iVar2 != null) {
                    iVar2.w1();
                    g02 = G0.f406611a;
                }
            }
            if (g02 == null) {
                reputationFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LKi/a;", "invoke", "()LKi/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C14316a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C14316a invoke() {
            ReputationFragment reputationFragment = ReputationFragment.this;
            FragmentManager childFragmentManager = reputationFragment.getChildFragmentManager();
            p pVar = reputationFragment.f254772t0;
            if (pVar == null) {
                pVar = null;
            }
            return new C14316a(R.id.reputation_content_view, childFragmentManager, pVar);
        }
    }

    /* compiled from: ReputationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/reputation/di/u;", "invoke", "()Lcom/avito/android/reputation/di/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<u> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final u invoke() {
            return ((u.b) C29972i.a(C29972i.b(ReputationFragment.this), u.b.class)).ue().create();
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LKi/a;", "invoke", "()LKi/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<C14316a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final C14316a invoke() {
            a aVar = ReputationFragment.f254766A0;
            return (C14316a) ReputationFragment.this.f254773u0.getValue();
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<x, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = ReputationFragment.f254766A0;
            ReputationFragment.this.s5().accept(InterfaceC15059a.C0975a.f14605a);
            return G0.f406611a;
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRm0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LRm0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Rm0.c, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Rm0.c cVar) {
            Rm0.c cVar2 = cVar;
            a aVar = ReputationFragment.f254766A0;
            ReputationFragment reputationFragment = ReputationFragment.this;
            if (cVar2 instanceof c.C0977c) {
                C14316a.c((C14316a) reputationFragment.f254773u0.getValue());
            } else {
                if (cVar2 instanceof c.d) {
                    C42670a c42670a = reputationFragment.f254776x0;
                    C42670a.d(c42670a != null ? c42670a : null);
                } else if (cVar2 instanceof c.b) {
                    C42670a c42670a2 = reputationFragment.f254776x0;
                    if (c42670a2 == null) {
                        c42670a2 = null;
                    }
                    c42670a2.c(null, new com.avito.android.reputation.ui.c(reputationFragment));
                } else if (cVar2 instanceof c.a) {
                    C42670a c42670a3 = reputationFragment.f254776x0;
                    (c42670a3 != null ? c42670a3 : null).b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Set<FV0.h>> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = ReputationFragment.f254766A0;
            return ReputationFragment.this.s5().f254814J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f254786l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f254786l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f254786l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ReputationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f254788l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f254788l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f254788l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f254789l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f254789l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f254789l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f254790l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f254790l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f254790l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReputationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/reputation/ui/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/reputation/ui/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.reputation.ui.g> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.reputation.ui.g invoke() {
            com.avito.android.reputation.ui.h hVar = ReputationFragment.this.f254767o0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.reputation.ui.g) hVar.get();
        }
    }

    public ReputationFragment() {
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f254768p0 = new O0(m0.f406844a.b(com.avito.android.reputation.ui.g.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f254770r0 = C42727D.c(new h());
        this.f254773u0 = C42727D.c(new c());
        this.f254774v0 = C42727D.c(new e());
        this.f254777y0 = C42727D.c(new d());
        this.f254778z0 = new b();
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, FV0.a
    @Y61.k
    public final FV0.f A1() {
        return (FV0.f) this.f254774v0.getValue();
    }

    @Override // FV0.d
    public final void close() {
        ((b) this.f254778z0).invoke();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        t.a aVarA = com.avito.android.reputation.di.a.a();
        ReputationScreen reputationScreen = ReputationScreen.f90461d;
        C28478k c28478k = new C28478k(reputationScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f254769q0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        Bundle bundleRequireArguments = requireArguments();
        Object parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("args_key", ReputationArgs.class) : bundleRequireArguments.getParcelable("args_key");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ReputationArgs reputationArgs = (ReputationArgs) parcelable;
        com.avito.android.reputation.di.s sVar = (com.avito.android.reputation.di.s) C29972i.a(C29972i.b(this), com.avito.android.reputation.di.s.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f254769q0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        cv.d dVarD = cv.c.d(this);
        ZS.b bVar = new ZS.b(reputationScreen, Owners.f210441R2, (String) null, 4, (C42822w) null);
        InterfaceC42726C interfaceC42726C = this.f254777y0;
        aVarA.a(c28478k, interfaceC39417aB, new C31138n0(aVarEd.a(screenPerformanceTracker2, bVar, dVarD, new D0((u) interfaceC42726C.getValue()), com.avito.android.lib.beduin_v2.feature.di.K.f176031b, (144 & 32) != 0 ? new C27106d() : null, (144 & 64) != 0 ? new com.avito.beduin.v2.engine.component.x() : null, new ZS.c(false))), sVar, reputationArgs).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f254769q0;
        this.f254771s0 = aVarFd.a(contextRequireContext, screenPerformanceTracker3 == null ? null : screenPerformanceTracker3, s5().f254815K, new cU.m((u) interfaceC42726C.getValue()), s5().f254813E);
        b.a aVarKj = ((b.InterfaceC0627b) C29972i.a(C29972i.b(this), b.InterfaceC0627b.class)).Kj();
        s sVar2 = this.f254771s0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        this.f254775w0 = aVarKj.a(sVar2, new Ki.d(new com.avito.android.reputation.ui.b(this)));
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f254769q0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.a(fA2.b());
        C19918B.a(requireActivity().getF21241d(), null, new f(), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f254769q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.reputation_fragment, viewGroup, false);
        this.f254776x0 = new C42670a((FrameLayout) viewInflate, null, 0, 6, null);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f254769q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), com.avito.android.analytics.screens.mvi.k.f90658l, new g());
        return viewInflate;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f254771s0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        Li.b bVar = this.f254775w0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f254770r0.getValue();
    }

    public final com.avito.android.reputation.ui.g s5() {
        return (com.avito.android.reputation.ui.g) this.f254768p0.getValue();
    }
}
