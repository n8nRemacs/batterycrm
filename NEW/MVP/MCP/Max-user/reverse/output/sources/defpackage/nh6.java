package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class nh6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph6 b;

    public /* synthetic */ nh6(ph6 ph6Var, int i) {
        this.a = i;
        this.b = ph6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ph6 ph6Var = this.b;
                ph6Var.a();
                View view = ph6Var.d;
                if (view.isEnabled() && !view.isLongClickable() && ph6Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ph6Var.Y = true;
                    break;
                }
                break;
        }
    }
}
