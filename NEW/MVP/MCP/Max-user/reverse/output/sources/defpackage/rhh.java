package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class rhh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ cm6 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;

    public rhh(cm6 cm6Var, ViewTreeObserver viewTreeObserver, View view) {
        this.a = cm6Var;
        this.b = viewTreeObserver;
        this.c = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            shh.a(this, this.b, this.c);
        }
    }
}
