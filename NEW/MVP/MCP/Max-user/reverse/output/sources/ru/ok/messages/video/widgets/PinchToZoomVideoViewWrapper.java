package ru.ok.messages.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dd;
import defpackage.m0c;
import defpackage.rw4;
import defpackage.t1b;
import defpackage.utb;
import defpackage.zm;
import java.util.HashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;

/* loaded from: classes2.dex */
public class PinchToZoomVideoViewWrapper extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final /* synthetic */ int J0 = 0;
    public float A0;
    public float B0;
    public float C0;
    public ValueAnimator D0;
    public ValueAnimator E0;
    public ValueAnimator F0;
    public ValueAnimator G0;
    public ValueAnimator H0;
    public ValueAnimator I0;
    public final ScaleGestureDetector a;
    public final dd b;
    public m0c c;
    public float d;
    public float o;
    public float s0;
    public float t0;
    public boolean u0;
    public final Paint v0;
    public final Rect w0;
    public float x0;
    public float y0;
    public float z0;

    public PinchToZoomVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        this.b = ((t1b) zm.a()).a();
        this.c = m0c.b;
        this.o = 1.0f;
        this.u0 = false;
        Paint paint = new Paint();
        this.v0 = paint;
        this.w0 = new Rect();
        paint.setColor(-1);
        getContext();
        paint.setStrokeWidth(rw4.a().q);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private m0c getStateByScale() {
        m0c m0cVar = this.c;
        m0c m0cVar2 = m0c.a;
        m0c m0cVar3 = m0c.b;
        if (m0cVar == m0cVar3) {
            return this.o > utb.i(this.t0, 1.0f, 0.25f, 1.0f) ? m0cVar2 : m0cVar3;
        }
        float f = this.o;
        float f2 = this.t0;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? m0cVar3 : m0cVar2;
    }

    private View getVideoView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VideoView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Wrapper should contains VideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.B0, this.C0);
        float f = this.o;
        canvas.scale(f, f, this.x0, this.y0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.u0) {
            canvas.drawRect(this.w0, this.v0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.D0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.F0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.G0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.H0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.I0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getVideoView().getMeasuredHeight();
        int measuredWidth = getVideoView().getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || measuredWidth2 == 0 || measuredHeight2 == 0) {
            return;
        }
        float f = measuredWidth2;
        float f2 = measuredHeight2;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        if (f3 / f4 > f / f2) {
            this.t0 = f2 / f4;
        } else {
            this.t0 = f / f3;
        }
        this.s0 = this.t0 * 4.0f;
        this.w0.set(0, 0, measuredWidth2, measuredHeight2);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.d;
        this.o = scaleFactor;
        this.o = Math.min(this.s0, Math.max(0.9f, scaleFactor));
        if (getStateByScale() == m0c.a && this.c == m0c.b) {
            this.v0.setAlpha(HttpStatus.SC_PROCESSING);
            this.u0 = true;
        } else {
            this.u0 = false;
        }
        invalidate();
        this.B0 = scaleGestureDetector.getFocusX() - this.z0;
        this.C0 = scaleGestureDetector.getFocusY() - this.A0;
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.d = this.o;
        if (this.c == m0c.b) {
            this.x0 = scaleGestureDetector.getFocusX();
            this.y0 = scaleGestureDetector.getFocusY();
        }
        this.z0 = scaleGestureDetector.getFocusX();
        this.A0 = scaleGestureDetector.getFocusY();
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D0 = null;
        }
        ValueAnimator valueAnimator2 = this.E0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E0 = null;
            this.u0 = false;
        }
        ValueAnimator valueAnimator3 = this.F0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.G0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.H0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.I0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        m0c stateByScale = getStateByScale();
        final int i = 3;
        final int i2 = 0;
        m0c m0cVar = m0c.b;
        m0c m0cVar2 = m0c.a;
        if (stateByScale == m0cVar2 && this.c == m0cVar) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.4f, 1.0f, 0.0f).setDuration(600L);
            this.E0 = duration;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
                public final /* synthetic */ PinchToZoomVideoViewWrapper b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                            if (fFloatValue == 0.0d) {
                                pinchToZoomVideoViewWrapper.u0 = false;
                            }
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 1:
                            int i5 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 2:
                            int i6 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 3:
                            int i7 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 4:
                            int i8 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        default:
                            int i9 = PinchToZoomVideoViewWrapper.J0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                    }
                }
            });
            this.E0.start();
        }
        final int i3 = 1;
        final int i4 = 2;
        if (getStateByScale() == m0cVar2) {
            this.c = m0cVar2;
            this.D0 = ValueAnimator.ofFloat(this.o, this.t0);
        } else {
            this.c = m0cVar;
            this.D0 = ValueAnimator.ofFloat(this.o, 1.0f);
        }
        HashMap map = new HashMap();
        map.put("scaleType", this.c.toString());
        map.put("orientation", Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.b.g("PINCH_TO_ZOOM", map);
        this.D0.setDuration(300L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i3;
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i32) {
                    case 0:
                        int i42 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.u0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i5 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i6 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i7 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i8 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i9 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.D0.start();
        ValueAnimator duration2 = ValueAnimator.ofFloat(this.x0, getWidth() / 2).setDuration(300L);
        this.F0 = duration2;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i4;
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i32) {
                    case 0:
                        int i42 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.u0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i5 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i6 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i7 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i8 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i9 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.F0.start();
        ValueAnimator duration3 = ValueAnimator.ofFloat(this.y0, getHeight() / 2).setDuration(300L);
        this.G0 = duration3;
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i;
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i32) {
                    case 0:
                        int i42 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.u0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i5 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i6 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i7 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i8 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i9 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.G0.start();
        ValueAnimator duration4 = ValueAnimator.ofFloat(this.B0, 0.0f).setDuration(300L);
        this.H0 = duration4;
        final int i5 = 4;
        duration4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i5;
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i32) {
                    case 0:
                        int i42 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.u0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i52 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i6 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i7 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i8 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i9 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.H0.start();
        ValueAnimator duration5 = ValueAnimator.ofFloat(this.C0, 0.0f).setDuration(300L);
        this.I0 = duration5;
        final int i6 = 5;
        duration5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l0c
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i6;
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i32) {
                    case 0:
                        int i42 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.v0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.u0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i52 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i62 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i7 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i8 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i9 = PinchToZoomVideoViewWrapper.J0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.I0.start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getVideoView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
