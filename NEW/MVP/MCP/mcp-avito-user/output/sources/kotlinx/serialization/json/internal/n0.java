package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* compiled from: StringOps.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String[] f413114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final byte[] f413115b;

    static {
        String[] strArr = new String[93];
        for (int i12 = 0; i12 < 32; i12++) {
            strArr[i12] = "\\u" + b(i12 >> 12) + b(i12 >> 8) + b(i12 >> 4) + b(i12);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f413114a = strArr;
        byte[] bArr = new byte[93];
        for (int i13 = 0; i13 < 32; i13++) {
            bArr[i13] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f413115b = bArr;
    }

    public static final void a(@Y61.k StringBuilder sb2, @Y61.k String str) {
        sb2.append('\"');
        int length = str.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            String[] strArr = f413114a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) str, i12, i13);
                sb2.append(strArr[cCharAt]);
                i12 = i13 + 1;
            }
        }
        if (i12 != 0) {
            sb2.append((CharSequence) str, i12, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final char b(int i12) {
        int i13 = i12 & 15;
        return (char) (i13 < 10 ? i13 + 48 : i13 + 87);
    }
}
