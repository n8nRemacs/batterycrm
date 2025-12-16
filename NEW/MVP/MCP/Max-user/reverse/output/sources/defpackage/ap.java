package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class ap implements PopupWindow.OnDismissListener {
    public final /* synthetic */ vo a;
    public final /* synthetic */ bp b;

    public ap(bp bpVar, vo voVar) {
        this.b = bpVar;
        this.a = voVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.Q0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
