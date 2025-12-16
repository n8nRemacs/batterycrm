package com.avito.android.cpx_promo.priceinput;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
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
import com.avito.android.cpx_promo.priceinput.di.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
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
import z1.AbstractC50339a;

/* compiled from: CpxPromoPriceInputFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoPriceInputFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f127271s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public m f127272h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f127273i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f127274j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public TextView f127275k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public TextView f127276l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public Input f127277m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public TextView f127278n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public Button f127279o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public ComposeView f127280p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public Integer f127281q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public Integer f127282r0;

    /* compiled from: CpxPromoPriceInputFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputFragment$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CpxPromoPriceInputFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputFragment$a$a, reason: collision with other inner class name */
        public static final class C3786a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CpxPromoPriceInputContent f127283l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3786a(CpxPromoPriceInputContent cpxPromoPriceInputContent) {
                super(1);
                this.f127283l = cpxPromoPriceInputContent;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_content_data", this.f127283l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CpxPromoPriceInputFragment a(@Y61.k CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            CpxPromoPriceInputFragment cpxPromoPriceInputFragment = new CpxPromoPriceInputFragment();
            C35966w1.a(cpxPromoPriceInputFragment, -1, new C3786a(cpxPromoPriceInputContent));
            return cpxPromoPriceInputFragment;
        }

        public a() {
        }
    }

    /* compiled from: CpxPromoPriceInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CpxPromoPriceInputFragment cpxPromoPriceInputFragment = (CpxPromoPriceInputFragment) this.receiver;
            a aVar = CpxPromoPriceInputFragment.f127271s0;
            cpxPromoPriceInputFragment.getClass();
            View viewFindViewById = view2.findViewById(R.id.cpx_promo_price_input_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cpxPromoPriceInputFragment.f127275k0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.cpx_promo_price_input_subtitle);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cpxPromoPriceInputFragment.f127276l0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.cpx_promo_price_input_input);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            cpxPromoPriceInputFragment.f127277m0 = (Input) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.cpx_promo_price_input_hint);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cpxPromoPriceInputFragment.f127278n0 = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.cpx_promo_price_input_button);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById5;
            button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(cpxPromoPriceInputFragment, 10));
            cpxPromoPriceInputFragment.f127279o0 = button;
            View viewFindViewById6 = view2.findViewById(R.id.cpx_promo_price_input_banner_view);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
            }
            cpxPromoPriceInputFragment.f127280p0 = (ComposeView) viewFindViewById6;
            Context context = view2.getContext();
            cpxPromoPriceInputFragment.f127281q0 = context != null ? Integer.valueOf(C35835l0.d(R.attr.gray54, context)) : null;
            Context context2 = view2.getContext();
            cpxPromoPriceInputFragment.f127282r0 = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.red600, context2)) : null;
            ScreenPerformanceTracker screenPerformanceTracker = cpxPromoPriceInputFragment.f127274j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.b(cpxPromoPriceInputFragment, screenPerformanceTracker, (l) cpxPromoPriceInputFragment.f127273i0.getValue(), new com.avito.android.cpx_promo.priceinput.a(1, cpxPromoPriceInputFragment, CpxPromoPriceInputFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputOneTimeEvent;)V", 0), new com.avito.android.cpx_promo.priceinput.b(1, cpxPromoPriceInputFragment, CpxPromoPriceInputFragment.class, "render", "render(Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputState;)V", 0));
            ScreenPerformanceTracker screenPerformanceTracker2 = cpxPromoPriceInputFragment.f127274j0;
            (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f127284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f127284l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f127284l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CpxPromoPriceInputFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f127286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f127286l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f127286l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f127287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f127287l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f127287l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f127288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f127288l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f127288l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxPromoPriceInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpx_promo/priceinput/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<l> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = CpxPromoPriceInputFragment.this.f127272h0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public CpxPromoPriceInputFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f127273i0 = new O0(m0.f406844a.b(l.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3787a interfaceC3787aA = com.avito.android.cpx_promo.priceinput.di.f.a();
        com.avito.android.cpx_promo.impl.di.d dVar = (com.avito.android.cpx_promo.impl.di.d) C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarB = s.b(this);
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("key_content_data", CpxPromoPriceInputContent.class) : arguments.getParcelable("key_content_data");
        if (parcelable == null) {
            throw new IllegalArgumentException("key_content_data - param must be not null");
        }
        interfaceC3787aA.a(dVar, interfaceC39417aB, rVarB, (CpxPromoPriceInputContent) parcelable).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f127274j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f127274j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f127274j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        dVar.E(R.layout.fragment_cpx_promo_price_input, true, new b(1, this, CpxPromoPriceInputFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        return dVar;
    }
}
