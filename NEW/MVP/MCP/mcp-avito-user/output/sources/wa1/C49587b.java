package wa1;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.io.ByteArrayOutputStream;

/* renamed from: wa1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49587b {
    public static boolean a(Bitmap bitmap, boolean z12) {
        if (z12) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            int[] iArr = new int[height];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            int iRed = 0;
            int iBlue = 0;
            int iGreen = 0;
            for (int i12 = 0; i12 < height; i12++) {
                int i13 = iArr[i12];
                iRed += Color.red(i13);
                iGreen += Color.green(i13);
                iBlue += Color.blue(i13);
            }
            if (((iRed + iBlue) + iGreen) / (height * 3) <= 90) {
                return true;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i14 = 0;
            for (byte b12 : byteArray) {
                i14 += b12 & 255;
            }
            if ((!(byteArray.length == 0) ? i14 / byteArray.length : 0) <= 54) {
                return true;
            }
        }
        return false;
    }
}
