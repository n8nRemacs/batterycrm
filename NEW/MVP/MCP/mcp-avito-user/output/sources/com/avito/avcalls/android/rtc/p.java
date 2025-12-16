package com.avito.avcalls.android.rtc;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import org.webrtc.PeerConnection;

/* compiled from: PeerConnection.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/p;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PeerConnection f331969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final wQ0.e f331970c;

    public p(@Y61.k String str, @Y61.k PeerConnection peerConnection, @Y61.k wQ0.e eVar) {
        this.f331968a = str;
        this.f331969b = peerConnection;
        this.f331970c = eVar;
        eVar.b(this);
    }

    @Y61.l
    public final Object a(@Y61.k Sdp sdp, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        this.f331969b.setLocalDescription(new t(safeContinuation), zQ0.g.a(sdp));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : G0.f406611a;
    }

    @Y61.l
    public final Object b(@Y61.k Sdp sdp, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        this.f331969b.setRemoteDescription(new u(safeContinuation), zQ0.g.a(sdp));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : G0.f406611a;
    }
}
