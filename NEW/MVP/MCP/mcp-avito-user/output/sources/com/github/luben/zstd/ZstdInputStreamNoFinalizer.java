package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private final BufferPool bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        Native.load();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) {
        this(inputStream, NoPool.INSTANCE);
    }

    private static native long createDStream();

    private native int decompressStream(long j12, byte[] bArr, int i12, byte[] bArr2, int i13);

    private static native int freeDStream(long j12);

    private native int initDStream(long j12);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.release(this.srcByteBuffer);
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i12, int i13) {
        if (i12 >= 0) {
            if (i13 <= bArr.length - i12) {
                int internal = 0;
                if (i13 == 0) {
                    return 0;
                }
                while (internal == 0) {
                    internal = readInternal(bArr, i12, i13);
                }
                return internal;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i13 + " from offset " + i12 + " in buffer of size " + bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        return (int) (r2 - r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readInternal(byte[] r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.ZstdInputStreamNoFinalizer.readInternal(byte[], int, int):int");
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z12) {
        this.isContinuous = z12;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setLongMax(int i12) {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i12);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setRefMultipleDDicts(boolean z12) {
        long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.stream, z12);
        if (Zstd.isError(refMultipleDDicts)) {
            throw new ZstdIOException(refMultipleDDicts);
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j12) {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j12 <= 0) {
            return 0L;
        }
        int iRecommendedDOutSize = (int) recommendedDOutSize();
        if (iRecommendedDOutSize > j12) {
            iRecommendedDOutSize = (int) j12;
        }
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(this.bufferPool, iRecommendedDOutSize);
        try {
            byte[] bArrArray = arrayBackedBuffer.array();
            long j13 = j12;
            while (j13 > 0) {
                int i12 = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j13));
                if (i12 < 0) {
                    break;
                }
                j13 -= i12;
            }
            return j12 - j13;
        } finally {
            this.bufferPool.release(arrayBackedBuffer);
        }
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, BufferPool bufferPool) throws ZstdIOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, srcBuffSize);
        this.srcByteBuffer = arrayBackedBuffer;
        this.src = arrayBackedBuffer.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.stream = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = new byte[1];
            int internal = 0;
            while (internal == 0) {
                internal = readInternal(bArr, 0, 1);
            }
            if (internal != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
        return this;
    }
}
