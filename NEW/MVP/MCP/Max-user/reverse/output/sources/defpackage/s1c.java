package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class s1c implements v1c {
    public final Object X = ipi.b(3, new ffb(13, this));
    public u1c Y = u1c.e;
    public final View a;
    public final ukd b;
    public final lc1 c;
    public float d;
    public float o;

    public s1c(View view, ukd ukdVar, lc1 lc1Var) {
        this.a = view;
        this.b = ukdVar;
        this.c = lc1Var;
    }

    public final void a() {
        View view = this.a;
        float translationX = view.getTranslationX();
        float translationX2 = this.Y.a;
        if (translationX >= translationX2) {
            float translationX3 = view.getTranslationX();
            translationX2 = this.Y.b;
            if (translationX3 <= translationX2) {
                translationX2 = view.getTranslationX();
            }
        }
        float translationY = view.getTranslationY();
        float translationY2 = this.Y.c;
        if (translationY >= translationY2) {
            float translationY3 = view.getTranslationY();
            translationY2 = this.Y.d;
            if (translationY3 <= translationY2) {
                translationY2 = view.getTranslationY();
            }
        }
        if (translationX2 == view.getTranslationX() && translationY2 == view.getTranslationY()) {
            d();
        } else {
            view.animate().setDuration(200L).translationX(translationX2).translationY(translationY2).setListener(new qe(7, this)).start();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    @Override // defpackage.v1c
    public final boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view = this.a;
        if (action == 0) {
            this.d = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            float fAbs = Math.abs(this.d - motionEvent.getRawX());
            ?? r1 = this.X;
            boolean z = fAbs < ((float) ((Number) r1.getValue()).intValue());
            boolean z2 = Math.abs(this.o - motionEvent.getRawY()) < ((float) ((Number) r1.getValue()).intValue());
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if ((motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout()) && (!z || !z2)) {
                return false;
            }
        } else {
            if (action2 == 2) {
                view.setTranslationX((motionEvent.getRawX() - this.d) + view.getTranslationX());
                view.setTranslationY((motionEvent.getRawY() - this.o) + view.getTranslationY());
                this.d = motionEvent.getRawX();
                this.o = motionEvent.getRawY();
                this.b.H(view.getX(), view.getY());
                return true;
            }
            if (action2 == 3) {
                a();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.v1c
    public final void c(float f, float f2) {
        View view = this.a;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        a();
    }

    public final void d() {
        View view = this.a;
        float x = view.getX();
        float y = view.getY();
        PointF pointF = ((mc1) this.c).b;
        pointF.x = x;
        pointF.y = y;
    }

    @Override // defpackage.v1c
    public final void t(float f, float f2, int i, int i2, j1c j1cVar) {
        this.Y = am3.b(this.a.getContext(), f, f2, i, i2, j1cVar);
    }
}
