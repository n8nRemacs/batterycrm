package com.avito.avcalls.rtc.peer_connection;

import Y41.l;
import com.avito.avcalls.rtc.connecting.RtcException;
import com.avito.avcalls.rtc.connecting.Sdp;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.N;

/* compiled from: PeerConnection.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: PeerConnection.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/stats/a;", "report", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/stats/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<com.avito.avcalls.stats.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SafeContinuation f333211l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SafeContinuation safeContinuation) {
            super(1);
            this.f333211l = safeContinuation;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.avcalls.stats.a aVar) {
            com.avito.avcalls.stats.a aVar2 = aVar;
            SafeContinuation safeContinuation = this.f333211l;
            if (aVar2 != null) {
                int i12 = Z.f406624c;
                safeContinuation.resumeWith(aVar2);
            } else {
                int i13 = Z.f406624c;
                safeContinuation.resumeWith(new Z.b(new RtcException.CantReceiveStatsReport()));
            }
            return G0.f406611a;
        }
    }

    @Y61.l
    public static final Object a(@Y61.k com.avito.avcalls.rtc.peer_connection.a aVar, @Y61.k Continuation<? super com.avito.avcalls.stats.a> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        aVar.u(new a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Y61.l
    public static final Object b(@Y61.k com.avito.avcalls.rtc.peer_connection.a aVar, @Y61.k Sdp sdp, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        aVar.f(new i(safeContinuation), sdp);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : G0.f406611a;
    }

    @Y61.l
    public static final Object c(@Y61.k com.avito.avcalls.rtc.peer_connection.a aVar, @Y61.k Sdp sdp, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        aVar.s(new j(safeContinuation), sdp);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : G0.f406611a;
    }
}
