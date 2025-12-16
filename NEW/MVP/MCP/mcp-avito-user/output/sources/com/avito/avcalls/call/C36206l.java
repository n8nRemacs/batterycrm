package com.avito.avcalls.call;

import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.MediaStatus;
import com.avito.avcalls.call.models.PeerStatus;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$1", f = "CallSession.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36206l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332694q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f332695r;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isConnected", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.l$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f332696b;

        public a(r rVar) {
            this.f332696b = rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            r.f332790n.c(Boxing.boxBoolean(zBooleanValue), "flow.pcSession.isConnectedFlow", new Object[0]);
            r rVar = this.f332696b;
            CallState callStateA = rVar.a();
            rVar.e(callStateA.copy((2039 & 1) != 0 ? callStateA.callId : null, (2039 & 2) != 0 ? callStateA.localUserId : null, (2039 & 4) != 0 ? callStateA.direction : null, (2039 & 8) != 0 ? callStateA.invitingState : null, (2039 & 16) != 0 ? callStateA.localMediaStatus : MediaStatus.copy$default(callStateA.getLocalMediaStatus(), null, zBooleanValue, 1, null), (2039 & 32) != 0 ? callStateA.peerStatus : PeerStatus.copy$default(callStateA.getPeerStatus(), null, null, false, MediaStatus.copy$default(callStateA.getPeerStatus().getMediaStatus(), null, zBooleanValue, 1, null), 7, null), (2039 & 64) != 0 ? callStateA.isVideo : false, (2039 & 128) != 0 ? callStateA.videoTxAllowed : false, (2039 & 256) != 0 ? callStateA.defaultCamera : null, (2039 & 512) != 0 ? callStateA.defaultCameraEnabled : false, (2039 & 1024) != 0 ? callStateA.callMetaInfo : null));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36206l(r rVar, Continuation<? super C36206l> continuation) {
        super(2, continuation);
        this.f332695r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36206l(this.f332695r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36206l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332694q;
        if (i12 == 0) {
            C42729a0.b(obj);
            r rVar = this.f332695r;
            n2<Boolean> n2Var = rVar.f332798h.f333215b.f333155s;
            a aVar = new a(rVar);
            this.f332694q = 1;
            if (n2Var.collect(aVar, this) == coroutine_suspended) {
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
