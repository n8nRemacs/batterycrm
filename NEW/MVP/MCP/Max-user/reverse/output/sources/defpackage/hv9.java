package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class hv9 implements xq9 {
    public final /* synthetic */ MessagesListWidget a;
    public final /* synthetic */ o3e b;

    public hv9(MessagesListWidget messagesListWidget, o3e o3eVar) {
        this.a = messagesListWidget;
        this.b = o3eVar;
    }

    @Override // defpackage.xq9
    public final void b() {
        yy7[] yy7VarArr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.a;
        if (messagesListWidget.E0().x() != 0) {
            MessagesListWidget.z0(messagesListWidget, this.b);
            messagesListWidget.E0().K.g(this);
        }
    }

    @Override // defpackage.xq9
    public final String getTag() {
        return "ScrollButton";
    }
}
