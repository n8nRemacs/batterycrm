package I51;

import Y61.k;
import kotlin.Metadata;

/* compiled from: toKotlinCode.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    @k
    public static final String a(@k String str) {
        StringBuilder sb2 = new StringBuilder("\"");
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt == '\b') {
                sb2.append("\\b");
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
        return sb2.toString();
    }
}
