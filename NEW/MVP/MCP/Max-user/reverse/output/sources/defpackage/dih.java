package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class dih extends cih {
    @Override // defpackage.ari
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.ari
    public final void d(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.cih, defpackage.ari
    public final void e(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.cih
    public final void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.cih
    public final void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.cih
    public final void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
