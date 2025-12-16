package org.webrtc;

import android.content.Context;

/* loaded from: classes9.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i12, int i13, int i14);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i12, int i13, int i14);

    void stopCapture();
}
