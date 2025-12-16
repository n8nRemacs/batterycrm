package com.avito.android.success;

import Cd.C13243a;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import eA0.C39981c;
import eA0.InterfaceC39979a;
import eA0.InterfaceC39980b;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: SuccessFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success/SuccessFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f291545y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f291546n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f291547o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f291548p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f291549q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f291550r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f291551s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f291552t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f291553u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f291554v0;

    /* renamed from: w0, reason: collision with root package name */
    public LinearLayout f291555w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public PV.a f291556x0;

    /* compiled from: SuccessFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/SuccessFragment$a;", "", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC39980b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39980b interfaceC39980b) {
            DeepLink deepLink;
            InterfaceC39980b interfaceC39980b2 = interfaceC39980b;
            SuccessFragment successFragment = (SuccessFragment) this.receiver;
            a aVar = SuccessFragment.f291545y0;
            successFragment.getClass();
            if ((interfaceC39980b2 instanceof InterfaceC39980b.a) && (deepLink = ((InterfaceC39980b.a) interfaceC39980b2).f395033a) != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = successFragment.f291551s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C39981c, G0> {
        @Override // Y41.l
        public final G0 invoke(C39981c c39981c) throws Resources.NotFoundException {
            SuccessFragment successFragment = (SuccessFragment) this.receiver;
            a aVar = SuccessFragment.f291545y0;
            successFragment.getClass();
            C39981c.a aVar2 = c39981c.f395034b;
            if (aVar2 instanceof C39981c.a.C11057a) {
                C39981c.a.C11057a c11057a = (C39981c.a.C11057a) aVar2;
                com.avito.konveyor.adapter.a aVar3 = successFragment.f291550r0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.c(c11057a.f395035a);
                com.avito.konveyor.adapter.j jVar = successFragment.f291549q0;
                if (jVar == null) {
                    jVar = null;
                }
                jVar.notifyDataSetChanged();
                LinearLayout linearLayout = successFragment.f291555w0;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                linearLayout.removeAllViews();
                for (ButtonAction buttonAction : c11057a.f395036b) {
                    LayoutInflater layoutInflater = successFragment.getLayoutInflater();
                    LinearLayout linearLayout2 = successFragment.f291555w0;
                    if (linearLayout2 == null) {
                        linearLayout2 = null;
                    }
                    Button button = (Button) layoutInflater.inflate(R.layout.action_button, (ViewGroup) linearLayout2, false);
                    button.setText(buttonAction.getTitle());
                    String style = buttonAction.getStyle();
                    if (style != null) {
                        button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(style), button.getContext()));
                    }
                    DeepLink deeplink = buttonAction.getDeeplink();
                    if (deeplink != null) {
                        button.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(25, successFragment, deeplink));
                    }
                    LinearLayout linearLayout3 = successFragment.f291555w0;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    linearLayout3.addView(button);
                }
                List<DeepLink> list = c11057a.f395037c;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        successFragment.q5().accept(new InterfaceC39979a.C11056a((DeepLink) it.next()));
                    }
                }
                com.avito.android.progress_overlay.l lVar = successFragment.f291553u0;
                (lVar != null ? lVar : null).j();
            } else if (aVar2 instanceof C39981c.a.C11058c) {
                com.avito.android.progress_overlay.l lVar2 = successFragment.f291553u0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.k(null);
            } else if (aVar2 instanceof C39981c.a.b) {
                com.avito.android.progress_overlay.l lVar3 = successFragment.f291553u0;
                (lVar3 != null ? lVar3 : null).a(((C39981c.a.b) aVar2).f395039a.getF244063c());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<x, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            SuccessFragment successFragment = SuccessFragment.this;
            successFragment.requireActivity().setResult(0);
            successFragment.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SuccessFragment.f291545y0;
            SuccessFragment.this.q5().accept(InterfaceC39979a.b.f395032a);
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeA0/a;", "it", "Lkotlin/G0;", "invoke", "(LeA0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC39979a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39979a interfaceC39979a) {
            a aVar = SuccessFragment.f291545y0;
            SuccessFragment.this.q5().accept(interfaceC39979a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f291560l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f291560l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f291560l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SuccessFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f291562l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f291562l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f291562l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291563l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291563l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f291563l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f291564l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f291564l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f291564l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/success/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/success/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.success.l> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.success.l invoke() {
            m mVar = SuccessFragment.this.f291546n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.success.l) mVar.get();
        }
    }

    public SuccessFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f291547o0 = new O0(m0.f406844a.b(com.avito.android.success.l.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f291548p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.success_fragment, viewGroup, false);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f291548p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, SuccessFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/success/mvi/entity/SuccessOneTimeEvent;)V", 0), new c(1, this, SuccessFragment.class, "render", "render(Lcom/avito/android/success/mvi/entity/SuccessState;)V", 0));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f291548p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        C19918B.a(requireActivity().getF21241d(), this, new d(), 2);
        View viewFindViewById = view.findViewById(R.id.recyclerView);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.j jVar = this.f291549q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f291548p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).b(recyclerView);
        recyclerView.scheduleLayoutAnimation();
        this.f291554v0 = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.buttonsContainer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById2;
        this.f291555w0 = linearLayout;
        linearLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 17));
        View viewFindViewById3 = view.findViewById(R.id.content_holder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.content, null, R.layout.layout_progress_overlay, 0, 20, null);
        lVar.f231600j = new e();
        this.f291553u0 = lVar;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("success-context") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.success.di.component.a.a().a(new C28478k(SuccessScreen.f291566d, s.c(this), "success"), string, new f(), (com.avito.android.success.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.success.di.component.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f291548p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.success.l q5() {
        return (com.avito.android.success.l) this.f291547o0.getValue();
    }
}
