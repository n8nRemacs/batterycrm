package com.yandex.mobile.ads.impl;

import androidx.compose.ui.platform.C22491k0;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.text.C43066x;
import okio.C44802l;

/* loaded from: classes8.dex */
public final class wz {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a2 A[EDGE_INSN: B:85:0x00a2->B:54:0x00a2 BREAK  A[LOOP:2: B:25:0x004c->B:50:0x008e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wz.a(int, int, java.lang.String):java.net.InetAddress");
    }

    @Y61.l
    public static final String a(@Y61.k String str) {
        InetAddress inetAddressA;
        int i12 = 0;
        int i13 = -1;
        if (C43066x.q(str, ":", false)) {
            if (C43066x.h0(str, "[", false) && C43066x.z(str, "]", false)) {
                inetAddressA = a(1, str.length() - 1, str);
            } else {
                inetAddressA = a(0, str.length(), str);
            }
            if (inetAddressA == null) {
                return null;
            }
            byte[] address = inetAddressA.getAddress();
            if (address.length == 16) {
                int i14 = 0;
                int i15 = 0;
                while (i14 < address.length) {
                    int i16 = i14;
                    while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                        i16 += 2;
                    }
                    int i17 = i16 - i14;
                    if (i17 > i15 && i17 >= 4) {
                        i13 = i14;
                        i15 = i17;
                    }
                    i14 = i16 + 2;
                }
                C44802l c44802l = new C44802l();
                while (i12 < address.length) {
                    if (i12 == i13) {
                        c44802l.D(58);
                        i12 += i15;
                        if (i12 == 16) {
                            c44802l.D(58);
                        }
                    } else {
                        if (i12 > 0) {
                            c44802l.D(58);
                        }
                        c44802l.G((qc1.a(address[i12]) << 8) | qc1.a(address[i12 + 1]));
                        i12 += 2;
                    }
                }
                return c44802l.u();
            }
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError(C22491k0.a('\'', "Invalid IPv6 address: '", str));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            for (int i18 = 0; i18 < length; i18++) {
                char cCharAt = lowerCase.charAt(i18);
                if (kotlin.jvm.internal.L.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.L.g(cCharAt, 127) >= 0 || C43066x.H(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                    return null;
                }
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
