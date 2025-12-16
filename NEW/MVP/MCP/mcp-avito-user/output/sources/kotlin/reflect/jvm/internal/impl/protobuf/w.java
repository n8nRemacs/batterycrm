package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: Utf8.java */
/* loaded from: classes8.dex */
final class w {
    public static int a(int i12, int i13) {
        if (i12 > -12 || i13 > -65) {
            return -1;
        }
        return i12 ^ (i13 << 8);
    }

    public static int b(byte[] bArr, int i12, int i13) {
        byte b12 = bArr[i12 - 1];
        int i14 = i13 - i12;
        if (i14 == 0) {
            if (b12 > -12) {
                return -1;
            }
            return b12;
        }
        if (i14 == 1) {
            return a(b12, bArr[i12]);
        }
        if (i14 != 2) {
            throw new AssertionError();
        }
        byte b13 = bArr[i12];
        byte b14 = bArr[i12 + 1];
        if (b12 > -12 || b13 > -65 || b14 > -65) {
            return -1;
        }
        return ((b13 << 8) ^ b12) ^ (b14 << 16);
    }

    public static int c(byte[] bArr, int i12, int i13) {
        while (i12 < i13 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i13) {
            return 0;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            byte b12 = bArr[i12];
            if (b12 < 0) {
                if (b12 < -32) {
                    if (i14 >= i13) {
                        return b12;
                    }
                    if (b12 >= -62) {
                        i12 += 2;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                if (b12 < -16) {
                    if (i14 >= i13 - 1) {
                        return b(bArr, i14, i13);
                    }
                    int i15 = i12 + 2;
                    byte b13 = bArr[i14];
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i12 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (i14 >= i13 - 2) {
                    return b(bArr, i14, i13);
                }
                int i16 = i12 + 2;
                byte b14 = bArr[i14];
                if (b14 <= -65) {
                    if ((((b14 + 112) + (b12 << 28)) >> 30) == 0) {
                        int i17 = i12 + 3;
                        if (bArr[i16] <= -65) {
                            i12 += 4;
                            if (bArr[i17] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i12 = i14;
        }
        return 0;
    }
}
