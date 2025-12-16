package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class zv9 implements xq9 {
    public final /* synthetic */ MessagesListWidget a;

    public zv9(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    @Override // defpackage.xq9
    public final void b() {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", null);
            }
        }
        MessagesListWidget messagesListWidget = this.a;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        EndlessRecyclerView2 endlessRecyclerView2H0 = messagesListWidget.H0();
        mgb.a(endlessRecyclerView2H0, new zn6(endlessRecyclerView2H0, 17, this.a));
        this.a.E0().K.g(this);
    }

    @Override // defpackage.xq9
    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
