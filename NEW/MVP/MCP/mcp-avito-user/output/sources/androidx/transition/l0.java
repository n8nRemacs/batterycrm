package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
@j.X
/* loaded from: classes10.dex */
class l0 extends k0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f54807h = true;

    @Override // androidx.transition.n0
    @SuppressLint({"NewApi"})
    public void a(@j.N View view, int i12) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i12);
        } else if (f54807h) {
            try {
                view.setTransitionVisibility(i12);
            } catch (NoSuchMethodError unused) {
                f54807h = false;
            }
        }
    }
}
