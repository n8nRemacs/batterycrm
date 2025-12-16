package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i12 = 0;
        long jLoad26 = load26(bArr, 0, 0) & 67108863;
        int i13 = 3;
        long jLoad262 = load26(bArr, 3, 2) & 67108611;
        long jLoad263 = load26(bArr, 6, 4) & 67092735;
        long jLoad264 = load26(bArr, 9, 6) & 66076671;
        long jLoad265 = load26(bArr, 12, 8) & 1048575;
        long j12 = jLoad262 * 5;
        long j13 = jLoad263 * 5;
        long j14 = jLoad264 * 5;
        long j15 = jLoad265 * 5;
        byte[] bArr3 = new byte[17];
        long j16 = 0;
        int i14 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j22 = 0;
        while (i14 < bArr2.length) {
            copyBlockSize(bArr3, bArr2, i14);
            long jLoad266 = j22 + load26(bArr3, i12, i12);
            long jLoad267 = j16 + load26(bArr3, i13, 2);
            long jLoad268 = j17 + load26(bArr3, 6, 4);
            long jLoad269 = j18 + load26(bArr3, 9, 6);
            long jLoad2610 = j19 + (load26(bArr3, 12, 8) | (bArr3[16] << 24));
            long j23 = (jLoad2610 * j12) + (jLoad269 * j13) + (jLoad268 * j14) + (jLoad267 * j15) + (jLoad266 * jLoad26);
            long j24 = (jLoad2610 * j13) + (jLoad269 * j14) + (jLoad268 * j15) + (jLoad267 * jLoad26) + (jLoad266 * jLoad262);
            long j25 = (jLoad2610 * j14) + (jLoad269 * j15) + (jLoad268 * jLoad26) + (jLoad267 * jLoad262) + (jLoad266 * jLoad263);
            long j26 = (jLoad2610 * j15) + (jLoad269 * jLoad26) + (jLoad268 * jLoad262) + (jLoad267 * jLoad263) + (jLoad266 * jLoad264);
            long j27 = jLoad269 * jLoad262;
            long j28 = jLoad2610 * jLoad26;
            long j29 = j24 + (j23 >> 26);
            long j32 = j25 + (j29 >> 26);
            long j33 = j26 + (j32 >> 26);
            long j34 = j28 + j27 + (jLoad268 * jLoad263) + (jLoad267 * jLoad264) + (jLoad266 * jLoad265) + (j33 >> 26);
            long j35 = j34 >> 26;
            j19 = j34 & 67108863;
            long j36 = (j35 * 5) + (j23 & 67108863);
            i14 += 16;
            j17 = j32 & 67108863;
            j18 = j33 & 67108863;
            i13 = 3;
            j22 = j36 & 67108863;
            j16 = (j29 & 67108863) + (j36 >> 26);
            i12 = 0;
        }
        long j37 = j17 + (j16 >> 26);
        long j38 = j37 & 67108863;
        long j39 = j18 + (j37 >> 26);
        long j42 = j39 & 67108863;
        long j43 = j19 + (j39 >> 26);
        long j44 = j43 & 67108863;
        long j45 = ((j43 >> 26) * 5) + j22;
        long j46 = j45 >> 26;
        long j47 = j45 & 67108863;
        long j48 = (j16 & 67108863) + j46;
        long j49 = j47 + 5;
        long j52 = j49 & 67108863;
        long j53 = j48 + (j49 >> 26);
        long j54 = j38 + (j53 >> 26);
        long j55 = j42 + (j54 >> 26);
        long j56 = (j44 + (j55 >> 26)) - 67108864;
        long j57 = j56 >> 63;
        long j58 = j47 & j57;
        long j59 = j48 & j57;
        long j62 = j38 & j57;
        long j63 = j42 & j57;
        long j64 = j44 & j57;
        long j65 = ~j57;
        long j66 = j59 | (j53 & 67108863 & j65);
        long j67 = j62 | (j54 & 67108863 & j65);
        long j68 = j63 | (j55 & 67108863 & j65);
        long j69 = (j58 | (j52 & j65) | (j66 << 26)) & 4294967295L;
        long j72 = ((j66 >> 6) | (j67 << 20)) & 4294967295L;
        long j73 = ((j67 >> 12) | (j68 << 14)) & 4294967295L;
        long j74 = ((j68 >> 18) | (((j56 & j65) | j64) << 8)) & 4294967295L;
        long jLoad32 = j69 + load32(bArr, 16);
        long j75 = jLoad32 & 4294967295L;
        long jLoad322 = j72 + load32(bArr, 20) + (jLoad32 >> 32);
        long j76 = jLoad322 & 4294967295L;
        long jLoad323 = j73 + load32(bArr, 24) + (jLoad322 >> 32);
        long j77 = jLoad323 & 4294967295L;
        long jLoad324 = (j74 + load32(bArr, 28) + (jLoad323 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        toByteArray(bArr4, j75, 0);
        toByteArray(bArr4, j76, 4);
        toByteArray(bArr4, j77, 8);
        toByteArray(bArr4, jLoad324, 12);
        return bArr4;
    }

    private static void copyBlockSize(byte[] bArr, byte[] bArr2, int i12) {
        int iMin = Math.min(16, bArr2.length - i12);
        System.arraycopy(bArr2, i12, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long load26(byte[] bArr, int i12, int i13) {
        return (load32(bArr, i12) >> i13) & 67108863;
    }

    private static long load32(byte[] bArr, int i12) {
        return (((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void toByteArray(byte[] bArr, long j12, int i12) {
        int i13 = 0;
        while (i13 < 4) {
            bArr[i12 + i13] = (byte) (255 & j12);
            i13++;
            j12 >>= 8;
        }
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
