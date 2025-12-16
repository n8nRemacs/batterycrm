package defpackage;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public interface ii9 {
    default void e(MotionEvent motionEvent, int[] iArr) {
    }

    boolean i(MotionEvent motionEvent);

    default jd3 o(MotionEvent motionEvent) {
        return null;
    }

    default boolean t(MotionEvent motionEvent) {
        return false;
    }
}
