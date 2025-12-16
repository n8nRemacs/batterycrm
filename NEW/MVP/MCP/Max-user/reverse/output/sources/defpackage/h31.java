package defpackage;

import android.widget.PopupWindow;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class h31 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((cm6) this.b).invoke();
                break;
            case 1:
                ((ur1) this.b).H0 = null;
                break;
            default:
                ((ForwardPickerScreen) this.b).H0 = null;
                break;
        }
    }
}
