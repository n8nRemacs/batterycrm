package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class tyd extends e9j {
    public static final tyd b = new tyd(0);
    public static final tyd c = new tyd(1);
    public static final tyd d = new tyd(2);
    public static final tyd e = new tyd(3);
    public static final tyd f = new tyd(4);
    public static final tyd g = new tyd(5);
    public static final tyd h = new tyd(6);
    public static final tyd i = new tyd(7);
    public static final tyd j = new tyd(8);
    public final /* synthetic */ int a;

    public /* synthetic */ tyd(int i2) {
        this.a = i2;
    }

    @Override // defpackage.e9j
    public final void g(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
        float fWidth;
        float fHeight;
        float fMax;
        float fMax2;
        switch (this.a) {
            case 0:
                matrix.setTranslate((int) (((rect.width() - i2) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i3) * 0.5f) + rect.top + 0.5f));
                break;
            case 1:
                if (f5 > f4) {
                    fWidth = ((rect.width() - (i2 * f5)) * 0.5f) + rect.left;
                    fHeight = rect.top;
                    f4 = f5;
                } else {
                    fWidth = rect.left;
                    fHeight = ((rect.height() - (i3 * f4)) * 0.5f) + rect.top;
                }
                matrix.setScale(f4, f4);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                break;
            case 2:
                float fMin = Math.min(Math.min(f4, f5), 1.0f);
                float fWidth2 = ((rect.width() - (i2 * fMin)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i3 * fMin)) * 0.5f) + rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(f4, f5);
                float f6 = rect.left;
                float fHeight3 = (rect.height() - (i3 * fMin2)) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (f6 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f4, f5);
                float fWidth3 = ((rect.width() - (i2 * fMin3)) * 0.5f) + rect.left;
                float fHeight4 = ((rect.height() - (i3 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight4 + 0.5f));
                break;
            case 5:
                float fMin4 = Math.min(f4, f5);
                float fWidth4 = (rect.width() - (i2 * fMin4)) + rect.left;
                float fHeight5 = (rect.height() - (i3 * fMin4)) + rect.top;
                matrix.setScale(fMin4, fMin4);
                matrix.postTranslate((int) (fWidth4 + 0.5f), (int) (fHeight5 + 0.5f));
                break;
            case 6:
                float fMin5 = Math.min(f4, f5);
                float f7 = rect.left;
                float f8 = rect.top;
                matrix.setScale(fMin5, fMin5);
                matrix.postTranslate((int) (f7 + 0.5f), (int) (f8 + 0.5f));
                break;
            case 7:
                float f9 = rect.left;
                float f10 = rect.top;
                matrix.setScale(f4, f5);
                matrix.postTranslate((int) (f9 + 0.5f), (int) (f10 + 0.5f));
                break;
            default:
                if (f5 > f4) {
                    float f11 = i2 * f5;
                    fMax = Math.max(Math.min((rect.width() * 0.5f) - (f2 * f11), 0.0f), rect.width() - f11) + rect.left;
                    fMax2 = rect.top;
                    f4 = f5;
                } else {
                    fMax = rect.left;
                    float f12 = i3 * f4;
                    fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f3 * f12), 0.0f), rect.height() - f12) + rect.top;
                }
                matrix.setScale(f4, f4);
                matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
