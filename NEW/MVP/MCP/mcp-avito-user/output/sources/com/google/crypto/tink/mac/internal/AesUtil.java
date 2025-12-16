package com.google.crypto.tink.mac.internal;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    private AesUtil() {
    }

    public static byte[] cmacPad(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] dbl(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i12 = 0; i12 < 16; i12++) {
            byte b12 = (byte) ((bArr[i12] << 1) & 254);
            bArr2[i12] = b12;
            if (i12 < 15) {
                bArr2[i12] = (byte) (((byte) ((bArr[i12 + 1] >> 7) & 1)) | b12);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
