package com.avito.android.tariff_select;

import Cd.C13243a;
import Y61.l;
import ZD0.a;
import ZD0.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.tariff_select.TariffSelectFragment;
import com.avito.android.tariff_select.di.e;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import dE0.C39571a;
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

/* compiled from: TariffSelectFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_select/TariffSelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffSelectFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f301155y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_select.k f301156n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f301157o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f301158p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f301159q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f301160r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f301161s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public ProgressBarRe23 f301162t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Button f301163u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public ShimmerLayout f301164v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public xZ.e f301165w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public RecyclerView f301166x0;

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_select/TariffSelectFragment$a;", "", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<ZD0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(ZD0.b bVar) {
            ZD0.b bVar2 = bVar;
            TariffSelectFragment tariffSelectFragment = (TariffSelectFragment) this.receiver;
            a aVar = TariffSelectFragment.f301155y0;
            tariffSelectFragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = tariffSelectFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (bVar2 instanceof b.C1427b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffSelectFragment.f301160r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.C1427b) bVar2).f19992a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<ZD0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(ZD0.c cVar) {
            Float progress;
            ZD0.c cVar2 = cVar;
            TariffSelectFragment tariffSelectFragment = (TariffSelectFragment) this.receiver;
            a aVar = TariffSelectFragment.f301155y0;
            tariffSelectFragment.getClass();
            ApiException apiException = cVar2.f19997d;
            if (apiException != null) {
                D6.w(tariffSelectFragment.f301162t0);
                Button button = tariffSelectFragment.f301163u0;
                if (button != null) {
                    D6.w(button);
                }
                ShimmerLayout shimmerLayout = tariffSelectFragment.f301164v0;
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                }
                ShimmerLayout shimmerLayout2 = tariffSelectFragment.f301164v0;
                if (shimmerLayout2 != null) {
                    shimmerLayout2.d();
                }
                RecyclerView recyclerView = tariffSelectFragment.f301166x0;
                if (recyclerView != null) {
                    D6.H(recyclerView);
                }
                xZ.e eVar = tariffSelectFragment.f301165w0;
                if (eVar != null) {
                    eVar.d(z.l(apiException));
                }
            } else if (cVar2.f19998e) {
                D6.w(tariffSelectFragment.f301162t0);
                Button button2 = tariffSelectFragment.f301163u0;
                if (button2 != null) {
                    D6.w(button2);
                }
                ShimmerLayout shimmerLayout3 = tariffSelectFragment.f301164v0;
                if (shimmerLayout3 != null) {
                    D6.H(shimmerLayout3);
                }
                ShimmerLayout shimmerLayout4 = tariffSelectFragment.f301164v0;
                if (shimmerLayout4 != null) {
                    shimmerLayout4.c();
                }
                RecyclerView recyclerView2 = tariffSelectFragment.f301166x0;
                if (recyclerView2 != null) {
                    D6.w(recyclerView2);
                }
                xZ.e eVar2 = tariffSelectFragment.f301165w0;
                if (eVar2 != null) {
                    eVar2.c();
                }
            } else {
                uZ.e eVar3 = cVar2.f19995b;
                if (eVar3 != null && (progress = eVar3.getProgress()) != null) {
                    float fFloatValue = progress.floatValue();
                    ProgressBarRe23 progressBarRe23 = tariffSelectFragment.f301162t0;
                    if (progressBarRe23 != null) {
                        progressBarRe23.setProgress(fFloatValue);
                    }
                }
                D6.G(tariffSelectFragment.f301162t0, (eVar3 != null ? eVar3.getProgress() : null) != null);
                Button button3 = tariffSelectFragment.f301163u0;
                if (button3 != null) {
                    com.avito.android.mnz_common.extensions.i.a(button3, eVar3 != null ? eVar3.getButton() : null);
                }
                com.avito.konveyor.adapter.d dVar = tariffSelectFragment.f301158p0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(cVar2.f19996c, null);
                ShimmerLayout shimmerLayout5 = tariffSelectFragment.f301164v0;
                if (shimmerLayout5 != null) {
                    D6.w(shimmerLayout5);
                }
                ShimmerLayout shimmerLayout6 = tariffSelectFragment.f301164v0;
                if (shimmerLayout6 != null) {
                    shimmerLayout6.d();
                }
                RecyclerView recyclerView3 = tariffSelectFragment.f301166x0;
                if (recyclerView3 != null) {
                    D6.H(recyclerView3);
                }
                xZ.e eVar4 = tariffSelectFragment.f301165w0;
                if (eVar4 != null) {
                    eVar4.b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffSelectFragment.f301155y0;
            TariffSelectFragment.this.q5().accept(new a.b(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffSelectFragment.f301155y0;
            TariffSelectFragment.this.q5().accept(new a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f301169l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f301169l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f301169l);
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
            return TariffSelectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f301171l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f301171l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f301171l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301172l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f301172l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301173l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301173l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f301173l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_select/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_select/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff_select.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_select.j invoke() {
            com.avito.android.tariff_select.k kVar = TariffSelectFragment.this.f301156n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.tariff_select.j) kVar.get();
        }
    }

    public TariffSelectFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f301161s0 = new O0(m0.f406844a.b(com.avito.android.tariff_select.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f301157o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301157o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, TariffSelectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_select/mvi/entity/TariffSelectOneTimeEvent;)V", 0), new c(1, this, TariffSelectFragment.class, "render", "render(Lcom/avito/android/tariff_select/mvi/entity/TariffSelectState;)V", 0));
        return layoutInflater.inflate(R.layout.tariff_select_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        ((Toolbar) view.findViewById(R.id.mnz_toolbar)).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_select.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffSelectFragment f301176c;

            {
                this.f301176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffSelectFragment tariffSelectFragment = this.f301176c;
                switch (i12) {
                    case 0:
                        TariffSelectFragment.a aVar = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.C1426a.f19986a);
                        break;
                    case 1:
                        TariffSelectFragment.a aVar2 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.c.f19988a);
                        break;
                    default:
                        TariffSelectFragment.a aVar3 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.d.f19989a);
                        break;
                }
            }
        });
        this.f301162t0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_select.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffSelectFragment f301176c;

            {
                this.f301176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffSelectFragment tariffSelectFragment = this.f301176c;
                switch (i13) {
                    case 0:
                        TariffSelectFragment.a aVar = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.C1426a.f19986a);
                        break;
                    case 1:
                        TariffSelectFragment.a aVar2 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.c.f19988a);
                        break;
                    default:
                        TariffSelectFragment.a aVar3 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.d.f19989a);
                        break;
                }
            }
        });
        this.f301163u0 = button;
        this.f301164v0 = (ShimmerLayout) view.findViewById(R.id.tariff_select_shimmer);
        final int i14 = 2;
        this.f301165w0 = new xZ.e((FrameLayout) view.findViewById(R.id.tariff_select_content), new View.OnClickListener(this) { // from class: com.avito.android.tariff_select.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffSelectFragment f301176c;

            {
                this.f301176c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffSelectFragment tariffSelectFragment = this.f301176c;
                switch (i14) {
                    case 0:
                        TariffSelectFragment.a aVar = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.C1426a.f19986a);
                        break;
                    case 1:
                        TariffSelectFragment.a aVar2 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.c.f19988a);
                        break;
                    default:
                        TariffSelectFragment.a aVar3 = TariffSelectFragment.f301155y0;
                        tariffSelectFragment.q5().accept(a.d.f19989a);
                        break;
                }
            }
        }, null, 4, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_select_items);
        com.avito.konveyor.adapter.d dVar = this.f301158p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C39571a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301157o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f301166x0 = recyclerView;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301157o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        e.a aVarA = com.avito.android.tariff_select.di.a.a();
        com.avito.android.tariff_select.di.h hVar = (com.avito.android.tariff_select.di.h) C29972i.a(C29972i.b(this), com.avito.android.tariff_select.di.h.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        aVarA.a(hVar, interfaceC39417aB, rVarC, arguments != null ? arguments.getString("remote_context") : null, new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301157o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301157o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.tariff_select.j q5() {
        return (com.avito.android.tariff_select.j) this.f301161s0.getValue();
    }
}
