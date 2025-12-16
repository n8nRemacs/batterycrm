package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class gh implements ViewTreeObserver.OnPreDrawListener {
    public boolean X;
    public final /* synthetic */ ih Y;
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final boolean d;
    public final f54 o;

    public gh(ih ihVar, f54 f54Var, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.Y = ihVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
        this.d = z;
        this.o = f54Var;
    }

    public final void a() {
        if (this.X) {
            return;
        }
        this.X = true;
        View view = this.c;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        this.Y.m(this.a, this.b, this.c, this.d, true, this.o);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        return true;
    }
}
