package com.avito.avcalls.android.rtc;

import kotlin.Metadata;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* compiled from: SdpObserverImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/B;", "Lorg/webrtc/SdpObserver;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class B implements SdpObserver {
    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(@Y61.l String str) {
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(@Y61.l SessionDescription sessionDescription) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(@Y61.l String str) {
    }
}
