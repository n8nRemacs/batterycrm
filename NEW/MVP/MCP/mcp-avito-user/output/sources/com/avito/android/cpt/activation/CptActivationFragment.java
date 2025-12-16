package com.avito.android.cpt.activation;

import Cd.C13243a;
import Lr.InterfaceC14431a;
import Mr.C14522a;
import Nr.InterfaceC14604a;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.cpt.activation.di.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseFragment;
import cv.InterfaceC39417a;
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
import z1.AbstractC50339a;

/* compiled from: CptActivationFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/activation/CptActivationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CptActivationFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f126198B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public Pr.c f126199A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.cpt.activation.h f126200n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f126201o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f126202p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f126203q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126204r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f126205s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f126206t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f126207u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f126208v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f126209w0;

    /* renamed from: x0, reason: collision with root package name */
    public ViewGroup f126210x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f126211y0;

    /* renamed from: z0, reason: collision with root package name */
    public TextView f126212z0;

    /* compiled from: CptActivationFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/activation/CptActivationFragment$a;", "", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptActivationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<DeepLink, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptActivationFragment.f126198B0;
            CptActivationFragment.this.q5().accept(new InterfaceC14431a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f126214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f126214l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f126214l);
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
            return CptActivationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f126216l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f126216l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126216l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126217l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126217l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126217l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126218l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126218l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126218l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CptActivationFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpt/activation/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.cpt.activation.g> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cpt.activation.g invoke() {
            com.avito.android.cpt.activation.h hVar = CptActivationFragment.this.f126200n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.cpt.activation.g) hVar.get();
        }
    }

    public CptActivationFragment() {
        super(R.layout.cpt_activation_fragment);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f126201o0 = new O0(m0.f406844a.b(com.avito.android.cpt.activation.g.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f126202p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cpt_activation_content_container);
        InterfaceC28373a interfaceC28373a = this.f126205s0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a != null ? interfaceC28373a : null, R.layout.cpt_network_problem_view, 0, 18, null);
        lVar.f231600j = new com.avito.android.cpt.activation.c(this);
        this.f126207u0 = lVar;
        this.f126208v0 = view.findViewById(R.id.cpt_activation_skeleton_item);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.cpt_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpt.activation.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CptActivationFragment f126221c;

            {
                this.f126221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CptActivationFragment cptActivationFragment = this.f126221c;
                switch (i12) {
                    case 0:
                        CptActivationFragment.a aVar = CptActivationFragment.f126198B0;
                        cptActivationFragment.q5().accept(InterfaceC14431a.C0633a.f10131a);
                        break;
                    default:
                        CptActivationFragment.a aVar2 = CptActivationFragment.f126198B0;
                        cptActivationFragment.q5().accept(InterfaceC14431a.b.f10132a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cpt_activation_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f126203q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C14522a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126202p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f126209w0 = recyclerView;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.cpt_activation_button_container);
        viewGroup2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 6));
        this.f126210x0 = viewGroup2;
        Button button = (Button) view.findViewById(R.id.cpt_activation_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpt.activation.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CptActivationFragment f126221c;

            {
                this.f126221c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CptActivationFragment cptActivationFragment = this.f126221c;
                switch (i13) {
                    case 0:
                        CptActivationFragment.a aVar = CptActivationFragment.f126198B0;
                        cptActivationFragment.q5().accept(InterfaceC14431a.C0633a.f10131a);
                        break;
                    default:
                        CptActivationFragment.a aVar2 = CptActivationFragment.f126198B0;
                        cptActivationFragment.q5().accept(InterfaceC14431a.b.f10132a);
                        break;
                }
            }
        });
        this.f126211y0 = button;
        this.f126212z0 = (TextView) view.findViewById(R.id.cpt_activation_text_agreement);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126202p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new com.avito.android.cpt.activation.d(1, this, CptActivationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpt/activation/mvi/entity/CptActivationOneTimeEvent;)V", 0), new com.avito.android.cpt.activation.e(1, this, CptActivationFragment.class, "render", "render(Lcom/avito/android/cpt/activation/mvi/entity/CptActivationState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f126202p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3751a interfaceC3751aA = com.avito.android.cpt.activation.di.i.a();
        InterfaceC14604a interfaceC14604a = (InterfaceC14604a) C29972i.a(C29972i.b(this), InterfaceC14604a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_cpt_activation_item_id") : null;
        if (string == null) {
            throw new IllegalArgumentException("key_cpt_activation_item_id".concat(" - param must be not null"));
        }
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments2.getParcelable("key_cpt_activation_next_page_deeplink", DeepLink.class) : arguments2.getParcelable("key_cpt_activation_next_page_deeplink");
        if (parcelable == null) {
            throw new IllegalArgumentException("key_cpt_activation_next_page_deeplink - param must be not null");
        }
        interfaceC3751aA.a(interfaceC14604a, interfaceC39417aB, rVarC, string, (DeepLink) parcelable, new b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126202p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126202p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.cpt.activation.g q5() {
        return (com.avito.android.cpt.activation.g) this.f126201o0.getValue();
    }
}
