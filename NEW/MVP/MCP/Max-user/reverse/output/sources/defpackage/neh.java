package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class neh implements View.OnAttachStateChangeListener {
    public meh X;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public mc5 o;

    public static View a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        return childAt instanceof ViewGroup ? a((ViewGroup) childAt) : childAt;
    }

    public final void b() {
        if (!this.a || !this.b || this.c || this.d == 3) {
            return;
        }
        this.d = 3;
        c54 c54Var = (c54) this.o.b;
        c54Var.viewIsAttached = true;
        c54Var.viewWasDetached = false;
        c54Var.attach(c54Var.view);
    }

    public final void c(boolean z) {
        mc5 mc5Var = this.o;
        boolean z2 = this.d == 2;
        if (z) {
            this.d = 2;
        } else {
            this.d = 1;
        }
        if (z2 && !z) {
            c54 c54Var = (c54) mc5Var.b;
            if (c54Var.isDetachFrozen) {
                return;
            }
            c54Var.detach(c54Var.view, false, false);
            return;
        }
        c54 c54Var2 = (c54) mc5Var.b;
        c54Var2.viewIsAttached = false;
        c54Var2.viewWasDetached = true;
        if (c54Var2.isDetachFrozen) {
            return;
        }
        c54Var2.detach(c54Var2.view, false, z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        n4e n4eVar = new n4e(this);
        if (!(view instanceof ViewGroup)) {
            this.b = true;
            b();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.b = true;
            b();
        } else {
            this.X = new meh(this, n4eVar);
            a(viewGroup).addOnAttachStateChangeListener(this.X);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
        if (this.b) {
            this.b = false;
            c(false);
        }
    }
}
