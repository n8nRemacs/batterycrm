package com.google.common.hash;

import com.google.common.hash.q;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Murmur3_128HashFunction.java */
@InterfaceC37497l
@aZ0.j
/* loaded from: classes6.dex */
final class G extends AbstractC37489d implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r f360205c = new G(0);
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f360206b;

    /* compiled from: Murmur3_128HashFunction.java */
    public static final class a extends AbstractC37492g {

        /* renamed from: d, reason: collision with root package name */
        public long f360207d;

        /* renamed from: e, reason: collision with root package name */
        public long f360208e;

        /* renamed from: f, reason: collision with root package name */
        public int f360209f;

        @Override // com.google.common.hash.AbstractC37492g
        public final q j() {
            long j12 = this.f360207d;
            long j13 = this.f360209f;
            long j14 = j12 ^ j13;
            long j15 = j13 ^ this.f360208e;
            long j16 = j14 + j15;
            long j17 = j15 + j16;
            long j18 = (j16 ^ (j16 >>> 33)) * (-49064778989728563L);
            long j19 = (j18 ^ (j18 >>> 33)) * (-4265267296055464877L);
            long j22 = (j17 ^ (j17 >>> 33)) * (-49064778989728563L);
            long j23 = (j22 ^ (j22 >>> 33)) * (-4265267296055464877L);
            long j24 = j23 ^ (j23 >>> 33);
            long j25 = (j19 ^ (j19 >>> 33)) + j24;
            this.f360207d = j25;
            this.f360208e = j24 + j25;
            byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f360207d).putLong(this.f360208e).array();
            char[] cArr = q.f360281b;
            return new q.a(bArrArray);
        }

        @Override // com.google.common.hash.AbstractC37492g
        public final void m(ByteBuffer byteBuffer) {
            long j12 = byteBuffer.getLong();
            long j13 = byteBuffer.getLong();
            long jRotateLeft = (Long.rotateLeft(j12 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
            this.f360207d = jRotateLeft;
            long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
            long j14 = this.f360208e;
            this.f360207d = ((jRotateLeft2 + j14) * 5) + 1390208809;
            long jRotateLeft3 = (Long.rotateLeft(j13 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j14;
            this.f360208e = jRotateLeft3;
            this.f360208e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f360207d) * 5) + 944331445;
            this.f360209f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractC37492g
        public final void n(ByteBuffer byteBuffer) {
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            long j17;
            long j18;
            this.f360209f = byteBuffer.remaining() + this.f360209f;
            long j19 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j12 = 0;
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 2:
                    j13 = 0;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 3:
                    j14 = 0;
                    j13 = ((byteBuffer.get(2) & 255) << 16) ^ j14;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 4:
                    j15 = 0;
                    j14 = j15 ^ ((byteBuffer.get(3) & 255) << 24);
                    j13 = ((byteBuffer.get(2) & 255) << 16) ^ j14;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 5:
                    j16 = 0;
                    j15 = j16 ^ ((byteBuffer.get(4) & 255) << 32);
                    j14 = j15 ^ ((byteBuffer.get(3) & 255) << 24);
                    j13 = ((byteBuffer.get(2) & 255) << 16) ^ j14;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 6:
                    j17 = 0;
                    j16 = ((byteBuffer.get(5) & 255) << 40) ^ j17;
                    j15 = j16 ^ ((byteBuffer.get(4) & 255) << 32);
                    j14 = j15 ^ ((byteBuffer.get(3) & 255) << 24);
                    j13 = ((byteBuffer.get(2) & 255) << 16) ^ j14;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 7:
                    j17 = (byteBuffer.get(6) & 255) << 48;
                    j16 = ((byteBuffer.get(5) & 255) << 40) ^ j17;
                    j15 = j16 ^ ((byteBuffer.get(4) & 255) << 32);
                    j14 = j15 ^ ((byteBuffer.get(3) & 255) << 24);
                    j13 = ((byteBuffer.get(2) & 255) << 16) ^ j14;
                    j12 = j13 ^ ((byteBuffer.get(1) & 255) << 8);
                    j18 = j12 ^ (byteBuffer.get(0) & 255);
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 8:
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 9:
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 10:
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 11:
                    j19 ^= (byteBuffer.get(10) & 255) << 16;
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 12:
                    j19 ^= (byteBuffer.get(11) & 255) << 24;
                    j19 ^= (byteBuffer.get(10) & 255) << 16;
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 13:
                    j19 ^= (byteBuffer.get(12) & 255) << 32;
                    j19 ^= (byteBuffer.get(11) & 255) << 24;
                    j19 ^= (byteBuffer.get(10) & 255) << 16;
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 14:
                    j19 ^= (byteBuffer.get(13) & 255) << 40;
                    j19 ^= (byteBuffer.get(12) & 255) << 32;
                    j19 ^= (byteBuffer.get(11) & 255) << 24;
                    j19 ^= (byteBuffer.get(10) & 255) << 16;
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                case 15:
                    j19 = (byteBuffer.get(14) & 255) << 48;
                    j19 ^= (byteBuffer.get(13) & 255) << 40;
                    j19 ^= (byteBuffer.get(12) & 255) << 32;
                    j19 ^= (byteBuffer.get(11) & 255) << 24;
                    j19 ^= (byteBuffer.get(10) & 255) << 16;
                    j19 ^= (byteBuffer.get(9) & 255) << 8;
                    j19 ^= byteBuffer.get(8) & 255;
                    j18 = byteBuffer.getLong();
                    this.f360207d = (Long.rotateLeft(j18 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f360207d;
                    this.f360208e ^= Long.rotateLeft(j19 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    static {
        new G(t.f360285a);
    }

    public G(int i12) {
        this.f360206b = i12;
    }

    @Override // com.google.common.hash.r
    public final s a() {
        a aVar = new a(16);
        long j12 = this.f360206b;
        aVar.f360207d = j12;
        aVar.f360208e = j12;
        aVar.f360209f = 0;
        return aVar;
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 128;
    }

    public final boolean equals(@I41.a Object obj) {
        return (obj instanceof G) && this.f360206b == ((G) obj).f360206b;
    }

    public final int hashCode() {
        return G.class.hashCode() ^ this.f360206b;
    }

    public final String toString() {
        return AK.c.i(this.f360206b, ")", new StringBuilder("Hashing.murmur3_128("));
    }
}
