package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.remote.model.StrOrdersListPageInfoBody;
import com.avito.android.remote.model.StrOrdersListSectionBody;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yz0.C50327a;

/* compiled from: StrSellerOrdersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$process$2", f = "StrSellerOrdersActor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289852q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289853r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289854s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f289855t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StrSellerOrdersState strSellerOrdersState, a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f289854s = strSellerOrdersState;
        this.f289855t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f289854s, this.f289855t, continuation);
        dVar.f289853r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289852q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289853r;
            StrSellerOrdersState strSellerOrdersState = this.f289854s;
            if (strSellerOrdersState.f289897q) {
                return G0.f406611a;
            }
            int i13 = a.f289826f;
            a aVar = this.f289855t;
            aVar.getClass();
            C50327a c50327a = strSellerOrdersState.f289893m;
            StrOrdersListBody strOrdersListBody = null;
            if ((c50327a != null || (c50327a = strSellerOrdersState.f289895o) != null) && c50327a.f443627d) {
                strOrdersListBody = new StrOrdersListBody(Collections.singletonList(new StrOrdersListSectionBody(c50327a.f443624a, new StrOrdersListPageInfoBody(Integer.valueOf(c50327a.f443626c + 1)), C42784z0.f406748b)));
            }
            if (strOrdersListBody == null) {
                return G0.f406611a;
            }
            InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iB = aVar.f289827a.b(false, strOrdersListBody);
            this.f289852q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
