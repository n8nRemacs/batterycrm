package defpackage;

import java.util.List;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class av9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;
    public final /* synthetic */ List c;

    public /* synthetic */ av9(MessagesListWidget messagesListWidget, List list, int i) {
        this.a = i;
        this.b = messagesListWidget;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                List list = this.c;
                String str = messagesListWidget.a;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, ho7.f(list.size(), "New messages submitted (rv null), size="), null);
                        break;
                    }
                }
                break;
            case 1:
                MessagesListWidget messagesListWidget2 = this.b;
                List list2 = this.c;
                messagesListWidget2.C0.F(list2, new av9(messagesListWidget2, list2, 4));
                break;
            case 2:
                MessagesListWidget messagesListWidget3 = this.b;
                List list3 = this.c;
                String str2 = messagesListWidget3.a;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.X;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str2, ho7.f(list3.size(), "WARNING! Can't set new messages, size="), null);
                        break;
                    }
                }
                break;
            case 3:
                MessagesListWidget messagesListWidget4 = this.b;
                List list4 = this.c;
                String str3 = messagesListWidget4.a;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null) {
                    lg8 lg8Var3 = lg8.d;
                    if (l6bVar3.b(lg8Var3)) {
                        l6bVar3.c(lg8Var3, str3, ho7.f(list4.size(), "New messages submitted (lifecycle scope), size="), null);
                        break;
                    }
                }
                break;
            default:
                MessagesListWidget messagesListWidget5 = this.b;
                List list5 = this.c;
                String str4 = messagesListWidget5.a;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null) {
                    lg8 lg8Var4 = lg8.d;
                    if (l6bVar4.b(lg8Var4)) {
                        l6bVar4.c(lg8Var4, str4, ho7.f(list5.size(), "New messages submitted, size="), null);
                    }
                }
                if (messagesListWidget5.getViewLifecycleOwner().p().d.compareTo(l38.d) >= 0) {
                    by9 by9VarF0 = messagesListWidget5.F0();
                    if (by9VarF0.g && by9VarF0.d.j() != 0) {
                        by9VarF0.g = false;
                        if (by9VarF0.c.f() != null) {
                            wqi.c(by9VarF0.f, "Scroll: do initial scroll", new Object[0]);
                            by9VarF0.b();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
