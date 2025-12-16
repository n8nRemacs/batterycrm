package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
@j.X
/* loaded from: classes10.dex */
class k0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f54803g = true;

    @SuppressLint({"NewApi"})
    public void g(@j.N View view, int i12, int i13, int i14, int i15) {
        if (f54803g) {
            try {
                view.setLeftTopRightBottom(i12, i13, i14, i15);
            } catch (NoSuchMethodError unused) {
                f54803g = false;
            }
        }
    }
}
