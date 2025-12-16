package com.avito.android.bundles.vas_union;

import Ek.C13495a;
import Ek.C13496b;
import Ek.C13497c;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
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
import com.avito.android.bundles.vas_union.VasUnionFragment;
import com.avito.android.bundles.vas_union.di.m;
import com.avito.android.bundles.vas_union.di.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.Action;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import v50.C49166b;
import w50.InterfaceC49447a;
import xZ.C49899a;

/* compiled from: VasUnionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bundles/vas_union/VasUnionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "DS_TCH_BDGT_AVITO_LOOK_AND_FEEL_THEME_DEPRECATION"})
/* loaded from: classes11.dex */
public final class VasUnionFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f108457A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.bundles.vas_union.viewmodel.a f108458n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f108459o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f108460p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f108461q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f108462r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f108463s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f108464t0;

    /* renamed from: u0, reason: collision with root package name */
    public Button f108465u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public InterfaceC49447a f108466v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f108467w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47312b f108468x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f108469y0;

    /* renamed from: z0, reason: collision with root package name */
    public Toolbar f108470z0;

    /* renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f108456C0 = {m0.f406844a.e(new Y(VasUnionFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f108455B0 = new a(null);

    /* compiled from: VasUnionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/bundles/vas_union/VasUnionFragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSABLE", "KEY_CURRENT_FLOW", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasUnionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LxZ/a;", "invoke", "()LxZ/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C49899a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C49899a invoke() {
            Button button = VasUnionFragment.this.f108465u0;
            if (button == null) {
                button = null;
            }
            return new C49899a(D6.v(button));
        }
    }

    /* compiled from: VasUnionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.bundles.vas_union.viewmodel.a aVar = VasUnionFragment.this.f108458n0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.le();
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f108473b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l lVar) {
            this.f108473b = (N) lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f108473b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f108473b;
        }

        public final int hashCode() {
            return this.f108473b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f108473b.invoke(obj);
        }
    }

    public VasUnionFragment() {
        super(0, 1, null);
        this.f108467w0 = C42727D.c(new b());
        this.f108468x0 = new C47312b(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_LookAndFeel));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Object context = getContext();
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f108466v0 = interfaceC49447a;
        com.avito.android.bundles.vas_union.viewmodel.a aVar = this.f108458n0;
        if (aVar == null) {
            aVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f108464t0;
        aVar.a(set != null ? set : null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f108463s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.vas_union_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        this.f108469y0 = lVar;
        lVar.f231600j = new c();
        Button button = (Button) view.findViewById(R.id.skip_button);
        this.f108465u0 = button;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bundles.vas_union.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VasUnionFragment f108476c;

            {
                this.f108476c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Action action;
                DeepLink deepLink;
                VasUnionFragment vasUnionFragment = this.f108476c;
                switch (i12) {
                    case 0:
                        com.avito.android.bundles.vas_union.viewmodel.a aVar = vasUnionFragment.f108458n0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        C13496b c13496b = aVar.f108706P;
                        C13495a c13495a = (c13496b != null ? c13496b : null).f4212d;
                        if (c13495a != null && (action = c13495a.f4208b) != null && (deepLink = action.getDeepLink()) != null) {
                            aVar.f108708R.postValue(deepLink);
                            break;
                        }
                        break;
                    case 1:
                        InterfaceC49447a interfaceC49447a = vasUnionFragment.f108466v0;
                        if (interfaceC49447a != null) {
                            interfaceC49447a.r1();
                            break;
                        }
                        break;
                    default:
                        VasUnionFragment.a aVar2 = VasUnionFragment.f108455B0;
                        ActivityC22955m activityC22955mL1 = vasUnionFragment.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f108470z0 = toolbar;
        if (this.f108457A0) {
            toolbar.setNavigationIcon(R.drawable.ic_close_24);
            Toolbar toolbar2 = this.f108470z0;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            final int i13 = 1;
            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bundles.vas_union.d

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ VasUnionFragment f108476c;

                {
                    this.f108476c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Action action;
                    DeepLink deepLink;
                    VasUnionFragment vasUnionFragment = this.f108476c;
                    switch (i13) {
                        case 0:
                            com.avito.android.bundles.vas_union.viewmodel.a aVar = vasUnionFragment.f108458n0;
                            if (aVar == null) {
                                aVar = null;
                            }
                            C13496b c13496b = aVar.f108706P;
                            C13495a c13495a = (c13496b != null ? c13496b : null).f4212d;
                            if (c13495a != null && (action = c13495a.f4208b) != null && (deepLink = action.getDeepLink()) != null) {
                                aVar.f108708R.postValue(deepLink);
                                break;
                            }
                            break;
                        case 1:
                            InterfaceC49447a interfaceC49447a = vasUnionFragment.f108466v0;
                            if (interfaceC49447a != null) {
                                interfaceC49447a.r1();
                                break;
                            }
                            break;
                        default:
                            VasUnionFragment.a aVar2 = VasUnionFragment.f108455B0;
                            ActivityC22955m activityC22955mL1 = vasUnionFragment.l1();
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
            Toolbar toolbar3 = this.f108470z0;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            final int i14 = 2;
            toolbar3.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bundles.vas_union.d

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ VasUnionFragment f108476c;

                {
                    this.f108476c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Action action;
                    DeepLink deepLink;
                    VasUnionFragment vasUnionFragment = this.f108476c;
                    switch (i14) {
                        case 0:
                            com.avito.android.bundles.vas_union.viewmodel.a aVar = vasUnionFragment.f108458n0;
                            if (aVar == null) {
                                aVar = null;
                            }
                            C13496b c13496b = aVar.f108706P;
                            C13495a c13495a = (c13496b != null ? c13496b : null).f4212d;
                            if (c13495a != null && (action = c13495a.f4208b) != null && (deepLink = action.getDeepLink()) != null) {
                                aVar.f108708R.postValue(deepLink);
                                break;
                            }
                            break;
                        case 1:
                            InterfaceC49447a interfaceC49447a = vasUnionFragment.f108466v0;
                            if (interfaceC49447a != null) {
                                interfaceC49447a.r1();
                                break;
                            }
                            break;
                        default:
                            VasUnionFragment.a aVar2 = VasUnionFragment.f108455B0;
                            ActivityC22955m activityC22955mL1 = vasUnionFragment.l1();
                            if (activityC22955mL1 != null) {
                                activityC22955mL1.onBackPressed();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tabs_content_recycler_view);
        n<Object> nVar = f108456C0[0];
        this.f108468x0.b(this, recyclerView);
        RecyclerView recyclerViewQ5 = q5();
        com.avito.konveyor.adapter.j jVar = this.f108462r0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewQ5.setAdapter(jVar);
        RecyclerView recyclerViewQ52 = q5();
        Resources resources = getResources();
        com.avito.konveyor.a aVar = this.f108459o0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerViewQ52.l(new C13497c(resources, aVar), -1);
        com.avito.android.bundles.vas_union.viewmodel.a aVar2 = this.f108458n0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.f108705O.observe(getViewLifecycleOwner(), new d(new e(this)));
        com.avito.android.bundles.vas_union.viewmodel.a aVar3 = this.f108458n0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.f108711U.observe(getViewLifecycleOwner(), new d(new f(this)));
        com.avito.android.bundles.vas_union.viewmodel.a aVar4 = this.f108458n0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        aVar4.f108708R.observe(getViewLifecycleOwner(), new d(new g(this)));
        com.avito.android.bundles.vas_union.viewmodel.a aVar5 = this.f108458n0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.f108710T.observe(getViewLifecycleOwner(), new d(new h(this)));
        com.avito.android.bundles.vas_union.viewmodel.a aVar6 = this.f108458n0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        aVar6.f108709S.observe(getViewLifecycleOwner(), new d(new i(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f108463s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("checkoutContext") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("currentFlow") : null;
        Bundle arguments3 = getArguments();
        this.f108457A0 = (arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("closable")) : null).booleanValue();
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.bundles.vas_union.di.d.a().a(string, this.f108457A0, string2, this, s.c(this), new q(string), (m) C29972i.a(C29972i.b(this), m.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f108463s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f108460p0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final RecyclerView q5() {
        n<Object> nVar = f108456C0[0];
        return (RecyclerView) this.f108468x0.a();
    }
}
