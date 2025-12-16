package org.webrtc;

/* loaded from: classes9.dex */
public class StatsReport {

    /* renamed from: id, reason: collision with root package name */
    public final String f422265id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return AK.c.s(sb2, this.value, "]");
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d12, Value[] valueArr) {
        this.f422265id = str;
        this.type = str2;
        this.timestamp = d12;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f422265id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i12 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i12 >= valueArr.length) {
                return sb2.toString();
            }
            sb2.append(valueArr[i12].toString());
            sb2.append(", ");
            i12++;
        }
    }
}
