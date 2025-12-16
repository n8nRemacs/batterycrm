package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a74;
import defpackage.d74;
import defpackage.z5d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a74 {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.a74
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.a74
    public final void g(d74 d74Var) {
        if (d74Var.h == 0) {
            d74Var.h = 80;
        }
    }

    @Override // defpackage.a74
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.a74
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.FloatingActionButton_Behavior_Layout);
        typedArrayObtainStyledAttributes.getBoolean(z5d.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
