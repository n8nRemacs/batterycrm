package com.avito.android.orders.feature.beduin_orders_list.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.orders.api.model.BeduinOrdersResponse;
import com.avito.android.orders.feature.beduin_orders_list.i;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BeduinOrdersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/orders/api/model/BeduinOrdersResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.data.BeduinOrdersRepositoryImpl$getBeduinOrders$2", f = "BeduinOrdersRepositoryImpl.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<BeduinOrdersResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210005q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f210006r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f210007s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f210008t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, i iVar, Map<String, ? extends Object> map, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f210006r = dVar;
        this.f210007s = iVar;
        this.f210008t = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f210006r, this.f210007s, this.f210008t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<BeduinOrdersResponse>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210005q;
        if (i12 == 0) {
            C42729a0.b(obj);
            X40.a aVar = this.f210006r.f210013b.get();
            i iVar = this.f210007s;
            String str = iVar != null ? iVar.f210062a : null;
            Map<String, String> mapJ = A4.j(A4.f318516a, this.f210008t);
            this.f210005q = 1;
            obj = aVar.b(str, mapJ, this);
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
