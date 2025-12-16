package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class jih implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ f6 b;

    public jih(ViewTreeObserver viewTreeObserver, f6 f6Var) {
        this.a = viewTreeObserver;
        this.b = f6Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.b.run();
        return true;
    }
}
