package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU40/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "<anonymous>", "(LU40/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.OrderActor$process$1", f = "OrderActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class j extends SuspendLambda implements Y41.p<U40.a, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209899q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f209900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<U40.c> f209901s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, Y41.a<U40.c> aVar2, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f209900r = aVar;
        this.f209901s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f209900r, this.f209901s, continuation);
        jVar.f209899q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(U40.a aVar, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>> continuation) {
        return ((j) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        U40.a aVar = (U40.a) this.f209899q;
        this.f209901s.invoke();
        return this.f209900r.e(aVar);
    }
}
