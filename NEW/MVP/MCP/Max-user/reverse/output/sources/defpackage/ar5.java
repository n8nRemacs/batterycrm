package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* loaded from: classes.dex */
public final class ar5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ar5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        oo ooVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FastScroller fastScroller = (FastScroller) obj;
                fastScroller.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    fastScroller.y0 = false;
                    return true;
                }
                int i2 = FastScroller.A0;
                fastScroller.y0 = true;
                if (fastScroller.c()) {
                    float rawY = motionEvent.getRawY();
                    View view2 = fastScroller.d;
                    ((View) view2.getParent()).getLocationInWindow(new int[]{0, (int) view2.getY()});
                    f = rawY - r0[1];
                    width = fastScroller.getHeight();
                    width2 = fastScroller.d.getHeight();
                } else {
                    float rawX = motionEvent.getRawX();
                    View view3 = fastScroller.d;
                    ((View) view3.getParent()).getLocationInWindow(new int[]{(int) view3.getX(), 0});
                    f = rawX - r0[0];
                    width = fastScroller.getWidth();
                    width2 = fastScroller.d.getWidth();
                }
                float f2 = f / (width - width2);
                fastScroller.setScrollerPosition(f2);
                fastScroller.setRecyclerViewPosition(f2);
                return true;
            case 1:
                ca8 ca8Var = (ca8) obj;
                aa8 aa8Var = ca8Var.B0;
                Handler handler = ca8Var.F0;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && (ooVar = ca8Var.J0) != null && ooVar.isShowing() && x >= 0 && x < ca8Var.J0.getWidth() && y >= 0 && y < ca8Var.J0.getHeight()) {
                    handler.postDelayed(aa8Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(aa8Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
