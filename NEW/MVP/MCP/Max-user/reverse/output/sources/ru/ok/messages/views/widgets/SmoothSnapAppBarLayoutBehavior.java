package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import defpackage.in;

/* loaded from: classes2.dex */
public class SmoothSnapAppBarLayoutBehavior extends AppBarLayout$Behavior {
    public int o;
    public boolean p;

    public SmoothSnapAppBarLayoutBehavior() {
        this.o = -1;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.a74
    /* renamed from: G */
    public final boolean u(CoordinatorLayout coordinatorLayout, in inVar, View view, View view2, int i, int i2) {
        int i3 = this.o;
        if (i3 != -1) {
            v(coordinatorLayout, inVar, view2, i3);
            this.p = true;
        }
        this.o = i2;
        return super.u(coordinatorLayout, inVar, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.a74
    /* renamed from: H */
    public final void v(CoordinatorLayout coordinatorLayout, in inVar, View view, int i) {
        if (this.p) {
            this.p = false;
        } else {
            if (this.o == -1) {
                return;
            }
            this.o = -1;
            super.v(coordinatorLayout, inVar, view, 0);
        }
    }

    public SmoothSnapAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = -1;
    }
}
