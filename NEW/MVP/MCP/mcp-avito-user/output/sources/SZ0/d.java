package SZ0;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.runtime.C22026a;
import com.google.android.gms.common.internal.C36729v;
import com.google.mlkit.common.MlKitException;
import j.N;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15072a = new d();

    @N
    @RX0.a
    public static ByteBuffer a(@N com.google.mlkit.vision.common.a aVar) {
        int i12;
        int i13 = aVar.f362449g;
        int i14 = 0;
        if (i13 == -1) {
            Bitmap bitmapCopy = aVar.f362443a;
            C36729v.j(bitmapCopy);
            if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
                bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
            }
            Bitmap bitmap = bitmapCopy;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i15 = width * height;
            int[] iArr = new int[i15];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int iCeil = (int) Math.ceil(height / 2.0d);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < height) {
                int i19 = i14;
                while (i19 < width) {
                    int i22 = iArr[i17];
                    int i23 = (i22 >> 16) & 255;
                    int i24 = (i22 >> 8) & 255;
                    int i25 = i22 & 255;
                    int iA2 = (C22026a.a(i25, 112, (i23 * (-38)) - (i24 * 74), 128) >> 8) + 128;
                    int i26 = (((((i23 * 112) - (i24 * 94)) - (i25 * 18)) + 128) >> 8) + 128;
                    int i27 = i18 + 1;
                    byteBufferAllocateDirect.put(i18, (byte) Math.min(255, (C22026a.a(i25, 25, (i24 * 129) + (i23 * 66), 128) >> 8) + 16));
                    if (i16 % 2 == 0 && i17 % 2 == 0) {
                        int i28 = i15 + 1;
                        byteBufferAllocateDirect.put(i15, (byte) Math.min(255, i26));
                        i15 += 2;
                        byteBufferAllocateDirect.put(i28, (byte) Math.min(255, iA2));
                    }
                    i17++;
                    i19++;
                    i18 = i27;
                }
                i16++;
                i14 = 0;
            }
            return byteBufferAllocateDirect;
        }
        if (i13 == 17) {
            ByteBuffer byteBuffer = aVar.f362444b;
            C36729v.j(byteBuffer);
            return byteBuffer;
        }
        if (i13 != 35) {
            if (i13 != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = aVar.f362444b;
            C36729v.j(byteBuffer2);
            byteBuffer2.rewind();
            int iLimit = byteBuffer2.limit();
            int i29 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iLimit);
            int i32 = 0;
            while (true) {
                i12 = i29 * 4;
                if (i32 >= i12) {
                    break;
                }
                byteBufferAllocateDirect2.put(i32, byteBuffer2.get(i32));
                i32++;
            }
            while (i14 < i29 + i29) {
                byteBufferAllocateDirect2.put(i12 + i14, byteBuffer2.get((i14 / 2) + ((i14 % 2) * i29) + i12));
                i14++;
            }
            return byteBufferAllocateDirect2;
        }
        Image.Plane[] planeArrC = aVar.c();
        C36729v.j(planeArrC);
        int i33 = aVar.f362446d;
        int i34 = aVar.f362447e;
        int i35 = i33 * i34;
        int i36 = i35 / 4;
        byte[] bArr = new byte[i36 + i36 + i35];
        ByteBuffer buffer = planeArrC[1].getBuffer();
        ByteBuffer buffer2 = planeArrC[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit2 = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit2 - 1);
        int i37 = (i35 + i35) / 4;
        boolean z12 = buffer2.remaining() == i37 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit2);
        if (z12) {
            planeArrC[0].getBuffer().get(bArr, 0, i35);
            ByteBuffer buffer3 = planeArrC[1].getBuffer();
            planeArrC[2].getBuffer().get(bArr, i35, 1);
            buffer3.get(bArr, i35 + 1, i37 - 1);
        } else {
            b(planeArrC[0], i33, i34, bArr, 0, 1);
            b(planeArrC[1], i33, i34, bArr, i35 + 1, 2);
            b(planeArrC[2], i33, i34, bArr, i35, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static final void b(Image.Plane plane, int i12, int i13, byte[] bArr, int i14, int i15) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i16 = i12 / (i13 / rowStride);
        int rowStride2 = 0;
        for (int i17 = 0; i17 < rowStride; i17++) {
            int pixelStride = rowStride2;
            for (int i18 = 0; i18 < i16; i18++) {
                bArr[i14] = buffer.get(pixelStride);
                i14 += i15;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
