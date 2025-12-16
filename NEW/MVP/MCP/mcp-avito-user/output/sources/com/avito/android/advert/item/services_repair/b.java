package com.avito.android.advert.item.services_repair;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.B2;
import com.avito.android.advert.item.InterfaceC28137i1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: ServicesRealtyDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/services_repair/b;", "Lcom/avito/android/advert/item/services_repair/a;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.services_repair.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f79966a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.similars.a f79967b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f79968c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f79969d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public N0 f79970e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC28137i1 f79971f;

    /* compiled from: ServicesRealtyDelegate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/advert/item/services_repair/b$a;", "", "<init>", "()V", "", "SCROLL_DELAY", "J", "", "SCROLL_OFFSET", "I", "", "SERVICES_REALTY_COMPLEMENTARY_ENGINE", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServicesRealtyDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.services_repair.ServicesRealtyDelegateImpl$observeDeeplinkHandlingResult$1", f = "ServicesRealtyDelegate.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.services_repair.b$b, reason: collision with other inner class name */
    public static final class C2360b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f79972q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ z<C43501a> f79973r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f79974s;

        /* compiled from: ServicesRealtyDelegate.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkv/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.services_repair.ServicesRealtyDelegateImpl$observeDeeplinkHandlingResult$1$2", f = "ServicesRealtyDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.item.services_repair.b$b$a */
        public static final class a extends SuspendLambda implements q<InterfaceC43172j<? super C43501a>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Throwable f79975q;

            public a() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super C43501a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                a aVar = new a(3, continuation);
                aVar.f79975q = th2;
                return aVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                V2.f318762a.f(this.f79975q);
                return G0.f406611a;
            }
        }

        /* compiled from: ServicesRealtyDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.item.services_repair.b$b$b, reason: collision with other inner class name */
        public static final class C2361b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f79976b;

            /* compiled from: ServicesRealtyDelegate.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert.item.services_repair.ServicesRealtyDelegateImpl$observeDeeplinkHandlingResult$1$3", f = "ServicesRealtyDelegate.kt", i = {0}, l = {51}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: com.avito.android.advert.item.services_repair.b$b$b$a */
            public static final class a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f79977q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f79978r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C2361b<T> f79979s;

                /* renamed from: t, reason: collision with root package name */
                public int f79980t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(C2361b<? super T> c2361b, Continuation<? super a> continuation) {
                    super(continuation);
                    this.f79979s = c2361b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f79978r = obj;
                    this.f79980t |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f79979s.emit(null, this);
                }
            }

            public C2361b(b bVar) {
                this.f79976b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k kv.C43501a r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r5 = r6 instanceof com.avito.android.advert.item.services_repair.b.C2360b.C2361b.a
                    if (r5 == 0) goto L13
                    r5 = r6
                    com.avito.android.advert.item.services_repair.b$b$b$a r5 = (com.avito.android.advert.item.services_repair.b.C2360b.C2361b.a) r5
                    int r0 = r5.f79980t
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r5.f79980t = r0
                    goto L18
                L13:
                    com.avito.android.advert.item.services_repair.b$b$b$a r5 = new com.avito.android.advert.item.services_repair.b$b$b$a
                    r5.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r5.f79978r
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f79980t
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r5 = r5.f79977q
                    com.avito.android.advert.item.services_repair.b$b$b r5 = (com.avito.android.advert.item.services_repair.b.C2360b.C2361b) r5
                    kotlin.C42729a0.b(r6)
                    goto L53
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.advert.item.services_repair.b r6 = r4.f79976b
                    com.avito.android.advert.item.i1 r6 = r6.f79971f
                    if (r6 == 0) goto L45
                    r1 = 12
                    java.lang.String r3 = "complementary_repair_services_in_realty"
                    com.avito.android.advert.item.d2.a.a(r6, r3, r1)
                L45:
                    r5.f79977q = r4
                    r5.f79980t = r2
                    r1 = 1500(0x5dc, double:7.41E-321)
                    java.lang.Object r5 = kotlinx.coroutines.C43131e0.b(r1, r5)
                    if (r5 != r0) goto L52
                    return r0
                L52:
                    r5 = r4
                L53:
                    com.avito.android.advert.item.services_repair.b r5 = r5.f79976b
                    com.avito.android.advert.item.similars.a r5 = r5.f79967b
                    r5.g()
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.services_repair.b.C2360b.C2361b.emit(kv.a, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.services_repair.b$b$c */
        public static final class c implements InterfaceC43160i<C43501a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f79981b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.advert.item.services_repair.b$b$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f79982b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.advert.item.services_repair.ServicesRealtyDelegateImpl$observeDeeplinkHandlingResult$1$invokeSuspend$$inlined$filter$1$2", f = "ServicesRealtyDelegate.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.advert.item.services_repair.b$b$c$a$a, reason: collision with other inner class name */
                public static final class C2362a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f79983q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f79984r;

                    public C2362a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.f79983q = obj;
                        this.f79984r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f79982b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.advert.item.services_repair.b.C2360b.c.a.C2362a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.advert.item.services_repair.b$b$c$a$a r0 = (com.avito.android.advert.item.services_repair.b.C2360b.c.a.C2362a) r0
                        int r1 = r0.f79984r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f79984r = r1
                        goto L18
                    L13:
                        com.avito.android.advert.item.services_repair.b$b$c$a$a r0 = new com.avito.android.advert.item.services_repair.b$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f79983q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f79984r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        kv.a r6 = (kv.C43501a) r6
                        Ju.c r6 = r6.f413261b
                        com.avito.android.services_realty_sheet.link.h$b r2 = com.avito.android.services_realty_sheet.link.h.b.f280442b
                        boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                        if (r6 == 0) goto L4c
                        r0.f79984r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f79982b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.services_repair.b.C2360b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC43160i interfaceC43160i) {
                this.f79981b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public final Object collect(@k InterfaceC43172j<? super C43501a> interfaceC43172j, @k Continuation continuation) {
                Object objCollect = ((AbstractC43168f) this.f79981b).collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2360b(z<C43501a> zVar, b bVar, Continuation<? super C2360b> continuation) {
            super(2, continuation);
            this.f79973r = zVar;
            this.f79974s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C2360b(this.f79973r, this.f79974s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C2360b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f79972q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C43152f0 c43152f0 = new C43152f0(new c(y.a(this.f79973r)), new a(3, null));
                b bVar = this.f79974s;
                InterfaceC43160i interfaceC43160iI = C43175k.I(bVar.f79966a.a(), c43152f0);
                C2361b c2361b = new C2361b(bVar);
                this.f79972q = 1;
                if (interfaceC43160iI.collect(c2361b, this) == coroutine_suspended) {
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

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AbstractCoroutineContextElement implements N {
        @Override // kotlinx.coroutines.N
        public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            V2.f318762a.f(th2);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k R0 r02, @k com.avito.android.advert.item.similars.a aVar, @k B2 b22) {
        this.f79966a = r02;
        this.f79967b = aVar;
        this.f79968c = b22;
        this.f79969d = U.a(r02.b().plus(new c(N.f410714t2)));
    }

    @Override // com.avito.android.advert.item.services_repair.a
    public final void a() {
        N0 n02 = this.f79970e;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f79971f = null;
    }

    @Override // com.avito.android.advert.item.services_repair.a
    public final void b(@l InterfaceC28137i1 interfaceC28137i1) {
        this.f79971f = interfaceC28137i1;
    }

    @Override // com.avito.android.advert.item.services_repair.a
    public final void w(@k z<C43501a> zVar) {
        B2 b22 = this.f79968c;
        b22.getClass();
        n<Object> nVar = B2.f67184X[29];
        if (((Boolean) b22.f67189E.a().invoke()).booleanValue()) {
            N0 n02 = this.f79970e;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            this.f79970e = C43259k.d(this.f79969d, null, null, new C2360b(zVar, this, null), 3);
        }
    }
}
