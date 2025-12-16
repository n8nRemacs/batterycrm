package defpackage;

import android.graphics.Matrix;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class mei {
    public static final float[] a = new float[9];

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        if (r7 == 16) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
    
        if (r8 != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mei.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static float b(Matrix matrix) {
        double dPow = Math.pow(c(matrix, 0), 2.0d);
        matrix.getValues(a);
        return (float) Math.sqrt(Math.pow(r4[3], 2.0d) + dPow);
    }

    public static float c(Matrix matrix, int i) {
        float[] fArr = a;
        matrix.getValues(fArr);
        return fArr[i];
    }

    public static void d(String str, cm6 cm6Var) {
        bfb bfbVar = new bfb(cm6Var);
        bfbVar.setDaemon(true);
        if (str != null) {
            bfbVar.setName(str);
        }
        bfbVar.start();
    }

    public static final String e(String str) {
        int i = 0;
        int i2 = -1;
        if (!vmf.s(str, ":", false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (fni.b(cCharAt, 31) <= 0 || fni.b(cCharAt, 127) >= 0 || vmf.C(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (dnf.r(str, "[", false) && str.endsWith("]")) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        qu0 qu0Var = new qu0();
        while (i < address.length) {
            if (i == i2) {
                qu0Var.q0(58);
                i += i5;
                if (i == 16) {
                    qu0Var.q0(58);
                }
            } else {
                if (i > 0) {
                    qu0Var.q0(58);
                }
                byte b = address[i];
                byte[] bArr = yxg.a;
                qu0Var.s0(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return qu0Var.k0();
    }
}
