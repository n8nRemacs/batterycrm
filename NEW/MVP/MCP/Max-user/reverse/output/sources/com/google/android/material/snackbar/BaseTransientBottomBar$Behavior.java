package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.ai3;
import defpackage.b6a;
import defpackage.fl0;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final b6a h;

    public BaseTransientBottomBar$Behavior() {
        b6a b6aVar = new b6a(14);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = b6aVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.a74
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (ai3.b == null) {
                    ai3.b = new ai3(1);
                }
                synchronized (ai3.b.a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (ai3.b == null) {
                ai3.b = new ai3(1);
            }
            synchronized (ai3.b.a) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean x(View view) {
        this.h.getClass();
        return view instanceof fl0;
    }
}
