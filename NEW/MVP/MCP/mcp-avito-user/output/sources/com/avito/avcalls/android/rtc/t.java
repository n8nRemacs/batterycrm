package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.rtc.RtcException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;

/* compiled from: PeerConnection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/t;", "Lcom/avito/avcalls/android/rtc/B;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t extends B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f331974a;

    public t(SafeContinuation safeContinuation) {
        this.f331974a = safeContinuation;
    }

    @Override // com.avito.avcalls.android.rtc.B, org.webrtc.SdpObserver
    public final void onSetFailure(@Y61.l String str) {
        int i12 = Z.f406624c;
        this.f331974a.resumeWith(new Z.b(new RtcException.CantSetLocalDescriptionException(str, null)));
    }

    @Override // com.avito.avcalls.android.rtc.B, org.webrtc.SdpObserver
    public final void onSetSuccess() {
        int i12 = Z.f406624c;
        this.f331974a.resumeWith(G0.f406611a);
    }
}
