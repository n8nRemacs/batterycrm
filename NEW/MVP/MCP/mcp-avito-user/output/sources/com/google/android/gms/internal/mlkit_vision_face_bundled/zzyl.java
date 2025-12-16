package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzyl {

    /* renamed from: a, reason: collision with root package name */
    public static final zzyj f354154a;
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzyg.f354151e && zzyg.f354150d) {
            int i12 = zztx.zza;
        }
        f354154a = new zzyj();
    }

    public static /* bridge */ /* synthetic */ int a(int i12, int i13, byte[] bArr) {
        int i14 = i13 - i12;
        byte b12 = bArr[i12 - 1];
        if (i14 == 0) {
            if (b12 <= -12) {
                return b12;
            }
            return -1;
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

    public static int b(int i12, int i13, String str, byte[] bArr) {
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int length = str.length();
        int i17 = 0;
        while (true) {
            i14 = i12 + i13;
            if (i17 >= length || (i16 = i17 + i12) >= i14 || (cCharAt = str.charAt(i17)) >= 128) {
                break;
            }
            bArr[i16] = (byte) cCharAt;
            i17++;
        }
        if (i17 == length) {
            return i12 + length;
        }
        int i18 = i12 + i17;
        while (i17 < length) {
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 < 128 && i18 < i14) {
                bArr[i18] = (byte) cCharAt2;
                i18++;
            } else if (cCharAt2 < 2048 && i18 <= i14 - 2) {
                bArr[i18] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i18 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i18 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i18 > i14 - 3) {
                    if (i18 > i14 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i15 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i15)))) {
                            throw new zzyk(i17, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i18);
                    }
                    int i19 = i17 + 1;
                    if (i19 != str.length()) {
                        char cCharAt3 = str.charAt(i19);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i22 = i18 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i18 += 4;
                            bArr[i22] = (byte) ((codePoint & 63) | 128);
                            i17 = i19;
                        } else {
                            i17 = i19;
                        }
                    }
                    throw new zzyk(i17 - 1, length);
                }
                bArr[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i18 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i18 += 3;
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
                                throw new zzyk(i13, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i14 + 4294967296L));
    }

    public static boolean d(int i12, int i13, byte[] bArr) {
        return f354154a.a(i12, i13, bArr) == 0;
    }
}
