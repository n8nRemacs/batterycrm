package com.avito.android.service_booking_user_profile.view.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState;
import du0.C39805a;
import eu0.InterfaceC40158a;
import eu0.InterfaceC40160c;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingBlockActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Leu0/a;", "Leu0/c;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState;", "a", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40158a, InterfaceC40160c, ServiceBookingBlockState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_user_profile.view.domain.b f278211a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_persistence.f f278212b;

    /* compiled from: ServiceBookingBlockActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/a$a;", "", "<init>", "()V", "", "OPEN_DEBOUNCE_MILLIS", "J", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking_user_profile.view.mvi.a$a, reason: collision with other inner class name */
    public static final class C8264a {
        public /* synthetic */ C8264a(C42822w c42822w) {
            this();
        }

        public C8264a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<InterfaceC40160c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f278213b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.service_booking_user_profile.view.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C8265a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f278214b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.mvi.ServiceBookingBlockActor$paramChanged$$inlined$map$1$2", f = "ServiceBookingBlockActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.service_booking_user_profile.view.mvi.a$b$a$a, reason: collision with other inner class name */
            public static final class C8266a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f278215q;

                /* renamed from: r, reason: collision with root package name */
                public int f278216r;

                public C8266a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f278215q = obj;
                    this.f278216r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8265a.this.emit(null, this);
                }
            }

            public C8265a(InterfaceC43172j interfaceC43172j) {
                this.f278214b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.service_booking_user_profile.view.mvi.a.b.C8265a.C8266a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.service_booking_user_profile.view.mvi.a$b$a$a r0 = (com.avito.android.service_booking_user_profile.view.mvi.a.b.C8265a.C8266a) r0
                    int r1 = r0.f278216r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f278216r = r1
                    goto L18
                L13:
                    com.avito.android.service_booking_user_profile.view.mvi.a$b$a$a r0 = new com.avito.android.service_booking_user_profile.view.mvi.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f278215q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f278216r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L66
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r6 == 0) goto L4a
                    eu0.c$a r6 = new eu0.c$a
                    com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                    com.avito.android.remote.error.ApiError r2 = r5.getError()
                    java.lang.Throwable r5 = r5.getCause()
                    r6.<init>(r2, r5)
                    goto L5b
                L4a:
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r6 == 0) goto L69
                    eu0.c$b r6 = new eu0.c$b
                    com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                    java.lang.Object r5 = r5.getResult()
                    du0.a r5 = (du0.C39805a) r5
                    r6.<init>(r5)
                L5b:
                    r0.f278216r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f278214b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L66
                    return r1
                L66:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L69:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_user_profile.view.mvi.a.b.C8265a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f278213b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC40160c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f278213b.collect(new C8265a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingBlockActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Ldu0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.mvi.ServiceBookingBlockActor$paramChanged$1", f = "ServiceBookingBlockActor.kt", i = {}, l = {123, 123}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<C39805a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278218q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278219r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ServiceBookingBlockParams f278221t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ServiceBookingBlockParams serviceBookingBlockParams, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f278221t = serviceBookingBlockParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f278221t, continuation);
            cVar.f278219r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<C39805a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278218q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f278219r;
                com.avito.android.service_booking_user_profile.view.domain.b bVar = a.this.f278211a;
                ServiceBookingBlockParams serviceBookingBlockParams = this.f278221t;
                this.f278219r = interfaceC43172j;
                this.f278218q = 1;
                obj = bVar.a(serviceBookingBlockParams.f278204b, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f278219r;
                C42729a0.b(obj);
            }
            this.f278219r = null;
            this.f278218q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingBlockActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Leu0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.mvi.ServiceBookingBlockActor$paramChanged$3", f = "ServiceBookingBlockActor.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC40160c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278222q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f278223r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ServiceBookingBlockParams f278224s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ServiceBookingBlockParams serviceBookingBlockParams, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f278224s = serviceBookingBlockParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f278224s, continuation);
            dVar.f278223r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC40160c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278222q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f278223r;
                InterfaceC40160c.d dVar = new InterfaceC40160c.d(this.f278224s);
                this.f278222q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingBlockActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Leu0/c;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.mvi.ServiceBookingBlockActor$paramChanged$4", f = "ServiceBookingBlockActor.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC40160c>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278225q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f278226r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f278227s;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC40160c> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f278226r = interfaceC43172j;
            eVar.f278227s = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278225q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f278226r;
                InterfaceC40160c.a aVar = new InterfaceC40160c.a(null, this.f278227s);
                this.f278226r = null;
                this.f278225q = 1;
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

    static {
        new C8264a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.service_booking_user_profile.view.domain.b bVar, @Y61.k com.avito.android.service_booking_persistence.f fVar) {
        this.f278211a = bVar;
        this.f278212b = fVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.Y(C43175k.N(C43175k.G(new com.avito.android.service_booking_user_profile.view.mvi.b(aVar, null)), new com.avito.android.service_booking_user_profile.view.mvi.c(c43197r1), new com.avito.android.service_booking_user_profile.view.mvi.d(c43197r1), new com.avito.android.service_booking_user_profile.view.mvi.e(c43197r1)), new f(aVar, this, null)), C43175k.C(new h(aVar, this, null), C43175k.n(new g(c43197r1), 300L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<eu0.InterfaceC40160c> c(com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r13) {
        /*
            r12 = this;
            if (r13 != 0) goto La
            eu0.c$g r13 = eu0.InterfaceC40160c.g.f395443a
            kotlinx.coroutines.flow.w r0 = new kotlinx.coroutines.flow.w
            r0.<init>(r13)
            return r0
        La:
            r0 = 1
            r1 = 0
            java.lang.String r2 = r13.f278207e
            if (r2 == 0) goto L21
            java.lang.String r3 = r13.f278208f
            if (r3 == 0) goto L1c
            com.avito.android.service_booking_persistence.f r4 = r12.f278212b
            boolean r3 = r4.b(r3)
            r3 = r3 ^ r0
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 == 0) goto L21
            r8 = r2
            goto L22
        L21:
            r8 = r1
        L22:
            com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r2 = new com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams
            java.lang.String r5 = r13.f278204b
            java.lang.String r6 = r13.f278205c
            java.lang.String r7 = r13.f278206d
            java.lang.String r9 = r13.f278208f
            com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockIcon r10 = r13.f278209g
            com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockActionData r13 = r13.f278210h
            r4 = r2
            r11 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != 0) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L5f
            com.avito.android.service_booking_user_profile.view.mvi.a$c r13 = new com.avito.android.service_booking_user_profile.view.mvi.a$c
            r13.<init>(r2, r1)
            kotlinx.coroutines.flow.i r13 = kotlinx.coroutines.flow.C43175k.G(r13)
            com.avito.android.service_booking_user_profile.view.mvi.a$b r0 = new com.avito.android.service_booking_user_profile.view.mvi.a$b
            r0.<init>(r13)
            com.avito.android.service_booking_user_profile.view.mvi.a$d r13 = new com.avito.android.service_booking_user_profile.view.mvi.a$d
            r13.<init>(r2, r1)
            kotlinx.coroutines.flow.a0 r2 = new kotlinx.coroutines.flow.a0
            r2.<init>(r13, r0)
            com.avito.android.service_booking_user_profile.view.mvi.a$e r13 = new com.avito.android.service_booking_user_profile.view.mvi.a$e
            r0 = 3
            r13.<init>(r0, r1)
            kotlinx.coroutines.flow.f0 r0 = new kotlinx.coroutines.flow.f0
            r0.<init>(r2, r13)
            goto L69
        L5f:
            eu0.c$c r13 = new eu0.c$c
            r13.<init>(r2)
            kotlinx.coroutines.flow.w r0 = new kotlinx.coroutines.flow.w
            r0.<init>(r13)
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_user_profile.view.mvi.a.c(com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams):kotlinx.coroutines.flow.i");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<InterfaceC40160c> b(@Y61.k InterfaceC40158a interfaceC40158a, @Y61.k ServiceBookingBlockState serviceBookingBlockState) {
        C43210w c43210w;
        if (interfaceC40158a instanceof InterfaceC40158a.C11111a) {
            return new C43210w(new InterfaceC40160c.f(((InterfaceC40158a.C11111a) interfaceC40158a).f395427a));
        }
        if (interfaceC40158a instanceof InterfaceC40158a.b) {
            return c(((InterfaceC40158a.b) interfaceC40158a).f395428a);
        }
        if (interfaceC40158a instanceof InterfaceC40158a.c) {
            ServiceBookingBlockParams serviceBookingBlockParams = serviceBookingBlockState.f278246a;
            if (serviceBookingBlockParams != null) {
                return c(serviceBookingBlockParams);
            }
            c43210w = new C43210w(InterfaceC40160c.e.f395441a);
        } else {
            if (!(interfaceC40158a instanceof InterfaceC40158a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC40160c.g.f395443a);
        }
        return c43210w;
    }
}
