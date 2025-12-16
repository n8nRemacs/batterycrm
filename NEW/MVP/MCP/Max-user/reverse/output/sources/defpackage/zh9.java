package defpackage;

import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class zh9 implements em6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sh9 b;
    public final /* synthetic */ bi9 c;

    public /* synthetic */ zh9(bi9 bi9Var, kv9 kv9Var) {
        this.c = bi9Var;
        this.b = kv9Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        uh7 uh7VarA;
        f9d f9dVar;
        int i = this.a;
        qqg qqgVar = qqg.a;
        bi9 bi9Var = this.c;
        sh9 sh9Var = this.b;
        switch (i) {
            case 0:
                bi9Var.K(sh9Var, (String) obj);
                break;
            default:
                x8d x8dVar = (x8d) obj;
                long j = bi9Var.J0;
                MessagesListWidget messagesListWidget = ((kv9) sh9Var).a;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                MessageModel messageModelE = ((hr9) messagesListWidget.K0().C1.getValue()).e(j);
                x8d x8dVar2 = null;
                pad padVar = messageModelE == null ? null : new pad(x8dVar, messageModelE.a, messageModelE.b, messageModelE.D0);
                if (padVar != null) {
                    messagesListWidget.G0().t().z(padVar);
                    xl9 xl9Var = padVar.d;
                    if (xl9Var != null && (f9dVar = xl9Var.c) != null) {
                        x8dVar2 = f9dVar.b;
                    }
                    if (!fni.a(x8dVar2, x8dVar) && (uh7VarA = gq9.a.a()) != null) {
                        uh7VarA.f(Collections.singleton(new th7(rh7.o, 1)), f1e.CHAT);
                        break;
                    }
                }
                break;
        }
        return qqgVar;
    }

    public /* synthetic */ zh9(kv9 kv9Var, bi9 bi9Var) {
        this.b = kv9Var;
        this.c = bi9Var;
    }
}
