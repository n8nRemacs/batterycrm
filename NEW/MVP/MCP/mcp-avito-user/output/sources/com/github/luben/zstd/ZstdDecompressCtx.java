package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class ZstdDecompressCtx extends AutoCloseBase {
    private ZstdDictDecompress decompression_dict = null;
    private long nativePtr;

    static {
        Native.load();
    }

    public ZstdDecompressCtx() {
        this.nativePtr = 0L;
        long jInit = init();
        this.nativePtr = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
        }
        storeFence();
    }

    private static native long decompressByteArray0(long j12, byte[] bArr, int i12, int i13, byte[] bArr2, int i14, int i15);

    private static native long decompressDirectByteBuffer0(long j12, ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15);

    private static native long decompressDirectByteBufferStream0(long j12, ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    private static native void free(long j12);

    private static native long init();

    private static native long loadDDict0(long j12, byte[] bArr);

    private static native long loadDDictFast0(long j12, ZstdDictDecompress zstdDictDecompress);

    private static native void reset0(long j12);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iDecompressDirectByteBuffer = decompressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iDecompressDirectByteBuffer);
        return iDecompressDirectByteBuffer;
    }

    public int decompressByteArray(byte[] bArr, int i12, int i13, byte[] bArr2, int i14, int i15) {
        Objects.checkFromIndexSize(i14, i15, bArr2.length);
        Objects.checkFromIndexSize(i12, i13, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressByteArray0 = decompressByteArray0(this.nativePtr, bArr, i12, i13, bArr2, i14, i15);
            if (Zstd.isError(jDecompressByteArray0)) {
                throw new ZstdException(jDecompressByteArray0);
            }
            if (jDecompressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i16 = (int) jDecompressByteArray0;
            releaseSharedLock();
            return i16;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int decompressDirectByteBuffer(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15) {
        ensureOpen();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i14, i15, byteBuffer2.limit());
        Objects.checkFromIndexSize(i12, i13, byteBuffer.limit());
        acquireSharedLock();
        try {
            long jDecompressDirectByteBuffer0 = decompressDirectByteBuffer0(this.nativePtr, byteBuffer, i12, i13, byteBuffer2, i14, i15);
            if (Zstd.isError(jDecompressDirectByteBuffer0)) {
                throw new ZstdException(jDecompressDirectByteBuffer0);
            }
            if (jDecompressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i16 = (int) jDecompressDirectByteBuffer0;
            releaseSharedLock();
            return i16;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public boolean decompressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ensureOpen();
        long jDecompressDirectByteBufferStream0 = decompressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit());
        if ((2147483648L & jDecompressDirectByteBufferStream0) != 0) {
            long j12 = 255 & jDecompressDirectByteBufferStream0;
            throw new ZstdException(j12, Zstd.getErrorName(j12));
        }
        byteBuffer2.position((int) (2147483647L & jDecompressDirectByteBufferStream0));
        byteBuffer.position(((int) (jDecompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
        return (jDecompressDirectByteBufferStream0 >>> 63) == 1;
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        long j12 = this.nativePtr;
        if (j12 != 0) {
            free(j12);
            this.nativePtr = 0L;
        }
    }

    public ZstdDecompressCtx loadDict(ZstdDictDecompress zstdDictDecompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadDDictFast0 = loadDDictFast0(this.nativePtr, zstdDictDecompress);
            if (Zstd.isError(jLoadDDictFast0)) {
                throw new ZstdException(jLoadDDictFast0);
            }
            this.decompression_dict = zstdDictDecompress;
            return this;
        } finally {
            zstdDictDecompress.releaseSharedLock();
            releaseSharedLock();
        }
    }

    public void reset() {
        ensureOpen();
        reset0(this.nativePtr);
    }

    public ZstdDecompressCtx setMagicless(boolean z12) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setDecompressionMagicless(this.nativePtr, z12);
        releaseSharedLock();
        return this;
    }

    public ByteBuffer decompress(ByteBuffer byteBuffer, int i12) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i12);
        decompressDirectByteBuffer(byteBufferAllocateDirect, 0, i12, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return byteBufferAllocateDirect;
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] decompress(byte[] bArr, int i12) {
        if (i12 >= 0) {
            byte[] bArr2 = new byte[i12];
            int iDecompress = decompress(bArr2, bArr);
            return iDecompress != i12 ? Arrays.copyOfRange(bArr2, 0, iDecompress) : bArr2;
        }
        throw new ZstdException(Zstd.errGeneric(), "Original size should not be negative");
    }

    public ZstdDecompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jLoadDDict0 = loadDDict0(this.nativePtr, bArr);
            if (!Zstd.isError(jLoadDDict0)) {
                this.decompression_dict = null;
                return this;
            }
            throw new ZstdException(jLoadDDict0);
        } finally {
            releaseSharedLock();
        }
    }
}
