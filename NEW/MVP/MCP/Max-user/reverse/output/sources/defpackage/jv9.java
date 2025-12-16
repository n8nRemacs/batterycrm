package defpackage;

import java.io.IOException;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class jv9 implements xq9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ jv9(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.xq9
    public final void a() throws IOException {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                if (messagesListWidget.getView() != null) {
                    if (!messagesListWidget.F0().b()) {
                        wqi.q("ScrollEvent", "Can't process itemsChangedCallback because scroll is not meet requirements", new Object[0]);
                        break;
                    } else {
                        messagesListWidget.E0().K.g(this);
                        break;
                    }
                } else {
                    wqi.q("ScrollEvent", "Can't process itemsChangedCallback for scroll because root view is null", new Object[0]);
                    break;
                }
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                b19 b19Var = messagesListWidget2.O0;
                b19Var.e = -1;
                ev9 ev9Var = messagesListWidget2.Q0;
                EndlessRecyclerView2 endlessRecyclerView2H0 = messagesListWidget2.H0();
                if (!ev9Var.c) {
                    ev9Var.d = ev9.c(endlessRecyclerView2H0);
                    ev9Var.b(endlessRecyclerView2H0, 0, 0);
                }
                b19Var.b(messagesListWidget2.H0(), 0, 0);
                break;
        }
    }

    @Override // defpackage.xq9
    public final String getTag() {
        switch (this.a) {
            case 0:
                return "ScrollEvent";
            default:
                return "ReadMarkUpdater";
        }
    }
}
