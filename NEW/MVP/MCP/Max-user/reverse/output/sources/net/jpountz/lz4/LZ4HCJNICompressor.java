package net.jpountz.lz4;

import defpackage.px0;
import defpackage.ywd;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        ywd.c(i, bArr, i2);
        ywd.c(i3, bArr2, i4);
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    public LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        if (!byteBuffer2.isReadOnly()) {
            px0.c(byteBuffer, i, i2);
            px0.c(byteBuffer2, i3, i4);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4Compressor lZ4CompressorHighCompressor = SAFE_INSTANCE;
                if (lZ4CompressorHighCompressor == null) {
                    lZ4CompressorHighCompressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
                    SAFE_INSTANCE = lZ4CompressorHighCompressor;
                }
                return lZ4CompressorHighCompressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
            }
            ByteBuffer byteBuffer4 = byteBuffer2;
            int i5 = i3;
            byte[] bArr = null;
            if (byteBuffer.hasArray()) {
                bArrArray = byteBuffer.array();
                byteBuffer3 = null;
                iArrayOffset = byteBuffer.arrayOffset() + i;
            } else {
                bArrArray = null;
                byteBuffer3 = byteBuffer;
                iArrayOffset = i;
            }
            if (byteBuffer4.hasArray()) {
                byte[] bArrArray2 = byteBuffer4.array();
                int iArrayOffset2 = byteBuffer4.arrayOffset() + i5;
                byteBuffer4 = null;
                i5 = iArrayOffset2;
                bArr = bArrArray2;
            }
            int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArrArray, byteBuffer3, iArrayOffset, i2, bArr, byteBuffer4, i5, i4, this.compressionLevel);
            if (iLZ4_compressHC > 0) {
                return iLZ4_compressHC;
            }
            throw new LZ4Exception();
        }
        throw new ReadOnlyBufferException();
    }
}
