package com.avito.android.screens.bbip.ui;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.content.Context;
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
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.screens.bbip.ui.BbipFragment;
import com.avito.android.screens.bbip.ui.l;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import hh.InterfaceC40934b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import pp0.C47125c;
import v50.C49166b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: BbipFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip/ui/BbipFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes3.dex */
public final class BbipFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f260259H0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public FrameLayout f260260A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public Button f260261B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public Button f260262C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public Button f260263D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public ViewGroup f260264E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public MnzFloatingFooter f260265F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public C49899a f260266G0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public l.a f260267n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f260268o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f260269p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f260270q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f260271r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f260272s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C47125c f260273t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f260274u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f260275v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f260276w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.b f260277x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.progress_overlay.l f260278y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f260279z0;

    /* compiled from: BbipFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip/ui/BbipFragment$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BbipFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f260280b;

        public b(Y41.l lVar) {
            this.f260280b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f260280b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f260280b;
        }

        public final int hashCode() {
            return this.f260280b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f260280b.invoke(obj);
        }
    }

    /* compiled from: BbipFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ op0.d f260282m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(op0.d dVar) {
            super(0);
            this.f260282m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BbipFragment.f260259H0;
            BbipFragment bbipFragment = BbipFragment.this;
            bbipFragment.q5().M5(this.f260282m);
            com.avito.android.lib.design.toast_bar.b bVar = bbipFragment.f260277x0;
            if (bVar != null) {
                bVar.a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f260283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f260283l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f260283l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BbipFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f260285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f260285l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f260285l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260286l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f260286l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260287l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f260287l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BbipFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/l;", "invoke", "()Lcom/avito/android/screens/bbip/ui/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<l> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            BbipFragment bbipFragment = BbipFragment.this;
            l.a aVar = bbipFragment.f260267n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(com.avito.android.mnz_common.extensions.d.c(bbipFragment, "item_id"), com.avito.android.mnz_common.extensions.d.c(bbipFragment, "checkout_context"));
        }
    }

    public BbipFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f260276w0 = new O0(m0.f406844a.b(l.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f260270q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.bbip_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.lib.design.toast_bar.b bVar = this.f260277x0;
        if (bVar != null) {
            bVar.a();
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        q5().F2();
        this.f260279z0 = (RecyclerView) view.findViewById(R.id.bbip_recycler_view);
        this.f260260A0 = (FrameLayout) view.findViewById(R.id.bbip_progress_view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bbip_content_container);
        InterfaceC28373a interfaceC28373a = this.f260269p0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.bbip_group_content, interfaceC28373a != null ? interfaceC28373a : null, R.layout.bbip_network_problem_view, 0, 16, null);
        lVar.f231600j = new com.avito.android.screens.bbip.ui.b(this);
        this.f260278y0 = lVar;
        final int i12 = 0;
        ((Toolbar) view.findViewById(R.id.bbip_toolbar)).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipFragment f260290c;

            {
                this.f260290c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipFragment bbipFragment = this.f260290c;
                switch (i12) {
                    case 0:
                        BbipFragment.a aVar = BbipFragment.f260259H0;
                        ActivityC22955m activityC22955mL1 = bbipFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        BbipFragment.a aVar2 = BbipFragment.f260259H0;
                        bbipFragment.q5().O8();
                        break;
                    case 2:
                        BbipFragment.a aVar3 = BbipFragment.f260259H0;
                        bbipFragment.q5().vc(null);
                        break;
                    default:
                        BbipFragment.a aVar4 = BbipFragment.f260259H0;
                        bbipFragment.q5().Sc();
                        break;
                }
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.bbip_bottom_gradient);
        viewGroup2.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(1, this, viewGroup2));
        this.f260264E0 = viewGroup2;
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.bbip_floating_footer);
        mnzFloatingFooter.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(1, this, mnzFloatingFooter));
        this.f260265F0 = mnzFloatingFooter;
        Button button = (Button) view.findViewById(R.id.bbip_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipFragment f260290c;

            {
                this.f260290c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipFragment bbipFragment = this.f260290c;
                switch (i13) {
                    case 0:
                        BbipFragment.a aVar = BbipFragment.f260259H0;
                        ActivityC22955m activityC22955mL1 = bbipFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        BbipFragment.a aVar2 = BbipFragment.f260259H0;
                        bbipFragment.q5().O8();
                        break;
                    case 2:
                        BbipFragment.a aVar3 = BbipFragment.f260259H0;
                        bbipFragment.q5().vc(null);
                        break;
                    default:
                        BbipFragment.a aVar4 = BbipFragment.f260259H0;
                        bbipFragment.q5().Sc();
                        break;
                }
            }
        });
        this.f260261B0 = button;
        Button button2 = (Button) view.findViewById(R.id.bbip_next_button);
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipFragment f260290c;

            {
                this.f260290c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipFragment bbipFragment = this.f260290c;
                switch (i14) {
                    case 0:
                        BbipFragment.a aVar = BbipFragment.f260259H0;
                        ActivityC22955m activityC22955mL1 = bbipFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        BbipFragment.a aVar2 = BbipFragment.f260259H0;
                        bbipFragment.q5().O8();
                        break;
                    case 2:
                        BbipFragment.a aVar3 = BbipFragment.f260259H0;
                        bbipFragment.q5().vc(null);
                        break;
                    default:
                        BbipFragment.a aVar4 = BbipFragment.f260259H0;
                        bbipFragment.q5().Sc();
                        break;
                }
            }
        });
        this.f260262C0 = button2;
        Button button3 = (Button) view.findViewById(R.id.bbip_skip_button);
        final int i15 = 3;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipFragment f260290c;

            {
                this.f260290c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipFragment bbipFragment = this.f260290c;
                switch (i15) {
                    case 0:
                        BbipFragment.a aVar = BbipFragment.f260259H0;
                        ActivityC22955m activityC22955mL1 = bbipFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        BbipFragment.a aVar2 = BbipFragment.f260259H0;
                        bbipFragment.q5().O8();
                        break;
                    case 2:
                        BbipFragment.a aVar3 = BbipFragment.f260259H0;
                        bbipFragment.q5().vc(null);
                        break;
                    default:
                        BbipFragment.a aVar4 = BbipFragment.f260259H0;
                        bbipFragment.q5().Sc();
                        break;
                }
            }
        });
        this.f260263D0 = button3;
        RecyclerView recyclerView = this.f260279z0;
        if (recyclerView != null) {
            com.avito.konveyor.adapter.a aVar = this.f260272s0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.konveyor.a aVar2 = this.f260271r0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, aVar2));
        }
        RecyclerView recyclerView2 = this.f260279z0;
        if (recyclerView2 != null) {
            C47125c c47125c = this.f260273t0;
            if (c47125c == null) {
                c47125c = null;
            }
            recyclerView2.l(c47125c, -1);
        }
        k kVarQ5 = q5();
        Set<TV0.d<?, ?>> set = this.f260268o0;
        if (set == null) {
            set = null;
        }
        kVarQ5.a(set);
        q5().getState().observe(getViewLifecycleOwner(), new b(new com.avito.android.screens.bbip.ui.c(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f260270q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.screens.bbip.di.o.a().a(this, this, com.avito.android.analytics.screens.s.c(this), (InterfaceC40934b) C29972i.a(C29972i.b(this), InterfaceC40934b.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f260270q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f260275v0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final k q5() {
        return (k) this.f260276w0.getValue();
    }

    public final void r5(boolean z12) {
        Button button = this.f260261B0;
        if (button != null) {
            button.setEnabled(!z12);
        }
        Button button2 = this.f260262C0;
        if (button2 != null) {
            button2.setLoading(z12);
        }
        Button button3 = this.f260263D0;
        if (button3 != null) {
            button3.setEnabled(!z12);
        }
        FrameLayout frameLayout = this.f260260A0;
        if (frameLayout != null) {
            D6.G(frameLayout, z12);
        }
    }

    public final void s5(op0.d dVar, boolean z12) {
        com.avito.android.lib.design.toast_bar.b bVarB = null;
        c cVar = z12 ? new c(dVar) : null;
        RecyclerView recyclerView = this.f260279z0;
        if (recyclerView != null) {
            String f420203a = dVar.getF420203a();
            String string = f420203a == null ? getResources().getString(dVar.getF420204b()) : f420203a;
            int i12 = z12 ? R.string.load_snippet_refresh : 0;
            f.c.f125255c.getClass();
            bVarB = com.avito.android.component.toast.b.b(recyclerView, string, 0, null, i12, cVar, 0, ToastBarPosition.f181046d, f.c.a.b(), null, 130854);
        }
        this.f260277x0 = bVarB;
    }
}
