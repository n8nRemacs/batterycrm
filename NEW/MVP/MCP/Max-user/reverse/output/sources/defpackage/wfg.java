package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class wfg {
    public static final wfg a = new wfg();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfg)) {
            return false;
        }
        ((wfg) obj).getClass();
        return Float.compare(0.7f, 0.7f) == 0 && Float.compare(0.75f, 0.75f) == 0;
    }

    public final int hashCode() {
        return az1.v(1) + a9h.b(a9h.b(hf3.b(hf3.b(xrf.k(719, xrf.k(1279, a9h.a(a9h.a(a9h.a((fk6.u0.hashCode() + (fk6.c.hashCode() * 31)) * 31, 31, WorkRequest.MIN_BACKOFF_MILLIS), 31, 25000L), 31, 25000L), 31), 31), 0.7f, 31), 0.75f, 31), 31, true), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackSelectionConfig(minFrameSize=");
        sb.append(fk6.c);
        sb.append(", maxFrameSize=");
        sb.append(fk6.u0);
        sb.append(", minDurationForQualityIncreaseMs=10000, maxDurationForQualityDecreaseMs=25000, minDurationToRetainAfterDiscardMs=25000, maxWidthToDiscard=1279, maxHeightToDiscard=719, bandwidthFraction=0.7, bufferedFractionToLiveEdgeForQualityIncrease=0.75, fastQualityUp=true, allowExceedsCapabilities=false, adaptationCheckpointMode=");
        return ho7.l(sb, "DEFAULT", ")");
    }
}
