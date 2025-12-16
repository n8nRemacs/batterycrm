package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import Fz0.InterfaceC13858a;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersRangeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersrange.mvi.StrSellerOrdersRangeActor$process$1", f = "StrSellerOrdersRangeActor.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersRangeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290261q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f290262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13858a f290263s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC13858a interfaceC13858a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f290263s = interfaceC13858a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f290263s, continuation);
        aVar.f290262r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersRangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290261q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f290262r;
            StrSellerOrdersRangeInternalAction.HandleDeeplink handleDeeplink = new StrSellerOrdersRangeInternalAction.HandleDeeplink(((InterfaceC13858a.b) this.f290263s).f6111a);
            this.f290261q = 1;
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
