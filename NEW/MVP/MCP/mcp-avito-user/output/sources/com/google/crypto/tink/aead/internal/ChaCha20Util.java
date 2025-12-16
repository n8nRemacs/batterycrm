package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes6.dex */
final class ChaCha20Util {
    static final int BLOCK_SIZE_IN_BYTES = 64;
    static final int BLOCK_SIZE_IN_INTS = 16;
    static final int KEY_SIZE_IN_BYTES = 32;
    static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private ChaCha20Util() {
    }

    public static void quarterRound(int[] iArr, int i12, int i13, int i14, int i15) {
        int i16 = iArr[i12] + iArr[i13];
        iArr[i12] = i16;
        int iRotateLeft = rotateLeft(i16 ^ iArr[i15], 16);
        iArr[i15] = iRotateLeft;
        int i17 = iArr[i14] + iRotateLeft;
        iArr[i14] = i17;
        int iRotateLeft2 = rotateLeft(iArr[i13] ^ i17, 12);
        iArr[i13] = iRotateLeft2;
        int i18 = iArr[i12] + iRotateLeft2;
        iArr[i12] = i18;
        int iRotateLeft3 = rotateLeft(iArr[i15] ^ i18, 8);
        iArr[i15] = iRotateLeft3;
        int i19 = iArr[i14] + iRotateLeft3;
        iArr[i14] = i19;
        iArr[i13] = rotateLeft(iArr[i13] ^ i19, 7);
    }

    private static int rotateLeft(int i12, int i13) {
        return (i12 >>> (-i13)) | (i12 << i13);
    }

    public static void setSigmaAndKey(int[] iArr, int[] iArr2) {
        int[] iArr3 = SIGMA;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void shuffleState(int[] iArr) {
        for (int i12 = 0; i12 < 10; i12++) {
            quarterRound(iArr, 0, 4, 8, 12);
            quarterRound(iArr, 1, 5, 9, 13);
            quarterRound(iArr, 2, 6, 10, 14);
            quarterRound(iArr, 3, 7, 11, 15);
            quarterRound(iArr, 0, 5, 10, 15);
            quarterRound(iArr, 1, 6, 11, 12);
            quarterRound(iArr, 2, 7, 8, 13);
            quarterRound(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] toIntArray(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
