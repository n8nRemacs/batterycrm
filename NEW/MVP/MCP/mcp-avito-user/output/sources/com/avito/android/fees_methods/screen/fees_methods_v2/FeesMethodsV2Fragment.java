package com.avito.android.fees_methods.screen.fees_methods_v2;

import Cd.C13243a;
import GE.a;
import GE.b;
import Y41.p;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.fees_methods.screen.fees_methods_v2.FeesMethodsV2Fragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
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
import v50.C49166b;
import w50.InterfaceC49447a;
import z1.AbstractC50339a;
import zE.InterfaceC50445a;

/* compiled from: FeesMethodsV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/FeesMethodsV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeesMethodsV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f158167y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.fees_methods.screen.fees_methods_v2.f f158168n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f158169o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f158170p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f158171q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f158172r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f158173s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public ProgressBarRe23 f158174t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Button f158175u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public ShimmerLayout f158176v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public xZ.e f158177w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public RecyclerView f158178x0;

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/FeesMethodsV2Fragment$a;", "", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<GE.b, G0> {
        @Override // Y41.l
        public final G0 invoke(GE.b bVar) {
            GE.b bVar2 = bVar;
            FeesMethodsV2Fragment feesMethodsV2Fragment = (FeesMethodsV2Fragment) this.receiver;
            a aVar = FeesMethodsV2Fragment.f158167y0;
            feesMethodsV2Fragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = feesMethodsV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else {
                if (bVar2 instanceof b.C0334b) {
                    androidx.core.content.j jVarL1 = feesMethodsV2Fragment.l1();
                    InterfaceC49447a interfaceC49447a = jVarL1 instanceof InterfaceC49447a ? (InterfaceC49447a) jVarL1 : null;
                    if (interfaceC49447a != null) {
                        interfaceC49447a.r1();
                    }
                } else if (bVar2 instanceof b.c) {
                    b.c cVar = (b.c) bVar2;
                    if (cVar.f6388b) {
                        androidx.core.content.j jVarL12 = feesMethodsV2Fragment.l1();
                        InterfaceC49447a interfaceC49447a2 = jVarL12 instanceof InterfaceC49447a ? (InterfaceC49447a) jVarL12 : null;
                        if (interfaceC49447a2 != null) {
                            interfaceC49447a2.r1();
                        }
                    }
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = feesMethodsV2Fragment.f158171q0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, cVar.f6387a, null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<GE.c, G0> {
        @Override // Y41.l
        public final G0 invoke(GE.c cVar) {
            Float f12;
            GE.c cVar2 = cVar;
            FeesMethodsV2Fragment feesMethodsV2Fragment = (FeesMethodsV2Fragment) this.receiver;
            a aVar = FeesMethodsV2Fragment.f158167y0;
            feesMethodsV2Fragment.getClass();
            Throwable th2 = cVar2.f6394e;
            if (th2 != null) {
                D6.w(feesMethodsV2Fragment.f158174t0);
                Button button = feesMethodsV2Fragment.f158175u0;
                if (button != null) {
                    D6.w(button);
                }
                ShimmerLayout shimmerLayout = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                }
                ShimmerLayout shimmerLayout2 = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout2 != null) {
                    shimmerLayout2.d();
                }
                RecyclerView recyclerView = feesMethodsV2Fragment.f158178x0;
                if (recyclerView != null) {
                    D6.H(recyclerView);
                }
                xZ.e eVar = feesMethodsV2Fragment.f158177w0;
                if (eVar != null) {
                    eVar.d(z.l(th2));
                }
            } else if (cVar2.f6395f) {
                D6.w(feesMethodsV2Fragment.f158174t0);
                Button button2 = feesMethodsV2Fragment.f158175u0;
                if (button2 != null) {
                    D6.w(button2);
                }
                ShimmerLayout shimmerLayout3 = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout3 != null) {
                    D6.H(shimmerLayout3);
                }
                ShimmerLayout shimmerLayout4 = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout4 != null) {
                    shimmerLayout4.c();
                }
                RecyclerView recyclerView2 = feesMethodsV2Fragment.f158178x0;
                if (recyclerView2 != null) {
                    D6.w(recyclerView2);
                }
                xZ.e eVar2 = feesMethodsV2Fragment.f158177w0;
                if (eVar2 != null) {
                    eVar2.c();
                }
            } else {
                wZ.j jVar = cVar2.f6391b;
                if (jVar != null && (f12 = jVar.f441569a) != null) {
                    float fFloatValue = f12.floatValue();
                    ProgressBarRe23 progressBarRe23 = feesMethodsV2Fragment.f158174t0;
                    if (progressBarRe23 != null) {
                        progressBarRe23.setProgress(fFloatValue);
                    }
                }
                D6.G(feesMethodsV2Fragment.f158174t0, (jVar != null ? jVar.f441569a : null) != null);
                Button button3 = feesMethodsV2Fragment.f158175u0;
                if (button3 != null) {
                    com.avito.android.mnz_common.extensions.i.b(button3, jVar != null ? jVar.f441570b : null);
                }
                com.avito.konveyor.adapter.d dVar = feesMethodsV2Fragment.f158170p0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(cVar2.f6393d, null);
                ShimmerLayout shimmerLayout5 = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout5 != null) {
                    D6.w(shimmerLayout5);
                }
                ShimmerLayout shimmerLayout6 = feesMethodsV2Fragment.f158176v0;
                if (shimmerLayout6 != null) {
                    shimmerLayout6.d();
                }
                RecyclerView recyclerView3 = feesMethodsV2Fragment.f158178x0;
                if (recyclerView3 != null) {
                    D6.H(recyclerView3);
                }
                xZ.e eVar3 = feesMethodsV2Fragment.f158177w0;
                if (eVar3 != null) {
                    eVar3.b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = FeesMethodsV2Fragment.f158167y0;
            FeesMethodsV2Fragment.this.q5().accept(new a.b(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "feesMethodId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<DeepLink, String, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, String str) {
            a aVar = FeesMethodsV2Fragment.f158167y0;
            FeesMethodsV2Fragment.this.q5().accept(new a.c(deepLink, str));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f158181l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f158181l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f158181l);
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
            return FeesMethodsV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f158183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f158183l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f158183l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f158184l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f158184l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f158184l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f158185l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f158185l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f158185l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FeesMethodsV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/fees_methods/screen/fees_methods_v2/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.fees_methods.screen.fees_methods_v2.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.fees_methods.screen.fees_methods_v2.e invoke() {
            com.avito.android.fees_methods.screen.fees_methods_v2.f fVar = FeesMethodsV2Fragment.this.f158168n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.fees_methods.screen.fees_methods_v2.e) fVar.get();
        }
    }

    public FeesMethodsV2Fragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f158172r0 = new O0(m0.f406844a.b(com.avito.android.fees_methods.screen.fees_methods_v2.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f158169o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f158169o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, FeesMethodsV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2OneTimeEvent;)V", 0), new c(1, this, FeesMethodsV2Fragment.class, "render", "render(Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2State;)V", 0));
        return layoutInflater.inflate(R.layout.fees_methods_v2_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        toolbar.setNavigationIcon(this.f158173s0 ? R.drawable.ic_close_24_black : R.drawable.ic_back_24);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.fees_methods.screen.fees_methods_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FeesMethodsV2Fragment f158188c;

            {
                this.f158188c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeesMethodsV2Fragment feesMethodsV2Fragment = this.f158188c;
                switch (i12) {
                    case 0:
                        FeesMethodsV2Fragment.a aVar = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.C0333a.f6379a);
                        break;
                    case 1:
                        FeesMethodsV2Fragment.a aVar2 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.d.f6383a);
                        break;
                    default:
                        FeesMethodsV2Fragment.a aVar3 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.e.f6384a);
                        break;
                }
            }
        });
        this.f158174t0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.fees_methods.screen.fees_methods_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FeesMethodsV2Fragment f158188c;

            {
                this.f158188c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeesMethodsV2Fragment feesMethodsV2Fragment = this.f158188c;
                switch (i13) {
                    case 0:
                        FeesMethodsV2Fragment.a aVar = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.C0333a.f6379a);
                        break;
                    case 1:
                        FeesMethodsV2Fragment.a aVar2 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.d.f6383a);
                        break;
                    default:
                        FeesMethodsV2Fragment.a aVar3 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.e.f6384a);
                        break;
                }
            }
        });
        this.f158175u0 = button;
        this.f158176v0 = (ShimmerLayout) view.findViewById(R.id.fees_methods_v2_shimmer);
        final int i14 = 2;
        this.f158177w0 = new xZ.e((FrameLayout) view.findViewById(R.id.fees_methods_v2_content), new View.OnClickListener(this) { // from class: com.avito.android.fees_methods.screen.fees_methods_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FeesMethodsV2Fragment f158188c;

            {
                this.f158188c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeesMethodsV2Fragment feesMethodsV2Fragment = this.f158188c;
                switch (i14) {
                    case 0:
                        FeesMethodsV2Fragment.a aVar = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.C0333a.f6379a);
                        break;
                    case 1:
                        FeesMethodsV2Fragment.a aVar2 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.d.f6383a);
                        break;
                    default:
                        FeesMethodsV2Fragment.a aVar3 = FeesMethodsV2Fragment.f158167y0;
                        feesMethodsV2Fragment.q5().accept(a.e.f6384a);
                        break;
                }
            }
        }, null, 4, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fees_methods_v2_items);
        com.avito.konveyor.adapter.d dVar = this.f158170p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new HE.a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158169o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f158178x0 = recyclerView;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f158169o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        this.f158173s0 = arguments != null ? arguments.getBoolean("closable") : false;
        com.avito.android.fees_methods.screen.fees_methods_v2.di.a.a().a((InterfaceC50445a) C29972i.a(C29972i.b(this), InterfaceC50445a.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "checkout_context"), this.f158173s0, new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f158169o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f158169o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f158171q0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.fees_methods.screen.fees_methods_v2.e q5() {
        return (com.avito.android.fees_methods.screen.fees_methods_v2.e) this.f158172r0.getValue();
    }
}
