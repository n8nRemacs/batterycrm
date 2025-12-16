package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import com.avito.android.str_seller_orders.orders_filters.mvi.entity.StrOrdersFiltersInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrOrdersFiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_filters.mvi.StrOrdersFiltersActor$onApplyClick$1", f = "StrOrdersFiltersActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289185q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289186r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ qz0.c f289187s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qz0.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f289187s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f289187s, continuation);
        aVar.f289186r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289185q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289186r;
        qz0.c cVar = this.f289187s;
        List<StrOrdersFiltersOption> list = cVar.f429550c;
        if (list == null || (str = cVar.f429549b) == null) {
            StrOrdersFiltersInternalAction.Close close = StrOrdersFiltersInternalAction.Close.f289192b;
            this.f289185q = 1;
            if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((StrOrdersFiltersOption) obj2).f289165d) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((StrOrdersFiltersOption) it.next()).f289163b);
        }
        StrOrdersFiltersInternalAction.CloseWithResult closeWithResult = new StrOrdersFiltersInternalAction.CloseWithResult(new StrOrdersFiltersResult(str, arrayList2));
        this.f289185q = 2;
        if (interfaceC43172j.emit(closeWithResult, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
