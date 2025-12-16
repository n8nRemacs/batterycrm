package m51;

import Y61.k;

/* compiled from: BitEncoding.java */
/* renamed from: m51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43887a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        "true".equals(property);
    }

    @k
    public static byte[] a(@k String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i12 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i13 = 0;
                    while (i13 < length2) {
                        bArr[i12] = (byte) str2.charAt(i13);
                        i13++;
                        i12++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i14 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i15 = 0;
            while (i15 < length4) {
                bArr2[i14] = (byte) str4.charAt(i15);
                i15++;
                i14++;
            }
        }
        for (int i16 = 0; i16 < length3; i16++) {
            bArr2[i16] = (byte) ((bArr2[i16] + 127) & 127);
        }
        int i17 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i17];
        int i18 = 0;
        int i19 = 0;
        for (int i22 = 0; i22 < i17; i22++) {
            int i23 = i18 + 1;
            int i24 = i19 + 1;
            bArr3[i22] = (byte) (((bArr2[i18] & 255) >>> i19) + ((bArr2[i23] & ((1 << i24) - 1)) << (7 - i19)));
            if (i19 == 6) {
                i18 += 2;
                i19 = 0;
            } else {
                i18 = i23;
                i19 = i24;
            }
        }
        return bArr3;
    }
}
