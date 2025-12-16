package org.webrtc;

/* loaded from: classes9.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z12);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
