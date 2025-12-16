package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public abstract class shh {
    public static final Rect a = new Rect();
    public static final int[] b = new int[2];

    public static final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, View view) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final qhh b(ViewGroup viewGroup, cm6 cm6Var) {
        ViewGroup viewGroup2;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        rhh rhhVar = new rhh(cm6Var, viewTreeObserver, viewGroup);
        viewTreeObserver.addOnGlobalLayoutListener(rhhVar);
        if (!viewGroup.isAttachedToWindow()) {
            viewGroup2 = viewGroup;
            if (!viewGroup2.isAttachedToWindow()) {
                viewGroup2.addOnAttachStateChangeListener(new phh(viewGroup2, rhhVar, viewTreeObserver, viewGroup2, 0));
            } else if (viewGroup2.isAttachedToWindow()) {
                viewGroup2.addOnAttachStateChangeListener(new phh(viewGroup2, rhhVar, viewTreeObserver, viewGroup2, 2));
            } else {
                a(rhhVar, viewTreeObserver, viewGroup2);
            }
        } else if (viewGroup.isAttachedToWindow()) {
            viewGroup2 = viewGroup;
            viewGroup2.addOnAttachStateChangeListener(new phh(viewGroup2, rhhVar, viewTreeObserver, viewGroup, 1));
        } else {
            a(rhhVar, viewTreeObserver, viewGroup);
            viewGroup2 = viewGroup;
        }
        return new qhh(viewTreeObserver, viewGroup2, rhhVar);
    }

    public static final Rect c(View view, View view2) {
        int left = view.getLeft();
        int top = view.getTop();
        Object parent = view.getParent();
        while (parent != view2 && (parent instanceof View)) {
            View view3 = (View) parent;
            int scrollX = left - view3.getScrollX();
            int scrollY = top - view3.getScrollY();
            left = scrollX + view3.getLeft();
            top = scrollY + view3.getTop();
            parent = view3.getParent();
        }
        int width = view.getWidth() + left;
        int height = view.getHeight() + top;
        Rect rect = a;
        rect.set(left, top, width, height);
        return rect;
    }

    public static final void d(Rect rect, View view) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
