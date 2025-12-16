package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Utf8.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes7.dex */
public final class k0 {
    public static long a(String str) {
        int i12;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(length, "endIndex > string.length: ", " > ");
            sbJ.append(str.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        long j12 = 0;
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < 128) {
                j12++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i14 = i13 + 1;
                    char cCharAt2 = i14 < length ? str.charAt(i14) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j12++;
                        i13 = i14;
                    } else {
                        j12 += 4;
                        i13 += 2;
                    }
                }
                j12 += i12;
            }
            i13++;
        }
        return j12;
    }
}
