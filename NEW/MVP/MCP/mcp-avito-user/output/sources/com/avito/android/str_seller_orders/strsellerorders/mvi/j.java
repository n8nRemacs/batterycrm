package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import com.avito.android.util.R0;
import dz0.InterfaceC39833a;
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
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import xz0.C50024a;
import xz0.C50025b;

/* compiled from: StrSellerOrdersBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements com.avito.android.arch.mvi.b<StrSellerOrdersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders.strsellerorders.domain.a f290023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_core.c f290024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50025b f290025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f290026d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f290027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f290028f;

    /* compiled from: StrSellerOrdersBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersBootstrap$produce$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<I0<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290029q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f290030r;

        /* compiled from: StrSellerOrdersBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersBootstrap$produce$1$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.j$a$a, reason: collision with other inner class name */
        public static final class C8741a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f290032q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f290033r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f290034s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I0<StrSellerOrdersInternalAction> f290035t;

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.j$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C8742a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I0<StrSellerOrdersInternalAction> f290036b;

                /* JADX WARN: Multi-variable type inference failed */
                public C8742a(I0<? super StrSellerOrdersInternalAction> i02) {
                    this.f290036b = i02;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Object objSend = this.f290036b.send((StrSellerOrdersInternalAction) obj, continuation);
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
                    return new H(2, this.f290036b, I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersBootstrap$produce$1$1$coreLoadingFlow$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {44, 46, 46}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.j$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<StrSellerOrdersInternalAction, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290037q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f290038r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ j f290039s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ I0<StrSellerOrdersInternalAction> f290040t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43076a0<SK0.f> f290041u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(j jVar, I0<? super StrSellerOrdersInternalAction> i02, InterfaceC43076a0<SK0.f> interfaceC43076a0, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f290039s = jVar;
                    this.f290040t = i02;
                    this.f290041u = interfaceC43076a0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    b bVar = new b(this.f290039s, this.f290040t, this.f290041u, continuation);
                    bVar.f290038r = obj;
                    return bVar;
                }

                @Override // Y41.p
                public final Object invoke(StrSellerOrdersInternalAction strSellerOrdersInternalAction, Continuation<? super G0> continuation) {
                    return ((b) create(strSellerOrdersInternalAction, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
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
                        int r1 = r6.f290037q
                        com.avito.android.str_seller_orders.strsellerorders.mvi.j r2 = r6.f290039s
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
                        java.lang.Object r1 = r6.f290038r
                        kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
                        kotlin.C42729a0.b(r7)
                        goto L61
                    L24:
                        kotlin.C42729a0.b(r7)
                        goto L74
                    L28:
                        kotlin.C42729a0.b(r7)
                        java.lang.Object r7 = r6.f290038r
                        com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction r7 = (com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction) r7
                        boolean r1 = r7 instanceof com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction.LoadingComplete
                        if (r1 == 0) goto L79
                        boolean r1 = r2.f290028f
                        if (r1 == 0) goto L3a
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    L3a:
                        com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$LoadingComplete r7 = (com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction.LoadingComplete) r7
                        com.avito.android.remote.model.StrSellerOrdersListResponse r7 = r7.f289867b
                        com.avito.android.deep_linking.links.DeepLink r7 = r7.getOnboardingDeeplink()
                        kotlinx.coroutines.channels.I0<com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction> r1 = r6.f290040t
                        if (r7 == 0) goto L54
                        com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$OpenDeeplink r3 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$OpenDeeplink
                        r3.<init>(r7)
                        r6.f290037q = r5
                        java.lang.Object r7 = r1.send(r3, r6)
                        if (r7 != r0) goto L74
                        return r0
                    L54:
                        r6.f290038r = r1
                        r6.f290037q = r4
                        kotlinx.coroutines.a0<SK0.f> r7 = r6.f290041u
                        java.lang.Object r7 = r7.F(r6)
                        if (r7 != r0) goto L61
                        return r0
                    L61:
                        SK0.f r7 = (SK0.f) r7
                        com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$UxInfoLoadingComplete r4 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$UxInfoLoadingComplete
                        r4.<init>(r7)
                        r7 = 0
                        r6.f290038r = r7
                        r6.f290037q = r3
                        java.lang.Object r7 = r1.send(r4, r6)
                        if (r7 != r0) goto L74
                        return r0
                    L74:
                        r2.f290028f = r5
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    L79:
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.strsellerorders.mvi.j.a.C8741a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: StrSellerOrdersBootstrap.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LSK0/f;", "<anonymous>", "(Lkotlinx/coroutines/T;)LSK0/f;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersBootstrap$produce$1$1$uxProperties$1", f = "StrSellerOrdersBootstrap.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.j$a$a$c */
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super SK0.f>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290042q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ j f290043r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(j jVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f290043r = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f290043r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super SK0.f> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290042q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        com.avito.android.str_core.c cVar = this.f290043r.f290024b;
                        this.f290042q = 1;
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
            public C8741a(j jVar, I0<? super StrSellerOrdersInternalAction> i02, Continuation<? super C8741a> continuation) {
                super(2, continuation);
                this.f290034s = jVar;
                this.f290035t = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C8741a c8741a = new C8741a(this.f290034s, this.f290035t, continuation);
                c8741a.f290033r = obj;
                return c8741a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8741a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f290032q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f290033r;
                    j jVar = this.f290034s;
                    InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, jVar.f290026d.a(), new c(jVar, null), 2);
                    C50025b c50025b = jVar.f290025c;
                    c50025b.getClass();
                    PageForBanner pageForBanner = PageForBanner.f303306b;
                    C50024a c50024a = new C50024a(c50025b.f442819a.b());
                    InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iB = jVar.f290023a.b(true, StrOrdersListBody.INSTANCE.getEMPTY());
                    I0<StrSellerOrdersInternalAction> i02 = this.f290035t;
                    kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c50024a, new C43197r1(new b(jVar, i02, interfaceC43076a0B, null), interfaceC43160iB));
                    C8742a c8742a = new C8742a(i02);
                    this.f290032q = 1;
                    if (mVarN.collect(c8742a, this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f290030r = obj;
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
            int i12 = this.f290029q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f290030r;
                j jVar = j.this;
                if (!jVar.f290027e) {
                    C8741a c8741a = new C8741a(jVar, i02, null);
                    this.f290029q = 1;
                    if (U.c(c8741a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public j(@Y61.k com.avito.android.str_seller_orders.strsellerorders.domain.a aVar, @Y61.k com.avito.android.str_core.c cVar, @Y61.k C50025b c50025b, @Y61.k R0 r02, @InterfaceC39833a boolean z12) {
        this.f290023a = aVar;
        this.f290024b = cVar;
        this.f290025c = c50025b;
        this.f290026d = r02;
        this.f290027e = z12;
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
