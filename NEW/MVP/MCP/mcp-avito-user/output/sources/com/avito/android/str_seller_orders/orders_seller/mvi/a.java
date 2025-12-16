package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_seller.mvi.StrSellerOrdersActor$onFilterClicked$1", f = "StrSellerOrdersActor.kt", i = {}, l = {103, 114, 117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289531q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289532r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289533s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f289534t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48745a.e f289535u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StrSellerOrdersState strSellerOrdersState, d dVar, InterfaceC48745a.e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f289533s = strSellerOrdersState;
        this.f289534t = dVar;
        this.f289535u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f289533s, this.f289534t, this.f289535u, continuation);
        aVar.f289532r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<AbstractC48441b> list;
        Object next;
        StrOrdersFiltersOpenParams strOrdersFiltersOpenParamsA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289531q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289532r;
            StrSellerOrdersState strSellerOrdersState = this.f289533s;
            C48445f c48445f = strSellerOrdersState.f289576b;
            if (c48445f != null && (list = c48445f.f438996a) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((AbstractC48441b) next).getF438969a(), this.f289535u.f439703a)) {
                        break;
                    }
                }
                AbstractC48441b abstractC48441b = (AbstractC48441b) next;
                if (abstractC48441b != null) {
                    boolean z12 = abstractC48441b instanceof AbstractC48441b.a;
                    d dVar = this.f289534t;
                    if (z12) {
                        AbstractC48444e.a aVar = new AbstractC48444e.a(abstractC48441b.getF438969a(), Boxing.boxBoolean(!((AbstractC48441b.a) abstractC48441b).f438973e));
                        List<AbstractC48441b> list2 = strSellerOrdersState.f289576b.f438996a;
                        dVar.getClass();
                        InterfaceC43160i interfaceC43160iG = C43175k.G(new c(dVar, aVar, list2, null));
                        this.f289531q = 1;
                        if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (abstractC48441b instanceof AbstractC48441b.C12655b) {
                        StrOrdersFiltersOpenParams strOrdersFiltersOpenParamsA2 = dVar.f289549c.a(abstractC48441b);
                        if (strOrdersFiltersOpenParamsA2 != null) {
                            StrSellerOrdersInternalAction.OpenFilters openFilters = new StrSellerOrdersInternalAction.OpenFilters(strOrdersFiltersOpenParamsA2);
                            this.f289531q = 2;
                            if (interfaceC43172j.emit(openFilters, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if ((abstractC48441b instanceof AbstractC48441b.c) && (strOrdersFiltersOpenParamsA = dVar.f289549c.a(abstractC48441b)) != null) {
                        StrSellerOrdersInternalAction.OpenFilters openFilters2 = new StrSellerOrdersInternalAction.OpenFilters(strOrdersFiltersOpenParamsA);
                        this.f289531q = 3;
                        if (interfaceC43172j.emit(openFilters2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }
}
