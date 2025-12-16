package ru.cyberity.input.tools.hashers;

import Y61.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: MurMur3x64x128Hasher.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/cyberity/fingerprint/tools/hashers/b;", "Lru/cyberity/fingerprint/tools/hashers/a;", "", "data", "", "length", "", "seed", "", "a", "k1Prev", "b", "k2Prev", "c", "kPrev", "", "J", "X64_128_C1", "X64_128_C2", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long X64_128_C1 = -8663945395140668459L;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long X64_128_C2 = 5545529020109919103L;

    private final long a(long kPrev) {
        long j12 = (kPrev ^ (kPrev >>> 33)) * (-49064778989728563L);
        long j13 = (j12 ^ (j12 >>> 33)) * (-4265267296055464877L);
        return j13 ^ (j13 >>> 33);
    }

    private final long b(long k1Prev) {
        return Long.rotateLeft(k1Prev * this.X64_128_C1, 31) * this.X64_128_C2;
    }

    private final long c(long k2Prev) {
        return Long.rotateLeft(k2Prev * this.X64_128_C2, 33) * this.X64_128_C1;
    }

    @Override // ru.cyberity.input.tools.hashers.a
    @k
    public String a(@k String data) {
        long[] jArrA = a(this, data.getBytes(C43047d.f410591d), data.length(), 0L, 4, null);
        StringBuilder sb2 = new StringBuilder();
        for (long j12 : jArrA) {
            sb2.append(Long.toHexString(j12));
        }
        return sb2.toString();
    }

    public static /* synthetic */ long[] a(b bVar, byte[] bArr, int i12, long j12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j12 = 0;
        }
        return bVar.a(bArr, i12, j12);
    }

    private final long[] a(byte[] data, int length, long seed) {
        long j12;
        long j13;
        long j14;
        byte b12;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        long jC2 = seed;
        long jB2 = jC2;
        while (byteBufferWrap.remaining() >= 16) {
            long j15 = byteBufferWrap.getLong();
            long j16 = byteBufferWrap.getLong();
            long j17 = 5;
            jB2 = ((Long.rotateLeft(jB2 ^ b(j15), 27) + jC2) * j17) + 1390208809;
            jC2 = ((Long.rotateLeft(jC2 ^ c(j16), 31) + jB2) * j17) + 944331445;
        }
        byteBufferWrap.compact();
        byteBufferWrap.flip();
        if (byteBufferWrap.remaining() > 0) {
            long j18 = 0;
            switch (byteBufferWrap.remaining()) {
                case 1:
                    j12 = byteBufferWrap.get(0) & 255;
                    long j19 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j19);
                    break;
                case 2:
                    j13 = (byteBufferWrap.get(1) & 255) << 8;
                    j14 = byteBufferWrap.get(0);
                    j12 = j13 ^ (j14 & 255);
                    long j192 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j192);
                    break;
                case 3:
                    j12 = (((byteBufferWrap.get(2) & 255) << 16) ^ ((byteBufferWrap.get(1) & 255) << 8)) ^ (byteBufferWrap.get(0) & 255);
                    long j1922 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j1922);
                    break;
                case 4:
                    j13 = (((byteBufferWrap.get(3) & 255) << 24) ^ ((byteBufferWrap.get(2) & 255) << 16)) ^ ((byteBufferWrap.get(1) & 255) << 8);
                    b12 = byteBufferWrap.get(0);
                    j14 = b12;
                    j12 = j13 ^ (j14 & 255);
                    long j19222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j19222);
                    break;
                case 5:
                    j13 = ((((byteBufferWrap.get(4) & 255) << 32) ^ ((byteBufferWrap.get(3) & 255) << 24)) ^ ((byteBufferWrap.get(2) & 255) << 16)) ^ ((byteBufferWrap.get(1) & 255) << 8);
                    b12 = byteBufferWrap.get(0);
                    j14 = b12;
                    j12 = j13 ^ (j14 & 255);
                    long j192222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j192222);
                    break;
                case 6:
                    j13 = (((((byteBufferWrap.get(5) & 255) << 40) ^ ((byteBufferWrap.get(4) & 255) << 32)) ^ ((byteBufferWrap.get(3) & 255) << 24)) ^ ((byteBufferWrap.get(2) & 255) << 16)) ^ ((byteBufferWrap.get(1) & 255) << 8);
                    b12 = byteBufferWrap.get(0);
                    j14 = b12;
                    j12 = j13 ^ (j14 & 255);
                    long j1922222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j1922222);
                    break;
                case 7:
                    j13 = ((((((byteBufferWrap.get(6) & 255) << 48) ^ ((byteBufferWrap.get(5) & 255) << 40)) ^ ((byteBufferWrap.get(4) & 255) << 32)) ^ ((byteBufferWrap.get(3) & 255) << 24)) ^ ((byteBufferWrap.get(2) & 255) << 16)) ^ ((byteBufferWrap.get(1) & 255) << 8);
                    b12 = byteBufferWrap.get(0);
                    j14 = b12;
                    j12 = j13 ^ (j14 & 255);
                    long j19222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j19222222);
                    break;
                case 8:
                    j12 = byteBufferWrap.getLong();
                    long j192222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j192222222);
                    break;
                case 9:
                    j18 = byteBufferWrap.get(8) & 255;
                    j12 = byteBufferWrap.getLong();
                    long j1922222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j1922222222);
                    break;
                case 10:
                    j18 = ((byteBufferWrap.get(9) & 255) << 8) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j19222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j19222222222);
                    break;
                case 11:
                    j18 = (((byteBufferWrap.get(10) & 255) << 16) ^ ((byteBufferWrap.get(9) & 255) << 8)) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j192222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j192222222222);
                    break;
                case 12:
                    j18 = ((((byteBufferWrap.get(10) & 255) << 16) ^ ((byteBufferWrap.get(11) & 255) << 24)) ^ ((byteBufferWrap.get(9) & 255) << 8)) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j1922222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j1922222222222);
                    break;
                case 13:
                    j18 = ((((byteBufferWrap.get(10) & 255) << 16) ^ (((byteBufferWrap.get(12) & 255) << 32) ^ ((byteBufferWrap.get(11) & 255) << 24))) ^ ((byteBufferWrap.get(9) & 255) << 8)) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j19222222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j19222222222222);
                    break;
                case 14:
                    j18 = ((((byteBufferWrap.get(10) & 255) << 16) ^ ((((byteBufferWrap.get(13) & 255) << 40) ^ ((byteBufferWrap.get(12) & 255) << 32)) ^ ((byteBufferWrap.get(11) & 255) << 24))) ^ ((byteBufferWrap.get(9) & 255) << 8)) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j192222222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j192222222222222);
                    break;
                case 15:
                    j18 = ((((byteBufferWrap.get(10) & 255) << 16) ^ (((((byteBufferWrap.get(14) & 255) << 48) ^ ((byteBufferWrap.get(13) & 255) << 40)) ^ ((byteBufferWrap.get(12) & 255) << 32)) ^ ((byteBufferWrap.get(11) & 255) << 24))) ^ ((byteBufferWrap.get(9) & 255) << 8)) ^ (byteBufferWrap.get(8) & 255);
                    j12 = byteBufferWrap.getLong();
                    long j1922222222222222 = j18;
                    jB2 ^= b(j12);
                    jC2 ^= c(j1922222222222222);
                    break;
                default:
                    throw new AssertionError("Code should not reach here!");
            }
        }
        long j22 = length;
        long j23 = jB2 ^ j22;
        long j24 = j22 ^ jC2;
        long j25 = j23 + j24;
        long j26 = j24 + j25;
        long jA2 = a(j25);
        long jA3 = a(j26);
        long j27 = jA2 + jA3;
        return new long[]{j27, jA3 + j27};
    }
}
