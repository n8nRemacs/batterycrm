package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Bitmap;
import androidx.compose.runtime.C22026a;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzd {
    public static ByteBuffer zza(Bitmap bitmap, boolean z12) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i12);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < height; i15++) {
            int i16 = 0;
            while (i16 < width) {
                int i17 = iArr[i14];
                int i18 = i17 >> 16;
                int i19 = i17 >> 8;
                int i22 = i17 & 255;
                int i23 = i13 + 1;
                int i24 = i18 & 255;
                int i25 = i19 & 255;
                byteBufferAllocateDirect.put(i13, (byte) Math.min(255, (C22026a.a(i22, 25, (i25 * 129) + (i24 * 66), 128) >> 8) + 16));
                if (i15 % 2 == 0 && i14 % 2 == 0) {
                    int i26 = ((((i24 * 112) - (i25 * 94)) - (i22 * 18)) + 128) >> 8;
                    int i27 = (((((i24 * (-38)) - (i25 * 74)) + (i22 * 112)) + 128) >> 8) + 128;
                    int i28 = i12 + 1;
                    byteBufferAllocateDirect.put(i12, (byte) Math.min(255, i26 + 128));
                    i12 += 2;
                    byteBufferAllocateDirect.put(i28, (byte) Math.min(255, i27));
                }
                i14++;
                i16++;
                i13 = i23;
            }
        }
        return byteBufferAllocateDirect;
    }
}
