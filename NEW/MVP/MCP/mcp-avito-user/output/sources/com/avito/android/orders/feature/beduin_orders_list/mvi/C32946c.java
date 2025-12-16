package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Z40.c;
import com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction;
import com.avito.android.beduin_shared.model.transform.LocalParameterTransform;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BeduinOrdersActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.BeduinOrdersActor$handleOrdersSearch$1", f = "BeduinOrdersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.orders.feature.beduin_orders_list.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32946c extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f210082q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Z40.c> f210083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32944a f210084s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32946c(Y41.a<? extends Z40.c> aVar, C32944a c32944a, Continuation<? super C32946c> continuation) {
        super(2, continuation);
        this.f210083r = aVar;
        this.f210084s = c32944a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32946c c32946c = new C32946c(this.f210083r, this.f210084s, continuation);
        c32946c.f210082q = obj;
        return c32946c;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((C32946c) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f210082q;
        Z40.c cVarInvoke = this.f210083r.invoke();
        if (cVarInvoke instanceof c.a) {
            this.f210084s.f210074a.o(new BeduinApplyTransformAction("filtersState", ((c.a) cVarInvoke).f19863d, Collections.singletonList(new LocalParameterTransform("query", str))));
        }
        return G0.f406611a;
    }
}
