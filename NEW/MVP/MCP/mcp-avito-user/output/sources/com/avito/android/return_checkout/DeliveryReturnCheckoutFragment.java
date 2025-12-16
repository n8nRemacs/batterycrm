package com.avito.android.return_checkout;

import Cd.C13243a;
import Wm0.b;
import Wm0.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import gj.o;
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

/* compiled from: DeliveryReturnCheckoutFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/return_checkout/DeliveryReturnCheckoutFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "a", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryReturnCheckoutFragment extends TabBaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final a f255211K0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f255212A0;

    /* renamed from: B0, reason: collision with root package name */
    public gj.k f255213B0;

    /* renamed from: C0, reason: collision with root package name */
    public RecyclerView f255214C0;

    /* renamed from: D0, reason: collision with root package name */
    public RecyclerView f255215D0;

    /* renamed from: E0, reason: collision with root package name */
    public RecyclerView f255216E0;

    /* renamed from: F0, reason: collision with root package name */
    public Toolbar f255217F0;

    /* renamed from: G0, reason: collision with root package name */
    public com.avito.android.beduin_shared.model.progress_overlay.a f255218G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public String f255219H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public String f255220I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public String f255221J0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public p f255222t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f255223u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f255224v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public gj.n f255225w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f255226x0;

    /* renamed from: y0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f255227y0;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f255228z0;

    /* compiled from: DeliveryReturnCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/return_checkout/DeliveryReturnCheckoutFragment$a;", "", "<init>", "()V", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeliveryReturnCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/o;", "invoke", "()Lgj/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.o> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.o invoke() {
            return DeliveryReturnCheckoutFragment.this.c1();
        }
    }

    /* compiled from: DeliveryReturnCheckoutFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Wm0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Wm0.b bVar) {
            Wm0.b bVar2 = bVar;
            DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment = (DeliveryReturnCheckoutFragment) this.receiver;
            a aVar = DeliveryReturnCheckoutFragment.f255211K0;
            deliveryReturnCheckoutFragment.getClass();
            if (bVar2 instanceof b.a) {
                ApiError apiError = ((b.a) bVar2).f18034a;
                com.avito.android.component.toast.b.c(deliveryReturnCheckoutFragment, apiError.getF244063c(), null, new f.c(apiError), 382);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryReturnCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWm0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LWm0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Wm0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Wm0.c cVar) {
            a aVar = DeliveryReturnCheckoutFragment.f255211K0;
            DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment = DeliveryReturnCheckoutFragment.this;
            c.a aVar2 = cVar.f18035b;
            if (aVar2 instanceof c.a.C1282a) {
                c.a.C1282a c1282a = (c.a.C1282a) aVar2;
                com.avito.android.beduin_shared.model.progress_overlay.a aVar3 = deliveryReturnCheckoutFragment.f255218G0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.b();
                Toolbar toolbar = deliveryReturnCheckoutFragment.f255217F0;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setTitle(c1282a.f18036a);
                deliveryReturnCheckoutFragment.f255219H0 = c1282a.f18037b;
                deliveryReturnCheckoutFragment.f255220I0 = c1282a.f18038c;
                deliveryReturnCheckoutFragment.f255221J0 = c1282a.f18039d;
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a = deliveryReturnCheckoutFragment.f255227y0;
                if (abstractC25658a == null) {
                    abstractC25658a = null;
                }
                abstractC25658a.m(c1282a.f18040e);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = deliveryReturnCheckoutFragment.f255228z0;
                if (abstractC25658a2 == null) {
                    abstractC25658a2 = null;
                }
                abstractC25658a2.m(c1282a.f18041f);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = deliveryReturnCheckoutFragment.f255212A0;
                (abstractC25658a3 != null ? abstractC25658a3 : null).l(c1282a.f18042g, new com.avito.android.publish.screen.objects.view.actions.h(deliveryReturnCheckoutFragment, 6));
            } else if (aVar2 instanceof c.a.b) {
                c.a.b bVar = (c.a.b) aVar2;
                com.avito.android.beduin_shared.model.progress_overlay.a aVar4 = deliveryReturnCheckoutFragment.f255218G0;
                (aVar4 != null ? aVar4 : null).e(new b.a(deliveryReturnCheckoutFragment.requireContext(), z.i(bVar.f18043a), null, null, null, new com.avito.android.return_checkout.d(deliveryReturnCheckoutFragment, 1), 28, null));
            } else if (L.f(aVar2, c.a.C1283c.f18044a)) {
                com.avito.android.beduin_shared.model.progress_overlay.a aVar5 = deliveryReturnCheckoutFragment.f255218G0;
                C42670a.d(aVar5 != null ? aVar5 : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f255231l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f255231l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f255231l);
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
            return DeliveryReturnCheckoutFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f255233l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f255233l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f255233l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f255234l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f255234l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f255234l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f255235l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f255235l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f255235l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DeliveryReturnCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/return_checkout/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/return_checkout/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<o> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = DeliveryReturnCheckoutFragment.this.f255222t0;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    public DeliveryReturnCheckoutFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f255223u0 = new O0(m0.f406844a.b(o.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        RecyclerView recyclerView;
        String str2 = this.f255219H0;
        if (str2 == null) {
            str2 = "top";
        }
        if (str.equals(str2)) {
            recyclerView = this.f255214C0;
            if (recyclerView == null) {
                return null;
            }
        } else if (str.equals(m0())) {
            recyclerView = this.f255215D0;
            if (recyclerView == null) {
                return null;
            }
        } else {
            String str3 = this.f255221J0;
            if (str3 == null) {
                str3 = "bottom";
            }
            if (!str.equals(str3) || (recyclerView = this.f255216E0) == null) {
                return null;
            }
        }
        return recyclerView;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        RecyclerView recyclerView = this.f255216E0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        o.a aVar = new o.a(recyclerView, ToastBarPosition.f181044b);
        Toolbar toolbar = this.f255217F0;
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
        String str = this.f255220I0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f255224v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.delivery_return_checkout_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        gj.n nVar = this.f255225w0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = gj.m.a(nVar, this);
        this.f255213B0 = kVarA;
        O0 o02 = this.f255223u0;
        ((com.avito.android.beduin.view.c) kVarA).l(((o) o02.getValue()).f255359N);
        InterfaceC25659b interfaceC25659b = this.f255226x0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        this.f255227y0 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        InterfaceC25659b interfaceC25659b2 = this.f255226x0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        this.f255228z0 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b2);
        InterfaceC25659b interfaceC25659b3 = this.f255226x0;
        if (interfaceC25659b3 == null) {
            interfaceC25659b3 = null;
        }
        this.f255212A0 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b3);
        View viewFindViewById = view.findViewById(R.id.beduin_top_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f255214C0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.beduin_main_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f255215D0 = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.beduin_bottom_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f255216E0 = recyclerView;
        RecyclerView recyclerView2 = this.f255214C0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f255227y0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        Q q12 = new Q(recyclerView2, abstractC25658a);
        RecyclerView recyclerView3 = this.f255215D0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f255228z0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        Q q13 = new Q(recyclerView3, abstractC25658a2);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f255212A0;
        if (abstractC25658a3 == null) {
            abstractC25658a3 = null;
        }
        for (Q q14 : C42745f0.U(q12, q13, new Q(recyclerView, abstractC25658a3))) {
            RecyclerView recyclerView4 = (RecyclerView) q14.f406619b;
            AbstractC25658a abstractC25658a4 = (AbstractC25658a) q14.f406620c;
            com.avito.android.beduin_shared.model.utils.h.b(recyclerView4, abstractC25658a4);
            abstractC25658a4.o(((o) o02.getValue()).f255359N.B0());
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f255224v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        RecyclerView recyclerView5 = this.f255215D0;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        screenPerformanceTracker.b(recyclerView5);
        View viewFindViewById4 = view.findViewById(R.id.beduin_toolbar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f255217F0 = (Toolbar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.beduin_toolbar_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        }
        Toolbar toolbar = this.f255217F0;
        if (toolbar == null) {
            toolbar = null;
        }
        o5(toolbar);
        C35966w1.c(this).w(null);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new com.avito.android.return_checkout.d(this, 0));
        View viewFindViewById6 = view.findViewById(R.id.beduin_overlay_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f255218G0 = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById6, new com.avito.android.return_checkout.f(view));
        o oVar = (o) o02.getValue();
        com.avito.android.beduin_shared.model.progress_overlay.a aVar = this.f255218G0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.beduin_shared.model.utils.b.c(oVar.f255359N, this, aVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f255224v0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, (o) o02.getValue(), new c(1, this, DeliveryReturnCheckoutFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f255224v0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            DeliveryReturnCheckoutData deliveryReturnCheckoutData = (DeliveryReturnCheckoutData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("extra_return_checkout_data", DeliveryReturnCheckoutData.class) : arguments.getParcelable("extra_return_checkout_data"));
            if (deliveryReturnCheckoutData != null) {
                com.avito.android.return_checkout.di.component.a.a().a(this, this, s.c(this), deliveryReturnCheckoutData, (com.avito.android.return_checkout.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.return_checkout.di.component.c.class), cv.c.b(this)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f255224v0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f255224v0;
                (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
                return;
            }
        }
        throw new IllegalStateException("Argument extra_return_checkout_data must be set");
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
