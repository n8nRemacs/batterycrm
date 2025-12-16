package com.avito.android.order.feature.mvi;

import Wi.b;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWi/b$a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "<anonymous>", "(LWi/b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderBootstrap$reloadScreenFlow$1", f = "OrderBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class r extends SuspendLambda implements Y41.p<b.a, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s f209691q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f209691q = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f209691q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(b.a aVar, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>> continuation) {
        return ((r) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f209691q.f209692a.a();
    }
}
