package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes.dex */
public final class og6 implements wz7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ og6(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.wz7
    public final void k() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                sn0 sn0Var = ((ForwardPickerScreen) widget).A0;
                if (sn0Var.e()) {
                    ((ik9) sn0Var.getValue()).e(false);
                    break;
                }
                break;
            case 1:
                yy7[] yy7VarArr = MediaBarWidget.c1;
                ((MediaBarWidget) widget).I0().e(false);
                break;
            default:
                sn0 sn0Var2 = ((ShareDataPickerScreen) widget).y0;
                if (sn0Var2.e()) {
                    ((ik9) sn0Var2.getValue()).e(false);
                    break;
                }
                break;
        }
    }
}
