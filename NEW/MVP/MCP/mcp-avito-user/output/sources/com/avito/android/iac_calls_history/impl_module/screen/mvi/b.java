package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import Y41.p;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a;
import java.time.LocalDateTime;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallsHistoryScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.mvi.CallsHistoryScreenActor$loadNextItems$1", f = "CallsHistoryScreenActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super CallsHistoryScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_calls_history.impl_module.screen.mvi.a f164791q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LocalDateTime f164792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryTabType f164793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f164794t;

    /* compiled from: CallsHistoryScreenActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.mvi.CallsHistoryScreenActor$loadNextItems$1$1", f = "CallsHistoryScreenActor.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f164795q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_calls_history.impl_module.screen.mvi.a f164796r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LocalDateTime f164797s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CallsHistoryTabType f164798t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f164799u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar, LocalDateTime localDateTime, CallsHistoryTabType callsHistoryTabType, long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f164796r = aVar;
            this.f164797s = localDateTime;
            this.f164798t = callsHistoryTabType;
            this.f164799u = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f164796r, this.f164797s, this.f164798t, this.f164799u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f164795q;
            long j12 = this.f164799u;
            com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar = this.f164796r;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.iac_calls_history.impl_module.interactor.a aVar2 = aVar.f164788a;
                    LocalDateTime localDateTime = this.f164797s;
                    CallsHistoryTabType callsHistoryTabType = this.f164798t;
                    this.f164795q = 1;
                    obj = aVar2.a(localDateTime, callsHistoryTabType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                com.avito.android.iac_calls_history.impl_module.interactor.l lVar = (com.avito.android.iac_calls_history.impl_module.interactor.l) obj;
                aVar.f164790c.a(new a.c(j12, lVar.f164752b, lVar.f164751a));
            } catch (Exception unused) {
                aVar.f164790c.a(new a.d(j12));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar, LocalDateTime localDateTime, CallsHistoryTabType callsHistoryTabType, long j12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f164791q = aVar;
        this.f164792r = localDateTime;
        this.f164793s = callsHistoryTabType;
        this.f164794t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f164791q, this.f164792r, this.f164793s, this.f164794t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CallsHistoryScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43259k.d(U.a(EmptyCoroutineContext.INSTANCE), null, null, new a(this.f164791q, this.f164792r, this.f164793s, this.f164794t, null), 3);
        return G0.f406611a;
    }
}
