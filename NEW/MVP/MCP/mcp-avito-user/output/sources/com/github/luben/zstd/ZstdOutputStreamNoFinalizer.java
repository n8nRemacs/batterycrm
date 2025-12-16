package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    private static final int dstSize;
    private final BufferPool bufferPool;
    private boolean closeFrameOnFlush;
    private final byte[] dst;
    private final ByteBuffer dstByteBuffer;
    private long dstPos;
    private boolean frameClosed;
    private boolean frameStarted;
    private boolean isClosed;
    private long srcPos;
    private final long stream;

    static {
        Native.load();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i12) {
        this(outputStream, NoPool.INSTANCE);
        Zstd.setCompressionLevel(this.stream, i12);
    }

    private native int compressStream(long j12, byte[] bArr, int i12, byte[] bArr2, int i13);

    private static native long createCStream();

    private native int endStream(long j12, byte[] bArr, int i12);

    private native int flushStream(long j12, byte[] bArr, int i12);

    private static native int freeCStream(long j12);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j12);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() {
        close(false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        int iFlushStream;
        int iEndStream;
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (!this.frameClosed) {
                if (this.closeFrameOnFlush) {
                    do {
                        iEndStream = endStream(this.stream, this.dst, dstSize);
                        long j12 = iEndStream;
                        if (Zstd.isError(j12)) {
                            throw new ZstdIOException(j12);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (iEndStream > 0);
                    this.frameClosed = true;
                } else {
                    do {
                        iFlushStream = flushStream(this.stream, this.dst, dstSize);
                        long j13 = iFlushStream;
                        if (Zstd.isError(j13)) {
                            throw new ZstdIOException(j13);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (iFlushStream > 0);
                }
                ((FilterOutputStream) this).out.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChainLog(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChainLog = Zstd.setCompressionChainLog(this.stream, i12);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdIOException(compressionChainLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChecksums = Zstd.setCompressionChecksums(this.stream, z12);
            if (Zstd.isError(compressionChecksums)) {
                throw new ZstdIOException(compressionChecksums);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z12) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.closeFrameOnFlush = z12;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long jLoadDictCompress = Zstd.loadDictCompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(jLoadDictCompress)) {
                throw new ZstdIOException(jLoadDictCompress);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setHashLog(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionHashLog = Zstd.setCompressionHashLog(this.stream, i12);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdIOException(compressionHashLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setJobSize(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionJobSize = Zstd.setCompressionJobSize(this.stream, i12);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdIOException(compressionJobSize);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLevel = Zstd.setCompressionLevel(this.stream, i12);
            if (Zstd.isError(compressionLevel)) {
                throw new ZstdIOException(compressionLevel);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLong = Zstd.setCompressionLong(this.stream, i12);
            if (Zstd.isError(compressionLong)) {
                throw new ZstdIOException(compressionLong);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setMinMatch(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.stream, i12);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdIOException(compressionMinMatch);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setOverlapLog(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.stream, i12);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdIOException(compressionOverlapLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setSearchLog(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.stream, i12);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdIOException(compressionSearchLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setStrategy(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionStrategy = Zstd.setCompressionStrategy(this.stream, i12);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdIOException(compressionStrategy);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setTargetLength(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.stream, i12);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdIOException(compressionTargetLength);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWindowLog(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.stream, i12);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdIOException(compressionWindowLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i12) {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWorkers = Zstd.setCompressionWorkers(this.stream, i12);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdIOException(compressionWorkers);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i12, int i13) {
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (this.frameClosed) {
                long jResetCStream = resetCStream(this.stream);
                if (Zstd.isError(jResetCStream)) {
                    throw new ZstdIOException(jResetCStream);
                }
                this.frameClosed = false;
                this.frameStarted = true;
            }
            int i14 = i13 + i12;
            this.srcPos = i12;
            while (this.srcPos < i14) {
                long jCompressStream = compressStream(this.stream, this.dst, dstSize, bArr, i14);
                if (Zstd.isError(jCompressStream)) {
                    throw new ZstdIOException(jCompressStream);
                }
                long j12 = this.dstPos;
                if (j12 > 0) {
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) j12);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) {
        this(outputStream, NoPool.INSTANCE);
    }

    private void close(boolean z12) {
        int iEndStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameStarted) {
                long jResetCStream = resetCStream(this.stream);
                if (!Zstd.isError(jResetCStream)) {
                    this.frameClosed = false;
                } else {
                    throw new ZstdIOException(jResetCStream);
                }
            }
            if (!this.frameClosed) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j12 = iEndStream;
                    if (!Zstd.isError(j12)) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } else {
                        throw new ZstdIOException(j12);
                    }
                } while (iEndStream > 0);
            }
            if (z12) {
                ((FilterOutputStream) this).out.close();
            }
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
        } catch (Throwable th2) {
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
            throw th2;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool, int i12) {
        this(outputStream, bufferPool);
        Zstd.setCompressionLevel(this.stream, i12);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool) throws ZstdIOException {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.isClosed = false;
        this.closeFrameOnFlush = false;
        this.frameClosed = true;
        this.frameStarted = false;
        this.stream = createCStream();
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, dstSize);
        this.dstByteBuffer = arrayBackedBuffer;
        this.dst = arrayBackedBuffer.array();
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        try {
            if (this.frameClosed) {
                long jLoadFastDictCompress = Zstd.loadFastDictCompress(this.stream, zstdDictCompress);
                if (Zstd.isError(jLoadFastDictCompress)) {
                    throw new ZstdIOException(jLoadFastDictCompress);
                }
            } else {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i12) {
        write(new byte[]{(byte) i12}, 0, 1);
    }
}
