package com.avito.android.str_calendar.seller.calendar.data;

import Hy0.C14050b;
import Hy0.C14051c;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error.z;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrItemBookingSellerCalendarResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarInternalAction;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerCalendarInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/data/a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f287506a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f287507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14050b f287508c;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.seller.calendar.data.a$a, reason: collision with other inner class name */
    public static final class C8632a implements InterfaceC43160i<P2<? super StrItemBookingSellerCalendarResponse>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43197r1 f287509b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_calendar.seller.calendar.data.a$a$a, reason: collision with other inner class name */
        public static final class C8633a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f287510b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.data.StrSellerCalendarInteractor$getSellerCalendar$$inlined$map$1$2", f = "StrSellerCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calendar.data.a$a$a$a, reason: collision with other inner class name */
            public static final class C8634a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f287511q;

                /* renamed from: r, reason: collision with root package name */
                public int f287512r;

                public C8634a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f287511q = obj;
                    this.f287512r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8633a.this.emit(null, this);
                }
            }

            public C8633a(InterfaceC43172j interfaceC43172j) {
                this.f287510b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.str_calendar.seller.calendar.data.a.C8632a.C8633a.C8634a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_calendar.seller.calendar.data.a$a$a$a r0 = (com.avito.android.str_calendar.seller.calendar.data.a.C8632a.C8633a.C8634a) r0
                    int r1 = r0.f287512r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f287512r = r1
                    goto L18
                L13:
                    com.avito.android.str_calendar.seller.calendar.data.a$a$a$a r0 = new com.avito.android.str_calendar.seller.calendar.data.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f287511q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f287512r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r6 == 0) goto L46
                    com.avito.android.util.P2$b r6 = new com.avito.android.util.P2$b
                    com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                    java.lang.Object r5 = r5.getResult()
                    r6.<init>(r5)
                    goto L55
                L46:
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r6 == 0) goto L63
                    com.avito.android.util.P2$a r6 = new com.avito.android.util.P2$a
                    com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                    com.avito.android.remote.error.ApiError r5 = r5.getError()
                    r6.<init>(r5)
                L55:
                    r0.f287512r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f287510b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L63:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calendar.data.a.C8632a.C8633a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C8632a(C43197r1 c43197r1) {
            this.f287509b = c43197r1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super P2<? super StrItemBookingSellerCalendarResponse>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f287509b.collect(new C8633a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43137a0 f287514b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_calendar.seller.calendar.data.a$b$a, reason: collision with other inner class name */
        public static final class C8635a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f287515b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.data.StrSellerCalendarInteractor$getSellerCalendar$$inlined$map$2$2", f = "StrSellerCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calendar.data.a$b$a$a, reason: collision with other inner class name */
            public static final class C8636a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f287516q;

                /* renamed from: r, reason: collision with root package name */
                public int f287517r;

                public C8636a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f287516q = obj;
                    this.f287517r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8635a.this.emit(null, this);
                }
            }

            public C8635a(InterfaceC43172j interfaceC43172j) {
                this.f287515b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r17, @Y61.k kotlin.coroutines.Continuation r18) {
                /*
                    Method dump skipped, instructions count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calendar.data.a.b.C8635a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(C43137a0 c43137a0) {
            this.f287514b = c43137a0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f287514b.collect(new C8635a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.data.StrSellerCalendarInteractor$getSellerCalendar$1", f = "StrSellerCalendarInteractor.kt", i = {}, l = {37, 37}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<StrItemBookingSellerCalendarResponse>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287519q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f287520r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f287522t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f287523u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f287522t = str;
            this.f287523u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f287522t, this.f287523u, continuation);
            cVar.f287520r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<StrItemBookingSellerCalendarResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287519q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f287520r;
                d1 d1Var = a.this.f287506a;
                this.f287520r = interfaceC43172j;
                this.f287519q = 1;
                obj = d1Var.q(this.f287522t, this.f287523u, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f287520r;
                C42729a0.b(obj);
            }
            this.f287520r = null;
            this.f287519q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.data.StrSellerCalendarInteractor$getSellerCalendar$2", f = "StrSellerCalendarInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<TypedResult<StrItemBookingSellerCalendarResponse>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f287524q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f287524q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(TypedResult<StrItemBookingSellerCalendarResponse> typedResult, Continuation<? super G0> continuation) {
            return ((d) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult typedResult = (TypedResult) this.f287524q;
            if (typedResult instanceof TypedResult.Error) {
                a.this.f287508c.a(((TypedResult.Error) typedResult).getCause());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calendar.data.StrSellerCalendarInteractor$getSellerCalendar$4", f = "StrSellerCalendarInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super StrItemBookingSellerCalendarResponse>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287526q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f287527r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f287527r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super StrItemBookingSellerCalendarResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287526q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287527r;
                P2.c cVar = P2.c.f318721a;
                this.f287526q = 1;
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

    @Inject
    public a(@Y61.k d1 d1Var, @Y61.k R0 r02, @Y61.k C14050b c14050b) {
        this.f287506a = d1Var;
        this.f287507b = r02;
        this.f287508c = c14050b;
    }

    @Y61.k
    public final InterfaceC43160i<StrSellerCalendarInternalAction> a(@Y61.l String str, @Y61.k String str2) {
        if (str == null) {
            Throwable th2 = C14051c.f7846a;
            this.f287508c.a(th2);
            return new C43210w(new StrSellerCalendarInternalAction.ContentError(z.n(th2)));
        }
        return C43175k.I(this.f287507b.a(), new b(new C43137a0(new e(2, null), new C8632a(new C43197r1(new d(null), C43175k.G(new c(str, str2, null)))))));
    }
}
