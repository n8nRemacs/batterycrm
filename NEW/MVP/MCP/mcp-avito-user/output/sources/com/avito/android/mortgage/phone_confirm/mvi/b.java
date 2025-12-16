package com.avito.android.mortgage.phone_confirm.mvi;

import Y41.p;
import com.avito.android.mortgage.domain.check_access.a;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import com.avito.android.remote.error.ApiError;
import g00.InterfaceC40507d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhoneConfirmActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$sendCode$1", f = "PhoneConfirmActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201592q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201593r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mortgage.phone_confirm.mvi.c f201594s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J00.c f201595t;

    /* compiled from: PhoneConfirmActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$sendCode$1$1", f = "PhoneConfirmActor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201596q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201597r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43172j<?> interfaceC43172j, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f201597r = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f201597r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201596q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PhoneConfirmInternalAction.AccessCheckStarted accessCheckStarted = new PhoneConfirmInternalAction.AccessCheckStarted();
                this.f201596q = 1;
                if (this.f201597r.emit(accessCheckStarted, this) == coroutine_suspended) {
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

    /* compiled from: PhoneConfirmActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/domain/check_access/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$sendCode$1$2", f = "PhoneConfirmActor.kt", i = {0}, l = {42, 46}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.avito.android.mortgage.phone_confirm.mvi.b$b, reason: collision with other inner class name */
    public static final class C5976b extends SuspendLambda implements p<com.avito.android.mortgage.domain.check_access.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201598q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201599r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201600s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ J00.c f201601t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mortgage.phone_confirm.mvi.c f201602u;

        /* compiled from: PhoneConfirmActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$sendCode$1$2$1", f = "PhoneConfirmActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.phone_confirm.mvi.b$b$a */
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.mortgage.phone_confirm.mvi.c f201603q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ float f201604r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.avito.android.mortgage.phone_confirm.mvi.c cVar, float f12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f201603q = cVar;
                this.f201604r = f12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f201603q, this.f201604r, continuation);
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
                this.f201603q.f201610c.b(InterfaceC40507d.b.a(this.f201604r));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5976b(InterfaceC43172j<?> interfaceC43172j, J00.c cVar, com.avito.android.mortgage.phone_confirm.mvi.c cVar2, Continuation<? super C5976b> continuation) {
            super(2, continuation);
            this.f201600s = interfaceC43172j;
            this.f201601t = cVar;
            this.f201602u = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C5976b c5976b = new C5976b(this.f201600s, this.f201601t, this.f201602u, continuation);
            c5976b.f201599r = obj;
            return c5976b;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.mortgage.domain.check_access.a aVar, Continuation<? super G0> continuation) {
            return ((C5976b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.mortgage.domain.check_access.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201598q;
            if (i12 == 0) {
                C42729a0.b(obj);
                aVar = (com.avito.android.mortgage.domain.check_access.a) this.f201599r;
                PhoneConfirmInternalAction.AccessCheckCompleted accessCheckCompleted = new PhoneConfirmInternalAction.AccessCheckCompleted(aVar);
                this.f201599r = aVar;
                this.f201598q = 1;
                if (this.f201600s.emit(accessCheckCompleted, this) == coroutine_suspended) {
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
                aVar = (com.avito.android.mortgage.domain.check_access.a) this.f201599r;
                C42729a0.b(obj);
            }
            if (aVar instanceof a.C5890a) {
                Integer num = ((a.C5890a) aVar).f199472c;
                int iIntValue = num != null ? num.intValue() : this.f201601t.f8710k;
                com.avito.android.mortgage.phone_confirm.mvi.c cVar = this.f201602u;
                AbstractC43129d1 abstractC43129d1B = cVar.f201611d.b();
                a aVar2 = new a(cVar, iIntValue, null);
                this.f201599r = null;
                this.f201598q = 2;
                if (C43259k.g(abstractC43129d1B, aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneConfirmActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.mvi.PhoneConfirmActor$sendCode$1$3", f = "PhoneConfirmActor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<ApiError, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201605q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201606r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201607s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43172j<?> interfaceC43172j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f201607s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f201607s, continuation);
            cVar.f201606r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
            return ((c) create(apiError, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201605q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PhoneConfirmInternalAction.AccessCheckFailed accessCheckFailed = new PhoneConfirmInternalAction.AccessCheckFailed((ApiError) this.f201606r);
                this.f201605q = 1;
                if (this.f201607s.emit(accessCheckFailed, this) == coroutine_suspended) {
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
    public b(com.avito.android.mortgage.phone_confirm.mvi.c cVar, J00.c cVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f201594s = cVar;
        this.f201595t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f201594s, this.f201595t, continuation);
        bVar.f201593r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201592q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201593r;
            com.avito.android.mortgage.phone_confirm.mvi.c cVar = this.f201594s;
            com.avito.android.mortgage.domain.check_access.b bVar = cVar.f201608a;
            J00.c cVar2 = this.f201595t;
            String str = cVar2.f8701b;
            a aVar = new a(interfaceC43172j, null);
            C5976b c5976b = new C5976b(interfaceC43172j, cVar2, cVar, null);
            c cVar3 = new c(interfaceC43172j, null);
            this.f201592q = 1;
            if (bVar.a(str, cVar2.f8702c, cVar2.f8704e, aVar, c5976b, cVar3, this) == coroutine_suspended) {
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
