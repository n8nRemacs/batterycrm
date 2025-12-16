package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class f82 extends FrameLayout implements g54 {
    public int a;

    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
        this.a++;
    }

    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        this.a--;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
