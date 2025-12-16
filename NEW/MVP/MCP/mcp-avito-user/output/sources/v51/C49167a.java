package v51;

import Y61.k;
import kotlin.jvm.internal.s0;

/* compiled from: capitalizeDecapitalize.kt */
@s0
/* renamed from: v51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49167a {
    @k
    public static final String a(@k String str) {
        char cCharAt;
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static final boolean b(int i12, String str) {
        char cCharAt = str.charAt(i12);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    @k
    public static final String c(@k String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }
}
