package com.avito.android.comfortable_deal.submitting.ordercall;

import Cd.r;
import Ju.InterfaceC14249c;
import Y41.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.C23060r0;
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
import com.avito.android.comfortable_deal.SubmittingOrderCallScreen;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.comfortable_deal.submitting.ordercall.b;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallState;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import jq.InterfaceC42413a;
import jq.InterfaceC42414b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import kq.C43486b;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: OrderCallFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/OrderCallFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderCallFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f122994s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public b.a f122995n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f122996o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f122997p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f122998q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public C43486b f122999r0;

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/OrderCallFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = OrderCallFragment.f122994s0;
            OrderCallFragment.this.q5().accept(InterfaceC42413a.C11582a.f405819a);
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = OrderCallFragment.f122994s0;
            OrderCallFragment.this.q5().accept(InterfaceC42413a.C11582a.f405819a);
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = OrderCallFragment.f122994s0;
            OrderCallFragment.this.q5().accept(InterfaceC42413a.d.f405822a);
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = OrderCallFragment.f122994s0;
            OrderCallFragment.this.q5().accept(new InterfaceC42413a.b(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<String, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = OrderCallFragment.f122994s0;
            OrderCallFragment.this.q5().accept(new InterfaceC42413a.c(str));
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<InterfaceC42414b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42414b interfaceC42414b) {
            InterfaceC42414b interfaceC42414b2 = interfaceC42414b;
            OrderCallFragment orderCallFragment = (OrderCallFragment) this.receiver;
            a aVar = OrderCallFragment.f122994s0;
            orderCallFragment.getClass();
            if (L.f(interfaceC42414b2, InterfaceC42414b.a.f405823a)) {
                orderCallFragment.requireActivity().setResult(-1);
                orderCallFragment.requireActivity().finish();
            } else if (L.f(interfaceC42414b2, InterfaceC42414b.C11583b.f405824a)) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = orderCallFragment.f122998q0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new SubmittingSuccessLink(), null, null, 6);
            } else if (interfaceC42414b2 instanceof InterfaceC42414b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((InterfaceC42414b.c) interfaceC42414b2).f405825a);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, orderCallFragment, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<OrderCallState, G0> {
        @Override // Y41.l
        public final G0 invoke(OrderCallState orderCallState) {
            OrderCallState orderCallState2 = orderCallState;
            C43486b c43486b = ((OrderCallFragment) this.receiver).f122999r0;
            if (c43486b != null) {
                c43486b.f413234e.setText(orderCallState2.f123073b);
                c43486b.f413235f.setText(orderCallState2.f123074c);
                String str = orderCallState2.f123077f;
                Input input = c43486b.f413237h;
                input.setHint(str);
                Input.t(input, orderCallState2.f123075d, false, 6);
                String str2 = orderCallState2.f123081j;
                TextView textView = c43486b.f413236g;
                textView.setText(str2);
                TextView textView2 = c43486b.f413238i;
                AttributedText attributedText = orderCallState2.f123076e;
                com.avito.android.util.text.j.a(textView2, attributedText, null);
                com.avito.android.tariff.cpa.configure_info.items.feature.e eVar = new com.avito.android.tariff.cpa.configure_info.items.feature.e(c43486b, 21);
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(eVar);
                }
                String str3 = orderCallState2.f123078g;
                Button button = c43486b.f413239j;
                button.setText(str3);
                button.setEnabled(orderCallState2.f123079h);
                button.setLoading(orderCallState2.f123082k);
                if (orderCallState2.f123080i) {
                    Input.f179303W.getClass();
                    input.setState(Input.f179305b0);
                    D6.H(textView);
                } else {
                    Input.f179303W.getClass();
                    input.setState(Input.f179304a0);
                    D6.w(textView);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends C42801a implements p<C43501a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            C43501a c43501a2 = c43501a;
            OrderCallFragment orderCallFragment = (OrderCallFragment) this.receiver;
            a aVar = OrderCallFragment.f122994s0;
            orderCallFragment.getClass();
            if (c43501a2.f413260a.f134520a instanceof SubmittingSuccessLink) {
                InterfaceC14249c interfaceC14249c = c43501a2.f413261b;
                if (interfaceC14249c instanceof SubmittingSuccessLink.b.C3605b) {
                    ActivityC22955m activityC22955mRequireActivity = orderCallFragment.requireActivity();
                    Intent intent = new Intent();
                    intent.putExtra("bundle_key_deeplink.recall", ((SubmittingSuccessLink.b.C3605b) interfaceC14249c).f121890b);
                    G0 g02 = G0.f406611a;
                    activityC22955mRequireActivity.setResult(-1, intent);
                    orderCallFragment.requireActivity().finish();
                } else if (interfaceC14249c instanceof SubmittingSuccessLink.b.a) {
                    orderCallFragment.requireActivity().setResult(0);
                    orderCallFragment.requireActivity().finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f123006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.l lVar) {
            super(0);
            this.f123006m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(OrderCallFragment.this, this.f123006m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return OrderCallFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f123008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f123008l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f123008l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123009l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123009l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f123009l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123010l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123010l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f123010l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: OrderCallFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/comfortable_deal/submitting/ordercall/b;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/comfortable_deal/submitting/ordercall/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<C23060r0, com.avito.android.comfortable_deal.submitting.ordercall.b> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.comfortable_deal.submitting.ordercall.b invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            b.a aVar = OrderCallFragment.this.f122995n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public OrderCallFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f122996o0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.submitting.ordercall.b.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        C19918B.a(requireActivity().getF21241d(), this, new b(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f122997p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.order_call_fragment, viewGroup, false);
        this.f122999r0 = new C43486b(viewInflate, new c(), new d(), new e(), new f());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f122997p0;
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new g(1, this, OrderCallFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallOneTimeEvent;)V", 0), new h(1, this, OrderCallFragment.class, "render", "render(Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C43486b c43486b = this.f122999r0;
        if (c43486b != null) {
            c43486b.f413237h.h(c43486b.f413240k);
        }
        this.f122999r0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f122997p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f122998q0;
        C43175k.K(new C43197r1(new i(2, this, OrderCallFragment.class, "processDeeplinkResult", "processDeeplinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), y.a((aVar != null ? aVar : null).d9())), C22981N.a(getLifecycle()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.submitting.ordercall.di.a.a().a((com.avito.android.comfortable_deal.submitting.ordercall.di.c) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.submitting.ordercall.di.c.class), cv.c.b(this), new C28478k(SubmittingOrderCallScreen.f119749d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f122997p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.comfortable_deal.submitting.ordercall.b q5() {
        return (com.avito.android.comfortable_deal.submitting.ordercall.b) this.f122996o0.getValue();
    }
}
