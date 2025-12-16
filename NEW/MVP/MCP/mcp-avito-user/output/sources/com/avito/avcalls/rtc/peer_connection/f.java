package com.avito.avcalls.rtc.peer_connection;

import Y61.l;
import com.avito.avcalls.rtc.connecting.RtcException;
import com.avito.avcalls.rtc.connecting.Sdp;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;

/* compiled from: PeerConnection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/f;", "Lcom/avito/avcalls/rtc/connecting/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.avcalls.rtc.connecting.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f333209a;

    public f(SafeContinuation safeContinuation) {
        this.f333209a = safeContinuation;
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void m(@Y61.k Sdp sdp) {
        int i12 = Z.f406624c;
        this.f333209a.resumeWith(sdp);
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onCreateFailure(@l String str) {
        int i12 = Z.f406624c;
        this.f333209a.resumeWith(new Z.b(new RtcException.CantCreateAnswerException(str, null)));
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onSetSuccess() {
    }

    @Override // com.avito.avcalls.rtc.connecting.c
    public final void onSetFailure(@l String str) {
    }
}
