package com.avito.android.arch.mvi;

import com.avito.android.arch.mvi.log.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u008a@"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "action", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.Feature$observeActor$1", f = "Feature.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class g extends SuspendLambda implements Y41.p<Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f91952q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c<Object, Object, Object, Object> f91953r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c<Object, Object, Object, Object> cVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f91953r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f91953r, continuation);
        gVar.f91952q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        return ((g) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Object obj2 = this.f91952q;
        c<Object, Object, Object, Object> cVar = this.f91953r;
        cVar.f91920i.b(cVar.f91922k, f.a.a("action"), obj2);
        return G0.f406611a;
    }
}
