package com.avito.avcalls.call;

import android.content.pm.PackageManager;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.proto.CreateCallResponse;
import com.avito.avcalls.signaling.proto.EndpointInfo;
import com.avito.avcalls.signaling.proto.IceConfig;
import com.avito.avcalls.signaling.proto.OptionsUpdate;
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

/* compiled from: OutgoingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.OutgoingCallSession$create$1", f = "OutgoingCallSession.kt", i = {}, l = {107, 121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class S extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332627q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f332628r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Q q12, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f332628r = q12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new S(this.f332628r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((S) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws PackageManager.NameNotFoundException {
        Object objD;
        Boolean bool;
        Boolean bool2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332627q;
        Q q12 = this.f332628r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Q.f332611r.b("create", new Object[0]);
            q12.f332800j = Boxing.boxLong(System.currentTimeMillis());
            if (!kotlin.jvm.internal.L.f(q12.a().getInvitingState(), InvitingState.Allocating.INSTANCE)) {
                throw new IllegalStateException("Check failed.");
            }
            A a12 = q12.f332794d;
            String callId = q12.a().getCallId();
            String localUserId = q12.a().getLocalUserId();
            String userId = q12.a().getPeerStatus().getUserId();
            boolean isVideo = q12.a().getIsVideo();
            EndpointInfo.Companion companion = EndpointInfo.INSTANCE;
            com.avito.avcalls.utils.b bVarA = q12.f332612o.a();
            companion.getClass();
            EndpointInfo endpointInfoA = EndpointInfo.Companion.a(bVarA);
            this.f332627q = 1;
            objD = a12.d(callId, localUserId, userId, isVideo, endpointInfoA, q12.f332613p, this);
            if (objD == coroutine_suspended) {
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
            objD = obj;
        }
        com.avito.avcalls.signaling.x xVar = (com.avito.avcalls.signaling.x) objD;
        if (!(xVar instanceof x.c)) {
            if (!(xVar instanceof x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            x.b bVar = (x.b) xVar;
            Q.f332611r.a("create", "can't create call, api error=" + bVar, null);
            TerminateReason terminateReasonFromError = TerminateReason.INSTANCE.fromError(bVar.f333442a);
            this.f332627q = 2;
            if (q12.h(terminateReasonFromError, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        CreateCallResponse createCallResponse = (CreateCallResponse) ((x.c) xVar).f333443a;
        Q.f332611r.c("ice config received iceConfig=" + createCallResponse.f333299a, "create", new Object[0]);
        q12.g(q12.f332614q.getF332853d(), TerminateReason.InternalError.INSTANCE);
        Z1<CallState> z12 = q12.f332803m;
        CallState value = z12.getValue();
        InvitingState.Allocated allocated = InvitingState.Allocated.INSTANCE;
        OptionsUpdate optionsUpdate = createCallResponse.f333300b;
        boolean videoTxAllowed = (optionsUpdate == null || (bool2 = optionsUpdate.f333336a) == null) ? q12.a().getVideoTxAllowed() : bool2.booleanValue();
        CameraPosition cameraPositionA = AQ0.b.a(optionsUpdate != null ? optionsUpdate.f333337b : null);
        if (cameraPositionA == null) {
            cameraPositionA = q12.a().getDefaultCamera();
        }
        z12.setValue(value.copy((2039 & 1) != 0 ? value.callId : null, (2039 & 2) != 0 ? value.localUserId : null, (2039 & 4) != 0 ? value.direction : null, (2039 & 8) != 0 ? value.invitingState : allocated, (2039 & 16) != 0 ? value.localMediaStatus : null, (2039 & 32) != 0 ? value.peerStatus : null, (2039 & 64) != 0 ? value.isVideo : false, (2039 & 128) != 0 ? value.videoTxAllowed : videoTxAllowed, (2039 & 256) != 0 ? value.defaultCamera : cameraPositionA, (2039 & 512) != 0 ? value.defaultCameraEnabled : (optionsUpdate == null || (bool = optionsUpdate.f333338c) == null) ? q12.a().getDefaultCameraEnabled() : bool.booleanValue(), (2039 & 1024) != 0 ? value.callMetaInfo : createCallResponse.f333301c));
        IceConfig iceConfig = createCallResponse.f333299a;
        if (iceConfig != null) {
            q12.f332798h.P(iceConfig);
        }
        return G0.f406611a;
    }
}
