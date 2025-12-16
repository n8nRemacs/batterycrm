package com.avito.avcalls.android;

import com.avito.avcalls.android.call.models.MessageChannel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AvCallsImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$onExternalSignalingTransportEvent$1", f = "AvCallsImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class k extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331716q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f331717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f331718s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, String str, Continuation<? super k> continuation) {
        super(1, continuation);
        this.f331717r = gVar;
        this.f331718s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new k(this.f331717r, this.f331718s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((k) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331716q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.signaling.transport.external.a aVar = this.f331717r.f331704c;
            MessageChannel messageChannel = MessageChannel.f331572c;
            this.f331716q = 1;
            if (aVar.a(this.f331718s, messageChannel, this) == coroutine_suspended) {
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
