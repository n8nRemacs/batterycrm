package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zs7 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ bt7 b;

    public zs7(bt7 bt7Var) {
        this.b = bt7Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        bt7 bt7Var;
        View viewO;
        if (!this.a || (viewO = (bt7Var = this.b).o(motionEvent)) == null || bt7Var.B0.T(viewO) == null) {
            return;
        }
        at7 at7Var = bt7Var.w0;
        RecyclerView recyclerView = bt7Var.B0;
        int i = at7Var.c;
        int i2 = at7Var.b;
        int i3 = (i2 << 8) | i2 | i | (i << 16);
        WeakHashMap weakHashMap = hfh.a;
        if ((at7.b(i3, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i4 = bt7Var.v0;
            if (pointerId == i4) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                bt7Var.d = x;
                bt7Var.o = y;
                bt7Var.s0 = 0.0f;
                bt7Var.Z = 0.0f;
                bt7Var.w0.getClass();
            }
        }
    }
}
