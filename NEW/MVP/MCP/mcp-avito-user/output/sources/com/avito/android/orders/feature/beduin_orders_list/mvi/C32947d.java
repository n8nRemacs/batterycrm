package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinOrdersActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LZ40/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "<anonymous>", "(LZ40/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.BeduinOrdersActor$process$2", f = "BeduinOrdersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.orders.feature.beduin_orders_list.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32947d extends SuspendLambda implements Y41.p<Z40.a, Continuation<? super InterfaceC43160i<? extends BeduinOrdersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f210085q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32944a f210086r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Z40.c> f210087s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32947d(Y41.a aVar, C32944a c32944a, Continuation continuation) {
        super(2, continuation);
        this.f210086r = c32944a;
        this.f210087s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32947d c32947d = new C32947d(this.f210087s, this.f210086r, continuation);
        c32947d.f210085q = obj;
        return c32947d;
    }

    @Override // Y41.p
    public final Object invoke(Z40.a aVar, Continuation<? super InterfaceC43160i<? extends BeduinOrdersInternalAction>> continuation) {
        return ((C32947d) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f210086r.b((Z40.a) this.f210085q, this.f210087s.invoke());
    }
}
