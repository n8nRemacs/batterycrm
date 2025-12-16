package com.avito.android.trx_promo_impl.status_screen;

import Cd.C13243a;
import RF0.m;
import Y61.l;
import aG0.C19772c;
import aG0.InterfaceC19770a;
import aG0.InterfaceC19771b;
import android.content.Context;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_impl.TrxPromoForbiddenScreen;
import com.avito.android.trx_promo_impl.TrxPromoSuccessScreen;
import com.avito.android.trx_promo_impl.status_screen.TrxPromoStatusFragment;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
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
import v50.C49166b;
import w50.InterfaceC49447a;
import z1.AbstractC50339a;

/* compiled from: TrxPromoStatusFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/TrxPromoStatusFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoStatusFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f304371z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.trx_promo_impl.status_screen.i f304372n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f304373o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f304374p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f304375q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public InterfaceC49447a f304376r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public Toolbar f304377s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f304378t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public SimpleDraweeView f304379u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public TextView f304380v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public TextView f304381w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public Button f304382x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final b f304383y0;

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/TrxPromoStatusFragment$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/trx_promo_impl/status_screen/TrxPromoStatusFragment$b", "Landroidx/activity/x;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = TrxPromoStatusFragment.f304371z0;
            TrxPromoStatusFragment.this.q5().accept(InterfaceC19770a.C1487a.f20841a);
        }
    }

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC19771b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC19771b interfaceC19771b) {
            InterfaceC19771b interfaceC19771b2 = interfaceC19771b;
            TrxPromoStatusFragment trxPromoStatusFragment = (TrxPromoStatusFragment) this.receiver;
            a aVar = TrxPromoStatusFragment.f304371z0;
            trxPromoStatusFragment.getClass();
            if (interfaceC19771b2 instanceof InterfaceC19771b.a) {
                b bVar = trxPromoStatusFragment.f304383y0;
                bVar.d(false);
                ActivityC22955m activityC22955mL1 = trxPromoStatusFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                bVar.d(true);
            } else if (interfaceC19771b2 instanceof InterfaceC19771b.C1488b) {
                InterfaceC49447a interfaceC49447a = trxPromoStatusFragment.f304376r0;
                if (interfaceC49447a != null) {
                    interfaceC49447a.r1();
                }
            } else if (interfaceC19771b2 instanceof InterfaceC19771b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = trxPromoStatusFragment.f304373o0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC19771b.c) interfaceC19771b2).f20847a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C19772c, G0> {
        @Override // Y41.l
        public final G0 invoke(C19772c c19772c) {
            com.avito.android.image_loader.a aVarB;
            Image image;
            Image image2;
            C19772c c19772c2 = c19772c;
            TrxPromoStatusFragment trxPromoStatusFragment = (TrxPromoStatusFragment) this.receiver;
            a aVar = TrxPromoStatusFragment.f304371z0;
            trxPromoStatusFragment.getClass();
            int i12 = c19772c2.f20850b ? R.attr.ic_close24 : R.attr.ic_arrowBack24;
            Toolbar toolbar = trxPromoStatusFragment.f304377s0;
            if (toolbar != null) {
                Context context = trxPromoStatusFragment.getContext();
                toolbar.setNavigationIcon(context != null ? C35835l0.m(context, i12, R.attr.black) : null);
            }
            if (c19772c2.f20857i) {
                com.avito.android.progress_overlay.l lVar = trxPromoStatusFragment.f304378t0;
                if (lVar != null) {
                    lVar.k(null);
                }
            } else {
                String str = c19772c2.f20856h;
                if (str != null) {
                    com.avito.android.progress_overlay.l lVar2 = trxPromoStatusFragment.f304378t0;
                    if (lVar2 != null) {
                        lVar2.a(str);
                    }
                } else {
                    Context context2 = trxPromoStatusFragment.getContext();
                    if (context2 != null) {
                        m mVar = c19772c2.f20852d;
                        if (mVar != null) {
                            boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(context2);
                            image = mVar.f14249a;
                            if (!zB2 && (image2 = mVar.f14250b) != null) {
                                image = image2;
                            }
                        } else {
                            image = null;
                        }
                        aVarB = com.avito.android.image_loader.b.b(image);
                    } else {
                        aVarB = null;
                    }
                    SimpleDraweeView simpleDraweeView = trxPromoStatusFragment.f304379u0;
                    if (simpleDraweeView != null) {
                        C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
                    }
                    TextView textView = trxPromoStatusFragment.f304380v0;
                    if (textView != null) {
                        com.avito.android.util.text.j.a(textView, c19772c2.f20853e, null);
                    }
                    TextView textView2 = trxPromoStatusFragment.f304381w0;
                    AttributedText attributedText = c19772c2.f20854f;
                    if (textView2 != null) {
                        com.avito.android.util.text.j.a(textView2, attributedText, null);
                    }
                    if (attributedText != null) {
                        attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(trxPromoStatusFragment, 7));
                    }
                    Button button = trxPromoStatusFragment.f304382x0;
                    if (button != null) {
                        RF0.h hVar = c19772c2.f20855g;
                        com.avito.android.lib.design.button.b.a(button, hVar != null ? hVar.f14239a : null, false);
                    }
                    com.avito.android.progress_overlay.l lVar3 = trxPromoStatusFragment.f304378t0;
                    if (lVar3 != null) {
                        lVar3.j();
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = TrxPromoStatusFragment.f304371z0;
            TrxPromoStatusFragment.this.q5().accept(InterfaceC19770a.d.f20844a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f304386l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f304386l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f304386l);
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
            return TrxPromoStatusFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f304388l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f304388l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f304388l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f304389l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f304389l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f304389l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f304390l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f304390l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f304390l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TrxPromoStatusFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/trx_promo_impl/status_screen/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.trx_promo_impl.status_screen.h> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.trx_promo_impl.status_screen.h invoke() {
            com.avito.android.trx_promo_impl.status_screen.i iVar = TrxPromoStatusFragment.this.f304372n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.trx_promo_impl.status_screen.h) iVar.get();
        }
    }

    public TrxPromoStatusFragment() {
        super(R.layout.trx_promo_status_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f304375q0 = new O0(m0.f406844a.b(com.avito.android.trx_promo_impl.status_screen.h.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f304383y0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f304373o0;
        if (aVar == null) {
            aVar = null;
        }
        C49166b.c(aVar, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f304374p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f304374p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, TrxPromoStatusFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusOneTimeEvent;)V", 0), new d(1, this, TrxPromoStatusFragment.class, "render", "render(Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.trx_promo_status_toolbar);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_impl.status_screen.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoStatusFragment f304393c;

            {
                this.f304393c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoStatusFragment trxPromoStatusFragment = this.f304393c;
                switch (i12) {
                    case 0:
                        TrxPromoStatusFragment.a aVar = TrxPromoStatusFragment.f304371z0;
                        trxPromoStatusFragment.q5().accept(InterfaceC19770a.C1487a.f20841a);
                        break;
                    default:
                        TrxPromoStatusFragment.a aVar2 = TrxPromoStatusFragment.f304371z0;
                        trxPromoStatusFragment.q5().accept(InterfaceC19770a.c.f20843a);
                        break;
                }
            }
        });
        this.f304377s0 = toolbar;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.trx_promo_status_placeholder), R.id.trx_promo_status_content, null, 0, 0, 28, null);
        lVar.f231600j = new e();
        this.f304378t0 = lVar;
        this.f304379u0 = (SimpleDraweeView) view.findViewById(R.id.trx_promo_status_image);
        this.f304380v0 = (TextView) view.findViewById(R.id.trx_promo_status_title);
        TextView textView = (TextView) view.findViewById(R.id.trx_promo_status_subtitle);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f304381w0 = textView;
        Button button = (Button) view.findViewById(R.id.trx_promo_status_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.trx_promo_impl.status_screen.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TrxPromoStatusFragment f304393c;

            {
                this.f304393c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrxPromoStatusFragment trxPromoStatusFragment = this.f304393c;
                switch (i13) {
                    case 0:
                        TrxPromoStatusFragment.a aVar = TrxPromoStatusFragment.f304371z0;
                        trxPromoStatusFragment.q5().accept(InterfaceC19770a.C1487a.f20841a);
                        break;
                    default:
                        TrxPromoStatusFragment.a aVar2 = TrxPromoStatusFragment.f304371z0;
                        trxPromoStatusFragment.q5().accept(InterfaceC19770a.c.f20843a);
                        break;
                }
            }
        });
        this.f304382x0 = button;
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f304383y0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f304374p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        String string;
        Q q12;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Object context = getContext();
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f304376r0 = interfaceC49447a;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("key_trx_promo_status_context")) == null) {
            throw new IllegalArgumentException("TrxPromoContext param must not be null");
        }
        Bundle arguments2 = getArguments();
        boolean z12 = arguments2 != null ? arguments2.getBoolean("key_trx_promo_status_closable", true) : true;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            TrxPromoStatus trxPromoStatus = (TrxPromoStatus) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments3.getParcelable("key_trx_promo_status_status", TrxPromoStatus.class) : arguments3.getParcelable("key_trx_promo_status_status"));
            if (trxPromoStatus != null) {
                if (trxPromoStatus == TrxPromoStatus.f304485b) {
                    TrxPromoSuccessScreen trxPromoSuccessScreen = TrxPromoSuccessScreen.f303896d;
                    trxPromoSuccessScreen.getClass();
                    q12 = new Q(trxPromoSuccessScreen, TrxPromoSuccessScreen.f303897e);
                } else {
                    TrxPromoForbiddenScreen trxPromoForbiddenScreen = TrxPromoForbiddenScreen.f303861d;
                    trxPromoForbiddenScreen.getClass();
                    q12 = new Q(trxPromoForbiddenScreen, TrxPromoForbiddenScreen.f303862e);
                }
                com.avito.android.trx_promo_impl.status_screen.di.a.a().a((com.avito.android.trx_promo_impl.di.l) C29972i.a(C29972i.b(this), com.avito.android.trx_promo_impl.di.l.class), cv.c.b(this), (Screen) q12.f406619b, s.c(this), (String) q12.f406620c, string, z12, trxPromoStatus).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f304374p0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("TrxPromoStatus param must not be null");
    }

    public final com.avito.android.trx_promo_impl.status_screen.h q5() {
        return (com.avito.android.trx_promo_impl.status_screen.h) this.f304375q0.getValue();
    }
}
