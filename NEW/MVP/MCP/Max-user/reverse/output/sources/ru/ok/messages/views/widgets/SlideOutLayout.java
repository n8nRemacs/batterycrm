package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import defpackage.b6d;
import defpackage.j4f;
import defpackage.k4f;
import defpackage.m8j;
import defpackage.ozg;
import defpackage.q00;
import defpackage.ql6;
import defpackage.rw4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.fragments.FrgSlideOut;

/* loaded from: classes2.dex */
public class SlideOutLayout extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public VelocityTracker A0;
    public final rw4 a;
    public int b;
    public int c;
    public float d;
    public float o;
    public float s0;
    public float t0;
    public final float u0;
    public boolean v0;
    public boolean w0;
    public k4f x0;
    public final ArrayList y0;
    public final int[] z0;

    public SlideOutLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.d = -1.0f;
        this.o = -1.0f;
        this.s0 = 0.0f;
        this.t0 = 0.0f;
        this.v0 = false;
        this.w0 = false;
        this.y0 = new ArrayList();
        this.z0 = new int[2];
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b6d.SlideOutLayout);
        this.b = typedArrayObtainStyledAttributes.getInt(b6d.SlideOutLayout_chistyakov_orientation, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(b6d.SlideOutLayout_type, 0);
        m8j.a(this);
        if (m8j.d(this)) {
            if (this.c == 1 && m8j.d(this)) {
                this.c = 2;
            } else if (this.c == 2) {
                this.c = 1;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        getContext();
        this.a = rw4.a();
        if (getBackground() != null) {
            getBackground().mutate();
            getBackground().setAlpha(255);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float fMax = Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2;
        this.u0 = fMax;
        if (fMax <= 0.0f) {
            this.u0 = this.a.q;
        }
    }

    public final boolean a(View view) {
        float fB = b(view);
        return (this.b == 0 && Math.abs(fB / ((float) getMeasuredHeight())) > 0.2f) || (this.b == 1 && Math.abs(fB / ((float) getMeasuredWidth())) > 0.2f);
    }

    public final float b(View view) {
        return this.b == 0 ? view.getTranslationY() : view.getTranslationX();
    }

    public final void c(MotionEvent motionEvent) {
        float f;
        float x;
        float f2;
        float y;
        int i;
        int i2;
        if (this.o <= 0.0f || this.d <= 0.0f) {
            this.s0 = motionEvent.getY();
            this.t0 = motionEvent.getX();
        } else {
            if (this.b == 0) {
                f = this.s0;
                x = motionEvent.getY();
            } else {
                f = this.t0;
                x = motionEvent.getX();
            }
            float f3 = f - x;
            if (this.b == 0) {
                f2 = this.t0;
                y = motionEvent.getX();
            } else {
                f2 = this.s0;
                y = motionEvent.getY();
            }
            float fAbs = Math.abs(f2 - y);
            if (f3 > 0.0f && ((i2 = this.c) == 1 || i2 == 3)) {
                return;
            }
            if (f3 < 0.0f && ((i = this.c) == 2 || i == 4)) {
                return;
            }
            float fAbs2 = Math.abs(f3);
            if (fAbs2 > this.u0 && fAbs2 > fAbs * 2.0f) {
                this.v0 = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                k4f k4fVar = this.x0;
                if (k4fVar != null) {
                    k4fVar.o();
                }
            }
        }
        this.d = motionEvent.getY();
        this.o = motionEvent.getX();
    }

    public final void d(float f) {
        View childAt = getChildAt(0);
        long jAbs = f != 0.0f ? Math.abs((long) (b(childAt) / f)) : 150L;
        long j = jAbs <= 150 ? jAbs : 150L;
        if (this.b == 0) {
            childAt.animate().translationY(0.0f).setDuration(j).start();
        } else {
            childAt.animate().translationX(0.0f).setDuration(j).start();
        }
    }

    public final void e() {
        float translationX;
        int measuredWidth;
        if (getBackground() == null || getChildCount() <= 0) {
            return;
        }
        if (this.b == 0) {
            translationX = getChildAt(0).getTranslationY();
            measuredWidth = getMeasuredHeight();
        } else {
            translationX = getChildAt(0).getTranslationX();
            measuredWidth = getMeasuredWidth();
        }
        int iAbs = (int) ((1.0f - Math.abs(translationX / measuredWidth)) * 255.0f);
        if (iAbs > 255) {
            iAbs = 255;
        }
        getBackground().setAlpha(iAbs >= 0 ? iAbs : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            this.v0 = false;
            d(0.0f);
            return false;
        }
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null && view.getVisibility() == 0) {
                view.getLocationInWindow(this.z0);
                if (motionEvent.getRawX() > r4[0]) {
                    if (motionEvent.getRawX() < view.getWidth() + r4[0] && motionEvent.getRawY() > r4[1]) {
                        if (motionEvent.getRawY() < view.getHeight() + r4[1]) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if (motionEvent.getAction() == 2 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            c(motionEvent);
        } else {
            this.d = -1.0f;
            this.o = -1.0f;
        }
        return this.v0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int measuredWidth;
        int measuredWidth2;
        FrgSlideOut frgSlideOut;
        ql6 ql6VarB0;
        float xVelocity;
        if (motionEvent.getPointerCount() > 1) {
            this.v0 = false;
            d(0.0f);
            return false;
        }
        int i = 3;
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            if (this.v0) {
                int i2 = this.b;
                float f2 = i2 == 0 ? this.d : this.o;
                if (f2 > 0.0f) {
                    float y = f2 - (i2 == 0 ? motionEvent.getY() : motionEvent.getX());
                    if (getChildCount() > 0) {
                        View childAt = getChildAt(0);
                        if (this.b == 0) {
                            float translationY = childAt.getTranslationY() - y;
                            int i3 = this.c;
                            if (i3 == 3 && translationY < 0.0f) {
                                translationY = 0.0f;
                            }
                            childAt.setTranslationY((i3 != 4 || translationY <= 0.0f) ? translationY : 0.0f);
                        } else {
                            float translationX = childAt.getTranslationX() - y;
                            int i4 = this.c;
                            if (i4 == 1 && translationX < 0.0f) {
                                translationX = 0.0f;
                            }
                            childAt.setTranslationX((i4 != 2 || translationX <= 0.0f) ? translationX : 0.0f);
                        }
                        boolean zA = a(childAt);
                        if (this.w0 != zA) {
                            if (this.x0 != null) {
                                b(childAt);
                            }
                            this.w0 = zA;
                        }
                        e();
                    }
                }
                this.d = motionEvent.getY();
                this.o = motionEvent.getX();
            } else {
                c(motionEvent);
            }
            if (this.A0 == null) {
                this.A0 = VelocityTracker.obtain();
            }
            this.A0.addMovement(motionEvent);
            return true;
        }
        if (this.v0 && getChildCount() > 0) {
            View childAt2 = getChildAt(0);
            VelocityTracker velocityTracker = this.A0;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1);
                if (this.b == 0) {
                    VelocityTracker velocityTracker2 = this.A0;
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    Map map = ozg.a;
                    xVelocity = velocityTracker2.getYVelocity(pointerId);
                } else {
                    VelocityTracker velocityTracker3 = this.A0;
                    int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    Map map2 = ozg.a;
                    xVelocity = velocityTracker3.getXVelocity(pointerId2);
                }
                f = (int) xVelocity;
                this.A0.recycle();
                this.A0 = null;
            } else {
                f = 0.0f;
            }
            float fB = b(childAt2);
            boolean zA2 = a(childAt2);
            if ((f == 0.0f || Math.signum(fB) == Math.signum(f)) && (Math.abs(f) >= 2.0f || zA2)) {
                if (this.b != 0) {
                    i = fB > 0.0f ? 2 : 1;
                } else if (fB > 0.0f) {
                    i = 4;
                }
                k4f k4fVar = this.x0;
                if (k4fVar == null || k4fVar.a()) {
                    View childAt3 = getChildAt(0);
                    if (this.b == 0) {
                        measuredWidth = childAt3.getMeasuredHeight();
                        measuredWidth2 = (getMeasuredHeight() - childAt3.getMeasuredHeight()) / 2;
                    } else {
                        measuredWidth = childAt3.getMeasuredWidth();
                        measuredWidth2 = (getMeasuredWidth() - childAt3.getMeasuredWidth()) / 2;
                    }
                    int i5 = measuredWidth2 + measuredWidth;
                    if (b(childAt3) < 0.0f) {
                        i5 = -i5;
                    }
                    long jAbs = f != 0.0f ? Math.abs((long) (i5 / f)) : 150L;
                    ViewPropertyAnimator listener = childAt3.animate().setDuration(jAbs <= 150 ? jAbs : 150L).setListener(new j4f(this, i));
                    listener.setUpdateListener(new q00(25, this));
                    if (this.b == 0) {
                        listener.translationY(i5);
                    } else {
                        listener.translationX(i5);
                    }
                    listener.start();
                } else {
                    this.x0.m(i);
                }
            } else {
                if (getBackground() != null) {
                    getBackground().setAlpha(255);
                }
                d(f);
                k4f k4fVar2 = this.x0;
                if (k4fVar2 != null && (ql6VarB0 = (frgSlideOut = (FrgSlideOut) k4fVar2).B0()) != null && frgSlideOut.u1) {
                    ((ActLocalMedias) ql6VarB0).V(true, false);
                }
            }
            boolean zA3 = a(childAt2);
            if (this.w0 != zA3) {
                if (this.x0 != null) {
                    b(childAt2);
                }
                this.w0 = zA3;
            }
        }
        this.d = -1.0f;
        this.o = -1.0f;
        this.v0 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.o = -1.0f;
        this.d = -1.0f;
        this.v0 = false;
    }

    public void setOrientation(int i) {
        this.b = i;
    }

    public void setSlideOutListener(k4f k4fVar) {
        this.x0 = k4fVar;
    }

    public void setType(int i) {
        this.c = i;
    }
}
