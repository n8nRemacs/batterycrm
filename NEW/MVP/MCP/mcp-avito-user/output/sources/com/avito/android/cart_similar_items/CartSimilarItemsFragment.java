package com.avito.android.cart_similar_items;

import Cd.C13243a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CartSimilarItemsScreen;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cart_similar_items.ScreenStyle;
import com.avito.android.cart_similar_items.di.component.a;
import com.avito.android.cart_similar_items.f;
import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.y6;
import gj.o;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import lj.InterfaceC43779a;
import ln.C43800a;
import mn.C44104d;
import mn.InterfaceC44101a;
import mn.InterfaceC44103c;
import mn.InterfaceC44106f;
import mn.InterfaceC44107g;
import z1.AbstractC50339a;

/* compiled from: CartSimilarItemsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cart_similar_items/CartSimilarItemsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartSimilarItemsFragment extends BaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f115666C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public String f115667A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final Object f115668B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f115669n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f115670o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f115671p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f115672q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.cart_similar_items.konveyor.e f115673r0;

    /* renamed from: s0, reason: collision with root package name */
    @X41.f
    @Inject
    public int f115674s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public r f115675t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f115676u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public N f115677v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public gj.n f115678w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final Object f115679x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f115680y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.cart_similar_items.l f115681z0;

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/CartSimilarItemsFragment$a;", "", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ScreenStyle.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenStyle.a aVar = ScreenStyle.f115707b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/cart_similar_items/model/CartSimilarItemsArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<CartSimilarItemsArguments> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final CartSimilarItemsArguments invoke() {
            Bundle bundleRequireArguments = CartSimilarItemsFragment.this.requireArguments();
            return (CartSimilarItemsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("promotionData", CartSimilarItemsArguments.class) : bundleRequireArguments.getParcelable("promotionData"));
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<gj.k> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            CartSimilarItemsFragment cartSimilarItemsFragment = CartSimilarItemsFragment.this;
            gj.n nVar = cartSimilarItemsFragment.f115678w0;
            if (nVar == null) {
                nVar = null;
            }
            return gj.m.a(nVar, cartSimilarItemsFragment);
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CartSimilarItemsFragment.f115666C0;
            CartSimilarItemsFragment.this.q5().accept(InterfaceC44101a.i.f414685a);
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<InterfaceC44101a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44101a interfaceC44101a) {
            ((q) this.receiver).accept(interfaceC44101a);
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmn/g;", "invoke", "()Lmn/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<InterfaceC44107g> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC44107g invoke() {
            a aVar = CartSimilarItemsFragment.f115666C0;
            return CartSimilarItemsFragment.this.q5().getState().getValue().f414709e;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.CartSimilarItemsFragment$onViewCreated$4", f = "CartSimilarItemsFragment.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115686q;

        /* compiled from: CartSimilarItemsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.cart_similar_items.CartSimilarItemsFragment$onViewCreated$4$1", f = "CartSimilarItemsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f115688q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CartSimilarItemsFragment f115689r;

            /* compiled from: CartSimilarItemsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cart_similar_items.CartSimilarItemsFragment$onViewCreated$4$1$1", f = "CartSimilarItemsFragment.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.cart_similar_items.CartSimilarItemsFragment$h$a$a, reason: collision with other inner class name */
            public static final class C3367a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f115690q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CartSimilarItemsFragment f115691r;

                /* compiled from: CartSimilarItemsFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmn/d;", "it", "Lkotlin/G0;", "invoke", "(Lmn/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.cart_similar_items.CartSimilarItemsFragment$h$a$a$a, reason: collision with other inner class name */
                public static final class C3368a extends kotlin.jvm.internal.N implements Y41.l<C44104d, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CartSimilarItemsFragment f115692l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3368a(CartSimilarItemsFragment cartSimilarItemsFragment) {
                        super(1);
                        this.f115692l = cartSimilarItemsFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(C44104d c44104d) {
                        C44104d c44104d2 = c44104d;
                        a aVar = CartSimilarItemsFragment.f115666C0;
                        CartSimilarItemsFragment cartSimilarItemsFragment = this.f115692l;
                        com.avito.android.cart_similar_items.d dVar = new com.avito.android.cart_similar_items.d(1, cartSimilarItemsFragment.q5(), q.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        cartSimilarItemsFragment.f115667A0 = c44104d2.f414712h;
                        com.avito.android.cart_similar_items.l lVar = cartSimilarItemsFragment.f115681z0;
                        if (lVar == null) {
                            lVar = null;
                        }
                        lVar.f115913g.setNavigationOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(18, dVar));
                        lVar.f115913g.setTitle(c44104d2.f414707c.k0(cartSimilarItemsFragment.requireContext()));
                        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.a(lVar.f115909c, lVar.f115914h, c44104d2.f414711g, com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.b.f176531l);
                        lVar.f115910d.m(c44104d2.f414713i);
                        com.avito.konveyor.adapter.d dVar2 = lVar.f115911e;
                        List<com.avito.android.cart_similar_items.konveyor.c> list = c44104d2.f414714j;
                        dVar2.l(list, null);
                        lVar.f115912f.f115842f = list;
                        InterfaceC44106f interfaceC44106f = c44104d2.f414708d;
                        boolean z12 = interfaceC44106f instanceof InterfaceC44106f.a;
                        SwipeRefreshLayout swipeRefreshLayout = lVar.f115915i;
                        swipeRefreshLayout.setEnabled(!z12);
                        swipeRefreshLayout.setRefreshing(interfaceC44106f instanceof InterfaceC44106f.c);
                        com.avito.android.cart_similar_items.e eVar = new com.avito.android.cart_similar_items.e(dVar);
                        if (z12) {
                            com.avito.android.cart_similar_items.l lVar2 = cartSimilarItemsFragment.f115681z0;
                            C42670a.d((lVar2 != null ? lVar2 : null).f115919m);
                        } else {
                            C44104d.b bVar = c44104d2.f414710f;
                            if (bVar != null) {
                                com.avito.android.cart_similar_items.l lVar3 = cartSimilarItemsFragment.f115681z0;
                                if (lVar3 == null) {
                                    lVar3 = null;
                                }
                                lVar3.getClass();
                                lVar3.f115919m.c(null, new com.avito.android.cart_similar_items.m(bVar, eVar));
                            } else {
                                com.avito.android.cart_similar_items.l lVar4 = cartSimilarItemsFragment.f115681z0;
                                (lVar4 != null ? lVar4 : null).f115919m.b();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3367a(CartSimilarItemsFragment cartSimilarItemsFragment, Continuation<? super C3367a> continuation) {
                    super(2, continuation);
                    this.f115691r = cartSimilarItemsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3367a(this.f115691r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3367a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f115690q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CartSimilarItemsFragment.f115666C0;
                        CartSimilarItemsFragment cartSimilarItemsFragment = this.f115691r;
                        n2<C44104d> state = cartSimilarItemsFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = cartSimilarItemsFragment.f115670o0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3368a c3368a = new C3368a(cartSimilarItemsFragment);
                        this.f115690q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3368a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: CartSimilarItemsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cart_similar_items.CartSimilarItemsFragment$onViewCreated$4$1$2", f = "CartSimilarItemsFragment.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f115693q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CartSimilarItemsFragment f115694r;

                /* compiled from: CartSimilarItemsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.cart_similar_items.CartSimilarItemsFragment$h$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3369a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CartSimilarItemsFragment f115695b;

                    public C3369a(CartSimilarItemsFragment cartSimilarItemsFragment) {
                        this.f115695b = cartSimilarItemsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        RecyclerView.Adapter adapter;
                        Bundle bundle;
                        InterfaceC44103c interfaceC44103c = (InterfaceC44103c) obj;
                        a aVar = CartSimilarItemsFragment.f115666C0;
                        CartSimilarItemsFragment cartSimilarItemsFragment = this.f115695b;
                        if (interfaceC44103c instanceof InterfaceC44103c.b) {
                            cartSimilarItemsFragment.t0();
                        } else {
                            if (interfaceC44103c instanceof InterfaceC44103c.e) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cartSimilarItemsFragment.f115671p0;
                                InterfaceC44103c.e eVar = (InterfaceC44103c.e) interfaceC44103c;
                                (aVar2 != null ? aVar2 : null).r6(eVar.f414696c, eVar.f414694a, eVar.f414695b);
                            } else if (interfaceC44103c instanceof InterfaceC44103c.d) {
                                InterfaceC44103c.d dVar = (InterfaceC44103c.d) interfaceC44103c;
                                C43800a c43800a = dVar.f414693c;
                                if (c43800a != null) {
                                    bundle = new Bundle();
                                    bundle.putString("title", c43800a.f414185a);
                                    bundle.putLong("click_time", c43800a.f414187c);
                                    bundle.putParcelable("screen_source", c43800a.f414186b);
                                    String str = c43800a.f414189e;
                                    if (str != null) {
                                        bundle.putString("price", str);
                                    }
                                    Image image = c43800a.f414188d;
                                    if (image != null) {
                                        bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
                                    }
                                } else {
                                    bundle = null;
                                }
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = cartSimilarItemsFragment.f115671p0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b.a.a(aVar3, new AdvertDetailsLink(dVar.f414691a, dVar.f414692b, null, null, null, null, null, null, null, null, null, 2044, null), null, bundle, 2);
                            } else if (interfaceC44103c instanceof InterfaceC44103c.f) {
                                gj.o oVarC1 = cartSimilarItemsFragment.c1();
                                InterfaceC44103c.f fVar = (InterfaceC44103c.f) interfaceC44103c;
                                if (fVar.f414699c != null) {
                                    cartSimilarItemsFragment.requireContext();
                                    throw null;
                                }
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                o.a aVar4 = oVarC1.f396762b;
                                com.avito.android.component.toast.c.b(cVar, aVar4.f396763a, fVar.f414698b, null, null, null, new f.c(fVar.f414697a), 0, aVar4.f396764b, null, false, false, null, null, 4010);
                                if (fVar.f414700d) {
                                    com.avito.android.cart_snippet_actions.utils.j.a(aVar4.f396763a);
                                }
                            } else if (interfaceC44103c instanceof InterfaceC44103c.g) {
                                com.avito.android.cart_similar_items.l lVar = cartSimilarItemsFragment.f115681z0;
                                if (lVar == null) {
                                    lVar = null;
                                }
                                gj.o oVarC12 = cartSimilarItemsFragment.c1();
                                InterfaceC44103c.g gVar = (InterfaceC44103c.g) interfaceC44103c;
                                Throwable th2 = gVar.f414701a;
                                RecyclerView recyclerView = lVar.f115917k;
                                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                                if (gridLayoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
                                    com.avito.android.cart_similar_items.o oVar = new com.avito.android.cart_similar_items.o(gridLayoutManager, adapter.getItemCount(), oVarC12.f396762b, gVar.f414702b, th2);
                                    if (recyclerView.getScrollState() == 0) {
                                        oVar.invoke();
                                    } else {
                                        recyclerView.o(new com.avito.android.cart_similar_items.n(oVar));
                                    }
                                }
                            } else if (interfaceC44103c instanceof InterfaceC44103c.C11840c) {
                                cartSimilarItemsFragment.q5();
                                ((InterfaceC44103c.C11840c) interfaceC44103c).getClass();
                            } else if (interfaceC44103c instanceof InterfaceC44103c.a) {
                                Iterator<T> it = cartSimilarItemsFragment.q5().f116143N.getF103565k().getAll().iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC43779a) it.next()).h(((InterfaceC44103c.a) interfaceC44103c).f414689a);
                                }
                            } else if (interfaceC44103c instanceof InterfaceC44103c.h) {
                                N n12 = cartSimilarItemsFragment.f115677v0;
                                (n12 != null ? n12 : null).qe(((InterfaceC44103c.h) interfaceC44103c).f414703a);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f115695b, CartSimilarItemsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CartSimilarItemsFragment cartSimilarItemsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f115694r = cartSimilarItemsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f115694r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f115693q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CartSimilarItemsFragment.f115666C0;
                        CartSimilarItemsFragment cartSimilarItemsFragment = this.f115694r;
                        q qVarQ5 = cartSimilarItemsFragment.q5();
                        C3369a c3369a = new C3369a(cartSimilarItemsFragment);
                        this.f115693q = 1;
                        if (qVarQ5.ke(c3369a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: CartSimilarItemsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.cart_similar_items.CartSimilarItemsFragment$onViewCreated$4$1$3", f = "CartSimilarItemsFragment.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f115696q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CartSimilarItemsFragment f115697r;

                /* compiled from: CartSimilarItemsFragment.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.cart_similar_items.CartSimilarItemsFragment$h$a$c$a, reason: collision with other inner class name */
                public static final class C3370a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CartSimilarItemsFragment f115698b;

                    public C3370a(CartSimilarItemsFragment cartSimilarItemsFragment) {
                        this.f115698b = cartSimilarItemsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = CartSimilarItemsFragment.f115666C0;
                        this.f115698b.q5().accept(InterfaceC44101a.c.f414676a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(CartSimilarItemsFragment cartSimilarItemsFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f115697r = cartSimilarItemsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f115697r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f115696q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CartSimilarItemsFragment cartSimilarItemsFragment = this.f115697r;
                        com.avito.android.cart_similar_items.l lVar = cartSimilarItemsFragment.f115681z0;
                        if (lVar == null) {
                            lVar = null;
                        }
                        InterfaceC43160i interfaceC43160iA = y.a(lVar.f115909c.c(lVar.f115914h));
                        C3370a c3370a = new C3370a(cartSimilarItemsFragment);
                        this.f115696q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c3370a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CartSimilarItemsFragment cartSimilarItemsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f115689r = cartSimilarItemsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f115689r, continuation);
                aVar.f115688q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f115688q;
                CartSimilarItemsFragment cartSimilarItemsFragment = this.f115689r;
                C43259k.d(t12, null, null, new C3367a(cartSimilarItemsFragment, null), 3);
                C43259k.d(t12, null, null, new b(cartSimilarItemsFragment, null), 3);
                C43259k.d(t12, null, null, new c(cartSimilarItemsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CartSimilarItemsFragment.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115686q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                CartSimilarItemsFragment cartSimilarItemsFragment = CartSimilarItemsFragment.this;
                a aVar = new a(cartSimilarItemsFragment, null);
                this.f115686q = 1;
                if (C23056p0.b(cartSimilarItemsFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC31171n interfaceC31171n) {
            a aVar = CartSimilarItemsFragment.f115666C0;
            CartSimilarItemsFragment.this.q5().accept(new InterfaceC44101a.k(interfaceC31171n));
            return G0.f406611a;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmn/a;", "it", "Lkotlin/G0;", "invoke", "(Lmn/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<InterfaceC44101a, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC44101a interfaceC44101a) {
            a aVar = CartSimilarItemsFragment.f115666C0;
            CartSimilarItemsFragment.this.q5().accept(interfaceC44101a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f115701l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f115701l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f115701l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CartSimilarItemsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f115703l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f115703l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f115703l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115704l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115704l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f115704l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115705l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115705l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f115705l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CartSimilarItemsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cart_similar_items/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<q> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = CartSimilarItemsFragment.this.f115675t0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public CartSimilarItemsFragment() {
        super(0, 1, null);
        k kVar = new k(new p());
        l lVar = new l();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new m(lVar));
        this.f115676u0 = new O0(m0.f406844a.b(q.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f115679x0 = C42727D.b(lazyThreadSafetyMode, new d());
        this.f115668B0 = C42727D.b(lazyThreadSafetyMode, new c());
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        String str2 = this.f115667A0;
        if (str2 == null) {
            str2 = "top";
        }
        if (!str.equals(str2)) {
            return null;
        }
        com.avito.android.cart_similar_items.l lVar = this.f115681z0;
        return (lVar != null ? lVar : null).f115916j;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        com.avito.android.cart_similar_items.l lVar = this.f115681z0;
        o.a aVar = new o.a((lVar == null ? null : lVar).f115917k, ToastBarPosition.f181047e);
        if (lVar == null) {
            lVar = null;
        }
        return new gj.o(aVar, new o.a(lVar.f115913g, ToastBarPosition.f181045c));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f115670o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        getViewLifecycleOwner().getLifecycle().a(new com.avito.android.lib.beduin_v2.repository.domain.cart_items.r(new e()));
        return layoutInflater.inflate(R.layout.cart_similar_items_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        int i12;
        super.onViewCreated(view, bundle);
        ((gj.k) this.f115679x0.getValue()).l(q5().f116143N);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        N n12 = this.f115677v0;
        L l12 = new L(viewLifecycleOwner, n12 != null ? n12 : null, false, 4, null);
        InterfaceC25659b interfaceC25659b = this.f115680y0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(Integer.valueOf(y6.d(16)));
        aVarB.f100611g = q5().f116143N.B0();
        int iOrdinal = ((CartSimilarItemsArguments) this.f115668B0.getValue()).f115924b.ordinal();
        if (iOrdinal == 0) {
            i12 = R.attr.ic_close24;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.ic_arrowBack24;
        }
        int i13 = i12;
        ViewGroup viewGroup = (ViewGroup) view;
        f fVar = new f(1, q5(), q.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        g gVar = new g();
        com.avito.konveyor.adapter.d dVar = this.f115672q0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.cart_similar_items.konveyor.e eVar = this.f115673r0;
        com.avito.android.cart_similar_items.konveyor.e eVar2 = eVar != null ? eVar : null;
        int i14 = this.f115674s0;
        ScreenPerformanceTracker screenPerformanceTracker = this.f115670o0;
        com.avito.android.cart_similar_items.l lVar = new com.avito.android.cart_similar_items.l(viewGroup, i13, fVar, gVar, l12, aVarB, dVar2, eVar2, i14, screenPerformanceTracker != null ? screenPerformanceTracker : null);
        com.avito.android.beduin_shared.model.utils.b.c(q5().f116143N, this, lVar.f115919m);
        this.f115681z0 = lVar;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new h(null), 3);
        N n13 = this.f115677v0;
        if (n13 == null) {
            n13 = null;
        }
        n13.f176464O.observe(getViewLifecycleOwner(), new f.a(new i()));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f115670o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3371a interfaceC3371aA = com.avito.android.cart_similar_items.di.component.c.a();
        ?? r12 = this.f115668B0;
        interfaceC3371aA.a((CartSimilarItemsArguments) r12.getValue(), getResources(), this, new j(), new C28478k(new CartSimilarItemsScreen(((CartSimilarItemsArguments) r12.getValue()).f115925c), com.avito.android.analytics.screens.s.c(this), null, 4, null), (com.avito.android.cart_similar_items.di.component.b) C29972i.a(C29972i.b(this), com.avito.android.cart_similar_items.di.component.b.class), cv.c.b(this), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f115670o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f115670o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final q q5() {
        return (q) this.f115676u0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
