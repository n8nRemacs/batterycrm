package org.webrtc;

/* loaded from: classes9.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i12, double d12) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) ((i12 * DEFAULT_FRAMERATE_FPS) / d12);
    }
}
