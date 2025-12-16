package com.avito.android.profile.user_profile.cards.active_orders;

import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile.user_profile.cards.active_orders.q;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.Q;
import kotlinx.coroutines.rx3.y;

/* compiled from: ActiveOrdersDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/s;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/profile/user_profile/cards/active_orders/j;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s extends M0 implements j {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f224678E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.activeOrders.a f224679J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final c f224680K;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f224681b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.user_profile.cards.active_orders.s$a$a, reason: collision with other inner class name */
        public static final class C6793a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f224682b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$special$$inlined$filterIsInstance$1$2", f = "ActiveOrdersDelegate.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.user_profile.cards.active_orders.s$a$a$a, reason: collision with other inner class name */
            public static final class C6794a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f224683q;

                /* renamed from: r, reason: collision with root package name */
                public int f224684r;

                public C6794a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f224683q = obj;
                    this.f224684r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6793a.this.emit(null, this);
                }
            }

            public C6793a(InterfaceC43172j interfaceC43172j) {
                this.f224682b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile.user_profile.cards.active_orders.s.a.C6793a.C6794a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.user_profile.cards.active_orders.s$a$a$a r0 = (com.avito.android.profile.user_profile.cards.active_orders.s.a.C6793a.C6794a) r0
                    int r1 = r0.f224684r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f224684r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.cards.active_orders.s$a$a$a r0 = new com.avito.android.profile.user_profile.cards.active_orders.s$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f224683q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f224684r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    boolean r6 = r5 instanceof com.avito.android.profile.user_profile.cards.active_orders.q.b
                    if (r6 == 0) goto L43
                    r0.f224684r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f224682b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.active_orders.s.a.C6793a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f224681b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f224681b.collect(new C6793a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$special$$inlined$flatMapLatest$1", f = "ActiveOrdersDelegate.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super q>, Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f224686q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f224687r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f224688s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.activeOrders.e f224689t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.profile.user_profile.cards.active_orders.features.b f224690u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ E f224691v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, com.avito.android.activeOrders.e eVar, com.avito.android.profile.user_profile.cards.active_orders.features.b bVar, E e12) {
            super(3, continuation);
            this.f224689t = eVar;
            this.f224690u = bVar;
            this.f224691v = e12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
            b bVar = new b(continuation, this.f224689t, this.f224690u, this.f224691v);
            bVar.f224687r = interfaceC43172j;
            bVar.f224688s = bool;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i interfaceC43160iW;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f224686q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f224687r;
                if (((Boolean) this.f224688s).booleanValue()) {
                    com.avito.android.profile.user_profile.cards.active_orders.features.b bVar = this.f224690u;
                    bVar.getClass();
                    kotlin.reflect.n<Object> nVar = com.avito.android.profile.user_profile.cards.active_orders.features.b.f224657d[1];
                    interfaceC43160iW = C43175k.N(new d(this.f224689t.a((Boolean) bVar.f224659c.a().invoke())), C43175k.G(new e(y.a(this.f224691v.g()), null)));
                } else {
                    interfaceC43160iW = C43175k.w();
                }
                this.f224686q = 1;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<OrdersNeedActionResponse> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f224692b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f224693b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$special$$inlined$map$1$2", f = "ActiveOrdersDelegate.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.user_profile.cards.active_orders.s$c$a$a, reason: collision with other inner class name */
            public static final class C6795a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f224694q;

                /* renamed from: r, reason: collision with root package name */
                public int f224695r;

                public C6795a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f224694q = obj;
                    this.f224695r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f224693b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile.user_profile.cards.active_orders.s.c.a.C6795a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.user_profile.cards.active_orders.s$c$a$a r0 = (com.avito.android.profile.user_profile.cards.active_orders.s.c.a.C6795a) r0
                    int r1 = r0.f224695r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f224695r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.cards.active_orders.s$c$a$a r0 = new com.avito.android.profile.user_profile.cards.active_orders.s$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f224694q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f224695r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.profile.user_profile.cards.active_orders.q$b r5 = (com.avito.android.profile.user_profile.cards.active_orders.q.b) r5
                    com.avito.android.activeOrders.OrdersNeedActionResponse r5 = r5.f224675a
                    r0.f224695r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f224693b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.active_orders.s.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(a aVar) {
            this.f224692b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super OrdersNeedActionResponse> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f224692b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<q.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f224697b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f224698b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$updatedOrders$lambda$2$$inlined$map$1$2", f = "ActiveOrdersDelegate.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.user_profile.cards.active_orders.s$d$a$a, reason: collision with other inner class name */
            public static final class C6796a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f224699q;

                /* renamed from: r, reason: collision with root package name */
                public int f224700r;

                public C6796a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f224699q = obj;
                    this.f224700r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f224698b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile.user_profile.cards.active_orders.s.d.a.C6796a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.user_profile.cards.active_orders.s$d$a$a r0 = (com.avito.android.profile.user_profile.cards.active_orders.s.d.a.C6796a) r0
                    int r1 = r0.f224700r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f224700r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.cards.active_orders.s$d$a$a r0 = new com.avito.android.profile.user_profile.cards.active_orders.s$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f224699q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f224700r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.activeOrders.OrdersNeedActionResponse r5 = (com.avito.android.activeOrders.OrdersNeedActionResponse) r5
                    com.avito.android.profile.user_profile.cards.active_orders.q$b r6 = new com.avito.android.profile.user_profile.cards.active_orders.q$b
                    r6.<init>(r5)
                    r0.f224700r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f224698b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.active_orders.s.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i) {
            this.f224697b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super q.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f224697b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$updatedOrders$lambda$2$$inlined$transform$1", f = "ActiveOrdersDelegate.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f224702q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f224703r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f224704s;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<q> f224705b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.active_orders.ActiveOrdersViewModel$updatedOrders$lambda$2$$inlined$transform$1$1", f = "ActiveOrdersDelegate.kt", i = {}, l = {220}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.user_profile.cards.active_orders.s$e$a$a, reason: collision with other inner class name */
            public static final class C6797a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f224706q;

                /* renamed from: r, reason: collision with root package name */
                public int f224707r;

                public C6797a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f224706q = obj;
                    this.f224707r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f224705b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.profile.user_profile.cards.active_orders.s.e.a.C6797a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.user_profile.cards.active_orders.s$e$a$a r0 = (com.avito.android.profile.user_profile.cards.active_orders.s.e.a.C6797a) r0
                    int r1 = r0.f224707r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f224707r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.cards.active_orders.s$e$a$a r0 = new com.avito.android.profile.user_profile.cards.active_orders.s$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f224706q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f224707r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L49
                    com.avito.android.profile.user_profile.cards.active_orders.q$a r5 = com.avito.android.profile.user_profile.cards.active_orders.q.a.f224674a
                    r0.f224707r = r3
                    kotlinx.coroutines.flow.j<com.avito.android.profile.user_profile.cards.active_orders.q> r6 = r4.f224705b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.active_orders.s.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC43160i interfaceC43160i, Continuation continuation) {
            super(2, continuation);
            this.f224704s = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f224704s, continuation);
            eVar.f224703r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super q> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f224702q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f224703r);
                this.f224702q = 1;
                if (((AbstractC43168f) this.f224704s).collect(aVar, this) == coroutine_suspended) {
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
    public s(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.activeOrders.a aVar, @Y61.k com.avito.android.activeOrders.e eVar, @Y61.k E e12, @Y61.k com.avito.android.profile.user_profile.cards.active_orders.features.b bVar) {
        this.f224678E = interfaceC35745a5;
        this.f224679J = aVar;
        kotlin.reflect.n<Object> nVar = com.avito.android.profile.user_profile.cards.active_orders.features.b.f224657d[0];
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(new C43210w(bVar.f224658b.a().invoke()), new b(null, eVar, bVar, e12));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        this.f224680K = new c(new a(C43175k.S(lVarY, aVarA, i2.a.f411433c, 1)));
    }

    @Override // com.avito.android.profile.user_profile.cards.active_orders.j
    @Y61.k
    /* renamed from: W6, reason: from getter */
    public final c getF224680K() {
        return this.f224680K;
    }

    @Override // com.avito.android.profile.user_profile.cards.active_orders.j
    @Y61.k
    public final W X9() {
        return Q.a(EmptyCoroutineContext.INSTANCE, new r(this, null)).z(this.f224678E.a());
    }
}
