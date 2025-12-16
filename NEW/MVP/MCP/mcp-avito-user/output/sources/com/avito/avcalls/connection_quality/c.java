package com.avito.avcalls.connection_quality;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ConnectionQualityDetector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/connection_quality/ConnectionQualityStatus;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/avcalls/connection_quality/ConnectionQualityStatus;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.connection_quality.ConnectionQualityDetectorImpl$status$1", f = "ConnectionQualityDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<ConnectionQualityStatus, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f332887q;

    public c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(2, continuation);
        cVar.f332887q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(ConnectionQualityStatus connectionQualityStatus, Continuation<? super G0> continuation) {
        return ((c) create(connectionQualityStatus, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.f332879e.c((ConnectionQualityStatus) this.f332887q, "flow.status", new Object[0]);
        return G0.f406611a;
    }
}
