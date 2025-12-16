package com.avito.android.tariff.cpa.info;

import Cd.C13243a;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bB0.C25490c;
import bB0.InterfaceC25488a;
import bB0.InterfaceC25489b;
import cB0.C27001a;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.TariffCpaInfoScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.tariff.cpa.info.di.a;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
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

/* compiled from: CpaInfoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpa/info/CpaInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpaInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f294596A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpa.info.j f294597n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f294598o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f294599p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public C27001a f294600q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f294601r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f294602s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public InterfaceC49447a f294603t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public TextView f294604u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f294605v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public SwipeRefreshLayout f294606w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f294607x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public Input f294608y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public Button f294609z0;

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/info/CpaInfoFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC25489b, G0> {
        public final void f(@Y61.k InterfaceC25489b interfaceC25489b) {
            CpaInfoFragment cpaInfoFragment = (CpaInfoFragment) this.receiver;
            a aVar = CpaInfoFragment.f294596A0;
            cpaInfoFragment.getClass();
            if (interfaceC25489b instanceof InterfaceC25489b.C1996b) {
                ActivityC22955m activityC22955mL1 = cpaInfoFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    return;
                }
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.g) {
                InterfaceC25489b.g gVar = (InterfaceC25489b.g) interfaceC25489b;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, cpaInfoFragment, com.avito.android.printable_text.b.f(gVar.f56993a), null, null, null, 0, gVar.f56994b, 958);
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cpaInfoFragment.f294601r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC25489b.c) interfaceC25489b).f56989a, null, null, 6);
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.e) {
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(cpaInfoFragment.requireContext(), R.style.AdvanceRefillBottomSheetDialog);
                dVar.E(R.layout.advance_refill_bottom_sheet_content, true, new com.avito.android.tariff.cpa.info.e(((InterfaceC25489b.e) interfaceC25489b).f56991a, cpaInfoFragment));
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                com.avito.android.lib.util.g.a(dVar);
                cpaInfoFragment.f294607x0 = dVar;
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.a) {
                com.avito.android.lib.design.bottom_sheet.d dVar2 = cpaInfoFragment.f294607x0;
                if (dVar2 != null) {
                    dVar2.dismiss();
                    return;
                }
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.f) {
                Button button = cpaInfoFragment.f294609z0;
                if (button != null) {
                    button.setLoading(((InterfaceC25489b.f) interfaceC25489b).f56992a);
                    return;
                }
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.h) {
                Button button2 = cpaInfoFragment.f294609z0;
                if (button2 == null) {
                    return;
                }
                button2.setEnabled(((InterfaceC25489b.h) interfaceC25489b).f56995a);
                return;
            }
            if (interfaceC25489b instanceof InterfaceC25489b.d) {
                ActivityC22955m activityC22955mL12 = cpaInfoFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = cpaInfoFragment.f294601r0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((InterfaceC25489b.d) interfaceC25489b).f56990a, null, null, 6);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC25489b interfaceC25489b) {
            f(interfaceC25489b);
            return G0.f406611a;
        }
    }

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C25490c, G0> {
        @Override // Y41.l
        public final G0 invoke(C25490c c25490c) {
            C25490c c25490c2 = c25490c;
            CpaInfoFragment cpaInfoFragment = (CpaInfoFragment) this.receiver;
            a aVar = CpaInfoFragment.f294596A0;
            cpaInfoFragment.getClass();
            if (c25490c2.f57002f) {
                com.avito.android.progress_overlay.l lVar = cpaInfoFragment.f294605v0;
                if (lVar != null) {
                    lVar.k(null);
                }
            } else if (c25490c2.f57001e != null) {
                com.avito.android.progress_overlay.l lVar2 = cpaInfoFragment.f294605v0;
                if (lVar2 != null) {
                    lVar2.a("");
                }
            } else {
                TextView textView = cpaInfoFragment.f294604u0;
                if (textView != null) {
                    textView.setText(c25490c2.f56998b);
                }
                com.avito.konveyor.adapter.d dVar = cpaInfoFragment.f294599p0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(c25490c2.f56999c, null);
                SwipeRefreshLayout swipeRefreshLayout = cpaInfoFragment.f294606w0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                com.avito.android.progress_overlay.l lVar3 = cpaInfoFragment.f294605v0;
                if (lVar3 != null) {
                    lVar3.j();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            InterfaceC25488a.c cVar = new InterfaceC25488a.c(deepLink);
            a aVar = CpaInfoFragment.f294596A0;
            CpaInfoFragment.this.q5(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff/cpa/info/ui/items/balance_info/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<com.avito.android.tariff.cpa.info.ui.items.balance_info.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar) {
            InterfaceC25488a.b bVar = new InterfaceC25488a.b(aVar);
            a aVar2 = CpaInfoFragment.f294596A0;
            CpaInfoFragment.this.q5(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f294612l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f294612l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f294612l);
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
            return CpaInfoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f294614l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f294614l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f294614l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f294615l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f294615l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f294615l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f294616l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f294616l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f294616l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpaInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpa/info/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff.cpa.info.i> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpa.info.i invoke() {
            com.avito.android.tariff.cpa.info.j jVar = CpaInfoFragment.this.f294597n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.tariff.cpa.info.i) jVar.get();
        }
    }

    public CpaInfoFragment() {
        super(R.layout.cpa_info_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f294602s0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpa.info.i.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f294598o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f294598o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.tariff.cpa.info.i) this.f294602s0.getValue(), new b(1, this, CpaInfoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoOneTimeEvent;)V", 0), new c(1, this, CpaInfoFragment.class, "render", "render(Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((Toolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new com.avito.android.tariff.cpa.info.a(this, 0));
        this.f294604u0 = (TextView) view.findViewById(R.id.toolbar_title);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        lVar.f231600j = new com.avito.android.tariff.cpa.info.c(this);
        this.f294605v0 = lVar;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 1));
        this.f294606w0 = swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f294599p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        C27001a c27001a = this.f294600q0;
        if (c27001a == null) {
            c27001a = null;
        }
        recyclerView.l(c27001a, -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f294598o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Object context = getContext();
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f294603t0 = interfaceC49447a;
        a.InterfaceC8953a interfaceC8953aA = com.avito.android.tariff.cpa.info.di.l.a();
        WA0.b bVar = (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        TariffCpaInfoScreen tariffCpaInfoScreen = TariffCpaInfoScreen.f90528d;
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("refresh") : false;
        Bundle arguments2 = getArguments();
        interfaceC8953aA.a(bVar, interfaceC39417aB, tariffCpaInfoScreen, rVarC, z12, arguments2 != null ? arguments2.getBoolean("refreshLevel") : false, new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f294598o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f294601r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final void q5(InterfaceC25488a interfaceC25488a) {
        ((com.avito.android.tariff.cpa.info.i) this.f294602s0.getValue()).accept(interfaceC25488a);
    }
}
