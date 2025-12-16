package okhttp3.internal;

import Y61.k;
import Y61.l;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okio.C44802l;

/* compiled from: hostnames.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", AddressParameter.TYPE, "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (L.g(cCharAt, 31) <= 0 || L.g(cCharAt, 127) >= 0 || C43066x.H(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i12, int i13, byte[] bArr, int i14) {
        int i15 = i14;
        while (i12 < i13) {
            if (i15 == bArr.length) {
                return false;
            }
            if (i15 != i14) {
                if (str.charAt(i12) != '.') {
                    return false;
                }
                i12++;
            }
            int i16 = i12;
            int i17 = 0;
            while (i16 < i13) {
                char cCharAt = str.charAt(i16);
                if (L.g(cCharAt, 48) < 0 || L.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i17 == 0 && i12 != i16) || (i17 = ((i17 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i16++;
            }
            if (i16 - i12 == 0) {
                return false;
            }
            bArr[i15] = (byte) i17;
            i15++;
            i12 = i16;
        }
        return i15 == i14 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r4 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r5 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
    
        r11 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r11, r11);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r12 >= r13) goto L77
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L26
            java.lang.String r9 = "::"
            boolean r9 = kotlin.text.C43066x.g0(r12, r11, r9, r2)
            if (r9 == 0) goto L26
            if (r5 == r3) goto L1e
            return r7
        L1e:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L24
            goto L77
        L24:
            r6 = r8
            goto L49
        L26:
            if (r4 == 0) goto L32
            java.lang.String r8 = ":"
            boolean r8 = kotlin.text.C43066x.g0(r12, r11, r8, r2)
            if (r8 == 0) goto L34
            int r12 = r12 + 1
        L32:
            r6 = r12
            goto L49
        L34:
            java.lang.String r8 = "."
            boolean r12 = kotlin.text.C43066x.g0(r12, r11, r8, r2)
            if (r12 == 0) goto L48
            int r12 = r4 + (-2)
            boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L45
            return r7
        L45:
            int r4 = r4 + 2
            goto L77
        L48:
            return r7
        L49:
            r8 = r2
            r12 = r6
        L4b:
            if (r12 >= r13) goto L5d
            char r9 = r11.charAt(r12)
            int r9 = okhttp3.internal.Util.parseHexDigit(r9)
            if (r9 == r3) goto L5d
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4b
        L5d:
            int r9 = r12 - r6
            if (r9 == 0) goto L76
            r10 = 4
            if (r9 <= r10) goto L65
            goto L76
        L65:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L76:
            return r7
        L77:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
            return r7
        L7c:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < bArr.length) {
            int i16 = i14;
            while (i16 < 16 && bArr[i16] == 0 && bArr[i16 + 1] == 0) {
                i16 += 2;
            }
            int i17 = i16 - i14;
            if (i17 > i15 && i17 >= 4) {
                i12 = i14;
                i15 = i17;
            }
            i14 = i16 + 2;
        }
        C44802l c44802l = new C44802l();
        while (i13 < bArr.length) {
            if (i13 == i12) {
                c44802l.D(58);
                i13 += i15;
                if (i13 == 16) {
                    c44802l.D(58);
                }
            } else {
                if (i13 > 0) {
                    c44802l.D(58);
                }
                c44802l.G((Util.and(bArr[i13], 255) << 8) | Util.and(bArr[i13 + 1], 255));
                i13 += 2;
            }
        }
        return c44802l.u();
    }

    @l
    public static final String toCanonicalHost(@k String str) {
        if (!C43066x.q(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (C43066x.h0(str, "[", false) && C43066x.z(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError(C22491k0.a('\'', "Invalid IPv6 address: '", str));
    }
}
