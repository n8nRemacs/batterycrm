package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
@j.X
/* loaded from: classes10.dex */
class i0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f54790c = true;

    @SuppressLint({"NewApi"})
    public float b(@j.N View view) {
        if (f54790c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f54790c = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void c(@j.N View view, float f12) {
        if (f54790c) {
            try {
                view.setTransitionAlpha(f12);
                return;
            } catch (NoSuchMethodError unused) {
                f54790c = false;
            }
        }
        view.setAlpha(f12);
    }
}
