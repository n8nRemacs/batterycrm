package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* compiled from: MotionTelltales.java */
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public MotionLayout f44131b;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.c, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.f44131b == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f44131b = (MotionLayout) parent;
                return;
            }
            return;
        }
        getWidth();
        getHeight();
        float f12 = new float[]{0.1f, 0.25f, 0.5f, 0.75f, 0.9f}[0];
        this.f44131b.t(this, f12, f12);
        throw null;
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
