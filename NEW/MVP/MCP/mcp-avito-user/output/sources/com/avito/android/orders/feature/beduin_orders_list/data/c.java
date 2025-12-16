package com.avito.android.orders.feature.beduin_orders_list.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.orders.api.model.UpdatedOrderResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BeduinOrdersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders/api/model/UpdatedOrderResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.data.BeduinOrdersRepositoryImpl$getUpdatedOrder$2", f = "BeduinOrdersRepositoryImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<UpdatedOrderResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f210010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f210011s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f210010r = dVar;
        this.f210011s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f210010r, this.f210011s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<UpdatedOrderResponse>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210009q;
        if (i12 == 0) {
            C42729a0.b(obj);
            X40.a aVar = this.f210010r.f210013b.get();
            this.f210009q = 1;
            obj = aVar.a(this.f210011s, true, this);
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
