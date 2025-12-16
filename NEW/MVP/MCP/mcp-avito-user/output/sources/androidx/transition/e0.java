package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes10.dex */
class e0 implements g0 {

    /* compiled from: ViewOverlayApi14.java */
    public static class a extends ViewGroup {
        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDraw(Canvas canvas) {
            throw null;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@j.N Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.View
        public final boolean verifyDrawable(@j.N Drawable drawable) {
            return super.verifyDrawable(drawable);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        }
    }
}
