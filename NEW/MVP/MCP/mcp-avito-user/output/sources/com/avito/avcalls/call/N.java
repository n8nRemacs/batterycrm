package com.avito.avcalls.call;

import com.avito.avcalls.call.RingingState;
import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import uQ0.C48937a;
import uQ0.b;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.IncomingCallSession$sendRinging$1", f = "IncomingCallSession.kt", i = {}, l = {181, 187, 198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class N extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332602q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f332603r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(K k12, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f332603r = k12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new N(this.f332603r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((N) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332602q;
        K k12 = this.f332603r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.avcalls.utils.logs.a aVar = K.f332585x;
            aVar.b("sendRinging", "invitingState=" + k12.b(), "ringingState=" + k12.f332593v);
            RingingState ringingState = k12.f332593v;
            if (ringingState.f332620a != RingingState.Progress.f332622b) {
                aVar.a("sendRinging", "Wrong RingingState", null);
                return G0.f406611a;
            }
            ringingState.f332620a = RingingState.Progress.f332623c;
            k12.f(InvitingState.Ringing.INSTANCE);
            C48937a.Companion companion = C48937a.INSTANCE;
            b.AbstractC12713b.c cVar = new b.AbstractC12713b.c(k12.f332791a, k12.a().getIsVideo(), k12.a().getCallMetaInfo());
            companion.getClass();
            C48937a.Companion.a(cVar);
            A a12 = k12.f332794d;
            String callId = k12.a().getCallId();
            String localUserId = k12.a().getLocalUserId();
            String userId = k12.a().getPeerStatus().getUserId();
            this.f332602q = 1;
            obj = a12.h(callId, localUserId, userId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        com.avito.avcalls.signaling.x xVar = (com.avito.avcalls.signaling.x) obj;
        if (!(xVar instanceof x.c)) {
            if (!(xVar instanceof x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            x.b bVar = (x.b) xVar;
            K.f332585x.a("sendRinging", "can't send Ringing, api error=" + bVar, null);
            TerminateReason terminateReasonFromError = TerminateReason.INSTANCE.fromError(bVar.f333442a);
            this.f332602q = 2;
            if (k12.h(terminateReasonFromError, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        RingingState ringingState2 = k12.f332593v;
        ringingState2.f332620a = RingingState.Progress.f332624d;
        if (ringingState2.f332621b) {
            C43259k.d(k12.f332792b, null, null, new L(k12, null), 3);
        } else {
            com.avito.avcalls.rtc.q qVar = k12.f332798h;
            qVar.F().b("disableAudioSession", new Object[0]);
            com.avito.avcalls.rtc.g gVar = qVar.f333215b;
            gVar.f333141e.a(gVar.f333144h.getF282a(), false);
            gVar.f333153q = true;
            if (k12.f332592u) {
                this.f332602q = 3;
                if (K.k(k12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
