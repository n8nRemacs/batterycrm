package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class qs8 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs8)) {
            return false;
        }
        ((qs8) obj).getClass();
        return Double.compare(120.0d, 120.0d) == 0 && Double.compare(0.04d, 0.04d) == 0 && Double.compare(0.04d, 0.04d) == 0 && Double.compare(1000.0d, 1000.0d) == 0 && Double.compare(700.0d, 700.0d) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fui.b(fui.b(fui.b(iti.a(HttpStatus.SC_MULTIPLE_CHOICES, iti.a(500, wsf.a(wsf.a(wsf.a(wsf.a(Double.hashCode(120.0d) * 31, 0.04d), 0.04d), 1000.0d), 700.0d))), true), false), false);
    }

    public final String toString() {
        return "BadNetworkCondition(rttThreshold=120.0, lostPacketsLimitForRttBelowLowBound=0.04, lostPacketsLimitForRttAboveLowBound=0.04, rttEnterLevel2Mode=1000.0, rttLeaveLevel2Mode=700.0, videoBitrateLevel1K=500, videoBitrateLevel2K=300, preferHardwareVPXEncoder=true, limitFrameSize=false, limitBitrate=false, setTemporalLayers=true)";
    }
}
