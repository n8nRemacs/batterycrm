package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a74;
import defpackage.hfh;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a74 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.a74
    public abstract boolean f(View view, View view2);

    @Override // defpackage.a74
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.a74
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = hfh.a;
        if (!view.isLaidOut()) {
            List listD = coordinatorLayout.d(view);
            int size = listD.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) listD.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
