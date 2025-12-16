package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class g48 implements j48, View.OnAttachStateChangeListener {
    public l48 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == l38.a) {
            this.a = new l48(this);
        }
        this.a.d(k38.ON_START);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(l38.c)) {
            this.a.d(k38.ON_DESTROY);
        }
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.a;
    }
}
