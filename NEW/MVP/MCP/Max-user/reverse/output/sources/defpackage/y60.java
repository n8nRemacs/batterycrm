package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.List;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class y60 extends View implements u6g {
    public final ValueAnimator A0;
    public float B0;
    public long C0;
    public boolean D0;
    public x60 E0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float d;
    public long o;
    public List s0;
    public boolean t0;
    public boolean u0;
    public final Paint v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Path z0;

    public y60(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        this.b = vw4.d().getDisplayMetrics().density * 2.0f;
        float f = vw4.d().getDisplayMetrics().density * 2.0f;
        this.c = f;
        float f2 = vw4.d().getDisplayMetrics().density * 2.0f;
        this.d = f2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f2);
        this.v0 = paint;
        this.w0 = new Paint(paint);
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.x0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.y0 = paint3;
        this.z0 = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -(f2 + f));
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new q00(3, this));
        this.A0 = valueAnimatorOfFloat;
        setLayerType(1, null);
        m8j.a(this);
        if (m8j.d(this)) {
            setScaleX(-1.0f);
        }
        onThemeChanged(a93.s0.y(this));
    }

    public final void a() {
        List list = this.s0;
        if (getMeasuredWidth() == 0 || list == null || list.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float width = getWidth();
        float f = this.d;
        float fD = (width - (f / 2.0f)) - kti.d(6 * vw4.d().getDisplayMetrics().density);
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            float fFloatValue = ((Number) list.get(size)).floatValue() / 2.0f;
            Path path = this.z0;
            path.moveTo(fD, measuredHeight - fFloatValue);
            path.lineTo(fD, fFloatValue + measuredHeight);
            fD = (fD - f) - this.c;
        }
    }

    public final float b(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int i = iArr[0];
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        if (rawX >= i + width) {
            return 1.0f;
        }
        float f = i;
        if (rawX <= f) {
            return 0.0f;
        }
        return (rawX - f) / width;
    }

    public final long getDuration() {
        return this.C0;
    }

    public final int getPeaksCount() {
        float fD = u45.d(6, vw4.d().getDisplayMetrics().density, 2, getMeasuredWidth());
        float f = this.c;
        return (int) ((fD + f) / (f + this.d));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        float f = this.d;
        Path path = this.z0;
        if (path.isEmpty()) {
            return;
        }
        boolean z = this.u0;
        Paint paint = this.v0;
        if (!z && !this.D0) {
            if (this.t0) {
                canvas.drawPath(path, paint);
                return;
            }
            iSave = canvas.save();
            float f2 = 6;
            try {
                float f3 = f / 2;
                canvas.clipRect(kti.d(vw4.d().getDisplayMetrics().density * f2) + f3, 0.0f, (canvas.getWidth() - kti.d(f2 * vw4.d().getDisplayMetrics().density)) - f3, canvas.getHeight());
                canvas.translate(this.B0, 0.0f);
                canvas.drawPath(path, paint);
                return;
            } finally {
            }
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f4 = 6;
        float fD = ((this.o / this.C0) * u45.d(f4, vw4.d().getDisplayMetrics().density, 2, getWidth())) + (vw4.d().getDisplayMetrics().density * 2.0f) + kti.d(f4 * vw4.d().getDisplayMetrics().density);
        float f5 = vw4.d().getDisplayMetrics().density * 4.0f;
        if (this.D0) {
            f5 += vw4.d().getDisplayMetrics().density * 2.0f;
        }
        float f6 = (vw4.d().getDisplayMetrics().density * 2.0f) + f5;
        float width = fD > ((float) getWidth()) - f6 ? getWidth() - f6 : fD;
        iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, fD, canvas.getHeight());
            canvas.drawPath(path, this.w0);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(fD, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, (vw4.d().getDisplayMetrics().density * 2.0f) + f5, this.y0);
                canvas.drawCircle(width, measuredHeight, f5, this.x0);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        x60 x60Var = this.E0;
        if (x60Var != null) {
            int peaksCount = getPeaksCount();
            float f = i2;
            qkh qkhVar = ((rkh) ((aqc) x60Var).c).c;
            if (qkhVar != null) {
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((hfd) qkhVar).b;
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                w60 w60VarZ = recordControlsWidget.S0().z();
                if (w60VarZ != null) {
                    svi.e(w60VarZ.f, null, null, new u60(w60VarZ, peaksCount, f, this.b, null), 3);
                }
            }
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int iC;
        if (this.t0) {
            yebVar.getIcon();
            iC = v4j.c(-1, 0.5f);
        } else {
            iC = v4j.c(yebVar.getIcon().k, 0.5f);
        }
        this.v0.setColor(iC);
        yebVar.getIcon();
        this.x0.setColor(-1);
        this.y0.setColor(yebVar.getIcon().k);
        this.w0.setColor(-1);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.u0
            if (r0 != 0) goto Le
            boolean r0 = r5.D0
            if (r0 == 0) goto L9
            goto Le
        L9:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        Le:
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L96
            if (r0 == r2) goto L56
            r3 = 2
            if (r0 == r3) goto L20
            r3 = 3
            if (r0 == r3) goto L56
            goto L9a
        L20:
            boolean r0 = r5.D0
            if (r0 != 0) goto L25
            goto L9a
        L25:
            float r0 = r5.b(r6)
            long r3 = r5.C0
            float r1 = (float) r3
            float r0 = r0 * r1
            long r0 = (long) r0
            r5.o = r0
            x60 r0 = r5.E0
            if (r0 == 0) goto L52
            float r6 = r5.b(r6)
            aqc r0 = (defpackage.aqc) r0
            java.lang.Object r1 = r0.b
            y60 r1 = (defpackage.y60) r1
            long r3 = r1.getDuration()
            float r1 = (float) r3
            float r1 = r1 * r6
            long r3 = (long) r1
            java.lang.String r6 = defpackage.z7i.b(r3)
            java.lang.Object r0 = r0.c
            rkh r0 = (defpackage.rkh) r0
            android.widget.TextView r0 = r0.u0
            r0.setText(r6)
        L52:
            r5.postInvalidate()
            return r2
        L56:
            r5.D0 = r1
            x60 r0 = r5.E0
            if (r0 == 0) goto L8e
            float r6 = r5.b(r6)
            aqc r0 = (defpackage.aqc) r0
            java.lang.Object r0 = r0.c
            rkh r0 = (defpackage.rkh) r0
            qkh r0 = r0.c
            if (r0 == 0) goto L8e
            hfd r0 = (defpackage.hfd) r0
            java.lang.Object r0 = r0.b
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r0 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r0
            yy7[] r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.g1
            zed r0 = r0.S0()
            hbd r3 = r0.y0
            mcf r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            ga8 r0 = r0.A()
            float r3 = (float) r3
            float r6 = r6 * r3
            long r3 = (long) r6
            r0.seekTo(r3)
        L8e:
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r1)
            return r2
        L96:
            boolean r6 = r5.t0
            if (r6 != 0) goto L9b
        L9a:
            return r1
        L9b:
            r5.D0 = r2
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y60.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLinesColor(int i) {
        this.v0.setColor(i);
        invalidate();
    }

    public final void setListener(x60 x60Var) {
        this.E0 = x60Var;
    }

    public final void setPauseRecordingData(List<Float> list) {
        this.s0 = list;
        this.t0 = true;
        this.A0.cancel();
        this.B0 = 0.0f;
        Path path = this.z0;
        if (!path.isEmpty()) {
            path.reset();
        }
        a();
        postInvalidate();
    }

    public final void setShiftOffset(long j) {
        this.A0.setDuration(j);
    }
}
