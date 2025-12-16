package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class vs8 extends zd7 {
    public int P0;
    public boolean Q0;
    public boolean R0;

    public final int getBlurOffset() {
        return Math.abs(this.P0);
    }

    public final boolean getIgnoreCropCriteria() {
        return this.R0;
    }

    public final boolean getUseMaxDimensionsOnMeasure() {
        return this.Q0;
    }

    public final boolean o() {
        return this.P0 < 0;
    }

    @Override // defpackage.zd7, defpackage.o45, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            float f2 = getImageAttach().c / getImageAttach().d;
            this.P0 = 0;
            if (f2 == 1.0f) {
                if (this.Q0 || getImageAttach().c > 291) {
                    setMeasuredDimension(size, size);
                } else if (getImageAttach().c > 140) {
                    float f3 = 256;
                    setMeasuredDimension(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                } else {
                    float f4 = 140;
                    setMeasuredDimension(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                }
            } else if (f2 < 1.0f) {
                if (f2 < 0.42857143f) {
                    int iD = kti.d(165 * vw4.d().getDisplayMetrics().density);
                    float f5 = 384;
                    int iD2 = (int) (kti.d(vw4.d().getDisplayMetrics().density * f5) * f2);
                    if (this.R0 || iD - iD2 > iD * 0.25f) {
                        this.P0 = (iD - iD2) / 2;
                        setMeasuredDimension(iD2, kti.d(f5 * vw4.d().getDisplayMetrics().density));
                    } else {
                        setMeasuredDimension(iD, kti.d(f5 * vw4.d().getDisplayMetrics().density));
                    }
                } else if (this.Q0 || getImageAttach().c > 291) {
                    float f6 = 384;
                    int iD3 = (int) (kti.d(vw4.d().getDisplayMetrics().density * f6) * f2);
                    f = iD3 > size ? size / iD3 : 1.0f;
                    setMeasuredDimension((int) (iD3 * f), (int) (f * kti.d(f6 * vw4.d().getDisplayMetrics().density)));
                } else if (getImageAttach().c > 120) {
                    float f7 = 345;
                    int iD4 = (int) (kti.d(vw4.d().getDisplayMetrics().density * f7) * f2);
                    f = iD4 > size ? size / iD4 : 1.0f;
                    setMeasuredDimension((int) (iD4 * f), (int) (f * kti.d(f7 * vw4.d().getDisplayMetrics().density)));
                } else {
                    setMeasuredDimension((int) (kti.d(vw4.d().getDisplayMetrics().density * r8) * f2), kti.d(280 * vw4.d().getDisplayMetrics().density));
                }
            } else if (f2 <= 1.0f) {
                setMeasuredDimension(size, size2);
            } else if (f2 > 2.3333333f) {
                int iD5 = kti.d(72 * vw4.d().getDisplayMetrics().density);
                int i3 = (int) (size / f2);
                int i4 = iD5 - i3;
                if (i4 > iD5 * 0.25f) {
                    this.P0 = (i4 * (-1)) / 2;
                    setMeasuredDimension(size, i3);
                } else {
                    setMeasuredDimension(size, iD5);
                }
            } else if (this.Q0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, (int) (size / f2));
            } else if (getImageAttach().c > 212) {
                setMeasuredDimension(kti.d(vw4.d().getDisplayMetrics().density * 256), (int) (kti.d(r8 * vw4.d().getDisplayMetrics().density) / f2));
            } else {
                setMeasuredDimension(kti.d(vw4.d().getDisplayMetrics().density * 212), (int) (kti.d(r8 * vw4.d().getDisplayMetrics().density) / f2));
            }
        }
        setMeasuredLayoutWidth(size);
        setMeasuredLayoutHeight(size2);
    }

    public final void setIgnoreCropCriteria(boolean z) {
        this.R0 = z;
    }

    public final void setUseMaxDimensionsOnMeasure(boolean z) {
        this.Q0 = z;
    }
}
