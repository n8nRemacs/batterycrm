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
@DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$onPushNotification$1", f = "AvCallsImpl.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class l extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331719q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f331720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f331721s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, Continuation<? super l> continuation) {
        super(1, continuation);
        this.f331720r = gVar;
        this.f331721s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new l(this.f331720r, this.f331721s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((l) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331719q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.android.signaling.transport.external.a aVar = this.f331720r.f331704c;
            MessageChannel messageChannel = MessageChannel.f331571b;
            this.f331719q = 1;
            if (aVar.a(this.f331721s, messageChannel, this) == coroutine_suspended) {
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
