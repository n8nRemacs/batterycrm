package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersOpenParams;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import com.avito.android.util.R0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: StrSellerOrdersBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<StrSellerOrdersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final StrSellerOrdersOpenParams f289604a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.s f289605b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.orders_seller.domain.b f289606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_core.c f289607d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f289608e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f289609f = new AtomicBoolean(false);

    /* compiled from: StrSellerOrdersBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersBootstrap$produce$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<I0<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289610q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289611r;

        /* compiled from: StrSellerOrdersBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersBootstrap$produce$1$1", f = "StrSellerOrdersBootstrap.kt", i = {0}, l = {31, 62}, m = "invokeSuspend", n = {"$this$supervisorScope"}, s = {"L$0"})
        /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C8727a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f289613q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f289614r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ I0<StrSellerOrdersInternalAction> f289615s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ f f289616t;

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.f$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C8728a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I0<StrSellerOrdersInternalAction> f289617b;

                /* JADX WARN: Multi-variable type inference failed */
                public C8728a(I0<? super StrSellerOrdersInternalAction> i02) {
                    this.f289617b = i02;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Object objSend = this.f289617b.send((StrSellerOrdersInternalAction) obj, continuation);
                    return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
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
                    return new H(2, this.f289617b, I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersBootstrap$produce$1$1$coreLoadingFlow$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {52, 54, 54}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.f$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<StrSellerOrdersInternalAction, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f289618q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f289619r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ f f289620s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ I0<StrSellerOrdersInternalAction> f289621t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43076a0<SK0.f> f289622u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(f fVar, I0<? super StrSellerOrdersInternalAction> i02, InterfaceC43076a0<SK0.f> interfaceC43076a0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f289620s = fVar;
                    this.f289621t = i02;
                    this.f289622u = interfaceC43076a0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    b bVar = new b(this.f289620s, this.f289621t, this.f289622u, continuation);
                    bVar.f289619r = obj;
                    return bVar;
                }

                @Override // Y41.p
                public final Object invoke(StrSellerOrdersInternalAction strSellerOrdersInternalAction, Continuation<? super G0> continuation) {
                    return ((b) create(strSellerOrdersInternalAction, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.f289618q
                        com.avito.android.str_seller_orders.orders_seller.mvi.f r2 = r6.f289620s
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L28
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L14
                        goto L24
                    L14:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1c:
                        java.lang.Object r1 = r6.f289619r
                        kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
                        kotlin.C42729a0.b(r7)
                        goto L63
                    L24:
                        kotlin.C42729a0.b(r7)
                        goto L76
                    L28:
                        kotlin.C42729a0.b(r7)
                        java.lang.Object r7 = r6.f289619r
                        com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction r7 = (com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction) r7
                        boolean r1 = r7 instanceof com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction.ContentLoaded
                        if (r1 == 0) goto L7b
                        java.util.concurrent.atomic.AtomicBoolean r1 = r2.f289609f
                        boolean r1 = r1.get()
                        if (r1 == 0) goto L3e
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    L3e:
                        com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction$ContentLoaded r7 = (com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction.ContentLoaded) r7
                        sz0.f r7 = r7.f289565b
                        com.avito.android.deep_linking.links.DeepLink r7 = r7.f438999d
                        kotlinx.coroutines.channels.I0<com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction> r1 = r6.f289621t
                        if (r7 == 0) goto L56
                        com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction$OpenDeeplink r3 = new com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction$OpenDeeplink
                        r3.<init>(r7)
                        r6.f289618q = r5
                        java.lang.Object r7 = r1.send(r3, r6)
                        if (r7 != r0) goto L76
                        return r0
                    L56:
                        r6.f289619r = r1
                        r6.f289618q = r4
                        kotlinx.coroutines.a0<SK0.f> r7 = r6.f289622u
                        java.lang.Object r7 = r7.F(r6)
                        if (r7 != r0) goto L63
                        return r0
                    L63:
                        SK0.f r7 = (SK0.f) r7
                        com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction$UxInfoLoadingComplete r4 = new com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction$UxInfoLoadingComplete
                        r4.<init>(r7)
                        r7 = 0
                        r6.f289619r = r7
                        r6.f289618q = r3
                        java.lang.Object r7 = r1.send(r4, r6)
                        if (r7 != r0) goto L76
                        return r0
                    L76:
                        java.util.concurrent.atomic.AtomicBoolean r7 = r2.f289609f
                        r7.set(r5)
                    L7b:
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.orders_seller.mvi.f.a.C8727a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LSK0/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)LSK0/f;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersBootstrap$produce$1$1$uxProperties$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.f$a$a$c */
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super SK0.f>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f289623q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ f f289624r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(f fVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f289624r = fVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f289624r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super SK0.f> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f289623q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.str_core.c cVar = this.f289624r.f289607d;
                        this.f289623q = 1;
                        obj = cVar.a(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8727a(I0<? super StrSellerOrdersInternalAction> i02, f fVar, Continuation<? super C8727a> continuation) {
                super(2, continuation);
                this.f289615s = i02;
                this.f289616t = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8727a c8727a = new C8727a(this.f289615s, this.f289616t, continuation);
                c8727a.f289614r = obj;
                return c8727a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8727a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                T t12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f289613q;
                I0<StrSellerOrdersInternalAction> i02 = this.f289615s;
                f fVar = this.f289616t;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t12 = (T) this.f289614r;
                    StrSellerOrdersInternalAction.Init init = new StrSellerOrdersInternalAction.Init(!r7.f289240b, fVar.f289604a.f289241c);
                    this.f289614r = t12;
                    this.f289613q = 1;
                    if (i02.send(init, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    t12 = (T) this.f289614r;
                    C42729a0.b(obj);
                }
                InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, fVar.f289608e.a(), new c(fVar, null), 2);
                com.avito.android.str_seller_orders.orders_seller.domain.b bVar = fVar.f289606c;
                bVar.getClass();
                PageForBanner pageForBanner = PageForBanner.f303306b;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(new com.avito.android.str_seller_orders.orders_seller.domain.a(bVar.f289330a.b()), new C43197r1(new b(fVar, i02, interfaceC43076a0B, null), fVar.f289605b.a(null, fVar.f289604a.f289241c, false)));
                C8728a c8728a = new C8728a(i02);
                this.f289614r = null;
                this.f289613q = 2;
                if (mVarN.collect(c8728a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f289611r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super StrSellerOrdersInternalAction> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f289610q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C8727a c8727a = new C8727a((I0) this.f289611r, f.this, null);
                this.f289610q = 1;
                if (t1.c(c8727a, this) == coroutine_suspended) {
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

    @Inject
    public f(@Y61.k StrSellerOrdersOpenParams strSellerOrdersOpenParams, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.s sVar, @Y61.k com.avito.android.str_seller_orders.orders_seller.domain.b bVar, @Y61.k com.avito.android.str_core.c cVar, @Y61.k R0 r02) {
        this.f289604a = strSellerOrdersOpenParams;
        this.f289605b = sVar;
        this.f289606c = bVar;
        this.f289607d = cVar;
        this.f289608e = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSellerOrdersInternalAction> a() {
        return C43175k.h(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
