package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.it3;
import defpackage.kt3;

/* loaded from: classes.dex */
public class Group extends it3 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.it3
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.it3
    public final void j() {
        kt3 kt3Var = (kt3) getLayoutParams();
        kt3Var.p0.O(0);
        kt3Var.p0.L(0);
    }

    @Override // defpackage.it3, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
