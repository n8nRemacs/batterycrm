package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
@j.X
/* loaded from: classes10.dex */
class m0 extends l0 {
    @Override // androidx.transition.l0, androidx.transition.n0
    public final void a(@j.N View view, int i12) {
        view.setTransitionVisibility(i12);
    }

    @Override // androidx.transition.i0
    public final float b(@j.N View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.i0
    public final void c(@j.N View view, float f12) {
        view.setTransitionAlpha(f12);
    }

    @Override // androidx.transition.j0
    public final void d(@j.N View view, @j.P Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.j0
    public final void e(@j.N View view, @j.N Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.j0
    public final void f(@j.N View view, @j.N Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.k0
    public final void g(@j.N View view, int i12, int i13, int i14, int i15) {
        view.setLeftTopRightBottom(i12, i13, i14, i15);
    }
}
