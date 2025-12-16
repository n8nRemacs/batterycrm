package com.avito.avcalls.rtc;

import com.avito.avcalls.rtc.connecting.IceCandidate;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PCSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/avcalls/rtc/connecting/IceCandidate;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionImpl$7", f = "PCSession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements Y41.p<List<? extends IceCandidate>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f333120q;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(2, continuation);
        eVar.f333120q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(List<? extends IceCandidate> list, Continuation<? super G0> continuation) {
        return ((e) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = (List) this.f333120q;
        g.f333136t.b("flow.iceCandidatesFlow.emit", "iceCandidates=" + list);
        return G0.f406611a;
    }
}
