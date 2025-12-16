package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class wni {
    public static final int[] a = {R.attr.stateListAnimator};

    public static void a(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[12544];
        int i2 = 1;
        int i3 = 25;
        for (int i4 = 1; i4 < 256; i4++) {
            for (int i5 = 0; i5 < 49; i5++) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i6 = 0;
        while (i6 < 3) {
            int i7 = 0;
            while (true) {
                i = 24;
                if (i7 >= height) {
                    break;
                }
                int i8 = width * i7;
                i7++;
                int i9 = (i7 * width) - i2;
                int i10 = width + 24;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = -24; i15 < i10; i15++) {
                    int i16 = i8 + i15;
                    if (i16 < i8) {
                        i16 = i8;
                    } else if (i16 > i9) {
                        i16 = i9;
                    }
                    int i17 = iArr[i16];
                    i11 += (i17 >> 16) & 255;
                    i12 += (i17 >> 8) & 255;
                    i13 += i17 & 255;
                    i14 += i17 >>> 24;
                    if (i15 >= 24) {
                        iArr3[i15 - 24] = (iArr2[i14] << 24) | (iArr2[i11] << 16) | (iArr2[i12] << 8) | iArr2[i13];
                        int i18 = (i15 - 48) + i8;
                        if (i18 < i8) {
                            i18 = i8;
                        } else if (i18 > i9) {
                            i18 = i9;
                        }
                        int i19 = iArr[i18];
                        i11 -= (i19 >> 16) & 255;
                        i12 -= (i19 >> 8) & 255;
                        i13 -= i19 & 255;
                        i14 -= i19 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i8, width);
                i2 = 1;
            }
            int i20 = 0;
            int i21 = 0;
            while (i21 < width) {
                int i22 = ((height - 1) * width) + i21;
                int i23 = i * width;
                int i24 = 48 * width;
                int i25 = i21 - i23;
                int i26 = i20;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                while (i25 <= i22 + i23) {
                    int i31 = iArr[i25 < i21 ? i21 : i25 > i22 ? i22 : i25];
                    int i32 = i;
                    i26 += (i31 >> 16) & 255;
                    i27 += (i31 >> 8) & 255;
                    i28 += i31 & 255;
                    i29 += i31 >>> 24;
                    if (i25 - i23 >= i21) {
                        iArr3[i30] = (iArr2[i29] << 24) | (iArr2[i26] << 16) | (iArr2[i27] << 8) | iArr2[i28];
                        i30++;
                        int i33 = i25 - i24;
                        if (i33 < i21) {
                            i33 = i21;
                        } else if (i33 > i22) {
                            i33 = i22;
                        }
                        int i34 = iArr[i33];
                        i26 -= (i34 >> 16) & 255;
                        i27 -= (i34 >> 8) & 255;
                        i28 -= i34 & 255;
                        i29 -= i34 >>> 24;
                    }
                    i25 += width;
                    i = i32;
                }
                int i35 = i;
                int i36 = i21;
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[i36] = iArr3[i37];
                    i36 += width;
                }
                i21++;
                i = i35;
                i20 = 0;
            }
            i6++;
            i2 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static void b(in inVar, float f) {
        int integer = inVar.getResources().getInteger(a1d.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, dvc.state_liftable, -dvc.state_lifted}, ObjectAnimator.ofFloat(inVar, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(inVar, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(inVar, "elevation", 0.0f).setDuration(0L));
        inVar.setStateListAnimator(stateListAnimator);
    }

    public static final String c(int i, long j) {
        if (j >= 0) {
            ozi.a(i);
            return Long.toString(j, i);
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ozi.a(i);
        String string = Long.toString(j3, i);
        ozi.a(i);
        return string.concat(Long.toString(j4, i));
    }
}
