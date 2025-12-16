package com.avito.android.activeOrders;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ActiveOrdersInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/activeOrders/OrdersNeedActionResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.activeOrders.ActiveOrdersInteractorImpl$getNeedActionActiveOrders$2", f = "ActiveOrdersInteractorImpl.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<OrdersNeedActionResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68213q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f68214r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f68214r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f68214r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<OrdersNeedActionResponse>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f68213q;
        if (i12 == 0) {
            C42729a0.b(obj);
            E3.a aVar = this.f68214r.f68215a.get();
            this.f68213q = 1;
            obj = aVar.a("requiringActions", this);
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
