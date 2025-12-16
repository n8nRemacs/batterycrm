package io.ktor.util;

import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: Base64.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41596g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final int[] f400463a;

    static {
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = C43066x.H((char) i12, 0, 6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        }
        f400463a = iArr;
    }

    /* JADX WARN: Finally extract failed */
    @Y61.k
    public static final String a(@Y61.k String str) throws Throwable {
        String strSubstring;
        int i12;
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            int length = str.length() - 1;
            while (true) {
                if (-1 >= length) {
                    strSubstring = "";
                    break;
                }
                if (str.charAt(length) != '=') {
                    strSubstring = str.substring(0, length + 1);
                    break;
                }
                length--;
            }
            io.ktor.utils.io.core.S.d(c41640m, strSubstring);
            C41641n c41641nY = c41640m.y();
            c41640m = new C41640m(null, 1, null);
            try {
                byte[] bArr = new byte[4];
                while (c41641nY.o() > 0) {
                    int iA2 = io.ktor.utils.io.core.A.a(c41641nY, bArr, 0, 4);
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < 4) {
                        i14 |= ((byte) (((byte) f400463a[bArr[i13] & 255]) & 63)) << ((3 - i15) * 6);
                        i13++;
                        i15++;
                    }
                    int i16 = 4 - iA2;
                    if (i16 <= 2) {
                        while (true) {
                            c41640m.o((byte) ((i14 >> (i12 * 8)) & 255));
                            i12 = i12 != i16 ? i12 - 1 : 2;
                        }
                    }
                }
                C41641n c41641nY2 = c41640m.y();
                byte[] bArrCopyOf = new byte[(int) kotlin.ranges.s.b(kotlin.ranges.s.d(Integer.MAX_VALUE, c41641nY2 != null ? c41641nY2.o() : Math.max(c41641nY2.o(), 16L)), 0)];
                int i17 = 0;
                while (i17 < Integer.MAX_VALUE) {
                    int iA3 = io.ktor.utils.io.core.A.a(c41641nY2, bArrCopyOf, i17, Math.min(Integer.MAX_VALUE, bArrCopyOf.length) - i17);
                    if (iA3 <= 0) {
                        break;
                    }
                    i17 += iA3;
                    if (bArrCopyOf.length == i17) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i17 * 2);
                    }
                }
                if (i17 >= 0) {
                    if (i17 != bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i17);
                    }
                    return new String(bArrCopyOf, 0, bArrCopyOf.length, C43047d.f410589b);
                }
                throw new EOFException("Not enough bytes available to read 0 bytes: " + (0 - i17) + " more required");
            } finally {
                c41640m.close();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Y61.k
    public static final String b(@Y61.k byte[] bArr) {
        int i12;
        int i13;
        int i14 = 3;
        char[] cArr = new char[androidx.compose.ui.graphics.colorspace.e.e(bArr.length, 8, 6, 3)];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = i15 + 3;
            if (i17 > bArr.length) {
                break;
            }
            int i18 = (bArr[i15 + 2] & 255) | ((bArr[i15] & 255) << 16) | ((bArr[i15 + 1] & 255) << 8);
            int i19 = 3;
            while (-1 < i19) {
                cArr[i16] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i18 >> (i19 * 6)) & 63);
                i19--;
                i16++;
            }
            i15 = i17;
        }
        int length = bArr.length - i15;
        if (length == 0) {
            return C43066x.p(cArr, 0, i16);
        }
        if (length == 1) {
            i12 = (bArr[i15] & 255) << 16;
        } else {
            i12 = ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15] & 255) << 16);
        }
        int i22 = ((3 - length) * 8) / 6;
        if (i22 <= 3) {
            while (true) {
                i13 = i16 + 1;
                cArr[i16] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i12 >> (i14 * 6)) & 63);
                if (i14 == i22) {
                    break;
                }
                i14--;
                i16 = i13;
            }
            i16 = i13;
        }
        int i23 = 0;
        while (i23 < i22) {
            cArr[i16] = '=';
            i23++;
            i16++;
        }
        return C43066x.p(cArr, 0, i16);
    }
}
