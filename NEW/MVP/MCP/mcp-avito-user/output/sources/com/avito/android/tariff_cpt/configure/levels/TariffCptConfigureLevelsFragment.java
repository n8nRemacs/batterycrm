package com.avito.android.tariff_cpt.configure.levels;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.tariff_cpt.configure.levels.TariffCptConfigureLevelsFragment;
import com.avito.android.tariff_cpt.configure.levels.di.b;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kC0.C42568a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qC0.C47281c;
import qC0.InterfaceC47279a;
import qC0.InterfaceC47280b;
import qK0.C47312b;
import qK0.C47313c;
import rC0.C47525c;
import z1.AbstractC50339a;

/* compiled from: TariffCptConfigureLevelsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/TariffCptConfigureLevelsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCptConfigureLevelsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f297795A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f297796B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_cpt.configure.levels.f f297797n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f297798o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f297799p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f297800q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f297801r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297802s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297803t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297804u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297805v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297806w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f297807x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47312b f297808y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public C42568a f297809z0;

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/TariffCptConfigureLevelsFragment$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC47280b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47280b interfaceC47280b) {
            InterfaceC47280b.c cVar;
            DeepLink deepLink;
            InterfaceC47280b interfaceC47280b2 = interfaceC47280b;
            TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = (TariffCptConfigureLevelsFragment) this.receiver;
            a aVar = TariffCptConfigureLevelsFragment.f297795A0;
            tariffCptConfigureLevelsFragment.getClass();
            if (interfaceC47280b2 instanceof InterfaceC47280b.a) {
                ActivityC22955m activityC22955mL1 = tariffCptConfigureLevelsFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else {
                if (interfaceC47280b2 instanceof InterfaceC47280b.C12314b) {
                    ActivityC22955m activityC22955mL12 = tariffCptConfigureLevelsFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCptConfigureLevelsFragment.f297800q0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((InterfaceC47280b.C12314b) interfaceC47280b2).f429114a, null, null, 6);
                } else if ((interfaceC47280b2 instanceof InterfaceC47280b.c) && (deepLink = (cVar = (InterfaceC47280b.c) interfaceC47280b2).f429115a) != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = tariffCptConfigureLevelsFragment.f297800q0;
                    (aVar3 != null ? aVar3 : null).r6(cVar.f429116b, deepLink, "cpt_configure_levels_request_key");
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C47281c, G0> {
        @Override // Y41.l
        public final G0 invoke(C47281c c47281c) {
            Float f12;
            C47281c c47281c2 = c47281c;
            TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = (TariffCptConfigureLevelsFragment) this.receiver;
            a aVar = TariffCptConfigureLevelsFragment.f297795A0;
            tariffCptConfigureLevelsFragment.getClass();
            Throwable th2 = c47281c2.f429124g;
            C47313c c47313c = tariffCptConfigureLevelsFragment.f297806w0;
            C47313c c47313c2 = tariffCptConfigureLevelsFragment.f297803t0;
            if (th2 != null) {
                D6.w(tariffCptConfigureLevelsFragment.r5());
                n<Object>[] nVarArr = TariffCptConfigureLevelsFragment.f297796B0;
                n<Object> nVar = nVarArr[1];
                D6.w((Button) c47313c2.a());
                D6.w(tariffCptConfigureLevelsFragment.s5());
                tariffCptConfigureLevelsFragment.s5().d();
                D6.w(tariffCptConfigureLevelsFragment.q5());
                n<Object> nVar2 = nVarArr[4];
                ((com.avito.android.progress_overlay.l) c47313c.a()).a(z.l(th2));
            } else {
                boolean z12 = c47281c2.f429125h;
                C47313c c47313c3 = tariffCptConfigureLevelsFragment.f297805v0;
                if (z12) {
                    D6.w(tariffCptConfigureLevelsFragment.r5());
                    n<Object>[] nVarArr2 = TariffCptConfigureLevelsFragment.f297796B0;
                    n<Object> nVar3 = nVarArr2[1];
                    D6.w((Button) c47313c2.a());
                    n<Object> nVar4 = nVarArr2[3];
                    ((Button) c47313c3.a()).setLoading(c47281c2.f429122e);
                    D6.H(tariffCptConfigureLevelsFragment.s5());
                    tariffCptConfigureLevelsFragment.s5().c();
                    D6.w(tariffCptConfigureLevelsFragment.q5());
                    n<Object> nVar5 = nVarArr2[4];
                    ((com.avito.android.progress_overlay.l) c47313c.a()).k(null);
                } else {
                    iC0.d dVar = c47281c2.f429119b;
                    if (dVar != null && (f12 = dVar.f398442a) != null) {
                        tariffCptConfigureLevelsFragment.r5().setProgress(f12.floatValue());
                    }
                    D6.G(tariffCptConfigureLevelsFragment.r5(), (dVar != null ? dVar.f398442a : null) != null);
                    n<Object>[] nVarArr3 = TariffCptConfigureLevelsFragment.f297796B0;
                    n<Object> nVar6 = nVarArr3[1];
                    jC0.g.a((Button) c47313c2.a(), dVar != null ? dVar.f398443b : null);
                    com.avito.konveyor.adapter.d dVar2 = tariffCptConfigureLevelsFragment.f297799p0;
                    if (dVar2 == null) {
                        dVar2 = null;
                    }
                    dVar2.l(c47281c2.f429120c, null);
                    n<Object> nVar7 = nVarArr3[3];
                    jC0.g.a((Button) c47313c3.a(), c47281c2.f429121d);
                    D6.w(tariffCptConfigureLevelsFragment.s5());
                    tariffCptConfigureLevelsFragment.s5().d();
                    D6.H(tariffCptConfigureLevelsFragment.q5());
                    n<Object> nVar8 = nVarArr3[4];
                    ((com.avito.android.progress_overlay.l) c47313c.a()).j();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCptConfigureLevelsFragment.f297795A0;
            TariffCptConfigureLevelsFragment.this.t5().accept(new InterfaceC47279a.b(deepLink, null, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "levelCardId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<DeepLink, Long, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, Long l12) {
            long jLongValue = l12.longValue();
            a aVar = TariffCptConfigureLevelsFragment.f297795A0;
            TariffCptConfigureLevelsFragment.this.t5().accept(new InterfaceC47279a.b(deepLink, C22777e.b(new Q("cpt_configure_levels_level_card_id", Long.valueOf(jLongValue)))));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f297812l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f297812l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f297812l);
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
            return TariffCptConfigureLevelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f297814l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f297814l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f297814l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297815l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297815l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f297815l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f297816l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f297816l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f297816l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCptConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_cpt/configure/levels/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff_cpt.configure.levels.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_cpt.configure.levels.e invoke() {
            com.avito.android.tariff_cpt.configure.levels.f fVar = TariffCptConfigureLevelsFragment.this.f297797n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff_cpt.configure.levels.e) fVar.get();
        }
    }

    static {
        Y y12 = new Y(TariffCptConfigureLevelsFragment.class, "navigationProgressBar", "getNavigationProgressBar()Lcom/avito/android/lib/design/progress_bar/ProgressBar;", 0);
        n0 n0Var = m0.f406844a;
        f297796B0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "helpButton", "getHelpButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "shimmer", "getShimmer()Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCptConfigureLevelsFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f297795A0 = new a(null);
    }

    public TariffCptConfigureLevelsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f297801r0 = new O0(m0.f406844a.b(com.avito.android.tariff_cpt.configure.levels.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f297802s0 = new C47313c(null, 1, null);
        this.f297803t0 = new C47313c(null, 1, null);
        this.f297804u0 = new C47313c(null, 1, null);
        this.f297805v0 = new C47313c(null, 1, null);
        this.f297806w0 = new C47313c(null, 1, null);
        this.f297807x0 = new C47313c(null, 1, null);
        this.f297808y0 = new C47312b(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 19);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f297798o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.tariff_cpt_configure_levels_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.tariff_cpt_toolbar);
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_close24, R.attr.black));
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_cpt.configure.levels.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCptConfigureLevelsFragment f297819c;

            {
                this.f297819c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = this.f297819c;
                switch (i12) {
                    case 0:
                        TariffCptConfigureLevelsFragment.a aVar = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.C12313a.f429104a);
                        break;
                    case 1:
                        TariffCptConfigureLevelsFragment.a aVar2 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.c.f429107a);
                        break;
                    default:
                        TariffCptConfigureLevelsFragment.a aVar3 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.e.f429110a);
                        break;
                }
            }
        });
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.tariff_cpt_navigation_progress_bar);
        C47313c c47313c = this.f297802s0;
        n<Object>[] nVarArr = f297796B0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, progressBar);
        Button button = (Button) view.findViewById(R.id.tariff_cpt_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_cpt.configure.levels.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCptConfigureLevelsFragment f297819c;

            {
                this.f297819c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = this.f297819c;
                switch (i13) {
                    case 0:
                        TariffCptConfigureLevelsFragment.a aVar = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.C12313a.f429104a);
                        break;
                    case 1:
                        TariffCptConfigureLevelsFragment.a aVar2 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.c.f429107a);
                        break;
                    default:
                        TariffCptConfigureLevelsFragment.a aVar3 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.e.f429110a);
                        break;
                }
            }
        });
        C47313c c47313c2 = this.f297803t0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_cpt_configure_levels_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f297799p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C47525c(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f297798o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        n<Object> nVar3 = nVarArr[6];
        this.f297808y0.b(this, recyclerView);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tariff_cpt_configure_levels_button_container);
        C47313c c47313c3 = this.f297804u0;
        n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, viewGroup);
        Button button2 = (Button) view.findViewById(R.id.tariff_cpt_configure_levels_button);
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_cpt.configure.levels.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCptConfigureLevelsFragment f297819c;

            {
                this.f297819c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = this.f297819c;
                switch (i14) {
                    case 0:
                        TariffCptConfigureLevelsFragment.a aVar = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.C12313a.f429104a);
                        break;
                    case 1:
                        TariffCptConfigureLevelsFragment.a aVar2 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.c.f429107a);
                        break;
                    default:
                        TariffCptConfigureLevelsFragment.a aVar3 = TariffCptConfigureLevelsFragment.f297795A0;
                        tariffCptConfigureLevelsFragment.t5().accept(InterfaceC47279a.e.f429110a);
                        break;
                }
            }
        });
        C47313c c47313c4 = this.f297805v0;
        n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, button2);
        ShimmerLayout shimmerLayout = (ShimmerLayout) view.findViewById(R.id.tariff_cpt_configure_levels_shimmer);
        C47313c c47313c5 = this.f297807x0;
        n<Object> nVar6 = nVarArr[5];
        c47313c5.b(this, shimmerLayout);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.tariff_cpt_configure_levels_content_container), R.id.tariff_cpt_configure_levels_recycler_view, null, R.layout.tariff_cpt_network_problem_view, 0, 4, null);
        lVar.f231600j = new com.avito.android.tariff_cpt.configure.levels.b(this);
        C47313c c47313c6 = this.f297806w0;
        n<Object> nVar7 = nVarArr[4];
        c47313c6.b(this, lVar);
        q5().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 21));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f297798o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, t5(), new b(1, this, TariffCptConfigureLevelsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsOneTimeEvent;)V", 0), new c(1, this, TariffCptConfigureLevelsFragment.class, "render", "render(Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f297798o0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.tariff_cpt.configure.levels.di.a.a();
        com.avito.android.tariff_cpt.common.di.d dVar = (com.avito.android.tariff_cpt.common.di.d) C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("tariff_cpt_extra_remote_context") : null;
        if (string == null) {
            throw new IllegalArgumentException("tariff_cpt_extra_remote_context".concat(" - param must be not null"));
        }
        aVarA.a(dVar, interfaceC39417aB, rVarC, string, new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f297798o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f297798o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final ViewGroup q5() {
        C47313c c47313c = this.f297804u0;
        n<Object> nVar = f297796B0[2];
        return (ViewGroup) c47313c.a();
    }

    public final ProgressBar r5() {
        C47313c c47313c = this.f297802s0;
        n<Object> nVar = f297796B0[0];
        return (ProgressBar) c47313c.a();
    }

    public final ShimmerLayout s5() {
        C47313c c47313c = this.f297807x0;
        n<Object> nVar = f297796B0[5];
        return (ShimmerLayout) c47313c.a();
    }

    public final com.avito.android.tariff_cpt.configure.levels.e t5() {
        return (com.avito.android.tariff_cpt.configure.levels.e) this.f297801r0.getValue();
    }
}
