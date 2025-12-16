package com.avito.android.str_seller_orders.orders_seller;

import Cd.C13243a;
import Y41.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersFragment;
import com.avito.android.str_seller_orders.orders_seller.e;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.a;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.b;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import fv.C40482a;
import i.b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import tz0.InterfaceC48745a;
import tz0.InterfaceC48746b;
import z1.AbstractC50339a;

/* compiled from: StrSellerOrdersFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/StrSellerOrdersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerOrdersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.orders_seller.i f289216n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f289217o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f289218p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f289219q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public e.a f289220r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f289221s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f289222t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.str_seller_orders.orders_seller.e f289223u0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f289215w0 = {m0.f406844a.e(new Y(StrSellerOrdersFragment.class, "openParams", "getOpenParams()Lcom/avito/android/str_seller_orders/orders_seller/StrSellerOrdersOpenParams;", 0))};

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f289214v0 = new a(null);

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/StrSellerOrdersFragment$a;", "", "<init>", "()V", "", "DEEPLINK_REQUEST_KEY", "Ljava/lang/String;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f289224b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f289225b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$onCreateView$$inlined$filter$1$2", f = "StrSellerOrdersFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8708a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f289226q;

                /* renamed from: r, reason: collision with root package name */
                public int f289227r;

                public C8708a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f289226q = obj;
                    this.f289227r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f289225b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.b.a.C8708a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$b$a$a r0 = (com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.b.a.C8708a) r0
                    int r1 = r0.f289227r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f289227r = r1
                    goto L18
                L13:
                    com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$b$a$a r0 = new com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f289226q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f289227r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.f413260a
                    java.lang.String r2 = "str_seller_orders_request_key"
                    java.lang.String r6 = r6.f134521b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f289227r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f289225b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f289224b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f289224b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC48746b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC48746b interfaceC48746b) {
            InterfaceC48746b interfaceC48746b2 = interfaceC48746b;
            StrSellerOrdersFragment strSellerOrdersFragment = (StrSellerOrdersFragment) this.receiver;
            a aVar = StrSellerOrdersFragment.f289214v0;
            strSellerOrdersFragment.getClass();
            if (interfaceC48746b2 instanceof InterfaceC48746b.a) {
                strSellerOrdersFragment.requireActivity().finish();
            } else if (interfaceC48746b2 instanceof InterfaceC48746b.C12698b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strSellerOrdersFragment.f289219q0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC48746b.C12698b) interfaceC48746b2).f439713a, "str_seller_orders_request_key", null, 4);
            } else if (interfaceC48746b2 instanceof InterfaceC48746b.c) {
                StrOrdersFiltersFragment.f289101n0.getClass();
                StrOrdersFiltersFragment strOrdersFiltersFragment = new StrOrdersFiltersFragment();
                strOrdersFiltersFragment.f289107l0.setValue(strOrdersFiltersFragment, StrOrdersFiltersFragment.f289102o0[0], ((InterfaceC48746b.c) interfaceC48746b2).f439714a);
                strOrdersFiltersFragment.show(strSellerOrdersFragment.getChildFragmentManager(), "str_orders_filters_request_key");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<StrSellerOrdersState, G0> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(StrSellerOrdersState strSellerOrdersState) {
            StrSellerOrdersState strSellerOrdersState2 = strSellerOrdersState;
            StrSellerOrdersFragment strSellerOrdersFragment = StrSellerOrdersFragment.this;
            com.avito.android.str_seller_orders.orders_seller.e eVar = strSellerOrdersFragment.f289223u0;
            if (eVar != null) {
                eVar.f289370h.setRefreshing(false);
                com.avito.android.str_seller_orders.orders_seller.mvi.entity.b bVar = strSellerOrdersState2.f289583i;
                com.avito.android.str_seller_orders.orders_seller.mvi.entity.a f289597a = bVar.getF289597a();
                boolean z12 = f289597a instanceof a.C8725a;
                Toolbar toolbar = eVar.f289366d;
                if (z12) {
                    D6.w(toolbar);
                } else {
                    boolean z13 = f289597a instanceof a.b;
                    ShimmerFrameLayout shimmerFrameLayout = eVar.f289368f;
                    TextView textView = eVar.f289367e;
                    if (z13) {
                        D6.H(toolbar);
                        D6.H(shimmerFrameLayout);
                        D6.w(textView);
                    } else if (f289597a instanceof a.c) {
                        D6.H(toolbar);
                        D6.w(shimmerFrameLayout);
                        com.avito.android.printable_text.a.c(textView, ((a.c) f289597a).f289596a);
                        D6.H(textView);
                    }
                }
                boolean z14 = bVar instanceof b.a;
                View view = eVar.f289371i;
                RecyclerView recyclerView = eVar.f289369g;
                if (z14) {
                    D6.H(recyclerView);
                    D6.w(view);
                    com.avito.konveyor.adapter.d dVar = strSellerOrdersFragment.f289221s0;
                    B b12 = dVar;
                    if (dVar == null) {
                        b12 = 0;
                    }
                    b12.l(((b.a) bVar).f289599c, null);
                } else if (bVar instanceof b.C8726b) {
                    D6.w(recyclerView);
                    D6.H(eVar.f289375m);
                    D6.H(view);
                    b.C8726b c8726b = (b.C8726b) bVar;
                    eVar.f289372j.setImageDrawable(C35835l0.h(c8726b.f289601c, strSellerOrdersFragment.requireContext()));
                    eVar.f289373k.setText(c8726b.f289602d);
                    eVar.f289374l.setText(c8726b.f289603e);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$onCreateView$4", f = "StrSellerOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {
        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrSellerOrdersFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = StrSellerOrdersFragment.f289214v0;
            StrSellerOrdersFragment.this.q5().accept(InterfaceC48745a.d.f439702a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment$onCreateView$5", f = "StrSellerOrdersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f289231q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = StrSellerOrdersFragment.this.new f(continuation);
            fVar.f289231q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((f) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43501a c43501a = (C43501a) this.f289231q;
            a aVar = StrSellerOrdersFragment.f289214v0;
            StrSellerOrdersFragment.this.q5().accept(new InterfaceC48745a.g(c43501a));
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltz0/a;", "it", "Lkotlin/G0;", "invoke", "(Ltz0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC48745a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC48745a interfaceC48745a) {
            a aVar = StrSellerOrdersFragment.f289214v0;
            StrSellerOrdersFragment.this.q5().accept(interfaceC48745a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f289234l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f289234l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f289234l);
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
            return StrSellerOrdersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f289236l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f289236l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f289236l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289237l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289237l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f289237l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f289238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f289238l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f289238l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerOrdersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders/orders_seller/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.str_seller_orders.orders_seller.h> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders.orders_seller.h invoke() {
            com.avito.android.str_seller_orders.orders_seller.i iVar = StrSellerOrdersFragment.this.f289216n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.str_seller_orders.orders_seller.h) iVar.get();
        }
    }

    public StrSellerOrdersFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f289217o0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders.orders_seller.h.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        registerForActivityResult(new b.m(), new com.avito.android.str_seller_orders.orders_seller.a(this, 0));
        this.f289222t0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f289218p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f289218p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, q5(), new c(1, this, StrSellerOrdersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersOneTimeEvent;)V", 0), new d());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f289219q0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new f(null), new C43197r1(new e(null), new b(C40482a.b(aVar)))), C22984Q.a(getViewLifecycleOwner()));
        return layoutInflater.inflate(R.layout.str_orders_seller_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.str_seller_orders.orders_seller.e eVar = this.f289223u0;
        if (eVar != null) {
            eVar.f289369g.setAdapter(null);
        }
        this.f289223u0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289218p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        getChildFragmentManager().p0("str_orders_filters_request_key", this, new com.avito.android.offlinization.ui.a(this, 29));
        e.a aVar = this.f289220r0;
        if (aVar == null) {
            aVar = null;
        }
        final com.avito.android.str_seller_orders.orders_seller.e eVarA = aVar.a(view);
        this.f289223u0 = eVarA;
        RecyclerView recyclerView = eVarA.f289369g;
        recyclerView.setAdapter(eVarA.f289364b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setItemAnimator(null);
        recyclerView.s();
        recyclerView.o(eVarA.f289365c);
        final int i12 = 0;
        eVarA.f289366d.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.str_seller_orders.orders_seller.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        eVarA.f289363a.invoke(InterfaceC48745a.C12697a.f439699a);
                        break;
                    default:
                        eVarA.f289363a.invoke(InterfaceC48745a.j.f439708a);
                        break;
                }
            }
        });
        final int i13 = 1;
        eVarA.f289375m.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.str_seller_orders.orders_seller.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        eVarA.f289363a.invoke(InterfaceC48745a.C12697a.f439699a);
                        break;
                    default:
                        eVarA.f289363a.invoke(InterfaceC48745a.j.f439708a);
                        break;
                }
            }
        });
        eVarA.f289370h.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(eVarA, 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders.orders_seller.di.a.a().a((cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), s.c(this), (StrSellerOrdersOpenParams) this.f289222t0.getValue(this, f289215w0[0]), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f289218p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders.orders_seller.h q5() {
        return (com.avito.android.str_seller_orders.orders_seller.h) this.f289217o0.getValue();
    }
}
