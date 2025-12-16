package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.orders.api.model.UpdatedOrderResponse;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpdateOrderUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.UpdateOrderUseCase$invoke$1", f = "UpdateOrderUseCase.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210067q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C f210068r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f210069s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c12, String str, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f210068r = c12;
        this.f210069s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f210068r, this.f210069s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BeduinOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((B) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210067q;
        C c12 = this.f210068r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.orders.feature.beduin_orders_list.data.a aVar = c12.f210070a;
            this.f210067q = 1;
            obj = aVar.b(this.f210069s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            com.avito.android.beduin_shared.model.utils.a.a(c12.f210071b, ((UpdatedOrderResponse) ((TypedResult.Success) typedResult).getResult()).getActions());
            new TypedResult.Success(G0.f406611a);
        } else if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        return G0.f406611a;
    }
}
