package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class yh4 implements aid {
    public final RecyclerView a;
    public View b;
    public final Rect c = new Rect();

    public yh4(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.aid
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.aid
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        View childAt;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2.H(x, y) == null) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int i = 0;
            while (true) {
                if (i >= recyclerView2.getChildCount()) {
                    childAt = null;
                    break;
                }
                int i2 = i + 1;
                childAt = recyclerView2.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                a layoutManager = recyclerView2.getLayoutManager();
                Rect rect = this.c;
                if (layoutManager != null) {
                    layoutManager.B(rect, childAt);
                }
                if (rect.contains((int) x2, (int) y2)) {
                    break;
                }
                i = i2;
            }
            boolean z = recyclerView.getScrollState() != 0;
            if (motionEvent.getAction() == 0) {
                this.b = childAt;
            }
            View view = this.b;
            if (view != null) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (z || !fni.a(childAt, view)) {
                    motionEventObtain.setAction(3);
                }
                motionEventObtain.offsetLocation((-motionEvent.getX()) + 1.0f, (-motionEvent.getY()) + (view.getMeasuredHeight() / 2));
                view.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.aid
    public final void e(boolean z) {
    }
}
