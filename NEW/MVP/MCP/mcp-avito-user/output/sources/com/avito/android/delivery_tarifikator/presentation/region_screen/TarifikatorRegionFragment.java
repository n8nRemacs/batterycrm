package com.avito.android.delivery_tarifikator.presentation.region_screen;

import Cd.C13243a;
import Qv.InterfaceC14937a;
import Vv.InterfaceC15719a;
import Xv.C17052c;
import Xv.InterfaceC17050a;
import Xv.InterfaceC17051b;
import Yv.C18330a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.analytics.DeliveryTarifikatorRegionScreen;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.p;
import com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.q;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: TarifikatorRegionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/TarifikatorRegionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/deep_linking/links/w;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/e;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TarifikatorRegionFragment extends BaseFragment implements w, com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e, InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f135744D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f135745E0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.region_screen.a f135746A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.region_screen.a f135747B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.deal.item.agent.h f135748C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.delivery_tarifikator.presentation.region_screen.k f135749n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f135750o0;

    /* renamed from: p0, reason: collision with root package name */
    public ScreenPerformanceTracker f135751p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f135752q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135753r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47312b f135754s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135755t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135756u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f135757v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f135758w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final b f135759x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.region_screen.a f135760y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.region_screen.a f135761z0;

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/TarifikatorRegionFragment$a;", "", "<init>", "()V", "", "TARIFIKATOR_REGION_PARAMS_KEY", "Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TarifikatorRegionFragment a(@Y61.k RegionScreenParams regionScreenParams) {
            TarifikatorRegionFragment tarifikatorRegionFragment = new TarifikatorRegionFragment();
            C35966w1.a(tarifikatorRegionFragment, 1, new com.avito.android.delivery_tarifikator.presentation.region_screen.b(regionScreenParams));
            return tarifikatorRegionFragment;
        }

        public a() {
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/delivery_tarifikator/presentation/region_screen/TarifikatorRegionFragment$b", "Landroidx/activity/x;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            TarifikatorRegionFragment tarifikatorRegionFragment = TarifikatorRegionFragment.this;
            a aVar = TarifikatorRegionFragment.f135744D0;
            tarifikatorRegionFragment.r5().accept(InterfaceC17050a.C1354a.f19131a);
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            TarifikatorRegionFragment tarifikatorRegionFragment = TarifikatorRegionFragment.this;
            a aVar = TarifikatorRegionFragment.f135744D0;
            tarifikatorRegionFragment.r5().accept(InterfaceC17050a.C1354a.f19131a);
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC17051b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC17051b interfaceC17051b) {
            InterfaceC17051b interfaceC17051b2 = interfaceC17051b;
            TarifikatorRegionFragment tarifikatorRegionFragment = (TarifikatorRegionFragment) this.receiver;
            a aVar = TarifikatorRegionFragment.f135744D0;
            tarifikatorRegionFragment.getClass();
            if (L.f(interfaceC17051b2, InterfaceC17051b.a.f19144a)) {
                androidx.core.content.j jVarRequireActivity = tarifikatorRegionFragment.requireActivity();
                InterfaceC14937a interfaceC14937a = jVarRequireActivity instanceof InterfaceC14937a ? (InterfaceC14937a) jVarRequireActivity : null;
                if (interfaceC14937a != null) {
                    interfaceC14937a.T();
                }
            } else if (interfaceC17051b2 instanceof InterfaceC17051b.C1355b) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, tarifikatorRegionFragment, ((InterfaceC17051b.C1355b) interfaceC17051b2).f19145a, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            } else if (interfaceC17051b2 instanceof InterfaceC17051b.c) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, tarifikatorRegionFragment, ((InterfaceC17051b.c) interfaceC17051b2).f19146a, null, null, null, 0, null, 1022);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<C17052c, G0> {
        public final void f(@Y61.k C17052c c17052c) {
            TarifikatorRegionFragment tarifikatorRegionFragment = (TarifikatorRegionFragment) this.receiver;
            a aVar = TarifikatorRegionFragment.f135744D0;
            C47313c c47313c = tarifikatorRegionFragment.f135753r0;
            n<Object>[] nVarArr = TarifikatorRegionFragment.f135745E0;
            n<Object> nVar = nVarArr[0];
            ((NavBar) c47313c.a()).setState(c17052c.f19149b);
            com.avito.konveyor.adapter.d dVar = tarifikatorRegionFragment.f135752q0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(c17052c.f19150c, null);
            C47313c c47313c2 = tarifikatorRegionFragment.f135755t0;
            n<Object> nVar2 = nVarArr[2];
            Button button = (Button) c47313c2.a();
            boolean z12 = c17052c.f19152e;
            button.setVisibility(z12 ? 0 : 8);
            n<Object> nVar3 = nVarArr[2];
            Button button2 = (Button) c47313c2.a();
            if (z12) {
                button2.setLoading(c17052c.f19154g);
            }
            C47313c c47313c3 = tarifikatorRegionFragment.f135756u0;
            n<Object> nVar4 = nVarArr[3];
            C18330a.b((TextView) c47313c3.a(), c17052c.f19151d, tarifikatorRegionFragment);
            if (!c17052c.f19153f) {
                com.avito.android.lib.design.modal.a aVar2 = tarifikatorRegionFragment.f135757v0;
                if (aVar2 != null) {
                    aVar2.dismiss();
                    return;
                }
                return;
            }
            com.avito.android.lib.design.modal.a aVar3 = tarifikatorRegionFragment.f135757v0;
            if (aVar3 == null || !aVar3.isShowing()) {
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, tarifikatorRegionFragment.requireContext(), new com.avito.android.delivery_tarifikator.presentation.region_screen.h(tarifikatorRegionFragment));
                tarifikatorRegionFragment.f135757v0 = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C17052c c17052c) {
            f(c17052c);
            return G0.f406611a;
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/RegionScreenParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<RegionScreenParams> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final RegionScreenParams invoke() {
            Bundle bundleRequireArguments = TarifikatorRegionFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("TARIFIKATOR_REGION_PARAMS", RegionScreenParams.class) : bundleRequireArguments.getParcelable("TARIFIKATOR_REGION_PARAMS");
            if (parcelable != null) {
                return (RegionScreenParams) parcelable;
            }
            throw new IllegalArgumentException("TarifikatorParams missing");
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f135765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f135765l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f135765l);
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
            return TarifikatorRegionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f135767l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f135767l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f135767l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135768l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135768l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f135768l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135769l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135769l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f135769l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TarifikatorRegionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/delivery_tarifikator/presentation/region_screen/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.delivery_tarifikator.presentation.region_screen.j> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.delivery_tarifikator.presentation.region_screen.j invoke() {
            com.avito.android.delivery_tarifikator.presentation.region_screen.k kVar = TarifikatorRegionFragment.this.f135749n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.delivery_tarifikator.presentation.region_screen.j) kVar.get();
        }
    }

    static {
        Y y12 = new Y(TarifikatorRegionFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f135745E0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorRegionFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorRegionFragment.class, "saveButton", "getSaveButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TarifikatorRegionFragment.class, "footerTextView", "getFooterTextView()Landroid/widget/TextView;", 0, n0Var)};
        f135744D0 = new a(null);
    }

    public TarifikatorRegionFragment() {
        super(R.layout.fragment_tarifikator_region);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f135750o0 = new O0(m0.f406844a.b(com.avito.android.delivery_tarifikator.presentation.region_screen.j.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f135753r0 = new C47313c(null, 1, null);
        this.f135754s0 = new C47312b(null, 1, null);
        this.f135755t0 = new C47313c(null, 1, null);
        this.f135756u0 = new C47313c(null, 1, null);
        this.f135758w0 = C42727D.c(new f());
        this.f135759x0 = new b();
        this.f135760y0 = new com.avito.android.delivery_tarifikator.presentation.region_screen.a(this, 0);
        this.f135761z0 = new com.avito.android.delivery_tarifikator.presentation.region_screen.a(this, 1);
        this.f135746A0 = new com.avito.android.delivery_tarifikator.presentation.region_screen.a(this, 2);
        this.f135747B0 = new com.avito.android.delivery_tarifikator.presentation.region_screen.a(this, 3);
        this.f135748C0 = new com.avito.android.comfortable_deal.deal.item.agent.h(this, 25);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p O0() {
        return this.f135747B0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final q O3() {
        return this.f135760y0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p S4() {
        return this.f135761z0;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final p T2() {
        return this.f135746A0;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        r5().accept(InterfaceC17050a.b.a(deepLink));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f135751p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tarifikator_region_navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c = this.f135753r0;
        n<Object>[] nVarArr = f135745E0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, (NavBar) viewFindViewById);
        n<Object> nVar2 = nVarArr[0];
        NavBar navBar = (NavBar) c47313c.a();
        c cVar = new c();
        int i12 = NavBar.f179818g;
        navBar.c(R.attr.ic_arrowBack24, cVar);
        View viewFindViewById2 = view.findViewById(R.id.tarifikator_region_save_btn);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c2 = this.f135755t0;
        n<Object> nVar3 = nVarArr[2];
        c47313c2.b(this, (Button) viewFindViewById2);
        n<Object> nVar4 = nVarArr[2];
        ((Button) c47313c2.a()).setOnClickListener(this.f135748C0);
        View viewFindViewById3 = view.findViewById(R.id.tarifikator_region_footer_tv);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C47313c c47313c3 = this.f135756u0;
        n<Object> nVar5 = nVarArr[3];
        c47313c3.b(this, textView);
        View viewFindViewById4 = view.findViewById(R.id.tarifikator_region_recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        n<Object> nVar6 = nVarArr[1];
        this.f135754s0.b(this, (RecyclerView) viewFindViewById4);
        q5().setItemAnimator(null);
        q5().o(new com.avito.android.delivery_tarifikator.presentation.region_screen.c(this));
        RecyclerView recyclerViewQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f135752q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewQ5.setAdapter(dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135751p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker == null ? null : screenPerformanceTracker, r5(), new d(1, this, TarifikatorRegionFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionOneTimeEvent;)V", 0), new e(1, this, TarifikatorRegionFragment.class, "render", "render(Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionState;)V", 0));
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f135759x0);
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135751p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        this.f135751p0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(DeliveryTarifikatorRegionScreen.f135223d, s.c(this), null, 4, null));
        InterfaceC15719a.InterfaceC1211a interfaceC1211aWl = ((InterfaceC15719a.b) C29972i.a(C29972i.b(this), InterfaceC15719a.b.class)).Wl();
        InterfaceC42726C interfaceC42726C = this.f135758w0;
        RegionScreenParams regionScreenParams = (RegionScreenParams) interfaceC42726C.getValue();
        DeliveryTarifikatorParams deliveryTarifikatorParams = ((RegionScreenParams) interfaceC42726C.getValue()).f135743c;
        ScreenPerformanceTracker screenPerformanceTracker = this.f135751p0;
        interfaceC1211aWl.a(regionScreenParams, deliveryTarifikatorParams, screenPerformanceTracker == null ? null : screenPerformanceTracker, this, this, cv.c.d(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135751p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f135751p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).c(this, g5());
    }

    public final RecyclerView q5() {
        n<Object> nVar = f135745E0[1];
        return (RecyclerView) this.f135754s0.a();
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.e
    @Y61.k
    public final View.OnClickListener r3() {
        return this.f135748C0;
    }

    public final com.avito.android.delivery_tarifikator.presentation.region_screen.j r5() {
        return (com.avito.android.delivery_tarifikator.presentation.region_screen.j) this.f135750o0.getValue();
    }
}
