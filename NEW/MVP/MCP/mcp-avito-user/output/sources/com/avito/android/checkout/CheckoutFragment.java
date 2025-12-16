package com.avito.android.checkout;

import Cd.C13243a;
import Y41.p;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.checkout.CheckoutFragment;
import com.avito.android.checkout.di.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.ui.fragments.BaseFragment;
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
import wZ.C49582f;
import wZ.g;
import xZ.C49899a;
import xo.C49974c;
import xo.InterfaceC49972a;
import xo.InterfaceC49973b;
import yo.C50275c;
import z1.AbstractC50339a;

/* compiled from: CheckoutFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/checkout/CheckoutFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f118107C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f118108A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public MnzFloatingFooter f118109B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.checkout.i f118110n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f118111o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f118112p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f118113q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f118114r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f118115s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f118116t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public C49899a f118117u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public xZ.e f118118v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public View f118119w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public ViewGroup f118120x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public ProgressBarRe23 f118121y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public Button f118122z0;

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/CheckoutFragment$a;", "", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/checkout/CheckoutFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = CheckoutFragment.this.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49973b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49973b interfaceC49973b) {
            RecyclerView recyclerView;
            int i12 = 2;
            InterfaceC49973b interfaceC49973b2 = interfaceC49973b;
            CheckoutFragment checkoutFragment = (CheckoutFragment) this.receiver;
            a aVar = CheckoutFragment.f118107C0;
            checkoutFragment.getClass();
            if (interfaceC49973b2 instanceof InterfaceC49973b.a) {
                ActivityC22955m activityC22955mL1 = checkoutFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else {
                if (interfaceC49973b2 instanceof InterfaceC49973b.C12880b) {
                    ActivityC22955m activityC22955mL12 = checkoutFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.finish();
                    }
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = checkoutFragment.f118112p0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((InterfaceC49973b.C12880b) interfaceC49973b2).f442638a, null, null, 6);
                } else if (interfaceC49973b2 instanceof InterfaceC49973b.c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = checkoutFragment.f118112p0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    InterfaceC49973b.c cVar = (InterfaceC49973b.c) interfaceC49973b2;
                    Integer num = cVar.f442640b;
                    aVar3.r6(num != null ? AK.c.e(num.intValue(), "checkout_button_id") : null, cVar.f442639a, "request_checkout");
                } else if (interfaceC49973b2 instanceof InterfaceC49973b.d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = checkoutFragment.f118112p0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    InterfaceC49973b.d dVar = (InterfaceC49973b.d) interfaceC49973b2;
                    Bundle bundle = new Bundle();
                    bundle.putString("checkout_promo_code", dVar.f442642b);
                    G0 g02 = G0.f406611a;
                    b.a.a(aVar4, dVar.f442641a, null, bundle, 2);
                } else if ((interfaceC49973b2 instanceof InterfaceC49973b.e) && (recyclerView = checkoutFragment.f118108A0) != null) {
                    recyclerView.post(new RunnableC28882d(i12, recyclerView, interfaceC49973b2));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C49974c, G0> {
        public final void f(@Y61.k C49974c c49974c) {
            G0 g02;
            g.a aVar;
            C49578b c49578b;
            Float f12;
            Button button;
            CheckoutFragment checkoutFragment = (CheckoutFragment) this.receiver;
            a aVar2 = CheckoutFragment.f118107C0;
            checkoutFragment.getClass();
            Throwable th2 = c49974c.f442650f;
            if (th2 != null) {
                D6.w(checkoutFragment.f118121y0);
                Button button2 = checkoutFragment.f118122z0;
                if (button2 != null) {
                    D6.w(button2);
                }
                View view = checkoutFragment.f118119w0;
                if (view != null) {
                    D6.w(view);
                }
                ViewGroup viewGroup = checkoutFragment.f118120x0;
                if (viewGroup != null) {
                    D6.H(viewGroup);
                }
                MnzFloatingFooter mnzFloatingFooter = checkoutFragment.f118109B0;
                if (mnzFloatingFooter != null) {
                    D6.w(mnzFloatingFooter);
                }
                xZ.e eVar = checkoutFragment.f118118v0;
                if (eVar != null) {
                    eVar.d(z.l(th2));
                    return;
                }
                return;
            }
            if (c49974c.f442651g) {
                D6.w(checkoutFragment.f118121y0);
                Button button3 = checkoutFragment.f118122z0;
                if (button3 != null) {
                    D6.w(button3);
                }
                View view2 = checkoutFragment.f118119w0;
                if (view2 != null) {
                    D6.H(view2);
                }
                ViewGroup viewGroup2 = checkoutFragment.f118120x0;
                if (viewGroup2 != null) {
                    D6.w(viewGroup2);
                }
                MnzFloatingFooter mnzFloatingFooter2 = checkoutFragment.f118109B0;
                if (mnzFloatingFooter2 != null) {
                    D6.w(mnzFloatingFooter2);
                }
                xZ.e eVar2 = checkoutFragment.f118118v0;
                if (eVar2 != null) {
                    eVar2.c();
                    return;
                }
                return;
            }
            if (c49974c.f442652h) {
                Button button4 = checkoutFragment.f118122z0;
                if (button4 != null) {
                    D6.h(button4);
                }
                Integer num = c49974c.f442649e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view3 = checkoutFragment.getView();
                    if (view3 == null || (button = (Button) view3.findViewById(iIntValue)) == null) {
                        return;
                    }
                    button.setLoading(true);
                    return;
                }
                return;
            }
            wZ.j jVar = c49974c.f442646b;
            if (jVar == null || (f12 = jVar.f441569a) == null) {
                g02 = null;
            } else {
                float fFloatValue = f12.floatValue();
                ProgressBarRe23 progressBarRe23 = checkoutFragment.f118121y0;
                if (progressBarRe23 != null) {
                    progressBarRe23.setProgress(fFloatValue);
                }
                D6.H(checkoutFragment.f118121y0);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                D6.w(checkoutFragment.f118121y0);
            }
            Button button5 = checkoutFragment.f118122z0;
            if (button5 != null) {
                com.avito.android.lib.design.button.b.a(button5, (jVar == null || (c49578b = jVar.f441570b) == null) ? null : c49578b.f441546a, false);
            }
            Button button6 = checkoutFragment.f118122z0;
            if (button6 != null) {
                D6.k(button6);
            }
            com.avito.konveyor.adapter.d dVar = checkoutFragment.f118113q0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(c49974c.f442647c, null);
            MnzFloatingFooter mnzFloatingFooter3 = checkoutFragment.f118109B0;
            if (mnzFloatingFooter3 != null) {
                wZ.g gVar = c49974c.f442648d;
                C49582f c49582f = (gVar == null || (aVar = gVar.f441560a) == null) ? null : aVar.f441565a;
                com.avito.android.util.text.a aVar3 = checkoutFragment.f118115s0;
                mnzFloatingFooter3.b(gVar, c49582f, aVar3 != null ? aVar3 : null, new com.avito.android.checkout.c(checkoutFragment), new com.avito.android.checkout.d(checkoutFragment));
            }
            MnzFloatingFooter mnzFloatingFooter4 = checkoutFragment.f118109B0;
            if (mnzFloatingFooter4 != null) {
                D6.H(mnzFloatingFooter4);
            }
            View view4 = checkoutFragment.f118119w0;
            if (view4 != null) {
                D6.w(view4);
            }
            ViewGroup viewGroup3 = checkoutFragment.f118120x0;
            if (viewGroup3 != null) {
                D6.H(viewGroup3);
            }
            xZ.e eVar3 = checkoutFragment.f118118v0;
            if (eVar3 != null) {
                eVar3.b();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C49974c c49974c) {
            f(c49974c);
            return G0.f406611a;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CheckoutFragment.f118107C0;
            CheckoutFragment.this.q5().accept(new InterfaceC49972a.k(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "promoCode", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<String, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CheckoutFragment.f118107C0;
            CheckoutFragment.this.q5().accept(new InterfaceC49972a.g(str));
            return G0.f406611a;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "promoCode", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements p<DeepLink, String, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, String str) {
            a aVar = CheckoutFragment.f118107C0;
            CheckoutFragment.this.q5().accept(new InterfaceC49972a.f(deepLink, str));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f118127l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f118127l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f118127l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CheckoutFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f118129l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f118129l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f118129l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118130l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f118130l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118131l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118131l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f118131l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/checkout/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/checkout/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.checkout.h> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.checkout.h invoke() {
            com.avito.android.checkout.i iVar = CheckoutFragment.this.f118110n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.checkout.h) iVar.get();
        }
    }

    public CheckoutFragment() {
        super(R.layout.checkout_fragment);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f118116t0 = new O0(m0.f406844a.b(com.avito.android.checkout.h.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 6);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new b(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f118111o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f118111o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, CheckoutFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/checkout/mvi/entity/CheckoutOneTimeEvent;)V", 0), new d(1, this, CheckoutFragment.class, "render", "render(Lcom/avito/android/checkout/mvi/entity/CheckoutState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        View decorView;
        super.onDestroyView();
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (window = activityC22955mL1.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C22823h0.K(decorView, null);
        }
        RecyclerView recyclerView = this.f118108A0;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.checkout_content);
        this.f118120x0 = viewGroup;
        final int i12 = 0;
        this.f118118v0 = new xZ.e(viewGroup, new View.OnClickListener(this) { // from class: com.avito.android.checkout.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CheckoutFragment f118134c;

            {
                this.f118134c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CheckoutFragment checkoutFragment = this.f118134c;
                switch (i12) {
                    case 0:
                        CheckoutFragment.a aVar = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.i.f442633a);
                        break;
                    case 1:
                        CheckoutFragment.a aVar2 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.C12879a.f442623a);
                        break;
                    default:
                        CheckoutFragment.a aVar3 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.c.f442625a);
                        break;
                }
            }
        }, null, 4, null);
        this.f118119w0 = view.findViewById(R.id.checkout_shimmer_layout);
        final int i13 = 1;
        ((Toolbar) view.findViewById(R.id.mnz_toolbar)).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.checkout.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CheckoutFragment f118134c;

            {
                this.f118134c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CheckoutFragment checkoutFragment = this.f118134c;
                switch (i13) {
                    case 0:
                        CheckoutFragment.a aVar = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.i.f442633a);
                        break;
                    case 1:
                        CheckoutFragment.a aVar2 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.C12879a.f442623a);
                        break;
                    default:
                        CheckoutFragment.a aVar3 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.c.f442625a);
                        break;
                }
            }
        });
        this.f118121y0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.checkout.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CheckoutFragment f118134c;

            {
                this.f118134c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CheckoutFragment checkoutFragment = this.f118134c;
                switch (i14) {
                    case 0:
                        CheckoutFragment.a aVar = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.i.f442633a);
                        break;
                    case 1:
                        CheckoutFragment.a aVar2 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.C12879a.f442623a);
                        break;
                    default:
                        CheckoutFragment.a aVar3 = CheckoutFragment.f118107C0;
                        checkoutFragment.q5().accept(InterfaceC49972a.c.f442625a);
                        break;
                }
            }
        });
        this.f118122z0 = button;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.checkout_items);
        com.avito.konveyor.adapter.d dVar = this.f118113q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        com.avito.konveyor.a aVar = this.f118114r0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView.l(new C50275c(aVar), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f118111o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f118108A0 = recyclerView;
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.checkout_bbl_floating_footer);
        mnzFloatingFooter.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 4));
        this.f118109B0 = mnzFloatingFooter;
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            C22823h0.K(activityC22955mL1.getWindow().getDecorView(), new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 3));
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f118111o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        r.a().a((com.avito.android.checkout.di.g) C29972i.a(C29972i.b(this), com.avito.android.checkout.di.g.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "remote_context"), new e(), new f(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f118111o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f118111o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f118112p0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.checkout.h q5() {
        return (com.avito.android.checkout.h) this.f118116t0.getValue();
    }
}
