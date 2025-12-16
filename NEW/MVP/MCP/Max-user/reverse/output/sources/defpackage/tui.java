package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class tui {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tui.a(java.lang.String):byte[]");
    }

    public static byte[] b(int i, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        byte[] bArr2 = (i & 8) == 0 ? ri0.b : ri0.c;
        int i3 = z2 ? 19 : -1;
        int i4 = (length / 3) * 4;
        if (!z) {
            int i5 = length % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (length % 3 > 0) {
            i4 += 4;
        }
        if (z2 && length > 0) {
            i4 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i4];
        int i6 = i3;
        int i7 = 0;
        while (true) {
            int i8 = i2 + 3;
            if (i8 > length) {
                break;
            }
            int i9 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i7] = bArr2[(i9 >> 18) & 63];
            bArr3[i7 + 1] = bArr2[(i9 >> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            int i10 = i7 + 4;
            i6--;
            if (i6 == 0) {
                i7 += 5;
                bArr3[i10] = 10;
                i6 = 19;
            } else {
                i7 = i10;
            }
            i2 = i8;
        }
        if (i2 == length - 1) {
            int i11 = (bArr[i2] & 255) << 4;
            bArr3[i7] = bArr2[(i11 >> 6) & 63];
            int i12 = i7 + 2;
            bArr3[i7 + 1] = bArr2[i11 & 63];
            if (z) {
                bArr3[i12] = 61;
                i12 = i7 + 4;
                bArr3[i7 + 3] = 61;
            }
            if (z2) {
                bArr3[i12] = 10;
                return bArr3;
            }
        } else if (i2 == length - 2) {
            int i13 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i7] = bArr2[(i13 >> 12) & 63];
            bArr3[i7 + 1] = bArr2[(i13 >> 6) & 63];
            int i14 = i7 + 3;
            bArr3[i7 + 2] = bArr2[i13 & 63];
            if (z) {
                bArr3[i14] = 61;
                i14 = i7 + 4;
            }
            if (z2) {
                bArr3[i14] = 10;
                return bArr3;
            }
        } else if (z2 && i7 > 0 && i6 != 19) {
            bArr3[i7] = 10;
        }
        return bArr3;
    }

    public static void c(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void d(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static String e(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strJ;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strJ = "null";
            } else {
                try {
                    strJ = obj.toString();
                } catch (Exception e) {
                    String strK = u45.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e);
                    strJ = wy1.j("<", strK, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strJ;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
