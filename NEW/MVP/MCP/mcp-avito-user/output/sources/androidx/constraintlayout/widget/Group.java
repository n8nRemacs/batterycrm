package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends a {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void o() {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f44214r0.S(0);
        bVar.f44214r0.P(0);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        f();
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        f();
    }
}
