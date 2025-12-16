package com.facebook.common.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;

@Nullsafe
/* loaded from: classes5.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int e(int i12, int i13, int i14, byte[] bArr);

    boolean isClosed();

    byte l(int i12);

    int size();
}
