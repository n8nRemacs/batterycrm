package org.webrtc;

import androidx.compose.foundation.H;
import java.util.Map;

/* loaded from: classes9.dex */
public class RTCStats {

    /* renamed from: id, reason: collision with root package name */
    private final String f422263id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j12, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j12;
        this.type = str;
        this.f422263id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb2.append(obj);
                return;
            }
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb2.append('[');
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (i12 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i12]);
        }
        sb2.append(']');
    }

    @CalledByNative
    public static RTCStats create(long j12, String str, String str2, Map map) {
        return new RTCStats(j12, str, str2, map);
    }

    public String getId() {
        return this.f422263id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sbR = H.r("{ timestampUs: ");
        sbR.append(this.timestampUs);
        sbR.append(", type: ");
        sbR.append(this.type);
        sbR.append(", id: ");
        sbR.append(this.f422263id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sbR.append(", ");
            sbR.append(entry.getKey());
            sbR.append(": ");
            appendValue(sbR, entry.getValue());
        }
        sbR.append(" }");
        return sbR.toString();
    }
}
