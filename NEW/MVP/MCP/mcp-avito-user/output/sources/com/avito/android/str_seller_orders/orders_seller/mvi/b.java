package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sz0.AbstractC48441b;
import sz0.AbstractC48444e;
import sz0.C48445f;
import tz0.InterfaceC48745a;

/* compiled from: StrSellerOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersActor$onFiltersFragmentResultReceived$1", f = "StrSellerOrdersActor.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289536q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48745a.f f289538s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289539t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f289540u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC48745a.f fVar, StrSellerOrdersState strSellerOrdersState, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f289538s = fVar;
        this.f289539t = strSellerOrdersState;
        this.f289540u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f289538s, this.f289539t, this.f289540u, continuation);
        bVar.f289537r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<AbstractC48441b> list;
        Object next;
        AbstractC48444e cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289536q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289537r;
            StrOrdersFiltersResult strOrdersFiltersResult = this.f289538s.f439704a;
            if (strOrdersFiltersResult == null) {
                return G0.f406611a;
            }
            StrSellerOrdersState strSellerOrdersState = this.f289539t;
            C48445f c48445f = strSellerOrdersState.f289576b;
            if (c48445f != null && (list = c48445f.f438996a) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((AbstractC48441b) next).getF438969a(), strOrdersFiltersResult.f289124b)) {
                        break;
                    }
                }
                AbstractC48441b abstractC48441b = (AbstractC48441b) next;
                if (abstractC48441b != null) {
                    if (abstractC48441b instanceof AbstractC48441b.a) {
                        return G0.f406611a;
                    }
                    boolean z12 = abstractC48441b instanceof AbstractC48441b.C12655b;
                    ArrayList arrayList = strOrdersFiltersResult.f289125c;
                    if (z12) {
                        cVar = new AbstractC48444e.b(abstractC48441b.getF438969a(), arrayList);
                    } else {
                        if (!(abstractC48441b instanceof AbstractC48441b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new AbstractC48444e.c(abstractC48441b.getF438969a(), arrayList != null ? (String) C42745f0.G(arrayList) : null);
                    }
                    List<AbstractC48441b> list2 = strSellerOrdersState.f289576b.f438996a;
                    d dVar = this.f289540u;
                    dVar.getClass();
                    InterfaceC43160i interfaceC43160iG = C43175k.G(new c(dVar, cVar, list2, null));
                    this.f289536q = 1;
                    if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }
}
