package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
@j.X
/* loaded from: classes10.dex */
class j0 extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f54799d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f54800e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f54801f = true;

    @SuppressLint({"NewApi"})
    public void d(@j.N View view, @j.P Matrix matrix) {
        if (f54799d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f54799d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(@j.N View view, @j.N Matrix matrix) {
        if (f54800e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f54800e = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(@j.N View view, @j.N Matrix matrix) {
        if (f54801f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f54801f = false;
            }
        }
    }
}
