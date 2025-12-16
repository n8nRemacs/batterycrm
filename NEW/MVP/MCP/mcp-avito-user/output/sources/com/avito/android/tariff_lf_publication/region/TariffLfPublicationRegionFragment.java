package com.avito.android.tariff_lf_publication.region;

import Cd.C13243a;
import VD0.a;
import VD0.b;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.tariff_lf_publication.region.TariffLfPublicationRegionFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
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
import wZ.C49578b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: TariffLfPublicationRegionFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/TariffLfPublicationRegionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffLfPublicationRegionFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f301018A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf_publication.region.f f301019n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f301020o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f301021p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f301022q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f301023r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f301024s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f301025t0;

    /* renamed from: u0, reason: collision with root package name */
    public xZ.e f301026u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f301027v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f301028w0;

    /* renamed from: x0, reason: collision with root package name */
    public FloatingContainer f301029x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f301030y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public C49899a f301031z0;

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/TariffLfPublicationRegionFragment$a;", "", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = TariffLfPublicationRegionFragment.f301018A0;
            TariffLfPublicationRegionFragment.this.q5().accept(new a.e(new Bundle()));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_lf_publication/region/TariffLfPublicationRegionFragment$c", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public c(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = TariffLfPublicationRegionFragment.this.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<VD0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(VD0.b bVar) {
            VD0.b bVar2 = bVar;
            TariffLfPublicationRegionFragment tariffLfPublicationRegionFragment = (TariffLfPublicationRegionFragment) this.receiver;
            a aVar = TariffLfPublicationRegionFragment.f301018A0;
            tariffLfPublicationRegionFragment.getClass();
            if (bVar2 instanceof b.C1167b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffLfPublicationRegionFragment.f301025t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.C1167b c1167b = (b.C1167b) bVar2;
                aVar2.r6(c1167b.f17016b, c1167b.f17015a, "tariff_lf_publication_region_request_key");
            } else if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = tariffLfPublicationRegionFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (bVar2 instanceof b.c) {
                ((com.avito.android.deeplink_handler.view.impl.i) tariffLfPublicationRegionFragment.f301021p0.getValue()).a(((b.c) bVar2).f17017a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<VD0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(VD0.c cVar) {
            VD0.c cVar2 = cVar;
            TariffLfPublicationRegionFragment tariffLfPublicationRegionFragment = (TariffLfPublicationRegionFragment) this.receiver;
            a aVar = TariffLfPublicationRegionFragment.f301018A0;
            tariffLfPublicationRegionFragment.getClass();
            if (cVar2.f17020b) {
                View view = tariffLfPublicationRegionFragment.f301027v0;
                if (view == null) {
                    view = null;
                }
                D6.H(view);
                FloatingContainer floatingContainer = tariffLfPublicationRegionFragment.f301029x0;
                if (floatingContainer == null) {
                    floatingContainer = null;
                }
                D6.w(floatingContainer);
                RecyclerView recyclerView = tariffLfPublicationRegionFragment.f301028w0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                D6.w(recyclerView);
                xZ.e eVar = tariffLfPublicationRegionFragment.f301026u0;
                (eVar != null ? eVar : null).c();
            } else {
                Throwable th2 = cVar2.f17021c;
                if (th2 != null) {
                    View view2 = tariffLfPublicationRegionFragment.f301027v0;
                    if (view2 == null) {
                        view2 = null;
                    }
                    D6.w(view2);
                    FloatingContainer floatingContainer2 = tariffLfPublicationRegionFragment.f301029x0;
                    if (floatingContainer2 == null) {
                        floatingContainer2 = null;
                    }
                    D6.w(floatingContainer2);
                    RecyclerView recyclerView2 = tariffLfPublicationRegionFragment.f301028w0;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    D6.w(recyclerView2);
                    xZ.e eVar2 = tariffLfPublicationRegionFragment.f301026u0;
                    (eVar2 != null ? eVar2 : null).d(z.l(th2));
                } else {
                    View view3 = tariffLfPublicationRegionFragment.f301027v0;
                    if (view3 == null) {
                        view3 = null;
                    }
                    D6.w(view3);
                    xZ.e eVar3 = tariffLfPublicationRegionFragment.f301026u0;
                    if (eVar3 == null) {
                        eVar3 = null;
                    }
                    eVar3.b();
                    com.avito.konveyor.adapter.d dVar = tariffLfPublicationRegionFragment.f301024s0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(cVar2.f17022d, null);
                    RecyclerView recyclerView3 = tariffLfPublicationRegionFragment.f301028w0;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    D6.H(recyclerView3);
                    FloatingContainer floatingContainer3 = tariffLfPublicationRegionFragment.f301029x0;
                    if (floatingContainer3 == null) {
                        floatingContainer3 = null;
                    }
                    D6.H(floatingContainer3);
                    FloatingContainer floatingContainer4 = tariffLfPublicationRegionFragment.f301029x0;
                    if (floatingContainer4 == null) {
                        floatingContainer4 = null;
                    }
                    C49578b c49578b = cVar2.f17023e;
                    String str = c49578b != null ? c49578b.f441546a : null;
                    if (str == null) {
                        str = "";
                    }
                    floatingContainer4.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.b(new UU.a(str, null, false, cVar2.f17024f, false, tariffLfPublicationRegionFragment.f301030y0, null, null, null, false, 982, null))));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffLfPublicationRegionFragment.f301018A0;
            TariffLfPublicationRegionFragment.this.q5().accept(new a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "regionId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = TariffLfPublicationRegionFragment.f301018A0;
            TariffLfPublicationRegionFragment.this.q5().accept(new a.f(str));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/i;", "invoke", "()Lcom/avito/android/deeplink_handler/view/impl/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.deeplink_handler.view.impl.i> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.deeplink_handler.view.impl.i invoke() {
            return new com.avito.android.deeplink_handler.view.impl.i(TariffLfPublicationRegionFragment.this.requireActivity());
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f301037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f301037l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f301037l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TariffLfPublicationRegionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f301039l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f301039l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f301039l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301040l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301040l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f301040l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f301041l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f301041l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f301041l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffLfPublicationRegionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_lf_publication/region/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.tariff_lf_publication.region.e> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_lf_publication.region.e invoke() {
            com.avito.android.tariff_lf_publication.region.f fVar = TariffLfPublicationRegionFragment.this.f301019n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff_lf_publication.region.e) fVar.get();
        }
    }

    public TariffLfPublicationRegionFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f301020o0 = new O0(m0.f406844a.b(com.avito.android.tariff_lf_publication.region.e.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f301021p0 = C42727D.c(new h());
        this.f301030y0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 24);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new c(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f301022q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.tariff_lf_publication_region_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        this.f301026u0 = new xZ.e((ViewGroup) view.findViewById(R.id.tariff_lf_publication_region_content_container), new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_publication.region.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffLfPublicationRegionFragment f301044c;

            {
                this.f301044c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffLfPublicationRegionFragment tariffLfPublicationRegionFragment = this.f301044c;
                switch (i12) {
                    case 0:
                        TariffLfPublicationRegionFragment.a aVar = TariffLfPublicationRegionFragment.f301018A0;
                        tariffLfPublicationRegionFragment.q5().accept(a.b.f17008a);
                        break;
                    default:
                        TariffLfPublicationRegionFragment.a aVar2 = TariffLfPublicationRegionFragment.f301018A0;
                        tariffLfPublicationRegionFragment.q5().accept(a.C1166a.f17007a);
                        break;
                }
            }
        }, null, 4, null);
        this.f301027v0 = view.findViewById(R.id.tariff_lf_publication_region_skeleton_item);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_arrowBack24, R.attr.black));
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_publication.region.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffLfPublicationRegionFragment f301044c;

            {
                this.f301044c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffLfPublicationRegionFragment tariffLfPublicationRegionFragment = this.f301044c;
                switch (i13) {
                    case 0:
                        TariffLfPublicationRegionFragment.a aVar = TariffLfPublicationRegionFragment.f301018A0;
                        tariffLfPublicationRegionFragment.q5().accept(a.b.f17008a);
                        break;
                    default:
                        TariffLfPublicationRegionFragment.a aVar2 = TariffLfPublicationRegionFragment.f301018A0;
                        tariffLfPublicationRegionFragment.q5().accept(a.C1166a.f17007a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_lf_publication_region_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f301024s0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new WD0.c(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301022q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f301028w0 = recyclerView;
        FloatingContainer floatingContainer = (FloatingContainer) view.findViewById(R.id.tariff_lf_publication_region_button_container);
        this.f301029x0 = floatingContainer;
        floatingContainer.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 26));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301022q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new d(1, this, TariffLfPublicationRegionFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionOneTimeEvent;)V", 0), new e(1, this, TariffLfPublicationRegionFragment.class, "render", "render(Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f301022q0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf_publication.region.di.a.a().a((KD0.b) C29972i.a(C29972i.b(this), KD0.b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "tariff_lf_publication_remote_context"), new f(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301022q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301022q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f301025t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.tariff_lf_publication.region.e q5() {
        return (com.avito.android.tariff_lf_publication.region.e) this.f301020o0.getValue();
    }
}
