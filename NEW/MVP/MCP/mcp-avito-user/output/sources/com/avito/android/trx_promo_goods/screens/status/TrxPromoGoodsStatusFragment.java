package com.avito.android.trx_promo_goods.screens.status;

import Cd.C13243a;
import PF0.a;
import PF0.b;
import Y41.l;
import Y61.k;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.status.TrxPromoGoodsStatusFragment;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
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

/* compiled from: TrxPromoGoodsStatusFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/TrxPromoGoodsStatusFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoGoodsStatusFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @k
    public static final a f303747B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @k
    public final b f303748A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_goods.screens.status.g f303749n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f303750o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f303751p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f303752q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final O0 f303753r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f303754s0;

    /* renamed from: t0, reason: collision with root package name */
    public Toolbar f303755t0;

    /* renamed from: u0, reason: collision with root package name */
    public xZ.e f303756u0;

    /* renamed from: v0, reason: collision with root package name */
    public SimpleDraweeView f303757v0;

    /* renamed from: w0, reason: collision with root package name */
    public TextView f303758w0;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f303759x0;

    /* renamed from: y0, reason: collision with root package name */
    public ViewGroup f303760y0;

    /* renamed from: z0, reason: collision with root package name */
    public Button f303761z0;

    /* compiled from: TrxPromoGoodsStatusFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/TrxPromoGoodsStatusFragment$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoGoodsStatusFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/trx_promo_goods/screens/status/TrxPromoGoodsStatusFragment$b", "Landroidx/activity/x;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = TrxPromoGoodsStatusFragment.f303747B0;
            TrxPromoGoodsStatusFragment.this.q5().accept(a.C0836a.f12913a);
        }
    }

    /* compiled from: TrxPromoGoodsStatusFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<PF0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(PF0.b bVar) {
            PF0.b bVar2 = bVar;
            TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = (TrxPromoGoodsStatusFragment) this.receiver;
            a aVar = TrxPromoGoodsStatusFragment.f303747B0;
            trxPromoGoodsStatusFragment.getClass();
            if (bVar2 instanceof b.a) {
                b bVar3 = trxPromoGoodsStatusFragment.f303748A0;
                bVar3.d(false);
                ActivityC22955m activityC22955mL1 = trxPromoGoodsStatusFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                bVar3.d(true);
            } else {
                if (bVar2 instanceof b.C0837b) {
                    androidx.core.content.j jVarL1 = trxPromoGoodsStatusFragment.l1();
                    InterfaceC49447a interfaceC49447a = jVarL1 instanceof InterfaceC49447a ? (InterfaceC49447a) jVarL1 : null;
                    if (interfaceC49447a != null) {
                        interfaceC49447a.r1();
                    }
                } else if (bVar2 instanceof b.c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoGoodsStatusFragment.f303750o0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((b.c) bVar2).f12919a, null, null, 6);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoGoodsStatusFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<PF0.c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10, types: [android.view.ViewGroup] */
        /* JADX WARN: Type inference failed for: r10v5, types: [android.view.ViewGroup] */
        @Override // Y41.l
        public final G0 invoke(PF0.c cVar) {
            PF0.c cVar2 = cVar;
            TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = (TrxPromoGoodsStatusFragment) this.receiver;
            Toolbar toolbar = trxPromoGoodsStatusFragment.f303755t0;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setNavigationIcon(cVar2.f12923c);
            if (cVar2.f12930j) {
                xZ.e eVar = trxPromoGoodsStatusFragment.f303756u0;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.c();
                ?? r102 = trxPromoGoodsStatusFragment.f303760y0;
                D6.w(r102 != 0 ? r102 : null);
            } else {
                String str = cVar2.f12929i;
                if (str != null) {
                    xZ.e eVar2 = trxPromoGoodsStatusFragment.f303756u0;
                    if (eVar2 == null) {
                        eVar2 = null;
                    }
                    eVar2.d(str);
                    ?? r103 = trxPromoGoodsStatusFragment.f303760y0;
                    D6.w(r103 != 0 ? r103 : null);
                } else {
                    xZ.e eVar3 = trxPromoGoodsStatusFragment.f303756u0;
                    if (eVar3 == null) {
                        eVar3 = null;
                    }
                    eVar3.b();
                    ViewGroup viewGroup = trxPromoGoodsStatusFragment.f303760y0;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    D6.H(viewGroup);
                    UniversalImage universalImage = cVar2.f12925e;
                    com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.c(trxPromoGoodsStatusFragment.getResources())) : null);
                    SimpleDraweeView simpleDraweeView = trxPromoGoodsStatusFragment.f303757v0;
                    C35949t5.c(simpleDraweeView == null ? null : simpleDraweeView, aVarB, null, null, null, 14);
                    TextView textView = trxPromoGoodsStatusFragment.f303758w0;
                    if (textView == null) {
                        textView = null;
                    }
                    com.avito.android.util.text.j.a(textView, cVar2.f12926f, null);
                    TextView textView2 = trxPromoGoodsStatusFragment.f303759x0;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    AttributedText attributedText = cVar2.f12927g;
                    com.avito.android.util.text.j.a(textView2, attributedText, null);
                    if (attributedText != null) {
                        attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(trxPromoGoodsStatusFragment, 6));
                    }
                    Button button = trxPromoGoodsStatusFragment.f303761z0;
                    com.avito.android.mnz_common.extensions.i.a(button != null ? button : null, cVar2.f12928h);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f303763l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f303763l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f303763l);
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
            return TrxPromoGoodsStatusFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f303765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f303765l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f303765l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303766l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303766l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f303766l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f303767l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f303767l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f303767l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoGoodsStatusFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_goods/screens/status/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.trx_promo_goods.screens.status.f> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_goods.screens.status.f invoke() {
            com.avito.android.trx_promo_goods.screens.status.g gVar = TrxPromoGoodsStatusFragment.this.f303749n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.trx_promo_goods.screens.status.f) gVar.get();
        }
    }

    public TrxPromoGoodsStatusFragment() {
        super(R.layout.trx_promo_goods_status_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f303753r0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_goods.screens.status.f.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f303748A0 = new b();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f303752q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        this.f303754s0 = view.findViewById(R.id.trx_promo_goods_status_skeleton_item);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.status.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsStatusFragment f303770c;

            {
                this.f303770c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = this.f303770c;
                switch (i12) {
                    case 0:
                        TrxPromoGoodsStatusFragment.a aVar = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.C0836a.f12913a);
                        break;
                    case 1:
                        TrxPromoGoodsStatusFragment.a aVar2 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.d.f12916a);
                        break;
                    default:
                        TrxPromoGoodsStatusFragment.a aVar3 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.c.f12915a);
                        break;
                }
            }
        });
        this.f303755t0 = toolbar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.trx_promo_goods_status_container);
        View view2 = this.f303754s0;
        if (view2 == null) {
            view2 = null;
        }
        final int i13 = 1;
        this.f303756u0 = new xZ.e(viewGroup, new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.status.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsStatusFragment f303770c;

            {
                this.f303770c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = this.f303770c;
                switch (i13) {
                    case 0:
                        TrxPromoGoodsStatusFragment.a aVar = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.C0836a.f12913a);
                        break;
                    case 1:
                        TrxPromoGoodsStatusFragment.a aVar2 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.d.f12916a);
                        break;
                    default:
                        TrxPromoGoodsStatusFragment.a aVar3 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.c.f12915a);
                        break;
                }
            }
        }, view2);
        this.f303757v0 = (SimpleDraweeView) view.findViewById(R.id.trx_promo_goods_status_image);
        this.f303758w0 = (TextView) view.findViewById(R.id.trx_promo_goods_status_text_title);
        TextView textView = (TextView) view.findViewById(R.id.trx_promo_goods_status_text_subtitle);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f303759x0 = textView;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.trx_promo_goods_status_content);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.trx_promo_goods_status_bottom_block);
        viewGroup3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(viewGroup2, 28));
        this.f303760y0 = viewGroup3;
        Button button = (Button) view.findViewById(R.id.trx_promo_goods_status_button);
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_goods.screens.status.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoGoodsStatusFragment f303770c;

            {
                this.f303770c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment = this.f303770c;
                switch (i14) {
                    case 0:
                        TrxPromoGoodsStatusFragment.a aVar = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.C0836a.f12913a);
                        break;
                    case 1:
                        TrxPromoGoodsStatusFragment.a aVar2 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.d.f12916a);
                        break;
                    default:
                        TrxPromoGoodsStatusFragment.a aVar3 = TrxPromoGoodsStatusFragment.f303747B0;
                        trxPromoGoodsStatusFragment.q5().accept(a.c.f12915a);
                        break;
                }
            }
        });
        this.f303761z0 = button;
        ScreenPerformanceTracker screenPerformanceTracker = this.f303752q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, q5(), new c(1, this, TrxPromoGoodsStatusFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusOneTimeEvent;)V", 0), new d(1, this, TrxPromoGoodsStatusFragment.class, "render", "render(Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusState;)V", 0));
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f303748A0);
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303752q0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String strC = com.avito.android.mnz_common.extensions.d.c(this, "trx_promo_goods_key_context");
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("trx_promo_goods_key_closable", true) : true;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments2.getParcelable("trx_promo_goods_key_status", TrxPromoGoodsStatus.class) : arguments2.getParcelable("trx_promo_goods_key_status");
        if (parcelable == null) {
            throw new IllegalArgumentException("trx_promo_goods_key_status - param must be not null");
        }
        com.avito.android.trx_promo_goods.screens.status.di.a.a().a((com.avito.android.trx_promo_goods.common.di.c) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_goods.common.di.c.class), cv.c.b(this), s.c(this), strC, z12, (TrxPromoGoodsStatus) parcelable).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f303752q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f303752q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f303750o0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.trx_promo_goods.screens.status.f q5() {
        return (com.avito.android.trx_promo_goods.screens.status.f) this.f303753r0.getValue();
    }
}
