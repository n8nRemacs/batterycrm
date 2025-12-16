package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class meh implements View.OnAttachStateChangeListener {
    public boolean a = false;
    public final /* synthetic */ n4e b;
    public final /* synthetic */ neh c;

    public meh(neh nehVar, n4e n4eVar) {
        this.c = nehVar;
        this.b = n4eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a) {
            return;
        }
        neh nehVar = this.c;
        if (nehVar.X != null) {
            this.a = true;
            neh nehVar2 = (neh) this.b.a;
            nehVar2.b = true;
            nehVar2.b();
            view.removeOnAttachStateChangeListener(this);
            nehVar.X = null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
