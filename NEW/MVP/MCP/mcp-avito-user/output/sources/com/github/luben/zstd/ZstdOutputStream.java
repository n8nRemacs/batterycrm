package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class ZstdOutputStream extends FilterOutputStream {
    private ZstdOutputStreamNoFinalizer inner;

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i12, boolean z12, boolean z13) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i12);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z12);
        this.inner.setChecksum(z13);
    }

    public static long recommendedCOutSize() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.inner.flush();
    }

    public ZstdOutputStream setChainLog(int i12) {
        this.inner.setChainLog(i12);
        return this;
    }

    public ZstdOutputStream setChecksum(boolean z12) {
        this.inner.setChecksum(z12);
        return this;
    }

    public ZstdOutputStream setCloseFrameOnFlush(boolean z12) {
        this.inner.setCloseFrameOnFlush(z12);
        return this;
    }

    public ZstdOutputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdOutputStream setHashLog(int i12) {
        this.inner.setHashLog(i12);
        return this;
    }

    public ZstdOutputStream setJobSize(int i12) {
        this.inner.setJobSize(i12);
        return this;
    }

    public ZstdOutputStream setLevel(int i12) {
        this.inner.setLevel(i12);
        return this;
    }

    public ZstdOutputStream setLong(int i12) {
        this.inner.setLong(i12);
        return this;
    }

    public ZstdOutputStream setMinMatch(int i12) {
        this.inner.setMinMatch(i12);
        return this;
    }

    public ZstdOutputStream setOverlapLog(int i12) {
        this.inner.setOverlapLog(i12);
        return this;
    }

    public ZstdOutputStream setSearchLog(int i12) {
        this.inner.setSearchLog(i12);
        return this;
    }

    public ZstdOutputStream setStrategy(int i12) {
        this.inner.setStrategy(i12);
        return this;
    }

    public ZstdOutputStream setTargetLength(int i12) {
        this.inner.setTargetLength(i12);
        return this;
    }

    public ZstdOutputStream setWindowLog(int i12) {
        this.inner.setWindowLog(i12);
        return this;
    }

    public ZstdOutputStream setWorkers(int i12) {
        this.inner.setWorkers(i12);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i12, int i13) {
        this.inner.write(bArr, i12, i13);
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i12) {
        this.inner.write(i12);
    }

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i12, boolean z12) {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i12);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z12);
    }

    public ZstdOutputStream(OutputStream outputStream, int i12) {
        this(outputStream, NoPool.INSTANCE);
        this.inner.setLevel(i12);
    }

    public ZstdOutputStream(OutputStream outputStream) {
        this(outputStream, NoPool.INSTANCE);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool, int i12) {
        this(outputStream, bufferPool);
        this.inner.setLevel(i12);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool) {
        super(outputStream);
        this.inner = new ZstdOutputStreamNoFinalizer(outputStream, bufferPool);
    }

    @Deprecated
    public void setFinalize(boolean z12) {
    }
}
