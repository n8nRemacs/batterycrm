package com.google.protobuf.nano.ym;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class InternalNano {
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e12) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e12);
        }
    }

    public static byte[] copyFromUtf8(String str) {
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return (dArr == null || dArr.length == 0) ? dArr2 == null || dArr2.length == 0 : Arrays.equals(dArr, dArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(dArr);
    }

    public static String stringDefaultValue(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e12);
        }
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length;
        int i12;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            i12 = 0;
        } else {
            length = objArr2.length;
            i12 = 0;
        }
        int i13 = i12;
        while (true) {
            if (i12 >= length2 || objArr[i12] != null) {
                while (i13 < length && objArr2[i13] == null) {
                    i13++;
                }
                boolean z12 = i12 >= length2;
                boolean z13 = i13 >= length;
                if (z12 && z13) {
                    return true;
                }
                if (z12 != z13 || !objArr[i12].equals(objArr2[i13])) {
                    return false;
                }
                i12++;
                i13++;
            } else {
                i12++;
            }
        }
    }

    public static int hashCode(Object[] objArr) {
        int length;
        int iHashCode;
        if (objArr == null) {
            length = 0;
            iHashCode = 0;
        } else {
            length = objArr.length;
            iHashCode = 0;
        }
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = objArr[i12];
            if (obj != null) {
                iHashCode = obj.hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return (zArr == null || zArr.length == 0) ? zArr2 == null || zArr2.length == 0 : Arrays.equals(zArr, zArr2);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int i12;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            i12 = 0;
        } else {
            length = bArr2.length;
            i12 = 0;
        }
        int i13 = i12;
        while (true) {
            if (i12 >= length2 || bArr[i12] != null) {
                while (i13 < length && bArr2[i13] == null) {
                    i13++;
                }
                boolean z12 = i12 >= length2;
                boolean z13 = i13 >= length;
                if (z12 && z13) {
                    return true;
                }
                if (z12 != z13 || !Arrays.equals(bArr[i12], bArr2[i13])) {
                    return false;
                }
                i12++;
                i13++;
            } else {
                i12++;
            }
        }
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int iHashCode;
        if (bArr == null) {
            length = 0;
            iHashCode = 0;
        } else {
            length = bArr.length;
            iHashCode = 0;
        }
        for (int i12 = 0; i12 < length; i12++) {
            byte[] bArr2 = bArr[i12];
            if (bArr2 != null) {
                iHashCode = Arrays.hashCode(bArr2) + (iHashCode * 31);
            }
        }
        return iHashCode;
    }
}
