package com.avito.android.service_booking_details.mvi;

import Bt0.InterfaceC13184a;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingItemDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LBt0/a;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "LBt0/c;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements com.avito.android.arch.mvi.a<InterfaceC13184a, ServiceBookingItemDetailsInternalAction, Bt0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_details.domain.a f277406a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_details.domain.d f277407b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f277408c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f277409d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_details.l f277410e;

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$2", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277411q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277412r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bt0.c f277413s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bt0.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277413s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f277413s, continuation);
            aVar.f277412r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277411q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277412r;
                ServiceBookingItemDetailsInternalAction.Close close = new ServiceBookingItemDetailsInternalAction.Close(this.f277413s.f1776k);
                this.f277411q = 1;
                if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$3", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277414q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277415r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13184a f277416s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13184a interfaceC13184a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f277416s = interfaceC13184a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f277416s, continuation);
            bVar.f277415r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277414q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277415r;
                ServiceBookingItemDetailsInternalAction.HandleDeeplink handleDeeplink = new ServiceBookingItemDetailsInternalAction.HandleDeeplink(((InterfaceC13184a.d) this.f277416s).f1756a);
                this.f277414q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$4", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277417q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277418r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f277418r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277417q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277418r;
                ServiceBookingItemDetailsInternalAction.ShowUxFeedbackOrderCancellation showUxFeedbackOrderCancellation = ServiceBookingItemDetailsInternalAction.ShowUxFeedbackOrderCancellation.f277382b;
                this.f277417q = 1;
                if (interfaceC43172j.emit(showUxFeedbackOrderCancellation, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$5", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277419q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277420r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13184a f277421s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13184a interfaceC13184a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f277421s = interfaceC13184a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f277421s, continuation);
            dVar.f277420r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277419q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277420r;
                ((InterfaceC13184a.h) this.f277421s).getClass();
                ServiceBookingItemDetailsInternalAction.SetActivityResult setActivityResult = new ServiceBookingItemDetailsInternalAction.SetActivityResult();
                this.f277419q = 1;
                if (interfaceC43172j.emit(setActivityResult, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$6", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277422q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277423r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13184a f277424s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13184a interfaceC13184a, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f277424s = interfaceC13184a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f277424s, continuation);
            eVar.f277423r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277422q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277423r;
                ServiceBookingItemDetailsInternalAction.OnSuccessActionResult onSuccessActionResult = new ServiceBookingItemDetailsInternalAction.OnSuccessActionResult(((InterfaceC13184a.f) this.f277424s).f1758a);
                this.f277422q = 1;
                if (interfaceC43172j.emit(onSuccessActionResult, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$7", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277425q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277426r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13184a f277427s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC13184a interfaceC13184a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f277427s = interfaceC13184a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f277427s, continuation);
            fVar.f277426r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277425q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277426r;
                ServiceBookingItemDetailsInternalAction.OnFailureActionResult onFailureActionResult = new ServiceBookingItemDetailsInternalAction.OnFailureActionResult(((InterfaceC13184a.e) this.f277427s).f1757a);
                this.f277425q = 1;
                if (interfaceC43172j.emit(onFailureActionResult, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$process$8", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {75, 77}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277428q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277429r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13184a f277430s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h f277431t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC13184a interfaceC13184a, h hVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f277430s = interfaceC13184a;
            this.f277431t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f277430s, this.f277431t, continuation);
            gVar.f277429r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServiceBookingItemDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277428q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277429r;
                com.avito.android.service_booking_common.blueprints.contact.c cVar = ((InterfaceC13184a.c) this.f277430s).f1755a;
                if (cVar.f276293h != null) {
                    h hVar = this.f277431t;
                    InterfaceC43160i<ServiceBookingItemDetailsInternalAction> interfaceC43160iA = hVar.f277407b.a(hVar.f277408c, cVar.f276288c);
                    this.f277428q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ServiceBookingItemDetailsInternalAction.CopyPhoneToClipboard copyPhoneToClipboard = new ServiceBookingItemDetailsInternalAction.CopyPhoneToClipboard(cVar);
                    this.f277428q = 2;
                    if (interfaceC43172j.emit(copyPhoneToClipboard, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.service_booking_details.domain.a aVar, @Y61.k com.avito.android.service_booking_details.domain.d dVar, @com.avito.android.service_booking_details.di.a @Y61.k String str, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.service_booking_details.l lVar) {
        this.f277406a = aVar;
        this.f277407b = dVar;
        this.f277408c = str;
        this.f277409d = aVar2;
        this.f277410e = lVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.service_booking_details.mvi.g(this, aVar, null), C43175k.N(C43175k.C(new com.avito.android.service_booking_details.mvi.f(this, null), C40482a.a(this.f277409d)), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ServiceBookingItemDetailsInternalAction> b(@Y61.k InterfaceC13184a interfaceC13184a, @Y61.k Bt0.c cVar) {
        if (interfaceC13184a instanceof InterfaceC13184a.g) {
            return this.f277406a.a(this.f277408c);
        }
        if (interfaceC13184a instanceof InterfaceC13184a.C0074a) {
            return C43175k.G(new a(cVar, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.d) {
            return C43175k.G(new b(interfaceC13184a, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.b) {
            return C43175k.G(new c(2, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.h) {
            return C43175k.G(new d(interfaceC13184a, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.f) {
            return C43175k.G(new e(interfaceC13184a, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.e) {
            return C43175k.G(new f(interfaceC13184a, null));
        }
        if (interfaceC13184a instanceof InterfaceC13184a.c) {
            return C43175k.G(new g(interfaceC13184a, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
