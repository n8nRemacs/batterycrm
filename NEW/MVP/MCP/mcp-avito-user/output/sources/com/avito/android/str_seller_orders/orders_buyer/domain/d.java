package com.avito.android.str_seller_orders.orders_buyer.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.StrOrdersBuyerResponse;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nz0.C44494a;

/* compiled from: LoadBuyerOrdersUseCase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrOrdersBuyerResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.orders_buyer.domain.LoadBuyerOrdersUseCaseImpl$invoke$1", f = "LoadBuyerOrdersUseCase.kt", i = {0}, l = {37, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<StrOrdersBuyerResponse>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288979q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f288980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f288981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C44494a f288982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, C44494a c44494a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f288981s = fVar;
        this.f288982t = c44494a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f288981s, this.f288982t, continuation);
        dVar.f288980r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<StrOrdersBuyerResponse>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288979q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f288980r;
            f fVar = this.f288981s;
            fVar.getClass();
            C44494a c44494a = this.f288982t;
            Map<String, String> mapC = c44494a == null ? P0.c() : P0.g(new Q("sections[0][name]", c44494a.f419251a), new Q("sections[0][page]", String.valueOf(c44494a.f419252b)));
            this.f288980r = interfaceC43172j;
            this.f288979q = 1;
            obj = fVar.f288985a.k(mapC, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f288980r;
            C42729a0.b(obj);
        }
        this.f288980r = null;
        this.f288979q = 2;
        if (interfaceC43172j.emit((TypedResult) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
