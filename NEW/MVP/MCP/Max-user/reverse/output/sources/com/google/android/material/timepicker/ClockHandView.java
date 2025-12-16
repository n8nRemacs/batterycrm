package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.dvc;
import defpackage.dwc;
import defpackage.exi;
import defpackage.hfh;
import defpackage.ic3;
import defpackage.m5d;
import defpackage.rg;
import defpackage.yqi;
import defpackage.z5d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ClockHandView extends View {
    public final ValueAnimator a;
    public boolean b;
    public final ArrayList c;
    public final int d;
    public final float o;
    public final Paint s0;
    public final RectF t0;
    public final int u0;
    public float v0;
    public boolean w0;
    public double x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        int i = dvc.materialClockStyle;
        super(context, attributeSet, i);
        this.a = new ValueAnimator();
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.s0 = paint;
        this.t0 = new RectF();
        this.z0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.ClockHandView, i, m5d.Widget_MaterialComponents_TimePicker_Clock);
        exi.c(dvc.motionDurationLong2, 200, context);
        exi.d(context, dvc.motionEasingEmphasizedInterpolator, rg.b);
        this.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.ClockHandView_materialCircleRadius, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.ClockHandView_selectorSize, 0);
        this.u0 = getResources().getDimensionPixelSize(dwc.material_clock_hand_stroke_width);
        this.o = r0.getDimensionPixelSize(dwc.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(z5d.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = hfh.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.y0 * 0.66f) : this.y0;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.v0 = f2;
        this.x0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.z0);
        float fCos = (((float) Math.cos(this.x0)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.x0))) + height;
        float f3 = this.d;
        this.t0.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((ic3) it.next());
            if (Math.abs(clockFaceView.V0 - f2) > 0.001f) {
                clockFaceView.V0 = f2;
                clockFaceView.w();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fA = a(this.z0);
        float fCos = (((float) Math.cos(this.x0)) * fA) + f;
        float f2 = height;
        float fSin = (fA * ((float) Math.sin(this.x0))) + f2;
        Paint paint = this.s0;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.d, paint);
        double dSin = Math.sin(this.x0);
        paint.setStrokeWidth(this.u0);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.x0) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.o, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a.isRunning()) {
            return;
        }
        b(this.v0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.w0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.w0;
            if (this.b) {
                this.z0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + yqi.b(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.w0;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.v0 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f);
            z3 = true;
        }
        this.w0 = z4 | z3;
        return true;
    }
}
