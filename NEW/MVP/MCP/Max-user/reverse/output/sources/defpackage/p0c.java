package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class p0c extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public float A0;
    public float B0;
    public ValueAnimator C0;
    public AnimatorSet D0;
    public zdg E0;
    public final ScaleGestureDetector a;
    public o0c b;
    public float c;
    public float d;
    public float o;
    public float s0;
    public boolean t0;
    public final Paint u0;
    public final Rect v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public p0c(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        this.b = o0c.b;
        this.d = 1.0f;
        Paint paint = new Paint();
        this.u0 = paint;
        this.v0 = new Rect();
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final o0c getStateByScale() {
        o0c o0cVar = this.b;
        o0c o0cVar2 = o0c.a;
        o0c o0cVar3 = o0c.b;
        if (o0cVar == o0cVar3) {
            float f = 1;
            return this.d > utb.i(this.s0, f, 0.25f, f) ? o0cVar2 : o0cVar3;
        }
        float f2 = this.d;
        float f3 = this.s0;
        return f2 < f3 - ((f3 - ((float) 1)) * 0.25f) ? o0cVar3 : o0cVar2;
    }

    private final View getVideoView() {
        Object next;
        f2 f2Var = new f2(9, this);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((View) next) instanceof odh) {
                break;
            }
        }
        return (View) next;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A0, this.B0);
        float f = this.d;
        canvas.scale(f, f, this.w0, this.x0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.t0) {
            canvas.drawRect(this.v0, this.u0);
        }
    }

    public final zdg getTouchEventDelegate() {
        return this.E0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        zdg zdgVar = this.E0;
        if (zdgVar != null) {
            ((tz4) zdgVar).d();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled() || (this.E0 != null && motionEvent.getPointerCount() <= 1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int measuredHeight = videoView.getMeasuredHeight();
        int measuredWidth = videoView.getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || measuredWidth2 == 0 || measuredHeight2 == 0) {
            return;
        }
        float f = measuredWidth2;
        float f2 = measuredHeight2;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
        this.s0 = f5;
        this.o = f5 * 4.0f;
        this.v0.set(0, 0, measuredWidth2, measuredHeight2);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.d = scaleFactor;
        this.d = (float) Math.min(this.o, Math.max(0.8999999761581421d, scaleFactor));
        if (getStateByScale() == o0c.a && this.b == o0c.b) {
            this.u0.setAlpha(HttpStatus.SC_PROCESSING);
            this.t0 = true;
        } else {
            this.t0 = false;
        }
        invalidate();
        this.A0 = scaleGestureDetector.getFocusX() - this.y0;
        this.B0 = scaleGestureDetector.getFocusY() - this.z0;
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.d;
        if (this.b == o0c.b) {
            this.w0 = scaleGestureDetector.getFocusX();
            this.x0 = scaleGestureDetector.getFocusY();
        }
        this.y0 = scaleGestureDetector.getFocusX();
        this.z0 = scaleGestureDetector.getFocusY();
        if (this.C0 != null) {
            this.C0 = null;
            this.t0 = false;
        }
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.D0 = null;
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        o0c stateByScale = getStateByScale();
        final int i = 3;
        final int i2 = 0;
        o0c o0cVar = o0c.b;
        o0c o0cVar2 = o0c.a;
        if (stateByScale == o0cVar2 && this.b == o0cVar) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.4f, 1.0f, 0.0f);
            valueAnimatorOfFloat2.setDuration(600L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
                public final /* synthetic */ p0c b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar = this.b;
                            p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                            if (fFloatValue == 0.0f) {
                                p0cVar.t0 = false;
                            }
                            p0cVar.invalidate();
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar2 = this.b;
                            p0cVar2.d = fFloatValue2;
                            p0cVar2.invalidate();
                            break;
                        case 2:
                            float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar3 = this.b;
                            p0cVar3.w0 = fFloatValue3;
                            p0cVar3.invalidate();
                            break;
                        case 3:
                            float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar4 = this.b;
                            p0cVar4.x0 = fFloatValue4;
                            p0cVar4.invalidate();
                            break;
                        case 4:
                            float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar5 = this.b;
                            p0cVar5.A0 = fFloatValue5;
                            p0cVar5.invalidate();
                            break;
                        default:
                            float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            p0c p0cVar6 = this.b;
                            p0cVar6.B0 = fFloatValue6;
                            p0cVar6.invalidate();
                            break;
                    }
                }
            });
            arrayList.add(valueAnimatorOfFloat2);
            this.C0 = valueAnimatorOfFloat2;
        }
        final int i3 = 1;
        final int i4 = 2;
        if (getStateByScale() == o0cVar2) {
            this.b = o0cVar2;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, this.s0);
        } else {
            this.b = o0cVar;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, 1.0f);
        }
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
            public final /* synthetic */ p0c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar = this.b;
                        p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            p0cVar.t0 = false;
                        }
                        p0cVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar2 = this.b;
                        p0cVar2.d = fFloatValue2;
                        p0cVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar3 = this.b;
                        p0cVar3.w0 = fFloatValue3;
                        p0cVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar4 = this.b;
                        p0cVar4.x0 = fFloatValue4;
                        p0cVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar5 = this.b;
                        p0cVar5.A0 = fFloatValue5;
                        p0cVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar6 = this.b;
                        p0cVar6.B0 = fFloatValue6;
                        p0cVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.w0, getWidth() / 2.0f);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
            public final /* synthetic */ p0c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar = this.b;
                        p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            p0cVar.t0 = false;
                        }
                        p0cVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar2 = this.b;
                        p0cVar2.d = fFloatValue2;
                        p0cVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar3 = this.b;
                        p0cVar3.w0 = fFloatValue3;
                        p0cVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar4 = this.b;
                        p0cVar4.x0 = fFloatValue4;
                        p0cVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar5 = this.b;
                        p0cVar5.A0 = fFloatValue5;
                        p0cVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar6 = this.b;
                        p0cVar6.B0 = fFloatValue6;
                        p0cVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.x0, getHeight() / 2.0f);
        valueAnimatorOfFloat4.setDuration(300L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
            public final /* synthetic */ p0c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar = this.b;
                        p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            p0cVar.t0 = false;
                        }
                        p0cVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar2 = this.b;
                        p0cVar2.d = fFloatValue2;
                        p0cVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar3 = this.b;
                        p0cVar3.w0 = fFloatValue3;
                        p0cVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar4 = this.b;
                        p0cVar4.x0 = fFloatValue4;
                        p0cVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar5 = this.b;
                        p0cVar5.A0 = fFloatValue5;
                        p0cVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar6 = this.b;
                        p0cVar6.B0 = fFloatValue6;
                        p0cVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat4);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(this.A0, 0.0f);
        valueAnimatorOfFloat5.setDuration(300L);
        final int i5 = 4;
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
            public final /* synthetic */ p0c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar = this.b;
                        p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            p0cVar.t0 = false;
                        }
                        p0cVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar2 = this.b;
                        p0cVar2.d = fFloatValue2;
                        p0cVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar3 = this.b;
                        p0cVar3.w0 = fFloatValue3;
                        p0cVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar4 = this.b;
                        p0cVar4.x0 = fFloatValue4;
                        p0cVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar5 = this.b;
                        p0cVar5.A0 = fFloatValue5;
                        p0cVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar6 = this.b;
                        p0cVar6.B0 = fFloatValue6;
                        p0cVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat5);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.B0, 0.0f);
        valueAnimatorOfFloat6.setDuration(300L);
        final int i6 = 5;
        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: n0c
            public final /* synthetic */ p0c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar = this.b;
                        p0cVar.u0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            p0cVar.t0 = false;
                        }
                        p0cVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar2 = this.b;
                        p0cVar2.d = fFloatValue2;
                        p0cVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar3 = this.b;
                        p0cVar3.w0 = fFloatValue3;
                        p0cVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar4 = this.b;
                        p0cVar4.x0 = fFloatValue4;
                        p0cVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar5 = this.b;
                        p0cVar5.A0 = fFloatValue5;
                        p0cVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p0c p0cVar6 = this.b;
                        p0cVar6.B0 = fFloatValue6;
                        p0cVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.D0 = animatorSet;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        zdg zdgVar = this.E0;
        if (zdgVar != null) {
            tz4 tz4Var = (tz4) zdgVar;
            p0c p0cVar = (p0c) tz4Var.c;
            Rect rect = (Rect) tz4Var.j;
            p0cVar.getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                ((GestureDetector) ((lk6) tz4Var.g).d).onTouchEvent(motionEvent);
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                ((GestureDetector) tz4Var.h).onTouchEvent(motionEvent);
            } else {
                ((GestureDetector) ((lk6) tz4Var.f).d).onTouchEvent(motionEvent);
            }
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        View videoView = getVideoView();
        if (videoView != null) {
            videoView.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setTouchEventDelegate(zdg zdgVar) {
        this.E0 = zdgVar;
    }
}
