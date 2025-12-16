package com.avito.avcalls.call;

import com.avito.avcalls.signaling.proto.VoipMessage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import uQ0.C48937a;
import uQ0.b;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$onNewMessage$1", f = "CallSession.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36213t extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332820q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ VoipMessage f332821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f332822s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f332823t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36213t(VoipMessage voipMessage, r rVar, long j12, Continuation<? super C36213t> continuation) {
        super(2, continuation);
        this.f332821r = voipMessage;
        this.f332822s = rVar;
        this.f332823t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36213t(this.f332821r, this.f332822s, this.f332823t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36213t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332820q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.utils.logs.a aVar = r.f332790n;
            VoipMessage voipMessage = this.f332821r;
            aVar.b("onNewMessage", voipMessage);
            r rVar = this.f332822s;
            Long l12 = rVar.f332802l;
            long j12 = this.f332823t;
            if (l12 == null || j12 > l12.longValue()) {
                rVar.f332802l = Boxing.boxLong(j12);
                this.f332820q = 1;
                if (rVar.d(voipMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                aVar.c("drop incoming message [" + voipMessage + "], sqn=[" + j12 + "], lastSqn=[" + l12 + ']', "onNewMessage", new Object[0]);
                C48937a.Companion companion = C48937a.INSTANCE;
                b.a.C12712a c12712a = new b.a.C12712a(rVar.f332791a, voipMessage.f333347a.toString());
                companion.getClass();
                C48937a.Companion.a(c12712a);
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
