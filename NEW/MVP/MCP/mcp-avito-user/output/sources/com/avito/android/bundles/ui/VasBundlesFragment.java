package com.avito.android.bundles.ui;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.ui.VasBundlesFragment;
import com.avito.android.bundles.viewmodel.i;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;

/* compiled from: VasBundlesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bundles/ui/VasBundlesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes11.dex */
public final class VasBundlesFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @k
    public static final a f108335A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public i f108336n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f108337o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<com.avito.konveyor.adapter.b> f108338p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f108339q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f108340r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.bundles.ui.view.b f108341s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f108342t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public InterfaceC49447a f108343u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f108344v0;

    /* renamed from: w0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f108345w0;

    /* renamed from: x0, reason: collision with root package name */
    public Toolbar f108346x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.avito.android.bundles.ui.view.a f108347y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f108348z0;

    /* compiled from: VasBundlesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/bundles/ui/VasBundlesFragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSABLE", "KEY_CURRENT_FLOW", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasBundlesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = VasBundlesFragment.this.f108336n0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.ke();
            return G0.f406611a;
        }
    }

    /* compiled from: VasBundlesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f108350b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f108350b = (N) lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f108350b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f108350b;
        }

        public final int hashCode() {
            return this.f108350b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f108350b.invoke(obj);
        }
    }

    public VasBundlesFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Object context = getContext();
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f108343u0 = interfaceC49447a;
        i iVar = this.f108336n0;
        if (iVar == null) {
            iVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f108340r0;
        if (set == null) {
            set = null;
        }
        com.avito.android.bundles.ui.view.b bVar = this.f108341s0;
        iVar.le(set, bVar != null ? bVar : null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f108339q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.vas_bundle_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        this.f108345w0 = lVar;
        lVar.f231600j = new b();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f108346x0 = toolbar;
        if (this.f108348z0) {
            toolbar.setNavigationIcon(R.drawable.ic_close_24);
            Toolbar toolbar2 = this.f108346x0;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            final int i12 = 0;
            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bundles.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ VasBundlesFragment f108352c;

                {
                    this.f108352c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VasBundlesFragment vasBundlesFragment = this.f108352c;
                    switch (i12) {
                        case 0:
                            InterfaceC49447a interfaceC49447a = vasBundlesFragment.f108343u0;
                            if (interfaceC49447a != null) {
                                interfaceC49447a.r1();
                                break;
                            }
                            break;
                        default:
                            VasBundlesFragment.a aVar = VasBundlesFragment.f108335A0;
                            ActivityC22955m activityC22955mL1 = vasBundlesFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            toolbar.setNavigationIcon(R.drawable.ic_back_24);
            Toolbar toolbar3 = this.f108346x0;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            final int i13 = 1;
            toolbar3.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bundles.ui.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ VasBundlesFragment f108352c;

                {
                    this.f108352c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VasBundlesFragment vasBundlesFragment = this.f108352c;
                    switch (i13) {
                        case 0:
                            InterfaceC49447a interfaceC49447a = vasBundlesFragment.f108343u0;
                            if (interfaceC49447a != null) {
                                interfaceC49447a.r1();
                                break;
                            }
                            break;
                        default:
                            VasBundlesFragment.a aVar = VasBundlesFragment.f108335A0;
                            ActivityC22955m activityC22955mL1 = vasBundlesFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f108344v0 = recyclerView;
        RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter = this.f108338p0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerView2 = this.f108344v0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.l(new com.avito.android.bundles.ui.recycler.a(getResources()), -1);
        com.avito.android.bundles.ui.view.a aVar = new com.avito.android.bundles.ui.view.a();
        View viewFindViewById = view.findViewById(R.id.empty_action_button_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        aVar.f108449a = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.empty_action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        aVar.f108450b = (Button) viewFindViewById2;
        this.f108347y0 = aVar;
        i iVar = this.f108336n0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.f108757N.observe(getViewLifecycleOwner(), new c(new com.avito.android.bundles.ui.b(this)));
        i iVar2 = this.f108336n0;
        if (iVar2 == null) {
            iVar2 = null;
        }
        iVar2.f108758O.observe(getViewLifecycleOwner(), new c(new com.avito.android.bundles.ui.c(this)));
        i iVar3 = this.f108336n0;
        if (iVar3 == null) {
            iVar3 = null;
        }
        iVar3.f108760Q.observe(getViewLifecycleOwner(), new c(new d(this)));
        i iVar4 = this.f108336n0;
        if (iVar4 == null) {
            iVar4 = null;
        }
        iVar4.f108759P.observe(getViewLifecycleOwner(), new c(new e(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f108339q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("checkoutContext") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("currentFlow") : null;
        Bundle arguments3 = getArguments();
        this.f108348z0 = (arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("closable")) : null).booleanValue();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.bundles.di.f.a().a(string, this.f108348z0, string2, this, s.c(this), (com.avito.android.bundles.di.l) C29972i.a(C29972i.b(this), com.avito.android.bundles.di.l.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f108339q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f108339q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f108342t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }
}
