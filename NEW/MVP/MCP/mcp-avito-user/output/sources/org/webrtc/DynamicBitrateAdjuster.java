package org.webrtc;

/* loaded from: classes9.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i12) {
        double d12 = this.targetFramerateFps;
        if (d12 == 0.0d) {
            return;
        }
        int i13 = this.targetBitrateBps;
        double d13 = (i12 - ((i13 / BITS_PER_BYTE) / d12)) + this.deviationBytes;
        this.deviationBytes = d13;
        this.timeSinceLastAdjustmentMs = (1000.0d / d12) + this.timeSinceLastAdjustmentMs;
        double d14 = i13 / BITS_PER_BYTE;
        double d15 = BITRATE_ADJUSTMENT_SEC * d14;
        double dMin = Math.min(d13, d15);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d15);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d14) {
            int i14 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d14) + 0.5d));
            this.bitrateAdjustmentScaleExp = i14;
            this.bitrateAdjustmentScaleExp = Math.max(i14, -20);
            this.deviationBytes = d14;
        } else {
            double d16 = -d14;
            if (dMax < d16) {
                int i15 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d14) + 0.5d));
                this.bitrateAdjustmentScaleExp = i15;
                this.bitrateAdjustmentScaleExp = Math.min(i15, BITRATE_ADJUSTMENT_STEPS);
                this.deviationBytes = d16;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i12, double d12) {
        int i13 = this.targetBitrateBps;
        if (i13 > 0 && i12 < i13) {
            this.deviationBytes = (this.deviationBytes * i12) / i13;
        }
        super.setTargets(i12, d12);
    }
}
