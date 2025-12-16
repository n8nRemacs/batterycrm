package defpackage;

import android.widget.PopupWindow;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes.dex */
public final class fg9 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((gg9) this.b).c();
                break;
            default:
                ((PinBarsWidget) this.b).a = null;
                break;
        }
    }
}
