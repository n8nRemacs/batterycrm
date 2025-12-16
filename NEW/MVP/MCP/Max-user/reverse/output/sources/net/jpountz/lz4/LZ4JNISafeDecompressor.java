package net.jpountz.lz4;

import defpackage.px0;
import defpackage.ywd;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        ywd.c(i, bArr, i2);
        ywd.c(i3, bArr2, i4);
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_safe) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArrArray;
        ByteBuffer byteBuffer3;
        int iArrayOffset;
        int i5;
        byte[] bArr;
        if (!byteBuffer2.isReadOnly()) {
            px0.c(byteBuffer, i, i2);
            px0.c(byteBuffer2, i3, i4);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4SafeDecompressor lZ4SafeDecompressorSafeDecompressor = SAFE_INSTANCE;
                if (lZ4SafeDecompressorSafeDecompressor == null) {
                    lZ4SafeDecompressorSafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                    SAFE_INSTANCE = lZ4SafeDecompressorSafeDecompressor;
                }
                return lZ4SafeDecompressorSafeDecompressor.decompress(byteBuffer, i, i2, byteBuffer2, i3, i4);
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
            int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArrArray, byteBuffer3, iArrayOffset, i5, bArr, byteBuffer4, i6, i4);
            if (iLZ4_decompress_safe >= 0) {
                return iLZ4_decompress_safe;
            }
            throw new LZ4Exception("Error decoding offset " + (iArrayOffset - iLZ4_decompress_safe) + " of input buffer");
        }
        throw new ReadOnlyBufferException();
    }
}
