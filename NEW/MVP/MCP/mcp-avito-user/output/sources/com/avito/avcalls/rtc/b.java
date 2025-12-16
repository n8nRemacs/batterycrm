package com.avito.avcalls.rtc;

import com.avito.avcalls.rtc.connecting.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PCSession.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a$a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/avcalls/rtc/connecting/a$a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionImpl$1", f = "PCSession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<a.C10347a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f333058q;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(2, continuation);
        bVar.f333058q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(a.C10347a c10347a, Continuation<? super G0> continuation) {
        return ((b) create(c10347a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        g.f333136t.c((a.C10347a) this.f333058q, "flow.peerConnection.observerEvents", new Object[0]);
        return G0.f406611a;
    }
}
