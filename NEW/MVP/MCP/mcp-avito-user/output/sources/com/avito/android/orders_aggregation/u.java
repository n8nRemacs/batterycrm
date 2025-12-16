package com.avito.android.orders_aggregation;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error.z;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import com.avito.android.orders_aggregation.x;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e50.C39952a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrdersAggregationViewModelImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$loadScreen$1", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210340q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f210341r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f210342s;

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$loadScreen$1$1", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {124, 124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<OrdersAggregationResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210343q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210344r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ t f210345s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f210345s = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f210345s, continuation);
            aVar.f210344r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<OrdersAggregationResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210343q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f210344r;
                f fVar = this.f210345s.f210319E;
                this.f210344r = interfaceC43172j;
                this.f210343q = 1;
                obj = fVar.a(this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f210344r;
                C42729a0.b(obj);
            }
            this.f210344r = null;
            this.f210343q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders_aggregation/x;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$loadScreen$1$3", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super x>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210346q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210347r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f210347r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super x> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210346q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f210347r;
                x.c cVar = x.c.f210371a;
                this.f210346q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders_aggregation/x;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$loadScreen$1$4", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super x>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210348q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f210349r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f210350s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ t f210351t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f210352u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, String str, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f210351t = tVar;
            this.f210352u = str;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super x> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(this.f210351t, this.f210352u, continuation);
            cVar.f210349r = interfaceC43172j;
            cVar.f210350s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f210349r;
                Throwable th2 = this.f210350s;
                t tVar = this.f210351t;
                ScreenPerformanceTracker.a.d(tVar.f210324N, null, null, new J.a(th2), null, 11);
                tVar.f210322L.c(new C39952a());
                x.a aVar = new x.a(z.l(th2), this.f210352u);
                this.f210349r = null;
                this.f210348q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: OrdersAggregationViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/x;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/orders_aggregation/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f210353b;

        public d(t tVar) {
            this.f210353b = tVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f210353b.f210327Q.setValue((x) obj);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC43160i<x> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f210354b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f210355c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f210356d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f210357b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f210358c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f210359d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationViewModelImpl$loadScreen$1$invokeSuspend$$inlined$map$1$2", f = "OrdersAggregationViewModelImpl.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.orders_aggregation.u$e$a$a, reason: collision with other inner class name */
            public static final class C6282a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210360q;

                /* renamed from: r, reason: collision with root package name */
                public int f210361r;

                public C6282a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210360q = obj;
                    this.f210361r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, t tVar, String str) {
                this.f210357b = interfaceC43172j;
                this.f210358c = tVar;
                this.f210359d = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, @Y61.k kotlin.coroutines.Continuation r25) {
                /*
                    Method dump skipped, instructions count: 504
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orders_aggregation.u.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC43160i interfaceC43160i, t tVar, String str) {
            this.f210354b = interfaceC43160i;
            this.f210355c = tVar;
            this.f210356d = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super x> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f210354b.collect(new a(interfaceC43172j, this.f210355c, this.f210356d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, String str, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f210341r = tVar;
        this.f210342s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f210341r, this.f210342s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210340q;
        if (i12 == 0) {
            C42729a0.b(obj);
            t tVar = this.f210341r;
            InterfaceC43160i interfaceC43160iI = C43175k.I(tVar.f210320J.a(), C43175k.G(new a(tVar, null)));
            String str = this.f210342s;
            C43152f0 c43152f0 = new C43152f0(new C43137a0(new b(2, null), new e(interfaceC43160iI, tVar, str)), new c(tVar, str, null));
            d dVar = new d(tVar);
            this.f210340q = 1;
            if (c43152f0.collect(dVar, this) == coroutine_suspended) {
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
