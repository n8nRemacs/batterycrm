package com.avito.android.comfortable_deal.client_room.seller_recall;

import ip.InterfaceC42085a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: SellerRecallView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallViewImpl$clicks$1$1", f = "SellerRecallView.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119966q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f119967r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42085a f119968s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, InterfaceC42085a interfaceC42085a, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f119967r = rVar;
        this.f119968s = interfaceC42085a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f119967r, this.f119968s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f119966q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f119967r.f120026e;
            this.f119966q = 1;
            if (e2Var.emit(this.f119968s, this) == coroutine_suspended) {
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
