package org.webrtc;

import defpackage.az1;
import java.util.Map;

/* loaded from: classes2.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            appendValue(sb, objArr[i]);
        }
        sb.append(']');
    }

    @CalledByNative
    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
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
        StringBuilder sbM = az1.m("{ timestampUs: ");
        sbM.append(this.timestampUs);
        sbM.append(", type: ");
        sbM.append(this.type);
        sbM.append(", id: ");
        sbM.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sbM.append(", ");
            sbM.append(entry.getKey());
            sbM.append(": ");
            appendValue(sbM, entry.getValue());
        }
        sbM.append(" }");
        return sbM.toString();
    }
}
