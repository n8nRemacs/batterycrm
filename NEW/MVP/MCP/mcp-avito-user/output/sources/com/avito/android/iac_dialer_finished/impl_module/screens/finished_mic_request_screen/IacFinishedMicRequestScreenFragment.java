package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen;

import Cd.C13243a;
import ZK.a;
import ZK.b;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: IacFinishedMicRequestScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacFinishedMicRequestScreenFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f166698u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.g f166699n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f166700o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f166701p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view.a f166702q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f166703r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f166704s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.c f166705t0;

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenFragment$a;", "", "<init>", "()V", "", "KEY_SCREEN_ARGUMENT", "Ljava/lang/String;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<ZK.b, G0> {
        @Override // Y41.l
        public final G0 invoke(ZK.b bVar) {
            ZK.b bVar2 = bVar;
            IacFinishedMicRequestScreenFragment iacFinishedMicRequestScreenFragment = (IacFinishedMicRequestScreenFragment) this.receiver;
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            iacFinishedMicRequestScreenFragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = iacFinishedMicRequestScreenFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else {
                if (bVar2 instanceof b.C1436b) {
                    ActivityC22955m activityC22955mL12 = iacFinishedMicRequestScreenFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                    IacPiiDeepLink iacPiiDeepLink = ((b.C1436b) bVar2).f20103b;
                    if (iacPiiDeepLink != null) {
                        ScreenFlowLink screenFlowLink = new ScreenFlowLink(new IacLauncherIntentLink(true), iacPiiDeepLink.unwrap());
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = iacFinishedMicRequestScreenFragment.f166704s0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, screenFlowLink, null, C22777e.b(new Q("with_up_intent", Boolean.FALSE)), 2);
                    }
                } else if (bVar2 instanceof b.f) {
                    InterfaceC35845m2 interfaceC35845m2 = iacFinishedMicRequestScreenFragment.f166703r0;
                    iacFinishedMicRequestScreenFragment.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).i());
                } else if (bVar2 instanceof b.e) {
                    com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.c cVar = iacFinishedMicRequestScreenFragment.f166705t0;
                    (cVar != null ? cVar : null).a(((b.e) bVar2).f20107b, new com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.a(1, iacFinishedMicRequestScreenFragment.q5(), com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f.class, "accept", "accept(Ljava/lang/Object;)V", 0));
                } else if (bVar2 instanceof b.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = iacFinishedMicRequestScreenFragment.f166704s0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, ((b.d) bVar2).f20106b.unwrap(), null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<IacFinishedMicRequestScreenState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f166706l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState) {
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            IacFinishedMicRequestScreenFragment.this.q5().accept(a.b.f20096b);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            IacFinishedMicRequestScreenFragment.this.q5().accept(a.e.f20099b);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            IacFinishedMicRequestScreenFragment.this.q5().accept(a.f.f20100b);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            IacFinishedMicRequestScreenFragment.this.q5().accept(a.b.f20096b);
            return G0.f406611a;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = IacFinishedMicRequestScreenFragment.f166698u0;
            IacFinishedMicRequestScreenFragment.this.q5().accept(a.d.f20098b);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f166712l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f166712l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f166712l);
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
            return IacFinishedMicRequestScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f166714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f166714l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f166714l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166715l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166715l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f166715l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f166716l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f166716l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f166716l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f invoke() {
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.g gVar = IacFinishedMicRequestScreenFragment.this.f166699n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f) gVar.get();
        }
    }

    public IacFinishedMicRequestScreenFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f166700o0 = new O0(m0.f406844a.b(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f166701p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view.a aVar = this.f166702q0;
        ComposeView composeViewA = (aVar != null ? aVar : null).a(requireContext(), q5().getState(), new d(), new e(), new f(), new g(), new h());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f166701p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f166701p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null, q5(), new b(1, this, IacFinishedMicRequestScreenFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenEvent;)V", 0), c.f166706l);
        return composeViewA;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(a.g.f20101b);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.a.a();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Resources resources = requireActivity().getResources();
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            iacFinishedMicRequestScreenArgument = (IacFinishedMicRequestScreenArgument) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("screen_argument", IacFinishedMicRequestScreenArgument.class) : arguments.getParcelable("screen_argument"));
        } else {
            iacFinishedMicRequestScreenArgument = null;
        }
        aVarA.a(this, activityC22955mRequireActivity, resources, rVarC, iacFinishedMicRequestScreenArgument, (com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f166701p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f q5() {
        return (com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.f) this.f166700o0.getValue();
    }
}
