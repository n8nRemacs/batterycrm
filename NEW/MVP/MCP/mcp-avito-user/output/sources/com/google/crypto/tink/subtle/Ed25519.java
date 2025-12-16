package com.google.crypto.tink.subtle;

import aZ0.InterfaceC19845a;
import android.support.v4.media.session.PlaybackStateCompat;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        public CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        public void copyConditional(CachedXYT cachedXYT, int i12) {
            Curve25519.copyConditional(this.yPlusX, cachedXYT.yPlusX, i12);
            Curve25519.copyConditional(this.yMinusX, cachedXYT.yMinusX, i12);
            Curve25519.copyConditional(this.t2d, cachedXYT.t2d, i12);
        }

        public void multByZ(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        public CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.yPlusX = jArr;
            this.yMinusX = jArr2;
            this.t2d = jArr3;
        }

        public CachedXYT(CachedXYT cachedXYT) {
            this.yPlusX = Arrays.copyOf(cachedXYT.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(cachedXYT.yMinusX, 10);
            this.t2d = Arrays.copyOf(cachedXYT.t2d, 10);
        }
    }

    public static class CachedXYZT extends CachedXYT {

        /* renamed from: z, reason: collision with root package name */
        private final long[] f360681z;

        public CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] jArr, long[] jArr2) {
            Field25519.mult(jArr, jArr2, this.f360681z);
        }

        public CachedXYZT(XYZT xyzt) {
            this();
            long[] jArr = this.yPlusX;
            XYZ xyz2 = xyzt.f360688xyz;
            Field25519.sum(jArr, xyz2.f360685y, xyz2.f360684x);
            long[] jArr2 = this.yMinusX;
            XYZ xyz3 = xyzt.f360688xyz;
            Field25519.sub(jArr2, xyz3.f360685y, xyz3.f360684x);
            System.arraycopy(xyzt.f360688xyz.f360686z, 0, this.f360681z, 0, 10);
            Field25519.mult(this.t2d, xyzt.f360687t, Ed25519Constants.f360691D2);
        }

        public CachedXYZT(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f360681z = jArr3;
        }
    }

    public static class PartialXYZT {

        /* renamed from: t, reason: collision with root package name */
        final long[] f360682t;

        /* renamed from: xyz, reason: collision with root package name */
        final XYZ f360683xyz;

        public PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        public PartialXYZT(XYZ xyz2, long[] jArr) {
            this.f360683xyz = xyz2;
            this.f360682t = jArr;
        }

        public PartialXYZT(PartialXYZT partialXYZT) {
            this.f360683xyz = new XYZ(partialXYZT.f360683xyz);
            this.f360682t = Arrays.copyOf(partialXYZT.f360682t, 10);
        }
    }

    public static class XYZ {

        /* renamed from: x, reason: collision with root package name */
        final long[] f360684x;

        /* renamed from: y, reason: collision with root package name */
        final long[] f360685y;

        /* renamed from: z, reason: collision with root package name */
        final long[] f360686z;

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        @InterfaceC19845a
        public static XYZ fromPartialXYZT(XYZ xyz2, PartialXYZT partialXYZT) {
            Field25519.mult(xyz2.f360684x, partialXYZT.f360683xyz.f360684x, partialXYZT.f360682t);
            long[] jArr = xyz2.f360685y;
            XYZ xyz3 = partialXYZT.f360683xyz;
            Field25519.mult(jArr, xyz3.f360685y, xyz3.f360686z);
            Field25519.mult(xyz2.f360686z, partialXYZT.f360683xyz.f360686z, partialXYZT.f360682t);
            return xyz2;
        }

        public boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.f360684x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.f360685y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.f360686z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.f360690D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }

        public byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.f360686z);
            Field25519.mult(jArr2, this.f360684x, jArr);
            Field25519.mult(jArr3, this.f360685y, jArr);
            byte[] bArrContract = Field25519.contract(jArr3);
            bArrContract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ bArrContract[31]);
            return bArrContract;
        }

        public XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f360684x = jArr;
            this.f360685y = jArr2;
            this.f360686z = jArr3;
        }

        public XYZ(XYZ xyz2) {
            this.f360684x = Arrays.copyOf(xyz2.f360684x, 10);
            this.f360685y = Arrays.copyOf(xyz2.f360685y, 10);
            this.f360686z = Arrays.copyOf(xyz2.f360686z, 10);
        }

        public XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    public static class XYZT {

        /* renamed from: t, reason: collision with root package name */
        final long[] f360687t;

        /* renamed from: xyz, reason: collision with root package name */
        final XYZ f360688xyz;

        public XYZT() {
            this(new XYZ(), new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrExpand = Field25519.expand(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, jArrExpand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.f360690D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (!Ed25519.isNonZeroVarTime(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (Ed25519.getLsb(jArr) == ((bArr[31] & 255) >> 7)) {
                Ed25519.neg(jArr, jArr);
            }
            Field25519.mult(jArr3, jArr, jArrExpand);
            return new XYZT(new XYZ(jArr, jArrExpand, jArr2), jArr3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC19845a
        public static XYZT fromPartialXYZT(XYZT xyzt, PartialXYZT partialXYZT) {
            Field25519.mult(xyzt.f360688xyz.f360684x, partialXYZT.f360683xyz.f360684x, partialXYZT.f360682t);
            long[] jArr = xyzt.f360688xyz.f360685y;
            XYZ xyz2 = partialXYZT.f360683xyz;
            Field25519.mult(jArr, xyz2.f360685y, xyz2.f360686z);
            Field25519.mult(xyzt.f360688xyz.f360686z, partialXYZT.f360683xyz.f360686z, partialXYZT.f360682t);
            long[] jArr2 = xyzt.f360687t;
            XYZ xyz3 = partialXYZT.f360683xyz;
            Field25519.mult(jArr2, xyz3.f360684x, xyz3.f360685y);
            return xyzt;
        }

        public XYZT(XYZ xyz2, long[] jArr) {
            this.f360688xyz = xyz2;
            this.f360687t = jArr;
        }

        public XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }
    }

    private Ed25519() {
    }

    private static void add(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.f360683xyz.f360684x;
        XYZ xyz2 = xyzt.f360688xyz;
        Field25519.sum(jArr2, xyz2.f360685y, xyz2.f360684x);
        long[] jArr3 = partialXYZT.f360683xyz.f360685y;
        XYZ xyz3 = xyzt.f360688xyz;
        Field25519.sub(jArr3, xyz3.f360685y, xyz3.f360684x);
        long[] jArr4 = partialXYZT.f360683xyz.f360685y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yMinusX);
        XYZ xyz4 = partialXYZT.f360683xyz;
        Field25519.mult(xyz4.f360686z, xyz4.f360684x, cachedXYT.yPlusX);
        Field25519.mult(partialXYZT.f360682t, xyzt.f360687t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.f360683xyz.f360684x, xyzt.f360688xyz.f360686z);
        long[] jArr5 = partialXYZT.f360683xyz.f360684x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz5 = partialXYZT.f360683xyz;
        Field25519.sub(xyz5.f360684x, xyz5.f360686z, xyz5.f360685y);
        XYZ xyz6 = partialXYZT.f360683xyz;
        long[] jArr6 = xyz6.f360685y;
        Field25519.sum(jArr6, xyz6.f360686z, jArr6);
        Field25519.sum(partialXYZT.f360683xyz.f360686z, jArr, partialXYZT.f360682t);
        long[] jArr7 = partialXYZT.f360682t;
        Field25519.sub(jArr7, jArr, jArr7);
    }

    private static XYZ doubleScalarMultVarTime(byte[] bArr, XYZT xyzt, byte[] bArr2) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(xyzt);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, xyzt);
        XYZT xyzt2 = new XYZT(partialXYZT);
        for (int i12 = 1; i12 < 8; i12++) {
            add(partialXYZT, xyzt2, cachedXYZTArr[i12 - 1]);
            cachedXYZTArr[i12] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] bArrSlide = slide(bArr);
        byte[] bArrSlide2 = slide(bArr2);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt3 = new XYZT();
        int i13 = 255;
        while (i13 >= 0 && bArrSlide[i13] == 0 && bArrSlide2[i13] == 0) {
            i13--;
        }
        while (i13 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            byte b12 = bArrSlide[i13];
            if (b12 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[bArrSlide[i13] / 2]);
            } else if (b12 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[(-bArrSlide[i13]) / 2]);
            }
            byte b13 = bArrSlide2[i13];
            if (b13 > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.f360689B2[bArrSlide2[i13] / 2]);
            } else if (b13 < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt3, partialXYZT2), Ed25519Constants.f360689B2[(-bArrSlide2[i13]) / 2]);
            }
            i13--;
        }
        return new XYZ(partialXYZT2);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ xyz2) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.f360683xyz.f360684x, xyz2.f360684x);
        Field25519.square(partialXYZT.f360683xyz.f360686z, xyz2.f360685y);
        Field25519.square(partialXYZT.f360682t, xyz2.f360686z);
        long[] jArr2 = partialXYZT.f360682t;
        Field25519.sum(jArr2, jArr2, jArr2);
        Field25519.sum(partialXYZT.f360683xyz.f360685y, xyz2.f360684x, xyz2.f360685y);
        Field25519.square(jArr, partialXYZT.f360683xyz.f360685y);
        XYZ xyz3 = partialXYZT.f360683xyz;
        Field25519.sum(xyz3.f360685y, xyz3.f360686z, xyz3.f360684x);
        XYZ xyz4 = partialXYZT.f360683xyz;
        long[] jArr3 = xyz4.f360686z;
        Field25519.sub(jArr3, jArr3, xyz4.f360684x);
        XYZ xyz5 = partialXYZT.f360683xyz;
        Field25519.sub(xyz5.f360684x, jArr, xyz5.f360685y);
        long[] jArr4 = partialXYZT.f360682t;
        Field25519.sub(jArr4, jArr4, partialXYZT.f360683xyz.f360686z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT xyzt) {
        doubleXYZ(partialXYZT, xyzt.f360688xyz);
    }

    private static int eq(int i12, int i13) {
        int i14 = (~(i12 ^ i13)) & 255;
        int i15 = i14 & (i14 << 4);
        int i16 = i15 & (i15 << 2);
        return ((i16 & (i16 << 1)) >> 7) & 1;
    }

    public static byte[] getHashedScalar(byte[] bArr) {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr, 0, 32);
        byte[] bArrDigest = engineFactory.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b12 = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b12;
        bArrDigest[31] = (byte) (b12 | 64);
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] jArr) {
        return Field25519.contract(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        Field25519.reduceCoefficients(jArr2);
        for (byte b12 : Field25519.contract(jArr2)) {
            if (b12 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] bArr) {
        for (int i12 = 31; i12 >= 0; i12--) {
            int i13 = bArr[i12] & 255;
            int i14 = GROUP_ORDER[i12] & 255;
            if (i13 != i14) {
                return i13 < i14;
            }
        }
        return false;
    }

    private static long load3(byte[] bArr, int i12) {
        return ((bArr[i12 + 2] & 255) << 16) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8);
    }

    private static long load4(byte[] bArr, int i12) {
        return ((bArr[i12 + 3] & 255) << 24) | load3(bArr, i12);
    }

    private static void mulAdd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long jLoad3 = load3(bArr2, 0) & 2097151;
        long jLoad4 = (load4(bArr2, 2) >> 5) & 2097151;
        long jLoad32 = (load3(bArr2, 5) >> 2) & 2097151;
        long jLoad42 = (load4(bArr2, 7) >> 7) & 2097151;
        long jLoad43 = (load4(bArr2, 10) >> 4) & 2097151;
        long jLoad33 = (load3(bArr2, 13) >> 1) & 2097151;
        long jLoad44 = (load4(bArr2, 15) >> 6) & 2097151;
        long jLoad34 = (load3(bArr2, 18) >> 3) & 2097151;
        long jLoad35 = load3(bArr2, 21) & 2097151;
        long jLoad45 = (load4(bArr2, 23) >> 5) & 2097151;
        long jLoad36 = (load3(bArr2, 26) >> 2) & 2097151;
        long jLoad46 = load4(bArr2, 28) >> 7;
        long jLoad37 = load3(bArr3, 0) & 2097151;
        long jLoad47 = (load4(bArr3, 2) >> 5) & 2097151;
        long jLoad38 = (load3(bArr3, 5) >> 2) & 2097151;
        long jLoad48 = (load4(bArr3, 7) >> 7) & 2097151;
        long jLoad49 = (load4(bArr3, 10) >> 4) & 2097151;
        long jLoad39 = (load3(bArr3, 13) >> 1) & 2097151;
        long jLoad410 = (load4(bArr3, 15) >> 6) & 2097151;
        long jLoad310 = (load3(bArr3, 18) >> 3) & 2097151;
        long jLoad311 = load3(bArr3, 21) & 2097151;
        long jLoad411 = (load4(bArr3, 23) >> 5) & 2097151;
        long jLoad312 = (load3(bArr3, 26) >> 2) & 2097151;
        long jLoad412 = load4(bArr3, 28) >> 7;
        long jLoad313 = load3(bArr4, 0) & 2097151;
        long jLoad413 = (load4(bArr4, 2) >> 5) & 2097151;
        long jLoad314 = (load3(bArr4, 5) >> 2) & 2097151;
        long jLoad414 = (load4(bArr4, 7) >> 7) & 2097151;
        long jLoad415 = (load4(bArr4, 10) >> 4) & 2097151;
        long jLoad315 = (load3(bArr4, 13) >> 1) & 2097151;
        long jLoad416 = (load4(bArr4, 15) >> 6) & 2097151;
        long jLoad316 = (load3(bArr4, 18) >> 3) & 2097151;
        long jLoad317 = load3(bArr4, 21) & 2097151;
        long j12 = (jLoad3 * jLoad37) + jLoad313;
        long j13 = (jLoad4 * jLoad37) + (jLoad3 * jLoad47) + jLoad413;
        long j14 = (jLoad32 * jLoad37) + (jLoad4 * jLoad47) + (jLoad3 * jLoad38) + jLoad314;
        long j15 = (jLoad42 * jLoad37) + (jLoad32 * jLoad47) + (jLoad4 * jLoad38) + (jLoad3 * jLoad48) + jLoad414;
        long j16 = (jLoad43 * jLoad37) + (jLoad42 * jLoad47) + (jLoad32 * jLoad38) + (jLoad4 * jLoad48) + (jLoad3 * jLoad49) + jLoad415;
        long j17 = (jLoad33 * jLoad37) + (jLoad43 * jLoad47) + (jLoad42 * jLoad38) + (jLoad32 * jLoad48) + (jLoad4 * jLoad49) + (jLoad3 * jLoad39) + jLoad315;
        long j18 = (jLoad44 * jLoad37) + (jLoad33 * jLoad47) + (jLoad43 * jLoad38) + (jLoad42 * jLoad48) + (jLoad32 * jLoad49) + (jLoad4 * jLoad39) + (jLoad3 * jLoad410) + jLoad416;
        long j19 = (jLoad34 * jLoad37) + (jLoad44 * jLoad47) + (jLoad33 * jLoad38) + (jLoad43 * jLoad48) + (jLoad42 * jLoad49) + (jLoad32 * jLoad39) + (jLoad4 * jLoad410) + (jLoad3 * jLoad310) + jLoad316;
        long j22 = (jLoad35 * jLoad37) + (jLoad34 * jLoad47) + (jLoad44 * jLoad38) + (jLoad33 * jLoad48) + (jLoad43 * jLoad49) + (jLoad42 * jLoad39) + (jLoad32 * jLoad410) + (jLoad4 * jLoad310) + (jLoad3 * jLoad311) + jLoad317;
        long jLoad417 = (jLoad45 * jLoad37) + (jLoad35 * jLoad47) + (jLoad34 * jLoad38) + (jLoad44 * jLoad48) + (jLoad33 * jLoad49) + (jLoad43 * jLoad39) + (jLoad42 * jLoad410) + (jLoad32 * jLoad310) + (jLoad4 * jLoad311) + (jLoad3 * jLoad411) + ((load4(bArr4, 23) >> 5) & 2097151);
        long jLoad318 = (jLoad36 * jLoad37) + (jLoad45 * jLoad47) + (jLoad35 * jLoad38) + (jLoad34 * jLoad48) + (jLoad44 * jLoad49) + (jLoad33 * jLoad39) + (jLoad43 * jLoad410) + (jLoad42 * jLoad310) + (jLoad32 * jLoad311) + (jLoad4 * jLoad411) + (jLoad3 * jLoad312) + ((load3(bArr4, 26) >> 2) & 2097151);
        long jLoad418 = (jLoad37 * jLoad46) + (jLoad36 * jLoad47) + (jLoad45 * jLoad38) + (jLoad35 * jLoad48) + (jLoad34 * jLoad49) + (jLoad44 * jLoad39) + (jLoad33 * jLoad410) + (jLoad43 * jLoad310) + (jLoad42 * jLoad311) + (jLoad32 * jLoad411) + (jLoad4 * jLoad312) + (jLoad3 * jLoad412) + (load4(bArr4, 28) >> 7);
        long j23 = jLoad47 * jLoad46;
        long j24 = j23 + (jLoad36 * jLoad38) + (jLoad45 * jLoad48) + (jLoad35 * jLoad49) + (jLoad34 * jLoad39) + (jLoad44 * jLoad410) + (jLoad33 * jLoad310) + (jLoad43 * jLoad311) + (jLoad42 * jLoad411) + (jLoad32 * jLoad312) + (jLoad4 * jLoad412);
        long j25 = jLoad38 * jLoad46;
        long j26 = j25 + (jLoad36 * jLoad48) + (jLoad45 * jLoad49) + (jLoad35 * jLoad39) + (jLoad34 * jLoad410) + (jLoad44 * jLoad310) + (jLoad33 * jLoad311) + (jLoad43 * jLoad411) + (jLoad42 * jLoad312) + (jLoad32 * jLoad412);
        long j27 = jLoad48 * jLoad46;
        long j28 = j27 + (jLoad36 * jLoad49) + (jLoad45 * jLoad39) + (jLoad35 * jLoad410) + (jLoad34 * jLoad310) + (jLoad44 * jLoad311) + (jLoad33 * jLoad411) + (jLoad43 * jLoad312) + (jLoad42 * jLoad412);
        long j29 = jLoad49 * jLoad46;
        long j32 = j29 + (jLoad36 * jLoad39) + (jLoad45 * jLoad410) + (jLoad35 * jLoad310) + (jLoad34 * jLoad311) + (jLoad44 * jLoad411) + (jLoad33 * jLoad312) + (jLoad43 * jLoad412);
        long j33 = jLoad39 * jLoad46;
        long j34 = j33 + (jLoad36 * jLoad410) + (jLoad45 * jLoad310) + (jLoad35 * jLoad311) + (jLoad34 * jLoad411) + (jLoad44 * jLoad312) + (jLoad33 * jLoad412);
        long j35 = jLoad410 * jLoad46;
        long j36 = j35 + (jLoad36 * jLoad310) + (jLoad45 * jLoad311) + (jLoad35 * jLoad411) + (jLoad34 * jLoad312) + (jLoad44 * jLoad412);
        long j37 = jLoad310 * jLoad46;
        long j38 = j37 + (jLoad36 * jLoad311) + (jLoad45 * jLoad411) + (jLoad35 * jLoad312) + (jLoad34 * jLoad412);
        long j39 = jLoad311 * jLoad46;
        long j42 = j39 + (jLoad36 * jLoad411) + (jLoad45 * jLoad312) + (jLoad35 * jLoad412);
        long j43 = (jLoad411 * jLoad46) + (jLoad36 * jLoad312) + (jLoad45 * jLoad412);
        long j44 = jLoad312 * jLoad46;
        long j45 = jLoad46 * jLoad412;
        long j46 = (j12 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j47 = j13 + j46;
        long j48 = j12 - (j46 << 21);
        long j49 = (j14 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j52 = j15 + j49;
        long j53 = j14 - (j49 << 21);
        long j54 = (j16 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j55 = j17 + j54;
        long j56 = j16 - (j54 << 21);
        long j57 = (j18 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j58 = j19 + j57;
        long j59 = j18 - (j57 << 21);
        long j62 = (j22 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j63 = jLoad417 + j62;
        long j64 = j22 - (j62 << 21);
        long j65 = (jLoad318 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j66 = jLoad418 + j65;
        long j67 = jLoad318 - (j65 << 21);
        long j68 = (j24 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j69 = j26 + j68;
        long j72 = j24 - (j68 << 21);
        long j73 = (j28 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j74 = j32 + j73;
        long j75 = j28 - (j73 << 21);
        long j76 = (j34 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j77 = j36 + j76;
        long j78 = j34 - (j76 << 21);
        long j79 = (j38 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j82 = j42 + j79;
        long j83 = j38 - (j79 << 21);
        long j84 = (j43 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j85 = j44 + (jLoad36 * jLoad412) + j84;
        long j86 = j43 - (j84 << 21);
        long j87 = (j45 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j88 = (j47 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j89 = j53 + j88;
        long j92 = j47 - (j88 << 21);
        long j93 = (j52 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j94 = j56 + j93;
        long j95 = j52 - (j93 << 21);
        long j96 = (j55 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j97 = j59 + j96;
        long j98 = j55 - (j96 << 21);
        long j99 = (j58 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j100 = j64 + j99;
        long j101 = j58 - (j99 << 21);
        long j102 = (j63 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j103 = j67 + j102;
        long j104 = j63 - (j102 << 21);
        long j105 = (j66 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j106 = j72 + j105;
        long j107 = j66 - (j105 << 21);
        long j108 = (j69 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j109 = j75 + j108;
        long j110 = j69 - (j108 << 21);
        long j111 = (j74 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j112 = j78 + j111;
        long j113 = j74 - (j111 << 21);
        long j114 = (j77 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j115 = j83 + j114;
        long j116 = j77 - (j114 << 21);
        long j117 = (j82 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j118 = j86 + j117;
        long j119 = j82 - (j117 << 21);
        long j120 = (j85 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j121 = (j45 - (j87 << 21)) + j120;
        long j122 = j85 - (j120 << 21);
        long j123 = j112 - (j87 * 683901);
        long j124 = (j121 * 470296) + (j87 * 666643) + j107;
        long j125 = (j121 * 654183) + (j87 * 470296) + j106;
        long j126 = ((j87 * 654183) + j110) - (j121 * 997805);
        long j127 = (j121 * 136657) + (j109 - (j87 * 997805));
        long j128 = ((j87 * 136657) + j113) - (j121 * 683901);
        long j129 = (j122 * 654183) + j124;
        long j130 = (j122 * 136657) + j126;
        long j131 = j127 - (j122 * 683901);
        long j132 = (j118 * 654183) + (j122 * 470296) + (j121 * 666643) + j103;
        long j133 = (j119 * 654183) + (j118 * 470296) + (j122 * 666643) + j104;
        long j134 = (j119 * 136657) + (j129 - (j118 * 997805));
        long j135 = ((j118 * 136657) + (j125 - (j122 * 997805))) - (j119 * 683901);
        long j136 = (j115 * 666643) + j97;
        long j137 = (j115 * 654183) + (j119 * 470296) + (j118 * 666643) + j100;
        long j138 = (j115 * 136657) + (j132 - (j119 * 997805));
        long j139 = (j136 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j140 = (j115 * 470296) + (j119 * 666643) + j101 + j139;
        long j141 = j136 - (j139 << 21);
        long j142 = (j137 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j143 = (j133 - (j115 * 997805)) + j142;
        long j144 = j137 - (j142 << 21);
        long j145 = (j138 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j146 = (j134 - (j115 * 683901)) + j145;
        long j147 = j138 - (j145 << 21);
        long j148 = (j135 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j149 = (j130 - (j118 * 683901)) + j148;
        long j150 = j135 - (j148 << 21);
        long j151 = (j131 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j152 = j128 + j151;
        long j153 = j131 - (j151 << 21);
        long j154 = (j123 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j155 = j116 + j154;
        long j156 = j123 - (j154 << 21);
        long j157 = (j140 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j158 = j144 + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j143 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j161 = j147 + j160;
        long j162 = j143 - (j160 << 21);
        long j163 = (j146 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j167 = j153 + j166;
        long j168 = j149 - (j166 << 21);
        long j169 = (j152 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j170 = j156 + j169;
        long j171 = j152 - (j169 << 21);
        long j172 = (j155 * 470296) + j141;
        long j173 = (j155 * 654183) + j159;
        long j174 = j161 - (j155 * 683901);
        long j175 = (j170 * 470296) + (j155 * 666643) + j98;
        long j176 = (j170 * 654183) + j172;
        long j177 = j173 - (j170 * 997805);
        long j178 = (j170 * 136657) + (j158 - (j155 * 997805));
        long j179 = ((j155 * 136657) + j162) - (j170 * 683901);
        long j180 = (j171 * 470296) + (j170 * 666643) + j94;
        long j181 = (j171 * 654183) + j175;
        long j182 = j176 - (j171 * 997805);
        long j183 = (j171 * 136657) + j177;
        long j184 = j178 - (j171 * 683901);
        long j185 = (j167 * 654183) + j180;
        long j186 = (j167 * 136657) + j182;
        long j187 = j183 - (j167 * 683901);
        long j188 = (j168 * 470296) + (j167 * 666643) + j89;
        long j189 = (j168 * 654183) + (j167 * 470296) + (j171 * 666643) + j95;
        long j190 = j185 - (j168 * 997805);
        long j191 = (j168 * 136657) + (j181 - (j167 * 997805));
        long j192 = j186 - (j168 * 683901);
        long j193 = (j164 * 666643) + j48;
        long j194 = (j164 * 654183) + j188;
        long j195 = (j164 * 136657) + j190;
        long j196 = (j193 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j197 = (j164 * 470296) + (j168 * 666643) + j92 + j196;
        long j198 = j193 - (j196 << 21);
        long j199 = (j194 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j200 = (j189 - (j164 * 997805)) + j199;
        long j201 = j194 - (j199 << 21);
        long j202 = (j195 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j203 = (j191 - (j164 * 683901)) + j202;
        long j204 = j195 - (j202 << 21);
        long j205 = (j192 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j206 = j187 + j205;
        long j207 = j192 - (j205 << 21);
        long j208 = (j184 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j209 = j179 + j208;
        long j210 = j184 - (j208 << 21);
        long j211 = (j174 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j212 = j165 + j211;
        long j213 = j174 - (j211 << 21);
        long j214 = (j197 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j215 = j201 + j214;
        long j216 = j197 - (j214 << 21);
        long j217 = (j200 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j218 = j204 + j217;
        long j219 = j200 - (j217 << 21);
        long j220 = (j203 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j221 = j207 + j220;
        long j222 = j203 - (j220 << 21);
        long j223 = (j206 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j224 = j210 + j223;
        long j225 = j206 - (j223 << 21);
        long j226 = (j209 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j227 = j213 + j226;
        long j228 = j209 - (j226 << 21);
        long j229 = (j212 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j230 = (j229 * 666643) + j198;
        long j231 = (j229 * 470296) + j216;
        long j232 = (j229 * 654183) + j215;
        long j233 = (j229 * 136657) + j218;
        long j234 = j230 >> 21;
        long j235 = j231 + j234;
        long j236 = j230 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j232 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = (j219 - (j229 * 997805)) + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = j233 + j243;
        long j245 = j241 - (j243 << 21);
        long j246 = j244 >> 21;
        long j247 = (j222 - (j229 * 683901)) + j246;
        long j248 = j244 - (j246 << 21);
        long j249 = j247 >> 21;
        long j250 = j221 + j249;
        long j251 = j247 - (j249 << 21);
        long j252 = j250 >> 21;
        long j253 = j225 + j252;
        long j254 = j250 - (j252 << 21);
        long j255 = j253 >> 21;
        long j256 = j224 + j255;
        long j257 = j253 - (j255 << 21);
        long j258 = j256 >> 21;
        long j259 = j228 + j258;
        long j260 = j256 - (j258 << 21);
        long j261 = j259 >> 21;
        long j262 = j227 + j261;
        long j263 = j259 - (j261 << 21);
        long j264 = j262 >> 21;
        long j265 = (j212 - (j229 << 21)) + j264;
        long j266 = j262 - (j264 << 21);
        long j267 = j265 >> 21;
        long j268 = (666643 * j267) + j236;
        long j269 = j268 >> 21;
        long j270 = (470296 * j267) + j239 + j269;
        long j271 = j268 - (j269 << 21);
        long j272 = j270 >> 21;
        long j273 = (654183 * j267) + j242 + j272;
        long j274 = j270 - (j272 << 21);
        long j275 = j273 >> 21;
        long j276 = (j245 - (997805 * j267)) + j275;
        long j277 = j273 - (j275 << 21);
        long j278 = j276 >> 21;
        long j279 = (136657 * j267) + j248 + j278;
        long j280 = j276 - (j278 << 21);
        long j281 = j279 >> 21;
        long j282 = (j251 - (j267 * 683901)) + j281;
        long j283 = j279 - (j281 << 21);
        long j284 = j282 >> 21;
        long j285 = j254 + j284;
        long j286 = j282 - (j284 << 21);
        long j287 = j285 >> 21;
        long j288 = j257 + j287;
        long j289 = j285 - (j287 << 21);
        long j290 = j288 >> 21;
        long j291 = j260 + j290;
        long j292 = j288 - (j290 << 21);
        long j293 = j291 >> 21;
        long j294 = j263 + j293;
        long j295 = j294 >> 21;
        long j296 = j266 + j295;
        long j297 = j294 - (j295 << 21);
        long j298 = j296 >> 21;
        long j299 = (j265 - (j267 << 21)) + j298;
        long j300 = j296 - (j298 << 21);
        bArr[0] = (byte) j271;
        bArr[1] = (byte) (j271 >> 8);
        bArr[2] = (byte) ((j271 >> 16) | (j274 << 5));
        bArr[3] = (byte) (j274 >> 3);
        bArr[4] = (byte) (j274 >> 11);
        bArr[5] = (byte) ((j274 >> 19) | (j277 << 2));
        bArr[6] = (byte) (j277 >> 6);
        bArr[7] = (byte) ((j277 >> 14) | (j280 << 7));
        bArr[8] = (byte) (j280 >> 1);
        bArr[9] = (byte) (j280 >> 9);
        bArr[10] = (byte) ((j280 >> 17) | (j283 << 4));
        bArr[11] = (byte) (j283 >> 4);
        bArr[12] = (byte) (j283 >> 12);
        bArr[13] = (byte) ((j283 >> 20) | (j286 << 1));
        bArr[14] = (byte) (j286 >> 7);
        bArr[15] = (byte) ((j286 >> 15) | (j289 << 6));
        bArr[16] = (byte) (j289 >> 2);
        bArr[17] = (byte) (j289 >> 10);
        bArr[18] = (byte) ((j289 >> 18) | (j292 << 3));
        bArr[19] = (byte) (j292 >> 5);
        bArr[20] = (byte) (j292 >> 13);
        bArr[21] = (byte) (j291 - (j293 << 21));
        bArr[22] = (byte) (r6 >> 8);
        bArr[23] = (byte) ((r6 >> 16) | (j297 << 5));
        bArr[24] = (byte) (j297 >> 3);
        bArr[25] = (byte) (j297 >> 11);
        bArr[26] = (byte) ((j297 >> 19) | (j300 << 2));
        bArr[27] = (byte) (j300 >> 6);
        bArr[28] = (byte) ((j300 >> 14) | (j299 << 7));
        bArr[29] = (byte) (j299 >> 1);
        bArr[30] = (byte) (j299 >> 9);
        bArr[31] = (byte) (j299 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] jArr, long[] jArr2) {
        for (int i12 = 0; i12 < jArr2.length; i12++) {
            jArr[i12] = -jArr2[i12];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        Field25519.square(jArr3, jArr2);
        Field25519.square(jArr4, jArr3);
        Field25519.square(jArr4, jArr4);
        Field25519.mult(jArr4, jArr2, jArr4);
        Field25519.mult(jArr3, jArr3, jArr4);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i12 = 1; i12 < 5; i12++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i13 = 1; i13 < 10; i13++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i14 = 1; i14 < 20; i14++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i15 = 1; i15 < 10; i15++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr4, jArr3);
        for (int i16 = 1; i16 < 50; i16++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr4, jArr4, jArr3);
        Field25519.square(jArr5, jArr4);
        for (int i17 = 1; i17 < 100; i17++) {
            Field25519.square(jArr5, jArr5);
        }
        Field25519.mult(jArr4, jArr5, jArr4);
        Field25519.square(jArr4, jArr4);
        for (int i18 = 1; i18 < 50; i18++) {
            Field25519.square(jArr4, jArr4);
        }
        Field25519.mult(jArr3, jArr4, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.square(jArr3, jArr3);
        Field25519.mult(jArr, jArr3, jArr2);
    }

    private static void reduce(byte[] bArr) {
        long jLoad3 = load3(bArr, 0) & 2097151;
        long jLoad4 = (load4(bArr, 2) >> 5) & 2097151;
        long jLoad32 = (load3(bArr, 5) >> 2) & 2097151;
        long jLoad42 = (load4(bArr, 7) >> 7) & 2097151;
        long jLoad43 = (load4(bArr, 10) >> 4) & 2097151;
        long jLoad33 = (load3(bArr, 13) >> 1) & 2097151;
        long jLoad44 = (load4(bArr, 15) >> 6) & 2097151;
        long jLoad34 = (load3(bArr, 18) >> 3) & 2097151;
        long jLoad35 = load3(bArr, 21) & 2097151;
        long jLoad45 = (load4(bArr, 23) >> 5) & 2097151;
        long jLoad36 = (load3(bArr, 26) >> 2) & 2097151;
        long jLoad46 = (load4(bArr, 28) >> 7) & 2097151;
        long jLoad47 = (load4(bArr, 31) >> 4) & 2097151;
        long jLoad37 = (load3(bArr, 34) >> 1) & 2097151;
        long jLoad48 = (load4(bArr, 36) >> 6) & 2097151;
        long jLoad38 = (load3(bArr, 39) >> 3) & 2097151;
        long jLoad39 = load3(bArr, 42) & 2097151;
        long jLoad49 = (load4(bArr, 44) >> 5) & 2097151;
        long jLoad310 = (load3(bArr, 47) >> 2) & 2097151;
        long jLoad410 = (load4(bArr, 49) >> 7) & 2097151;
        long jLoad411 = (load4(bArr, 52) >> 4) & 2097151;
        long jLoad311 = (load3(bArr, 55) >> 1) & 2097151;
        long jLoad412 = (load4(bArr, 57) >> 6) & 2097151;
        long jLoad413 = load4(bArr, 60) >> 3;
        long j12 = (jLoad413 * 666643) + jLoad46;
        long j13 = (jLoad413 * 470296) + jLoad47;
        long j14 = (jLoad413 * 654183) + jLoad37;
        long j15 = jLoad48 - (jLoad413 * 997805);
        long j16 = (jLoad413 * 136657) + jLoad38;
        long j17 = jLoad39 - (jLoad413 * 683901);
        long j18 = (jLoad412 * 666643) + jLoad36;
        long j19 = (jLoad412 * 470296) + j12;
        long j22 = (jLoad412 * 654183) + j13;
        long j23 = j14 - (jLoad412 * 997805);
        long j24 = (jLoad412 * 136657) + j15;
        long j25 = j16 - (jLoad412 * 683901);
        long j26 = (jLoad311 * 666643) + jLoad45;
        long j27 = (jLoad311 * 470296) + j18;
        long j28 = (jLoad311 * 654183) + j19;
        long j29 = j22 - (jLoad311 * 997805);
        long j32 = (jLoad311 * 136657) + j23;
        long j33 = j24 - (jLoad311 * 683901);
        long j34 = (jLoad411 * 666643) + jLoad35;
        long j35 = (jLoad411 * 470296) + j26;
        long j36 = (jLoad411 * 654183) + j27;
        long j37 = j28 - (jLoad411 * 997805);
        long j38 = (jLoad411 * 136657) + j29;
        long j39 = j32 - (jLoad411 * 683901);
        long j42 = (jLoad410 * 666643) + jLoad34;
        long j43 = (jLoad410 * 470296) + j34;
        long j44 = (jLoad410 * 654183) + j35;
        long j45 = j36 - (jLoad410 * 997805);
        long j46 = (jLoad410 * 136657) + j37;
        long j47 = j38 - (jLoad410 * 683901);
        long j48 = (jLoad310 * 666643) + jLoad44;
        long j49 = (jLoad310 * 470296) + j42;
        long j52 = (jLoad310 * 654183) + j43;
        long j53 = j44 - (jLoad310 * 997805);
        long j54 = (jLoad310 * 136657) + j45;
        long j55 = j46 - (jLoad310 * 683901);
        long j56 = (j48 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j57 = j49 + j56;
        long j58 = j48 - (j56 << 21);
        long j59 = (j52 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j62 = j53 + j59;
        long j63 = j52 - (j59 << 21);
        long j64 = (j54 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j65 = j55 + j64;
        long j66 = j54 - (j64 << 21);
        long j67 = (j47 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j68 = j39 + j67;
        long j69 = j47 - (j67 << 21);
        long j72 = (j33 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j73 = j25 + j72;
        long j74 = j33 - (j72 << 21);
        long j75 = (j17 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j76 = jLoad49 + j75;
        long j77 = j17 - (j75 << 21);
        long j78 = (j57 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j79 = j63 + j78;
        long j82 = j57 - (j78 << 21);
        long j83 = (j62 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j84 = j66 + j83;
        long j85 = j62 - (j83 << 21);
        long j86 = (j65 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j87 = j69 + j86;
        long j88 = j65 - (j86 << 21);
        long j89 = (j68 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j92 = j74 + j89;
        long j93 = j68 - (j89 << 21);
        long j94 = (j73 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j95 = j77 + j94;
        long j96 = j73 - (j94 << 21);
        long j97 = (j76 * 666643) + jLoad33;
        long j98 = (j76 * 470296) + j58;
        long j99 = (j76 * 654183) + j82;
        long j100 = j79 - (j76 * 997805);
        long j101 = (j76 * 136657) + j85;
        long j102 = j84 - (j76 * 683901);
        long j103 = (j95 * 666643) + jLoad43;
        long j104 = (j95 * 470296) + j97;
        long j105 = (j95 * 654183) + j98;
        long j106 = j99 - (j95 * 997805);
        long j107 = (j95 * 136657) + j100;
        long j108 = j101 - (j95 * 683901);
        long j109 = (j96 * 666643) + jLoad42;
        long j110 = (j96 * 470296) + j103;
        long j111 = (j96 * 654183) + j104;
        long j112 = (j96 * 136657) + j106;
        long j113 = j107 - (j96 * 683901);
        long j114 = (j92 * 666643) + jLoad32;
        long j115 = (j92 * 470296) + j109;
        long j116 = (j92 * 654183) + j110;
        long j117 = (j92 * 136657) + (j105 - (j96 * 997805));
        long j118 = (j93 * 666643) + jLoad4;
        long j119 = (j93 * 470296) + j114;
        long j120 = (j93 * 654183) + j115;
        long j121 = j116 - (j93 * 997805);
        long j122 = (j93 * 136657) + (j111 - (j92 * 997805));
        long j123 = j117 - (j93 * 683901);
        long j124 = (j87 * 666643) + jLoad3;
        long j125 = (j87 * 654183) + j119;
        long j126 = (j87 * 136657) + j121;
        long j127 = (j124 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j128 = (j87 * 470296) + j118 + j127;
        long j129 = j124 - (j127 << 21);
        long j130 = (j125 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j131 = (j120 - (j87 * 997805)) + j130;
        long j132 = j125 - (j130 << 21);
        long j133 = (j126 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j134 = (j122 - (j87 * 683901)) + j133;
        long j135 = j126 - (j133 << 21);
        long j136 = (j123 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j137 = (j112 - (j92 * 683901)) + j136;
        long j138 = j123 - (j136 << 21);
        long j139 = (j113 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j140 = j108 + j139;
        long j141 = j113 - (j139 << 21);
        long j142 = (j102 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j143 = j88 + j142;
        long j144 = j102 - (j142 << 21);
        long j145 = (j128 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j146 = j132 + j145;
        long j147 = j128 - (j145 << 21);
        long j148 = (j131 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j149 = j135 + j148;
        long j150 = j131 - (j148 << 21);
        long j151 = (j134 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j152 = j138 + j151;
        long j153 = j134 - (j151 << 21);
        long j154 = (j137 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j158 = (j143 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j159 = (j158 * 666643) + j129;
        long j160 = (j158 * 136657) + j149;
        long j161 = j159 >> 21;
        long j162 = (j158 * 470296) + j147 + j161;
        long j163 = j159 - (j161 << 21);
        long j164 = j162 >> 21;
        long j165 = (j158 * 654183) + j146 + j164;
        long j166 = j162 - (j164 << 21);
        long j167 = j165 >> 21;
        long j168 = (j150 - (j158 * 997805)) + j167;
        long j169 = j165 - (j167 << 21);
        long j170 = j168 >> 21;
        long j171 = j160 + j170;
        long j172 = j168 - (j170 << 21);
        long j173 = j171 >> 21;
        long j174 = (j153 - (j158 * 683901)) + j173;
        long j175 = j171 - (j173 << 21);
        long j176 = j174 >> 21;
        long j177 = j152 + j176;
        long j178 = j174 - (j176 << 21);
        long j179 = j177 >> 21;
        long j180 = j156 + j179;
        long j181 = j177 - (j179 << 21);
        long j182 = j180 >> 21;
        long j183 = j155 + j182;
        long j184 = j180 - (j182 << 21);
        long j185 = j183 >> 21;
        long j186 = (j140 - (j157 << 21)) + j185;
        long j187 = j183 - (j185 << 21);
        long j188 = j186 >> 21;
        long j189 = j144 + j157 + j188;
        long j190 = j186 - (j188 << 21);
        long j191 = j189 >> 21;
        long j192 = (j143 - (j158 << 21)) + j191;
        long j193 = j189 - (j191 << 21);
        long j194 = j192 >> 21;
        long j195 = j192 - (j194 << 21);
        long j196 = (666643 * j194) + j163;
        long j197 = (654183 * j194) + j169;
        long j198 = j172 - (997805 * j194);
        long j199 = (136657 * j194) + j175;
        long j200 = j178 - (j194 * 683901);
        long j201 = j196 >> 21;
        long j202 = (470296 * j194) + j166 + j201;
        long j203 = j202 >> 21;
        long j204 = j197 + j203;
        long j205 = j202 - (j203 << 21);
        long j206 = j204 >> 21;
        long j207 = j198 + j206;
        long j208 = j204 - (j206 << 21);
        long j209 = j207 >> 21;
        long j210 = j199 + j209;
        long j211 = j207 - (j209 << 21);
        long j212 = j210 >> 21;
        long j213 = j200 + j212;
        long j214 = j210 - (j212 << 21);
        long j215 = j213 >> 21;
        long j216 = j181 + j215;
        long j217 = j213 - (j215 << 21);
        long j218 = j216 >> 21;
        long j219 = j184 + j218;
        long j220 = j216 - (j218 << 21);
        long j221 = j219 >> 21;
        long j222 = j187 + j221;
        long j223 = j219 - (j221 << 21);
        long j224 = j222 >> 21;
        long j225 = j190 + j224;
        long j226 = j222 - (j224 << 21);
        long j227 = j225 >> 21;
        long j228 = j193 + j227;
        long j229 = j225 - (j227 << 21);
        long j230 = j228 >> 21;
        long j231 = j195 + j230;
        long j232 = j228 - (j230 << 21);
        bArr[0] = (byte) (j196 - (j201 << 21));
        bArr[1] = (byte) (r2 >> 8);
        bArr[2] = (byte) ((r2 >> 16) | (j205 << 5));
        bArr[3] = (byte) (j205 >> 3);
        bArr[4] = (byte) (j205 >> 11);
        bArr[5] = (byte) ((j205 >> 19) | (j208 << 2));
        bArr[6] = (byte) (j208 >> 6);
        bArr[7] = (byte) ((j208 >> 14) | (j211 << 7));
        bArr[8] = (byte) (j211 >> 1);
        bArr[9] = (byte) (j211 >> 9);
        bArr[10] = (byte) ((j211 >> 17) | (j214 << 4));
        bArr[11] = (byte) (j214 >> 4);
        bArr[12] = (byte) (j214 >> 12);
        bArr[13] = (byte) ((j214 >> 20) | (j217 << 1));
        bArr[14] = (byte) (j217 >> 7);
        bArr[15] = (byte) ((j217 >> 15) | (j220 << 6));
        bArr[16] = (byte) (j220 >> 2);
        bArr[17] = (byte) (j220 >> 10);
        bArr[18] = (byte) ((j220 >> 18) | (j223 << 3));
        bArr[19] = (byte) (j223 >> 5);
        bArr[20] = (byte) (j223 >> 13);
        bArr[21] = (byte) j226;
        bArr[22] = (byte) (j226 >> 8);
        bArr[23] = (byte) ((j226 >> 16) | (j229 << 5));
        bArr[24] = (byte) (j229 >> 3);
        bArr[25] = (byte) (j229 >> 11);
        bArr[26] = (byte) ((j229 >> 19) | (j232 << 2));
        bArr[27] = (byte) (j232 >> 6);
        bArr[28] = (byte) ((j232 >> 14) | (j231 << 7));
        bArr[29] = (byte) (j231 >> 1);
        bArr[30] = (byte) (j231 >> 9);
        bArr[31] = (byte) (j231 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] bArr) {
        int i12;
        byte[] bArr2 = new byte[64];
        int i13 = 0;
        while (true) {
            if (i13 >= 32) {
                break;
            }
            int i14 = i13 * 2;
            bArr2[i14] = (byte) (bArr[i13] & 15);
            bArr2[i14 + 1] = (byte) (((bArr[i13] & 255) >> 4) & 15);
            i13++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < 63) {
            byte b12 = (byte) (bArr2[i15] + i16);
            bArr2[i15] = b12;
            int i17 = (b12 + 8) >> 4;
            bArr2[i15] = (byte) (b12 - (i17 << 4));
            i15++;
            i16 = i17;
        }
        bArr2[63] = (byte) (bArr2[63] + i16);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i12 = 1; i12 < 64; i12 += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i12 / 2, bArr2[i12]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz2 = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz2, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz2, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz2, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz2, partialXYZT));
        for (int i18 = 0; i18 < 64; i18 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i18 / 2, bArr2[i18]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz3 = new XYZ(partialXYZT);
        if (xyz3.isOnCurve()) {
            return xyz3;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] bArr) {
        return scalarMultWithBase(bArr).toBytes();
    }

    private static void select(CachedXYT cachedXYT, int i12, byte b12) {
        int i13 = (b12 & 255) >> 7;
        int i14 = b12 - (((-i13) & b12) << 1);
        CachedXYT[][] cachedXYTArr = Ed25519Constants.B_TABLE;
        cachedXYT.copyConditional(cachedXYTArr[i12][0], eq(i14, 1));
        cachedXYT.copyConditional(cachedXYTArr[i12][1], eq(i14, 2));
        cachedXYT.copyConditional(cachedXYTArr[i12][2], eq(i14, 3));
        cachedXYT.copyConditional(cachedXYTArr[i12][3], eq(i14, 4));
        cachedXYT.copyConditional(cachedXYTArr[i12][4], eq(i14, 5));
        cachedXYT.copyConditional(cachedXYTArr[i12][5], eq(i14, 6));
        cachedXYT.copyConditional(cachedXYTArr[i12][6], eq(i14, 7));
        cachedXYT.copyConditional(cachedXYTArr[i12][7], eq(i14, 8));
        long[] jArrCopyOf = Arrays.copyOf(cachedXYT.yMinusX, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(cachedXYT.yPlusX, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(cachedXYT.t2d, 10);
        neg(jArrCopyOf3, jArrCopyOf3);
        cachedXYT.copyConditional(new CachedXYT(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i13);
    }

    public static byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr3, 32, 32);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(bArrDigest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(bArrCopyOfRange2);
        engineFactory.update(bArr2);
        engineFactory.update(bArrCopyOfRange);
        byte[] bArrDigest2 = engineFactory.digest();
        reduce(bArrDigest2);
        byte[] bArr4 = new byte[32];
        mulAdd(bArr4, bArrDigest2, bArr3, bArrDigest);
        return Bytes.concat(bArrCopyOfRange2, bArr4);
    }

    private static byte[] slide(byte[] bArr) {
        int i12;
        byte[] bArr2 = new byte[256];
        for (int i13 = 0; i13 < 256; i13++) {
            bArr2[i13] = (byte) (1 & ((bArr[i13 >> 3] & 255) >> (i13 & 7)));
        }
        for (int i14 = 0; i14 < 256; i14++) {
            if (bArr2[i14] != 0) {
                for (int i15 = 1; i15 <= 6 && (i12 = i14 + i15) < 256; i15++) {
                    byte b12 = bArr2[i12];
                    if (b12 != 0) {
                        byte b13 = bArr2[i14];
                        if ((b12 << i15) + b13 <= 15) {
                            bArr2[i14] = (byte) (b13 + (b12 << i15));
                            bArr2[i12] = 0;
                        } else if (b13 - (b12 << i15) >= -15) {
                            bArr2[i14] = (byte) (b13 - (b12 << i15));
                            while (true) {
                                if (i12 >= 256) {
                                    break;
                                }
                                if (bArr2[i12] == 0) {
                                    bArr2[i12] = 1;
                                    break;
                                }
                                bArr2[i12] = 0;
                                i12++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void sub(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        long[] jArr2 = partialXYZT.f360683xyz.f360684x;
        XYZ xyz2 = xyzt.f360688xyz;
        Field25519.sum(jArr2, xyz2.f360685y, xyz2.f360684x);
        long[] jArr3 = partialXYZT.f360683xyz.f360685y;
        XYZ xyz3 = xyzt.f360688xyz;
        Field25519.sub(jArr3, xyz3.f360685y, xyz3.f360684x);
        long[] jArr4 = partialXYZT.f360683xyz.f360685y;
        Field25519.mult(jArr4, jArr4, cachedXYT.yPlusX);
        XYZ xyz4 = partialXYZT.f360683xyz;
        Field25519.mult(xyz4.f360686z, xyz4.f360684x, cachedXYT.yMinusX);
        Field25519.mult(partialXYZT.f360682t, xyzt.f360687t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.f360683xyz.f360684x, xyzt.f360688xyz.f360686z);
        long[] jArr5 = partialXYZT.f360683xyz.f360684x;
        Field25519.sum(jArr, jArr5, jArr5);
        XYZ xyz5 = partialXYZT.f360683xyz;
        Field25519.sub(xyz5.f360684x, xyz5.f360686z, xyz5.f360685y);
        XYZ xyz6 = partialXYZT.f360683xyz;
        long[] jArr6 = xyz6.f360685y;
        Field25519.sum(jArr6, xyz6.f360686z, jArr6);
        Field25519.sub(partialXYZT.f360683xyz.f360686z, jArr, partialXYZT.f360682t);
        long[] jArr7 = partialXYZT.f360682t;
        Field25519.sum(jArr7, jArr, jArr7);
    }

    public static boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!isSmallerThanGroupOrder(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr2, 0, 32);
        engineFactory.update(bArr3);
        engineFactory.update(bArr);
        byte[] bArrDigest = engineFactory.digest();
        reduce(bArrDigest);
        byte[] bytes = doubleScalarMultVarTime(bArrDigest, XYZT.fromBytesNegateVarTime(bArr3), bArrCopyOfRange).toBytes();
        for (int i12 = 0; i12 < 32; i12++) {
            if (bytes[i12] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }
}
