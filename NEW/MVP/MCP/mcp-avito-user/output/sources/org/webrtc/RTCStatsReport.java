package org.webrtc;

import java.util.Map;

/* loaded from: classes9.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j12, Map<String, RTCStats> map) {
        this.timestampUs = j12;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j12, Map map) {
        return new RTCStatsReport(j12, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ timestampUs: ");
        sb2.append(this.timestampUs);
        sb2.append(", stats: [\n");
        boolean z12 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z12) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z12 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}
