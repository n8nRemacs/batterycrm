package com.avito.android.trx_promo_goods.screens.configure;

import Cd.C13243a;
import MF0.a;
import Y41.l;
import Y61.k;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import v50.C49166b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: TrxPromoGoodsConfigureFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/TrxPromoGoodsConfigureFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoGoodsConfigureFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: I0, reason: collision with root package name */
    @k
    public static final a f303328I0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public ViewGroup f303329A0;

    /* renamed from: B0, reason: collision with root package name */
    public Button f303330B0;

    /* renamed from: C0, reason: collision with root package name */
    public Button f303331C0;

    /* renamed from: D0, reason: collision with root package name */
    public TextView f303332D0;

    /* renamed from: E0, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f303333E0;

    /* renamed from: F0, reason: collision with root package name */
    @k
    public final l<Float, G0> f303334F0;

    /* renamed from: G0, reason: collision with root package name */
    @k
    public final d f303335G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public C49899a f303336H0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_goods.screens.configure.h f303337n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f303338o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303339p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f303340q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303341r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f303342s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f303343t0;

    /* renamed from: u0, reason: collision with root package name */
    public xZ.e f303344u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f303345v0;

    /* renamed from: w0, reason: collision with root package name */
    public Toolbar f303346w0;

    /* renamed from: x0, reason: collision with root package name */
    public ProgressBarRe23 f303347x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f303348y0;

    /* renamed from: z0, reason: collision with root package name */
    public RecyclerView f303349z0;

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/TrxPromoGoodsConfigureFragment$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "commission", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Float, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
            TrxPromoGoodsConfigureFragment.this.q5().accept(new a.b(fFloatValue));
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<DeepLink, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
            TrxPromoGoodsConfigureFragment.this.q5().accept(new a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/trx_promo_goods/screens/configure/TrxPromoGoodsConfigureFragment$d", "Landroidx/activity/x;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
            TrxPromoGoodsConfigureFragment.this.q5().accept(a.C0668a.f10496a);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303353l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f303353l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303353l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TrxPromoGoodsConfigureFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f303355l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f303355l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303355l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303356l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303356l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303356l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303357l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303357l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303357l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoGoodsConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_goods/screens/configure/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.trx_promo_goods.screens.configure.g> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_goods.screens.configure.g invoke() {
            com.avito.android.trx_promo_goods.screens.configure.h hVar = TrxPromoGoodsConfigureFragment.this.f303337n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.trx_promo_goods.screens.configure.g) hVar.get();
        }
    }

    public TrxPromoGoodsConfigureFragment() {
        super(R.layout.trx_promo_goods_configure_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f303338o0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_goods.screens.configure.g.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f303333E0 = new c();
        this.f303334F0 = new b();
        this.f303335G0 = new d();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303339p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f303345v0 = view.findViewById(R.id.trx_promo_goods_configure_skeleton_item);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.trx_promo_goods_configure_content_container);
        View view2 = this.f303345v0;
        if (view2 == null) {
            view2 = null;
        }
        final int i12 = 0;
        this.f303344u0 = new xZ.e(viewGroup, new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.configure.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303362c;

            {
                this.f303362c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303362c;
                switch (i12) {
                    case 0:
                        TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.c.f10498a);
                        break;
                    case 1:
                        TrxPromoGoodsConfigureFragment.a aVar2 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.C0668a.f10496a);
                        break;
                    case 2:
                        TrxPromoGoodsConfigureFragment.a aVar3 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.e.f10500a);
                        break;
                    case 3:
                        TrxPromoGoodsConfigureFragment.a aVar4 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.f.f10501a);
                        break;
                    default:
                        TrxPromoGoodsConfigureFragment.a aVar5 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.g.f10502a);
                        break;
                }
            }
        }, view2);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.configure.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303362c;

            {
                this.f303362c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303362c;
                switch (i13) {
                    case 0:
                        TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.c.f10498a);
                        break;
                    case 1:
                        TrxPromoGoodsConfigureFragment.a aVar2 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.C0668a.f10496a);
                        break;
                    case 2:
                        TrxPromoGoodsConfigureFragment.a aVar3 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.e.f10500a);
                        break;
                    case 3:
                        TrxPromoGoodsConfigureFragment.a aVar4 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.f.f10501a);
                        break;
                    default:
                        TrxPromoGoodsConfigureFragment.a aVar5 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.g.f10502a);
                        break;
                }
            }
        });
        this.f303346w0 = toolbar;
        this.f303347x0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.configure.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303362c;

            {
                this.f303362c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303362c;
                switch (i14) {
                    case 0:
                        TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.c.f10498a);
                        break;
                    case 1:
                        TrxPromoGoodsConfigureFragment.a aVar2 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.C0668a.f10496a);
                        break;
                    case 2:
                        TrxPromoGoodsConfigureFragment.a aVar3 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.e.f10500a);
                        break;
                    case 3:
                        TrxPromoGoodsConfigureFragment.a aVar4 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.f.f10501a);
                        break;
                    default:
                        TrxPromoGoodsConfigureFragment.a aVar5 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.g.f10502a);
                        break;
                }
            }
        });
        this.f303348y0 = button;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.trx_promo_goods_configure_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f303340q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new NF0.b(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303339p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f303349z0 = recyclerView;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.trx_promo_goods_configure_button_container);
        viewGroup2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 27));
        this.f303329A0 = viewGroup2;
        Button button2 = (Button) view.findViewById(R.id.trx_promo_goods_configure_primary_button);
        final int i15 = 3;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.configure.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303362c;

            {
                this.f303362c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303362c;
                switch (i15) {
                    case 0:
                        TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.c.f10498a);
                        break;
                    case 1:
                        TrxPromoGoodsConfigureFragment.a aVar2 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.C0668a.f10496a);
                        break;
                    case 2:
                        TrxPromoGoodsConfigureFragment.a aVar3 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.e.f10500a);
                        break;
                    case 3:
                        TrxPromoGoodsConfigureFragment.a aVar4 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.f.f10501a);
                        break;
                    default:
                        TrxPromoGoodsConfigureFragment.a aVar5 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.g.f10502a);
                        break;
                }
            }
        });
        this.f303330B0 = button2;
        Button button3 = (Button) view.findViewById(R.id.trx_promo_goods_configure_secondary_button);
        final int i16 = 4;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.configure.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsConfigureFragment f303362c;

            {
                this.f303362c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303362c;
                switch (i16) {
                    case 0:
                        TrxPromoGoodsConfigureFragment.a aVar = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.c.f10498a);
                        break;
                    case 1:
                        TrxPromoGoodsConfigureFragment.a aVar2 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.C0668a.f10496a);
                        break;
                    case 2:
                        TrxPromoGoodsConfigureFragment.a aVar3 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.e.f10500a);
                        break;
                    case 3:
                        TrxPromoGoodsConfigureFragment.a aVar4 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.f.f10501a);
                        break;
                    default:
                        TrxPromoGoodsConfigureFragment.a aVar5 = TrxPromoGoodsConfigureFragment.f303328I0;
                        trxPromoGoodsConfigureFragment.q5().accept(a.g.f10502a);
                        break;
                }
            }
        });
        this.f303331C0 = button3;
        TextView textView = (TextView) view.findViewById(R.id.trx_promo_goods_configure_text_agreement);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f303332D0 = textView;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.trx_promo_goods.screens.configure.c(this, null), 3);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f303335G0);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303339p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String strC = com.avito.android.mnz_common.extensions.d.c(this, "trx_promo_goods_key_context");
        Bundle arguments = getArguments();
        com.avito.android.trx_promo_goods.screens.configure.di.a.a().a((com.avito.android.trx_promo_goods.common.di.c) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_goods.common.di.c.class), cv.c.b(this), s.c(this), strC, arguments != null ? arguments.getBoolean("trx_promo_goods_key_closable", true) : true, this.f303333E0, this.f303334F0, C49166b.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303339p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303339p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f303341r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.trx_promo_goods.screens.configure.g q5() {
        return (com.avito.android.trx_promo_goods.screens.configure.g) this.f303338o0.getValue();
    }
}
