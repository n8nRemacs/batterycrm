package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class b6h extends View implements u6g {
    public static final /* synthetic */ yy7[] N0;
    public float A0;
    public boolean B0;
    public boolean C0;
    public Float D0;
    public ValueAnimator E0;
    public float F0;
    public float G0;
    public ValueAnimator H0;
    public boolean I0;
    public final RectF J0;
    public final k18 K0;
    public final Object L0;
    public final GestureDetector M0;
    public z5h a;
    public boolean b;
    public int c;
    public final Paint d;
    public int o;
    public PorterDuffColorFilter s0;
    public final Object t0;
    public final Paint u0;
    public int v0;
    public final Paint w0;
    public final w4g x0;
    public float y0;
    public ValueAnimator z0;

    static {
        z8a z8aVar = new z8a(b6h.class, "isInPause", "isInPause()Z");
        vid.a.getClass();
        N0 = new yy7[]{z8aVar};
    }

    public b6h(Context context) {
        super(context);
        this.b = true;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        this.d = paint;
        this.t0 = ipi.b(3, new q8g(13));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.u0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.w0 = paint3;
        this.x0 = new w4g(this);
        this.F0 = vw4.d().getDisplayMetrics().density * 4.0f;
        this.G0 = vw4.d().getDisplayMetrics().density * 16.0f;
        this.J0 = new RectF();
        k18 k18Var = fq9.a;
        this.K0 = gq9.a.getAccessor().d(540);
        k18 k18VarB = ipi.b(3, new sue(this, 11, context));
        this.L0 = k18VarB;
        this.M0 = new GestureDetector(context, new kx0(14, this));
        setElevation(2.0f);
        onThemeChanged(a93.s0.y(this));
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new r40(this, 18, this));
        } else if (k18VarB.e()) {
            getBitmapPool().b(k18VarB.getValue());
        }
    }

    public static Bitmap a(b6h b6hVar, Context context) {
        return ivi.b(b6hVar.getBitmapPool(), context, ivd.m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final np0 getBitmapPool() {
        return (np0) this.K0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Paint getDragPaint() {
        return (Paint) this.t0.getValue();
    }

    public static void l(b6h b6hVar, float f) {
        if (b6hVar.i()) {
            b6hVar.setInPause(false);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(b6hVar.y0, n7j.b(f, 0.0f, 100.0f));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new y5h(b6hVar, 0));
        valueAnimatorOfFloat.start();
        b6hVar.z0 = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInPause(boolean z) {
        this.x0.O(this, N0[0], Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f5 = this.G0;
        if (z) {
            f = vw4.d().getDisplayMetrics().density;
            f2 = 12.0f;
        } else {
            f = vw4.d().getDisplayMetrics().density;
            f2 = 16.0f;
        }
        float f6 = f * f2;
        float f7 = this.F0;
        if (z) {
            f3 = vw4.d().getDisplayMetrics().density;
            f4 = 5.0f;
        } else {
            f3 = vw4.d().getDisplayMetrics().density;
            f4 = 4.0f;
        }
        float f8 = f3 * f4;
        if (!z) {
            this.I0 = true;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new utc(this, f5, f6, f7, f8, 1));
        valueAnimatorOfFloat.addListener(new a6h(this, 0));
        valueAnimatorOfFloat.start();
        this.H0 = valueAnimatorOfFloat;
    }

    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        ValueAnimator valueAnimator = this.E0;
        if ((valueAnimator == null || !valueAnimator.isRunning() || this.I0) && (!i() || this.B0)) {
            canvas2 = canvas;
        } else {
            int iF = f(this.v0);
            Paint paint = this.w0;
            paint.setAlpha(iF);
            canvas2 = canvas;
            canvas2.drawOval(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            getDragPaint().setAlpha(f(this.o));
            float f = (vw4.d().getDisplayMetrics().density * 48.0f) / 2.0f;
            RectF rectF = this.J0;
            rectF.set(width - f, height - f, width + f, f + height);
            canvas2.drawBitmap((Bitmap) this.L0.getValue(), (Rect) null, rectF, getDragPaint());
        }
        ValueAnimator valueAnimator2 = this.E0;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && !i()) {
            if (i()) {
                return;
            }
            h(canvas2, width, height);
            return;
        }
        int iF2 = f(this.c);
        Paint paint2 = this.d;
        paint2.setAlpha(iF2);
        canvas2.drawCircle(width, height, this.A0, paint2);
        h(canvas2, width, height);
        getDragPaint().setAlpha(f(this.o));
        long jE = e(width, height);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        ValueAnimator valueAnimator3 = this.E0;
        float animatedFraction = valueAnimator3 != null ? valueAnimator3.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator4 = this.E0;
        canvas2.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, (valueAnimator4 != null && valueAnimator4.isRunning() && i()) ? animatedFraction * this.G0 : this.G0 * (1 - animatedFraction), getDragPaint());
    }

    public final long e(float f, float f2) {
        double radians = Math.toRadians(((this.y0 * 360.0f) / 100.0f) - 90);
        return m26.a((this.A0 * ((float) Math.cos(radians))) + f, (this.A0 * ((float) Math.sin(radians))) + f2);
    }

    public final int f(int i) {
        ValueAnimator valueAnimator = this.E0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.E0;
        return (valueAnimator2 != null && valueAnimator2.isRunning() && i()) ? kti.d(animatedFraction * i) : u45.q(animatedFraction, i, i);
    }

    public final float g() {
        int iMin = Math.min(getWidth(), getHeight());
        return (i() ? u45.d(27, vw4.d().getDisplayMetrics().density, 2, iMin) : u45.d(8, vw4.d().getDisplayMetrics().density, 2, iMin)) / 2.0f;
    }

    public final z5h getListener() {
        return this.a;
    }

    public final void h(Canvas canvas, float f, float f2) {
        float f3 = (this.y0 * 360.0f) / 100.0f;
        float f4 = this.A0;
        RectF rectF = this.J0;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawArc(rectF, -90.0f, f3, false, this.u0);
    }

    public final boolean i() {
        yy7 yy7Var = N0[0];
        return ((Boolean) this.x0.b).booleanValue();
    }

    public final void j() {
        if (this.b) {
            setInPause(true);
        }
    }

    public final void k() {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.y0 = 0.0f;
        setInPause(false);
    }

    public final void m(float f, float f2) {
        float f3 = 360;
        this.y0 = ((((((float) Math.toDegrees(Math.atan2(f2, f))) + 90) + f3) % f3) / 360.0f) * 100.0f;
        postInvalidateOnAnimation();
        Float f4 = this.D0;
        if (f4 != null && Math.signum(f) != Math.signum(f4.floatValue()) && f2 < 0.0f) {
            uog.i(this, q07.LONG_PRESS);
        }
        this.D0 = Float.valueOf(f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A0 = g();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yebVar.a();
        Paint paint = this.d;
        paint.setColor(1392508927);
        this.c = paint.getAlpha();
        this.s0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        getDragPaint().setColor(-1);
        Paint dragPaint = getDragPaint();
        PorterDuffColorFilter porterDuffColorFilter = this.s0;
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = null;
        }
        dragPaint.setColorFilter(porterDuffColorFilter);
        this.o = getDragPaint().getAlpha();
        this.u0.setColor(-1191182337);
        int i = yebVar.b().f;
        Paint paint2 = this.w0;
        paint2.setColor(i);
        this.v0 = paint2.getAlpha();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        if (this.B0 && motionEvent.getAction() == 1) {
            m(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
            z5h z5hVar = this.a;
            if (z5hVar != null) {
                ((v6h) z5hVar).z();
            }
            setInPause(false);
            this.B0 = false;
            this.D0 = null;
            getParent().requestDisallowInterceptTouchEvent(false);
            d(false);
            return true;
        }
        if (!this.B0 || motionEvent.getAction() != 2) {
            return this.M0.onTouchEvent(motionEvent);
        }
        this.C0 = true;
        m(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
        z5h z5hVar2 = this.a;
        if (z5hVar2 != null) {
            ((v6h) z5hVar2).A(this.y0);
        }
        return true;
    }

    public final void setListener(z5h z5hVar) {
        this.a = z5hVar;
    }

    public final void setPausingEnabled(boolean z) {
        this.b = z;
    }

    public final void setProgressForced(float f) {
        this.y0 = n7j.b(f, 0.0f, 100.0f);
        postInvalidateOnAnimation();
    }
}
