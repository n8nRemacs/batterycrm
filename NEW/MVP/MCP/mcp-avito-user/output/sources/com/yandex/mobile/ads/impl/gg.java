package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* loaded from: classes8.dex */
public final class gg {
    @j.N
    public static Bitmap a(@j.N Bitmap bitmap) {
        try {
            return b(bitmap);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    @j.N
    private static Bitmap b(@j.N Bitmap bitmap) {
        int[] iArr;
        int i12 = 0;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.1f), Math.round(bitmap.getHeight() * 0.1f), false);
        int i13 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i14 = width * height;
        int[] iArr2 = new int[i14];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i15 = width - 1;
        int i16 = height - 1;
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[1024];
        for (int i17 = 0; i17 < 1024; i17++) {
            iArr7[i17] = i17 / 4;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);
        int i18 = 0;
        int i19 = 0;
        int i22 = 0;
        while (i18 < height) {
            int i23 = i12;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int i28 = i27;
            int i29 = i28;
            int i32 = i29;
            int i33 = -1;
            int i34 = i32;
            while (i33 <= i13) {
                int i35 = iArr2[Math.min(i15, Math.max(i33, i12)) + i19];
                int i36 = i33 + 1;
                int[] iArr9 = iArr8[i36];
                iArr9[i12] = (i35 & 16711680) >> 16;
                iArr9[1] = (i35 & 65280) >> 8;
                iArr9[2] = i35 & 255;
                int iAbs = 2 - StrictMath.abs(i33);
                int i37 = iArr9[i12];
                i34 = (i37 * iAbs) + i34;
                int i38 = iArr9[1];
                i23 = (i38 * iAbs) + i23;
                int i39 = iArr9[2];
                i24 = (iAbs * i39) + i24;
                if (i33 > 0) {
                    i28 += i37;
                    i32 += i38;
                    i29 += i39;
                } else {
                    i27 += i37;
                    i26 += i38;
                    i25 += i39;
                }
                i33 = i36;
                i13 = 1;
            }
            int i42 = i12;
            int i43 = 1;
            while (i42 < width) {
                iArr3[i19] = iArr7[i34];
                iArr4[i19] = iArr7[i23];
                iArr5[i19] = iArr7[i24];
                int i44 = i34 - i27;
                int i45 = i23 - i26;
                int i46 = i24 - i25;
                int[] iArr10 = iArr8[(i43 + 2) % 3];
                int i47 = i27 - iArr10[i12];
                int i48 = i26 - iArr10[1];
                int i49 = i25 - iArr10[2];
                if (i18 == 0) {
                    iArr6[i42] = Math.min(i42 + 2, i15);
                }
                int i52 = iArr2[i22 + iArr6[i42]];
                int i53 = (i52 & 16711680) >> 16;
                iArr10[0] = i53;
                int i54 = (i52 & 65280) >> 8;
                iArr10[1] = i54;
                int i55 = i52 & 255;
                iArr10[2] = i55;
                int i56 = i28 + i53;
                int i57 = i32 + i54;
                int i58 = i29 + i55;
                i34 = i44 + i56;
                i23 = i45 + i57;
                i24 = i46 + i58;
                i43 = (i43 + 1) % 3;
                int[] iArr11 = iArr8[i43 % 3];
                int i59 = iArr11[0];
                i27 = i47 + i59;
                int i62 = iArr11[1];
                i26 = i48 + i62;
                int i63 = iArr11[2];
                i25 = i49 + i63;
                i28 = i56 - i59;
                i32 = i57 - i62;
                i29 = i58 - i63;
                i19++;
                i42++;
                i12 = 0;
            }
            i22 += width;
            i18++;
            i12 = 0;
            i13 = 1;
        }
        int i64 = 0;
        while (i64 < width) {
            int i65 = width * (-1);
            Bitmap bitmap2 = bitmapCopy;
            int[] iArr12 = iArr6;
            int i66 = -1;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            for (int i78 = 1; i66 <= i78; i78 = 1) {
                int iMax = Math.max(0, i65) + i64;
                int i79 = i66 + 1;
                int[] iArr13 = iArr8[i79];
                iArr13[0] = iArr3[iMax];
                iArr13[1] = iArr4[iMax];
                iArr13[2] = iArr5[iMax];
                int iAbs2 = 2 - StrictMath.abs(i66);
                i67 = (iArr3[iMax] * iAbs2) + i67;
                i68 = (iArr4[iMax] * iAbs2) + i68;
                i69 = (iArr5[iMax] * iAbs2) + i69;
                if (i66 > 0) {
                    i75 += iArr13[0];
                    i77 += iArr13[1];
                    i76 += iArr13[2];
                } else {
                    i74 += iArr13[0];
                    i73 += iArr13[1];
                    i72 += iArr13[2];
                }
                if (i66 < i16) {
                    i65 += width;
                }
                i66 = i79;
            }
            int i82 = i64;
            int i83 = 0;
            int i84 = 1;
            while (i83 < height) {
                iArr2[i82] = (iArr2[i82] & (-16777216)) | (iArr7[i67] << 16) | (iArr7[i68] << 8) | iArr7[i69];
                int i85 = i67 - i74;
                int i86 = i68 - i73;
                int i87 = i69 - i72;
                int[] iArr14 = iArr8[(i84 + 2) % 3];
                int i88 = i74 - iArr14[0];
                int i89 = i73 - iArr14[1];
                int i92 = i72 - iArr14[2];
                if (i64 == 0) {
                    iArr = iArr7;
                    iArr12[i83] = Math.min(i83 + 2, i16) * width;
                } else {
                    iArr = iArr7;
                }
                int i93 = iArr12[i83] + i64;
                int i94 = iArr3[i93];
                iArr14[0] = i94;
                int i95 = iArr4[i93];
                iArr14[1] = i95;
                int i96 = iArr5[i93];
                iArr14[2] = i96;
                int i97 = i75 + i94;
                int i98 = i77 + i95;
                int i99 = i76 + i96;
                i67 = i85 + i97;
                i68 = i86 + i98;
                i69 = i87 + i99;
                i84 = (i84 + 1) % 3;
                int[] iArr15 = iArr8[i84];
                int i100 = iArr15[0];
                i74 = i88 + i100;
                int i101 = iArr15[1];
                i73 = i89 + i101;
                int i102 = iArr15[2];
                i72 = i92 + i102;
                i75 = i97 - i100;
                i77 = i98 - i101;
                i76 = i99 - i102;
                i82 += width;
                i83++;
                iArr7 = iArr;
            }
            i64++;
            bitmapCopy = bitmap2;
            iArr6 = iArr12;
        }
        Bitmap bitmap3 = bitmapCopy;
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmap3;
    }
}
