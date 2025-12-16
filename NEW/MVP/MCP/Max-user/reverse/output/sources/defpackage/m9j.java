package defpackage;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* loaded from: classes.dex */
public abstract class m9j implements SdpObserver {
    public abstract void a();

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }
}
