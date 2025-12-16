package com.avito.avcalls.call;

import android.content.pm.PackageManager;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.MediaSenderState;
import com.avito.avcalls.call.models.MediaStatus;
import com.avito.avcalls.call.models.PeerStatus;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.proto.EndpointInfo;
import com.avito.avcalls.signaling.proto.FetchIncomingCallResponse;
import com.avito.avcalls.signaling.proto.OptionsUpdate;
import com.avito.avcalls.signaling.proto.VoipMessage;
import com.avito.avcalls.signaling.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import uQ0.C48937a;
import uQ0.b;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.IncomingCallSession$start$1", f = "IncomingCallSession.kt", i = {}, l = {105, 119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class O extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f332605r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(K k12, Continuation<? super O> continuation) {
        super(2, continuation);
        this.f332605r = k12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new O(this.f332605r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((O) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws PackageManager.NameNotFoundException {
        Object objE;
        MediaStatus mediaStatus;
        Boolean bool;
        Boolean bool2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332604q;
        K k12 = this.f332605r;
        Z1<CallState> z12 = k12.f332803m;
        if (i12 == 0) {
            C42729a0.b(obj);
            K.f332585x.b("start", new Object[0]);
            k12.f332800j = Boxing.boxLong(System.currentTimeMillis());
            if (!kotlin.jvm.internal.L.f(k12.a().getInvitingState(), InvitingState.Allocating.INSTANCE)) {
                throw new IllegalStateException("Check failed.");
            }
            A a12 = k12.f332794d;
            String callId = z12.getValue().getCallId();
            String localUserId = k12.a().getLocalUserId();
            EndpointInfo.Companion companion = EndpointInfo.INSTANCE;
            com.avito.avcalls.utils.b bVarA = k12.f332586o.a();
            companion.getClass();
            EndpointInfo endpointInfoA = EndpointInfo.Companion.a(bVarA);
            this.f332604q = 1;
            objE = a12.e(callId, localUserId, endpointInfoA, this);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            objE = obj;
        }
        com.avito.avcalls.signaling.x xVar = (com.avito.avcalls.signaling.x) objE;
        if (!(xVar instanceof x.c)) {
            if (!(xVar instanceof x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            x.b bVar = (x.b) xVar;
            K.f332585x.c("can't fetch incoming call. api error=" + bVar, "start", new Object[0]);
            TerminateReason terminateReasonFromError = TerminateReason.INSTANCE.fromError(bVar.f333442a);
            this.f332604q = 2;
            if (k12.h(terminateReasonFromError, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        FetchIncomingCallResponse fetchIncomingCallResponse = (FetchIncomingCallResponse) ((x.c) xVar).f333443a;
        K.f332585x.c("incoming call fetched", "start", new Object[0]);
        VoipMessage voipMessage = fetchIncomingCallResponse.f333312b;
        k12.f332588q = voipMessage.f333348b;
        k12.f332589r = voipMessage.f333349c;
        k12.f332592u = voipMessage.f333352f;
        k12.g(k12.f332587p.getF332856g(), TerminateReason.AnswerTimeout.INSTANCE);
        VoipMessage voipMessage2 = fetchIncomingCallResponse.f333312b;
        OptionsUpdate optionsUpdate = voipMessage2.f333353g;
        CameraPosition cameraPositionA = AQ0.b.a(optionsUpdate != null ? optionsUpdate.f333337b : null);
        CallState callStateA = k12.a();
        PeerStatus peerStatus = k12.a().getPeerStatus();
        VoipMessage.MediaSender mediaSender = voipMessage2.f333350d;
        if (mediaSender == null || (mediaStatus = MediaStatus.copy$default(k12.a().getPeerStatus().getMediaStatus(), new MediaSenderState(mediaSender.f333354a, mediaSender.f333355b, false), false, 2, null)) == null) {
            mediaStatus = k12.a().getPeerStatus().getMediaStatus();
        }
        PeerStatus peerStatusCopy$default = PeerStatus.copy$default(peerStatus, fetchIncomingCallResponse.f333313c, null, false, mediaStatus, 6, null);
        InvitingState.Allocated allocated = InvitingState.Allocated.INSTANCE;
        OptionsUpdate optionsUpdate2 = voipMessage2.f333353g;
        boolean videoTxAllowed = (optionsUpdate2 == null || (bool2 = optionsUpdate2.f333336a) == null) ? k12.a().getVideoTxAllowed() : bool2.booleanValue();
        if (cameraPositionA == null) {
            cameraPositionA = k12.a().getDefaultCamera();
        }
        z12.setValue(callStateA.copy((2039 & 1) != 0 ? callStateA.callId : null, (2039 & 2) != 0 ? callStateA.localUserId : null, (2039 & 4) != 0 ? callStateA.direction : null, (2039 & 8) != 0 ? callStateA.invitingState : allocated, (2039 & 16) != 0 ? callStateA.localMediaStatus : null, (2039 & 32) != 0 ? callStateA.peerStatus : peerStatusCopy$default, (2039 & 64) != 0 ? callStateA.isVideo : false, (2039 & 128) != 0 ? callStateA.videoTxAllowed : videoTxAllowed, (2039 & 256) != 0 ? callStateA.defaultCamera : cameraPositionA, (2039 & 512) != 0 ? callStateA.defaultCameraEnabled : (optionsUpdate2 == null || (bool = optionsUpdate2.f333338c) == null) ? k12.a().getDefaultCameraEnabled() : bool.booleanValue(), (2039 & 1024) != 0 ? callStateA.callMetaInfo : fetchIncomingCallResponse.f333314d));
        C48937a.Companion companion2 = C48937a.INSTANCE;
        b.AbstractC12713b.C12714b c12714b = new b.AbstractC12713b.C12714b(k12.f332791a, k12.a().getIsVideo(), k12.a().getCallMetaInfo());
        companion2.getClass();
        C48937a.Companion.a(c12714b);
        k12.f332798h.P(fetchIncomingCallResponse.f333311a);
        return G0.f406611a;
    }
}
