package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class ZstdInputStream extends FilterInputStream {
    private ZstdInputStreamNoFinalizer inner;

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.inner.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public void finalize() {
        close();
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i12, int i13) {
        return this.inner.read(bArr, i12, i13);
    }

    public ZstdInputStream setContinuous(boolean z12) {
        this.inner.setContinuous(z12);
        return this;
    }

    public ZstdInputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdInputStream setLongMax(int i12) {
        this.inner.setLongMax(i12);
        return this;
    }

    public ZstdInputStream setRefMultipleDDicts(boolean z12) {
        this.inner.setRefMultipleDDicts(z12);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j12) {
        return this.inner.skip(j12);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return this.inner.read();
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ZstdInputStream(InputStream inputStream, BufferPool bufferPool) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream, bufferPool);
    }

    @Deprecated
    public void setFinalize(boolean z12) {
    }
}
