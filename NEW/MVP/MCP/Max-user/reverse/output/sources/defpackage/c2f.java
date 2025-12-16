package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c2f extends h54 implements View.OnAttachStateChangeListener {
    public boolean X;
    public ViewGroup Y;
    public f54 Z;
    public boolean d;
    public final boolean o;

    public c2f() {
        this(true);
    }

    @Override // defpackage.h54
    public final void a() {
        f54 f54Var = this.Z;
        if (f54Var != null) {
            f54Var.d();
        }
        this.Z = null;
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Y = null;
    }

    @Override // defpackage.h54
    public final h54 b() {
        return new c2f(this.d);
    }

    @Override // defpackage.h54
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.h54
    public final boolean e() {
        return this.o;
    }

    @Override // defpackage.h54
    public final void f(h54 h54Var, c54 c54Var) {
        this.X = true;
    }

    @Override // defpackage.h54
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var) {
        if (this.X) {
            return;
        }
        if (view != null && (!z || this.d)) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
        if (viewGroup.getWindowToken() != null) {
            f54Var.d();
            return;
        }
        this.Z = f54Var;
        this.Y = viewGroup;
        viewGroup.addOnAttachStateChangeListener(this);
    }

    @Override // defpackage.h54
    public final void h(Bundle bundle) {
        this.d = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    @Override // defpackage.h54
    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        f54 f54Var = this.Z;
        if (f54Var != null) {
            f54Var.d();
        }
        this.Z = null;
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Y = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public c2f(boolean z) {
        this.d = z;
        this.o = true;
    }
}
