package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import Cd.C13243a;
import Ju.InterfaceC14249c;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import ao0.C23646c;
import ao0.InterfaceC23645b;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C4;
import com.avito.android.util.y6;
import gj.o;
import java.util.List;
import javax.inject.Inject;
import jj.C42388a;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: DeliveryUniversalCheckoutFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/DeliveryUniversalCheckoutFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeliveryUniversalCheckoutFragment extends TabBaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final a f256862L0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public gj.n f256863A0;

    /* renamed from: B0, reason: collision with root package name */
    public Toolbar f256864B0;

    /* renamed from: C0, reason: collision with root package name */
    public com.avito.android.beduin_shared.model.progress_overlay.a f256865C0;

    /* renamed from: D0, reason: collision with root package name */
    public RecyclerView f256866D0;

    /* renamed from: E0, reason: collision with root package name */
    public RecyclerView f256867E0;

    /* renamed from: F0, reason: collision with root package name */
    public RecyclerView f256868F0;

    /* renamed from: G0, reason: collision with root package name */
    public View f256869G0;

    /* renamed from: H0, reason: collision with root package name */
    public gj.k f256870H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public String f256871I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public String f256872J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public String f256873K0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public p f256874t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f256875u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f256876v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f256877w0;

    /* renamed from: x0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f256878x0;

    /* renamed from: y0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f256879y0;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f256880z0;

    /* compiled from: DeliveryUniversalCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/DeliveryUniversalCheckoutFragment$a;", "", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeliveryUniversalCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/o;", "invoke", "()Lgj/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.o> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.o invoke() {
            return DeliveryUniversalCheckoutFragment.this.c1();
        }
    }

    /* compiled from: DeliveryUniversalCheckoutFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC23645b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC23645b interfaceC23645b) {
            List<BeduinAction> actions;
            InterfaceC23645b interfaceC23645b2 = interfaceC23645b;
            DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment = (DeliveryUniversalCheckoutFragment) this.receiver;
            a aVar = DeliveryUniversalCheckoutFragment.f256862L0;
            deliveryUniversalCheckoutFragment.getClass();
            if (interfaceC23645b2 instanceof InterfaceC23645b.C1970b) {
                ApiError apiError = ((InterfaceC23645b.C1970b) interfaceC23645b2).f56224a;
                com.avito.android.component.toast.b.c(deliveryUniversalCheckoutFragment, apiError.getF244063c(), null, new f.c(apiError), 382);
            } else if (interfaceC23645b2 instanceof InterfaceC23645b.a) {
                InterfaceC14249c interfaceC14249c = ((InterfaceC23645b.a) interfaceC23645b2).f56223a;
                if ((interfaceC14249c instanceof C4) && (actions = ((C4) interfaceC14249c).getActions()) != null) {
                    com.avito.android.beduin_shared.model.utils.a.a(deliveryUniversalCheckoutFragment.D5().f257188N, actions);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryUniversalCheckoutFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C23646c, G0> {
        @Override // Y41.l
        public final G0 invoke(C23646c c23646c) {
            DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment = (DeliveryUniversalCheckoutFragment) this.receiver;
            a aVar = DeliveryUniversalCheckoutFragment.f256862L0;
            deliveryUniversalCheckoutFragment.getClass();
            C23646c.a aVar2 = c23646c.f56225b;
            if (aVar2 instanceof C23646c.a.C1971a) {
                C23646c.a.C1971a c1971a = (C23646c.a.C1971a) aVar2;
                com.avito.android.beduin_shared.model.progress_overlay.a aVar3 = deliveryUniversalCheckoutFragment.f256865C0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.b();
                Toolbar toolbar = deliveryUniversalCheckoutFragment.f256864B0;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setTitle(c1971a.f56226a);
                deliveryUniversalCheckoutFragment.f256871I0 = c1971a.f56228c;
                deliveryUniversalCheckoutFragment.f256872J0 = c1971a.f56229d;
                deliveryUniversalCheckoutFragment.f256873K0 = c1971a.f56230e;
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a = deliveryUniversalCheckoutFragment.f256878x0;
                if (abstractC25658a == null) {
                    abstractC25658a = null;
                }
                abstractC25658a.m(c1971a.f56231f);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = deliveryUniversalCheckoutFragment.f256879y0;
                if (abstractC25658a2 == null) {
                    abstractC25658a2 = null;
                }
                abstractC25658a2.m(c1971a.f56232g);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = deliveryUniversalCheckoutFragment.f256880z0;
                if (abstractC25658a3 == null) {
                    abstractC25658a3 = null;
                }
                abstractC25658a3.l(c1971a.f56233h, new com.avito.android.publish.screen.objects.view.actions.h(deliveryUniversalCheckoutFragment, 7));
                o oVarD5 = deliveryUniversalCheckoutFragment.D5();
                com.avito.android.beduin_shared.model.progress_overlay.a aVar4 = deliveryUniversalCheckoutFragment.f256865C0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                com.avito.android.beduin_shared.model.utils.b.c(oVarD5.f257188N, deliveryUniversalCheckoutFragment, aVar4);
                com.avito.android.beduin_shared.model.utils.a.a(deliveryUniversalCheckoutFragment.D5().f257188N, c1971a.f56227b);
                if (c1971a.f56235j) {
                    RecyclerView recyclerView = deliveryUniversalCheckoutFragment.f256868F0;
                    (recyclerView != null ? recyclerView : null).setBackgroundResource(R.drawable.delivery_bottom_list_rounded_background_re23);
                } else {
                    RecyclerView recyclerView2 = deliveryUniversalCheckoutFragment.f256868F0;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    recyclerView2.setBackground(null);
                }
            } else if (aVar2 instanceof C23646c.a.b) {
                C23646c.a.b bVar = (C23646c.a.b) aVar2;
                com.avito.android.beduin_shared.model.progress_overlay.a aVar5 = deliveryUniversalCheckoutFragment.f256865C0;
                (aVar5 != null ? aVar5 : null).e(new b.a(deliveryUniversalCheckoutFragment.requireContext(), z.i(bVar.f56236a), null, null, null, new com.avito.android.safedeal_checkout.delivery_universal_checkout.e(deliveryUniversalCheckoutFragment, 1), 28, null));
            } else if (L.f(aVar2, C23646c.a.C1972c.f56237a)) {
                com.avito.android.beduin_shared.model.progress_overlay.a aVar6 = deliveryUniversalCheckoutFragment.f256865C0;
                C42670a.d(aVar6 != null ? aVar6 : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256882l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f256882l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256882l);
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
            return DeliveryUniversalCheckoutFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f256884l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f256884l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256884l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256885l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256885l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256886l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256886l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DeliveryUniversalCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<o> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = DeliveryUniversalCheckoutFragment.this.f256874t0;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    public DeliveryUniversalCheckoutFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f256875u0 = new O0(m0.f406844a.b(o.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        RecyclerView recyclerView;
        String str2 = this.f256871I0;
        if (str2 == null) {
            str2 = "top";
        }
        if (str.equals(str2)) {
            recyclerView = this.f256866D0;
            if (recyclerView == null) {
                return null;
            }
        } else if (str.equals(m0())) {
            recyclerView = this.f256867E0;
            if (recyclerView == null) {
                return null;
            }
        } else {
            String str3 = this.f256873K0;
            if (str3 == null) {
                str3 = "bottom";
            }
            if (!str.equals(str3) || (recyclerView = this.f256868F0) == null) {
                return null;
            }
        }
        return recyclerView;
    }

    public final o D5() {
        return (o) this.f256875u0.getValue();
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        String str2 = this.f256873K0;
        if (str2 == null) {
            str2 = "bottom";
        }
        if (!str.equals(str2)) {
            return B0(str);
        }
        View view = this.f256869G0;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        RecyclerView recyclerView = this.f256868F0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        o.a aVar = new o.a(recyclerView, ToastBarPosition.f181044b);
        Toolbar toolbar = this.f256864B0;
        return new gj.o(aVar, new o.a(toolbar != null ? toolbar : null, ToastBarPosition.f181045c));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new C42388a(requireActivity(), new b());
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f256872J0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f256876v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.delivery_universal_checkout_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        gj.n nVar = this.f256863A0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.a(getViewLifecycleOwner(), requireActivity(), this, new gj.l(Integer.valueOf(y6.b(24)), false, null, null, 14, null)).l(D5().f257188N);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.content_horizontal_offset_re23);
        InterfaceC25659b interfaceC25659b = this.f256877w0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        this.f256878x0 = interfaceC25659b.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b2 = this.f256877w0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        this.f256879y0 = interfaceC25659b2.b(Integer.valueOf(dimensionPixelSize));
        InterfaceC25659b interfaceC25659b3 = this.f256877w0;
        if (interfaceC25659b3 == null) {
            interfaceC25659b3 = null;
        }
        this.f256880z0 = interfaceC25659b3.b(Integer.valueOf(dimensionPixelSize));
        View viewFindViewById = view.findViewById(R.id.beduin_top_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f256866D0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.beduin_main_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f256867E0 = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.beduin_bottom_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f256868F0 = recyclerView;
        RecyclerView recyclerView2 = this.f256866D0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f256878x0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        Q q12 = new Q(recyclerView2, abstractC25658a);
        RecyclerView recyclerView3 = this.f256867E0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f256879y0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        Q q13 = new Q(recyclerView3, abstractC25658a2);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f256880z0;
        if (abstractC25658a3 == null) {
            abstractC25658a3 = null;
        }
        for (Q q14 : C42745f0.U(q12, q13, new Q(recyclerView, abstractC25658a3))) {
            RecyclerView recyclerView4 = (RecyclerView) q14.f406619b;
            AbstractC25658a abstractC25658a4 = (AbstractC25658a) q14.f406620c;
            com.avito.android.beduin_shared.model.utils.h.b(recyclerView4, abstractC25658a4);
            abstractC25658a4.o(D5().f257188N.B0());
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f256876v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        RecyclerView recyclerView5 = this.f256867E0;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        screenPerformanceTracker.b(recyclerView5);
        View viewFindViewById4 = view.findViewById(R.id.beduin_bottom_list_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f256869G0 = viewFindViewById4;
        RecyclerView recyclerView6 = this.f256867E0;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        View viewFindViewById5 = requireView().findViewById(R.id.top_list_shadow);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        com.avito.android.delivery_common.f.a(recyclerView6, -1, viewFindViewById5);
        View viewFindViewById6 = view.findViewById(R.id.beduin_toolbar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f256864B0 = (Toolbar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.beduin_toolbar_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        }
        Toolbar toolbar = this.f256864B0;
        if (toolbar == null) {
            toolbar = null;
        }
        o5(toolbar);
        C35966w1.c(this).w(null);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new com.avito.android.safedeal_checkout.delivery_universal_checkout.e(this, 0));
        View viewFindViewById8 = view.findViewById(R.id.beduin_overlay_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f256865C0 = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById8, new com.avito.android.safedeal_checkout.delivery_universal_checkout.g(view));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256876v0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, D5(), new c(1, this, DeliveryUniversalCheckoutFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutOneTimeEvent;)V", 0), new d(1, this, DeliveryUniversalCheckoutFragment.class, "render", "render(Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f256876v0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        DeliveryUniversalCheckoutData deliveryUniversalCheckoutData;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null || (deliveryUniversalCheckoutData = (DeliveryUniversalCheckoutData) arguments.getParcelable("initial_data")) == null) {
            throw new IllegalStateException("Argument initial_data must be set");
        }
        com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.a.a().a(s.c(this), deliveryUniversalCheckoutData, (com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256876v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256876v0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
