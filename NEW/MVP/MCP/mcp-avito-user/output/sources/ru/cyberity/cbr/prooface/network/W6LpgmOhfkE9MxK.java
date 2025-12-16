package ru.cyberity.cbr.prooface.network;

import Y61.k;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ranges.s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J7\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0004\u0010\rJ\u0016\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bR\u0016\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/prooface/network/W6LpgmOhfkE9MxK;", "", "", "bits", "AnZ4ntgRZiVOQFYAd", "", "bytes", "offset", "length", "", "xorKey", "", "shuffleKey", "([BIIBJ)[B", "counter", "key", "seed", "Ljava/util/concurrent/atomic/AtomicLong;", "uz93gWN1OYgIQ", "Ljava/util/concurrent/atomic/AtomicLong;", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class W6LpgmOhfkE9MxK {

    @k
    public static final W6LpgmOhfkE9MxK AnZ4ntgRZiVOQFYAd = new W6LpgmOhfkE9MxK();

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @k
    private static AtomicLong seed = new AtomicLong(0);

    private W6LpgmOhfkE9MxK() {
    }

    public final int AnZ4ntgRZiVOQFYAd(long counter, long key) {
        long j12 = counter * key;
        long j13 = (j12 * j12) + j12;
        long j14 = (j13 << 32) | (j13 >>> 32);
        long j15 = (j14 * j14) + key + j12;
        long j16 = (j15 >>> 32) | (j15 << 32);
        return (int) (((j16 * j16) + j12) >>> 32);
    }

    @k
    public final byte[] AnZ4ntgRZiVOQFYAd(@k byte[] bytes, int offset, int length, byte xorKey, long shuffleKey) {
        int i12 = length - 1;
        for (int i13 = 0; i13 <= i12; i13++) {
            int iAbs = Math.abs(AnZ4ntgRZiVOQFYAd(i13, shuffleKey));
            if (i13 < i12) {
                int i14 = offset + i13;
                byte b12 = bytes[i14];
                int i15 = (iAbs % (length - i13)) + i13 + offset;
                bytes[i14] = bytes[i15];
                bytes[i15] = b12;
            }
            int i16 = offset + i13;
            bytes[i16] = (byte) (bytes[i16] ^ (((xorKey + i13) + iAbs) + 1));
        }
        return bytes;
    }

    @k
    public final byte[] AnZ4ntgRZiVOQFYAd(long seed2) {
        seed = new AtomicLong(seed2);
        Integer[] numArr = new Integer[15];
        int i12 = 0;
        for (int i13 = 0; i13 < 15; i13++) {
            numArr[i13] = Integer.valueOf(AnZ4ntgRZiVOQFYAd.AnZ4ntgRZiVOQFYAd());
        }
        int iIntValue = numArr[0].intValue();
        kotlin.ranges.k it = s.r(1, 5).iterator();
        while (it.f406910d) {
            int iA2 = it.a() * 3;
            if (numArr[iA2].intValue() > iIntValue) {
                iIntValue = numArr[iA2].intValue();
                i12 = iA2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(numArr[i12].intValue());
        byteBufferAllocate.putInt(numArr[i12 + 1].intValue());
        byteBufferAllocate.putInt(numArr[i12 + 2].intValue());
        return byteBufferAllocate.array();
    }

    private final int AnZ4ntgRZiVOQFYAd(int bits) {
        long j12;
        long j13;
        AtomicLong atomicLong = seed;
        do {
            j12 = atomicLong.get();
            j13 = ((25214903917L * j12) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j12, j13));
        return (int) (j13 >>> (48 - bits));
    }

    private final int AnZ4ntgRZiVOQFYAd() {
        return AnZ4ntgRZiVOQFYAd(32);
    }
}
