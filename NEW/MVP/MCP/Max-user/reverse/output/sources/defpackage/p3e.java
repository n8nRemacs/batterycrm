package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class p3e extends ws7 {
    public final wu9 c;
    public final String d = p3e.class.getName();

    public p3e(wu9 wu9Var) {
        this.c = wu9Var;
    }

    public static final boolean d(p3e p3eVar, RecyclerView recyclerView, int i) {
        return x7j.f(recyclerView, i - 1) && x7j.f(recyclerView, x7j.b(recyclerView, 1.0f));
    }

    public static final void e(p3e p3eVar, phd phdVar) {
        int iJ = phdVar.j() - 1;
        String str = p3eVar.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.f(iJ, "scrollToBottomNotifier scroll to bottom position, pos:"), null);
            }
        }
        MessagesListWidget messagesListWidget = p3eVar.c.b;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        ay9 ay9VarE = messagesListWidget.K0().E();
        ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new tx9(ay9VarE, null)));
    }

    @Override // defpackage.ws7
    public final rhd c(RecyclerView recyclerView, phd phdVar) {
        return new xf5(this, recyclerView, phdVar);
    }
}
