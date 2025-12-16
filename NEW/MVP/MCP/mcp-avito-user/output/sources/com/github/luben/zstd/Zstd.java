package com.github.luben.zstd;

import androidx.camera.camera2.internal.G;
import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class Zstd {

    public enum ParamSwitch {
        AUTO(0),
        ENABLE(1),
        DISABLE(2);

        private int val;

        ParamSwitch(int i12) {
            this.val = i12;
        }

        public int getValue() {
            return this.val;
        }
    }

    static {
        Native.load();
    }

    public static native int blockSizeMax();

    public static native int chainLogMax();

    public static native int chainLogMin();

    public static long compress(byte[] bArr, byte[] bArr2, int i12, boolean z12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i12);
            zstdCompressCtx.setChecksum(z12);
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static native long compressBound(long j12);

    public static long compressByteArray(byte[] bArr, int i12, int i13, byte[] bArr2, int i14, int i15, int i16, boolean z12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i16);
            zstdCompressCtx.setChecksum(z12);
            return zstdCompressCtx.compressByteArray(bArr, i12, i13, bArr2, i14, i15);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, int i16, boolean z12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i16);
            zstdCompressCtx.setChecksum(z12);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, byte[] bArr, int i16) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i16);
            zstdCompressCtx.loadDict(bArr);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressFastDict(byte[] bArr, int i12, byte[] bArr2, int i13, int i14, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, i14);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUnsafe(long j12, long j13, long j14, long j15, int i12) {
        return compressUnsafe(j12, j13, j14, j15, i12, false);
    }

    public static native long compressUnsafe(long j12, long j13, long j14, long j15, int i12, boolean z12);

    public static long compressUsingDict(byte[] bArr, int i12, byte[] bArr2, int i13, int i14, byte[] bArr3, int i15) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i15);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, i14);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, bArr2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressByteArray(byte[] bArr, int i12, int i13, byte[] bArr2, int i14, int i15) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressByteArray(bArr, i12, i13, bArr2, i14, i15);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBuffer(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressFastDict(byte[] bArr, int i12, byte[] bArr2, int i13, int i14, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, i14);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static native long decompressUnsafe(long j12, long j13, long j14, long j15);

    public static long decompressUsingDict(byte[] bArr, int i12, byte[] bArr2, int i13, int i14, byte[] bArr3) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr3);
            return zstdDecompressCtx.decompressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, i14);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i12, int i13) {
        return decompressedDirectByteBufferSize(byteBuffer, i12, i13, false);
    }

    @Deprecated
    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i12, int i13, boolean z12);

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i12, int i13, boolean z12) {
        if (i12 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        int i14 = i12 + i13;
        if (i14 <= bArr.length) {
            return decompressedSize0(bArr, i12, i13, z12);
        }
        throw new ArrayIndexOutOfBoundsException(i14);
    }

    private static native long decompressedSize0(byte[] bArr, int i12, int i13, boolean z12);

    public static native int defaultCompressionLevel();

    public static native long errChecksumWrong();

    public static native long errCorruptionDetected();

    public static native long errDictionaryCorrupted();

    public static native long errDictionaryCreationFailed();

    public static native long errDictionaryWrong();

    public static native long errDstBufferNull();

    public static native long errDstSizeTooSmall();

    public static native long errFrameParameterUnsupported();

    public static native long errFrameParameterWindowTooLarge();

    public static native long errGeneric();

    public static native long errInitMissing();

    public static native long errMaxSymbolValueTooLarge();

    public static native long errMaxSymbolValueTooSmall();

    public static native long errMemoryAllocation();

    public static native long errNoError();

    public static native long errParameterOutOfBound();

    public static native long errParameterUnsupported();

    public static native long errPrefixUnknown();

    public static native long errSrcSizeWrong();

    public static native long errStageWrong();

    public static native long errTableLogTooLarge();

    public static native long errVersionUnsupported();

    public static native long errWorkSpaceTooSmall();

    public static native void generateSequences(long j12, long j13, long j14, long j15, long j16);

    public static ByteBuffer getArrayBackedBuffer(BufferPool bufferPool, int i12) throws ZstdIOException {
        ByteBuffer byteBuffer = bufferPool.get(i12);
        if (byteBuffer == null) {
            throw new ZstdIOException(errMemoryAllocation(), G.e(i12, "Cannot get ByteBuffer of size ", " from the BufferPool"));
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer;
        }
        bufferPool.release(byteBuffer);
        throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
    }

    public static native long getBuiltinSequenceProducer();

    public static native long getDictIdFromDict(byte[] bArr);

    public static long getDictIdFromDictDirect(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            return getDictIdFromDictDirect(byteBuffer, byteBuffer.position(), iLimit);
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }

    private static native long getDictIdFromDictDirect(ByteBuffer byteBuffer, int i12, int i13);

    public static native long getDictIdFromFrame(byte[] bArr);

    public static native long getDictIdFromFrameBuffer(ByteBuffer byteBuffer);

    public static long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i12, int i13) {
        return getDirectByteBufferFrameContentSize(byteBuffer, i12, i13, false);
    }

    public static native long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i12, int i13, boolean z12);

    public static native long getErrorCode(long j12);

    public static native String getErrorName(long j12);

    public static long getFrameContentSize(byte[] bArr, int i12, int i13, boolean z12) {
        if (i12 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        int i14 = i12 + i13;
        if (i14 <= bArr.length) {
            return getFrameContentSize0(bArr, i12, i13, z12);
        }
        throw new ArrayIndexOutOfBoundsException(i14);
    }

    private static native long getFrameContentSize0(byte[] bArr, int i12, int i13, boolean z12);

    public static native long getStubSequenceProducer();

    public static native int hashLogMax();

    public static native int hashLogMin();

    public static native boolean isError(long j12);

    public static native int loadDictCompress(long j12, byte[] bArr, int i12);

    public static native int loadDictDecompress(long j12, byte[] bArr, int i12);

    public static native int loadFastDictCompress(long j12, ZstdDictCompress zstdDictCompress);

    public static native int loadFastDictDecompress(long j12, ZstdDictDecompress zstdDictDecompress);

    public static native int magicNumber();

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static native void registerSequenceProducer(long j12, long j13, long j14);

    public static native int searchLengthMax();

    public static native int searchLengthMin();

    public static native int searchLogMax();

    public static native int searchLogMin();

    public static native int setCompressionChainLog(long j12, int i12);

    public static native int setCompressionChecksums(long j12, boolean z12);

    public static native int setCompressionHashLog(long j12, int i12);

    public static native int setCompressionJobSize(long j12, int i12);

    public static native int setCompressionLevel(long j12, int i12);

    public static native int setCompressionLong(long j12, int i12);

    public static native int setCompressionMagicless(long j12, boolean z12);

    public static native int setCompressionMinMatch(long j12, int i12);

    public static native int setCompressionOverlapLog(long j12, int i12);

    public static native int setCompressionSearchLog(long j12, int i12);

    public static native int setCompressionStrategy(long j12, int i12);

    public static native int setCompressionTargetLength(long j12, int i12);

    public static native int setCompressionWindowLog(long j12, int i12);

    public static native int setCompressionWorkers(long j12, int i12);

    public static native int setDecompressionLongMax(long j12, int i12);

    public static native int setDecompressionMagicless(long j12, boolean z12);

    public static native int setEnableLongDistanceMatching(long j12, int i12);

    public static native int setRefMultipleDDicts(long j12, boolean z12);

    public static native int setSearchForExternalRepcodes(long j12, int i12);

    public static native int setSequenceProducerFallback(long j12, boolean z12);

    public static native int setValidateSequences(long j12, int i12);

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z12) {
        return trainFromBuffer(bArr, bArr2, z12, defaultCompressionLevel());
    }

    private static native long trainFromBuffer0(byte[][] bArr, byte[] bArr2, boolean z12, int i12);

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z12) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, z12, defaultCompressionLevel());
    }

    private static native long trainFromBufferDirect0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z12, int i12);

    public static native int windowLogMax();

    public static native int windowLogMin();

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z12, int i12) {
        if (bArr.length > 10) {
            return trainFromBuffer0(bArr, bArr2, z12, i12);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z12, int i12) {
        if (iArr.length > 10) {
            return trainFromBufferDirect0(byteBuffer, iArr, byteBuffer2, z12, i12);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    public static byte[] decompress(byte[] bArr, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2) {
        return trainFromBuffer(bArr, bArr2, false);
    }

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, false);
    }

    @Deprecated
    public static long decompressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i12, int i13) {
        return decompressedSize(bArr, i12, i13, false);
    }

    public static long getFrameContentSize(byte[] bArr, int i12, int i13) {
        return getFrameContentSize(bArr, i12, i13, false);
    }

    public static long compress(byte[] bArr, byte[] bArr2, int i12) {
        return compress(bArr, bArr2, i12, false);
    }

    public static long compressByteArray(byte[] bArr, int i12, int i13, byte[] bArr2, int i14, int i15, int i16) {
        return compressByteArray(bArr, i12, i13, bArr2, i14, i15, i16, false);
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i12, int i13, ByteBuffer byteBuffer2, int i14, int i15, int i16) {
        return compressDirectByteBuffer(byteBuffer, i12, i13, byteBuffer2, i14, i15, i16, false);
    }

    public static long compressFastDict(byte[] bArr, int i12, byte[] bArr2, int i13, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, bArr2.length - i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUsingDict(byte[] bArr, int i12, byte[] bArr2, int i13, byte[] bArr3, int i14) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i14);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i12, bArr.length - i12, bArr2, i13, bArr2.length - i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i12) {
        return decompressedSize(bArr, i12, bArr.length - i12);
    }

    public static long getFrameContentSize(byte[] bArr, int i12) {
        return getFrameContentSize(bArr, i12, bArr.length - i12);
    }

    public static long compress(byte[] bArr, byte[] bArr2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr) {
        return decompressedSize(bArr, 0);
    }

    public static long getFrameContentSize(byte[] bArr) {
        return getFrameContentSize(bArr, 0);
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(ByteBuffer byteBuffer) {
        return decompressedDirectByteBufferSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static long getFrameContentSize(ByteBuffer byteBuffer) {
        return getDirectByteBufferFrameContentSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Deprecated
    public static long compressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3, int i12) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i12);
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, defaultCompressionLevel());
    }

    public static byte[] compressUsingDict(byte[] bArr, byte[] bArr2, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr2);
            zstdCompressCtx.setLevel(i12);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i12);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(bArr, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return compress(byteBuffer, byteBuffer2, defaultCompressionLevel());
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i12, boolean z12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i12);
            zstdCompressCtx.setChecksum(z12);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr2);
            return zstdDecompressCtx.decompress(bArr, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i12) {
        return compress(byteBuffer, byteBuffer2, i12, false);
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i12);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, byte[] bArr, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long compress(byte[] bArr, byte[] bArr2, byte[] bArr3, int i12) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i12);
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i12);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, ZstdDictDecompress zstdDictDecompress, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, byte[] bArr, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i12);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }
}
