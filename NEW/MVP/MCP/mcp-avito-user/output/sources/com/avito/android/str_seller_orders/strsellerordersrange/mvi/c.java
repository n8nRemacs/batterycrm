package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersRangeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersrange.mvi.StrSellerOrdersRangeActor$process$3", f = "StrSellerOrdersRangeActor.kt", i = {}, l = {32, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersRangeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f290266q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f290267r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f290268s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersRangeState f290269t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, StrSellerOrdersRangeState strSellerOrdersRangeState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f290268s = dVar;
        this.f290269t = strSellerOrdersRangeState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f290268s, this.f290269t, continuation);
        cVar.f290267r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersRangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f290266q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f290267r;
            com.avito.android.str_seller_orders.strsellerordersrange.domain.b bVar = this.f290268s.f290270a;
            StrSellerOrdersRangeState strSellerOrdersRangeState = this.f290269t;
            String str = strSellerOrdersRangeState.f290278b;
            this.f290267r = interfaceC43172j;
            this.f290266q = 1;
            obj = bVar.a(str, strSellerOrdersRangeState.f290279c, strSellerOrdersRangeState.f290280d);
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
            interfaceC43172j = (InterfaceC43172j) this.f290267r;
            C42729a0.b(obj);
        }
        this.f290267r = null;
        this.f290266q = 2;
        if (C43175k.u(this, (InterfaceC43160i) obj, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
