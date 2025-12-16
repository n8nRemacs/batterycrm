package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.o3;
import defpackage.ot0;
import defpackage.pt0;
import defpackage.soi;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class BrushWidthViewImpl extends View implements ot0 {
    public float A0;
    public final boolean B0;
    public final HashSet C0;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final int o;
    public final float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public boolean y0;
    public float z0;

    public BrushWidthViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B0 = false;
        this.C0 = new HashSet();
        setLayerType(1, null);
        this.t0 = soi.a(getContext(), 2);
        this.s0 = soi.a(getContext(), 11);
        this.z0 = soi.a(getContext(), 2);
        this.A0 = soi.a(getContext(), 32);
        this.o = soi.a(getContext(), 1);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStrokeWidth(this.t0);
        this.a.setAntiAlias(true);
        this.a.setShadowLayer(soi.a(getContext(), 2), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setShadowLayer(soi.a(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-1);
        this.c.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.d = paint4;
        paint4.setColor(-1);
        this.d.setAntiAlias(true);
        this.d.setShadowLayer(soi.a(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.B0 = true;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.B0) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
        }
        float f = this.u0;
        canvas.drawLine(f, this.w0, f, this.x0, this.a);
        float f2 = this.v0;
        float f3 = this.x0;
        float f4 = this.w0;
        float f5 = this.z0;
        float f6 = (((this.A0 - f5) * ((f3 - f2) / (f3 - f4))) + f5) / 2.0f;
        canvas.drawCircle(this.u0 - (this.s0 * 3.0f), f2, this.o + f6, this.d);
        canvas.drawCircle(this.u0 - (this.s0 * 3.0f), this.v0, f6, this.c);
        canvas.drawCircle(this.u0, this.v0, this.s0, this.b);
        if (this.B0) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        if (this.u0 == 0.0f) {
            this.u0 = (float) (width * 0.8d);
            double d = height;
            this.w0 = (float) (0.1d * d);
            float f = (float) (d * 0.9d);
            this.x0 = f;
            this.v0 = f;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (this.B0) {
            x = getWidth() - x;
        }
        if (motionEvent.getAction() == 0) {
            float f = this.u0;
            float f2 = this.s0 * 2.0f;
            if (x > f - f2 && x < f2 + f && motionEvent.getY() > this.w0 - (this.s0 * 2.0f)) {
                if (motionEvent.getY() < (this.s0 * 2.0f) + this.x0) {
                    this.y0 = true;
                }
            }
        }
        if (motionEvent.getAction() == 2 && this.y0) {
            float f3 = this.v0;
            float y = motionEvent.getY();
            float f4 = this.w0;
            if (y < f4) {
                this.v0 = f4;
            } else {
                float y2 = motionEvent.getY();
                float f5 = this.x0;
                if (y2 > f5) {
                    this.v0 = f5;
                } else {
                    this.v0 = motionEvent.getY();
                }
            }
            if (this.v0 != f3) {
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1 && this.y0) {
            this.y0 = false;
            post(new o3(22, this));
        }
        return true;
    }

    @Override // defpackage.ot0
    public void setBrushWidth(float f) {
        post(new pt0(this, f, 0));
    }

    public void setMaxBrushWidth(float f) {
        this.A0 = f;
    }

    public void setMinBrushWidth(float f) {
        this.z0 = f;
    }

    @Override // defpackage.ot0
    public void setPreviewColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setSeekBarLineColor(int i) {
        this.a.setColor(i);
    }

    public void setSeekBarLineWidth(float f) {
        this.t0 = f;
    }

    public void setSeekBarToggleColor(int i) {
        this.b.setColor(i);
    }
}
