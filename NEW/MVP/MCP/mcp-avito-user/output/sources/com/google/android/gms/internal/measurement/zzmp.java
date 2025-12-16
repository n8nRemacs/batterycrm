package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.selection.C21030p;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzmp {

    /* renamed from: a, reason: collision with root package name */
    public static final zzmt f351004a;

    static {
        if (zzmo.f351000e) {
            boolean z12 = zzmo.f350999d;
        }
        f351004a = new zzmt();
    }

    public static int a(int i12, int i13, String str, byte[] bArr) {
        int i14;
        int i15;
        char cCharAt;
        f351004a.getClass();
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
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i18 > i16 - 3) {
                    if (i18 > i16 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                            throw new zzms(i17, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i18);
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
                    throw new zzms(i17 - 1, length);
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

    public static /* synthetic */ int b(int i12, int i13, byte[] bArr) {
        byte b12 = bArr[i12 - 1];
        int i14 = i13 - i12;
        if (i14 == 0) {
            if (b12 > -12) {
                return -1;
            }
            return b12;
        }
        if (i14 == 1) {
            byte b13 = bArr[i12];
            if (b12 > -12 || b13 > -65) {
                return -1;
            }
            return (b13 << 8) ^ b12;
        }
        if (i14 != 2) {
            throw new AssertionError();
        }
        byte b14 = bArr[i12];
        byte b15 = bArr[i12 + 1];
        if (b12 > -12 || b14 > -65 || b15 > -65) {
            return -1;
        }
        return (b15 << 16) ^ ((b14 << 8) ^ b12);
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i13) < 65536) {
                                throw new zzms(i13, length2);
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
        throw new IllegalArgumentException(C21030p.a(i14 + 4294967296L, "UTF-8 length does not fit in int: "));
    }

    public static String d(int i12, int i13, byte[] bArr) throws zzjq {
        f351004a.getClass();
        if ((i12 | i13 | ((bArr.length - i12) - i13)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        int i14 = i12 + i13;
        char[] cArr = new char[i13];
        int i15 = 0;
        while (i12 < i14) {
            byte b12 = bArr[i12];
            if (b12 < 0) {
                break;
            }
            i12++;
            cArr[i15] = (char) b12;
            i15++;
        }
        while (i12 < i14) {
            int i16 = i12 + 1;
            byte b13 = bArr[i12];
            if (b13 >= 0) {
                int i17 = i15 + 1;
                cArr[i15] = (char) b13;
                while (i16 < i14) {
                    byte b14 = bArr[i16];
                    if (b14 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i17] = (char) b14;
                    i17++;
                }
                i15 = i17;
                i12 = i16;
            } else if (b13 < -32) {
                if (i16 >= i14) {
                    throw zzjq.b();
                }
                i12 += 2;
                byte b15 = bArr[i16];
                int i18 = i15 + 1;
                if (b13 < -62 || zzmr.a(b15)) {
                    throw zzjq.b();
                }
                cArr[i15] = (char) ((b15 & 63) | ((b13 & 31) << 6));
                i15 = i18;
            } else {
                if (b13 >= -16) {
                    if (i16 >= i14 - 2) {
                        throw zzjq.b();
                    }
                    byte b16 = bArr[i16];
                    int i19 = i12 + 3;
                    byte b17 = bArr[i12 + 2];
                    i12 += 4;
                    byte b18 = bArr[i19];
                    int i22 = i15 + 1;
                    if (!zzmr.a(b16)) {
                        if ((((b16 + 112) + (b13 << 28)) >> 30) == 0 && !zzmr.a(b17) && !zzmr.a(b18)) {
                            int i23 = ((b16 & 63) << 12) | ((b13 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                            cArr[i15] = (char) ((i23 >>> 10) + 55232);
                            cArr[i22] = (char) ((i23 & 1023) + 56320);
                            i15 += 2;
                        }
                    }
                    throw zzjq.b();
                }
                if (i16 >= i14 - 1) {
                    throw zzjq.b();
                }
                int i24 = i12 + 2;
                byte b19 = bArr[i16];
                i12 += 3;
                byte b22 = bArr[i24];
                int i25 = i15 + 1;
                if (zzmr.a(b19) || ((b13 == -32 && b19 < -96) || ((b13 == -19 && b19 >= -96) || zzmr.a(b22)))) {
                    throw zzjq.b();
                }
                cArr[i15] = (char) (((b19 & 63) << 6) | ((b13 & 15) << 12) | (b22 & 63));
                i15 = i25;
            }
        }
        return new String(cArr, 0, i15);
    }

    public static boolean e(int i12, int i13, byte[] bArr) {
        return f351004a.a(i12, i13, bArr) == 0;
    }
}
