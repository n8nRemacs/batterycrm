package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import java.util.List;
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
import sz0.AbstractC48441b;
import sz0.AbstractC48444e;

/* compiled from: StrSellerOrdersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersActor$updateFilter$1", f = "StrSellerOrdersActor.kt", i = {0, 0}, l = {127, 129}, m = "invokeSuspend", n = {"$this$flow", "newFilters"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public List f289541q;

    /* renamed from: r, reason: collision with root package name */
    public int f289542r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f289543s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f289544t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC48444e f289545u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<AbstractC48441b> f289546v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, AbstractC48444e abstractC48444e, List<? extends AbstractC48441b> list, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f289544t = dVar;
        this.f289545u = abstractC48444e;
        this.f289546v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f289544t, this.f289545u, this.f289546v, continuation);
        cVar.f289543s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        List listA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289542r;
        d dVar = this.f289544t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f289543s;
            listA = dVar.f289550d.a(this.f289545u, this.f289546v);
            StrSellerOrdersInternalAction.UpdateFilters updateFilters = new StrSellerOrdersInternalAction.UpdateFilters(listA);
            this.f289543s = interfaceC43172j;
            this.f289541q = listA;
            this.f289542r = 1;
            if (interfaceC43172j.emit(updateFilters, this) == coroutine_suspended) {
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
            listA = this.f289541q;
            interfaceC43172j = (InterfaceC43172j) this.f289543s;
            C42729a0.b(obj);
        }
        InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iA = dVar.f289547a.a(null, dVar.f289551e.a(listA), true);
        this.f289543s = null;
        this.f289541q = null;
        this.f289542r = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
