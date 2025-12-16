package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class rva implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler o = new Handler(Looper.getMainLooper());
    public final View a;
    public final cm6 b;
    public ViewTreeObserver c;
    public boolean d;

    public rva(View view, cm6 cm6Var) {
        this.a = view;
        this.b = cm6Var;
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = true;
        if (!this.d) {
            boolean zBooleanValue = ((Boolean) this.b.invoke()).booleanValue();
            this.d = true;
            o.post(new gq5(29, this));
            z = zBooleanValue;
        }
        if (!z) {
            wqi.h("OneShotOnPreDrawListener", "skipping frame", null);
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.c.isAlive();
        View view2 = this.a;
        if (zIsAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
