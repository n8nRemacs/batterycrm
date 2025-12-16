package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Bytes {
    private Bytes() {
    }

    public static int byteArrayToInt(byte[] bArr) {
        return byteArrayToInt(bArr, bArr.length);
    }

    public static byte[] concat(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean equal(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    public static byte[] intToByteArray(int i12, int i13) {
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) ((i13 >> (i14 * 8)) & 255);
        }
        return bArr;
    }

    public static final byte[] xor(byte[] bArr, int i12, byte[] bArr2, int i13, int i14) {
        if (i14 < 0 || bArr.length - i14 < i12 || bArr2.length - i14 < i13) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr3[i15] = (byte) (bArr[i15 + i12] ^ bArr2[i15 + i13]);
        }
        return bArr3;
    }

    public static final byte[] xorEnd(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = bArr.length - bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            int i13 = length + i12;
            bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArr2[i12]);
        }
        return bArrCopyOf;
    }

    public static int byteArrayToInt(byte[] bArr, int i12) {
        return byteArrayToInt(bArr, 0, i12);
    }

    public static int byteArrayToInt(byte[] bArr, int i12, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += (bArr[i15 + i12] & 255) << (i15 * 8);
        }
        return i14;
    }

    public static final void xor(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12) {
        if (i12 < 0 || byteBuffer2.remaining() < i12 || byteBuffer3.remaining() < i12 || byteBuffer.remaining() < i12) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return xor(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
