package ru.cyberity.cbr.core.common;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: FastBlur.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/common/z;", "", "Landroid/graphics/Bitmap;", "sentBitmap", "", "radius", "", "canReuseInBitmap", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f432843a = new z();

    private z() {
    }

    @Y61.l
    public final Bitmap a(@Y61.k Bitmap sentBitmap, int radius, boolean canReuseInBitmap) {
        int[] iArr;
        int i12 = radius;
        Bitmap bitmapCopy = canReuseInBitmap ? sentBitmap : sentBitmap.copy(sentBitmap.getConfig(), true);
        if (i12 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr2 = new int[i13];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int i16 = i12 + i12;
        int i17 = i16 + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[i13];
        int[] iArr6 = new int[width < height ? height : width];
        int i18 = (i16 + 2) >> 1;
        int i19 = i18 * i18;
        int i22 = i19 * 256;
        int[] iArr7 = new int[i22];
        for (int i23 = 0; i23 < i22; i23++) {
            iArr7[i23] = i23 / i19;
        }
        int[][] iArr8 = new int[i17][];
        for (int i24 = 0; i24 < i17; i24++) {
            iArr8[i24] = new int[3];
        }
        int i25 = i12 + 1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < height) {
            Bitmap bitmap = bitmapCopy;
            int i29 = -i12;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i42 = 0;
            while (i29 <= i12) {
                int i43 = height;
                int i44 = i29 < 0 ? 0 : i29;
                if (i14 <= i44) {
                    i44 = i14;
                }
                int i45 = iArr2[i27 + i44];
                int[] iArr9 = iArr8[i29 + i12];
                iArr9[0] = (i45 & 16711680) >> 16;
                iArr9[1] = (i45 & 65280) >> 8;
                iArr9[2] = i45 & 255;
                int iAbs = i25 - Math.abs(i29);
                int i46 = iArr9[0];
                i34 = (i46 * iAbs) + i34;
                int i47 = iArr9[1];
                i33 = (i47 * iAbs) + i33;
                int i48 = iArr9[2];
                i32 = (iAbs * i48) + i32;
                if (i29 > 0) {
                    i38 += i46;
                    i39 += i47;
                    i42 += i48;
                } else {
                    i37 += i46;
                    i36 += i47;
                    i35 += i48;
                }
                i29++;
                height = i43;
            }
            int i49 = height;
            int i52 = i12;
            int i53 = 0;
            while (i53 < width) {
                iArr3[i27] = iArr7[i34];
                iArr4[i27] = iArr7[i33];
                iArr5[i27] = iArr7[i32];
                int i54 = i34 - i37;
                int i55 = i33 - i36;
                int i56 = i32 - i35;
                int[] iArr10 = iArr8[((i52 - i12) + i17) % i17];
                int i57 = i37 - iArr10[0];
                int i58 = i36 - iArr10[1];
                int i59 = i35 - iArr10[2];
                if (i26 == 0) {
                    iArr = iArr7;
                    int i62 = i53 + i12 + 1;
                    if (i62 > i14) {
                        i62 = i14;
                    }
                    iArr6[i53] = i62;
                } else {
                    iArr = iArr7;
                }
                int i63 = iArr2[i28 + iArr6[i53]];
                int i64 = (i63 & 16711680) >> 16;
                iArr10[0] = i64;
                int i65 = (i63 & 65280) >> 8;
                iArr10[1] = i65;
                int i66 = i63 & 255;
                iArr10[2] = i66;
                int i67 = i38 + i64;
                int i68 = i39 + i65;
                int i69 = i42 + i66;
                i34 = i54 + i67;
                i33 = i55 + i68;
                i32 = i56 + i69;
                i52 = (i52 + 1) % i17;
                int[] iArr11 = iArr8[i52 % i17];
                int i72 = iArr11[0];
                i37 = i57 + i72;
                int i73 = iArr11[1];
                i36 = i58 + i73;
                int i74 = iArr11[2];
                i35 = i59 + i74;
                i38 = i67 - i72;
                i39 = i68 - i73;
                i42 = i69 - i74;
                i27++;
                i53++;
                iArr7 = iArr;
            }
            i28 += width;
            i26++;
            bitmapCopy = bitmap;
            height = i49;
        }
        Bitmap bitmap2 = bitmapCopy;
        int i75 = height;
        int[] iArr12 = iArr7;
        int i76 = 0;
        while (i76 < width) {
            int i77 = -i12;
            int i78 = i77 * width;
            int i79 = 0;
            int i82 = 0;
            int i83 = 0;
            int i84 = 0;
            int i85 = 0;
            int i86 = 0;
            int i87 = 0;
            int i88 = 0;
            int i89 = 0;
            while (i77 <= i12) {
                int i92 = (i78 > 0 ? i78 : 0) + i76;
                int[] iArr13 = iArr8[i77 + i12];
                iArr13[0] = iArr3[i92];
                iArr13[1] = iArr4[i92];
                iArr13[2] = iArr5[i92];
                int iAbs2 = i25 - Math.abs(i77);
                i83 = (iArr3[i92] * iAbs2) + i83;
                i82 = (iArr4[i92] * iAbs2) + i82;
                i79 = (iArr5[i92] * iAbs2) + i79;
                if (i77 > 0) {
                    i87 += iArr13[0];
                    i88 += iArr13[1];
                    i89 += iArr13[2];
                } else {
                    i86 += iArr13[0];
                    i85 += iArr13[1];
                    i84 += iArr13[2];
                }
                if (i77 < i15) {
                    i78 += width;
                }
                i77++;
            }
            int i93 = i12;
            int i94 = i76;
            int i95 = 0;
            int i96 = i75;
            while (i95 < i96) {
                iArr2[i94] = (iArr2[i94] & (-16777216)) | (iArr12[i83] << 16) | (iArr12[i82] << 8) | iArr12[i79];
                int i97 = i83 - i86;
                int i98 = i82 - i85;
                int i99 = i79 - i84;
                int[] iArr14 = iArr8[((i93 - i12) + i17) % i17];
                int i100 = i86 - iArr14[0];
                int i101 = i85 - iArr14[1];
                int i102 = i84 - iArr14[2];
                if (i76 == 0) {
                    int i103 = i95 + i25;
                    if (i103 > i15) {
                        i103 = i15;
                    }
                    iArr6[i95] = i103 * width;
                }
                int i104 = iArr6[i95] + i76;
                int i105 = iArr3[i104];
                iArr14[0] = i105;
                int i106 = iArr4[i104];
                iArr14[1] = i106;
                int i107 = iArr5[i104];
                iArr14[2] = i107;
                int i108 = i87 + i105;
                int i109 = i88 + i106;
                int i110 = i89 + i107;
                i83 = i97 + i108;
                i82 = i98 + i109;
                i79 = i99 + i110;
                i93 = (i93 + 1) % i17;
                int[] iArr15 = iArr8[i93];
                int i111 = iArr15[0];
                i86 = i100 + i111;
                int i112 = iArr15[1];
                i85 = i101 + i112;
                int i113 = iArr15[2];
                i84 = i102 + i113;
                i87 = i108 - i111;
                i88 = i109 - i112;
                i89 = i110 - i113;
                i94 += width;
                i95++;
                i12 = radius;
            }
            i76++;
            i12 = radius;
            i75 = i96;
        }
        bitmap2.setPixels(iArr2, 0, width, 0, 0, width, i75);
        return bitmap2;
    }
}
