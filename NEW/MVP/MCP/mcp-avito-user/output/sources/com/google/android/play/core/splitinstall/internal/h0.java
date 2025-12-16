package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class h0 {
    public static Pair a(RandomAccessFile randomAccessFile, int i12) throws IOException {
        int i13;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i12, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        b(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i13 = -1;
        } else {
            int i14 = iCapacity - 22;
            int iMin = Math.min(i14, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i15 = 0; i15 < iMin; i15++) {
                i13 = i14 - i15;
                if (byteBufferAllocate.getInt(i13) == 101010256 && ((char) byteBufferAllocate.getShort(i13 + 20)) == i15) {
                    break;
                }
            }
            i13 = -1;
        }
        if (i13 == -1) {
            return null;
        }
        byteBufferAllocate.position(i13);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i13));
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
