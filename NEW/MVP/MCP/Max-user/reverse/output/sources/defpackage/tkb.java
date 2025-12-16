package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import one.me.image.crop.view.ImageCropView;

/* loaded from: classes2.dex */
public final class tkb extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public int D0;
    public float E0;
    public float F0;
    public int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public ukb L0;
    public boolean M0;
    public final RectF a;
    public final RectF b;
    public float[] c;
    public int d;
    public int o;
    public float s0;
    public float[] t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public final Path y0;
    public final Paint z0;

    public tkb(Context context) {
        super(context, null, 0);
        this.a = new RectF();
        this.b = new RectF();
        this.t0 = null;
        this.y0 = new Path();
        Paint paint = new Paint(1);
        this.z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        this.D0 = 0;
        this.E0 = -1.0f;
        this.F0 = -1.0f;
        this.G0 = -1;
        this.H0 = Math.round(getResources().getDisplayMetrics().density * 30.0f);
        this.I0 = Math.round(getResources().getDisplayMetrics().density * 100.0f);
        this.J0 = Math.round(getResources().getDisplayMetrics().density * 10.0f);
        this.K0 = Math.round(getResources().getDisplayMetrics().density * 20.0f);
        this.x0 = -1946157056;
        paint.setColor(-1946157056);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint3.setStrokeWidth(Math.round(getResources().getDisplayMetrics().density * 1.0f));
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint4.setStrokeWidth(r9 * 3);
        paint4.setColor(-1);
        paint4.setStyle(style);
        this.u0 = true;
        paint2.setStrokeWidth(Math.round(getResources().getDisplayMetrics().density * 1.0f));
        paint2.setColor(-2130706433);
        this.d = 2;
        this.o = 2;
        this.v0 = true;
    }

    public final void a(RectF rectF, float f) {
        int measuredWidth = getMeasuredWidth();
        int i = this.K0;
        int i2 = i * 2;
        int i3 = measuredWidth - i2;
        int measuredHeight = getMeasuredHeight() - i2;
        int i4 = (int) (i3 / f);
        if (i4 <= measuredHeight) {
            int i5 = (measuredHeight - i4) / 2;
            rectF.set(i, i5 + i, i3 + i, i4 + i5 + i);
        } else {
            int i6 = (i3 - ((int) (measuredHeight * f))) / 2;
            rectF.set(i6 + i, i, r7 + i6 + i, measuredHeight + i);
        }
    }

    public final void b() {
        RectF rectF = this.a;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = ((f3 - f) / 2.0f) + f;
        float f5 = rectF.bottom;
        float f6 = ((f5 - f2) / 2.0f) + f2;
        this.c = new float[]{f, f2, f4, f2, f3, f2, f3, f6, f3, f5, f4, f5, f, f5, f, f6, f4, f6};
        rectF.centerX();
        rectF.centerY();
        this.t0 = null;
        Path path = this.y0;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.a;
    }

    public int getFreestyleCropMode() {
        return this.D0;
    }

    public ukb getOverlayViewChangeListener() {
        return this.L0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z = this.w0;
        RectF rectF = this.a;
        if (z) {
            canvas.clipPath(this.y0, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.x0);
        canvas.restore();
        if (this.w0) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.z0);
        }
        if (this.v0) {
            if (this.t0 == null && !rectF.isEmpty()) {
                this.t0 = new float[(this.o * 4) + (this.d * 4)];
                int i = 0;
                for (int i2 = 0; i2 < this.d; i2++) {
                    float[] fArr = this.t0;
                    fArr[i] = rectF.left;
                    float f = i2 + 1.0f;
                    fArr[i + 1] = ((f / (this.d + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.t0;
                    int i3 = i + 3;
                    fArr2[i + 2] = rectF.right;
                    i += 4;
                    fArr2[i3] = ((f / (this.d + 1)) * rectF.height()) + rectF.top;
                }
                for (int i4 = 0; i4 < this.o; i4++) {
                    float f2 = i4 + 1.0f;
                    this.t0[i] = ((f2 / (this.o + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.t0;
                    fArr3[i + 1] = rectF.top;
                    int i5 = i + 3;
                    fArr3[i + 2] = ((f2 / (this.o + 1)) * rectF.width()) + rectF.left;
                    i += 4;
                    this.t0[i5] = rectF.bottom;
                }
            }
            float[] fArr4 = this.t0;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.A0);
            }
        }
        if (this.u0) {
            canvas.drawRect(rectF, this.B0);
        }
        if (this.D0 != 0) {
            canvas.save();
            float f3 = rectF.left;
            float f4 = this.J0;
            float f5 = f3 + f4;
            float f6 = rectF.top - f4;
            float fWidth = ((rectF.width() / 2.0f) + f3) - f4;
            float f7 = rectF.bottom + f4;
            RectF rectF2 = this.b;
            rectF2.set(f5, f6, fWidth, f7);
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op);
            rectF2.set((f4 / 2.0f) + (rectF.right - (rectF.width() / 2.0f)), rectF.top - f4, rectF.right - f4, rectF.bottom + f4);
            canvas.clipRect(rectF2, op);
            float f8 = rectF.left - f4;
            float f9 = rectF.top;
            rectF2.set(f8, f9 + f4, rectF.right + f4, ((rectF.height() / 2.0f) + f9) - f4);
            canvas.clipRect(rectF2, op);
            rectF2.set(rectF.left - f4, (rectF.bottom - (rectF.height() / 2.0f)) + f4, rectF.right + f4, rectF.bottom - f4);
            canvas.clipRect(rectF2, op);
            canvas.drawRect(rectF, this.C0);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.M0) {
            this.M0 = false;
            setTargetAspectRatio(this.s0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z) {
        this.w0 = z;
    }

    public void setCropFrameColor(int i) {
        this.B0.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.B0.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.A0.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.o = i;
        this.t0 = null;
    }

    public void setCropGridRowCount(int i) {
        this.d = i;
        this.t0 = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.A0.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.x0 = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.D0 = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.D0 = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(ukb ukbVar) {
        this.L0 = ukbVar;
    }

    public void setShowCropFrame(boolean z) {
        this.u0 = z;
    }

    public void setShowCropGrid(boolean z) {
        this.v0 = z;
    }

    public void setTargetAspectRatio(float f) {
        this.s0 = f;
        if (getMeasuredWidth() <= 0) {
            this.M0 = true;
            return;
        }
        float f2 = this.s0;
        RectF rectF = this.a;
        a(rectF, f2);
        ukb ukbVar = this.L0;
        if (ukbVar != null) {
            ((ImageCropView) ukbVar).a.setCropRect(rectF);
        }
        b();
        postInvalidate();
    }
}
