package net.jpountz.lz4;

import defpackage.px0;
import defpackage.ywd;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4JNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4JNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        ywd.c(i, bArr, i2);
        ywd.c(i3, bArr2, i4);
        int iLZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_compress_limitedOutput > 0) {
            return iLZ4_compress_limitedOutput;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        int i5;
        byte[] bArr;
        if (!byteBuffer2.isReadOnly()) {
            px0.c(byteBuffer, i, i2);
            px0.c(byteBuffer2, i3, i4);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4Compressor lZ4CompressorFastCompressor = SAFE_INSTANCE;
                if (lZ4CompressorFastCompressor == null) {
                    lZ4CompressorFastCompressor = LZ4Factory.safeInstance().fastCompressor();
                    SAFE_INSTANCE = lZ4CompressorFastCompressor;
                }
                return lZ4CompressorFastCompressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
            }
            ByteBuffer byteBuffer4 = byteBuffer2;
            int i6 = i3;
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
                int iArrayOffset2 = byteBuffer4.arrayOffset() + i6;
                byteBuffer4 = null;
                i6 = iArrayOffset2;
                i5 = i2;
                bArr = bArrArray2;
            } else {
                i5 = i2;
                bArr = null;
            }
            int iLZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArrArray, byteBuffer3, iArrayOffset, i5, bArr, byteBuffer4, i6, i4);
            if (iLZ4_compress_limitedOutput > 0) {
                return iLZ4_compress_limitedOutput;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new ReadOnlyBufferException();
    }
}
