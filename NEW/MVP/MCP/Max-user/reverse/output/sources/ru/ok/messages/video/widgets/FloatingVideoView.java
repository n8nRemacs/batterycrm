package ru.ok.messages.video.widgets;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import defpackage.t1b;
import defpackage.v26;
import defpackage.wqi;
import defpackage.zm;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FloatingVideoView extends FrameLayout {
    public v26 a;
    public VelocityTracker b;

    public int getLeftMargin() {
        return 0;
    }

    public int getRightMargin() {
        return 0;
    }

    public int getTopMargin() {
        return ((t1b) zm.a()).e().i();
    }

    public int getWindowHeight() {
        throw null;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return null;
    }

    public int getWindowWidth() {
        throw null;
    }

    public int getXPos() {
        throw null;
    }

    public int getYPos() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wqi.c("ru.ok.messages.video.widgets.FloatingVideoView", "Action " + motionEvent.getAction(), new Object[0]);
        if (motionEvent.getAction() == 2 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            throw null;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(motionEvent);
        this.b.computeCurrentVelocity(1);
        float fAbs = Math.abs(this.b.getYVelocity());
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            motionEvent.getRawX();
            throw null;
        }
        VelocityTracker velocityTracker = this.b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.b = null;
        }
        if (fAbs <= 4.0f) {
            throw null;
        }
        new ArrayList();
        throw null;
    }

    public void setListener(v26 v26Var) {
        this.a = v26Var;
    }

    @Keep
    public void setX(int i) {
        throw null;
    }

    @Keep
    public void setY(int i) {
        throw null;
    }
}
