package com.google.crypto.tink.subtle;

import com.google.crypto.tink.annotations.Alpha;
import java.util.Arrays;

@Alpha
/* loaded from: classes6.dex */
final class Field25519 {
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;
    private static final int[] EXPAND_START = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] EXPAND_SHIFT = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] MASK = {67108863, 33554431};
    private static final int[] SHIFT = {26, 25};

    private Field25519() {
    }

    public static byte[] contract(long[] jArr) {
        int i12;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = 0;
            while (i14 < 9) {
                long j12 = jArrCopyOf[i14];
                int i15 = -((int) (((j12 >> 31) & j12) >> SHIFT[i14 & 1]));
                jArrCopyOf[i14] = j12 + (i15 << r11);
                i14++;
                jArrCopyOf[i14] = jArrCopyOf[i14] - i15;
            }
            long j13 = jArrCopyOf[9];
            int i16 = -((int) (((j13 >> 31) & j13) >> 25));
            jArrCopyOf[9] = j13 + (i16 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - (i16 * 19);
            i13++;
        }
        long j14 = jArrCopyOf[0];
        jArrCopyOf[0] = j14 + (r2 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j14 >> 31) & j14) >> 26)));
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 9) {
                long j15 = jArrCopyOf[i18];
                int i19 = (int) (j15 >> SHIFT[i18 & 1]);
                jArrCopyOf[i18] = j15 & MASK[r11];
                i18++;
                jArrCopyOf[i18] = jArrCopyOf[i18] + i19;
            }
        }
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        long j16 = jArrCopyOf[0] + (((int) (r7 >> 25)) * 19);
        jArrCopyOf[0] = j16;
        int iGte = gte((int) j16, 67108845);
        for (int i22 = 1; i22 < 10; i22++) {
            iGte &= eq((int) jArrCopyOf[i22], MASK[i22 & 1]);
        }
        jArrCopyOf[0] = jArrCopyOf[0] - (67108845 & iGte);
        long j17 = 33554431 & iGte;
        jArrCopyOf[1] = jArrCopyOf[1] - j17;
        for (i12 = 2; i12 < 10; i12 += 2) {
            jArrCopyOf[i12] = jArrCopyOf[i12] - (67108863 & iGte);
            int i23 = i12 + 1;
            jArrCopyOf[i23] = jArrCopyOf[i23] - j17;
        }
        for (int i24 = 0; i24 < 10; i24++) {
            jArrCopyOf[i24] = jArrCopyOf[i24] << EXPAND_SHIFT[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = 0; i25 < 10; i25++) {
            int i26 = EXPAND_START[i25];
            long j18 = bArr[i26];
            long j19 = jArrCopyOf[i25];
            bArr[i26] = (byte) (j18 | (j19 & 255));
            bArr[i26 + 1] = (byte) (bArr[r4] | ((j19 >> 8) & 255));
            bArr[i26 + 2] = (byte) (bArr[r4] | ((j19 >> 16) & 255));
            bArr[i26 + 3] = (byte) (bArr[r3] | ((j19 >> 24) & 255));
        }
        return bArr;
    }

    private static int eq(int i12, int i13) {
        int i14 = ~(i12 ^ i13);
        int i15 = i14 & (i14 << 16);
        int i16 = i15 & (i15 << 8);
        int i17 = i16 & (i16 << 4);
        int i18 = i17 & (i17 << 2);
        return (i18 & (i18 << 1)) >> 31;
    }

    public static long[] expand(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = EXPAND_START[i12];
            jArr[i12] = (((((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8)) | ((bArr[i13 + 2] & 255) << 16)) | ((bArr[i13 + 3] & 255) << 24)) >> EXPAND_SHIFT[i12]) & MASK[i12 & 1];
        }
        return jArr;
    }

    private static int gte(int i12, int i13) {
        return ~((i12 - i13) >> 31);
    }

    public static void inverse(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        square(jArr3, jArr2);
        square(jArr12, jArr3);
        square(jArr11, jArr12);
        mult(jArr4, jArr11, jArr2);
        mult(jArr5, jArr4, jArr3);
        square(jArr11, jArr5);
        mult(jArr6, jArr11, jArr4);
        square(jArr11, jArr6);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        mult(jArr7, jArr11, jArr6);
        square(jArr11, jArr7);
        square(jArr12, jArr11);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr8, jArr12, jArr7);
        square(jArr11, jArr8);
        square(jArr12, jArr11);
        for (int i13 = 2; i13 < 20; i13 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr8);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        for (int i14 = 2; i14 < 10; i14 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr9, jArr11, jArr7);
        square(jArr11, jArr9);
        square(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr10, jArr12, jArr9);
        square(jArr12, jArr10);
        square(jArr11, jArr12);
        for (int i16 = 2; i16 < 100; i16 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr12, jArr11, jArr10);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        for (int i17 = 2; i17 < 50; i17 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr9);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        mult(jArr, jArr12, jArr5);
    }

    public static void mult(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        product(jArr4, jArr2, jArr3);
        reduce(jArr4, jArr);
    }

    public static void product(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j12 = jArr2[0];
        long j13 = jArr3[1] * j12;
        long j14 = jArr2[1];
        long j15 = jArr3[0];
        jArr[1] = (j14 * j15) + j13;
        long j16 = jArr2[1];
        long j17 = jArr3[1];
        jArr[2] = (jArr2[2] * j15) + (jArr3[2] * j12) + (j16 * 2 * j17);
        long j18 = jArr3[2];
        long j19 = jArr2[2];
        jArr[3] = (jArr2[3] * j15) + (jArr3[3] * j12) + (j19 * j17) + (j16 * j18);
        long j22 = jArr3[3];
        long j23 = jArr2[3];
        jArr[4] = (jArr2[4] * j15) + (jArr3[4] * j12) + (((j23 * j17) + (j16 * j22)) * 2) + (j19 * j18);
        long j24 = jArr3[4];
        long j25 = (j16 * j24) + (j23 * j18) + (j19 * j22);
        long j26 = jArr2[4];
        jArr[5] = (jArr2[5] * j15) + (jArr3[5] * j12) + (j26 * j17) + j25;
        long j27 = jArr3[5];
        long j28 = jArr2[5];
        jArr[6] = (jArr2[6] * j15) + (jArr3[6] * j12) + (j26 * j18) + (j19 * j24) + (((j28 * j17) + (j16 * j27) + (j23 * j22)) * 2);
        long j29 = (j28 * j18) + (j19 * j27) + (j26 * j22) + (j23 * j24);
        long j32 = jArr3[6];
        long j33 = (j16 * j32) + j29;
        long j34 = jArr2[6];
        jArr[7] = (jArr2[7] * j15) + (jArr3[7] * j12) + (j34 * j17) + j33;
        long j35 = jArr3[7];
        long j36 = (j16 * j35) + (j28 * j22) + (j23 * j27);
        long j37 = jArr2[7];
        long j38 = (((j37 * j17) + j36) * 2) + (j26 * j24);
        jArr[8] = (jArr2[8] * j15) + (jArr3[8] * j12) + (j34 * j18) + (j19 * j32) + j38;
        long j39 = (j37 * j18) + (j19 * j35) + (j34 * j22) + (j23 * j32) + (j28 * j24) + (j26 * j27);
        long j42 = jArr3[8];
        long j43 = (j16 * j42) + j39;
        long j44 = jArr2[8];
        jArr[9] = (jArr2[9] * j15) + (j12 * jArr3[9]) + (j44 * j17) + j43;
        long j45 = (j37 * j22) + (j23 * j35) + (j28 * j27);
        long j46 = jArr3[9];
        long j47 = jArr2[9];
        long j48 = j26 * j32;
        jArr[10] = (j44 * j18) + (j19 * j42) + (j34 * j24) + j48 + (((j17 * j47) + (j16 * j46) + j45) * 2);
        long j49 = j19 * j46;
        long j52 = j18 * j47;
        jArr[11] = j52 + j49 + (j44 * j22) + (j23 * j42) + (j37 * j24) + (j26 * j35) + (j34 * j27) + (j28 * j32);
        long j53 = j23 * j46;
        long j54 = j22 * j47;
        long j55 = j44 * j24;
        jArr[12] = j55 + (j26 * j42) + ((j54 + j53 + (j37 * j27) + (j28 * j35)) * 2) + (j34 * j32);
        long j56 = j26 * j46;
        long j57 = j24 * j47;
        jArr[13] = j57 + j56 + (j44 * j27) + (j28 * j42) + (j37 * j32) + (j34 * j35);
        long j58 = j27 * j47;
        long j59 = j44 * j32;
        jArr[14] = j59 + (j34 * j42) + ((j58 + (j28 * j46) + (j37 * j35)) * 2);
        long j62 = j34 * j46;
        long j63 = j32 * j47;
        jArr[15] = j63 + j62 + (j44 * j35) + (j37 * j42);
        jArr[16] = (((j35 * j47) + (j37 * j46)) * 2) + (j44 * j42);
        jArr[17] = (j42 * j47) + (j44 * j46);
        jArr[18] = j47 * 2 * j46;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        reduceSizeByModularReduction(jArr);
        reduceCoefficients(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void reduceCoefficients(long[] jArr) {
        jArr[10] = 0;
        int i12 = 0;
        while (i12 < 10) {
            long j12 = jArr[i12];
            long j13 = j12 / TWO_TO_26;
            jArr[i12] = j12 - (j13 << 26);
            int i13 = i12 + 1;
            long j14 = jArr[i13] + j13;
            jArr[i13] = j14;
            long j15 = j14 / TWO_TO_25;
            jArr[i13] = j14 - (j15 << 25);
            i12 += 2;
            jArr[i12] = jArr[i12] + j15;
        }
        long j16 = jArr[0];
        long j17 = jArr[10];
        long j18 = j16 + (j17 << 4);
        jArr[0] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[0] = j19;
        long j22 = j19 + j17;
        jArr[0] = j22;
        jArr[10] = 0;
        long j23 = j22 / TWO_TO_26;
        jArr[0] = j22 - (j23 << 26);
        jArr[1] = jArr[1] + j23;
    }

    public static void reduceSizeByModularReduction(long[] jArr) {
        long j12 = jArr[8];
        long j13 = jArr[18];
        long j14 = j12 + (j13 << 4);
        jArr[8] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[8] = j15;
        jArr[8] = j15 + j13;
        long j16 = jArr[7];
        long j17 = jArr[17];
        long j18 = j16 + (j17 << 4);
        jArr[7] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[7] = j19;
        jArr[7] = j19 + j17;
        long j22 = jArr[6];
        long j23 = jArr[16];
        long j24 = j22 + (j23 << 4);
        jArr[6] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[6] = j25;
        jArr[6] = j25 + j23;
        long j26 = jArr[5];
        long j27 = jArr[15];
        long j28 = j26 + (j27 << 4);
        jArr[5] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[5] = j29;
        jArr[5] = j29 + j27;
        long j32 = jArr[4];
        long j33 = jArr[14];
        long j34 = j32 + (j33 << 4);
        jArr[4] = j34;
        long j35 = j34 + (j33 << 1);
        jArr[4] = j35;
        jArr[4] = j35 + j33;
        long j36 = jArr[3];
        long j37 = jArr[13];
        long j38 = j36 + (j37 << 4);
        jArr[3] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[3] = j39;
        jArr[3] = j39 + j37;
        long j42 = jArr[2];
        long j43 = jArr[12];
        long j44 = j42 + (j43 << 4);
        jArr[2] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[2] = j45;
        jArr[2] = j45 + j43;
        long j46 = jArr[1];
        long j47 = jArr[11];
        long j48 = j46 + (j47 << 4);
        jArr[1] = j48;
        long j49 = j48 + (j47 << 1);
        jArr[1] = j49;
        jArr[1] = j49 + j47;
        long j52 = jArr[0];
        long j53 = jArr[10];
        long j54 = j52 + (j53 << 4);
        jArr[0] = j54;
        long j55 = j54 + (j53 << 1);
        jArr[0] = j55;
        jArr[0] = j55 + j53;
    }

    public static void scalarProduct(long[] jArr, long[] jArr2, long j12) {
        for (int i12 = 0; i12 < 10; i12++) {
            jArr[i12] = jArr2[i12] * j12;
        }
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        squareInner(jArr3, jArr2);
        reduce(jArr3, jArr);
    }

    private static void squareInner(long[] jArr, long[] jArr2) {
        long j12 = jArr2[0];
        jArr[0] = j12 * j12;
        long j13 = jArr2[0];
        jArr[1] = j13 * 2 * jArr2[1];
        long j14 = jArr2[1];
        jArr[2] = ((jArr2[2] * j13) + (j14 * j14)) * 2;
        long j15 = jArr2[2];
        jArr[3] = ((jArr2[3] * j13) + (j14 * j15)) * 2;
        long j16 = jArr2[3];
        jArr[4] = (j13 * 2 * jArr2[4]) + (j14 * 4 * j16) + (j15 * j15);
        long j17 = jArr2[4];
        long j18 = jArr2[5] * j13;
        jArr[5] = (j18 + (j14 * j17) + (j15 * j16)) * 2;
        long j19 = jArr2[6] * j13;
        long j22 = jArr2[5];
        jArr[6] = ((j14 * 2 * j22) + j19 + (j15 * j17) + (j16 * j16)) * 2;
        long j23 = jArr2[6];
        jArr[7] = ((jArr2[7] * j13) + (j14 * j23) + (j15 * j22) + (j16 * j17)) * 2;
        long j24 = (jArr2[8] * j13) + (j15 * j23);
        long j25 = jArr2[7];
        jArr[8] = (((((j16 * j22) + (j14 * j25)) * 2) + j24) * 2) + (j17 * j17);
        long j26 = jArr2[8];
        long j27 = j14 * j26;
        jArr[9] = ((j13 * jArr2[9]) + j27 + (j15 * j25) + (j16 * j23) + (j17 * j22)) * 2;
        long j28 = jArr2[9];
        jArr[10] = ((((j14 * j28) + (j16 * j25)) * 2) + (j15 * j26) + (j17 * j23) + (j22 * j22)) * 2;
        long j29 = j15 * j28;
        jArr[11] = (j29 + (j16 * j26) + (j17 * j25) + (j22 * j23)) * 2;
        jArr[12] = (((((j16 * j28) + (j22 * j25)) * 2) + (j17 * j26)) * 2) + (j23 * j23);
        long j32 = j17 * j28;
        jArr[13] = (j32 + (j22 * j26) + (j23 * j25)) * 2;
        long j33 = j22 * 2 * j28;
        jArr[14] = (j33 + (j23 * j26) + (j25 * j25)) * 2;
        jArr[15] = ((j23 * j28) + (j25 * j26)) * 2;
        jArr[16] = (j25 * 4 * j28) + (j26 * j26);
        jArr[17] = j26 * 2 * j28;
        jArr[18] = 2 * j28 * j28;
    }

    public static void sub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i12 = 0; i12 < 10; i12++) {
            jArr[i12] = jArr2[i12] - jArr3[i12];
        }
    }

    public static void sum(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i12 = 0; i12 < 10; i12++) {
            jArr[i12] = jArr2[i12] + jArr3[i12];
        }
    }

    public static void sub(long[] jArr, long[] jArr2) {
        sub(jArr, jArr2, jArr);
    }

    public static void sum(long[] jArr, long[] jArr2) {
        sum(jArr, jArr, jArr2);
    }
}
