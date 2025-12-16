package defpackage;

import android.view.View;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public abstract class j9j {
    public static int a(iid iidVar, aw7 aw7Var, View view, View view2, a aVar, boolean z) {
        if (aVar.x() == 0 || iidVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(a.N(view) - a.N(view2)) + 1;
        }
        return Math.min(aw7Var.n(), aw7Var.c(view2) - aw7Var.f(view));
    }

    public static int b(iid iidVar, aw7 aw7Var, View view, View view2, a aVar, boolean z, boolean z2) {
        if (aVar.x() == 0 || iidVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (iidVar.b() - Math.max(a.N(view), a.N(view2))) - 1) : Math.max(0, Math.min(a.N(view), a.N(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(aw7Var.c(view2) - aw7Var.f(view)) / (Math.abs(a.N(view) - a.N(view2)) + 1))) + (aw7Var.m() - aw7Var.f(view)));
        }
        return iMax;
    }

    public static int c(iid iidVar, aw7 aw7Var, View view, View view2, a aVar, boolean z) {
        if (aVar.x() == 0 || iidVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return iidVar.b();
        }
        return (int) (((aw7Var.c(view2) - aw7Var.f(view)) / (Math.abs(a.N(view) - a.N(view2)) + 1)) * iidVar.b());
    }

    public static final boolean d(View view) {
        return view.getContext().getResources().getConfiguration().orientation == 2;
    }
}
