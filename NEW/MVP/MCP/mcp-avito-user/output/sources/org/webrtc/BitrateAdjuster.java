package org.webrtc;

/* loaded from: classes9.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i12);

    void setTargets(int i12, double d12);
}
