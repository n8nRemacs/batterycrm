package net.jpountz.lz4;

import defpackage.px0;
import defpackage.ywd;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        ywd.a(i, bArr);
        ywd.c(i2, bArr2, i3);
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_fast) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        byte[] bArr;
        if (!byteBuffer2.isReadOnly()) {
            px0.a(i, byteBuffer);
            px0.c(byteBuffer2, i2, i3);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4FastDecompressor lZ4FastDecompressorFastDecompressor = SAFE_INSTANCE;
                if (lZ4FastDecompressorFastDecompressor == null) {
                    lZ4FastDecompressorFastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
                    SAFE_INSTANCE = lZ4FastDecompressorFastDecompressor;
                }
                return lZ4FastDecompressorFastDecompressor.decompress(byteBuffer, i, byteBuffer2, i2, i3);
            }
            ByteBuffer byteBuffer4 = byteBuffer2;
            int i4 = i2;
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
                int iArrayOffset2 = byteBuffer4.arrayOffset() + i4;
                bArr = bArrArray2;
                byteBuffer4 = null;
                i4 = iArrayOffset2;
            } else {
                bArr = null;
            }
            int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArrArray, byteBuffer3, iArrayOffset, bArr, byteBuffer4, i4, i3);
            if (iLZ4_decompress_fast >= 0) {
                return iLZ4_decompress_fast;
            }
            throw new LZ4Exception("Error decoding offset " + (iArrayOffset - iLZ4_decompress_fast) + " of input buffer");
        }
        throw new ReadOnlyBufferException();
    }
}
