package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class gvf extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public final lfh a;
    public boolean b;
    public ValueAnimator c;
    public fvf d;

    public gvf(Context context) {
        super(context, null);
        lfh lfhVar = new lfh(getContext(), this, new ps0(3, this));
        lfhVar.b = (int) (1.0f * lfhVar.b);
        this.a = lfhVar;
    }

    public static void a(gvf gvfVar, float f) {
        gvfVar.setBackgroundAlpha(f);
    }

    public static void b(gvf gvfVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1 - f2;
        }
        if (f > f2) {
            gvfVar.setBackgroundAlpha(1 - f);
        }
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (n7j.b(f, 0.0f, 1.0f) * 255));
        }
    }

    public final void c(int i, int i2, cm6 cm6Var, cm6 cm6Var2, sm6 sm6Var) {
        fvf fvfVar = this.d;
        if (fvfVar == null) {
            return;
        }
        ValueAnimator valueAnimator = this.c;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            lqi.a(valueAnimator2);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new nf(fvfVar, sm6Var, animatedFraction, 2));
        valueAnimatorOfInt.addListener(new xg(cm6Var2, this, cm6Var, 2));
        valueAnimatorOfInt.start();
        this.c = valueAnimatorOfInt;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.a.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        fvf fvfVar = this.d;
        if (fvfVar == null) {
            return;
        }
        if (fvfVar.m().getHeight() > 0) {
            int iO = fvfVar.o();
            int iG = fvfVar.g();
            int i = 26;
            c(iO, iG, new nte(i), new nte(i), new evf(this, 0));
        }
        invalidate();
    }

    public final fvf getCallback() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.p(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fvf fvfVar = this.d;
        if (fvfVar == null) {
            return;
        }
        View viewM = fvfVar.m();
        int top = viewM.getHeight() > 0 ? viewM.getTop() : fvfVar.o();
        super.onLayout(z, i, i2, i3, i4);
        viewM.offsetTopAndBottom(top);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.j(motionEvent);
        return true;
    }

    public final void setCallback(fvf fvfVar) {
        this.d = fvfVar;
    }
}
