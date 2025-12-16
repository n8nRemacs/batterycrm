package androidx.media3.common.util;

import java.util.Locale;

/* compiled from: CodecSpecificDataUtil.java */
@J
/* renamed from: androidx.media3.common.util.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23116g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f47902a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f47903b = {"", "A", "B", "C"};

    public static String a(int i12, boolean z12, int i13, int i14, int[] iArr, int i15) {
        Object[] objArr = {f47903b[i12], Integer.valueOf(i13), Integer.valueOf(i14), Character.valueOf(z12 ? 'H' : 'L'), Integer.valueOf(i15)};
        int i16 = M.f47887a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i17 = 0; i17 < length; i17++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i17])));
        }
        return sb2.toString();
    }
}
