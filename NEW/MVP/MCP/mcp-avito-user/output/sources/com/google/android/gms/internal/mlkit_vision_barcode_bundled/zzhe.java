package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzhe {

    /* renamed from: a, reason: collision with root package name */
    public static final zzhc f352550a;

    static {
        if (zzgz.f352547e && zzgz.f352546d) {
            int i12 = zzcn.zza;
        }
        f352550a = new zzhc();
    }

    public static int a(int i12, int i13, byte[] bArr) {
        byte b12 = bArr[i12 - 1];
        int i14 = i13 - i12;
        if (i14 != 0) {
            if (i14 == 1) {
                return e(b12, bArr[i12]);
            }
            if (i14 != 2) {
                throw new AssertionError();
            }
            byte b13 = bArr[i12];
            byte b14 = bArr[i12 + 1];
            if (b12 <= -12 && b13 <= -65 && b14 <= -65) {
                return (b14 << 16) ^ ((b13 << 8) ^ b12);
            }
        } else if (b12 <= -12) {
            return b12;
        }
        return -1;
    }

    public static int b(int i12, int i13, String str, byte[] bArr) {
        int i14;
        int i15;
        char cCharAt;
        int length = str.length();
        int i16 = i13 + i12;
        int i17 = 0;
        while (i17 < length && (i15 = i17 + i12) < i16 && (cCharAt = str.charAt(i17)) < 128) {
            bArr[i15] = (byte) cCharAt;
            i17++;
        }
        if (i17 == length) {
            return i12 + length;
        }
        int i18 = i12 + i17;
        while (i17 < length) {
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 < 128 && i18 < i16) {
                bArr[i18] = (byte) cCharAt2;
                i18++;
            } else if (cCharAt2 < 2048 && i18 <= i16 - 2) {
                int i19 = i18 + 1;
                bArr[i18] = (byte) ((cCharAt2 >>> 6) | 960);
                i18 += 2;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i18 > i16 - 3) {
                    if (i18 > i16 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                            throw new zzhd(i17, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i18);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i22 = i17 + 1;
                    if (i22 != str.length()) {
                        char cCharAt3 = str.charAt(i22);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i23 = i18 + 3;
                            bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i18 += 4;
                            bArr[i23] = (byte) ((codePoint & 63) | 128);
                            i17 = i22;
                        } else {
                            i17 = i22;
                        }
                    }
                    throw new zzhd(i17 - 1, length);
                }
                bArr[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i24 = i18 + 2;
                bArr[i18 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i18 += 3;
                bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
            }
            i17++;
        }
        return i18;
    }

    public static int c(String str) {
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length && str.charAt(i13) < 128) {
            i13++;
        }
        int i14 = length;
        while (true) {
            if (i13 >= length) {
                break;
            }
            char cCharAt = str.charAt(i13);
            if (cCharAt < 2048) {
                i14 += (127 - cCharAt) >>> 31;
                i13++;
            } else {
                int length2 = str.length();
                while (i13 < length2) {
                    char cCharAt2 = str.charAt(i13);
                    if (cCharAt2 < 2048) {
                        i12 += (127 - cCharAt2) >>> 31;
                    } else {
                        i12 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i13) < 65536) {
                                throw new zzhd(i13, length2);
                            }
                            i13++;
                        }
                    }
                    i13++;
                }
                i14 += i12;
            }
        }
        if (i14 >= length) {
            return i14;
        }
        StringBuilder sbQ = e.q(54, "UTF-8 length does not fit in int: ");
        sbQ.append(i14 + 4294967296L);
        throw new IllegalArgumentException(sbQ.toString());
    }

    public static boolean d(int i12, int i13, byte[] bArr) {
        return f352550a.a(0, i12, i13, bArr) == 0;
    }

    public static int e(int i12, int i13) {
        if (i12 > -12 || i13 > -65) {
            return -1;
        }
        return i12 ^ (i13 << 8);
    }
}
