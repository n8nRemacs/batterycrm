package defpackage;

import one.me.android.root.RootController;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class c73 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsTabWidget b;

    public /* synthetic */ c73(ChatsTabWidget chatsTabWidget, int i) {
        this.a = i;
        this.b = chatsTabWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ChatsTabWidget chatsTabWidget = this.b;
        switch (i) {
            case 0:
                return new ox1(((mj1) chatsTabWidget.Y.getValue()).a, (esb) lx1.a.getAccessor().c(121), new s2i(chatsTabWidget, 1), new c73(chatsTabWidget, 2), chatsTabWidget.lifecycleOwner);
            case 1:
                int i2 = chatsTabWidget.B0;
                int i3 = chatsTabWidget.C0;
                t5c t5cVar = new t5c();
                t5cVar.setMaxRecycledViews(c03.a, i2 * i3);
                t5cVar.setMaxRecycledViews(c03.b, i3 * 5);
                double d = i2 * 1.5d;
                t5cVar.setMaxRecycledViews(i1b.u, kti.c(d));
                t5cVar.setMaxRecycledViews(i1b.v, kti.c(d));
                t5cVar.setMaxRecycledViews(s5b.c, 3);
                new f8a();
                return new qc6(chatsTabWidget, t5cVar, qc6.z0);
            default:
                yy7[] yy7VarArr = ChatsTabWidget.F0;
                c54 parentController = chatsTabWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                return Boolean.valueOf(ytdVarE0 != null && ytdVarE0.n());
        }
    }
}
